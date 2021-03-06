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
import ch.cyberduck.core.sds.io.swagger.client.model.CustomerAttributes;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Customer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-03T10:55:56.129+02:00")
public class Customer {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("companyName")
  private String companyName = null;

  /**
   * Customer contract type.
   */
  public enum CustomerContractTypeEnum {
    PAY("pay"),
    
    FREE("free"),
    
    DEMO("demo");

    private String value;

    CustomerContractTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CustomerContractTypeEnum fromValue(String text) {
      for (CustomerContractTypeEnum b : CustomerContractTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("customerContractType")
  private CustomerContractTypeEnum customerContractType = null;

  @JsonProperty("activationCode")
  private String activationCode = null;

  @JsonProperty("trialDaysLeft")
  private Integer trialDaysLeft = null;

  @JsonProperty("providerCustomerId")
  private String providerCustomerId = null;

  @JsonProperty("quotaMax")
  private Long quotaMax = null;

  @JsonProperty("quotaUsed")
  private Long quotaUsed = null;

  @JsonProperty("userMax")
  private Integer userMax = null;

  @JsonProperty("userUsed")
  private Integer userUsed = null;

  @JsonProperty("lockStatus")
  private Boolean lockStatus = null;

  @JsonProperty("createdAt")
  private java.util.Date createdAt = null;

  @JsonProperty("updatedAt")
  private java.util.Date updatedAt = null;

  @JsonProperty("lastLoginAt")
  private java.util.Date lastLoginAt = null;

  @JsonProperty("customerAttributes")
  private CustomerAttributes customerAttributes = null;

  public Customer id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the customer
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier for the customer")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Customer companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

   /**
   * Company name
   * @return companyName
  **/
  @ApiModelProperty(required = true, value = "Company name")
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public Customer customerContractType(CustomerContractTypeEnum customerContractType) {
    this.customerContractType = customerContractType;
    return this;
  }

   /**
   * Customer contract type.
   * @return customerContractType
  **/
  @ApiModelProperty(required = true, value = "Customer contract type.")
  public CustomerContractTypeEnum getCustomerContractType() {
    return customerContractType;
  }

  public void setCustomerContractType(CustomerContractTypeEnum customerContractType) {
    this.customerContractType = customerContractType;
  }

  public Customer activationCode(String activationCode) {
    this.activationCode = activationCode;
    return this;
  }

   /**
   * Customer activation code string, valid only for types free and demo, for pay customers it is empty
   * @return activationCode
  **/
  @ApiModelProperty(value = "Customer activation code string, valid only for types free and demo, for pay customers it is empty")
  public String getActivationCode() {
    return activationCode;
  }

  public void setActivationCode(String activationCode) {
    this.activationCode = activationCode;
  }

  public Customer trialDaysLeft(Integer trialDaysLeft) {
    this.trialDaysLeft = trialDaysLeft;
    return this;
  }

   /**
   * Number of days, left for the trial period. Relevant only for type demo.
   * @return trialDaysLeft
  **/
  @ApiModelProperty(value = "Number of days, left for the trial period. Relevant only for type demo.")
  public Integer getTrialDaysLeft() {
    return trialDaysLeft;
  }

  public void setTrialDaysLeft(Integer trialDaysLeft) {
    this.trialDaysLeft = trialDaysLeft;
  }

  public Customer providerCustomerId(String providerCustomerId) {
    this.providerCustomerId = providerCustomerId;
    return this;
  }

   /**
   * Provider customer ID value, relevant only for type &#39;pay&#39;
   * @return providerCustomerId
  **/
  @ApiModelProperty(value = "Provider customer ID value, relevant only for type 'pay'")
  public String getProviderCustomerId() {
    return providerCustomerId;
  }

  public void setProviderCustomerId(String providerCustomerId) {
    this.providerCustomerId = providerCustomerId;
  }

  public Customer quotaMax(Long quotaMax) {
    this.quotaMax = quotaMax;
    return this;
  }

   /**
   * Maximal disc space which can be allocated by customer in bytes
   * @return quotaMax
  **/
  @ApiModelProperty(required = true, value = "Maximal disc space which can be allocated by customer in bytes")
  public Long getQuotaMax() {
    return quotaMax;
  }

  public void setQuotaMax(Long quotaMax) {
    this.quotaMax = quotaMax;
  }

  public Customer quotaUsed(Long quotaUsed) {
    this.quotaUsed = quotaUsed;
    return this;
  }

   /**
   * Used amount of disc space in bytes
   * @return quotaUsed
  **/
  @ApiModelProperty(required = true, value = "Used amount of disc space in bytes")
  public Long getQuotaUsed() {
    return quotaUsed;
  }

  public void setQuotaUsed(Long quotaUsed) {
    this.quotaUsed = quotaUsed;
  }

  public Customer userMax(Integer userMax) {
    this.userMax = userMax;
    return this;
  }

   /**
   * Maximal number of users
   * @return userMax
  **/
  @ApiModelProperty(required = true, value = "Maximal number of users")
  public Integer getUserMax() {
    return userMax;
  }

  public void setUserMax(Integer userMax) {
    this.userMax = userMax;
  }

  public Customer userUsed(Integer userUsed) {
    this.userUsed = userUsed;
    return this;
  }

   /**
   * Number of users which are already allocated
   * @return userUsed
  **/
  @ApiModelProperty(required = true, value = "Number of users which are already allocated")
  public Integer getUserUsed() {
    return userUsed;
  }

  public void setUserUsed(Integer userUsed) {
    this.userUsed = userUsed;
  }

  public Customer lockStatus(Boolean lockStatus) {
    this.lockStatus = lockStatus;
    return this;
  }

   /**
   * Lock status: false - Unlocked, true - Locked. All users of this customer will be blocked and can not login anymore
   * @return lockStatus
  **/
  @ApiModelProperty(required = true, value = "Lock status: false - Unlocked, true - Locked. All users of this customer will be blocked and can not login anymore")
  public Boolean getLockStatus() {
    return lockStatus;
  }

  public void setLockStatus(Boolean lockStatus) {
    this.lockStatus = lockStatus;
  }

  public Customer createdAt(java.util.Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation date (2015-12-31T23:59:00)
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "Creation date (2015-12-31T23:59:00)")
  public java.util.Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(java.util.Date createdAt) {
    this.createdAt = createdAt;
  }

  public Customer updatedAt(java.util.Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Modification date (2015-12-31T23:59:00)
   * @return updatedAt
  **/
  @ApiModelProperty(value = "Modification date (2015-12-31T23:59:00)")
  public java.util.Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(java.util.Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Customer lastLoginAt(java.util.Date lastLoginAt) {
    this.lastLoginAt = lastLoginAt;
    return this;
  }

   /**
   * The date of the last login seen in the customer (2015-12-31T23:59:00)
   * @return lastLoginAt
  **/
  @ApiModelProperty(value = "The date of the last login seen in the customer (2015-12-31T23:59:00)")
  public java.util.Date getLastLoginAt() {
    return lastLoginAt;
  }

  public void setLastLoginAt(java.util.Date lastLoginAt) {
    this.lastLoginAt = lastLoginAt;
  }

  public Customer customerAttributes(CustomerAttributes customerAttributes) {
    this.customerAttributes = customerAttributes;
    return this;
  }

   /**
   * Customer Attributes
   * @return customerAttributes
  **/
  @ApiModelProperty(value = "Customer Attributes")
  public CustomerAttributes getCustomerAttributes() {
    return customerAttributes;
  }

  public void setCustomerAttributes(CustomerAttributes customerAttributes) {
    this.customerAttributes = customerAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.id, customer.id) &&
        Objects.equals(this.companyName, customer.companyName) &&
        Objects.equals(this.customerContractType, customer.customerContractType) &&
        Objects.equals(this.activationCode, customer.activationCode) &&
        Objects.equals(this.trialDaysLeft, customer.trialDaysLeft) &&
        Objects.equals(this.providerCustomerId, customer.providerCustomerId) &&
        Objects.equals(this.quotaMax, customer.quotaMax) &&
        Objects.equals(this.quotaUsed, customer.quotaUsed) &&
        Objects.equals(this.userMax, customer.userMax) &&
        Objects.equals(this.userUsed, customer.userUsed) &&
        Objects.equals(this.lockStatus, customer.lockStatus) &&
        Objects.equals(this.createdAt, customer.createdAt) &&
        Objects.equals(this.updatedAt, customer.updatedAt) &&
        Objects.equals(this.lastLoginAt, customer.lastLoginAt) &&
        Objects.equals(this.customerAttributes, customer.customerAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, companyName, customerContractType, activationCode, trialDaysLeft, providerCustomerId, quotaMax, quotaUsed, userMax, userUsed, lockStatus, createdAt, updatedAt, lastLoginAt, customerAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    customerContractType: ").append(toIndentedString(customerContractType)).append("\n");
    sb.append("    activationCode: ").append(toIndentedString(activationCode)).append("\n");
    sb.append("    trialDaysLeft: ").append(toIndentedString(trialDaysLeft)).append("\n");
    sb.append("    providerCustomerId: ").append(toIndentedString(providerCustomerId)).append("\n");
    sb.append("    quotaMax: ").append(toIndentedString(quotaMax)).append("\n");
    sb.append("    quotaUsed: ").append(toIndentedString(quotaUsed)).append("\n");
    sb.append("    userMax: ").append(toIndentedString(userMax)).append("\n");
    sb.append("    userUsed: ").append(toIndentedString(userUsed)).append("\n");
    sb.append("    lockStatus: ").append(toIndentedString(lockStatus)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    lastLoginAt: ").append(toIndentedString(lastLoginAt)).append("\n");
    sb.append("    customerAttributes: ").append(toIndentedString(customerAttributes)).append("\n");
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

