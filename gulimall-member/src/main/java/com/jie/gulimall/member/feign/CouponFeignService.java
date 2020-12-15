package com.jie.gulimall.member.feign;

import com.jie.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * CouponFeignService
 *
 * @author Jie
 * @description 这是一个声明式的远程调用
 * @create 2020/12/15 12:48
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    @GetMapping("/coupon/coupon/member/list")
    public R membercoupons();
}
