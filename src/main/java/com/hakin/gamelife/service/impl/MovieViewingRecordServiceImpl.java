package com.hakin.gamelife.service.impl;

import com.hakin.gamelife.dao.MovieViewingRecordMapper;
import com.hakin.gamelife.entity.MovieViewingRecord;
import com.hakin.gamelife.service.MovieViewingRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MovieViewingRecordServiceImpl implements MovieViewingRecordService {
    @Resource
    private MovieViewingRecordMapper movieViewingRecordMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return movieViewingRecordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(MovieViewingRecord record) {
        return movieViewingRecordMapper.insert(record);
    }

    @Override
    public int insertSelective(MovieViewingRecord record) {
        return movieViewingRecordMapper.insertSelective(record);
    }

    @Override
    public MovieViewingRecord selectByPrimaryKey(Integer id) {
        return movieViewingRecordMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(MovieViewingRecord record) {
        return movieViewingRecordMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(MovieViewingRecord record) {
        return movieViewingRecordMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<MovieViewingRecord> findList(MovieViewingRecord record) {
        return movieViewingRecordMapper.findList(record);
    }
}
