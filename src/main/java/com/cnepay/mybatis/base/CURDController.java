package com.cnepay.mybatis.base;


import com.cnepay.mybatis.domain.WHRequest;
import com.cnepay.mybatis.domain.WHResponse;
import com.cnepay.mybatis.service.ICURDService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.Serializable;
import java.util.ArrayList;

@RestController
@RequestMapping(value = "/curd")
public abstract class CURDController<T extends Serializable> extends BaseProject{
    public  abstract    String getBaseUrl();
    public abstract ICURDService getService();
    @RequestMapping(value = {""}, method = RequestMethod.GET)
    public ModelAndView index() {
        return new ModelAndView(getBaseUrl()+"/list");
    }


    @RequestMapping(value = {"/list"}, method = RequestMethod.POST)
    public PageInfo<T> list(@RequestBody WHRequest<T> req) {
        try {
            T object = req.getContent();
            int pageNum = req.getPageNum();
            int pageSize = req.getPageSize();

            PageInfo<T> pageInfo = getService().findAllByObject(object ,pageNum,pageSize);
            return pageInfo;
        } catch (Exception e) {
            logger.error("获取数据失败", e);
            return new PageInfo(new ArrayList<T>());
        }
    }

    @RequestMapping(value = "/toFrom", method = RequestMethod.GET)
    public ModelAndView toFrom() {
        return new ModelAndView(getBaseUrl()+"/form");
    }
    @RequestMapping(value = "/toFromAdd", method = RequestMethod.GET)
    public ModelAndView toFromAdd() {
        return new ModelAndView(getBaseUrl()+"/formAdd");
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public WHResponse<T> save(@RequestBody T t) {
        WHResponse resp = new WHResponse();
        try {
            logger.info("保存信息，{}", gson.toJson(t));
            boolean isSave= getService().save(t);
            resp.setContent(t);
            if (isSave) {
                resp.setStatus(WHResponse.Status.SUCCESS);
            } else {
                resp.setStatus(WHResponse.Status.FAIL);
                resp.setMsg("信息已经存在，失败");
            }
        } catch (Throwable e) {
            logger.error("保存通道信息，未知异常", e);
            resp.setStatus(WHResponse.Status.FAIL);
            resp.setMsg(e.getMessage());
        }
        return resp;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public WHResponse<T> update(@RequestBody T t) {
        WHResponse<T> resp = new WHResponse<>();
        try {
            logger.info("更新通道信息，{}", gson.toJson(t));
            boolean isUpdate= getService().update(t);
            resp.setContent(t);
            if (isUpdate) {
                resp.setStatus(WHResponse.Status.SUCCESS);
            } else {
                resp.setStatus(WHResponse.Status.FAIL);
                resp.setMsg("更新通道信息，失败");
            }
        } catch (Throwable e) {
            logger.error("更新通道信息，未知异常", e);
            resp.setStatus(WHResponse.Status.FAIL);
            resp.setMsg(e.getMessage());
        }
        return resp;
    }

    @RequestMapping(value = "/getOne", method = RequestMethod.GET)
    public Serializable getOne(Long id) {
        return getService().findOne(id);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public WHResponse<T> delete(Long id) {
        WHResponse<T> resp = new WHResponse<>();
        try {
            logger.info("删除商户信息，{}", id);
            boolean isSuccess = getService().delete(id);
            if (isSuccess) {
                resp.setStatus(WHResponse.Status.SUCCESS);
            } else {
                resp.setStatus(WHResponse.Status.FAIL);
                resp.setMsg("删除商户信息，失败");
            }
        } catch (Throwable e) {
            logger.error("删除商户信息，未知异常", e);
            resp.setStatus(WHResponse.Status.FAIL);
            resp.setMsg(e.getMessage());
        }
        return resp;
    }


}
