package com.ding.shop.provider;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ding.shop.service.ShopService;

/**
 * Created by hzdzf on 2017/1/19.
 */
public class ShopServiceProvider {

    @Reference
    public static ShopService shopService;
}
