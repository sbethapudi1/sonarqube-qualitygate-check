package org.jenkinsci.plugins.sonarqubequalitygatecheck;
import hudson.Launcher;
import hudson.Extension;
import hudson.FilePath;
import hudson.util.FormValidation;
import hudson.model.AbstractProject;
import hudson.model.Messages;
import hudson.model.Result;
import hudson.model.Run;
import hudson.model.TaskListener;
import hudson.tasks.Builder;
import hudson.tasks.BuildStepDescriptor;
import jenkins.tasks.SimpleBuildStep;
import net.sf.json.JSONObject;

import org.jenkinsci.plugins.sonarqubequalitygatecheck.ws.SonarQubeQualityCheckerWS;
import org.jenkinsci.plugins.sonarqubequalitygatecheck.ws.exception.ResourceNotfoundException;
import org.jenkinsci.plugins.sonarqubequalitygatecheck.ws.exception.SonarQubeGCMetricNotDefined;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.StaplerRequest;
import org.kohsuke.stapler.QueryParameter;
import org.sonar.wsclient.connectors.ConnectionException;

import javax.servlet.ServletException;

import java.io.IOException;

/**
 * Sample {@link Builder}.
 *
 * <p>
 * When the user configures the project and enables this builder,
 * {@link DescriptorImpl#newInstance(StaplerRequest)} is invoked
 * and a new {@link SonarQubeQualityCheckBuilder} is created. The created
 * instance is persisted to the project configuration XML by using
 * XStream, so this allows you to use instance fields (like {@link #name})
 * to remember the configuration.
 *
 * <p>
 * When a build is performed, the {@link #perform} method will be invoked. 
 *
 * @author Sambaiah Bethapudi
 */
public class SonarQubeQualityCheckBuilder extends Builder implements SimpleBuildStep {

    private final String sonarProjectName;
    private boolean debugMode;
    

    // Fields in config.jelly must match the parameter names in the "DataBoundConstructor"
    @DataBoundConstructor
    public SonarQubeQualityCheckBuilder(String sonarProjectName,boolean debugMode) {
        this.sonarProjectName = sonarProjectName;
        this.debugMode=debugMode;
    }

    /**
     * We'll use this from the <tt>config.jelly</tt>.
     */
    public String getSonarProjectName() {
        return sonarProjectName;
    }
    

	public boolean isDebugMode() {
		return debugMode;
	}

	

    @Override
    public void perform(Run<?,?> build, FilePath workspace, Launcher launcher, TaskListener listener) {
        // This is where you 'build' the project.
        // Since this is a dummy, we just say 'hello world' and call that a build.

        // This also shows how you can consult the global configuration of the builder    	
    	/*listener.getLogger().println("Perform .............."+ build+",sonarProjectName :"+this.sonarProjectName);
    	listener.getLogger().println("Build number: "+ build.number+", Build Name:  "+build.getDisplayName());
    	*/
    	
         
         try {
        	 
        	 SonarQubeQualityCheckerWS s=new SonarQubeQualityCheckerWS();
        	
        	
			if (s.checkQualityGatewayResult(this.sonarProjectName,
					getDescriptor(), debugMode ,listener)) {

				listener.getLogger()
						.println(
								"SonarQube Code Quality Gate has got passed.So changing the build result to \" Sonar QG Success.\" ");
				/*listener.getLogger().println(
						Result.SONAR_QG_SUCCESS.color.getDescription());*/
				build.setResult(Result.SONAR_QG_SUCCESS);
			} else {
				
				listener.getLogger()
						.println(
								"SonarQube Code Quality Gate has got Failed.So changing the build result to \" Sonar QG Failure.\" ");
				// listener.getLogger().println(Result.SONAR_QG_FAILURE.color.getDescription());
				build.setResult(Result.SONAR_QG_FAILURE);
								
			}
 			
         } 
         catch(ConnectionException ce){        	 
        	listener.getLogger().println("ERROR: Unable to connect to SonarQube Server.Please check with SonarQube Administror!");
        	build.setResult(Result.FAILURE);
         }
         catch(ResourceNotfoundException re){
        	listener.getLogger().println("ERROR: Wrong project key or Id.Please provide valid Key or Id.");
 			build.setResult(Result.FAILURE);
		}
         
        catch(SonarQubeGCMetricNotDefined gcn){
        	listener.getLogger().println("ERROR: Code QualityGateway note defined in SonarQube System.Please check with Sonar Administrator!");
        	build.setResult(Result.FAILURE);
        }

		catch (Exception e) {
			listener.getLogger().println(e);
			build.setResult(Result.FAILURE);
		}
    	
        
    }

