package guru.springframework.sfgdi.datasource;

/**
 * @author Alex Gutorov
 * @version 1.0
 * @created 22/01/2022 - 18:14
 */
public class FakeDataSource {
    private String name;
    private String password;
    private String jdbcurl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJdbcurl() {
        return jdbcurl;
    }

    public void setJdbcurl(String jdbcurl) {
        this.jdbcurl = jdbcurl;
    }
}
