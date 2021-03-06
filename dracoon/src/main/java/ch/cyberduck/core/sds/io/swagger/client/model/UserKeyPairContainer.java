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
import ch.cyberduck.core.sds.io.swagger.client.model.PrivateKeyContainer;
import ch.cyberduck.core.sds.io.swagger.client.model.PublicKeyContainer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * UserKeyPairContainer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-03T10:55:56.129+02:00")
public class UserKeyPairContainer {
  @JsonProperty("privateKeyContainer")
  private PrivateKeyContainer privateKeyContainer = null;

  @JsonProperty("publicKeyContainer")
  private PublicKeyContainer publicKeyContainer = null;

  public UserKeyPairContainer privateKeyContainer(PrivateKeyContainer privateKeyContainer) {
    this.privateKeyContainer = privateKeyContainer;
    return this;
  }

   /**
   * Get privateKeyContainer
   * @return privateKeyContainer
  **/
  @ApiModelProperty(required = true, value = "")
  public PrivateKeyContainer getPrivateKeyContainer() {
    return privateKeyContainer;
  }

  public void setPrivateKeyContainer(PrivateKeyContainer privateKeyContainer) {
    this.privateKeyContainer = privateKeyContainer;
  }

  public UserKeyPairContainer publicKeyContainer(PublicKeyContainer publicKeyContainer) {
    this.publicKeyContainer = publicKeyContainer;
    return this;
  }

   /**
   * Get publicKeyContainer
   * @return publicKeyContainer
  **/
  @ApiModelProperty(required = true, value = "")
  public PublicKeyContainer getPublicKeyContainer() {
    return publicKeyContainer;
  }

  public void setPublicKeyContainer(PublicKeyContainer publicKeyContainer) {
    this.publicKeyContainer = publicKeyContainer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserKeyPairContainer userKeyPairContainer = (UserKeyPairContainer) o;
    return Objects.equals(this.privateKeyContainer, userKeyPairContainer.privateKeyContainer) &&
        Objects.equals(this.publicKeyContainer, userKeyPairContainer.publicKeyContainer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privateKeyContainer, publicKeyContainer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserKeyPairContainer {\n");
    
    sb.append("    privateKeyContainer: ").append(toIndentedString(privateKeyContainer)).append("\n");
    sb.append("    publicKeyContainer: ").append(toIndentedString(publicKeyContainer)).append("\n");
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

