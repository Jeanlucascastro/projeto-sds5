package com.devsuperior.dsvendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.entities.Sale;
import com.devsuperior.dsvendas.repositories.SaleRepository;
import com.devsuperior.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {

	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	
	@Transactional(readOnly = true) // tudo resolvido aqui, sem fazer 'loki"
	public Page<SaleDTO> findall(Pageable pegeable){
		sellerRepository.findAll(); // armazenar tudo em cache
		Page<Sale> result = repository.findAll(pegeable);
		return result.map(x -> new SaleDTO(x));
		
	}
	
}
