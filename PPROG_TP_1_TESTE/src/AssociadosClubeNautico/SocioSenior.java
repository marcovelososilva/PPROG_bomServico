 package AssociadosClubeNautico;

import java.util.Calendar;

/**
 *
 * @author Marco-115883 | Joao-1161313 (1NB)
 */
public class SocioSenior extends Associados {
    private String IDSenior;
    private boolean dirigente;
    private static final boolean DIRIGENTE_POR_DEFEITO = false;
    
    private final String tagSSenior = "SSenior-";
    private static final int yeartoday = Calendar.getInstance().get(Calendar.YEAR);
    private static int valorBase = 150;
    private static float descontoBase= (float) 0.10;
    private static int SSContador = 1;

    /**
    * Construtor - Socio Senior com Parametros
    * 
    * @param numAulasSemanais  int numAulasSemanais
    * @param nome  int nome
    * @param nContribuinte  int Contribuinte
    * @param anoNascimento  int anoNascimento
    * @param encEducacao  String encEducacao
    * @param dirigente boolean dirigente
    *  
    */
    public SocioSenior(String nome, int nContribuinte, int anoNascimento,boolean dirigente) {
        super(nome, nContribuinte, anoNascimento);
        this.dirigente = dirigente;
        this.IDSenior= tagSSenior+ SSContador;
        SSContador++;
    }

    /**
    * Construtor - Socio Senior sem Parametros
    * 
    */
    public SocioSenior() {
        super();
        this.dirigente = DIRIGENTE_POR_DEFEITO;
        this.IDSenior= tagSSenior+ SSContador;
        SSContador++;
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
     * Get the value of desconto
     *
     * @return o valor
     */
    public float getDescontoBase() {
        return descontoBase;
    }

    /**
     * Get the value of valorBase
     *
     * @return the value of valorBase
     */
    public int getValorBase() {
        return valorBase;
    }

    /**
     * Get the value of ID DO Senior
     *
     * @return the value of getIDSENIOR
     */
    public String getIDSenior() {
        return IDSenior;
    }

    /**
     * Set the value of desconto
     *
     * @param desconto new value of desconto
     */
    public void setDescontoBase(float descontoBase) {
        this.descontoBase = descontoBase;
    }
    
    /**
     * Set the value of valorBase
     *
     * @param valorBase new value of valorBase
     */
    public void setValorBase(int valorBase) {
        this.valorBase = valorBase;
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
        return "Socio Senior: ID=" + IDSenior + super.toString() + ", é Dirigente=" + dirigente + ".";
    }
   
    @Override
    double calcularDesconto(){
        if (this.dirigente){
            return 1;
        }else{
            if ((int)(yeartoday-this.getAnoNascimento())>99){
                return 1;
        }else{
            int decada=(int)(yeartoday-this.getAnoNascimento())/10;
        return (double) decada*descontoBase;
        }}
    }
    @Override
    double calcularValorIntegral() {
        return valorBase;
    }
    
    
    
}
