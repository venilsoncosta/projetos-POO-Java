package br.com.cassino.classes;

public class Cassino {
    private Usuario usuario;
    private Loteria loteria;

    public Cassino(){
        this.usuario = new Usuario();
        this.loteria = new Loteria();
    }

    public void jogar() {
        usuario.escolherNumeros();
        loteria.sortearNumeros();
        verificarResultado();
    }

    private void verificarResultado() {
        int numerosCorretos = loteria.compararNumeros(usuario.getNumerosEscolhidos());
        if (numerosCorretos == 5) {
            System.out.println("Parabéns! Você ganhou o grande prêmio de 100 mil reais!");
        } else if (numerosCorretos == 4) {
            System.out.println("Parabéns! Você ganhou 25 mil reais!");
        } else {
            System.out.println("Infelizmente, você não ganhou nenhum prêmio. Tente novamente!");
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Loteria getLoteria() {
        return loteria;
    }

    public void setLoteria(Loteria loteria) {
        this.loteria = loteria;
    }
}
