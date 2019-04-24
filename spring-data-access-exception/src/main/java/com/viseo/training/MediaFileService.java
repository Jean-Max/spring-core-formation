package com.viseo.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

@Service
public class MediaFileService {

    @Autowired
    IMediaFileDao mediaFileDao;

    public void saveEmployee(MediaFile mediaFile) {
        try {
            mediaFileDao.save(mediaFile);
        }
        catch (DataAccessException dae) {
            System.err.println(dae);
        }
    }
}