package org.neos.utilities.dummy.data;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(includeFieldNames=true)
public class InformationData implements Serializable{
  
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  
  private String id;
  private String title;
  private String state;
  private Date opened;
  private Date closed;
  private String type;
  private String service;
  private String creator;
  private String masterAccount;
  private String masterAccountId;
  private String description;
  private Boolean securityTicket;
  
}
