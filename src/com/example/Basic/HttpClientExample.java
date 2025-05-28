package com.example.Basic;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientExample {

	private static final String orgId = "10132";
	
	public static void main(String[] args) {
		
		try {
			
			HttpClient client = HttpClient.newHttpClient();
			HttpRequest markupRequest = (HttpRequest) HttpRequest.newBuilder()
					.uri(URI.create("http://corpapi-uat.hoi.in/Markup/combinedMarkups/"+orgId))
					.GET()
					.build();
			
			HttpResponse<String> markupResponse = client.send(markupRequest, HttpResponse.BodyHandlers.ofString());
			if (markupResponse.statusCode() == 200) {
				System.out.println("Response Status : " + markupResponse.statusCode());
				System.out.println("Response Body For MarkUp:");
				System.out.println(markupResponse.body());
			}else {
				System.out.println("Failed with HTTP Error Code: " + markupResponse.statusCode());
			}
			
			
			
//			HttpClient discountClient = HttpClient.newHttpClient();
			HttpRequest discountRequest = (HttpRequest) HttpRequest.newBuilder()
					.uri(URI.create("http://corpapi-uat.hoi.in/discount/combinedDiscounts/" + orgId))
					.GET()
					.build();
			
			HttpResponse<String> discountResponse = client.send(discountRequest, HttpResponse.BodyHandlers.ofString());
			if (discountResponse.statusCode() == 200) {
				System.out.println("Response Status : " + discountResponse.statusCode());
				System.out.println("Response Body For Discount:");
				System.out.println(discountResponse.body());
			}else {
				System.out.println("Failed with HTTP Error Code: " + discountResponse.statusCode());
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
