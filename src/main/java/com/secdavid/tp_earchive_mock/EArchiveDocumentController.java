package com.secdavid.tp_earchive_mock;

import com.secdavid.tp_earchive_mock.dto.DocumentDto;
import com.secdavid.tp_earchive_mock.services.DocumentService;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services/earchive.rest/")
public class EArchiveDocumentController {

  private static final Logger LOGGER = Logger.getLogger(EArchiveDocumentController.class.getName());

  @Autowired
  DocumentService documentService;

  @PostMapping(value = "/documents", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public Map<String, String> receiveDocument(@RequestBody DocumentDto document) {
    LOGGER.log(Level.INFO, () -> String.format("Received document: %s", document.toString()));
    documentService.create(document);
    return Map.of("result", "ok", "receiveDocument", document.getDocument().getDocumentInfo().getDocumentID());
  }

}
