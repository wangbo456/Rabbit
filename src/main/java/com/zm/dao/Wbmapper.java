package com.zm.dao;

import com.zm.bean.Powar;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface Wbmapper {
    
    @Select("select * from powar")
    List<Powar> getTree();

}
