package org.jbpm.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jbpm.models.JBPMDataModel;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class JBPMService {
	// jdbc:mysql://localhost:3306/JDBCDemo
	public  Map<String,String> startProcess(JBPMDataModel dataModel) {
		List<String> shopIds = fetchShopIdFromDB(dataModel);
		Map<String,String> processIds = new HashMap<>();
		if (shopIds == null || shopIds.size() == 0){
			return processIds;
		}
		for (String shopId : shopIds) {
			// http://localhost:8080/kie-server/services/rest/server/containers/SampleDoc_1.0.0/processes/com.myspace.WFDocument/instances
			String jbpmURL = "http://" + dataModel.getjBPMIP() + ":" + dataModel.getjBPMPort()
					+ "/kie-server/services/rest/server/containers/" + dataModel.getjBPMDeploymentID() + "/processes/"
					+ dataModel.getjBPMProcessDefinitionID() + "/instances";

			RestTemplate restTemplate = new RestTemplate();

			HttpHeaders headers = new HttpHeaders();
			headers.setBasicAuth(dataModel.getjBPMUserName(), dataModel.getjBPMPassword());
			headers.setContentType(MediaType.APPLICATION_JSON);

			Map<String, String> map = new HashMap<String, String>();
			map.put(dataModel.getjBPMProcessKey(), shopId);

			HttpEntity<Map<String, String>> request = new HttpEntity<Map<String, String>>(map, headers);

			ResponseEntity<String> response = restTemplate.postForEntity(jbpmURL, request, String.class);
			System.out.println("Output is: " + response.getBody());
			processIds.put(response.getBody(), shopId);
		}
		return processIds;
	}

	public static void main(String[] args) {
		JBPMDataModel jbpm = new JBPMDataModel();
		JBPMService jbpmService = new JBPMService();
		jbpm.setjBPMDeploymentID("SampleDoc_1.0.0");
		jbpm.setjBPMIP("localhost");
		jbpm.setjBPMPort("8080");
		jbpm.setjBPMPassword("krisv");
		jbpm.setjBPMUserName("krisv");
		jbpm.setjBPMProcessKey("shopId");
		jbpm.setjBPMProcessDefinitionID("com.myspace.WFDocument");
		jbpmService.startProcess(jbpm);
	}

	private List<String> fetchShopIdFromDB(JBPMDataModel dataModel) {
		List<String> shopIds = new ArrayList<>();
		String dbURL = "jdbc:mysql://" + dataModel.getDbHost() + ":" + dataModel.getDbPort() + "/"
				+ dataModel.getDbName();
		System.out.println("Database URL is: " + dbURL);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try (Connection connection = DriverManager.getConnection(dbURL, dataModel.getDbUserName(),
				dataModel.getDbPassword());
				Statement selectStmt = connection.createStatement();
				ResultSet rs = selectStmt.executeQuery(dataModel.getSqlStatement());) {
			while (rs.next()) {
				shopIds.add(rs.getString(1));
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("List of shop ids: " + shopIds);
		return shopIds;
	}
}
