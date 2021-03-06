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
 * LoginRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-03T10:55:56.129+02:00")
public class LoginRequest {
  @JsonProperty("login")
  private String login = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("token")
  private String token = null;

  @JsonProperty("language")
  private String language = null;

  @JsonProperty("authType")
  private String authType = null;

  @JsonProperty("state")
  private String state = null;

  public LoginRequest login(String login) {
    this.login = login;
    return this;
  }

   /**
   * User login name
   * @return login
  **/
  @ApiModelProperty(required = true, value = "User login name")
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public LoginRequest password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password
   * @return password
  **/
  @ApiModelProperty(required = true, value = "Password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public LoginRequest token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Token
   * @return token
  **/
  @ApiModelProperty(value = "Token")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public LoginRequest language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Language ID or ISO 639-1 code
   * @return language
  **/
  @ApiModelProperty(value = "Language ID or ISO 639-1 code")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public LoginRequest authType(String authType) {
    this.authType = authType;
    return this;
  }

   /**
   * Authentication type code
   * @return authType
  **/
  @ApiModelProperty(value = "Authentication type code")
  public String getAuthType() {
    return authType;
  }

  public void setAuthType(String authType) {
    this.authType = authType;
  }

  public LoginRequest state(String state) {
    this.state = state;
    return this;
  }

   /**
   * For Radius Access-Challenge. If a replyState is returned, it must be included as \&quot;state\&quot; in the following request
   * @return state
  **/
  @ApiModelProperty(value = "For Radius Access-Challenge. If a replyState is returned, it must be included as \"state\" in the following request")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginRequest loginRequest = (LoginRequest) o;
    return Objects.equals(this.login, loginRequest.login) &&
        Objects.equals(this.password, loginRequest.password) &&
        Objects.equals(this.token, loginRequest.token) &&
        Objects.equals(this.language, loginRequest.language) &&
        Objects.equals(this.authType, loginRequest.authType) &&
        Objects.equals(this.state, loginRequest.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(login, password, token, language, authType, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginRequest {\n");
    
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

