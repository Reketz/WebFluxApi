package br.com.api.webfluxapi.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CEST {
    
    @Id
    private String id;
    private String cest;
    private String ncm;
    private String descricao;

    public CEST(String id, String cest, String ncm, String descricao) {
        this.id = id;
        this.cest = cest;
        this.ncm = ncm;
        this.descricao = descricao;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCest() {
        return cest;
    }

    public void setCest(String cest) {
        this.cest = cest;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
