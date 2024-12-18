package singleton;

//Database Class (Singleton)
public class Database {
 private static Database instance;

 private Database() { /* private constructor */ }

 public static Database getInstance() {
     if (instance == null) {
         instance = new Database();
     }
     return instance;
 }

 public void connect() { /* No functionality here */ }
 public void disconnect() { /* No functionality here */ }
}