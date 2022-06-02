public class ParametroInss {
    public static final double faixa1 = 0.075;
    public static final double limiteFaixa1 = 1212.0;
    public static final double faixa2 = 0.09;
    public static final double limiteFaixa2 = 2427.35;
    public static final double faixa3 = 0.12;
    public static final double limiteFaixa3 = 3641.03;
    public static final double faixa4 = 0.14;
    public static final double limiteFaixa4 = 7087.22;

    public double calcularInss(double valor) {
        if(valor<=limiteFaixa1) {
            return valor*faixa1;
        } else if(valor<=limiteFaixa2){
            return (limiteFaixa1*faixa1 + (valor-limiteFaixa1)*faixa2);
        } else if (valor<=limiteFaixa3) {
            return (limiteFaixa1*faixa1 + (limiteFaixa2-limiteFaixa1)*faixa2 + (valor-limiteFaixa2) * faixa3);
        } else if (valor<=limiteFaixa4) {
            return (limiteFaixa1*faixa1 + (limiteFaixa2-limiteFaixa1)*faixa2 + (limiteFaixa3-limiteFaixa2) * faixa3 + (valor-limiteFaixa3) * faixa4);
        } else {
            return faixa4*limiteFaixa4;
        }
    }
}
