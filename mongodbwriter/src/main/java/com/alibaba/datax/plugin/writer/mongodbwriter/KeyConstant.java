package com.alibaba.datax.plugin.writer.mongodbwriter;

/**
 * Created by jianying.wcj on 2015/3/17 0017.
 */
public class KeyConstant {
    /**
     * mongodb 的 host 地址
     */
    public static final String MONGO_ADDRESS = "address";
    /**
     * mongodb 的用户名
     */
    public static final String MONGO_USER_NAME = "userName";
    /**
     * mongodb 密码
     */
    public static final String MONGO_USER_PASSWORD = "userPassword";
    /**
     * mongodb 数据库名
     */
    public static final String MONGO_DB_NAME = "dbName";
    /**
     * mongodb 集合名
     */
    public static final String MONGO_COLLECTION_NAME = "collectionName";
    /**
     * mongodb 的列
     */
    public static final String MONGO_COLUMN = "column";
    /**
     * 每个列的名字
     */
    public static final String COLUMN_NAME = "name";
    /**
     * 每个列的类型
     */
    public static final String COLUMN_TYPE = "type";
    /**
     * 列分隔符
     */
    public static final String COLUMN_SPLITTER = "splitter";
    /**
     * 数据更新列信息
     */
    public static final String UPSERT_INFO = "upsertInfo";
    /**
     * 有相同的记录是否覆盖，默认为false
     */
    public static final String IS_UPSERT = "isUpsert";
    /**
     * 指定用来判断是否覆盖的 业务主键
     */
    public static final String UNIQUE_KEY = "upsertKey";
}
