package kg.itacademy.client.controller;

import kg.itacademy.client.model.DocumentModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/document")
public class DocumentRestController {

    @PostMapping
    public ResponseEntity<?> createNewDocument(@RequestBody DocumentModel documentModel){
        return null;
    }

    @PostMapping("/image/upload")
    public ResponseEntity<?> uploadImage(@ModelAttribute("file") MultipartFile multipartFile){
        return null;
    }

}
