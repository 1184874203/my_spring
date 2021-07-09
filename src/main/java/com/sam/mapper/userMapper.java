package com.sam.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sam.pojo.user;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface userMapper extends BaseMapper<user> {
}
