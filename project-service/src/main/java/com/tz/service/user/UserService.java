package com.tz.service.user;

import com.tz.core.exception.BusinessException;
import com.tz.dao.user.model.TUser;
import com.tz.dao.user.req.UserReq;


/**
 * user业务接口定义
 * @author KyrieCao
 * @date 2020/02/04 14:59
 */
public interface UserService {

    /**
     * 根据ID查询
     * @author KyrieCao
     * @date 2020/02/04 14:59
     */
    TUser findById(Integer id);

    /**
     * 创建
     * @author KyrieCao
     * @date 2020/02/04 14:59
     */
    TUser create(UserReq req) throws BusinessException;

    /**
     * 根据ID更新
     * @author KyrieCao
     * @date 2020/02/04 14:59
     */
    void updateById(UserReq req) throws BusinessException;

    /**
     * 根据ID删除
     * @author KyrieCao
     * @date 2020/02/04 14:59
     */
    void deleteById(Integer id) throws BusinessException;
}