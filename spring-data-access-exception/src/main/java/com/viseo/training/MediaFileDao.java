package com.viseo.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import javax.annotation.PostConstruct;
import javax.sql.DataSource;

@Repository
public class MediaFileDao implements IMediaFileDao {

    @Autowired
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    @PostConstruct
    private void postConstruct() {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void save(MediaFile mediaFile) {
        String sql = "insert into MEDIA_FILE (TITLE) values (?)";
        jdbcTemplate.update(sql, mediaFile.getTitle());
    }
}