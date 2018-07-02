package com.cnepay.mybatis.filter;

import com.alibaba.druid.filter.FilterEventAdapter;
import com.alibaba.druid.proxy.jdbc.JdbcParameter;
import com.alibaba.druid.proxy.jdbc.ResultSetProxy;
import com.alibaba.druid.proxy.jdbc.StatementProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

public class JdbcFilter extends FilterEventAdapter {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
    protected void statementExecuteBefore(StatementProxy statement, String sql) {
        logger.info("sql:{}",sql);

    }
    protected void statementExecuteAfter(StatementProxy statement, String sql, boolean result) {
        logger.info("sql:{}",sql);
    }
    protected void resultSetOpenAfter(ResultSetProxy resultSet) {
        try {
            logger.info("resultSetOpenAfter:{}",resultSet.getMetaData().getColumnCount());

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
