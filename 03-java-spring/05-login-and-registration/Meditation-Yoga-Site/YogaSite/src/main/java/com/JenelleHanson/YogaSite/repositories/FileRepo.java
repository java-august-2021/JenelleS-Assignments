package com.JenelleHanson.YogaSite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JenelleHanson.YogaSite.models.FileModel;

@Repository
public interface FileRepo extends JpaRepository<FileModel, String>{

}
