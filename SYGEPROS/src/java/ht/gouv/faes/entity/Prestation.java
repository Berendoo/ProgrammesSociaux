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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Benucci
 */
@Entity
@Table(name = "PRESTATION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Prestation.findAll", query = "SELECT p FROM Prestation p"),
    @NamedQuery(name = "Prestation.findByIdprestation", query = "SELECT p FROM Prestation p WHERE p.idprestation = :idprestation")})
public class Prestation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@NotNull
    @Column(name = "IDPRESTATION")
    private Integer idprestation;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idprestation")
    private List<Detailsprestation> detailsprestationList;
    @JoinColumn(name = "IDDISTRIBUTEUR", referencedColumnName = "IDDISTRIBUTEUR")
    @ManyToOne(optional = false)
    private Distributeur iddistributeur;
    @JoinColumn(name = "IDTYPEPRESTATION", referencedColumnName = "IDTYPEPRESTATION")
    @ManyToOne(optional = false)
    private Typeprestation idtypeprestation;

    public Prestation() {
    }

    public Prestation(Integer idprestation) {
        this.idprestation = idprestation;
    }

    public Integer getIdprestation() {
        return idprestation;
    }

    public void setIdprestation(Integer idprestation) {
        this.idprestation = idprestation;
    }

    @XmlTransient
    public List<Detailsprestation> getDetailsprestationList() {
        return detailsprestationList;
    }

    public void setDetailsprestationList(List<Detailsprestation> detailsprestationList) {
        this.detailsprestationList = detailsprestationList;
    }

    public Distributeur getIddistributeur() {
        return iddistributeur;
    }

    public void setIddistributeur(Distributeur iddistributeur) {
        this.iddistributeur = iddistributeur;
    }

    public Typeprestation getIdtypeprestation() {
        return idtypeprestation;
    }

    public void setIdtypeprestation(Typeprestation idtypeprestation) {
        this.idtypeprestation = idtypeprestation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idprestation != null ? idprestation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prestation)) {
            return false;
        }
        Prestation other = (Prestation) object;
        if ((this.idprestation == null && other.idprestation != null) || (this.idprestation != null && !this.idprestation.equals(other.idprestation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ht.gouv.faes.entity.Prestation[ idprestation=" + idprestation + " ]";
    }
    
}
