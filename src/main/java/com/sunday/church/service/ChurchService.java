package com.sunday.church.service;

import com.sunday.church.model.Church;
import com.sunday.church.repository.ChurchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by novot on 2017-05-28.
 */
@Service
public class ChurchService {
    @Autowired
    private ChurchRepository churchRepository;

    public int insert(Church church) {
        return churchRepository.insert(church);
    }

    public Church getChurchInfo(long serial) {
        return churchRepository.getChurchInfo(serial);
    }

    public List<Church> getChurchList() {
        return churchRepository.getChurchList();
    }
}
