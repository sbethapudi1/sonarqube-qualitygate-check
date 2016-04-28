// CHECKSTYLE:OFF

package hudson.model;

import org.jvnet.localizer.Localizable;
import org.jvnet.localizer.ResourceBundleHolder;

@SuppressWarnings({
    "",
    "PMD"
})
public class Messages {

    private final static ResourceBundleHolder holder = ResourceBundleHolder.get(Messages.class);

    /**
     * This permission allows users to see views (implied by generic read access).
     * 
     */
    public static String View_ReadPermission_Description() {
        return holder.format("View.ReadPermission.Description");
    }

    /**
     * This permission allows users to see views (implied by generic read access).
     * 
     */
    public static Localizable _View_ReadPermission_Description() {
        return new Localizable(holder, "View.ReadPermission.Description");
    }

    /**
     * Building remotely on {0}
     * 
     */
    public static String AbstractBuild_BuildingRemotely(Object arg1) {
        return holder.format("AbstractBuild.BuildingRemotely", arg1);
    }

    /**
     * Building remotely on {0}
     * 
     */
    public static Localizable _AbstractBuild_BuildingRemotely(Object arg1) {
        return new Localizable(holder, "AbstractBuild.BuildingRemotely", arg1);
    }

    /**
     * Deletes a node.
     * 
     */
    public static String CLI_delete_node_shortDescription() {
        return holder.format("CLI.delete-node.shortDescription");
    }

    /**
     * Deletes a node.
     * 
     */
    public static Localizable _CLI_delete_node_shortDescription() {
        return new Localizable(holder, "CLI.delete-node.shortDescription");
    }

    /**
     * List View
     * 
     */
    public static String ListView_DisplayName() {
        return holder.format("ListView.DisplayName");
    }

    /**
     * List View
     * 
     */
    public static Localizable _ListView_DisplayName() {
        return new Localizable(holder, "ListView.DisplayName");
    }

    /**
     * Provisioned from {0}
     * 
     */
    public static String Label_ProvisionedFrom(Object arg1) {
        return holder.format("Label.ProvisionedFrom", arg1);
    }

    /**
     * Provisioned from {0}
     * 
     */
    public static Localizable _Label_ProvisionedFrom(Object arg1) {
        return new Localizable(holder, "Label.ProvisionedFrom", arg1);
    }

    /**
     * invalid label
     * 
     */
    public static String Label_InvalidLabel() {
        return holder.format("Label.InvalidLabel");
    }

    /**
     * invalid label
     * 
     */
    public static Localizable _Label_InvalidLabel() {
        return new Localizable(holder, "Label.InvalidLabel");
    }

    /**
     * Cluster Management and Distributed Build
     * 
     */
    public static String UpdateCenter_PluginCategory_cluster() {
        return holder.format("UpdateCenter.PluginCategory.cluster");
    }

    /**
     * Cluster Management and Distributed Build
     * 
     */
    public static Localizable _UpdateCenter_PluginCategory_cluster() {
        return new Localizable(holder, "UpdateCenter.PluginCategory.cluster");
    }

    /**
     * No such slave "{0}" exists. Did you mean "{1}"?
     * 
     */
    public static String Computer_NoSuchSlaveExists(Object arg1, Object arg2) {
        return holder.format("Computer.NoSuchSlaveExists", arg1, arg2);
    }

    /**
     * No such slave "{0}" exists. Did you mean "{1}"?
     * 
     */
    public static Localizable _Computer_NoSuchSlaveExists(Object arg1, Object arg2) {
        return new Localizable(holder, "Computer.NoSuchSlaveExists", arg1, arg2);
    }

    /**
     * Last failed build
     * 
     */
    public static String Permalink_LastFailedBuild() {
        return holder.format("Permalink.LastFailedBuild");
    }

    /**
     * Last failed build
     * 
     */
    public static Localizable _Permalink_LastFailedBuild() {
        return new Localizable(holder, "Permalink.LastFailedBuild");
    }

    /**
     * Last successful build
     * 
     */
    public static String Permalink_LastSuccessfulBuild() {
        return holder.format("Permalink.LastSuccessfulBuild");
    }

    /**
     * Last successful build
     * 
     */
    public static Localizable _Permalink_LastSuccessfulBuild() {
        return new Localizable(holder, "Permalink.LastSuccessfulBuild");
    }

    /**
     * This permission allows users to change the configuration of views.
     * 
     */
    public static String View_ConfigurePermission_Description() {
        return holder.format("View.ConfigurePermission.Description");
    }

    /**
     * This permission allows users to change the configuration of views.
     * 
     */
    public static Localizable _View_ConfigurePermission_Description() {
        return new Localizable(holder, "View.ConfigurePermission.Description");
    }

    /**
     * {0} and counting
     * 
     */
    public static String Run_InProgressDuration(Object arg1) {
        return holder.format("Run.InProgressDuration", arg1);
    }

    /**
     * {0} and counting
     * 
     */
    public static Localizable _Run_InProgressDuration(Object arg1) {
        return new Localizable(holder, "Run.InProgressDuration", arg1);
    }

    /**
     * Aborted
     * 
     */
    public static String BallColor_Aborted() {
        return holder.format("BallColor.Aborted");
    }

    /**
     * Aborted
     * 
     */
    public static Localizable _BallColor_Aborted() {
        return new Localizable(holder, "BallColor.Aborted");
    }

    /**
     * Overall
     * 
     */
    public static String Hudson_Permissions_Title() {
        return holder.format("Hudson.Permissions.Title");
    }

    /**
     * Overall
     * 
     */
    public static Localizable _Hudson_Permissions_Title() {
        return new Localizable(holder, "Hudson.Permissions.Title");
    }

    /**
     * Aborted
     * 
     */
    public static String ResultTrend_Aborted() {
        return holder.format("ResultTrend.Aborted");
    }

    /**
     * Aborted
     * 
     */
    public static Localizable _ResultTrend_Aborted() {
        return new Localizable(holder, "ResultTrend.Aborted");
    }

    /**
     * unstable
     * 
     */
    public static String Run_Summary_Unstable() {
        return holder.format("Run.Summary.Unstable");
    }

    /**
     * unstable
     * 
     */
    public static Localizable _Run_Summary_Unstable() {
        return new Localizable(holder, "Run.Summary.Unstable");
    }

    /**
     * You must use the Save button if you wish to rename a job.
     * 
     */
    public static String Job_you_must_use_the_save_button_if_you_wish() {
        return holder.format("Job.you_must_use_the_save_button_if_you_wish");
    }

    /**
     * You must use the Save button if you wish to rename a job.
     * 
     */
    public static Localizable _Job_you_must_use_the_save_button_if_you_wish() {
        return new Localizable(holder, "Job.you_must_use_the_save_button_if_you_wish");
    }

    /**
     * Uncategorized
     * 
     */
    public static String UpdateCenter_PluginCategory_must_be_labeled() {
        return holder.format("UpdateCenter.PluginCategory.must-be-labeled");
    }

    /**
     * Uncategorized
     * 
     */
    public static Localizable _UpdateCenter_PluginCategory_must_be_labeled() {
        return new Localizable(holder, "UpdateCenter.PluginCategory.must-be-labeled");
    }

    /**
     * Last unsuccessful build
     * 
     */
    public static String Permalink_LastUnsuccessfulBuild() {
        return holder.format("Permalink.LastUnsuccessfulBuild");
    }

    /**
     * Last unsuccessful build
     * 
     */
    public static Localizable _Permalink_LastUnsuccessfulBuild() {
        return new Localizable(holder, "Permalink.LastUnsuccessfulBuild");
    }

    /**
     * The read permission is necessary for viewing almost all pages of Jenkins. This permission is useful when you don’t want unauthenticated users to see Jenkins pages: revoke this permission from the anonymous user, then add "authenticated" pseudo-user and grant the read access.
     * 
     */
    public static String Hudson_ReadPermission_Description() {
        return holder.format("Hudson.ReadPermission.Description");
    }

    /**
     * The read permission is necessary for viewing almost all pages of Jenkins. This permission is useful when you don’t want unauthenticated users to see Jenkins pages: revoke this permission from the anonymous user, then add "authenticated" pseudo-user and grant the read access.
     * 
     */
    public static Localizable _Hudson_ReadPermission_Description() {
        return new Localizable(holder, "Hudson.ReadPermission.Description");
    }

    /**
     * Build with Parameters
     * 
     */
    public static String AbstractProject_build_with_parameters() {
        return holder.format("AbstractProject.build_with_parameters");
    }

    /**
     * Build with Parameters
     * 
     */
    public static Localizable _AbstractProject_build_with_parameters() {
        return new Localizable(holder, "AbstractProject.build_with_parameters");
    }

    /**
     * Workspace is offline.
     * 
     */
    public static String AbstractProject_WorkspaceOffline() {
        return holder.format("AbstractProject.WorkspaceOffline");
    }

    /**
     * Workspace is offline.
     * 
     */
    public static Localizable _AbstractProject_WorkspaceOffline() {
        return new Localizable(holder, "AbstractProject.WorkspaceOffline");
    }

    /**
     * Clears the build queue.
     * 
     */
    public static String CLI_clear_queue_shortDescription() {
        return holder.format("CLI.clear-queue.shortDescription");
    }

    /**
     * Clears the build queue.
     * 
     */
    public static Localizable _CLI_clear_queue_shortDescription() {
        return new Localizable(holder, "CLI.clear-queue.shortDescription");
    }

    /**
     * This permission allows users to configure slaves.
     * 
     */
    public static String Computer_ConfigurePermission_Description() {
        return holder.format("Computer.ConfigurePermission.Description");
    }

    /**
     * This permission allows users to configure slaves.
     * 
     */
    public static Localizable _Computer_ConfigurePermission_Description() {
        return new Localizable(holder, "Computer.ConfigurePermission.Description");
    }

    /**
     * Required for running scripts inside the Jenkins process, for example via the Groovy console or Groovy CLI command.
     * 
     */
    public static String Hudson_RunScriptsPermission_Description() {
        return holder.format("Hudson.RunScriptsPermission.Description");
    }

    /**
     * Required for running scripts inside the Jenkins process, for example via the Groovy console or Groovy CLI command.
     * 
     */
    public static Localizable _Hudson_RunScriptsPermission_Description() {
        return new Localizable(holder, "Hudson.RunScriptsPermission.Description");
    }

    /**
     *  Sonar QG Success
     * 
     */
    public static String BallColor_Sonar_QG_Success() {
        return holder.format("BallColor.Sonar.QG.Success");
    }

    /**
     * Sonar QG Success
     * 
     */
    public static Localizable _BallColor_Sonar_QG_Success() {
        return new Localizable(holder, "BallColor.Sonar.QG.Success");
    }
    
    /**
     * Success
     * 
     */
    public static String BallColor_Success() {
        return holder.format("BallColor.Success");
    }

    /**
     * Success
     * 
     */
    public static Localizable _BallColor_Success() {
        return new Localizable(holder, "BallColor.Success");
    }

    /**
     * stable
     * 
     */
    public static String Run_Summary_Stable() {
        return holder.format("Run.Summary.Stable");
    }

    /**
     * stable
     * 
     */
    public static Localizable _Run_Summary_Stable() {
        return new Localizable(holder, "Run.Summary.Stable");
    }

    /**
     * Unable to delete {0}: {1}
     * 
     */
    public static String Run_UnableToDelete(Object arg1, Object arg2) {
        return holder.format("Run.UnableToDelete", arg1, arg2);
    }

    /**
     * Unable to delete {0}: {1}
     * 
     */
    public static Localizable _Run_UnableToDelete(Object arg1, Object arg2) {
        return new Localizable(holder, "Run.UnableToDelete", arg1, arg2);
    }

    /**
     * {0} is offline
     * 
     */
    public static String Queue_NodeOffline(Object arg1) {
        return holder.format("Queue.NodeOffline", arg1);
    }

    /**
     * {0} is offline
     * 
     */
    public static Localizable _Queue_NodeOffline(Object arg1) {
        return new Localizable(holder, "Queue.NodeOffline", arg1);
    }

    /**
     * No workspace is available, so can’t check for updates.
     * 
     */
    public static String AbstractProject_NoWorkspace() {
        return holder.format("AbstractProject.NoWorkspace");
    }

    /**
     * No workspace is available, so can’t check for updates.
     * 
     */
    public static Localizable _AbstractProject_NoWorkspace() {
        return new Localizable(holder, "AbstractProject.NoWorkspace");
    }

    /**
     * User Interface
     * 
     */
    public static String UpdateCenter_PluginCategory_ui() {
        return holder.format("UpdateCenter.PluginCategory.ui");
    }

    /**
     * User Interface
     * 
     */
    public static Localizable _UpdateCenter_PluginCategory_ui() {
        return new Localizable(holder, "UpdateCenter.PluginCategory.ui");
    }

    /**
     * Source Code Management related
     * 
     */
    public static String UpdateCenter_PluginCategory_scm_related() {
        return holder.format("UpdateCenter.PluginCategory.scm-related");
    }

    /**
     * Source Code Management related
     * 
     */
    public static Localizable _UpdateCenter_PluginCategory_scm_related() {
        return new Localizable(holder, "UpdateCenter.PluginCategory.scm-related");
    }

    /**
     * Are you sure you want to use network mounted file system for FS root? Note that this directory does not need to be visible to the master.
     * 
     */
    public static String Slave_Network_Mounted_File_System_Warning() {
        return holder.format("Slave.Network.Mounted.File.System.Warning");
    }

