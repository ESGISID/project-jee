package esgi.arlo.arjas.jerseyservlet.qualifiers;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

public class H2DataSource {
    public static String getVersion() {

        SimpleDriverDataSource ds = new SimpleDriverDataSource();
        ds.setDriver(new org.h2.Driver());
        ds.setUrl("jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1");

        String sql = "SELECT H2VERSION()";

        JdbcTemplate jtm = new JdbcTemplate(ds);
        String version = jtm.queryForObject(sql, String.class);

        return version;
    }

}
