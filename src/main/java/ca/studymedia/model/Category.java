package ca.studymedia.model;

public class Category {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.CategoryID
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    private Integer categoryid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.name
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column category.description
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.CategoryID
     *
     * @return the value of category.CategoryID
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public Integer getCategoryid() {
        return categoryid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.CategoryID
     *
     * @param categoryid the value for category.CategoryID
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.name
     *
     * @return the value of category.name
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.name
     *
     * @param name the value for category.name
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column category.description
     *
     * @return the value of category.description
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column category.description
     *
     * @param description the value for category.description
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}