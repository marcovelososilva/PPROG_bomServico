package AssociadosClubeNautico;

/**
 *
 * @author Marco-115883 | Joao-1161313 (1NB)
 */
public abstract class SocioJovem extends Associados{
    private int numAulasSemanais;
    
    private final int NUM_AULAS_SEMANAIS_POR_DEFEITO = 0;
    private static double valorPorAula = 25.0;
    private static double mensalidadeMaxima = 100.0;

    /**
    * Construtor - Socio Jovem sem Parametros
    * 
    */
    public SocioJovem() {
        super();
        this.numAulasSemanais = NUM_AULAS_SEMANAIS_POR_DEFEITO;
    }

    /**
    * Construtor - Socio Jovem com Parametros
    * 
    * @param numAulasSemanais  int numAulasSemanais
    * @param nome  int nome
    * @param nContribuinte  int Contribuinte
    * @param anoNascimento  int anoNascimento
    */
    public SocioJovem(int numAulasSemanais, String nome, int nContribuinte, int anoNascimento) {
        super(nome, nContribuinte, anoNascimento);
        this.numAulasSemanais = numAulasSemanais;
    }
        
    /**
     * Get the value of NÚMERO DE AULAS SEMANAIS
     *
     * @return the value of numAulasSemanais
     */
    public int getNumAulasSemanais() {
        return numAulasSemanais;
    }

    /**
     * Set the value of NÚMERO DE AULAS SEMANAIS
     *
     * @param NumAulasSemanais  int to change the old numAulasSemanais
     * @return void 
     */
    public void setNumAulasSemanais(int numAulasSemanais) {
        this.numAulasSemanais = numAulasSemanais;
    }
    
    /**
     * Get the value of VALOR POR AULA
     *
     * @return the value of valorPorAula
     */
    public static double valorPorAula() {
        return valorPorAula;
    }

    /**
     * Set the value of VALOR POR AULA
     *
     * @param valorPorAula  double to change the old valorPorAula
     * @return void 
     */
    public static void valorPorAula(double valorPorAulaNew) {
        valorPorAula = valorPorAulaNew;
    }
    
    /**
     * Get the value of MENSALIDADE MAXIMA
     *
     * @return the value of mensalidadeMaxima
     */
    public static double mensalidadeMaxima() {
        return mensalidadeMaxima;
    }

    /**
     * Set the value of MENSALIDADE MAXIMA
     *
     * @param mensalidadeMaxima  double to change the old mensalidadeMaxima
     * @return void 
     */
    public static void mensalidadeMaxima(double mensalidadeMaximaNew) {
        mensalidadeMaxima = mensalidadeMaximaNew;
    }

    @Override
    public String toString() {
        return super.toString() +  " Número de Aulas Semanais= " + numAulasSemanais;
    }
    
    
     
    @Override
    double calcularValorIntegral() {
        double mensalidadeSemDesconto = this.numAulasSemanais * valorPorAula;
        return (mensalidadeSemDesconto > mensalidadeMaxima) ? mensalidadeMaxima : mensalidadeSemDesconto;
    }

    
}