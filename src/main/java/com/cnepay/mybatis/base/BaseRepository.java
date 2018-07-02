package com.cnepay.mybatis.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author
 *
 */
@Transactional(rollbackFor = { RuntimeException.class }, propagation = Propagation.REQUIRED)
public abstract class BaseRepository extends BaseProject {


	/**
	 * jdbcTemplate由daoimpl自己注入
	 * 
	 */
    @Autowired
	protected JdbcTemplate jdbcTemplate;
	/**
	 * namedParameterJdbcTemplate由daoimpl自己注入
	 */
    @Autowired
	protected NamedParameterJdbcTemplate namedParameterJdbcTemplate;

}
