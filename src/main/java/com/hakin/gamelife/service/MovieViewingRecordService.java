package com.hakin.gamelife.service;

        import com.hakin.gamelife.entity.MovieViewingRecord;

        import java.util.List;

public interface MovieViewingRecordService {

    int deleteByPrimaryKey(Integer id);

    int insert(MovieViewingRecord record);

    int insertSelective(MovieViewingRecord record);

    MovieViewingRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MovieViewingRecord record);

    int updateByPrimaryKey(MovieViewingRecord record);

    List<MovieViewingRecord> findList(MovieViewingRecord record);
}
