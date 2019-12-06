import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Practitioner {
    private int id;
    private String name;

    public Practitioner(int id, String name) {
        this.id = id;
        this.name = name;
    };

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void save() {
        String SQL = "INSERT INTO practitioner(id, name) VALUES(?,?)";
        PostgresConnection postConn = new PostgresConnection();
        postConn.getConnection();

        try (PreparedStatement pstmt = postConn.conn.prepareStatement(SQL)) {
            pstmt.setInt(1, getId());
            pstmt.setString(2, getName());
            pstmt.execute();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
