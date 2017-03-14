package com.hades.strategy.bean.strategy;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import com.hades.strategy.bean.IndexDateInfo;
import com.hades.strategy.bean.Position;

public abstract class Logic {

    protected final String[] param;

    public Logic(String[] splitParam) {
        if (splitParam.length > 1) {
            param = new String[splitParam.length - 1];
            for (int i = 0; i < splitParam.length - 1; i++) {
                param[i] = splitParam[i + 1];
            }
        } else {
            param = null;
        }
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " [param=" + Arrays.toString(param) + "]";
    }

    /**
     * 
     * @param position
     * @param indexDateInfo
     * @param dateInfoList
     * @param previousIndex
     * @return 0:不执行策略;>0执行策略
     */
    public abstract BigDecimal getPercent(final Position position, final IndexDateInfo indexDateInfo,
                    final List<IndexDateInfo> dateInfoList, final int previousIndex);
}
