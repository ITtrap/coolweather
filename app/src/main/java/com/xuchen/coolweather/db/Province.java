package com.xuchen.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by xuchen
 * on 2019/2/24.
 */
public class Province extends DataSupport{
    private int id,provinceCode;
    private String provinceName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    @Override
    public String toString() {
        return "Province{" +
                "id=" + id +
                ", provinceCode=" + provinceCode +
                ", provinceName='" + provinceName + '\'' +
                '}';
    }
}
