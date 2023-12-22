package com.miredo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miredo.model.dto.UserDTO;
import com.miredo.model.mapper.UserMainMapper;

@Service
public class UserMainServiceImpl implements UserMainService {
	
	@Autowired
	UserMainMapper userMainMapper;
	
	@Autowired
	public List<Map<String, Object>> SelectAllList() throws Exception {
		
		return userMainMapper.SelectAllList();
	}
	
	@Override
	public String findIdByName(String name, String email) {
		return userMainMapper.findIdByName(name, email);
	}
	
	/* 비밀번호 찾기 - 가입된 회원 조회*/
	@Override
	public UserDTO findPwd(UserDTO member) {
		return userMainMapper.findPwd(member);
	}

}
