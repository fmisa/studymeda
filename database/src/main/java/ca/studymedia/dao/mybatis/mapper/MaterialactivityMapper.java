package ca.studymedia.dao.mybatis.mapper;

import ca.studymedia.model.Materialactivity;
import ca.studymedia.dao.mybatis.example.MaterialactivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialactivityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table materialactivity
     *
     * @mbg.generated
     */
    long countByExample(MaterialactivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table materialactivity
     *
     * @mbg.generated
     */
    int deleteByExample(MaterialactivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table materialactivity
     *
     * @mbg.generated
     */
    int insert(Materialactivity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table materialactivity
     *
     * @mbg.generated
     */
    int insertSelective(Materialactivity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table materialactivity
     *
     * @mbg.generated
     */
    List<Materialactivity> selectByExample(MaterialactivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table materialactivity
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Materialactivity record, @Param("example") MaterialactivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table materialactivity
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Materialactivity record, @Param("example") MaterialactivityExample example);
}