import java.util.List;

public class GerenciarEmpregado {
    List<GerenciarEmpregado> listaEmpregados;

    public void adcionarEmpregado(Empregado e) {
        listaEmpregados.add(this);
    }


    public List<GerenciarEmpregado> ListaEmpregados() {
        return listaEmpregados;
    }

    public void removerEmpregado(Empregado e) {
        listaEmpregados.remove(this);
    }

    private boolean verificarExistencia(Empregado e) {
        if (listaEmpregados.contains(this)) {
            return true;
        } else {
            return false;
        }
    }

}