    // Overridden for better type safety.
    // If your plugin doesn't really define any property on Descriptor,
    // you don't have to do this.
    @Override
    public DescriptorImpl getDescriptor() {
        return (DescriptorImpl)super.getDescriptor();
    }

    /**
     * Descriptor for {@link SonarQubeQualityCheckBuilder}. Used as a singleton.
     * The class is marked as public so that it can be accessed from views.
     *
     * <p>
     * See <tt>src/main/resources/hudson/plugins/hello_world/HelloWorldBuilder/*.jelly</tt>
     * for the actual HTML fragment for the configuration screen.
     */
    @Extension // This indicates to Jenkins that this is an implementation of an extension point.
    public static final class DescriptorImpl extends BuildStepDescriptor<Builder> {
        /**
         * To persist global configuration information,
         * simply store it in a field and call save().
         *
         * <p>
         * If you don't want fields to be persisted, use <tt>transient</tt>.
         */
       
        private String sonarQubeUrl;
        private String sonarUserName;
        private String sonarPassword;
        
        

        /**
         * In order to load the persisted global configuration, you have to 
         * call load() in the constructor.
         */
        public DescriptorImpl() {
            load();
        }

        /**
         * Performs on-the-fly validation of the form field 'name'.
         *
         * @param value
         *      This parameter receives the value that the user has typed.
         * @return
         *      Indicates the outcome of the validation. This is sent to the browser.
         *      <p>
         *      Note that returning {@link FormValidation#error(String)} does not
         *      prevent the form from being saved. It just means that a message
         *      will be displayed to the user. 
         */
        public FormValidation doCheckName(@QueryParameter String value)
                throws IOException, ServletException {
            if (value.length() == 0)
                return FormValidation.error("Please set a name");
            if (value.length() < 4)
                return FormValidation.warning("Isn't the name too short?");
            return FormValidation.ok();
        }

        public boolean isApplicable(Class<? extends AbstractProject> aClass) {
            // Indicates that this builder can be used with all kinds of project types 
            return true;
        }

        /**
         * This human readable name is used in the configuration screen.
         */
        public String getDisplayName() {
            return "SonarQube Quality Gate Check ";
        }
        
         

        public String getSonarQubeUrl() {
			return sonarQubeUrl;
		}

		public void setSonarQubeUrl(String sonarQubeUrl) {
			this.sonarQubeUrl = sonarQubeUrl;
		}

		public String getSonarUserName() {
			return sonarUserName;
		}

		public void setSonarUsername(String sonarUsername) {
			this.sonarUserName = sonarUsername;
		}

		public String getSonarPassword() {
			return sonarPassword;
		}

		public void setSonarPassword(String sonarPassword) {
			this.sonarPassword = sonarPassword;
		}
		
		

		@Override
        public boolean configure(StaplerRequest req, JSONObject formData) throws FormException {
            // To persist global configuration information,
            // set that to properties and call save().
           // useFrench = formData.getBoolean("useFrench");
            // ^Can also use req.bindJSON(this, formData);
            //  (easier when there are many fields; need set* methods for this, like setUseFrench)
            sonarQubeUrl = formData.getString("sonarQubeUrl");
            sonarUserName = formData.getString("sonarUserName");
            sonarPassword = formData.getString("sonarPassword");
            save();
            return super.configure(req,formData);
        }

        
    }
}

