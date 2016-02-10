package org.neos.utilities.data;

import java.text.DateFormat;

import lombok.Data;

@Data
public class RequestObjectJson {
	private DateFormat dateFormat;

    private Object object;

    public RequestObjectJson() {
    }

    public RequestObjectJson(DateFormat dateFormat, Object object) {
        this.dateFormat = dateFormat;
        this.object = object;
    }
}
