package kg.itacademy.client.model;

import kg.itacademy.client.enums.FileType;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class FileModel {
    private String name;
    private String path;
    private String extension;
    private FileType fileType;

}
