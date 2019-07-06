package com.youkeda.web.service;

import java.util.Map;

/**
 * 数据处理接口类
 *
 * @author Juniors
 */
public interface HandleService {

    /**
     * 核心算法
     *
     * @param floor
     * @param room
     * @param capasity_need
     * @param a
     * @return
     */
        Map<Integer,Integer> handle( int floor, int room, int capasity_need, int[][] a);

    /**
     * 封装结果
     * @param code
     * @param capacities
     * @return
     */
        String task(String code,String capacities);
}
