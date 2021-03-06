/*
 * DRACOON
 * Version 4.4.0 - built at: 2017-12-04 04:14:43, API server: https://demo.dracoon.com/api/v4
 *
 * OpenAPI spec version: 4.4.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ch.cyberduck.core.sds.io.swagger.client.model;

import java.util.Objects;
import ch.cyberduck.core.sds.io.swagger.client.model.ObjectExpiration;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CreateFileUploadRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-03T10:55:56.129+02:00")
public class CreateFileUploadRequest {
  @JsonProperty("parentId")
  private Long parentId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("expiration")
  private ObjectExpiration expiration = null;

  @JsonProperty("classification")
  private Integer classification = null;

  @JsonProperty("notes")
  private String notes = null;

  public CreateFileUploadRequest parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Target room or folder ID.
   * @return parentId
  **/
  @ApiModelProperty(required = true, value = "Target room or folder ID.")
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public CreateFileUploadRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * File name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "File name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateFileUploadRequest size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * File size in byte
   * @return size
  **/
  @ApiModelProperty(value = "File size in byte")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public CreateFileUploadRequest expiration(ObjectExpiration expiration) {
    this.expiration = expiration;
    return this;
  }

   /**
   * File expiration
   * @return expiration
  **/
  @ApiModelProperty(value = "File expiration")
  public ObjectExpiration getExpiration() {
    return expiration;
  }

  public void setExpiration(ObjectExpiration expiration) {
    this.expiration = expiration;
  }

  public CreateFileUploadRequest classification(Integer classification) {
    this.classification = classification;
    return this;
  }

   /**
   * Classification
   * @return classification
  **/
  @ApiModelProperty(required = true, value = "Classification")
  public Integer getClassification() {
    return classification;
  }

  public void setClassification(Integer classification) {
    this.classification = classification;
  }

  public CreateFileUploadRequest notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * User notes
   * @return notes
  **/
  @ApiModelProperty(value = "User notes")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFileUploadRequest createFileUploadRequest = (CreateFileUploadRequest) o;
    return Objects.equals(this.parentId, createFileUploadRequest.parentId) &&
        Objects.equals(this.name, createFileUploadRequest.name) &&
        Objects.equals(this.size, createFileUploadRequest.size) &&
        Objects.equals(this.expiration, createFileUploadRequest.expiration) &&
        Objects.equals(this.classification, createFileUploadRequest.classification) &&
        Objects.equals(this.notes, createFileUploadRequest.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentId, name, size, expiration, classification, notes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFileUploadRequest {\n");
    
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

