package br.com.munif.pocs.matera.cucumberposit;

import java.util.Objects;

public class Pessoa {

    private String doc;

    private String tipo;

    public Pessoa() {
    }

    public Pessoa(String doc) {
        this.doc = doc;
        if (doc.length()==11){
            this.tipo="1";
        }
        if (doc.length()==14){
            this.tipo="2";
        }
        if (doc.length()==8){
            this.tipo="3";
        }

    }
    
    

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (Objects.equals("3", other.tipo) && this.doc.startsWith(other.doc)) {
            return true;
        }        
        
        if (!Objects.equals(this.doc, other.doc)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        return true;
    }
    
    

}
