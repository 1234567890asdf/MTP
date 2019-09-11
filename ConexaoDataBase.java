
package aula28.pkg08java;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class ConexaoDataBase{
	
	// string URL padrão
	// endereço: localhost
	// base de dados: mtp
	private String url = "jdbc:postgresql://localhost/Pessoa";
	
	// usuário do postgres
	private String usuario = "postgres";
	
	// senha do postgres
	private String senha = "ifg";
	
	// variável que guarda a conexão
	private Connection conn;
	
	/**
	 * Método construtor.
	 * 
	 * Toda vez que instanciar essa classe, a conexão é automaticamente feita
	 */
	public ConexaoDataBase() {
		conectar();
	}
	
	/**
	 * Método para conexão com o banco de dados.
	 * 
	 * Carrega o driver e cria a conexão com o BD.
	 */
	public void conectar() {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		Properties props = new Properties();
		props.setProperty("user", this.usuario);
		props.setProperty("password", this.senha);
		
		try {
			this.conn = DriverManager.getConnection(this.url, props);
		} catch (SQLException e) {
			e.getMessage();
		}

	}
	
	/**
	 * Método que retorna a conexão feita com o BD
	 * 
	 * @return um objeto Connection que é a conexão feita com o BD
	 */
        public String Login(String Email, String Senha) {         
            try {
                PreparedStatement ps = this.conn.prepareStatement("SELECT \"Id\", \"Nome\" FROM \"Pessoa\" where \"Email\" = ? AND \"Senha\" = ?");
                ps.setString(1, Email);                           //por causa das letras MAIUSCULAS nos nomes das colunas, 
                                                                  //tera de colocar aspas duplas sempre para que possa rodar o programa. EX; \"Id\" 
                ps.setString(2, Senha);
                ResultSet rs = ps.executeQuery();
                if(rs.next()) {
                    
                    return rs.getString(2);
                } else {
                    return null;
                }
                
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
           
        }
        
	public Connection getConnection() {
		return this.conn;
	}
}