    /**
     * Are you sure you want to use network mounted file system for FS root? Note that this directory does not need to be visible to the master.
     * 
     */
    public static Localizable _Slave_Network_Mounted_File_System_Warning() {
        return new Localizable(holder, "Slave.Network.Mounted.File.System.Warning");
    }

    /**
     * This permission allows users to delete existing views.
     * 
     */
    public static String View_DeletePermission_Description() {
        return holder.format("View.DeletePermission.Description");
    }

    /**
     * This permission allows users to delete existing views.
     * 
     */
    public static Localizable _View_DeletePermission_Description() {
        return new Localizable(holder, "View.DeletePermission.Description");
    }

    /**
     * Requires Choices.
     * 
     */
    public static String ChoiceParameterDefinition_MissingChoices() {
        return holder.format("ChoiceParameterDefinition.MissingChoices");
    }

    /**
     * Requires Choices.
     * 
     */
    public static Localizable _ChoiceParameterDefinition_MissingChoices() {
        return new Localizable(holder, "ChoiceParameterDefinition.MissingChoices");
    }

    /**
     * {0} doesn’t have a permission to run on {1}
     * 
     */
    public static String Node_LackingBuildPermission(Object arg1, Object arg2) {
        return holder.format("Node.LackingBuildPermission", arg1, arg2);
    }

    /**
     * {0} doesn’t have a permission to run on {1}
     * 
     */
    public static Localizable _Node_LackingBuildPermission(Object arg1, Object arg2) {
        return new Localizable(holder, "Node.LackingBuildPermission", arg1, arg2);
    }

    /**
     * Choice Parameter
     * 
     */
    public static String ChoiceParameterDefinition_DisplayName() {
        return holder.format("ChoiceParameterDefinition.DisplayName");
    }

    /**
     * Choice Parameter
     * 
     */
    public static Localizable _ChoiceParameterDefinition_DisplayName() {
        return new Localizable(holder, "ChoiceParameterDefinition.DisplayName");
    }

    /**
     * Slave Launchers and Controllers
     * 
     */
    public static String UpdateCenter_PluginCategory_slaves() {
        return holder.format("UpdateCenter.PluginCategory.slaves");
    }

    /**
     * Slave Launchers and Controllers
     * 
     */
    public static Localizable _UpdateCenter_PluginCategory_slaves() {
        return new Localizable(holder, "UpdateCenter.PluginCategory.slaves");
    }

    /**
     * Parameters
     * 
     */
    public static String ParameterAction_DisplayName() {
        return holder.format("ParameterAction.DisplayName");
    }

    /**
     * Parameters
     * 
     */
    public static Localizable _ParameterAction_DisplayName() {
        return new Localizable(holder, "ParameterAction.DisplayName");
    }

    /**
     * Artifacts of {0} {1}
     * 
     */
    public static String Run_ArtifactsBrowserTitle(Object arg1, Object arg2) {
        return holder.format("Run.ArtifactsBrowserTitle", arg1, arg2);
    }

    /**
     * Artifacts of {0} {1}
     * 
     */
    public static Localizable _Run_ArtifactsBrowserTitle(Object arg1, Object arg2) {
        return new Localizable(holder, "Run.ArtifactsBrowserTitle", arg1, arg2);
    }

    /**
     * The display name, "{0}", is already in use by another job and could cause confusion and delay.
     * 
     */
    public static String Jenkins_CheckDisplayName_DisplayNameNotUniqueWarning(Object arg1) {
        return holder.format("Jenkins.CheckDisplayName.DisplayNameNotUniqueWarning", arg1);
    }

    /**
     * The display name, "{0}", is already in use by another job and could cause confusion and delay.
     * 
     */
    public static Localizable _Jenkins_CheckDisplayName_DisplayNameNotUniqueWarning(Object arg1) {
        return new Localizable(holder, "Jenkins.CheckDisplayName.DisplayNameNotUniqueWarning", arg1);
    }

    /**
     * the master Jenkins node
     * 
     */
    public static String Hudson_NodeDescription() {
        return holder.format("Hudson.NodeDescription");
    }

    /**
     * the master Jenkins node
     * 
     */
    public static Localizable _Hudson_NodeDescription() {
        return new Localizable(holder, "Hudson.NodeDescription");
    }

    /**
     * Success
     * 
     */
    public static String ResultTrend_Success() {
        return holder.format("ResultTrend.Success");
    }

    /**
     * Success
     * 
     */
    public static Localizable _ResultTrend_Success() {
        return new Localizable(holder, "ResultTrend.Success");
    }
    
    /**
     *  Sonar QG Success
     * 
     */
    public static String ResultTrend_Sonar_QG_Success() {
        return holder.format("ResultTrend.Sonar.QG.Success");
    }

    /**
     * Sonar QG Success
     * 
     */
    public static Localizable _ResultTrend_Sonar_QG_Success() {
        return new Localizable(holder, "ResultTrend.Sonar.QG.Success");
    }

    /**
     * There's no slave/cloud that matches this assignment
     * 
     */
    public static String AbstractProject_AssignedLabelString_NoMatch() {
        return holder.format("AbstractProject.AssignedLabelString.NoMatch");
    }

    /**
     * There's no slave/cloud that matches this assignment
     * 
     */
    public static Localizable _AbstractProject_AssignedLabelString_NoMatch() {
        return new Localizable(holder, "AbstractProject.AssignedLabelString.NoMatch");
    }

    /**
     * Jenkins is about to shut down
     * 
     */
    public static String Queue_HudsonIsAboutToShutDown() {
        return holder.format("Queue.HudsonIsAboutToShutDown");
    }

    /**
     * Jenkins is about to shut down
     * 
     */
    public static Localizable _Queue_HudsonIsAboutToShutDown() {
        return new Localizable(holder, "Queue.HudsonIsAboutToShutDown");
    }

    /**
     * Build Wrappers
     * 
     */
    public static String UpdateCenter_PluginCategory_buildwrapper() {
        return holder.format("UpdateCenter.PluginCategory.buildwrapper");
    }

    /**
     * Build Wrappers
     * 
     */
    public static Localizable _UpdateCenter_PluginCategory_buildwrapper() {
        return new Localizable(holder, "UpdateCenter.PluginCategory.buildwrapper");
    }

    /**
     * No view type is specified
     * 
     */
    public static String View_MissingMode() {
        return holder.format("View.MissingMode");
    }

    /**
     * No view type is specified
     * 
     */
    public static Localizable _View_MissingMode() {
        return new Localizable(holder, "View.MissingMode");
    }

    /**
     * XPath "{0}" matched {1} nodes. Create XPath that only matches one, or use the "wrapper" query parameter to wrap them all under a root element.
     * 
     */
    public static String Api_MultipleMatch(Object arg1, Object arg2) {
        return holder.format("Api.MultipleMatch", arg1, arg2);
    }

    /**
     * XPath "{0}" matched {1} nodes. Create XPath that only matches one, or use the "wrapper" query parameter to wrap them all under a root element.
     * 
     */
    public static Localizable _Api_MultipleMatch(Object arg1, Object arg2) {
        return new Localizable(holder, "Api.MultipleMatch", arg1, arg2);
    }

    /**
     * Build stability: {0}
     * 
     */
    public static String Job_BuildStability(Object arg1) {
        return holder.format("Job.BuildStability", arg1);
    }

    /**
     * Build stability: {0}
     * 
     */
    public static Localizable _Job_BuildStability(Object arg1) {
        return new Localizable(holder, "Job.BuildStability", arg1);
    }

    /**
     * Enables a job.
     * 
     */
    public static String CLI_enable_job_shortDescription() {
        return holder.format("CLI.enable-job.shortDescription");
    }

    /**
     * Enables a job.
     * 
     */
    public static Localizable _CLI_enable_job_shortDescription() {
        return new Localizable(holder, "CLI.enable-job.shortDescription");
    }

    /**
     * SCM polling aborted
     * 
     */
    public static String AbstractProject_PollingABorted() {
        return holder.format("AbstractProject.PollingABorted");
    }

    /**
     * SCM polling aborted
     * 
     */
    public static Localizable _AbstractProject_PollingABorted() {
        return new Localizable(holder, "AbstractProject.PollingABorted");
    }

    /**
     * A job already exists with the name ‘{0}’
     * 
     */
    public static String Hudson_JobAlreadyExists(Object arg1) {
        return holder.format("Hudson.JobAlreadyExists", arg1);
    }

    /**
     * A job already exists with the name ‘{0}’
     * 
     */
    public static Localizable _Hudson_JobAlreadyExists(Object arg1) {
        return new Localizable(holder, "Hudson.JobAlreadyExists", arg1);
    }

    /**
     * Jenkins
     * 
     */
    public static String Hudson_DisplayName() {
        return holder.format("Hudson.DisplayName");
    }

    /**
     * Jenkins
     * 
     */
    public static Localizable _Hudson_DisplayName() {
        return new Localizable(holder, "Hudson.DisplayName");
    }

    /**
     * There are no nodes with the label ‘{0}’
     * 
     */
    public static String Queue_LabelHasNoNodes(Object arg1) {
        return holder.format("Queue.LabelHasNoNodes", arg1);
    }

    /**
     * There are no nodes with the label ‘{0}’
     * 
     */
    public static Localizable _Queue_LabelHasNoNodes(Object arg1) {
        return new Localizable(holder, "Queue.LabelHasNoNodes", arg1);
    }

    /**
     * No recent builds failed.
     * 
     */
    public static String Job_NoRecentBuildFailed() {
        return holder.format("Job.NoRecentBuildFailed");
    }

    /**
     * No recent builds failed.
     * 
     */
    public static Localizable _Job_NoRecentBuildFailed() {
        return new Localizable(holder, "Job.NoRecentBuildFailed");
    }

    /**
     * Include a global view
     * 
     */
    public static String ProxyView_DisplayName() {
        return holder.format("ProxyView.DisplayName");
    }

    /**
     * Include a global view
     * 
     */
    public static Localizable _ProxyView_DisplayName() {
        return new Localizable(holder, "ProxyView.DisplayName");
    }

    /**
     * {0} doesn’t look like a JDK directory
     * 
     */
    public static String Hudson_NotJDKDir(Object arg1) {
        return holder.format("Hudson.NotJDKDir", arg1);
    }

    /**
     * {0} doesn’t look like a JDK directory
     * 
     */
    public static Localizable _Hudson_NotJDKDir(Object arg1) {
        return new Localizable(holder, "Hudson.NotJDKDir", arg1);
    }

    /**
     * master
     * 
     */
    public static String Hudson_Computer_DisplayName() {
        return holder.format("Hudson.Computer.DisplayName");
    }

    /**
     * master
     * 
     */
    public static Localizable _Hudson_Computer_DisplayName() {
        return new Localizable(holder, "Hudson.Computer.DisplayName");
    }

    /**
     * Invalid slave configuration for {0}. No remote directory given
     * 
     */
    public static String Slave_InvalidConfig_NoRemoteDir(Object arg1) {
        return holder.format("Slave.InvalidConfig.NoRemoteDir", arg1);
    }

    /**
     * Invalid slave configuration for {0}. No remote directory given
     * 
     */
    public static Localizable _Slave_InvalidConfig_NoRemoteDir(Object arg1) {
        return new Localizable(holder, "Slave.InvalidConfig.NoRemoteDir", arg1);
    }

    /**
     * Blocked by {0}
     * 
     */
    public static String Queue_BlockedBy(Object arg1) {
        return holder.format("Queue.BlockedBy", arg1);
    }

    /**
     * Blocked by {0}
     * 
     */
    public static Localizable _Queue_BlockedBy(Object arg1) {
        return new Localizable(holder, "Queue.BlockedBy", arg1);
    }

    /**
     * Slaves in &lt;a href="{0}{1}">label&lt;/a>: {2}
     * 
     */
    public static String AbstractProject_LabelLink(Object arg1, Object arg2, Object arg3) {
        return holder.format("AbstractProject.LabelLink", arg1, arg2, arg3);
    }

    /**
     * Slaves in &lt;a href="{0}{1}">label&lt;/a>: {2}
     * 
     */
    public static Localizable _AbstractProject_LabelLink(Object arg1, Object arg2, Object arg3) {
        return new Localizable(holder, "AbstractProject.LabelLink", arg1, arg2, arg3);
    }

    /**
     * This is a Unix slave
     * 
     */
    public static String Slave_UnixSlave() {
        return holder.format("Slave.UnixSlave");
    }

    /**
     * This is a Unix slave
     * 
     */
    public static Localizable _Slave_UnixSlave() {
        return new Localizable(holder, "Slave.UnixSlave");
    }

    /**
     * Invalid slave configuration for {0}. Invalid # of executors.
     * 
     */
    public static String Slave_InvalidConfig_Executors(Object arg1) {
        return holder.format("Slave.InvalidConfig.Executors", arg1);
    }

    /**
     * Invalid slave configuration for {0}. Invalid # of executors.
     * 
     */
    public static Localizable _Slave_InvalidConfig_Executors(Object arg1) {
        return new Localizable(holder, "Slave.InvalidConfig.Executors", arg1);
    }

    /**
     * This permission allows users to create slaves.
     * 
     */
    public static String Computer_CreatePermission_Description() {
        return holder.format("Computer.CreatePermission.Description");
    }

