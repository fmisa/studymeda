package ca.studymedia.model;

import java.util.Date;

public class Certification {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column certification.User_UserID
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    private Integer userUserid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column certification.Resource_ResourceID
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    private Integer resourceResourceid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column certification.date
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    private Date date;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column certification.grade
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    private Integer grade;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column certification.qualifier
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    private String qualifier;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column certification.User_UserID
     *
     * @return the value of certification.User_UserID
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public Integer getUserUserid() {
        return userUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column certification.User_UserID
     *
     * @param userUserid the value for certification.User_UserID
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public void setUserUserid(Integer userUserid) {
        this.userUserid = userUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column certification.Resource_ResourceID
     *
     * @return the value of certification.Resource_ResourceID
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public Integer getResourceResourceid() {
        return resourceResourceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column certification.Resource_ResourceID
     *
     * @param resourceResourceid the value for certification.Resource_ResourceID
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public void setResourceResourceid(Integer resourceResourceid) {
        this.resourceResourceid = resourceResourceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column certification.date
     *
     * @return the value of certification.date
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column certification.date
     *
     * @param date the value for certification.date
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column certification.grade
     *
     * @return the value of certification.grade
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public Integer getGrade() {
        return grade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column certification.grade
     *
     * @param grade the value for certification.grade
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column certification.qualifier
     *
     * @return the value of certification.qualifier
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public String getQualifier() {
        return qualifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column certification.qualifier
     *
     * @param qualifier the value for certification.qualifier
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public void setQualifier(String qualifier) {
        this.qualifier = qualifier == null ? null : qualifier.trim();
    }
}