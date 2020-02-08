package com.lzkill.sgq.service;

import com.lzkill.sgq.domain.AnaliseConsultoria;
import com.lzkill.sgq.repository.AnaliseConsultoriaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Service Implementation for managing {@link AnaliseConsultoria}.
 */
@Service
@Transactional
public class AnaliseConsultoriaService {

    private final Logger log = LoggerFactory.getLogger(AnaliseConsultoriaService.class);

    private final AnaliseConsultoriaRepository analiseConsultoriaRepository;

    public AnaliseConsultoriaService(AnaliseConsultoriaRepository analiseConsultoriaRepository) {
        this.analiseConsultoriaRepository = analiseConsultoriaRepository;
    }

    /**
     * Save a analiseConsultoria.
     *
     * @param analiseConsultoria the entity to save.
     * @return the persisted entity.
     */
    public AnaliseConsultoria save(AnaliseConsultoria analiseConsultoria) {
        log.debug("Request to save AnaliseConsultoria : {}", analiseConsultoria);
        return analiseConsultoriaRepository.save(analiseConsultoria);
    }

    /**
     * Get all the analiseConsultorias.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public Page<AnaliseConsultoria> findAll(Pageable pageable) {
        log.debug("Request to get all AnaliseConsultorias");
        return analiseConsultoriaRepository.findAll(pageable);
    }


    /**
     * Get one analiseConsultoria by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<AnaliseConsultoria> findOne(Long id) {
        log.debug("Request to get AnaliseConsultoria : {}", id);
        return analiseConsultoriaRepository.findById(id);
    }

    /**
     * Delete the analiseConsultoria by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Long id) {
        log.debug("Request to delete AnaliseConsultoria : {}", id);
        analiseConsultoriaRepository.deleteById(id);
    }
}