    /**
     * This permission allows users to create slaves.
     * 
     */
    public static Localizable _Computer_CreatePermission_Description() {
        return new Localizable(holder, "Computer.CreatePermission.Description");
    }

    /**
     * Started by upstream project "{0}" build number {1}
     * 
     */
    public static String Cause_UpstreamCause_ShortDescription(Object arg1, Object arg2) {
        return holder.format("Cause.UpstreamCause.ShortDescription", arg1, arg2);
    }

    /**
     * Started by upstream project "{0}" build number {1}
     * 
     */
    public static Localizable _Cause_UpstreamCause_ShortDescription(Object arg1, Object arg2) {
        return new Localizable(holder, "Cause.UpstreamCause.ShortDescription", arg1, arg2);
    }

    /**
     * Upstream project {0} is already building.
     * 
     */
    public static String AbstractProject_UpstreamBuildInProgress(Object arg1) {
        return holder.format("AbstractProject.UpstreamBuildInProgress", arg1);
    }

    /**
     * Upstream project {0} is already building.
     * 
     */
    public static Localizable _AbstractProject_UpstreamBuildInProgress(Object arg1) {
        return new Localizable(holder, "AbstractProject.UpstreamBuildInProgress", arg1);
    }

    /**
     * originally caused by:
     * 
     */
    public static String Cause_UpstreamCause_CausedBy() {
        return holder.format("Cause.UpstreamCause.CausedBy");
    }

    /**
     * originally caused by:
     * 
     */
    public static Localizable _Cause_UpstreamCause_CausedBy() {
        return new Localizable(holder, "Cause.UpstreamCause.CausedBy");
    }

    /**
     * &lt;span class=error>Failed to resolve host name {0}. Perhaps you need to &lt;a href="../pluginManager/advanced">configure HTTP proxy?&lt;/a>&lt;/span>
     * 
     */
    public static String UpdateCenter_Status_UnknownHostException(Object arg1) {
        return holder.format("UpdateCenter.Status.UnknownHostException", arg1);
    }

    /**
     * &lt;span class=error>Failed to resolve host name {0}. Perhaps you need to &lt;a href="../pluginManager/advanced">configure HTTP proxy?&lt;/a>&lt;/span>
     * 
     */
    public static Localizable _UpdateCenter_Status_UnknownHostException(Object arg1) {
        return new Localizable(holder, "UpdateCenter.Status.UnknownHostException", arg1);
    }

    /**
     * Awaiting build to get a workspace.
     * 
     */
    public static String AbstractProject_AwaitingBuildForWorkspace() {
        return holder.format("AbstractProject.AwaitingBuildForWorkspace");
    }

    /**
     * Awaiting build to get a workspace.
     * 
     */
    public static Localizable _AbstractProject_AwaitingBuildForWorkspace() {
        return new Localizable(holder, "AbstractProject.AwaitingBuildForWorkspace");
    }

    /**
     * Discard all the loaded data in memory and reload everything from file system. Useful when you modified config files directly on disk.
     * 
     */
    public static String CLI_reload_configuration_shortDescription() {
        return holder.format("CLI.reload-configuration.shortDescription");
    }

    /**
     * Discard all the loaded data in memory and reload everything from file system. Useful when you modified config files directly on disk.
     * 
     */
    public static Localizable _CLI_reload_configuration_shortDescription() {
        return new Localizable(holder, "CLI.reload-configuration.shortDescription");
    }

    /**
     * Text Parameter
     * 
     */
    public static String TextParameterDefinition_DisplayName() {
        return holder.format("TextParameterDefinition.DisplayName");
    }

    /**
     * Text Parameter
     * 
     */
    public static Localizable _TextParameterDefinition_DisplayName() {
        return new Localizable(holder, "TextParameterDefinition.DisplayName");
    }

    /**
     * broken since build {0}
     * 
     */
    public static String Run_Summary_BrokenSince(Object arg1) {
        return holder.format("Run.Summary.BrokenSince", arg1);
    }

    /**
     * broken since build {0}
     * 
     */
    public static Localizable _Run_Summary_BrokenSince(Object arg1) {
        return new Localizable(holder, "Run.Summary.BrokenSince", arg1);
    }

    /**
     * Create a new job.
     * 
     */
    public static String Item_CREATE_description() {
        return holder.format("Item.CREATE.description");
    }

    /**
     * Create a new job.
     * 
     */
    public static Localizable _Item_CREATE_description() {
        return new Localizable(holder, "Item.CREATE.description");
    }

    /**
     * Delete a job.
     * 
     */
    public static String Item_DELETE_description() {
        return holder.format("Item.DELETE.description");
    }

    /**
     * Delete a job.
     * 
     */
    public static Localizable _Item_DELETE_description() {
        return new Localizable(holder, "Item.DELETE.description");
    }

    /**
     * Number may not be negative
     * 
     */
    public static String Hudson_NotANonNegativeNumber() {
        return holder.format("Hudson.NotANonNegativeNumber");
    }

    /**
     * Number may not be negative
     * 
     */
    public static Localizable _Hudson_NotANonNegativeNumber() {
        return new Localizable(holder, "Hudson.NotANonNegativeNumber");
    }

    /**
     * This is a Windows slave
     * 
     */
    public static String Slave_WindowsSlave() {
        return holder.format("Slave.WindowsSlave");
    }

    /**
     * This is a Windows slave
     * 
     */
    public static Localizable _Slave_WindowsSlave() {
        return new Localizable(holder, "Slave.WindowsSlave");
    }

    /**
     * XPath {0} didn’t match
     * 
     */
    public static String Api_NoXPathMatch(Object arg1) {
        return holder.format("Api.NoXPathMatch", arg1);
    }

    /**
     * XPath {0} didn’t match
     * 
     */
    public static Localizable _Api_NoXPathMatch(Object arg1) {
        return new Localizable(holder, "Api.NoXPathMatch", arg1);
    }

    /**
     * The remote root must be an absolute path.
     * 
     */
    public static String Slave_the_remote_root_must_be_an_absolute_path() {
        return holder.format("Slave.the_remote_root_must_be_an_absolute_path");
    }

    /**
     * The remote root must be an absolute path.
     * 
     */
    public static Localizable _Slave_the_remote_root_must_be_an_absolute_path() {
        return new Localizable(holder, "Slave.the_remote_root_must_be_an_absolute_path");
    }

    /**
     * back to normal
     * 
     */
    public static String Run_Summary_BackToNormal() {
        return holder.format("Run.Summary.BackToNormal");
    }

    /**
     * back to normal
     * 
     */
    public static Localizable _Run_Summary_BackToNormal() {
        return new Localizable(holder, "Run.Summary.BackToNormal");
    }

    /**
     * Project
     * 
     */
    public static String Job_Pronoun() {
        return holder.format("Job.Pronoun");
    }

    /**
     * Project
     * 
     */
    public static Localizable _Job_Pronoun() {
        return new Localizable(holder, "Job.Pronoun");
    }

    /**
     * Building on master
     * 
     */
    public static String AbstractBuild_BuildingOnMaster() {
        return holder.format("AbstractBuild.BuildingOnMaster");
    }

    /**
     * Building on master
     * 
     */
    public static Localizable _AbstractBuild_BuildingOnMaster() {
        return new Localizable(holder, "AbstractBuild.BuildingOnMaster");
    }

    /**
     * {0} is waiting for a checkpoint on {1}
     * 
     */
    public static String Run__is_waiting_for_a_checkpoint_on_(Object arg1, Object arg2) {
        return holder.format("Run._is_waiting_for_a_checkpoint_on_", arg1, arg2);
    }

    /**
     * {0} is waiting for a checkpoint on {1}
     * 
     */
    public static Localizable _Run__is_waiting_for_a_checkpoint_on_(Object arg1, Object arg2) {
        return new Localizable(holder, "Run._is_waiting_for_a_checkpoint_on_", arg1, arg2);
    }

    /**
     * Build disabled
     * 
     */
    public static String AbstractProject_Disabled() {
        return holder.format("AbstractProject.Disabled");
    }

    /**
     * Build disabled
     * 
     */
    public static Localizable _AbstractProject_Disabled() {
        return new Localizable(holder, "AbstractProject.Disabled");
    }

    /**
     * This permission grants the ability to cancel a scheduled, or abort a running, build.
     * 
     */
    public static String AbstractProject_CancelPermission_Description() {
        return holder.format("AbstractProject.CancelPermission.Description");
    }

    /**
     * This permission grants the ability to cancel a scheduled, or abort a running, build.
     * 
     */
    public static Localizable _AbstractProject_CancelPermission_Description() {
        return new Localizable(holder, "AbstractProject.CancelPermission.Description");
    }

    /**
     * N/A
     * 
     */
    public static String UpdateCenter_n_a() {
        return holder.format("UpdateCenter.n_a");
    }

    /**
     * N/A
     * 
     */
    public static Localizable _UpdateCenter_n_a() {
        return new Localizable(holder, "UpdateCenter.n_a");
    }

    /**
     * My Views
     * 
     */
    public static String MyViewsProperty_DisplayName() {
        return holder.format("MyViewsProperty.DisplayName");
    }

    /**
     * My Views
     * 
     */
    public static Localizable _MyViewsProperty_DisplayName() {
        return new Localizable(holder, "MyViewsProperty.DisplayName");
    }

    /**
     * All recent builds failed.
     * 
     */
    public static String Job_AllRecentBuildFailed() {
        return holder.format("Job.AllRecentBuildFailed");
    }

    /**
     * All recent builds failed.
     * 
     */
    public static Localizable _Job_AllRecentBuildFailed() {
        return new Localizable(holder, "Job.AllRecentBuildFailed");
    }

    /**
     * Started by remote host {0} with note: {1}
     * 
     */
    public static String Cause_RemoteCause_ShortDescriptionWithNote(Object arg1, Object arg2) {
        return holder.format("Cause.RemoteCause.ShortDescriptionWithNote", arg1, arg2);
    }

    /**
     * Started by remote host {0} with note: {1}
     * 
     */
    public static Localizable _Cause_RemoteCause_ShortDescriptionWithNote(Object arg1, Object arg2) {
        return new Localizable(holder, "Cause.RemoteCause.ShortDescriptionWithNote", arg1, arg2);
    }

    /**
     * Build was aborted
     * 
     */
    public static String Run_BuildAborted() {
        return holder.format("Run.BuildAborted");
    }

    /**
     * Build was aborted
     * 
     */
    public static Localizable _Run_BuildAborted() {
        return new Localizable(holder, "Run.BuildAborted");
    }

    /**
     * Manage Jenkins
     * 
     */
    public static String ManageJenkinsAction_DisplayName() {
        return holder.format("ManageJenkinsAction.DisplayName");
    }

    /**
     * Manage Jenkins
     * 
     */
    public static Localizable _ManageJenkinsAction_DisplayName() {
        return new Localizable(holder, "ManageJenkinsAction.DisplayName");
    }

    /**
     * group of {0}
     * 
     */
    public static String Label_GroupOf(Object arg1) {
        return holder.format("Label.GroupOf", arg1);
    }

    /**
     * group of {0}
     * 
     */
    public static Localizable _Label_GroupOf(Object arg1) {
        return new Localizable(holder, "Label.GroupOf", arg1);
    }

    /**
     * Still failing
     * 
     */
    public static String ResultTrend_StillFailing() {
        return holder.format("ResultTrend.StillFailing");
    }

    /**
     * Still failing
     * 
     */
    public static Localizable _ResultTrend_StillFailing() {
        return new Localizable(holder, "ResultTrend.StillFailing");
    }
    
    /**
     * Still  Sonar QG failing
     * 
     */
    public static Localizable _ResultTrend_StillSonarQGFailing() {
        return new Localizable(holder, "ResultTrend.StillSonarQGFailing");
    }


    /**
     * Last stable build
     * 
     */
    public static String Permalink_LastStableBuild() {
        return holder.format("Permalink.LastStableBuild");
    }

    /**
     * Last stable build
     * 
     */
    public static Localizable _Permalink_LastStableBuild() {
        return new Localizable(holder, "Permalink.LastStableBuild");
    }

    /**
     * Custom workspace is empty.
     * 
     */
    public static String AbstractProject_CustomWorkspaceEmpty() {
        return holder.format("AbstractProject.CustomWorkspaceEmpty");
    }

    /**
     * Custom workspace is empty.
     * 
     */
    public static Localizable _AbstractProject_CustomWorkspaceEmpty() {
        return new Localizable(holder, "AbstractProject.CustomWorkspaceEmpty");
    }

    /**
     * Queue length
     * 
     */
    public static String LoadStatistics_Legends_QueueLength() {
        return holder.format("LoadStatistics.Legends.QueueLength");
    }

    /**
     * Queue length
     * 
     */
    public static Localizable _LoadStatistics_Legends_QueueLength() {
        return new Localizable(holder, "LoadStatistics.Legends.QueueLength");
    }

    /**
     *  (ETA:{0})
     * 
     */
    public static String AbstractProject_ETA(Object arg1) {
        return holder.format("AbstractProject.ETA", arg1);
    }

    /**
     *  (ETA:{0})
     * 
     */
    public static Localizable _AbstractProject_ETA(Object arg1) {
        return new Localizable(holder, "AbstractProject.ETA", arg1);
    }

    /**
     * This build is kept because of {0}.
     * 
     */
    public static String AbstractBuild_KeptBecause(Object arg1) {
        return holder.format("AbstractBuild.KeptBecause", arg1);
    }

