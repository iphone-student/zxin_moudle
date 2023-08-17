package com.zxin.config.utils;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

import java.util.ArrayList;
import java.util.List;

/**
* @Author: zb
* @Description: 分页工具
* @Date: 2023/8/17 14:47
*/
public class PageUtils {

    //将List<entity>--->List<dto>分页形式
    public static<T, V> PageInfo<V> pageDtoTo (List<T> oldList, Class<V> v){
        if (oldList == null) {
            return null;
        }
        //封装list到PageInfo对象中自动分页
        PageInfo<T> pageInfo = new PageInfo<>(oldList);
        //转换为UserVo类型的PageInfo对象
        PageInfo<V> voPageInfo = PageInfo2PageInfoVo(pageInfo);
        List<V> rsDtos = BeanDtoVoUtil.listVo(oldList, v);
        rsDtos.forEach(i -> voPageInfo.getList().add(i));
        return voPageInfo;
    }
    public static <P, V> PageInfo<V> PageInfo2PageInfoVo(PageInfo<P> pageInfoPo) {
        // 创建Page对象，实际上是一个ArrayList类型的集合
        Page<V> page = new Page<>(pageInfoPo.getPageNum(), pageInfoPo.getPageSize());
        page.setTotal(pageInfoPo.getTotal());
        return new PageInfo<>(page);
    }

}
