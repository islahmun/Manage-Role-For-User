package entity;

import org.eclipse.persistence.jpa.jpql.parser.DateTime;

import sun.security.x509.UniqueIdentity;

public class Role {
 
	private String roleUID;	
	private int fgRoleType;
	private int intCompanyID;
	private String roleCode;   
	private String roleName;  
	private int intEmpGradeFrom;
	private int intEmpGradeTo;
	private int fgRoleStatus;                                      
	private int fgDeleted; 
	private String NEW_RoleCode;
	private String NEW_RoleName;                                       
	private int NEW_IntEmpGradeFrom;
	private int NEW_IntEmpGradeTo;
	private int NEW_FgRoleStatus;                                      
	private int NEW_FgDeleted;
	private int fgFlowStatus;
	private int fgIsNew;
	private String submitDescription;                                                                                                                                                                                                                                              
	private String rejectDescription;                                                                                                                                                                                                                                                
	private DateTime timeCreate;             
	private String userCreate;                                                                                         
	private DateTime  timeLastUpdate;         
	private String userLastUpdate;                                                                                       
	private DateTime timeBeginJob;            
	private String userBeginJob;                                                                                       
	private DateTime timeSubmit;              
	private String userSubmit;                                                                                         
	private DateTime timeLastApprove;         
	private String userLastApprove;                                                                                    
	private int methodLastApprove;
	
	public String getRoleUID() {
		return roleUID;
	}
	public void setRoleUID(String roleUID) {
		this.roleUID = roleUID;
	}
	public int getFgRoleType() {
		return fgRoleType;
	}
	public void setFgRoleType(int fgRoleType) {
		this.fgRoleType = fgRoleType;
	}
	public int getIntCompanyID() {
		return intCompanyID;
	}
	public void setIntCompanyID(int intCompanyID) {
		this.intCompanyID = intCompanyID;
	}
	public String getRoleCode() {
		return roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public int getIntEmpGradeFrom() {
		return intEmpGradeFrom;
	}
	public void setIntEmpGradeFrom(int intEmpGradeFrom) {
		this.intEmpGradeFrom = intEmpGradeFrom;
	}
	public int getIntEmpGradeTo() {
		return intEmpGradeTo;
	}
	public void setIntEmpGradeTo(int intEmpGradeTo) {
		this.intEmpGradeTo = intEmpGradeTo;
	}
	public int getFgRoleStatus() {
		return fgRoleStatus;
	}
	public void setFgRoleStatus(int fgRoleStatus) {
		this.fgRoleStatus = fgRoleStatus;
	}
	public int getFgDeleted() {
		return fgDeleted;
	}
	public void setFgDeleted(int fgDeleted) {
		this.fgDeleted = fgDeleted;
	}
	public String getNEW_RoleCode() {
		return NEW_RoleCode;
	}
	public void setNEW_RoleCode(String nEW_RoleCode) {
		NEW_RoleCode = nEW_RoleCode;
	}
	public String getNEW_RoleName() {
		return NEW_RoleName;
	}
	public void setNEW_RoleName(String nEW_RoleName) {
		NEW_RoleName = nEW_RoleName;
	}
	public int getNEW_IntEmpGradeFrom() {
		return NEW_IntEmpGradeFrom;
	}
	public void setNEW_IntEmpGradeFrom(int nEW_IntEmpGradeFrom) {
		NEW_IntEmpGradeFrom = nEW_IntEmpGradeFrom;
	}
	public int getNEW_IntEmpGradeTo() {
		return NEW_IntEmpGradeTo;
	}
	public void setNEW_IntEmpGradeTo(int nEW_IntEmpGradeTo) {
		NEW_IntEmpGradeTo = nEW_IntEmpGradeTo;
	}
	public int getNEW_FgRoleStatus() {
		return NEW_FgRoleStatus;
	}
	public void setNEW_FgRoleStatus(int nEW_FgRoleStatus) {
		NEW_FgRoleStatus = nEW_FgRoleStatus;
	}
	public int getNEW_FgDeleted() {
		return NEW_FgDeleted;
	}
	public void setNEW_FgDeleted(int nEW_FgDeleted) {
		NEW_FgDeleted = nEW_FgDeleted;
	}
	public int getFgFlowStatus() {
		return fgFlowStatus;
	}
	public void setFgFlowStatus(int fgFlowStatus) {
		this.fgFlowStatus = fgFlowStatus;
	}
	public int getFgIsNew() {
		return fgIsNew;
	}
	public void setFgIsNew(int fgIsNew) {
		this.fgIsNew = fgIsNew;
	}
	public String getSubmitDescription() {
		return submitDescription;
	}
	public void setSubmitDescription(String submitDescription) {
		this.submitDescription = submitDescription;
	}
	public String getRejectDescription() {
		return rejectDescription;
	}
	public void setRejectDescription(String rejectDescription) {
		this.rejectDescription = rejectDescription;
	}
	public DateTime getTimeCreate() {
		return timeCreate;
	}
	public void setTimeCreate(DateTime timeCreate) {
		this.timeCreate = timeCreate;
	}
	public String getUserCreate() {
		return userCreate;
	}
	public void setUserCreate(String userCreate) {
		this.userCreate = userCreate;
	}
	public DateTime getTimeLastUpdate() {
		return timeLastUpdate;
	}
	public void setTimeLastUpdate(DateTime timeLastUpdate) {
		this.timeLastUpdate = timeLastUpdate;
	}
	public String getUserLastUpdate() {
		return userLastUpdate;
	}
	public void setUserLastUpdate(String userLastUpdate) {
		this.userLastUpdate = userLastUpdate;
	}
	public DateTime getTimeBeginJob() {
		return timeBeginJob;
	}
	public void setTimeBeginJob(DateTime timeBeginJob) {
		this.timeBeginJob = timeBeginJob;
	}
	public String getUserBeginJob() {
		return userBeginJob;
	}
	public void setUserBeginJob(String userBeginJob) {
		this.userBeginJob = userBeginJob;
	}
	public DateTime getTimeSubmit() {
		return timeSubmit;
	}
	public void setTimeSubmit(DateTime timeSubmit) {
		this.timeSubmit = timeSubmit;
	}
	public String getUserSubmit() {
		return userSubmit;
	}
	public void setUserSubmit(String userSubmit) {
		this.userSubmit = userSubmit;
	}
	public DateTime getTimeLastApprove() {
		return timeLastApprove;
	}
	public void setTimeLastApprove(DateTime timeLastApprove) {
		this.timeLastApprove = timeLastApprove;
	}
	public String getUserLastApprove() {
		return userLastApprove;
	}
	public void setUserLastApprove(String userLastApprove) {
		this.userLastApprove = userLastApprove;
	}
	public int getMethodLastApprove() {
		return methodLastApprove;
	}
	public void setMethodLastApprove(int methodLastApprove) {
		this.methodLastApprove = methodLastApprove;
	}
	
	
}
