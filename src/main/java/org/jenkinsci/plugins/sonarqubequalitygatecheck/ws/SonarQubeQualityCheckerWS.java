package org.jenkinsci.plugins.sonarqubequalitygatecheck.ws;
import hudson.model.TaskListener;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.jenkinsci.plugins.sonarqubequalitygatecheck.SonarQubeQualityCheckBuilder.DescriptorImpl;
import org.jenkinsci.plugins.sonarqubequalitygatecheck.ws.exception.ResourceNotfoundException;
import org.jenkinsci.plugins.sonarqubequalitygatecheck.ws.exception.SonarQubeGCMetricNotDefined;
import org.sonar.wsclient.Host;
import org.sonar.wsclient.Sonar;
import org.sonar.wsclient.connectors.HttpClient4Connector;
import org.sonar.wsclient.connectors.HttpsClient4Connector;
import org.sonar.wsclient.services.Measure;
import org.sonar.wsclient.services.Resource;
import org.sonar.wsclient.services.ResourceQuery;


/**
 * 
 * <p>
 * 
 * @author Sambaiah Bethapudi
 */

public class SonarQubeQualityCheckerWS {
	
	    
    public static final String SONARQUBE_QUALITY_GATE_CHECK_STATUS="alert_status";
    public static final String SONARQUBE_QUALITY_GATE_DETAILS="quality_gate_details";
	
	private Sonar getSonar() {
		//String host = "https://insideview-code-analysis.allianceglobalservices.com/sonar";
		String host = "http://172.16.100.66:9090/sonar";
		String username = "svnjira";
		String password = "apple123$";
		// Sonar sonar = Sonar.create(host,username,password);

		Sonar sonar = new Sonar(new HttpClient4Connector(new Host(host,username,password)));

		return sonar;

	}

	private Sonar getSonar(String host, String username, String password) {

		Sonar sonar = null;
		if (host.startsWith("https")) {
			//System.out.println("HTTPS Connection..... ");
			sonar = new Sonar(new HttpsClient4Connector(new Host(host,
					username, password)));
		} else {

			//System.out.println("Http Connection.... ");
			sonar = new Sonar(new HttpClient4Connector(new Host(host, username,
					password)));
		}

		return sonar;

	}
	
	
	public boolean  checkQualityGatewayResult(String projectkey, DescriptorImpl descriptorImpl,boolean debugMode,TaskListener listener) throws Exception{
		
		String sonarQubeUserName=descriptorImpl.getSonarUserName();
		String sonarQubePassword=descriptorImpl.getSonarPassword();
		String sonarQubeUrl=descriptorImpl.getSonarQubeUrl().endsWith("/")? StringUtils.removeEnd(descriptorImpl.getSonarQubeUrl(), "/"):descriptorImpl.getSonarQubeUrl();
		
		//Sonar sonar= Sonar.create(sonarQubeUrl,sonarQubeUserName,sonarQubePassword);
		
		Sonar sonar= getSonar(sonarQubeUrl, sonarQubeUserName, sonarQubePassword);
		
		if(debugMode && listener!=null)
			{
			listener.getLogger().println("sonarQube url : "+descriptorImpl.getSonarQubeUrl());
	    	listener.getLogger().println("sonarQube UserName : "+descriptorImpl.getSonarUserName());
	    	listener.getLogger().println("sonarQube Password: xxxxxxxxxxxx");  
	    	listener.getLogger().println("sonarQube Project Key|Id: "+projectkey);  
			}
		
		ResourceQuery query = new ResourceQuery();
	    //query.setResourceId(1);
	    query.setIncludeTrends(true);
	    query.setResourceKeyOrId(projectkey);
	    query.setMetrics(SONARQUBE_QUALITY_GATE_CHECK_STATUS,SONARQUBE_QUALITY_GATE_DETAILS);	
	    
	    if(debugMode && listener!=null){
	    listener.getLogger().println("SonarQube resource Query :"+query.getUrl());
	    }
	    
	    Resource resource = sonar.find(query);
	    
	    if(resource==null){
	    	throw new ResourceNotfoundException();
	    }
	    
	    //listener.getLogger().println("SonarQube resource :"+resource);
	    
	    List<Measure> list= resource.getMeasures();
	    
	    if(list==null){	    	
		    
		    throw new SonarQubeGCMetricNotDefined();
		  }
	    
	    if(debugMode && listener!=null){
	    	 listener.getLogger().println("SonarQube metric list by Resource :"+list);
		 }
	     
	       for(Measure m:list){
	    	   
	    	   //System.out.println(m);
	    	   //System.out.println(m.getMetricKey()+"=="+SONARQUBE_QUALITY_CHECK_STATUS);
	    	       	   
	     	   if( m.getMetricKey().equalsIgnoreCase(SONARQUBE_QUALITY_GATE_CHECK_STATUS)) {   
	     		   if(m.getData().equalsIgnoreCase("OK")){
	     			  return true;
	     		   }else{
	     			 return false;  
	     		   }	     		    
	     	   }
	     	   
	     	   
	       }
		
		return false;
		
		
	}
	
public boolean  checkQualityGatewayResult(String projectkey) throws Exception{
		
		
			Sonar sonar=getSonar();
		
		
		
		ResourceQuery query = new ResourceQuery();
	    //query.setResourceId(1);
	    query.setIncludeTrends(true);
	    query.setResourceKeyOrId(projectkey);
	    query.setMetrics(SONARQUBE_QUALITY_GATE_CHECK_STATUS,SONARQUBE_QUALITY_GATE_DETAILS);	
	    
	 
	    
	    Resource resource = sonar.find(query);
	    
	    if(resource==null){
	    	throw new ResourceNotfoundException();
	    }
	    
	    //listener.getLogger().println("SonarQube resource :"+resource);
	    
	    List<Measure> list= resource.getMeasures();
	    
	    if(list==null){	    	
		    
		    throw new SonarQubeGCMetricNotDefined();
		  }
	    
	   
	     
	       for(Measure m:list){
	    	   
	    	   //System.out.println(m);
	    	   //System.out.println(m.getMetricKey()+"=="+SONARQUBE_QUALITY_CHECK_STATUS);
	    	       	   
	     	   if( m.getMetricKey().equalsIgnoreCase(SONARQUBE_QUALITY_GATE_CHECK_STATUS)) {   
	     		   if(m.getData().equalsIgnoreCase("OK")){
	     			  return true;
	     		   }else{
	     			 return false;  
	     		   }	     		    
	     	   }
	     	   
	     	   
	       }
		
		return false;
		
		
	}
	public static void main(String[] args) throws Exception {
		
		SonarQubeQualityCheckerWS s=new SonarQubeQualityCheckerWS();
		//DescriptorImpl descriptorImpl=new DescriptorImpl();
		
	 System.out.println(" quality check result: "+s.checkQualityGatewayResult("SpreeDigitalBurst"));
	}

}