    /**
     * This build is kept because of {0}.
     * 
     */
    public static Localizable _AbstractBuild_KeptBecause(Object arg1) {
        return new Localizable(holder, "AbstractBuild.KeptBecause", arg1);
    }

    /**
     * Parameters
     * 
     */
    public static String ParametersDefinitionProperty_DisplayName() {
        return holder.format("ParametersDefinitionProperty.DisplayName");
    }

    /**
     * Parameters
     * 
     */
    public static Localizable _ParametersDefinitionProperty_DisplayName() {
        return new Localizable(holder, "ParametersDefinitionProperty.DisplayName");
    }

    /**
     * This permission grants the ability to retrieve the artifacts produced by builds. If you don’t want an user to access the artifacts, you can do so by revoking this permission.
     * 
     */
    public static String Run_ArtifactsPermission_Description() {
        return holder.format("Run.ArtifactsPermission.Description");
    }

    /**
     * This permission grants the ability to retrieve the artifacts produced by builds. If you don’t want an user to access the artifacts, you can do so by revoking this permission.
     * 
     */
    public static Localizable _Run_ArtifactsPermission_Description() {
        return new Localizable(holder, "Run.ArtifactsPermission.Description");
    }

    /**
     * Bad port number {0}
     * 
     */
    public static String Hudson_BadPortNumber(Object arg1) {
        return holder.format("Hudson.BadPortNumber", arg1);
    }

    /**
     * Bad port number {0}
     * 
     */
    public static Localizable _Hudson_BadPortNumber(Object arg1) {
        return new Localizable(holder, "Hudson.BadPortNumber", arg1);
    }

    /**
     * Busy executors
     * 
     */
    public static String LoadStatistics_Legends_BusyExecutors() {
        return holder.format("LoadStatistics.Legends.BusyExecutors");
    }

    /**
     * Busy executors
     * 
     */
    public static Localizable _LoadStatistics_Legends_BusyExecutors() {
        return new Localizable(holder, "LoadStatistics.Legends.BusyExecutors");
    }

    /**
     * No SCM
     * 
     */
    public static String AbstractProject_NoSCM() {
        return holder.format("AbstractProject.NoSCM");
    }

    /**
     * No SCM
     * 
     */
    public static Localizable _AbstractProject_NoSCM() {
        return new Localizable(holder, "AbstractProject.NoSCM");
    }

    /**
     * Build Tools
     * 
     */
    public static String UpdateCenter_PluginCategory_builder() {
        return holder.format("UpdateCenter.PluginCategory.builder");
    }

    /**
     * Build Tools
     * 
     */
    public static Localizable _UpdateCenter_PluginCategory_builder() {
        return new Localizable(holder, "UpdateCenter.PluginCategory.builder");
    }

    /**
     * java is not in your PATH. Maybe you need to &lt;a href="{0}/configure">configure JDKs&lt;/a>?
     * 
     */
    public static String Hudson_NoJavaInPath(Object arg1) {
        return holder.format("Hudson.NoJavaInPath", arg1);
    }

    /**
     * java is not in your PATH. Maybe you need to &lt;a href="{0}/configure">configure JDKs&lt;/a>?
     * 
     */
    public static Localizable _Hudson_NoJavaInPath(Object arg1) {
        return new Localizable(holder, "Hudson.NoJavaInPath", arg1);
    }

    /**
     * Downloaded Successfully. Will be activated during the next boot
     * 
     */
    public static String UpdateCenter_DownloadButNotActivated() {
        return holder.format("UpdateCenter.DownloadButNotActivated");
    }

    /**
     * Downloaded Successfully. Will be activated during the next boot
     * 
     */
    public static Localizable _UpdateCenter_DownloadButNotActivated() {
        return new Localizable(holder, "UpdateCenter.DownloadButNotActivated");
    }

    /**
     * &lt;span class=error>Failed to connect to {0}. Perhaps you need to &lt;a href="../pluginManager/advanced">configure HTTP proxy?&lt;/a>&lt;/span>
     * 
     */
    public static String UpdateCenter_Status_ConnectionFailed(Object arg1) {
        return holder.format("UpdateCenter.Status.ConnectionFailed", arg1);
    }

    /**
     * &lt;span class=error>Failed to connect to {0}. Perhaps you need to &lt;a href="../pluginManager/advanced">configure HTTP proxy?&lt;/a>&lt;/span>
     * 
     */
    public static Localizable _UpdateCenter_Status_ConnectionFailed(Object arg1) {
        return new Localizable(holder, "UpdateCenter.Status.ConnectionFailed", arg1);
    }

    /**
     * This permission allows users to manually delete specific builds from the build history.
     * 
     */
    public static String Run_DeletePermission_Description() {
        return holder.format("Run.DeletePermission.Description");
    }

    /**
     * This permission allows users to manually delete specific builds from the build history.
     * 
     */
    public static Localizable _Run_DeletePermission_Description() {
        return new Localizable(holder, "Run.DeletePermission.Description");
    }

    /**
     * Build #{0} is already in progress{1}
     * 
     */
    public static String AbstractProject_BuildInProgress(Object arg1, Object arg2) {
        return holder.format("AbstractProject.BuildInProgress", arg1, arg2);
    }

    /**
     * Build #{0} is already in progress{1}
     * 
     */
    public static Localizable _AbstractProject_BuildInProgress(Object arg1, Object arg2) {
        return new Localizable(holder, "AbstractProject.BuildInProgress", arg1, arg2);
    }

    /**
     * Not a negative number
     * 
     */
    public static String Hudson_NotANegativeNumber() {
        return holder.format("Hudson.NotANegativeNumber");
    }

    /**
     * Not a negative number
     * 
     */
    public static Localizable _Hudson_NotANegativeNumber() {
        return new Localizable(holder, "Hudson.NotANegativeNumber");
    }

    /**
     * Resume using a node for performing builds, to cancel out the earlier "offline-node" command.
     * 
     */
    public static String CLI_online_node_shortDescription() {
        return holder.format("CLI.online-node.shortDescription");
    }

    /**
     * Resume using a node for performing builds, to cancel out the earlier "offline-node" command.
     * 
     */
    public static Localizable _CLI_online_node_shortDescription() {
        return new Localizable(holder, "CLI.online-node.shortDescription");
    }

    /**
     * My Views
     * 
     */
    public static String MyViewsProperty_GlobalAction_DisplayName() {
        return holder.format("MyViewsProperty.GlobalAction.DisplayName");
    }

    /**
     * My Views
     * 
     */
    public static Localizable _MyViewsProperty_GlobalAction_DisplayName() {
        return new Localizable(holder, "MyViewsProperty.GlobalAction.DisplayName");
    }

    /**
     * This permission grants the ability to wipe out the contents of a workspace.
     * 
     */
    public static String AbstractProject_WipeOutPermission_Description() {
        return holder.format("AbstractProject.WipeOutPermission.Description");
    }

    /**
     * This permission grants the ability to wipe out the contents of a workspace.
     * 
     */
    public static Localizable _AbstractProject_WipeOutPermission_Description() {
        return new Localizable(holder, "AbstractProject.WipeOutPermission.Description");
    }

    /**
     * All
     * 
     */
    public static String Hudson_ViewName() {
        return holder.format("Hudson.ViewName");
    }

    /**
     * All
     * 
     */
    public static Localizable _Hudson_ViewName() {
        return new Localizable(holder, "Hudson.ViewName");
    }

    /**
     * {0} is reserved for jobs with matching label expression
     * 
     */
    public static String Node_BecauseNodeIsReserved(Object arg1) {
        return holder.format("Node.BecauseNodeIsReserved", arg1);
    }

    /**
     * {0} is reserved for jobs with matching label expression
     * 
     */
    public static Localizable _Node_BecauseNodeIsReserved(Object arg1) {
        return new Localizable(holder, "Node.BecauseNodeIsReserved", arg1);
    }

    /**
     * Run
     * 
     */
    public static String Run_Permissions_Title() {
        return holder.format("Run.Permissions.Title");
    }

    /**
     * Run
     * 
     */
    public static Localizable _Run_Permissions_Title() {
        return new Localizable(holder, "Run.Permissions.Title");
    }

    /**
     * Fixed
     * 
     */
    public static String ResultTrend_Fixed() {
        return holder.format("ResultTrend.Fixed");
    }

    /**
     * Fixed
     * 
     */
    public static Localizable _ResultTrend_Fixed() {
        return new Localizable(holder, "ResultTrend.Fixed");
    }

    /**
     * Started by user {0}
     * 
     */
    public static String Cause_UserCause_ShortDescription(Object arg1) {
        return holder.format("Cause.UserCause.ShortDescription", arg1);
    }

    /**
     * Started by user {0}
     * 
     */
    public static Localizable _Cause_UserCause_ShortDescription(Object arg1) {
        return new Localizable(holder, "Cause.UserCause.ShortDescription", arg1);
    }

    /**
     * In the quiet period. Expires in {0}
     * 
     */
    public static String Queue_InQuietPeriod(Object arg1) {
        return holder.format("Queue.InQuietPeriod", arg1);
    }

    /**
     * In the quiet period. Expires in {0}
     * 
     */
    public static Localizable _Queue_InQuietPeriod(Object arg1) {
        return new Localizable(holder, "Queue.InQuietPeriod", arg1);
    }

    /**
     * Invalid slave configuration. Name is empty
     * 
     */
    public static String Slave_InvalidConfig_NoName() {
        return holder.format("Slave.InvalidConfig.NoName");
    }

    /**
     * Invalid slave configuration. Name is empty
     * 
     */
    public static Localizable _Slave_InvalidConfig_NoName() {
        return new Localizable(holder, "Slave.InvalidConfig.NoName");
    }

    /**
     * Failure
     * 
     */
    public static String ResultTrend_Failure() {
        return holder.format("ResultTrend.Failure");
    }

    /**
     * Failure
     * 
     */
    public static Localizable _ResultTrend_Failure() {
        return new Localizable(holder, "ResultTrend.Failure");
    }
    
    
    /**
     * Sonar QG Failure
     * 
     */
    public static String ResultTrend_Sonar_QG_Failure() {
        return holder.format("ResultTrend.Sonar.QG.Failed");
    }

    /**
     * Sonar QG Failure
     * 
     */
    public static Localizable _ResultTrend_Sonar_QG_Failure() {
        return new Localizable(holder, "ResultTrend.Sonar.QG.Failed");
    }

    /**
     * Started by remote host {0}
     * 
     */
    public static String Cause_RemoteCause_ShortDescription(Object arg1) {
        return holder.format("Cause.RemoteCause.ShortDescription", arg1);
    }

    /**
     * Started by remote host {0}
     * 
     */
    public static Localizable _Cause_RemoteCause_ShortDescription(Object arg1) {
        return new Localizable(holder, "Cause.RemoteCause.ShortDescription", arg1);
    }

    /**
     * Utilize this node as much as possible
     * 
     */
    public static String Node_Mode_NORMAL() {
        return holder.format("Node.Mode.NORMAL");
    }

    /**
     * Utilize this node as much as possible
     * 
     */
    public static Localizable _Node_Mode_NORMAL() {
        return new Localizable(holder, "Node.Mode.NORMAL");
    }

    /**
     * Slave node offline or not a remote channel (such as master node).
     * 
     */
    public static String Computer_BadChannel() {
        return holder.format("Computer.BadChannel");
    }

    /**
     * Slave node offline or not a remote channel (such as master node).
     * 
     */
    public static Localizable _Computer_BadChannel() {
        return new Localizable(holder, "Computer.BadChannel");
    }

    /**
     * Waiting for next available executor on {0}
     * 
     */
    public static String Queue_WaitingForNextAvailableExecutorOn(Object arg1) {
        return holder.format("Queue.WaitingForNextAvailableExecutorOn", arg1);
    }

    /**
     * Waiting for next available executor on {0}
     * 
     */
    public static Localizable _Queue_WaitingForNextAvailableExecutorOn(Object arg1) {
        return new Localizable(holder, "Queue.WaitingForNextAvailableExecutorOn", arg1);
    }

    /**
     * Total executors
     * 
     */
    public static String LoadStatistics_Legends_TotalExecutors() {
        return holder.format("LoadStatistics.Legends.TotalExecutors");
    }

    /**
     * Total executors
     * 
     */
    public static Localizable _LoadStatistics_Legends_TotalExecutors() {
        return new Localizable(holder, "LoadStatistics.Legends.TotalExecutors");
    }

    /**
     * broken since this build
     * 
     */
    public static String Run_Summary_BrokenSinceThisBuild() {
        return holder.format("Run.Summary.BrokenSinceThisBuild");
    }

    /**
     * broken since this build
     * 
     */
    public static Localizable _Run_Summary_BrokenSinceThisBuild() {
        return new Localizable(holder, "Run.Summary.BrokenSinceThisBuild");
    }

    /**
     * No existing build. Scheduling a new one.
     * 
     */
    public static String AbstractProject_NoBuilds() {
        return holder.format("AbstractProject.NoBuilds");
    }

    /**
     * No existing build. Scheduling a new one.
     * 
     */
    public static Localizable _AbstractProject_NoBuilds() {
        return new Localizable(holder, "AbstractProject.NoBuilds");
    }

