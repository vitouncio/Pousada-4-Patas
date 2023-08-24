
package model;

public class Pet {
    private String nome;
    private String especie;
    private String raca;
    private int idade;
    private boolean hospedado;

    public Pet(String nome, String especie, String raca, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.hospedado = false; // O pet não está hospedado por padrão
    }

    public void copiar(Pet outro) {
        this.nome = outro.getNome();
        this.especie = outro.getEspecie();
        this.raca = outro.getRaca();
        this.idade = outro.getIdade();
        this.hospedado = outro.isHospedado();
    }
    
    
    @Override
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isHospedado() {
        return hospedado;
    }

    public void setHospedado(boolean hospedado) {
        this.hospedado = hospedado;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Espécie: " + especie);
        System.out.println("Raça: " + raca);
        System.out.println("Idade: " + idade);
        System.out.println("Hospedado: " + (hospedado ? "Sim" : "Não"));
    }

    public void hospedar() {
        hospedado = true;
        System.out.println(nome + " foi hospedado no Hotel PET.");
    }

    public void liberar() {
        hospedado = false;
        System.out.println(nome + " foi liberado do Hotel PET.");
    }
}
