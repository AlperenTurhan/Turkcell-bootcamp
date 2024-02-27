package gun3.abstractDemo;

public class MySqlDatabaseManager extends BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("Veri getirildi : My sql");
    }
}
