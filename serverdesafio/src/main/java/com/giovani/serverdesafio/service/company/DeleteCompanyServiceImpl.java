package com.giovani.serverdesafio.service.company;

import com.giovani.serverdesafio.repository.CompanyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteCompanyServiceImpl {
  
  @Autowired
  private CompanyRepository companyRepository;

  public void delete(Long id){
    companyRepository.deleteById(id);
  }
}
