package com.finalproject.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ProjectData {

	public void getProjectName() {
		List<String> projectName = new ArrayList<>();
		List<String> urls = new ArrayList<>();

		String url = "http://localhost/FrontPage";

		try {
			Document doc = Jsoup.connect(url).get();
			Elements tableElements = doc.select("table");
			for(int i=0; i<tableElements.size(); i++){
				projectName.add(tableElements.get(i).select("td").get(1).text().substring(1));
			System.out.println(tableElements.get(i).select("td").get(1).text().substring(1));
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
