/*******************************************************************************
* Copyright (c) 2009 Wescom.
* All rights reserved.
*  ___     _     _    ___ _ _    _    ___                             
* | _ \___(_)_ _| |_ / __| (_)__| |__/ __|__ _ _ _ ___   __ ___ _ __  
* |  _/ _ \ | ' \  _| (__| | / _| / / (__/ _` | '_/ -_)_/ _/ _ \ '  \ 
* |_| \___/_|_||_\__|\___|_|_\__|_\_\\___\__,_|_| \___(_)__\___/_|_|_|
* 
* This software is the confidential and proprietary information of Wescom
* Solutions, Inc. ("Confidential Information").  You shall not disclose
* such Confidential Information and shall use it only in accordance with
* the terms of the license agreement you entered into with Wescom.
********************************************************************************/

package ca.studymedia.dao.mybatis;

import java.io.Reader;
import java.sql.DriverManager;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mysql.jdbc.Driver;

/**
 * 
 * MyBatisSqlSessionFactory
 * 
 * MyBatisSqlSessionFactory SqlSession Object
 * 
 * Facilitates connection to MyBatis datasources.
 *
 * @see JiraMapper.xml
 * 
 * @author misaf
 *
 */
public class MyBatisSqlSessionFactory {
  
    protected static final SqlSessionFactory FACTORY;

    static {
        try {
            DriverManager.registerDriver(new Driver());
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            FACTORY = new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e){
            throw new RuntimeException("Fatal Error.  Cause: " + e, e);
        }
    }

    public static SqlSessionFactory getSqlSessionFactory() {
        return FACTORY;
    }
}

