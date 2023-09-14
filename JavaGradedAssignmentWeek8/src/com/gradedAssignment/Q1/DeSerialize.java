package com.gradedAssignment.Q1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Map;

public class DeSerialize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		String filePath = "D:/Serialize.txt";

		Map<Project, ArrayList<Employee>> deserializedMap = deserializeMap(filePath);

		displayMap(deserializedMap);
	}

	public static Map<Project, ArrayList<Employee>> deserializeMap(String fileName)
			throws ClassNotFoundException, IOException {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
			Object obj = in.readObject();
			return (Map<Project, ArrayList<Employee>>) obj;
		}
	}

	public static void displayMap(Map<Project, ArrayList<Employee>> map) {
		if (map != null) {
			for (Map.Entry<Project, ArrayList<Employee>> entry : map.entrySet()) {
				Project project = entry.getKey();
				ArrayList<Employee> employees = entry.getValue();

				System.out.println("Project: " + project);
				System.out.println("Employess....");
				for (Employee employee : employees) {
					System.out.println(employee);
				}
			}
		} else {
			System.out.println("Map is null");
		}
	}
}
