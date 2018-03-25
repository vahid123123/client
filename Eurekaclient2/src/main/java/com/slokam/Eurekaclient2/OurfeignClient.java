package com.slokam.Eurekaclient2;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("Microrestapp1")
public interface OurfeignClient {

	@RequestMapping("/client1")
	public String client();
}
