package com.cnepay.mybatis.mapper;

import com.cnepay.mybatis.domain.AuthData;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

import java.util.List;

public interface AuthDataMapper {

    @Insert("<script>" +
            "insert into auth_data (id, name, state) values " +
            "<foreach collection=\"list\" item=\"city\" separator=\",\" >" +
            "(#{city.id}, #{city.cityName}, #{city.cityState})" +
            "</foreach>" +
            "</script>")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insertAuthDatas(List<AuthData> authDataList);
}