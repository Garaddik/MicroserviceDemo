package com.ms.assets;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/assets")
public class AssetController {

	@GetMapping
	public String getAssets(){
		return "Hello Assets Micro service";
	}
}
