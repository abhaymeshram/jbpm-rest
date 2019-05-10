package org.jbpm.models;

import java.io.Serializable;

public class JBPMDataModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String dbUserName;
	private String dbPassword;
	private String dbName;
	private String dbHost;
	private String dbPort;
	private String sqlStatement;

	private String jBPMProcessKey;
	private String jBPMIP;
	private String jBPMPort;
	private String jBPMUserName;
	private String jBPMPassword;
	private String jBPMProcessDefinitionID;
	private String jBPMDeploymentID;
	

	public String getjBPMProcessDefinitionID() {
		return jBPMProcessDefinitionID;
	}


	public void setjBPMProcessDefinitionID(String jBPMProcessDefinitionID) {
		this.jBPMProcessDefinitionID = jBPMProcessDefinitionID;
	}


	public String getjBPMDeploymentID() {
		return jBPMDeploymentID;
	}


	public void setjBPMDeploymentID(String jBPMDeploymentID) {
		this.jBPMDeploymentID = jBPMDeploymentID;
	}


	public JBPMDataModel() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getDbUserName() {
		return dbUserName;
	}

	public void setDbUserName(String dbUserName) {
		this.dbUserName = dbUserName;
	}

	public String getDbPassword() {
		return dbPassword;
	}

	public String getSqlStatement() {
		return sqlStatement;
	}

	public void setSqlStatement(String sqlStatement) {
		this.sqlStatement = sqlStatement;
	}

	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getDbHost() {
		return dbHost;
	}

	public void setDbHost(String dbHost) {
		this.dbHost = dbHost;
	}

	public String getDbPort() {
		return dbPort;
	}

	public void setDbPort(String dbPort) {
		this.dbPort = dbPort;
	}

	public String getjBPMProcessKey() {
		return jBPMProcessKey;
	}

	public void setjBPMProcessKey(String jBPMProcessKey) {
		this.jBPMProcessKey = jBPMProcessKey;
	}

	public String getjBPMIP() {
		return jBPMIP;
	}

	public void setjBPMIP(String jBPMIP) {
		this.jBPMIP = jBPMIP;
	}

	public String getjBPMPort() {
		return jBPMPort;
	}

	public void setjBPMPort(String jBPMPort) {
		this.jBPMPort = jBPMPort;
	}

	public String getjBPMUserName() {
		return jBPMUserName;
	}

	public void setjBPMUserName(String jBPMUserName) {
		this.jBPMUserName = jBPMUserName;
	}

	public String getjBPMPassword() {
		return jBPMPassword;
	}

	public void setjBPMPassword(String jBPMPassword) {
		this.jBPMPassword = jBPMPassword;
	}


	@Override
	public String toString() {
		return "JBPMDataModel [dbUserName=" + dbUserName + ", dbPassword=" + dbPassword + ", dbName=" + dbName
				+ ", dbHost=" + dbHost + ", dbPort=" + dbPort + ", sqlStatement=" + sqlStatement + ", jBPMProcessKey="
				+ jBPMProcessKey + ", jBPMIP=" + jBPMIP + ", jBPMPort=" + jBPMPort + ", jBPMUserName=" + jBPMUserName
				+ ", jBPMPassword=" + jBPMPassword + ", jBPMProcessDefinitionID=" + jBPMProcessDefinitionID
				+ ", jBPMDeploymentID=" + jBPMDeploymentID + "]";
	}


	public JBPMDataModel(String dbUserName, String dbPassword, String dbName, String dbHost, String dbPort,
			String sqlStatement, String jBPMProcessKey, String jBPMIP, String jBPMPort, String jBPMUserName,
			String jBPMPassword, String jBPMProcessDefinitionID, String jBPMDeploymentID) {
		super();
		this.dbUserName = dbUserName;
		this.dbPassword = dbPassword;
		this.dbName = dbName;
		this.dbHost = dbHost;
		this.dbPort = dbPort;
		this.sqlStatement = sqlStatement;
		this.jBPMProcessKey = jBPMProcessKey;
		this.jBPMIP = jBPMIP;
		this.jBPMPort = jBPMPort;
		this.jBPMUserName = jBPMUserName;
		this.jBPMPassword = jBPMPassword;
		this.jBPMProcessDefinitionID = jBPMProcessDefinitionID;
		this.jBPMDeploymentID = jBPMDeploymentID;
	}


}
