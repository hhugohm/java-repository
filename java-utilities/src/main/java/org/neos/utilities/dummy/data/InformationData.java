package org.neos.utilities.dummy.data;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.neos.utilities.data.JSONDateTimeDeserialize;
import org.neos.utilities.data.JSONDateTimeSerialize;

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
  @JsonDeserialize(using = JSONDateTimeDeserialize.class)
  @JsonSerialize(using = JSONDateTimeSerialize.class)
  private Date opened;
  @JsonDeserialize(using = JSONDateTimeDeserialize.class)
  @JsonSerialize(using = JSONDateTimeSerialize.class)
  private Date closed;
  private String type;
  private String service;
  private String creator;
  private String masterAccount;
  private String masterAccountId;
  private String description;
  private Boolean securityTicket;
  
}
