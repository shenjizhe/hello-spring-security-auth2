package com.thirdlucky.hello.spring.security.oauth2.server.service;

import com.thirdlucky.hello.spring.security.oauth2.server.domain.TbPermission;
import org.apache.ibatis.annotations.Param;

import java.security.Permission;
import java.util.List;

public interface TbPermissionService {
    List<TbPermission> selectByUserId(Long id);
}
