package kg.itacademy.client.service.impl;

import kg.itacademy.client.entity.ClientEntity;
import kg.itacademy.client.model.ClientModel;
import kg.itacademy.client.repository.ClientRepository;
import kg.itacademy.client.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Service
public class ClientServiceImpl implements ClientService {
    private Map<Integer, ClientModel> storages = new HashMap<>();

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public ClientModel createClient(ClientModel clientModel) {
        ClientEntity clientEntity = new ClientEntity();
        clientEntity.setFirstname(clientModel.getFirstname());
        clientEntity.setLastname(clientModel.getLastname());
        clientEntity.setPhoneNumber(clientModel.getPhoneNumber());
        clientEntity.getId();//null
        clientEntity.setCreatedAt(LocalDateTime.now());
        clientEntity = clientRepository.save(clientEntity);
        clientEntity.getId();//1
        ClientModel response = new ClientModel();
        response.setClientId(clientEntity.getId());
        response.setFirstname(clientEntity.getFirstname());
        response.setLastname(clientEntity.getLastname());
        return response;
    }

    @Override
    public boolean deleteClient(Integer clientId) {
        return storages.remove(clientId, storages.get(clientId));
    }

    @Override
    public boolean updateClient(ClientModel clientModel) {
        return false;
    }

    @Override
    public ClientModel getClient(Integer ClientId) {
        return null;
    }

    @Override
    public ClientModel getClient(Long ClientId) {
        ClientEntity exist = clientRepository.findById(ClientId).get();
        ClientModel clientModel = new ClientModel();
        clientModel.setClientId(exist.getId());
        clientModel.setFirstname(exist.getFirstname());
        clientModel.setLastname(exist.getLastname());
        return clientModel;
    }
}
