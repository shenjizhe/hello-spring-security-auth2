package com.thirdlucky.hello.spring.security.oauth2.resource.controller;

import com.thirdlucky.commons.dto.ResponseResult;
import com.thirdlucky.hello.spring.security.oauth2.resource.domain.TbContent;
import com.thirdlucky.hello.spring.security.oauth2.resource.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TbContentController {

	@Autowired
	private TbContentService tbContentService;

	@GetMapping("/")
	public ResponseResult<List<TbContent>> list() {
		return new ResponseResult<List<TbContent>>(HttpStatus.OK.value(), HttpStatus.OK.toString(),
				tbContentService.selectAll());
	}

}
