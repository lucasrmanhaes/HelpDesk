package br.com.helpticket.model;

public enum UserAtivo {
    ATIVO("Ativo"),
    INATIVO("Inativo");

    private final String descricao;

    UserAtivo(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
