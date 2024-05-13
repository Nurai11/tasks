package kg.itacademy.client.entity;

import kg.itacademy.client.enums.FileType;

import javax.persistence.*;

@Table(name = "app_file")
@Entity
public class FIleEntity extends BaseEntity{
    @Column(name = "name")
    private String name;

    @Column(name = "path")
    private String path;

    @Column(name = "extension")
    private String extension;

    @Column(name = "type")
    @Enumerated(value = EnumType.ORDINAL)
    private FileType fileType;


}
