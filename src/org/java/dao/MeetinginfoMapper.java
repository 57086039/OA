package org.java.dao;

import org.java.entity.oa.Meetinginfo;

public interface MeetinginfoMapper {
    int deleteByPrimaryKey(Long meetingid);

    int insert(Meetinginfo record);

    int insertSelective(Meetinginfo record);

    Meetinginfo selectByPrimaryKey(Long meetingid);

    int updateByPrimaryKeySelective(Meetinginfo record);

    int updateByPrimaryKey(Meetinginfo record);
}