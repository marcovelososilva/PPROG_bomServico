package AssociadosClubeNautico;

/**
 *
 * @author Marco-115883 | Joao-1161313 (1NB)
 */
public class SocioAdulto extends SocioJovem {
    private final String IDAdulto;
    private boolean dirigente;
    
    private final String tagAdulto = "SAdulto-";
    private static int SAContador = 1;
    private static final boolean DIRIGENTE_POR_DEFEITO = false;

    /**
    * Construtor - Socio Adulto sem Parametros
    * 
    */
    public SocioAdulto() {
        super();
        this.dirigente = DIRIGENTE_POR_DEFEITO;
        this.IDAdulto = tagAdulto + SAContador;
        SAContador ++;
    }
    
    /**
    * Construtor - Socio Adulto com Parametros
    *
    * @param numAulasSemanais  int numAulasSemanais
    * @param nome  int nome
    * @param nContribuinte  int Contribuinte
    * @param anoNascimento  int anoNascimento 
    *  * @param dirigente  int dirigente
    */
    public SocioAdulto(String nome, int nContribuinte, int anoNascimento, int numAulasSemanais, boolean dirigente) {
        super(numAulasSemanais, nome, nContribuinte, anoNascimento);
        this.dirigente = dirigente;
        this.IDAdulto = tagAdulto + SAContador;
        SAContador++;
    }
  
    
    /**
     * Get the value of ID DO ADULTO
     *
     * @return the value of getIDADULTO
     */
    public String getIDAdulto() {
        return IDAdulto;
    }

    /**
     * Get the value of É DIRIGENTE?
     *
     * @return the value TRUE/FALSE of Dirigente
     */
    public boolean isDirigente() {
        return dirigente;
    }

    /**
     * Set the value of DIRIGENTE
     *
     * @param Dirigente  String to change the old Dirigente
     * @return void 
     */
    public void setDirigente(boolean dirigente) {
        this.dirigente = dirigente;
    }

    @Override
    public String toString() {
        return "Socio Adulto: ID=" + IDAdulto + super.toString() + ", é Dirigente=" + dirigente + ".";
    }
   
    
    
    @Override
    double calcularDesconto() {
       return (dirigente) ? 1 : 0;
    }


}
