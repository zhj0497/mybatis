package com.cnepay.mybatis.service;

import com.cnepay.mybatis.domain.Channel;
import com.cnepay.mybatis.mapper.ChannelMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2017/11/1 0001.
 */
@Component
public class MyDataService {
    @Autowired
    private ChannelMapper channelMapper;

    public void findDataById(Long id){
        Channel authData= channelMapper.selectByPrimaryKey(id);
        System.out.println(authData);
    }

    /**
     * 分页查询
     * @param channel
     * @return
     */
    public PageInfo<Channel> findAllByPage(Channel channel,int pageNum,int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        List<Channel> list= channelMapper.findAllByChannel(channel);
        PageInfo<Channel> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

}
