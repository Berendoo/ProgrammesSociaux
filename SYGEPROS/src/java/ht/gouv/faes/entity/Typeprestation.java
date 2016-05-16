/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Benucci
 */
@Entity
@Table(name = "TYPEPRESTATION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Typeprestation.findAll", query = "SELECT t FROM Typeprestation t"),
    @NamedQuery(name = "Typeprestation.findByIdtypeprestation", query = "SELECT t FROM Typeprestation t WHERE t.idtypeprestation = :idtypeprestation"),
    @NamedQuery(name = "Typeprestation.findByNomprestation", query = "SELECT t FROM Typeprestation t WHERE t.nomprestation = :nomprestation"),
    @NamedQuery(name = "Typeprestation.findByDescription", query = "SELECT t FROM Typeprestation t WHERE t.description = :description")})
public class Typeprestation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@NotNull
    @Column(name = "IDTYPEPRESTATION")
    private Integer idtypeprestation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOMPRESTATION")
    private String nomprestation;
    @Size(max = 150)
    @Column(name = "DESCRIPTION")
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idtypeprestation")
    private List<Prestation> prestationList;

    public Typeprestation() {
    }

    public Typeprestation(Integer idtypeprestation) {
        this.idtypeprestation = idtypeprestation;
    }

    public Typeprestation(Integer idtypeprestation, String nomprestation) {
        this.idtypeprestation = idtypeprestation;
        this.nomprestation = nomprestation;
    }

    public Integer getIdtypeprestation() {
        return idtypeprestation;
    }

    public void setIdtypeprestation(Integer idtypeprestation) {
        this.idtypeprestation = idtypeprestation;
    }

    public String getNomprestation() {
        return nomprestation;
    }

    public void setNomprestation(String nomprestation) {
        this.nomprestation = nomprestation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @XmlTransient
    public List<Prestation> getPrestationList() {
        return prestationList;
    }

    public void setPrestationList(List<Prestation> prestationList) {
        this.prestationList = prestationList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtypeprestation != null ? idtypeprestation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Typeprestation)) {
            return false;
        }
        Typeprestation other = (Typeprestation) object;
        if ((this.idtypeprestation == null && other.idtypeprestation != null) || (this.idtypeprestation != null && !this.idtypeprestation.equals(other.idtypeprestation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        //return "ht.gouv.faes.entity.Typeprestation[ idtypeprestation=" + idtypeprestation + " ]";
        return nomprestation;
    }
    
}
