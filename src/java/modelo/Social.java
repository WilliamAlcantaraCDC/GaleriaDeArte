/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author William Alcântara Coelho da Cruz
 */
@Entity
@Table(name="Agravante")
public class Social  {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;
    @Column(name = "primeira_vitima", nullable = true)
    private String sexo;
    private String idade;
    private String total_mortes_brasil; 
    @Temporal(TemporalType.DATE)
    @Column(name = "data_morte", nullable = true)
    private Calendar dataMorte;
  


    public int getId() {
        return id;
    }

   
    public String getTitulo() {
        return titulo;
    }

    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

     
    public String getSexo() {
        return sexo;
    }

    
    public void setSexo(String sexo) {   
        this.sexo = sexo;
    }

    public String getTotal_mortes_brasil() {
        return total_mortes_brasil;
    }

    public void setTotal_mortes_brasil(String total_mortes_brasil) {
        this.total_mortes_brasil = total_mortes_brasil;
    }

       
    public void setIdade(String idade) {   
        this.idade = idade;
    }

    public Calendar getDataMorte() {
        return dataMorte;
    }

    public void setDataMorte(Calendar dataMorte) {
        this.dataMorte = dataMorte;
    }

   
    


     
}