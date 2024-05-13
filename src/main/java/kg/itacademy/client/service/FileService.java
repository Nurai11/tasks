package kg.itacademy.client.service;

import kg.itacademy.client.model.FileModel;
import kg.itacademy.client.model.FileUploadModel;
import org.springframework.web.multipart.MultipartFile;

public interface FileService {
    FileModel createNewModel(FileUploadModel file);

}
