package com.gsvl.oneul.tv;

import com.gsvl.oneul.tv.model.TvDto;
import com.gsvl.oneul.tv.model.TvEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TvMapper {
    // Tv 프로별 리스트
    List<TvEntity> selTvList(TvDto dto);

    // Tv 프로 페이징
    int selMaxPage(TvDto dto);
}