    /**
     * This permission grants the ability to make system-wide configuration changes, as well as perform highly sensitive operations that amounts to full local system access (within the scope granted by the underlying OS.)
     * 
     */
    public static String Hudson_AdministerPermission_Description() {
        return holder.format("Hudson.AdministerPermission.Description");
    }

    /**
     * This permission grants the ability to make system-wide configuration changes, as well as perform highly sensitive operations that amounts to full local system access (within the scope granted by the underlying OS.)
     * 
     */
    public static Localizable _Hudson_AdministerPermission_Description() {
        return new Localizable(holder, "Hudson.AdministerPermission.Description");
    }

    /**
     * External Job
     * 
     */
    public static String ExternalJob_Pronoun() {
        return holder.format("ExternalJob.Pronoun");
    }

    /**
     * External Job
     * 
     */
    public static Localizable _ExternalJob_Pronoun() {
        return new Localizable(holder, "ExternalJob.Pronoun");
    }

    /**
     * Failed
     * 
     */
    public static String BallColor_Failed() {
        return holder.format("BallColor.Sonar.QG.Failed");
    }

    /**
     * Failed
     * 
     */
    public static Localizable _BallColor_Sonar_QG_Failed() {
        return new Localizable(holder, "BallColor.Sonar.QG.Failed");
    }
    
    /**
     * Failed
     * 
     */
    public static String BallColor_Sonar_QG_Failed() {
        return holder.format("BallColor.Failed");
    }

    /**
     * Failed
     * 
     */
    public static Localizable _BallColor_Failed() {
        return new Localizable(holder, "BallColor.Failed");
    }

    /**
     * Last unstable build
     * 
     */
    public static String Permalink_LastUnstableBuild() {
        return holder.format("Permalink.LastUnstableBuild");
    }

    /**
     * Last unstable build
     * 
     */
    public static Localizable _Permalink_LastUnstableBuild() {
        return new Localizable(holder, "Permalink.LastUnstableBuild");
    }

    /**
     * Invalid token provided.
     * 
     */
    public static String BuildAuthorizationToken_InvalidTokenProvided() {
        return holder.format("BuildAuthorizationToken.InvalidTokenProvided");
    }

    /**
     * Invalid token provided.
     * 
     */
    public static Localizable _BuildAuthorizationToken_InvalidTokenProvided() {
        return new Localizable(holder, "BuildAuthorizationToken.InvalidTokenProvided");
    }

    /**
     * {0} out of the last {1} builds failed.
     * 
     */
    public static String Job_NOfMFailed(Object arg1, Object arg2) {
        return holder.format("Job.NOfMFailed", arg1, arg2);
    }

    /**
     * {0} out of the last {1} builds failed.
     * 
     */
    public static Localizable _Job_NOfMFailed(Object arg1, Object arg2) {
        return new Localizable(holder, "Job.NOfMFailed", arg1, arg2);
    }

    /**
     * Workspace of {0} on {1}
     * 
     */
    public static String AbstractProject_WorkspaceTitleOnComputer(Object arg1, Object arg2) {
        return holder.format("AbstractProject.WorkspaceTitleOnComputer", arg1, arg2);
    }

    /**
     * Workspace of {0} on {1}
     * 
     */
    public static Localizable _AbstractProject_WorkspaceTitleOnComputer(Object arg1, Object arg2) {
        return new Localizable(holder, "AbstractProject.WorkspaceTitleOnComputer", arg1, arg2);
    }

    /**
     * All nodes of label ‘{0}’ are offline
     * 
     */
    public static String Queue_AllNodesOffline(Object arg1) {
        return holder.format("Queue.AllNodesOffline", arg1);
    }

    /**
     * All nodes of label ‘{0}’ are offline
     * 
     */
    public static Localizable _Queue_AllNodesOffline(Object arg1) {
        return new Localizable(holder, "Queue.AllNodesOffline", arg1);
    }

    /**
     * Job
     * 
     */
    public static String Item_Permissions_Title() {
        return holder.format("Item.Permissions.Title");
    }

    /**
     * Job
     * 
     */
    public static Localizable _Item_Permissions_Title() {
        return new Localizable(holder, "Item.Permissions.Title");
    }

    /**
     * Other Post-Build Actions
     * 
     */
    public static String UpdateCenter_PluginCategory_post_build() {
        return holder.format("UpdateCenter.PluginCategory.post-build");
    }

    /**
     * Other Post-Build Actions
     * 
     */
    public static Localizable _UpdateCenter_PluginCategory_post_build() {
        return new Localizable(holder, "UpdateCenter.PluginCategory.post-build");
    }

    /**
     * A build is already in progress
     * 
     */
    public static String Queue_InProgress() {
        return holder.format("Queue.InProgress");
    }

    /**
     * A build is already in progress
     * 
     */
    public static Localizable _Queue_InProgress() {
        return new Localizable(holder, "Queue.InProgress");
    }

    /**
     * Running as {0}
     * 
     */
    public static String Run_running_as_(Object arg1) {
        return holder.format("Run.running_as_", arg1);
    }

    /**
     * Running as {0}
     * 
     */
    public static Localizable _Run_running_as_(Object arg1) {
        return new Localizable(holder, "Run.running_as_", arg1);
    }

    /**
     * Source Code Management
     * 
     */
    public static String UpdateCenter_PluginCategory_scm() {
        return holder.format("UpdateCenter.PluginCategory.scm");
    }

    /**
     * Source Code Management
     * 
     */
    public static Localizable _UpdateCenter_PluginCategory_scm() {
        return new Localizable(holder, "UpdateCenter.PluginCategory.scm");
    }

    /**
     * This permission allows users to delete existing slaves.
     * 
     */
    public static String Computer_DeletePermission_Description() {
        return holder.format("Computer.DeletePermission.Description");
    }

    /**
     * This permission allows users to delete existing slaves.
     * 
     */
    public static Localizable _Computer_DeletePermission_Description() {
        return new Localizable(holder, "Computer.DeletePermission.Description");
    }

    /**
     * Build Now
     * 
     */
    public static String AbstractProject_BuildNow() {
        return holder.format("AbstractProject.BuildNow");
    }

    /**
     * Build Now
     * 
     */
    public static Localizable _AbstractProject_BuildNow() {
        return new Localizable(holder, "AbstractProject.BuildNow");
    }

    /**
     * Run Parameter
     * 
     */
    public static String RunParameterDefinition_DisplayName() {
        return holder.format("RunParameterDefinition.DisplayName");
    }

    /**
     * Run Parameter
     * 
     */
    public static Localizable _RunParameterDefinition_DisplayName() {
        return new Localizable(holder, "RunParameterDefinition.DisplayName");
    }

    /**
     * Wait for a node to become online.
     * 
     */
    public static String CLI_wait_node_online_shortDescription() {
        return holder.format("CLI.wait-node-online.shortDescription");
    }

    /**
     * Wait for a node to become online.
     * 
     */
    public static Localizable _CLI_wait_node_online_shortDescription() {
        return new Localizable(holder, "CLI.wait-node-online.shortDescription");
    }

    /**
     * There’s no slave/cloud that matches this assignment. Did you mean ‘{1}’ instead of ‘{0}’?
     * 
     */
    public static String AbstractProject_AssignedLabelString_NoMatch_DidYouMean(Object arg1, Object arg2) {
        return holder.format("AbstractProject.AssignedLabelString_NoMatch_DidYouMean", arg1, arg2);
    }

    /**
     * There’s no slave/cloud that matches this assignment. Did you mean ‘{1}’ instead of ‘{0}’?
     * 
     */
    public static Localizable _AbstractProject_AssignedLabelString_NoMatch_DidYouMean(Object arg1, Object arg2) {
        return new Localizable(holder, "AbstractProject.AssignedLabelString_NoMatch_DidYouMean", arg1, arg2);
    }

    /**
     * Reloads this job from disk.
     * 
     */
    public static String CLI_reload_job_shortDescription() {
        return holder.format("CLI.reload-job.shortDescription");
    }

    /**
     * Reloads this job from disk.
     * 
     */
    public static Localizable _CLI_reload_job_shortDescription() {
        return new Localizable(holder, "CLI.reload-job.shortDescription");
    }

    /**
     * {0} is not a Jenkins plugin
     * 
     */
    public static String Hudson_NotAPlugin(Object arg1) {
        return holder.format("Hudson.NotAPlugin", arg1);
    }

    /**
     * {0} is not a Jenkins plugin
     * 
     */
    public static Localizable _Hudson_NotAPlugin(Object arg1) {
        return new Localizable(holder, "Hudson.NotAPlugin", arg1);
    }

    /**
     * Build Triggers
     * 
     */
    public static String UpdateCenter_PluginCategory_trigger() {
        return holder.format("UpdateCenter.PluginCategory.trigger");
    }

    /**
     * Build Triggers
     * 
     */
    public static Localizable _UpdateCenter_PluginCategory_trigger() {
        return new Localizable(holder, "UpdateCenter.PluginCategory.trigger");
    }

    /**
     * Misc ({0})
     * 
     */
    public static String UpdateCenter_PluginCategory_unrecognized(Object arg1) {
        return holder.format("UpdateCenter.PluginCategory.unrecognized", arg1);
    }

    /**
     * Misc ({0})
     * 
     */
    public static Localizable _UpdateCenter_PluginCategory_unrecognized(Object arg1) {
        return new Localizable(holder, "UpdateCenter.PluginCategory.unrecognized", arg1);
    }

    /**
     * Not built
     * 
     */
    public static String ResultTrend_NotBuilt() {
        return holder.format("ResultTrend.NotBuilt");
    }

    /**
     * Not built
     * 
     */
    public static Localizable _ResultTrend_NotBuilt() {
        return new Localizable(holder, "ResultTrend.NotBuilt");
    }

    /**
     * Pending
     * 
     */
    public static String BallColor_Pending() {
        return holder.format("BallColor.Pending");
    }

    /**
     * Pending
     * 
     */
    public static Localizable _BallColor_Pending() {
        return new Localizable(holder, "BallColor.Pending");
    }

    /**
     * Disconnects from a node.
     * 
     */
    public static String CLI_disconnect_node_shortDescription() {
        return holder.format("CLI.disconnect-node.shortDescription");
    }

    /**
     * Disconnects from a node.
     * 
     */
    public static Localizable _CLI_disconnect_node_shortDescription() {
        return new Localizable(holder, "CLI.disconnect-node.shortDescription");
    }

    /**
     *  in workspace {0}
     * 
     */
    public static String AbstractBuild_BuildingInWorkspace(Object arg1) {
        return holder.format("AbstractBuild.BuildingInWorkspace", arg1);
    }

    /**
     *  in workspace {0}
     * 
     */
    public static Localizable _AbstractBuild_BuildingInWorkspace(Object arg1) {
        return new Localizable(holder, "AbstractBuild.BuildingInWorkspace", arg1);
    }

    /**
     * Maven
     * 
     */
    public static String UpdateCenter_PluginCategory_maven() {
        return holder.format("UpdateCenter.PluginCategory.maven");
    }

    /**
     * Maven
     * 
     */
    public static Localizable _UpdateCenter_PluginCategory_maven() {
        return new Localizable(holder, "UpdateCenter.PluginCategory.maven");
    }

    /**
     * External Site/Tool Integrations
     * 
     */
    public static String UpdateCenter_PluginCategory_external() {
        return holder.format("UpdateCenter.PluginCategory.external");
    }

    /**
     * External Site/Tool Integrations
     * 
     */
    public static Localizable _UpdateCenter_PluginCategory_external() {
        return new Localizable(holder, "UpdateCenter.PluginCategory.external");
    }

    /**
     * Still unstable
     * 
     */
    public static String ResultTrend_StillUnstable() {
        return holder.format("ResultTrend.StillUnstable");
    }

    /**
     * Still unstable
     * 
     */
    public static Localizable _ResultTrend_StillUnstable() {
        return new Localizable(holder, "ResultTrend.StillUnstable");
    }

    /**
     * Building
     * 
     */
    public static String AbstractBuild_Building() {
        return holder.format("AbstractBuild_Building");
    }

    /**
     * Building
     * 
     */
    public static Localizable _AbstractBuild_Building() {
        return new Localizable(holder, "AbstractBuild_Building");
    }

    /**
     * Slave called ‘{0}’ already exists
     * 
     */
    public static String ComputerSet_SlaveAlreadyExists(Object arg1) {
        return holder.format("ComputerSet.SlaveAlreadyExists", arg1);
    }

    /**
     * Slave called ‘{0}’ already exists
     * 
     */
    public static Localizable _ComputerSet_SlaveAlreadyExists(Object arg1) {
        return new Localizable(holder, "ComputerSet.SlaveAlreadyExists", arg1);
    }

    /**
     * Build Reports
     * 
     */
    public static String UpdateCenter_PluginCategory_report() {
        return holder.format("UpdateCenter.PluginCategory.report");
    }

    /**
     * Build Reports
     * 
     */
    public static Localizable _UpdateCenter_PluginCategory_report() {
        return new Localizable(holder, "UpdateCenter.PluginCategory.report");
    }

    /**
     * Disables a job.
     * 
     */
    public static String CLI_disable_job_shortDescription() {
        return holder.format("CLI.disable-job.shortDescription");
    }

    /**
     * Disables a job.
     * 
     */
    public static Localizable _CLI_disable_job_shortDescription() {
        return new Localizable(holder, "CLI.disable-job.shortDescription");
    }

