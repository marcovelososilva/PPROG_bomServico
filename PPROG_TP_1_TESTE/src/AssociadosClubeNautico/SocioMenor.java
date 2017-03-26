package AssociadosClubeNautico;

/**
 *
 * @author Marco-115883 | Joao-1161313 (1NB)
 */
public class SocioMenor extends SocioJovem {
    private String encarregadoEducacao;
    private String IDMenor;
    
    private final String tagMenor = "SMenor-";
    private static double desconto = 0.20;
    private static int SMContador = 1;
    
    private final String ENCARREGADOSEDUCACAO_POR_DEFEITO = "default Encarregados Educação";
    
    /**
    * Construtor - Socio Menor sem Parametros
    * 
    */
    public SocioMenor() {
        super();
        this.encarregadoEducacao = ENCARREGADOSEDUCACAO_POR_DEFEITO;
        this.IDMenor = tagMenor + SMContador;
        SMContador++;
    }

    /**
    * Construtor - Socio Menor com Parametros
    * @param numAulasSemanais  int numAulasSemanais
    * @param nome  int nome
    * @param nContribuinte  int Contribuinte
    * @param anoNascimento  int anoNascimento
    * @param encEducacao  String encEducacao
    *  
    */
    public SocioMenor(String nome, int nContribuinte, int anoNascimento, String encarregadoEducacao, int numAulasSemanais) {
        super(numAulasSemanais, nome, nContribuinte, anoNascimento);
        this.encarregadoEducacao = encarregadoEducacao;
        this.IDMenor = tagMenor + SMContador;
        SMContador++;
    }
    
    
    
    /**
     * Get the value of ENCARREGADOS DE EDUCAÇÃO NOME
     *
     * @return the value of encarregadoEducacao
     */
    public String getEncarregadoEducacao() {
        return encarregadoEducacao;
    }

    /**
     * Set the value of ENCARREGADOS DE EDUCAÇÃO NOME
     *
     * @param encarregadoEducacao  String to change the old encarregadoEducacao
     * @return void 
     */
    public void setEncarregadoEducacao(String encarregadoEducacao) {
        this.encarregadoEducacao = encarregadoEducacao;
    }

    /**
     * Get the value of ID MENORES
     *
     * @return the value of IDMenor
     */
    public String getIDMenor() {
        return IDMenor;
    }       

    @Override
    public String toString() {
        return "Socio Menor: ID=" + IDMenor + super.toString() + " e o seu Encarregado de Educação= " + encarregadoEducacao +".";
    }
    
    
            
    @Override
    double calcularDesconto() {
        return desconto;
    }

    
}
