package kg.itacademy.client.repository;

import kg.itacademy.client.entity.ClientEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<ClientEntity, Long> {
    int countAllByFirstname(String firstname);

    @Query(value = "SELECT count(*) FROM client c WHERE c.firstname = ?1", nativeQuery = true)
    int customCountByFirstname(String firstname);

    @Query(value = "SELECT count(c) FROM ClientEntity c WHERE c.firstname = ?1")
    int customHqlCountByFirstname(String firstname);
}
