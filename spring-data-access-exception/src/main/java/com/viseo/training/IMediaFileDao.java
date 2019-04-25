package com.viseo.training;

public interface IMediaFileDao {

    /**
     * Add a new media file into database
     * @param mediaFile
     */
    void save(MediaFile mediaFile);
}
