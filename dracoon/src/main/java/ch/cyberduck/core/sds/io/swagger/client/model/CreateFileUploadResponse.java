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
 * CreateFileUploadResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-03T10:55:56.129+02:00")
public class CreateFileUploadResponse {
  @JsonProperty("uploadId")
  private String uploadId = null;

  @JsonProperty("token")
  private String token = null;

  @JsonProperty("uploadUrl")
  private String uploadUrl = null;

  public CreateFileUploadResponse uploadId(String uploadId) {
    this.uploadId = uploadId;
    return this;
  }

   /**
   * Upload Id
   * @return uploadId
  **/
  @ApiModelProperty(required = true, value = "Upload Id")
  public String getUploadId() {
    return uploadId;
  }

  public void setUploadId(String uploadId) {
    this.uploadId = uploadId;
  }

  public CreateFileUploadResponse token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Upload token
   * @return token
  **/
  @ApiModelProperty(required = true, value = "Upload token")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public CreateFileUploadResponse uploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
    return this;
  }

   /**
   * Upload URL
   * @return uploadUrl
  **/
  @ApiModelProperty(value = "Upload URL")
  public String getUploadUrl() {
    return uploadUrl;
  }

  public void setUploadUrl(String uploadUrl) {
    this.uploadUrl = uploadUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFileUploadResponse createFileUploadResponse = (CreateFileUploadResponse) o;
    return Objects.equals(this.uploadId, createFileUploadResponse.uploadId) &&
        Objects.equals(this.token, createFileUploadResponse.token) &&
        Objects.equals(this.uploadUrl, createFileUploadResponse.uploadUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uploadId, token, uploadUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFileUploadResponse {\n");
    
    sb.append("    uploadId: ").append(toIndentedString(uploadId)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uploadUrl: ").append(toIndentedString(uploadUrl)).append("\n");
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

