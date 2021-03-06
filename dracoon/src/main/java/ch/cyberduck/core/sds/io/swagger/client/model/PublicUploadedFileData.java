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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PublicUploadedFileData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-03T10:55:56.129+02:00")
public class PublicUploadedFileData {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("createdAt")
  private java.util.Date createdAt = null;

  @JsonProperty("hash")
  private String hash = null;

  public PublicUploadedFileData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PublicUploadedFileData size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * File size
   * @return size
  **/
  @ApiModelProperty(required = true, value = "File size")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public PublicUploadedFileData createdAt(java.util.Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation time (2015-12-31T23:59:00)
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "Creation time (2015-12-31T23:59:00)")
  public java.util.Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(java.util.Date createdAt) {
    this.createdAt = createdAt;
  }

  public PublicUploadedFileData hash(String hash) {
    this.hash = hash;
    return this;
  }

   /**
   * Hash value of transferred file
   * @return hash
  **/
  @ApiModelProperty(value = "Hash value of transferred file")
  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicUploadedFileData publicUploadedFileData = (PublicUploadedFileData) o;
    return Objects.equals(this.name, publicUploadedFileData.name) &&
        Objects.equals(this.size, publicUploadedFileData.size) &&
        Objects.equals(this.createdAt, publicUploadedFileData.createdAt) &&
        Objects.equals(this.hash, publicUploadedFileData.hash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, size, createdAt, hash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicUploadedFileData {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
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

