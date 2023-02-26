package com.secdavid.tp_earchive_mock.services;

import com.secdavid.tp_earchive_mock.dto.DocumentDto;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class DocumentService {

  private static final int MAX_LENGTH = 1000;
  List<DocumentDto> documents = new LinkedList<>();

  public List<DocumentDto> list() {
    return documents;
  }

  public void create(DocumentDto documentDto) {
    while (documents.size() >= MAX_LENGTH) {
      documents.remove(0);
    }
    documents.add(documentDto);
  }

  public Optional<DocumentDto> get(String documentId) {
    return documents.stream().filter(documentDto -> (documentDto.getDocument().getDocumentInfo().getDocumentID().equals(documentId))).findFirst();
  }

  public boolean delete(String documentId) {
    Optional<DocumentDto> documentToDelete = documents.stream().filter(documentDto -> (documentDto.getDocument().getDocumentInfo().getDocumentID().equals(documentId))).findFirst();
    if (documentToDelete.isPresent()) {
      return documents.remove(documentToDelete.get());
    }
    return false;
  }

  public void clear() {
    documents.clear();
  }

}
