package ca.studymedia.model;

import java.math.BigDecimal;
import java.util.Date;

public class Resourcesupport {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resourcesupport.User_UserID
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    private Integer userUserid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resourcesupport.Resource_ResourceID
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    private Integer resourceResourceid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resourcesupport.date
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    private Date date;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resourcesupport.donation
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    private BigDecimal donation;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resourcesupport.User_UserID
     *
     * @return the value of resourcesupport.User_UserID
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public Integer getUserUserid() {
        return userUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resourcesupport.User_UserID
     *
     * @param userUserid the value for resourcesupport.User_UserID
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public void setUserUserid(Integer userUserid) {
        this.userUserid = userUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resourcesupport.Resource_ResourceID
     *
     * @return the value of resourcesupport.Resource_ResourceID
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public Integer getResourceResourceid() {
        return resourceResourceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resourcesupport.Resource_ResourceID
     *
     * @param resourceResourceid the value for resourcesupport.Resource_ResourceID
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public void setResourceResourceid(Integer resourceResourceid) {
        this.resourceResourceid = resourceResourceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resourcesupport.date
     *
     * @return the value of resourcesupport.date
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resourcesupport.date
     *
     * @param date the value for resourcesupport.date
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resourcesupport.donation
     *
     * @return the value of resourcesupport.donation
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public BigDecimal getDonation() {
        return donation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resourcesupport.donation
     *
     * @param donation the value for resourcesupport.donation
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public void setDonation(BigDecimal donation) {
        this.donation = donation;
    }
}