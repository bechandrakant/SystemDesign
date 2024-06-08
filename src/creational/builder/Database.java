package creational.builder;

public class Database {
    private String name;
    private String host;
    private Integer port;
    private String password;

    public String getName() {
        return name;
    }

    public String getHost() {
        return host;
    }

    public Integer getPort() {
        return port;
    }

    public String getPassword() {
        return password;
    }

    public static DatabaseBuilder builder() {
        return new DatabaseBuilder();
    }

    static class DatabaseBuilder {
        private String name;
        private String host;
        private Integer port;
        private String password;



    }


}
