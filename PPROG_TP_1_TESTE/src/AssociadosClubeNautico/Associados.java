package AssociadosClubeNautico;

/**
 *
 * SUPER CLASSE ABSTRATA OBJECTOS ASSOCIADOS.
 * <P>Associdos - aqui está guardado o nome, numero contribuinte e ano nasciemnto.
 *  
 * @author Marco-115883 | Joao-1161313 (1NB)
 * @version 1.0
 */
public abstract class Associados {
    private String nome;
    private int nContribuinte;
    private int anoNascimento;

    private final String NOME_POR_OMISSAO = "default NOME";
    private final int NCONTRIBUINTE_POR_OMISSAO = 999999999;
    private final int ANONASCIMENTO_POR_OMISSAO = 1000;
    
    /**
    * EMPTY Constructor.
    * 
    * @param nome [String] Nome por omissão = default NOME. 
    * @param nContribuinte [int] Número de Contribuinte por omissão = 999999999.
    * @param anoNascimento [int] Ano de Nascimento por omissão = 1000. 
    * 
    */
    public Associados() {
        this.nome = NOME_POR_OMISSAO;
        this.nContribuinte = NCONTRIBUINTE_POR_OMISSAO;
        this.anoNascimento = ANONASCIMENTO_POR_OMISSAO;
    }
    
    /**
    * Constructor.
    * 
    * @param nome (required) [String] Nome do Associado. 
    * @param nContribuinte (required) [int] Número de Contribuinte.
    * @param anoNascimento (required) [int] Ano de Nascimento. 
    * 
    */
    public Associados(String nome, int nContribuinte, int anoNascimento) {
        this.nome = nome;
        this.nContribuinte = nContribuinte;
        this.anoNascimento = anoNascimento;
    }    
    
    
    /**
     * Get the value of Nome
     *
     * @return the value of Nome
     */
    public String getNome() {
        return nome;
    }
    
    /**
     * Set the value of NOME
     *
     * @param Nome  String to change the old NOME
     * @return void 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Get the value of NUMERO CONTRIBUINTE
     *
     * @return the value of nContribuinte
     */
    public int getnContribuinte() {
        return nContribuinte;
    }
    
    /**
     * Set the value of NUMERO CONTRIBUINTE
     *
     * @param nContribuinte  int to change the old nContribuinte
     * @return void 
     */
    public void setnContribuinte(int nContribuinte) {
        this.nContribuinte = nContribuinte;
    }

    /**
     * Get the value of ANO DE NASCIMENTO
     *
     * @return the value of anoNascimento
     */
    public int getAnoNascimento() {
        return anoNascimento;
    }
    
    /**
     * Set the value of ANO DE NASCIMENTO
     *
     * @param anoNascimento  int to change the old anoNascimento
     * @return void 
     */
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    @Override
    public String toString() {
        return "Associados{" + "nome=" + nome + ", nContribuinte=" + nContribuinte + ", anoNascimento=" + anoNascimento + '}';
    }
     
    public double calcularMensalidade(){
        double CVI = this.calcularValorIntegral();
        double CD = this.calcularDesconto();
        double mensalidade =  ( CVI * ( 1 - CD ) );
        return mensalidade;
    }
    
    abstract double calcularValorIntegral();
    
    abstract double calcularDesconto();

    
}
