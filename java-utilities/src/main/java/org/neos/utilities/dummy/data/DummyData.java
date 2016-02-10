package org.neos.utilities.dummy.data;

import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.neos.utilities.data.JSONDateTimeDeserialize;
import org.neos.utilities.data.JSONDateTimeSerialize;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(includeFieldNames=true)
public class DummyData {
    
	private String cve;
    private String name;
    private String state;
    @JsonDeserialize(using = JSONDateTimeDeserialize.class)
    @JsonSerialize(using = JSONDateTimeSerialize.class)
    private Date initialDate;
    private String finalDate;
    private String type;

}
