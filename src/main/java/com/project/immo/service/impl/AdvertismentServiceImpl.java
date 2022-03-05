package com.project.immo.service.impl;

import com.project.immo.domain.Advertisement;
import com.project.immo.repository.AdvertisementRepository;
import com.project.immo.service.AdvertismentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Service Implementation for managing {@link Advertisement}.
 */
@Service
@Transactional
public class AdvertismentServiceImpl implements AdvertismentService {

    private final Logger log = LoggerFactory.getLogger(AdvertismentServiceImpl.class);


    private final AdvertisementRepository advertisementRepository;

    public AdvertismentServiceImpl(AdvertisementRepository advertisementRepository) {
        this.advertisementRepository = advertisementRepository;
    }

    @Override
    public Page<Advertisement> findAll(Pageable page) {
        log.debug("Request to find all advertisement");
        return advertisementRepository.findAll(page);
    }

    @Override
    public Optional<Advertisement> findOne(Long id) {
        log.debug("Request to find advertisement with id [{}]", id);
        return advertisementRepository.findById(id);
    }

    @Override
    public Advertisement save(Advertisement advertisement) {
        log.debug("Request to save advertisement [{}]", advertisement);
        return advertisementRepository.save(advertisement);
    }
}
