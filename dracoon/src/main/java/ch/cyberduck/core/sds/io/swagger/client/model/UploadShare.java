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
import ch.cyberduck.core.sds.io.swagger.client.model.UserInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * UploadShare
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-03T10:55:56.129+02:00")
public class UploadShare {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("targetId")
  private Long targetId = null;

  @JsonProperty("targetPath")
  private String targetPath = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("isProtected")
  private Boolean isProtected = null;

  @JsonProperty("isEncrypted")
  private Boolean isEncrypted = null;

  @JsonProperty("accessKey")
  private String accessKey = null;

  @JsonProperty("notes")
  private String notes = null;

  @JsonProperty("maxSlots")
  private Integer maxSlots = null;

  @JsonProperty("maxSize")
  private Long maxSize = null;

  @JsonProperty("expireAt")
  private java.util.Date expireAt = null;

  @JsonProperty("filesExpiryPeriod")
  private Integer filesExpiryPeriod = null;

  @JsonProperty("notifyCreator")
  private Boolean notifyCreator = null;

  @JsonProperty("recipients")
  private String recipients = null;

  @JsonProperty("smsRecipients")
  private String smsRecipients = null;

  @JsonProperty("createdAt")
  private java.util.Date createdAt = null;

  @JsonProperty("createdBy")
  private UserInfo createdBy = null;

  @JsonProperty("cntFiles")
  private Integer cntFiles = null;

  @JsonProperty("cntUploads")
  private Integer cntUploads = null;

  @JsonProperty("showUploadedFiles")
  private Boolean showUploadedFiles = null;

  public UploadShare id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Share Id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Share Id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public UploadShare targetId(Long targetId) {
    this.targetId = targetId;
    return this;
  }

   /**
   * Target node ID
   * @return targetId
  **/
  @ApiModelProperty(required = true, value = "Target node ID")
  public Long getTargetId() {
    return targetId;
  }

  public void setTargetId(Long targetId) {
    this.targetId = targetId;
  }

  public UploadShare targetPath(String targetPath) {
    this.targetPath = targetPath;
    return this;
  }

   /**
   * Path to shared upload node
   * @return targetPath
  **/
  @ApiModelProperty(value = "Path to shared upload node")
  public String getTargetPath() {
    return targetPath;
  }

  public void setTargetPath(String targetPath) {
    this.targetPath = targetPath;
  }

