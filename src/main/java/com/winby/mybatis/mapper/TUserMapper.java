package com.winby.mybatis.mapper;

import java.util.List;

import com.winby.mybatis.entity.TUser;

public interface TUserMapper {
	


    TUser selectByPrimaryKey(Integer id);
    
    List<TUser> selectAll();

    
}