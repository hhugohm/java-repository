package org.neos.utilities.dummy.data;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(includeFieldNames=true)
public class DummyData {
    
    private String cve;
    private String name;
    private String state;
    private String initialDate;
    private String finalDate;
    private String type;

}
