package ca.studymedia.model;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.UserID
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.role
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    private String role;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.login
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    private String login;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.firstName
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    private String firstname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.lastName
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    private String lastname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.eMails
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    private String emails;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.country
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    private String country;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.state
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    private String state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.city
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    private String city;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.address
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.code
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.phones
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    private String phones;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.UserID
     *
     * @return the value of user.UserID
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.UserID
     *
     * @param userid the value for user.UserID
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.role
     *
     * @return the value of user.role
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public String getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.role
     *
     * @param role the value for user.role
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.login
     *
     * @return the value of user.login
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public String getLogin() {
        return login;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.login
     *
     * @param login the value for user.login
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public void setLogin(String login) {
        this.login = login == null ? null : login.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.firstName
     *
     * @return the value of user.firstName
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.firstName
     *
     * @param firstname the value for user.firstName
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname == null ? null : firstname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.lastName
     *
     * @return the value of user.lastName
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.lastName
     *
     * @param lastname the value for user.lastName
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public void setLastname(String lastname) {
        this.lastname = lastname == null ? null : lastname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.eMails
     *
     * @return the value of user.eMails
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public String getEmails() {
        return emails;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.eMails
     *
     * @param emails the value for user.eMails
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public void setEmails(String emails) {
        this.emails = emails == null ? null : emails.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.country
     *
     * @return the value of user.country
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public String getCountry() {
        return country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.country
     *
     * @param country the value for user.country
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.state
     *
     * @return the value of user.state
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.state
     *
     * @param state the value for user.state
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.city
     *
     * @return the value of user.city
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.city
     *
     * @param city the value for user.city
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.address
     *
     * @return the value of user.address
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.address
     *
     * @param address the value for user.address
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.code
     *
     * @return the value of user.code
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.code
     *
     * @param code the value for user.code
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.phones
     *
     * @return the value of user.phones
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public String getPhones() {
        return phones;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.phones
     *
     * @param phones the value for user.phones
     *
     * @mbggenerated Tue Nov 12 11:57:25 EST 2013
     */
    public void setPhones(String phones) {
        this.phones = phones == null ? null : phones.trim();
    }
}