    /**
     * Checking internet connectivity
     * 
     */
    public static String UpdateCenter_Status_CheckingInternet() {
        return holder.format("UpdateCenter.Status.CheckingInternet");
    }

    /**
     * Checking internet connectivity
     * 
     */
    public static Localizable _UpdateCenter_Status_CheckingInternet() {
        return new Localizable(holder, "UpdateCenter.Status.CheckingInternet");
    }

    /**
     * This record is explicitly marked to be kept.
     * 
     */
    public static String Run_MarkedExplicitly() {
        return holder.format("Run.MarkedExplicitly");
    }

    /**
     * This record is explicitly marked to be kept.
     * 
     */
    public static Localizable _Run_MarkedExplicitly() {
        return new Localizable(holder, "Run.MarkedExplicitly");
    }

    /**
     * Unstable
     * 
     */
    public static String BallColor_Unstable() {
        return holder.format("BallColor.Unstable");
    }

    /**
     * Unstable
     * 
     */
    public static Localizable _BallColor_Unstable() {
        return new Localizable(holder, "BallColor.Unstable");
    }

    /**
     * This permission allows users to read slave configuration.
     * 
     */
    public static String Computer_ExtendedReadPermission_Description() {
        return holder.format("Computer.ExtendedReadPermission.Description");
    }

    /**
     * This permission allows users to read slave configuration.
     * 
     */
    public static Localizable _Computer_ExtendedReadPermission_Description() {
        return new Localizable(holder, "Computer.ExtendedReadPermission.Description");
    }

    /**
     * Slave {0}
     * 
     */
    public static String Computer_Caption(Object arg1) {
        return holder.format("Computer.Caption", arg1);
    }

    /**
     * Slave {0}
     * 
     */
    public static Localizable _Computer_Caption(Object arg1) {
        return new Localizable(holder, "Computer.Caption", arg1);
    }

    /**
     * Item
     * 
     */
    public static String AbstractItem_Pronoun() {
        return holder.format("AbstractItem.Pronoun");
    }

    /**
     * Item
     * 
     */
    public static Localizable _AbstractItem_Pronoun() {
        return new Localizable(holder, "AbstractItem.Pronoun");
    }

    /**
     * Not a number
     * 
     */
    public static String Hudson_NotANumber() {
        return holder.format("Hudson.NotANumber");
    }

    /**
     * Not a number
     * 
     */
    public static Localizable _Hudson_NotANumber() {
        return new Localizable(holder, "Hudson.NotANumber");
    }

    /**
     * Mark the build to keep the build forever.
     * 
     */
    public static String CLI_keep_build_shortDescription() {
        return holder.format("CLI.keep-build.shortDescription");
    }

    /**
     * Mark the build to keep the build forever.
     * 
     */
    public static Localizable _CLI_keep_build_shortDescription() {
        return new Localizable(holder, "CLI.keep-build.shortDescription");
    }

    /**
     * Unstable
     * 
     */
    public static String ResultTrend_Unstable() {
        return holder.format("ResultTrend.Unstable");
    }

    /**
     * Unstable
     * 
     */
    public static Localizable _ResultTrend_Unstable() {
        return new Localizable(holder, "ResultTrend.Unstable");
    }

    /**
     * Not built
     * 
     */
    public static String BallColor_NotBuilt() {
        return holder.format("BallColor.NotBuilt");
    }

    /**
     * Not built
     * 
     */
    public static Localizable _BallColor_NotBuilt() {
        return new Localizable(holder, "BallColor.NotBuilt");
    }

    /**
     * Authentication and User Management
     * 
     */
    public static String UpdateCenter_PluginCategory_user() {
        return holder.format("UpdateCenter.PluginCategory.user");
    }

    /**
     * Authentication and User Management
     * 
     */
    public static Localizable _UpdateCenter_PluginCategory_user() {
        return new Localizable(holder, "UpdateCenter.PluginCategory.user");
    }

    /**
     * String Parameter
     * 
     */
    public static String StringParameterDefinition_DisplayName() {
        return holder.format("StringParameterDefinition.DisplayName");
    }

    /**
     * String Parameter
     * 
     */
    public static Localizable _StringParameterDefinition_DisplayName() {
        return new Localizable(holder, "StringParameterDefinition.DisplayName");
    }

    /**
     * This permission allows users to update description and other properties of a build, for example to leave notes about the cause of a build failure.
     * 
     */
    public static String Run_UpdatePermission_Description() {
        return holder.format("Run.UpdatePermission.Description");
    }

    /**
     * This permission allows users to update description and other properties of a build, for example to leave notes about the cause of a build failure.
     * 
     */
    public static Localizable _Run_UpdatePermission_Description() {
        return new Localizable(holder, "Run.UpdatePermission.Description");
    }

    /**
     * This permission allows users to connect slaves or mark slaves as online.
     * 
     */
    public static String Computer_ConnectPermission_Description() {
        return holder.format("Computer.ConnectPermission.Description");
    }

    /**
     * This permission allows users to connect slaves or mark slaves as online.
     * 
     */
    public static Localizable _Computer_ConnectPermission_Description() {
        return new Localizable(holder, "Computer.ConnectPermission.Description");
    }

    /**
     * {0} slave agent was terminated
     * 
     */
    public static String Slave_Terminated(Object arg1) {
        return holder.format("Slave.Terminated", arg1);
    }

    /**
     * {0} slave agent was terminated
     * 
     */
    public static Localizable _Slave_Terminated(Object arg1) {
        return new Localizable(holder, "Slave.Terminated", arg1);
    }

    /**
     * ?
     * 
     */
    public static String Run_Summary_Unknown() {
        return holder.format("Run.Summary.Unknown");
    }

    /**
     * ?
     * 
     */
    public static Localizable _Run_Summary_Unknown() {
        return new Localizable(holder, "Run.Summary.Unknown");
    }

    /**
     * Disabled
     * 
     */
    public static String BallColor_Disabled() {
        return holder.format("BallColor.Disabled");
    }

    /**
     * Disabled
     * 
     */
    public static Localizable _BallColor_Disabled() {
        return new Localizable(holder, "BallColor.Disabled");
    }

    /**
     * This permission grants the ability to retrieve the contents of a workspace Jenkins checked out for performing builds. If you don’t want an user to access the source code, you can do so by revoking this permission.
     * 
     */
    public static String AbstractProject_WorkspacePermission_Description() {
        return holder.format("AbstractProject.WorkspacePermission.Description");
    }

    /**
     * This permission grants the ability to retrieve the contents of a workspace Jenkins checked out for performing builds. If you don’t want an user to access the source code, you can do so by revoking this permission.
     * 
     */
    public static Localizable _AbstractProject_WorkspacePermission_Description() {
        return new Localizable(holder, "AbstractProject.WorkspacePermission.Description");
    }

    /**
     * aborted
     * 
     */
    public static String Run_Summary_Aborted() {
        return holder.format("Run.Summary.Aborted");
    }

    /**
     * aborted
     * 
     */
    public static Localizable _Run_Summary_Aborted() {
        return new Localizable(holder, "Run.Summary.Aborted");
    }

    /**
     * Boolean Parameter
     * 
     */
    public static String BooleanParameterDefinition_DisplayName() {
        return holder.format("BooleanParameterDefinition.DisplayName");
    }

    /**
     * Boolean Parameter
     * 
     */
    public static Localizable _BooleanParameterDefinition_DisplayName() {
        return new Localizable(holder, "BooleanParameterDefinition.DisplayName");
    }

    /**
     * Last build
     * 
     */
    public static String Permalink_LastBuild() {
        return holder.format("Permalink.LastBuild");
    }

    /**
     * Last build
     * 
     */
    public static Localizable _Permalink_LastBuild() {
        return new Localizable(holder, "Permalink.LastBuild");
    }

    /**
     * This permission allows users to run jobs as them on slaves.
     * 
     */
    public static String Computer_BuildPermission_Description() {
        return holder.format("Computer.BuildPermission.Description");
    }

    /**
     * This permission allows users to run jobs as them on slaves.
     * 
     */
    public static Localizable _Computer_BuildPermission_Description() {
        return new Localizable(holder, "Computer.BuildPermission.Description");
    }

    /**
     * A view already exists with the name "{0}"
     * 
     */
    public static String Hudson_ViewAlreadyExists(Object arg1) {
        return holder.format("Hudson.ViewAlreadyExists", arg1);
    }

    /**
     * A view already exists with the name "{0}"
     * 
     */
    public static Localizable _Hudson_ViewAlreadyExists(Object arg1) {
        return new Localizable(holder, "Hudson.ViewAlreadyExists", arg1);
    }

    /**
     * Scheduling a new build to get a workspace.
     * 
     */
    public static String AbstractProject_NewBuildForWorkspace() {
        return holder.format("AbstractProject.NewBuildForWorkspace");
    }

    /**
     * Scheduling a new build to get a workspace.
     * 
     */
    public static Localizable _AbstractProject_NewBuildForWorkspace() {
        return new Localizable(holder, "AbstractProject.NewBuildForWorkspace");
    }

    /**
     * See a job. (You may deny this permission but allow Discover to force an anonymous user to log in to see the job.)
     * 
     */
    public static String Item_READ_description() {
        return holder.format("Item.READ.description");
    }

    /**
     * See a job. (You may deny this permission but allow Discover to force an anonymous user to log in to see the job.)
     * 
     */
    public static Localizable _Item_READ_description() {
        return new Localizable(holder, "Item.READ.description");
    }

    /**
     * "{0}" is not allowed name
     * 
     */
    public static String Jenkins_NotAllowedName(Object arg1) {
        return holder.format("Jenkins.NotAllowedName", arg1);
    }

    /**
     * "{0}" is not allowed name
     * 
     */
    public static Localizable _Jenkins_NotAllowedName(Object arg1) {
        return new Localizable(holder, "Jenkins.NotAllowedName", arg1);
    }

    /**
     * List view columns
     * 
     */
    public static String UpdateCenter_PluginCategory_listview_column() {
        return holder.format("UpdateCenter.PluginCategory.listview-column");
    }

    /**
     * List view columns
     * 
     */
    public static Localizable _UpdateCenter_PluginCategory_listview_column() {
        return new Localizable(holder, "UpdateCenter.PluginCategory.listview-column");
    }

    /**
     * {0} Launching slave agent
     * 
     */
    public static String Slave_Launching(Object arg1) {
        return holder.format("Slave.Launching", arg1);
    }

    /**
     * {0} Launching slave agent
     * 
     */
    public static Localizable _Slave_Launching(Object arg1) {
        return new Localizable(holder, "Slave.Launching", arg1);
    }

    /**
     * Workspace of {0}
     * 
     */
    public static String AbstractProject_WorkspaceTitle(Object arg1) {
        return holder.format("AbstractProject.WorkspaceTitle", arg1);
    }

    /**
     * Workspace of {0}
     * 
     */
    public static Localizable _AbstractProject_WorkspaceTitle(Object arg1) {
        return new Localizable(holder, "AbstractProject.WorkspaceTitle", arg1);
    }

    /**
     * No control code is allowed: {0}
     * 
     */
    public static String Hudson_ControlCodeNotAllowed(Object arg1) {
        return holder.format("Hudson.ControlCodeNotAllowed", arg1);
    }

    /**
     * No control code is allowed: {0}
     * 
     */
    public static Localizable _Hudson_ControlCodeNotAllowed(Object arg1) {
        return new Localizable(holder, "Hudson.ControlCodeNotAllowed", arg1);
    }

    /**
     * Invalid boolean expression: {0}
     * 
     */
    public static String AbstractProject_AssignedLabelString_InvalidBooleanExpression(Object arg1) {
        return holder.format("AbstractProject.AssignedLabelString.InvalidBooleanExpression", arg1);
    }

    /**
     * Invalid boolean expression: {0}
     * 
     */
    public static Localizable _AbstractProject_AssignedLabelString_InvalidBooleanExpression(Object arg1) {
        return new Localizable(holder, "AbstractProject.AssignedLabelString.InvalidBooleanExpression", arg1);
    }

    /**
     * Wait for a node to become offline.
     * 
     */
    public static String CLI_wait_node_offline_shortDescription() {
        return holder.format("CLI.wait-node-offline.shortDescription");
    }

    /**
     * Wait for a node to become offline.
     * 
     */
    public static Localizable _CLI_wait_node_offline_shortDescription() {
        return new Localizable(holder, "CLI.wait-node-offline.shortDescription");
    }

    /**
     * Not a positive number
     * 
     */
    public static String Hudson_NotAPositiveNumber() {
        return holder.format("Hudson.NotAPositiveNumber");
    }

    /**
     * Not a positive number
     * 
     */
    public static Localizable _Hudson_NotAPositiveNumber() {
        return new Localizable(holder, "Hudson.NotAPositiveNumber");
    }

    /**
     * Started by user {0}
     * 
     */
    public static String Cause_UserIdCause_ShortDescription(Object arg1) {
        return holder.format("Cause.UserIdCause.ShortDescription", arg1);
    }

    /**
     * Started by user {0}
     * 
     */
    public static Localizable _Cause_UserIdCause_ShortDescription(Object arg1) {
        return new Localizable(holder, "Cause.UserIdCause.ShortDescription", arg1);
    }

    /**
     * We need to schedule a new build to get a workspace, but deferring {0}ms in the hope that one will become available soon
     * 
     */
    public static String AbstractProject_AwaitingWorkspaceToComeOnline(Object arg1) {
        return holder.format("AbstractProject.AwaitingWorkspaceToComeOnline", arg1);
    }

