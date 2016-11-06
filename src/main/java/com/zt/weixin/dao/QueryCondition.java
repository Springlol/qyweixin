/**
 * 
 */
package com.zt.weixin.dao;

import java.util.Map;

/**
 * 查询条件封装
 * @author zxl
 *
 */
public class QueryCondition {
    /**
     * 条件字符串
     */
    private String conditionStr;
    
    /**
     * 查询参数
     */
    private Map<String, Object> params;
    
    public QueryCondition() {}
    
    public QueryCondition(String conditionStr, Map<String, Object> params) {
        this.conditionStr = conditionStr;
        this.params = params;
    }
    
    
    /**
     * @return the conditionStr
     */
    public String getConditionStr() {
        return conditionStr;
    }
    /**
     * @param conditionStr the conditionStr to set
     */
    public void setConditionStr(String conditionStr) {
        this.conditionStr = conditionStr;
    }
    /**
     * @return the params
     */
    public Map<String, Object> getParams() {
        return params;
    }
    /**
     * @param params the params to set
     */
    public void setParams(Map<String, Object> params) {
        this.params = params;
    }
}
