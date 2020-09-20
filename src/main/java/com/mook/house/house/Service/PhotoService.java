package com.mook.house.house.Service;

import domain.Photo;

public interface PhotoService {
    Integer getMaxId();
    int addPhoto(Photo photo);
}