    /**
     * We need to schedule a new build to get a workspace, but deferring {0}ms in the hope that one will become available soon
     * 
     */
    public static Localizable _AbstractProject_AwaitingWorkspaceToComeOnline(Object arg1) {
        return new Localizable(holder, "AbstractProject.AwaitingWorkspaceToComeOnline", arg1);
    }

    /**
     * Node is being removed
     * 
     */
    public static String Hudson_NodeBeingRemoved() {
        return holder.format("Hudson.NodeBeingRemoved");
    }

    /**
     * Node is being removed
     * 
     */
    public static Localizable _Hudson_NodeBeingRemoved() {
        return new Localizable(holder, "Hudson.NodeBeingRemoved");
    }

    /**
     * Downstream project {0} is already building.
     * 
     */
    public static String AbstractProject_DownstreamBuildInProgress(Object arg1) {
        return holder.format("AbstractProject.DownstreamBuildInProgress", arg1);
    }

    /**
     * Downstream project {0} is already building.
     * 
     */
    public static Localizable _AbstractProject_DownstreamBuildInProgress(Object arg1) {
        return new Localizable(holder, "AbstractProject.DownstreamBuildInProgress", arg1);
    }

    /**
     * Master
     * 
     */
    public static String Hudson_Computer_Caption() {
        return holder.format("Hudson.Computer.Caption");
    }

    /**
     * Master
     * 
     */
    public static Localizable _Hudson_Computer_Caption() {
        return new Localizable(holder, "Hudson.Computer.Caption");
    }

    /**
     * Aborted
     * 
     */
    public static String AbstractProject_Aborted() {
        return holder.format("AbstractProject.Aborted");
    }

    /**
     * Aborted
     * 
     */
    public static Localizable _AbstractProject_Aborted() {
        return new Localizable(holder, "AbstractProject.Aborted");
    }

    /**
     * Specify which slave to copy
     * 
     */
    public static String ComputerSet_SpecifySlaveToCopy() {
        return holder.format("ComputerSet.SpecifySlaveToCopy");
    }

    /**
     * Specify which slave to copy
     * 
     */
    public static Localizable _ComputerSet_SpecifySlaveToCopy() {
        return new Localizable(holder, "ComputerSet.SpecifySlaveToCopy");
    }

    /**
     * Files in this directory will be served under your http://server/jenkins/userContent/
     * 
     */
    public static String Hudson_USER_CONTENT_README() {
        return holder.format("Hudson.USER_CONTENT_README");
    }

    /**
     * Files in this directory will be served under your http://server/jenkins/userContent/
     * 
     */
    public static Localizable _Hudson_USER_CONTENT_README() {
        return new Localizable(holder, "Hudson.USER_CONTENT_README");
    }

    /**
     * Your container doesn’t use UTF-8 to decode URLs. If you use non-ASCII characters as a job name etc, this will cause problems. See &lt;a href="http://wiki.jenkins-ci.org/display/JENKINS/Containers">Containers&lt;/a> and &lt;a href="http://wiki.jenkins-ci.org/display/JENKINS/Tomcat#Tomcat-i18n">Tomcat i18n&lt;/a> for more details.
     * 
     */
    public static String Hudson_NotUsesUTF8ToDecodeURL() {
        return holder.format("Hudson.NotUsesUTF8ToDecodeURL");
    }

    /**
     * Your container doesn’t use UTF-8 to decode URLs. If you use non-ASCII characters as a job name etc, this will cause problems. See &lt;a href="http://wiki.jenkins-ci.org/display/JENKINS/Containers">Containers&lt;/a> and &lt;a href="http://wiki.jenkins-ci.org/display/JENKINS/Tomcat#Tomcat-i18n">Tomcat i18n&lt;/a> for more details.
     * 
     */
    public static Localizable _Hudson_NotUsesUTF8ToDecodeURL() {
        return new Localizable(holder, "Hudson.NotUsesUTF8ToDecodeURL");
    }

    /**
     * No such directory: {0}
     * 
     */
    public static String Hudson_NoSuchDirectory(Object arg1) {
        return holder.format("Hudson.NoSuchDirectory", arg1);
    }

    /**
     * No such directory: {0}
     * 
     */
    public static Localizable _Hudson_NoSuchDirectory(Object arg1) {
        return new Localizable(holder, "Hudson.NoSuchDirectory", arg1);
    }

    /**
     * Restart Jenkins
     * 
     */
    public static String CLI_restart_shortDescription() {
        return holder.format("CLI.restart.shortDescription");
    }

    /**
     * Restart Jenkins
     * 
     */
    public static Localizable _CLI_restart_shortDescription() {
        return new Localizable(holder, "CLI.restart.shortDescription");
    }

    /**
     * Monitor an external job
     * 
     */
    public static String ExternalJob_DisplayName() {
        return holder.format("ExternalJob.DisplayName");
    }

    /**
     * Monitor an external job
     * 
     */
    public static Localizable _ExternalJob_DisplayName() {
        return new Localizable(holder, "ExternalJob.DisplayName");
    }

    /**
     * Page Decorators
     * 
     */
    public static String UpdateCenter_PluginCategory_page_decorator() {
        return holder.format("UpdateCenter.PluginCategory.page-decorator");
    }

    /**
     * Page Decorators
     * 
     */
    public static Localizable _UpdateCenter_PluginCategory_page_decorator() {
        return new Localizable(holder, "UpdateCenter.PluginCategory.page-decorator");
    }

    /**
     * This permission allows users to create new views.
     * 
     */
    public static String View_CreatePermission_Description() {
        return holder.format("View.CreatePermission.Description");
    }

    /**
     * This permission allows users to create new views.
     * 
     */
    public static Localizable _View_CreatePermission_Description() {
        return new Localizable(holder, "View.CreatePermission.Description");
    }

    /**
     * Change the configuration of a job.
     * 
     */
    public static String Item_CONFIGURE_description() {
        return holder.format("Item.CONFIGURE.description");
    }

    /**
     * Change the configuration of a job.
     * 
     */
    public static Localizable _Item_CONFIGURE_description() {
        return new Localizable(holder, "Item.CONFIGURE.description");
    }

    /**
     * This permission grants the ability to start a new build.
     * 
     */
    public static String AbstractProject_BuildPermission_Description() {
        return holder.format("AbstractProject.BuildPermission.Description");
    }

    /**
     * This permission grants the ability to start a new build.
     * 
     */
    public static Localizable _AbstractProject_BuildPermission_Description() {
        return new Localizable(holder, "AbstractProject.BuildPermission.Description");
    }

    /**
     * Stop using a node for performing builds temporarily, until the next "online-node" command.
     * 
     */
    public static String CLI_offline_node_shortDescription() {
        return holder.format("CLI.offline-node.shortDescription");
    }

    /**
     * Stop using a node for performing builds temporarily, until the next "online-node" command.
     * 
     */
    public static Localizable _CLI_offline_node_shortDescription() {
        return new Localizable(holder, "CLI.offline-node.shortDescription");
    }

    /**
     * SCM check out aborted
     * 
     */
    public static String AbstractProject_ScmAborted() {
        return holder.format("AbstractProject.ScmAborted");
    }

    /**
     * SCM check out aborted
     * 
     */
    public static Localizable _AbstractProject_ScmAborted() {
        return new Localizable(holder, "AbstractProject.ScmAborted");
    }

    /**
     * Slave
     * 
     */
    public static String Computer_Permissions_Title() {
        return holder.format("Computer.Permissions.Title");
    }

    /**
     * Slave
     * 
     */
    public static Localizable _Computer_Permissions_Title() {
        return new Localizable(holder, "Computer.Permissions.Title");
    }

    /**
     * ‘{0}’ is an unsafe character
     * 
     */
    public static String Hudson_UnsafeChar(Object arg1) {
        return holder.format("Hudson.UnsafeChar", arg1);
    }

    /**
     * ‘{0}’ is an unsafe character
     * 
     */
    public static Localizable _Hudson_UnsafeChar(Object arg1) {
        return new Localizable(holder, "Hudson.UnsafeChar", arg1);
    }

    /**
     * My View
     * 
     */
    public static String MyView_DisplayName() {
        return holder.format("MyView.DisplayName");
    }

    /**
     * My View
     * 
     */
    public static Localizable _MyView_DisplayName() {
        return new Localizable(holder, "MyView.DisplayName");
    }

    /**
     * Artifact Uploaders
     * 
     */
    public static String UpdateCenter_PluginCategory_upload() {
        return holder.format("UpdateCenter.PluginCategory.upload");
    }

    /**
     * Artifact Uploaders
     * 
     */
    public static Localizable _UpdateCenter_PluginCategory_upload() {
        return new Localizable(holder, "UpdateCenter.PluginCategory.upload");
    }

    /**
     * Checking update center connectivity
     * 
     */
    public static String UpdateCenter_Status_CheckingJavaNet() {
        return holder.format("UpdateCenter.Status.CheckingJavaNet");
    }

    /**
     * Checking update center connectivity
     * 
     */
    public static Localizable _UpdateCenter_Status_CheckingJavaNet() {
        return new Localizable(holder, "UpdateCenter.Status.CheckingJavaNet");
    }

    /**
     * Quiet down Jenkins, in preparation for a restart. Don’t start any builds.
     * 
     */
    public static String CLI_quiet_down_shortDescription() {
        return holder.format("CLI.quiet-down.shortDescription");
    }

    /**
     * Quiet down Jenkins, in preparation for a restart. Don’t start any builds.
     * 
     */
    public static Localizable _CLI_quiet_down_shortDescription() {
        return new Localizable(holder, "CLI.quiet-down.shortDescription");
    }

    /**
     * Initialing update center
     * 
     */
    public static String UpdateCenter_init() {
        return holder.format("UpdateCenter.init");
    }

    /**
     * Initialing update center
     * 
     */
    public static Localizable _UpdateCenter_init() {
        return new Localizable(holder, "UpdateCenter.init");
    }

    /**
     * Safely restart Jenkins
     * 
     */
    public static String CLI_safe_restart_shortDescription() {
        return holder.format("CLI.safe-restart.shortDescription");
    }

    /**
     * Safely restart Jenkins
     * 
     */
    public static Localizable _CLI_safe_restart_shortDescription() {
        return new Localizable(holder, "CLI.safe-restart.shortDescription");
    }

    /**
     * Project
     * 
     */
    public static String AbstractProject_Pronoun() {
        return holder.format("AbstractProject.Pronoun");
    }

    /**
     * Project
     * 
     */
    public static Localizable _AbstractProject_Pronoun() {
        return new Localizable(holder, "AbstractProject.Pronoun");
    }

    /**
     * Global view {0} does not exist
     * 
     */
    public static String ProxyView_NoSuchViewExists(Object arg1) {
        return holder.format("ProxyView.NoSuchViewExists", arg1);
    }

    /**
     * Global view {0} does not exist
     * 
     */
    public static Localizable _ProxyView_NoSuchViewExists(Object arg1) {
        return new Localizable(holder, "ProxyView.NoSuchViewExists", arg1);
    }

    /**
     * mins
     * 
     */
    public static String Job_minutes() {
        return holder.format("Job.minutes");
    }

    /**
     * mins
     * 
     */
    public static Localizable _Job_minutes() {
        return new Localizable(holder, "Job.minutes");
    }

    /**
     * Freestyle project
     * 
     */
    public static String FreeStyleProject_DisplayName() {
        return holder.format("FreeStyleProject.DisplayName");
    }

    /**
     * Freestyle project
     * 
     */
    public static Localizable _FreeStyleProject_DisplayName() {
        return new Localizable(holder, "FreeStyleProject.DisplayName");
    }

    /**
     * Unable to launch the slave agent for {0}{1}
     * 
     */
    public static String Slave_UnableToLaunch(Object arg1, Object arg2) {
        return holder.format("Slave.UnableToLaunch", arg1, arg2);
    }

    /**
     * Unable to launch the slave agent for {0}{1}
     * 
     */
    public static Localizable _Slave_UnableToLaunch(Object arg1, Object arg2) {
        return new Localizable(holder, "Slave.UnableToLaunch", arg1, arg2);
    }

    /**
     * Deletes a job.
     * 
     */
    public static String CLI_delete_job_shortDescription() {
        return holder.format("CLI.delete-job.shortDescription");
    }

    /**
     * Deletes a job.
     * 
     */
    public static Localizable _CLI_delete_job_shortDescription() {
        return new Localizable(holder, "CLI.delete-job.shortDescription");
    }

    /**
     * Success
     * 
     */
    public static String UpdateCenter_Status_Success() {
        return holder.format("UpdateCenter.Status.Success");
    }

    /**
     * Success
     * 
     */
    public static Localizable _UpdateCenter_Status_Success() {
        return new Localizable(holder, "UpdateCenter.Status.Success");
    }

    /**
     * 
     * 
     */
    public static String MultiStageTimeSeries_EMPTY_STRING() {
        return holder.format("MultiStageTimeSeries.EMPTY_STRING");
    }

    /**
     * 
     * 
     */
    public static Localizable _MultiStageTimeSeries_EMPTY_STRING() {
        return new Localizable(holder, "MultiStageTimeSeries.EMPTY_STRING");
    }

    /**
     * In progress
     * 
     */
    public static String BallColor_InProgress() {
        return holder.format("BallColor.InProgress");
    }

