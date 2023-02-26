package com.secdavid.tp_earchive_mock.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public class DocumentDto {

  private Document document;


  public Document getDocument() {
    return document;
  }

  public void setDocument(Document document) {
    this.document = document;
  }

  @Override
  public String toString() {
    return "{" +
        "document=" + document +
        '}';
  }

  public class Document {

    private DocumentInfo documentInfo;
    private String content;


    public DocumentInfo getDocumentInfo() {
      return documentInfo;
    }

    public void setDocumentInfo(DocumentInfo documentInfo) {
      this.documentInfo = documentInfo;
    }

    public String getContent() {
      return content;
    }

    public void setContent(String content) {
      this.content = content;
    }

    @Override
    public String toString() {
      return "Document{" +
          "documentInfo=" + documentInfo +
          ", content='" + content.substring(0, Math.min(content.length(), 100)) + (content.length() >= 100 ? "... (shortened)\'" : "\'") +
          '}';
    }

    public class DocumentInfo {

      private String dossierName;
      private String process;
      private String filename;
      private String fileExtension;
      private String function;
      private String securityClassification;
      @JsonAlias("record")
      private String recordVal;
      private String dossierID;
      private String documentID;
      private String dateTimeA;
      private String recordSeries;
      private String dataOwner;


      public String getDossierName() {
        return dossierName;
      }

      public void setDossierName(String dossierName) {
        this.dossierName = dossierName;
      }

      public String getProcess() {
        return process;
      }

      public void setProcess(String process) {
        this.process = process;
      }

      public String getFilename() {
        return filename;
      }

      public void setFilename(String filename) {
        this.filename = filename;
      }

      public String getFileExtension() {
        return fileExtension;
      }

      public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
      }

      public String getFunction() {
        return function;
      }

      public void setFunction(String function) {
        this.function = function;
      }

      public String getSecurityClassification() {
        return securityClassification;
      }

      public void setSecurityClassification(String securityClassification) {
        this.securityClassification = securityClassification;
      }

      public String getRecordVal() {
        return recordVal;
      }

      public void setRecordVal(String recordVal) {
        this.recordVal = recordVal;
      }

      public String getDossierID() {
        return dossierID;
      }

      public void setDossierID(String dossierID) {
        this.dossierID = dossierID;
      }

      public String getDocumentID() {
        return documentID;
      }

      public void setDocumentID(String documentID) {
        this.documentID = documentID;
      }

      public String getDateTimeA() {
        return dateTimeA;
      }

      public void setDateTimeA(String dateTimeA) {
        this.dateTimeA = dateTimeA;
      }

      public String getRecordSeries() {
        return recordSeries;
      }

      public void setRecordSeries(String recordSeries) {
        this.recordSeries = recordSeries;
      }

      public String getDataOwner() {
        return dataOwner;
      }

      public void setDataOwner(String dataOwner) {
        this.dataOwner = dataOwner;
      }

      @Override
      public String toString() {
        return "DocumentInfo{" +
            "dossierName='" + dossierName + '\'' +
            ", process='" + process + '\'' +
            ", filename='" + filename + '\'' +
            ", fileExtension='" + fileExtension + '\'' +
            ", function='" + function + '\'' +
            ", securityClassification='" + securityClassification + '\'' +
            ", record='" + recordVal + '\'' +
            ", dossierID='" + dossierID + '\'' +
            ", documentID='" + documentID + '\'' +
            ", dateTimeA='" + dateTimeA + '\'' +
            ", recordSeries='" + recordSeries + '\'' +
            ", dataOwner='" + dataOwner + '\'' +
            '}';
      }
    }
  }
}