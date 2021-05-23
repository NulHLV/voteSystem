package com.nullv.pojo;

public class Dictionary {
    private Integer id;

    private Integer dicKey;

    private String dicValue;

    private String fieldName;

    private String tableName;

    public Dictionary(Integer id, Integer dicKey, String dicValue, String fieldName, String tableName) {
        this.id = id;
        this.dicKey = dicKey;
        this.dicValue = dicValue;
        this.fieldName = fieldName;
        this.tableName = tableName;
    }

    public Dictionary() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDicKey() {
        return dicKey;
    }

    public void setDicKey(Integer dicKey) {
        this.dicKey = dicKey;
    }

    public String getDicValue() {
        return dicValue;
    }

    public void setDicValue(String dicValue) {
        this.dicValue = dicValue == null ? null : dicValue.trim();
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName == null ? null : fieldName.trim();
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }
}