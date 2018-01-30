package com.hqw.cmmp.center.user.dao;

import com.hqw.cmmp.center.user.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface UserMapper {

    User getUser(@Param("id") Long id);
}