    /**
     * In progress
     * 
     */
    public static Localizable _BallColor_InProgress() {
        return new Localizable(holder, "BallColor.InProgress");
    }

    /**
     * A view with name {0} does not exist
     * 
     */
    public static String MyViewsProperty_ViewExistsCheck_NotExist(Object arg1) {
        return holder.format("MyViewsProperty.ViewExistsCheck.NotExist", arg1);
    }

    /**
     * A view with name {0} does not exist
     * 
     */
    public static Localizable _MyViewsProperty_ViewExistsCheck_NotExist(Object arg1) {
        return new Localizable(holder, "MyViewsProperty.ViewExistsCheck.NotExist", arg1);
    }

    /**
     * {0} doesn’t have label {1}
     * 
     */
    public static String Node_LabelMissing(Object arg1, Object arg2) {
        return holder.format("Node.LabelMissing", arg1, arg2);
    }

    /**
     * {0} doesn’t have label {1}
     * 
     */
    public static Localizable _Node_LabelMissing(Object arg1, Object arg2) {
        return new Localizable(holder, "Node.LabelMissing", arg1, arg2);
    }

    /**
     * ???
     * 
     */
    public static String Queue_Unknown() {
        return holder.format("Queue.Unknown");
    }

    /**
     * ???
     * 
     */
    public static Localizable _Queue_Unknown() {
        return new Localizable(holder, "Queue.Unknown");
    }

    /**
     * File Parameter
     * 
     */
    public static String FileParameterDefinition_DisplayName() {
        return holder.format("FileParameterDefinition.DisplayName");
    }

    /**
     * File Parameter
     * 
     */
    public static Localizable _FileParameterDefinition_DisplayName() {
        return new Localizable(holder, "FileParameterDefinition.DisplayName");
    }

    /**
     * This permission grants read-only access to project configurations. Please be aware that sensitive information in your builds, such as passwords, will be exposed to a wider audience by granting this permission.
     * 
     */
    public static String AbstractProject_ExtendedReadPermission_Description() {
        return holder.format("AbstractProject.ExtendedReadPermission.Description");
    }

    /**
     * This permission grants read-only access to project configurations. Please be aware that sensitive information in your builds, such as passwords, will be exposed to a wider audience by granting this permission.
     * 
     */
    public static Localizable _AbstractProject_ExtendedReadPermission_Description() {
        return new Localizable(holder, "AbstractProject.ExtendedReadPermission.Description");
    }

    /**
     * Now unstable
     * 
     */
    public static String ResultTrend_NowUnstable() {
        return holder.format("ResultTrend.NowUnstable");
    }

    /**
     * Now unstable
     * 
     */
    public static Localizable _ResultTrend_NowUnstable() {
        return new Localizable(holder, "ResultTrend.NowUnstable");
    }

    /**
     * Restoring the build queue
     * 
     */
    public static String Queue_init() {
        return holder.format("Queue.init");
    }

    /**
     * Restoring the build queue
     * 
     */
    public static Localizable _Queue_init() {
        return new Localizable(holder, "Queue.init");
    }

    /**
     * Password Parameter
     * 
     */
    public static String PasswordParameterDefinition_DisplayName() {
        return holder.format("PasswordParameterDefinition.DisplayName");
    }

    /**
     * Password Parameter
     * 
     */
    public static Localizable _PasswordParameterDefinition_DisplayName() {
        return new Localizable(holder, "PasswordParameterDefinition.DisplayName");
    }

    /**
     * Miscellaneous
     * 
     */
    public static String UpdateCenter_PluginCategory_misc() {
        return holder.format("UpdateCenter.PluginCategory.misc");
    }

    /**
     * Miscellaneous
     * 
     */
    public static Localizable _UpdateCenter_PluginCategory_misc() {
        return new Localizable(holder, "UpdateCenter.PluginCategory.misc");
    }

    /**
     * Jenkins is restarting
     * 
     */
    public static String Jenkins_IsRestarting() {
        return holder.format("Jenkins.IsRestarting");
    }

    /**
     * Jenkins is restarting
     * 
     */
    public static Localizable _Jenkins_IsRestarting() {
        return new Localizable(holder, "Jenkins.IsRestarting");
    }

    /**
     * Cancel the effect of the "quiet-down" command.
     * 
     */
    public static String CLI_cancel_quiet_down_shortDescription() {
        return holder.format("CLI.cancel-quiet-down.shortDescription");
    }

    /**
     * Cancel the effect of the "quiet-down" command.
     * 
     */
    public static Localizable _CLI_cancel_quiet_down_shortDescription() {
        return new Localizable(holder, "CLI.cancel-quiet-down.shortDescription");
    }

    /**
     * Legacy code started this job.  No cause information is available
     * 
     */
    public static String Cause_LegacyCodeCause_ShortDescription() {
        return holder.format("Cause.LegacyCodeCause.ShortDescription");
    }

    /**
     * Legacy code started this job.  No cause information is available
     * 
     */
    public static Localizable _Cause_LegacyCodeCause_ShortDescription() {
        return new Localizable(holder, "Cause.LegacyCodeCause.ShortDescription");
    }

    /**
     * This permission grants discover access to jobs. Lower than read permissions, it allows you to redirect anonymous users to the login page when they try to access a job url. Without it they would get a 404 error and wouldn't be able to discover project names.
     * 
     */
    public static String AbstractProject_DiscoverPermission_Description() {
        return holder.format("AbstractProject.DiscoverPermission.Description");
    }

    /**
     * This permission grants discover access to jobs. Lower than read permissions, it allows you to redirect anonymous users to the login page when they try to access a job url. Without it they would get a 404 error and wouldn't be able to discover project names.
     * 
     */
    public static Localizable _AbstractProject_DiscoverPermission_Description() {
        return new Localizable(holder, "AbstractProject.DiscoverPermission.Description");
    }

    /**
     * No such job ‘{0}’ exists. Perhaps you meant ‘{1}’?
     * 
     */
    public static String AbstractItem_NoSuchJobExists(Object arg1, Object arg2) {
        return holder.format("AbstractItem.NoSuchJobExists", arg1, arg2);
    }

    /**
     * No such job ‘{0}’ exists. Perhaps you meant ‘{1}’?
     * 
     */
    public static Localizable _AbstractItem_NoSuchJobExists(Object arg1, Object arg2) {
        return new Localizable(holder, "AbstractItem.NoSuchJobExists", arg1, arg2);
    }

    /**
     * This permission allows users to disconnect slaves or mark slaves as temporarily offline.
     * 
     */
    public static String Computer_DisconnectPermission_Description() {
        return holder.format("Computer.DisconnectPermission.Description");
    }

    /**
     * This permission allows users to disconnect slaves or mark slaves as temporarily offline.
     * 
     */
    public static Localizable _Computer_DisconnectPermission_Description() {
        return new Localizable(holder, "Computer.DisconnectPermission.Description");
    }

    /**
     * Build Notifiers
     * 
     */
    public static String UpdateCenter_PluginCategory_notifier() {
        return holder.format("UpdateCenter.PluginCategory.notifier");
    }

    /**
     * Build Notifiers
     * 
     */
    public static Localizable _UpdateCenter_PluginCategory_notifier() {
        return new Localizable(holder, "UpdateCenter.PluginCategory.notifier");
    }

    /**
     * broken for a long time
     * 
     */
    public static String Run_Summary_BrokenForALongTime() {
        return holder.format("Run.Summary.BrokenForALongTime");
    }

    /**
     * broken for a long time
     * 
     */
    public static Localizable _Run_Summary_BrokenForALongTime() {
        return new Localizable(holder, "Run.Summary.BrokenForALongTime");
    }

    /**
     * No such slave: {0}
     * 
     */
    public static String ComputerSet_NoSuchSlave(Object arg1) {
        return holder.format("ComputerSet.NoSuchSlave", arg1);
    }

    /**
     * No such slave: {0}
     * 
     */
    public static Localizable _ComputerSet_NoSuchSlave(Object arg1) {
        return new Localizable(holder, "ComputerSet.NoSuchSlave", arg1);
    }

    /**
     * Only build jobs with label restrictions matching this node
     * 
     */
    public static String Node_Mode_EXCLUSIVE() {
        return holder.format("Node.Mode.EXCLUSIVE");
    }

    /**
     * Only build jobs with label restrictions matching this node
     * 
     */
    public static Localizable _Node_Mode_EXCLUSIVE() {
        return new Localizable(holder, "Node.Mode.EXCLUSIVE");
    }

    /**
     * The display name, "{0}", is used as a name by a job and could cause confusing search results.
     * 
     */
    public static String Jenkins_CheckDisplayName_NameNotUniqueWarning(Object arg1) {
        return holder.format("Jenkins.CheckDisplayName.NameNotUniqueWarning", arg1);
    }

    /**
     * The display name, "{0}", is used as a name by a job and could cause confusing search results.
     * 
     */
    public static Localizable _Jenkins_CheckDisplayName_NameNotUniqueWarning(Object arg1) {
        return new Localizable(holder, "Jenkins.CheckDisplayName.NameNotUniqueWarning", arg1);
    }

    /**
     * Command Line Interface
     * 
     */
    public static String UpdateCenter_PluginCategory_cli() {
        return holder.format("UpdateCenter.PluginCategory.cli");
    }

    /**
     * Command Line Interface
     * 
     */
    public static Localizable _UpdateCenter_PluginCategory_cli() {
        return new Localizable(holder, "UpdateCenter.PluginCategory.cli");
    }

    /**
     * Reconnect to a node.
     * 
     */
    public static String CLI_connect_node_shortDescription() {
        return holder.format("CLI.connect-node.shortDescription");
    }

    /**
     * Reconnect to a node.
     * 
     */
    public static Localizable _CLI_connect_node_shortDescription() {
        return new Localizable(holder, "CLI.connect-node.shortDescription");
    }

    /**
     * N/A
     * 
     */
    public static String Executor_NotAvailable() {
        return holder.format("Executor.NotAvailable");
    }

    /**
     * N/A
     * 
     */
    public static Localizable _Executor_NotAvailable() {
        return new Localizable(holder, "Executor.NotAvailable");
    }

    /**
     * No name is specified
     * 
     */
    public static String Hudson_NoName() {
        return holder.format("Hudson.NoName");
    }

    /**
     * No name is specified
     * 
     */
    public static Localizable _Hudson_NoName() {
        return new Localizable(holder, "Hudson.NoName");
    }

    /**
     * (from &lt;a href="{1}">{0}&lt;/a>)
     * 
     */
    public static String Descriptor_From(Object arg1, Object arg2) {
        return holder.format("Descriptor.From", arg1, arg2);
    }

    /**
     * (from &lt;a href="{1}">{0}&lt;/a>)
     * 
     */
    public static Localizable _Descriptor_From(Object arg1, Object arg2) {
        return new Localizable(holder, "Descriptor.From", arg1, arg2);
    }

    /**
     * A view with name {0} already exists
     * 
     */
    public static String MyViewsProperty_ViewExistsCheck_AlreadyExists(Object arg1) {
        return holder.format("MyViewsProperty.ViewExistsCheck.AlreadyExists", arg1);
    }

    /**
     * A view with name {0} already exists
     * 
     */
    public static Localizable _MyViewsProperty_ViewExistsCheck_AlreadyExists(Object arg1) {
        return new Localizable(holder, "MyViewsProperty.ViewExistsCheck.AlreadyExists", arg1);
    }

    /**
     * not built
     * 
     */
    public static String Run_Summary_NotBuilt() {
        return holder.format("Run.Summary.NotBuilt");
    }

    /**
     * not built
     * 
     */
    public static Localizable _Run_Summary_NotBuilt() {
        return new Localizable(holder, "Run.Summary.NotBuilt");
    }

    /**
     * View
     * 
     */
    public static String View_Permissions_Title() {
        return holder.format("View.Permissions.Title");
    }

    /**
     * View
     * 
     */
    public static Localizable _View_Permissions_Title() {
        return new Localizable(holder, "View.Permissions.Title");
    }

    /**
     * Remote directory is mandatory
     * 
     */
    public static String Slave_Remote_Director_Mandatory() {
        return holder.format("Slave.Remote.Director.Mandatory");
    }

    /**
     * Remote directory is mandatory
     * 
     */
    public static Localizable _Slave_Remote_Director_Mandatory() {
        return new Localizable(holder, "Slave.Remote.Director.Mandatory");
    }

    /**
     * 
     * 
     */
    public static String HealthReport_EmptyString() {
        return holder.format("HealthReport.EmptyString");
    }

    /**
     * 
     * 
     */
    public static Localizable _HealthReport_EmptyString() {
        return new Localizable(holder, "HealthReport.EmptyString");
    }

    /**
     * nodes
     * 
     */
    public static String ComputerSet_DisplayName() {
        return holder.format("ComputerSet.DisplayName");
    }

    /**
     * nodes
     * 
     */
    public static Localizable _ComputerSet_DisplayName() {
        return new Localizable(holder, "ComputerSet.DisplayName");
    }

    /**
     * Waiting for next available executor
     * 
     */
    public static String Queue_WaitingForNextAvailableExecutor() {
        return holder.format("Queue.WaitingForNextAvailableExecutor");
    }

    /**
     * Waiting for next available executor
     * 
     */
    public static Localizable _Queue_WaitingForNextAvailableExecutor() {
        return new Localizable(holder, "Queue.WaitingForNextAvailableExecutor");
    }

    
  }
