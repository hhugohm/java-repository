package org.neos.utilities.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.util.DefaultPrettyPrinter;
import org.neos.utilities.constants.FileConstants;
import org.neos.utilities.data.RequestFileJson;
import org.neos.utilities.data.RequestObjectJson;
import org.neos.utilities.dummy.test.Test;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class FileJsonUtils {

	public <T> List<T> buildListObjectByFileJson(RequestFileJson<T> req)
            throws JsonParseException, JsonMappingException, IOException {
        File file = new File(this
                .getClass()
                .getResource(
                        FileConstants.SEPARATOR + req.getPath()
                                + FileConstants.SEPARATOR + req.getFileName())
                .getFile());

        ObjectMapper mapper = new ObjectMapper();
        if (req.getDateFormat() != null) {
            mapper.setDateFormat(req.getDateFormat());
        }

        List<T> ltsInformation = mapper.readValue(file, mapper.getTypeFactory()
                .constructCollectionType(List.class, req.getClazz()));
        
        //mapper.writeValue(new File(""),ltsInformation);

        return ltsInformation;
    }
    
    public static <T> T convertJsonToObject(String json, RequestFileJson<T> req) {

        ObjectMapper mapper = new ObjectMapper();
        if (req.getDateFormat() != null) {
            mapper.setDateFormat(req.getDateFormat());
        }
        try {
            return (T) mapper.readValue(json, req.getClazz());
        } catch (Exception e) {
            throw new RuntimeException("Ocurrio un ERROR en la "
                    + "des-serializacion de " + req.getClazz().getName(), e);
        }
    }
    public  <T> String convertObjectToJson(RequestObjectJson req) throws IOException {
        String json="";
        ObjectMapper mapper = new ObjectMapper();
        if (req.getDateFormat() != null) {
            mapper.setDateFormat(req.getDateFormat());
        }
        
        
        
        json= mapper.writeValueAsString(req.getObject());
        

        return json;
    }
    public boolean buildObjectToFileJson(RequestFileJson<?> req) {
        boolean action=true;
        try{
        String path=FileConstants.SEPARATOR + req.getPath()
                                + FileConstants.SEPARATOR + req.getFileName();
        JsonFactory jsonFactory = new JsonFactory(); 
        ObjectMapper mapper = new ObjectMapper();
        JsonGenerator jsonGen = null;
        
        File file = new File(path);
    
        
        if (req.getDateFormat() != null) {
            mapper.setDateFormat(req.getDateFormat());
        }
        
        
        if(req.getEncoding()!=null){
           // jsonGen = jsonFactory.createGenerator(file,req.getEncoding());
            jsonGen = jsonFactory.createJsonGenerator(file,req.getEncoding());
            
        }else{
            OutputStream fileOutputStream = new FileOutputStream(file);
           // jsonGen = jsonFactory.createGenerator(fileOutputStream);
            jsonGen = jsonFactory.createJsonGenerator(fileOutputStream);
        }
        
        jsonGen.setPrettyPrinter(new DefaultPrettyPrinter());
        jsonGen.setCodec(mapper);
        jsonGen.writeObject(req.getObject());
        
        /*ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
        writer.writeValue(file,req.getObject());*/

        
        }catch(IOException e){
            log.error("ERROR:",e);
            action=false;
        }
        return action;
    }

}
