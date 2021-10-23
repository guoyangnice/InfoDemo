package com.info.dao;

import com.info.model.InfoModel;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author yangjie
 * @date 2021/10/21 7:58 下午
 * @desc
 */
@Mapper
public interface InfoDao {
    @Select("select * from info")
    List<InfoModel> queryAllInfos();

    @Select("select * from info where name = #{name}")
    List<InfoModel> queryByName(@Param("name") String name);

    @Insert("insert into info (department,name,office_phone,department_phone,self_phone,family_phone,position) " +
            "values (#{department},#{name},#{officePhone},#{departmentPhone},#{selfPhone},#{familyPhone},#{position})")
    @Options(useGeneratedKeys=true, keyProperty="id")
    void create(InfoModel info);

    @Delete(" delete from info where id= #{id} ")
    void del(int id);

    @Update("update info set " +
            "department = #{department}," +
            "name = #{name}," +
            "office_phone = #{officePhone}," +
            "department_phone = #{departmentPhone}," +
            "self_phone = #{selfPhone}, " +
            "family_phone = #{familyPhone}, " +
            "position = #{position} " +
            "where id=#{id} ")
    void update(InfoModel info);
}
