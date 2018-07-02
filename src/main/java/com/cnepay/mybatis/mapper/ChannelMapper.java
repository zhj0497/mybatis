package com.cnepay.mybatis.mapper;



import com.cnepay.mybatis.domain.Channel;

import java.util.List;

public interface ChannelMapper {
    List<Channel> findAllByChannel(Channel channel);

    int deleteByPrimaryKey(Long id);

    int insert(Channel record);

    int insertSelective(Channel record);


    Channel selectByPrimaryKey(Long id);


    int updateByPrimaryKeySelective(Channel record);

    int updateByPrimaryKey(Channel record);
}