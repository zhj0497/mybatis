package com.cnepay.mybatis.base;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 提供顶级的公用类，目前加入日志
 * @author
 *
 */
public abstract class BaseProject {
	/**
	 * 统一日志
	 */
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    protected final Gson gson = new Gson();

}
