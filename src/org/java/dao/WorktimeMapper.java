package org.java.dao;

import org.java.entity.oa.Worktime;

public interface WorktimeMapper {
    int deleteByPrimaryKey(Long worktimeid);

    int insert(Worktime record);

    int insertSelective(Worktime record);

    Worktime selectByPrimaryKey(Long worktimeid);

    int updateByPrimaryKeySelective(Worktime record);

    int updateByPrimaryKey(Worktime record);
}