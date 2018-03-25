package com.slokam.Eurekaclient2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestController2 {
	@Autowired
	private LoadBalancerClient loadbalancer;
	@Autowired
	private OurfeignClient ourclient;


	@RequestMapping("test11")

	public String test() {

		RestTemplate t = new RestTemplate();
		ServiceInstance u = loadbalancer.choose("Microrestapp1");
		//System.out.println(loadbalancer);
		//System.out.println(u.getUri());
		String str = "hii";
		
		String baseUri = u.getUri().toString();
		baseUri = baseUri + "/client1";
		System.out.println(baseUri);
		String forObject = t.getForObject(baseUri, String.class);

		return str + ":from client2:" + forObject;

	}
	/*
	 * @RequestMapping("test22") public String test22() { String
	 * data=OurfeignClient. return data::+test22"; }
	 */
}