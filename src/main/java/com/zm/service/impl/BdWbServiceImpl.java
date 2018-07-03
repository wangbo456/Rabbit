package com.zm.service.impl;

import com.zm.bean.Powar;
import com.zm.dao.Wbmapper;
import com.zm.service.BdWbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BdWbServiceImpl implements BdWbService {

    @Autowired
    private Wbmapper wbmapper;

    /**
     * 功能描述: 查询树并展示
     * @param: []
     * @return: java.util.List<com.zm.bean.Powar>
     * @auther: 王博
     * @date: 2018/6/12 15:21
     */
    @Override
    public List<Powar> getTree() {
        List<Powar> list = wbmapper.getTree();
        return list;
    }


}
