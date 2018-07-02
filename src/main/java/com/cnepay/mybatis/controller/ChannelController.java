package com.cnepay.mybatis.controller;



import com.cnepay.mybatis.base.CURDController;
import com.cnepay.mybatis.domain.Channel;
import com.cnepay.mybatis.service.ChannelService;
import com.cnepay.mybatis.service.ICURDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shangzk on 2018/5/2.
 */

@RestController
@RequestMapping(value = "/channel")
public class ChannelController extends CURDController<Channel> {
    @Autowired
    ChannelService channelService;

    public ChannelService setService() {
        return channelService;
    }

    @Override
    public String getBaseUrl() {
        return "channel";
    }

    @Override
    public ICURDService getService() {
        return this.channelService;
    }
}
