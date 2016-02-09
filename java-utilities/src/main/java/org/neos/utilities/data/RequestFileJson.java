package org.neos.utilities.data;

import java.text.DateFormat;

import lombok.Data;

@Data
public class RequestFileJson <T> {
    
    private String path;
    private String fileName;
    private DateFormat dateFormat;
    private Class<T> clazz;
    
    public RequestFileJson(){}
    
    public RequestFileJson(String path,String fileName,Class<T> clazz){
        this.path=path;
        this.fileName=fileName;
        this.clazz=clazz;
    }
    public RequestFileJson(String path,String fileName,DateFormat dateFormat,
                                                            Class<T> clazz){
        this.path=path;
        this.fileName=fileName;
        this.dateFormat=dateFormat;
        this.clazz=clazz;
    }
}
