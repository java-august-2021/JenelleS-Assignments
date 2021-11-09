package com.JenelleHanson.YogaSite.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.JenelleHanson.YogaSite.FileErrors;
import com.JenelleHanson.YogaSite.FileNotFoundException;
import com.JenelleHanson.YogaSite.FileSaveException;
import com.JenelleHanson.YogaSite.models.FileModel;
import com.JenelleHanson.YogaSite.repositories.FileRepo;
@Service
public class FileService {
    @Autowired
    FileRepo fileRepo;

    public FileModel saveFile(MultipartFile file) {

        String filename = StringUtils.cleanPath(file.getOriginalFilename());

        try {

            if (filename.contains("...")) {
                throw new FileSaveException(FileErrors.INVALID_FILE + filename);
            }

            FileModel model = new FileModel(filename, file.getContentType(), file.getBytes());
            return fileRepo.save(model);

        } catch (Exception e) {

            throw new FileSaveException(FileErrors.FILE_NOT_STORED, e);
        }

    }

    public FileModel getFile(String fileId) {

        return fileRepo.findById(fileId).orElseThrow(() -> new FileNotFoundException(FileErrors.FILE_NOT_FOUND + fileId));
    }

    public List<FileModel> getListOfFiles(){

        return fileRepo.findAll();
    }
}
