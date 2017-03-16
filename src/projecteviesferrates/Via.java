/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteviesferrates;

import java.util.Objects;

/**
 *
 * @author alumne
 */
public class Via {
   
    private String nomvia = null;
    private String localitat = null;
    private String regio = null;
    private String provincia = null;
    private boolean material = false;
    private boolean dificultat = false;
    private int desnivel = 0;
    private float longitut = 0;
    private char esdificultat = ' ';
    private char esmaterial = ' ';
    private boolean omplit = false;

   
    
    
    
    public String getNomvia() {
        return nomvia;
    }

    @Override
    public String toString() {
        return "Via{" + "nomvia=" + nomvia + ", localitat=" + localitat + ", regio=" + regio + ", provincia=" + provincia + ", material=" + material + ", dificultat=" + dificultat + ", desnivel=" + desnivel + ", longitut=" + longitut + ", esdificultat=" + esdificultat + ", esmaterial=" + esmaterial + ", omplit=" + omplit + '}';
    }


    public void setNomvia(String nomvia) {
        this.nomvia = nomvia;
    }

    public String getLocalitat() {
        return localitat;
    }

    public void setLocalitat(String localitat) {
        this.localitat = localitat;
    }

    public String getRegio() {
        return regio;
    }

    public void setRegio(String regio) {
        this.regio = regio;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public boolean isMaterial() {
        return material;
    }

    public void setMaterial(boolean material) {
        this.material = material;
    }

    public boolean isDificultat() {
        return dificultat;
    }

    public void setDificultat(boolean dificultat) {
        this.dificultat = dificultat;
    }

    public int getDesnivel() {
        return desnivel;
    }

    public void setDesnivel(int desnivel) {
        this.desnivel = desnivel;
    }

    public float getLongitut() {
        return longitut;
    }

    public void setLongitut(float longitut) {
        this.longitut = longitut;
    }

    public char getEsdificultat() {
        return esdificultat;
    }

    public void setEsdificultat(char esdificultat) {
        this.esdificultat = esdificultat;
    }

    public char getEsmaterial() {
        return esmaterial;
    }

    public void setEsmaterial(char esmaterial) {
        this.esmaterial = esmaterial;
    }

    public boolean isOmplit() {
        return omplit;
    }

    public void setOmplit(boolean omplit) {
        this.omplit = omplit;
    }

}
