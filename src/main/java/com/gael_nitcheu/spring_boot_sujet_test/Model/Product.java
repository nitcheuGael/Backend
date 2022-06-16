package com.gael_nitcheu.spring_boot_sujet_test.Model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nameProduct;
    private String taglineProduct;
    private String lienProduct;
    private String lienTwitter;
    private String topicProduit;
    private String descriptionProduct;
    private String thumbnailProduct;
    private String travailProduct;
    private String lieuTraivailProduct;
    private String pricingProduct;
    private String lienYoutubeProduct;
    private String dureeOffreProduct;
    private String promocodeProduit;
    private String commentaire;
    private Date dateProduct;
    private String statut;

    


    public Product() {
    }


    public Product(Long id, String nameProduct, String taglineProduct, String lienProduct, String lienTwitter, String topicProduit, String descriptionProduct, String thumbnailProduct, String travailProduct, String lieuTraivailProduct, String pricingProduct, String lienYoutubeProduct, String dureeOffreProduct, String promocodeProduit, String commentaire, Date dateProduct, String statut) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.taglineProduct = taglineProduct;
        this.lienProduct = lienProduct;
        this.lienTwitter = lienTwitter;
        this.topicProduit = topicProduit;
        this.descriptionProduct = descriptionProduct;
        this.thumbnailProduct = thumbnailProduct;
        this.travailProduct = travailProduct;
        this.lieuTraivailProduct = lieuTraivailProduct;
        this.pricingProduct = pricingProduct;
        this.lienYoutubeProduct = lienYoutubeProduct;
        this.dureeOffreProduct = dureeOffreProduct;
        this.promocodeProduit = promocodeProduit;
        this.commentaire = commentaire;
        this.dateProduct = dateProduct;
        this.statut = statut;
    }
   

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameProduct() {
        return this.nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getTaglineProduct() {
        return this.taglineProduct;
    }

    public void setTaglineProduct(String taglineProduct) {
        this.taglineProduct = taglineProduct;
    }

    public String getLienProduct() {
        return this.lienProduct;
    }

    public void setLienProduct(String lienProduct) {
        this.lienProduct = lienProduct;
    }

    public String getTopicProduit() {
        return this.topicProduit;
    }

    public void setTopicProduit(String topicProduit) {
        this.topicProduit = topicProduit;
    }

    public String getDescriptionProduct() {
        return this.descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    public String getThumbnailProduct() {
        return this.thumbnailProduct;
    }

    public void setThumbnailProduct(String thumbnailProduct) {
        this.thumbnailProduct = thumbnailProduct;
    }

    public String isTravailProduct() {
        return this.travailProduct;
    }

    public String getTravailProduct() {
        return this.travailProduct;
    }

    public void setTravailProduct(String travailProduct) {
        this.travailProduct = travailProduct;
    }

    public String getLieuTraivailProduct() {
        return this.lieuTraivailProduct;
    }

    public void setLieuTraivailProduct(String lieuTraivailProduct) {
        this.lieuTraivailProduct = lieuTraivailProduct;
    }

    public String getPricingProduct() {
        return this.pricingProduct;
    }

    public void setPricingProduct(String pricingProduct) {
        this.pricingProduct = pricingProduct;
    }

    public String getLienYoutubeProduct() {
        return this.lienYoutubeProduct;
    }

    public void setLienYoutubeProduct(String lienYoutubeProduct) {
        this.lienYoutubeProduct = lienYoutubeProduct;
    }

    public String getDureeOffreProduct() {
        return this.dureeOffreProduct;
    }

    public void setDureeOffreProduct(String dureeOffreProduct) {
        this.dureeOffreProduct = dureeOffreProduct;
    }

    public String getPromocodeProduit() {
        return this.promocodeProduit;
    }

    public void setPromocodeProduit(String promocodeProduit) {
        this.promocodeProduit = promocodeProduit;
    }

    public String getCommentaire() {
        return this.commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Date getDateProduct() {
        return this.dateProduct;
    }

    public void setDateProduct(Date dateProduct) {
        this.dateProduct = dateProduct;
    }

    public String getLienTwitter() {
        return this.lienTwitter;
    }

    public void setLienTwitter(String lienTwitter) {
        this.lienTwitter = lienTwitter;
    }

    public String getStatut() {
        return this.statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

}
