package com.giovani.serverdesafio.resource.company;

import java.util.Date;

/**
 * Class represents Response Receita WS in fields formatted.
 * 
 */
public class ReceitaWsResponse {
  
  private String name;
  private String nameFantasy;
  private Long phone;
  private String mail;
  private String situation;
  private String district;
  private String street;
  private Long numberAddress;
  private String complement;
  private Date dtopen;
  private String legalNature;
  private Long cnpj;
  private String city;
  private String uf;
  
  public ReceitaWsResponse() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNameFantasy() {
    return nameFantasy;
  }

  public void setNameFantasy(String nameFantasy) {
    this.nameFantasy = nameFantasy;
  }

  public Long getPhone() {
    return phone;
  }

  public void setPhone(Long phone) {
    this.phone = phone;
  }

  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public String getSituation() {
    return situation;
  }

  public void setSituation(String situation) {
    this.situation = situation;
  }

  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public Long getNumberAddress() {
    return numberAddress;
  }

  public void setNumberAddress(Long numberAddress) {
    this.numberAddress = numberAddress;
  }

  public String getComplement() {
    return complement;
  }

  public void setComplement(String complement) {
    this.complement = complement;
  }


  public Date getDtopen() {
    return dtopen;
  }

  public void setDtopen(Date dtopen) {
    this.dtopen = dtopen;
  }

  public String getLegalNature() {
    return legalNature;
  }

  public void setLegalNature(String legalNature) {
    this.legalNature = legalNature;
  }

  public Long getCnpj() {
    return cnpj;
  }

  public void setCnpj(Long cnpj) {
    this.cnpj = cnpj;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getUf() {
    return uf;
  }

  public void setUf(String uf) {
    this.uf = uf;
  }

}
