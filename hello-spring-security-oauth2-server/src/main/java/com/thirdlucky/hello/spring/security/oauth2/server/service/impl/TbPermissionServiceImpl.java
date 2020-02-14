package com.thirdlucky.hello.spring.security.oauth2.server.service.impl;

import com.thirdlucky.hello.spring.security.oauth2.server.domain.TbPermission;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.thirdlucky.hello.spring.security.oauth2.server.mapper.TbPermissionMapper;
import com.thirdlucky.hello.spring.security.oauth2.server.service.TbPermissionService;

import java.security.Permission;
import java.util.List;

@Service
public class TbPermissionServiceImpl implements TbPermissionService{

    @Resource
    private TbPermissionMapper tbPermissionMapper;

    @Override
    public List<TbPermission> selectByUserId(Long id) {
        return tbPermissionMapper.selectByUserId(id);
    }
}
