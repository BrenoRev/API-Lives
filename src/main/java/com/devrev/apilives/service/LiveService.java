package com.devrev.apilives.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devrev.apilives.Repository.LiveRepository;
import com.devrev.apilives.entity.Live;


@Service
public class LiveService {

	@Autowired
	private LiveRepository liveRepository;
	
	public Page<Live> findAll(Pageable pageable, String flag){
        if(flag != null && flag.equals("next")){
            return liveRepository.findByLiveDateAfterOrderByLiveDateAsc(LocalDateTime.now(), pageable);
        }else if(flag != null && flag.equals("previous")){
            return liveRepository.findByLiveDateBeforeOrderByLiveDateDesc(LocalDateTime.now(), pageable);
        }else{
            return liveRepository.findAll(pageable);
        }
    }

    public Optional<Live> findById(Long id){
        return liveRepository.findById(id);
    }

    public Live save(Live Live){
        return liveRepository.save(Live);
    }

    public void delete(Live Live){
        liveRepository.delete(Live);
    }
}