  public UploadShare name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Alias name.&lt;/b&gt;
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Alias name.</b>")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UploadShare isProtected(Boolean isProtected) {
    this.isProtected = isProtected;
    return this;
  }

   /**
   * Is protected by password
   * @return isProtected
  **/
  @ApiModelProperty(required = true, value = "Is protected by password")
  public Boolean getIsProtected() {
    return isProtected;
  }

  public void setIsProtected(Boolean isProtected) {
    this.isProtected = isProtected;
  }

  public UploadShare isEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
    return this;
  }

   /**
   * Files are client-side encrypted
   * @return isEncrypted
  **/
  @ApiModelProperty(value = "Files are client-side encrypted")
  public Boolean getIsEncrypted() {
    return isEncrypted;
  }

  public void setIsEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
  }

  public UploadShare accessKey(String accessKey) {
    this.accessKey = accessKey;
    return this;
  }

   /**
   * Share access key to generate secure link
   * @return accessKey
  **/
  @ApiModelProperty(required = true, value = "Share access key to generate secure link")
  public String getAccessKey() {
    return accessKey;
  }

  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }

  public UploadShare notes(String notes) {
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

  public UploadShare maxSlots(Integer maxSlots) {
    this.maxSlots = maxSlots;
    return this;
  }

   /**
   * Maximal amount of files to upload
   * @return maxSlots
  **/
  @ApiModelProperty(value = "Maximal amount of files to upload")
  public Integer getMaxSlots() {
    return maxSlots;
  }

  public void setMaxSlots(Integer maxSlots) {
    this.maxSlots = maxSlots;
  }

  public UploadShare maxSize(Long maxSize) {
    this.maxSize = maxSize;
    return this;
  }

   /**
   * Maximal total size of uploaded files (Bytes)
   * @return maxSize
  **/
  @ApiModelProperty(value = "Maximal total size of uploaded files (Bytes)")
  public Long getMaxSize() {
    return maxSize;
  }

  public void setMaxSize(Long maxSize) {
    this.maxSize = maxSize;
  }

  public UploadShare expireAt(java.util.Date expireAt) {
    this.expireAt = expireAt;
    return this;
  }

   /**
   * Expiration date (2015-12-31T23:59:00).
   * @return expireAt
  **/
  @ApiModelProperty(required = true, value = "Expiration date (2015-12-31T23:59:00).")
  public java.util.Date getExpireAt() {
    return expireAt;
  }

  public void setExpireAt(java.util.Date expireAt) {
    this.expireAt = expireAt;
  }

  public UploadShare filesExpiryPeriod(Integer filesExpiryPeriod) {
    this.filesExpiryPeriod = filesExpiryPeriod;
    return this;
  }

   /**
   * Number of days after which uploaded files expire
   * @return filesExpiryPeriod
  **/
  @ApiModelProperty(value = "Number of days after which uploaded files expire")
  public Integer getFilesExpiryPeriod() {
    return filesExpiryPeriod;
  }

  public void setFilesExpiryPeriod(Integer filesExpiryPeriod) {
    this.filesExpiryPeriod = filesExpiryPeriod;
  }

  public UploadShare notifyCreator(Boolean notifyCreator) {
    this.notifyCreator = notifyCreator;
    return this;
  }

   /**
   * Notify creator on every upload.
   * @return notifyCreator
  **/
  @ApiModelProperty(required = true, value = "Notify creator on every upload.")
  public Boolean getNotifyCreator() {
    return notifyCreator;
  }

  public void setNotifyCreator(Boolean notifyCreator) {
    this.notifyCreator = notifyCreator;
  }

  public UploadShare recipients(String recipients) {
    this.recipients = recipients;
    return this;
  }

   /**
   * CSV string of recipient emails
   * @return recipients
  **/
  @ApiModelProperty(value = "CSV string of recipient emails")
  public String getRecipients() {
    return recipients;
  }

  public void setRecipients(String recipients) {
    this.recipients = recipients;
  }

  public UploadShare smsRecipients(String smsRecipients) {
    this.smsRecipients = smsRecipients;
    return this;
  }

   /**
   * CSV string of recipient msisdns
   * @return smsRecipients
  **/
  @ApiModelProperty(value = "CSV string of recipient msisdns")
  public String getSmsRecipients() {
    return smsRecipients;
  }

  public void setSmsRecipients(String smsRecipients) {
    this.smsRecipients = smsRecipients;
  }

  public UploadShare createdAt(java.util.Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation date (2015-12-31T23:59:00).
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "Creation date (2015-12-31T23:59:00).")
  public java.util.Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(java.util.Date createdAt) {
    this.createdAt = createdAt;
  }

  public UploadShare createdBy(UserInfo createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Creator info.
   * @return createdBy
  **/
  @ApiModelProperty(required = true, value = "Creator info.")
  public UserInfo getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(UserInfo createdBy) {
    this.createdBy = createdBy;
  }

  public UploadShare cntFiles(Integer cntFiles) {
    this.cntFiles = cntFiles;
    return this;
  }

   /**
   * Total amount of existing files uploaded with this share.
   * @return cntFiles
  **/
  @ApiModelProperty(value = "Total amount of existing files uploaded with this share.")
  public Integer getCntFiles() {
    return cntFiles;
  }

  public void setCntFiles(Integer cntFiles) {
    this.cntFiles = cntFiles;
  }

  public UploadShare cntUploads(Integer cntUploads) {
    this.cntUploads = cntUploads;
    return this;
  }

   /**
   * Total amount of uploads conducted with this share.
   * @return cntUploads
  **/
  @ApiModelProperty(value = "Total amount of uploads conducted with this share.")
  public Integer getCntUploads() {
    return cntUploads;
  }

  public void setCntUploads(Integer cntUploads) {
    this.cntUploads = cntUploads;
  }

  public UploadShare showUploadedFiles(Boolean showUploadedFiles) {
    this.showUploadedFiles = showUploadedFiles;
    return this;
  }

   /**
   * Allow display of already uploaded files
   * @return showUploadedFiles
  **/
  @ApiModelProperty(value = "Allow display of already uploaded files")
  public Boolean getShowUploadedFiles() {
    return showUploadedFiles;
  }

  public void setShowUploadedFiles(Boolean showUploadedFiles) {
    this.showUploadedFiles = showUploadedFiles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadShare uploadShare = (UploadShare) o;
    return Objects.equals(this.id, uploadShare.id) &&
        Objects.equals(this.targetId, uploadShare.targetId) &&
        Objects.equals(this.targetPath, uploadShare.targetPath) &&
        Objects.equals(this.name, uploadShare.name) &&
        Objects.equals(this.isProtected, uploadShare.isProtected) &&
        Objects.equals(this.isEncrypted, uploadShare.isEncrypted) &&
        Objects.equals(this.accessKey, uploadShare.accessKey) &&
        Objects.equals(this.notes, uploadShare.notes) &&
        Objects.equals(this.maxSlots, uploadShare.maxSlots) &&
        Objects.equals(this.maxSize, uploadShare.maxSize) &&
        Objects.equals(this.expireAt, uploadShare.expireAt) &&
        Objects.equals(this.filesExpiryPeriod, uploadShare.filesExpiryPeriod) &&
        Objects.equals(this.notifyCreator, uploadShare.notifyCreator) &&
        Objects.equals(this.recipients, uploadShare.recipients) &&
        Objects.equals(this.smsRecipients, uploadShare.smsRecipients) &&
        Objects.equals(this.createdAt, uploadShare.createdAt) &&
        Objects.equals(this.createdBy, uploadShare.createdBy) &&
        Objects.equals(this.cntFiles, uploadShare.cntFiles) &&
        Objects.equals(this.cntUploads, uploadShare.cntUploads) &&
        Objects.equals(this.showUploadedFiles, uploadShare.showUploadedFiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, targetId, targetPath, name, isProtected, isEncrypted, accessKey, notes, maxSlots, maxSize, expireAt, filesExpiryPeriod, notifyCreator, recipients, smsRecipients, createdAt, createdBy, cntFiles, cntUploads, showUploadedFiles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadShare {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    targetPath: ").append(toIndentedString(targetPath)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isProtected: ").append(toIndentedString(isProtected)).append("\n");
    sb.append("    isEncrypted: ").append(toIndentedString(isEncrypted)).append("\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    maxSlots: ").append(toIndentedString(maxSlots)).append("\n");
    sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
    sb.append("    expireAt: ").append(toIndentedString(expireAt)).append("\n");
    sb.append("    filesExpiryPeriod: ").append(toIndentedString(filesExpiryPeriod)).append("\n");
    sb.append("    notifyCreator: ").append(toIndentedString(notifyCreator)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    smsRecipients: ").append(toIndentedString(smsRecipients)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    cntFiles: ").append(toIndentedString(cntFiles)).append("\n");
    sb.append("    cntUploads: ").append(toIndentedString(cntUploads)).append("\n");
    sb.append("    showUploadedFiles: ").append(toIndentedString(showUploadedFiles)).append("\n");
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

