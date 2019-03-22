package com.hakin.gamelife.controller;

import com.hakin.gamelife.entity.MovieViewingRecord;
import com.hakin.gamelife.entity.ResultResponse;
import com.hakin.gamelife.service.MovieViewingRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/movie")
public class MovieController {
    @Autowired
    private MovieViewingRecordService movieViewingRecordService;

    @RequestMapping(value = "/index")
    public String insert() {
        return "home";
    }

    @PostMapping(value = "/insert")
    public ResultResponse insert(MovieViewingRecord record) {
        ResultResponse response = new ResultResponse();
        int result = movieViewingRecordService.insert(record);
        if (result > 0) {
            response.setCode(999999);
            response.setMessage("保存成功!");
            response.setData(result);
        } else {
            response.setCode(111111);
            response.setMessage("保存失败!");
            response.setData(result);
        }
        return response;
    }

    @GetMapping(value = "/select")
    @ResponseBody
    public ResultResponse selectByCondition(MovieViewingRecord record) {
        ResultResponse response = new ResultResponse();
        List<MovieViewingRecord> list = movieViewingRecordService.findList(record);
        if (!CollectionUtils.isEmpty(list)) {
            response.setCode(999999);
            response.setMessage("查询成功!");
            response.setData(list);
        } else {
            response.setCode(111111);
            response.setMessage("查询失败!");
            response.setData(list);
        }
        return response;
    }

    @GetMapping(value = "/selectByPrimaryKey")
    public ResultResponse selectByPrimaryKey(Integer id) {
        ResultResponse response = new ResultResponse();
        MovieViewingRecord movie = movieViewingRecordService.selectByPrimaryKey(id);
        if (movie != null) {
            response.setCode(999999);
            response.setMessage("查询成功!");
            response.setData(movie);
        } else {
            response.setCode(111111);
            response.setMessage("查询失败!");
            response.setData(movie);
        }
        return response;
    }

}
