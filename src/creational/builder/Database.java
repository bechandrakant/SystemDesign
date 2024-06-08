package creational.builder;

public class Database {
    private String name;
    private String host;
    private Integer port;
    private String password;

    private Database() {}

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

        public Database build() {
            if (!isValid()) {
                throw new RuntimeException("Please enter a valid name and password");
            }
            Database database = new Database();
            database.name = this.name;
            database.host = this.host;
            database.port = this.port;
            database.password = this.password;
            return database;
        }

        public boolean isValid() {
            return !(password.length() < 8 || name == null || name.length() < 3);
        }

        public DatabaseBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public DatabaseBuilder withUrl(String host, Integer port) {
            this.host = host;
            this.port = port;
            return this;
        }

        public DatabaseBuilder withPassword(String password) {
            this.password = password;
            return this;
        }
    }

}
