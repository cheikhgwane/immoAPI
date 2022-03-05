package com.project.immo.service;

import com.project.immo.domain.Advertisement;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface AdvertismentService {

    /**
     * Find all house advertisment
     * @return Pageable of Advertisment
     */
    Page<Advertisement> findAll(Pageable pageable);


    /**
     * Find one advertisement
     * @param id Advertisement id
     * @return  Optional object of dvertisment
     */
    Optional<Advertisement> findOne(Long id);

    /**
     * Save an advertisement entity
     * @param advertisement Advertisement object to save
     * @return saved entity
     */
    Advertisement save(Advertisement advertisement);

}
