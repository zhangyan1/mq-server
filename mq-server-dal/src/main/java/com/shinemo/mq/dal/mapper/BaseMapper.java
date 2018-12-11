package com.shinemo.mq.dal.mapper;

import com.shinemo.mq.client.common.entity.BaseDO;
import com.shinemo.mq.client.common.entity.BaseQuery;

import java.util.List;

public interface BaseMapper<Q extends BaseQuery,D extends BaseDO>  {

    D get(Q query);

    List<D> find(Q query);

    long count(Q query);

    long insert(D tempDO);

    int update(D tempDO);

}