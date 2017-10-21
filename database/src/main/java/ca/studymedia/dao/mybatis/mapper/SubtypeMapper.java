package ca.studymedia.dao.mybatis.mapper;

import ca.studymedia.model.Subtype;
import ca.studymedia.dao.mybatis.example.SubtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubtypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subtype
     *
     * @mbg.generated
     */
    long countByExample(SubtypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subtype
     *
     * @mbg.generated
     */
    int deleteByExample(SubtypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subtype
     *
     * @mbg.generated
     */
    int insert(Subtype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subtype
     *
     * @mbg.generated
     */
    int insertSelective(Subtype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subtype
     *
     * @mbg.generated
     */
    List<Subtype> selectByExampleWithBLOBs(SubtypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subtype
     *
     * @mbg.generated
     */
    List<Subtype> selectByExample(SubtypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subtype
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Subtype record, @Param("example") SubtypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subtype
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") Subtype record, @Param("example") SubtypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subtype
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Subtype record, @Param("example") SubtypeExample example);
}