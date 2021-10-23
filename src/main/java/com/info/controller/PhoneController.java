package com.info.controller;

import com.info.dao.InfoDao;
import com.info.model.InfoModel;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yangjie
 * @date 2021/10/21 7:44 下午
 * @desc
 */
@RestController
@RequestMapping("/phone")
public class PhoneController {

    @Resource
    private InfoDao infoDao;

    @GetMapping("/all")
    public List<InfoModel> getPhones(){
        return infoDao.queryAllInfos();
    }

    @GetMapping("/name")
    public List<InfoModel> getPhoneByName(String name){
        return infoDao.queryByName(name);
    }

    @PostMapping("/create")
    public void create(@RequestBody InfoModel info){
        infoDao.create(info);
    }

    @PostMapping("/delete")
    public void delete(Integer id){
        infoDao.del(id);
    }

    @PostMapping("/update")
    public void update(@RequestBody InfoModel info){
        infoDao.update(info);
    }
}
