package com.cnepay.mybatis.service;


import com.cnepay.mybatis.domain.Channel;
import com.cnepay.mybatis.mapper.ChannelMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class ChannelService implements ICURDService<Channel>{
    @Autowired
    private ChannelMapper channelMapper;

    public PageInfo<Channel> findAllByObject(Channel channel,int pageNum,int pageSize){
        PageHelper.startPage(pageNum, pageSize);
       List<Channel> list= channelMapper.findAllByChannel(channel);
       PageInfo<Channel> pageInfo = new PageInfo<>(list);
       return pageInfo;
    }

    public boolean save(Channel channel){
        Date createDate = new Date();
        channel.setCreateDate(createDate);
        channel.setUpdateDate(createDate);
        return channelMapper.insertSelective(channel)>0;
    }

    public boolean update(Channel channel){
        if(channel.getCreateDate()==null){
            channel.setCreateDate(new Date());
        }
        channel.setUpdateDate(new Date());
        return channelMapper.updateByPrimaryKeySelective(channel)>0;
    }

    public Channel findOne(Long id){
        return channelMapper.selectByPrimaryKey(id);
    }
    public boolean delete(Long id){
      return  channelMapper.deleteByPrimaryKey(id)>0;
    }
}
