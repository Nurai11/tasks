package kg.itacademy.client.entity;

import javax.persistence.*;

@Table(name = "document")
@Entity
public class DocumentEntity extends BaseEntity{
    @ManyToOne
    @JoinColumn(name = "fk_client_id")
    private ClientEntity client;

    @ManyToOne
    @JoinColumn(name = "fk_file_id")
    private FIleEntity fIle;

}
