public class Name {
    //variáveis que falam por si só
    public Date modifiedDate;
    public List<Testcase> findAllTestcasesByUser(Name.User user){};

    //Declarações corretas
    public List<Account> AccountList;


    // Sem Prefixos
    public void deleteUser(Name.User user){};

    // Evite mapa mental
    public URL url;

    // Classe possui nomes próprios, funções devem ter verbos
    public class TableRepresent {};
    public void saveCar(){};

    // Uma palavra por conceito
    public saveUser(){}; createAccount(){}; generateContract(){};

    //Use constants, enums instead of magic numbers, abbreviations
    public final int DAYS_IN_YEAR = 360;
    public final int HOURS_IN_WEEK = 168;
}