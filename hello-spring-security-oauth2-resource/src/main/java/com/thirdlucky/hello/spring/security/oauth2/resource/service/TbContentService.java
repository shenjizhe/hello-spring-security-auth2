package com.thirdlucky.hello.spring.security.oauth2.resource.service;

import com.thirdlucky.hello.spring.security.oauth2.resource.domain.TbContent;

import java.util.List;

public interface TbContentService {

	List<TbContent> selectAll();

}
