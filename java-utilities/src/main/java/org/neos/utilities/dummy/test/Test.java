package org.neos.utilities.dummy.test;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.neos.utilities.data.RequestFileJson;
import org.neos.utilities.data.RequestObjectJson;
import org.neos.utilities.dummy.data.DummyData;
import org.neos.utilities.dummy.data.InformationData;
import org.neos.utilities.file.FileJsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Test {

	@Autowired
    private   FileJsonUtils fileJsonUtils;
    private   RequestFileJson<InformationData> requestOpen;
    private   RequestFileJson<DummyData> requestDummy;
    private   RequestFileJson<DummyData> requestCreateDummy;
    private   RequestObjectJson requestObjectJson;
    

    public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
        
        ClassPathXmlApplicationContext ctx =
                        new ClassPathXmlApplicationContext("spring-config.xml");
        
        Test factory = ctx.getBean(Test.class);
        
        factory.execute();
        
        ctx.close();
        
    }
    
    public void execute() throws JsonParseException, JsonMappingException, 
                                                     IOException{
        
        
        List<InformationData> ltsInformation;
        
        requestOpen = new RequestFileJson<InformationData>(
                          "files",
                          "info-open.json",
                          new SimpleDateFormat("dd/MM/yyyy"),
                          InformationData.class);
        
        ltsInformation =
                fileJsonUtils.buildListObjectByFileJson(requestOpen);
        
        for(InformationData data:ltsInformation){
            log.info(data.toString());
        }
        log.info("------------------------------------------------------------");
        
        List<DummyData> ltsDummyData;
        requestDummy = new RequestFileJson<DummyData>(
                  "files",
                  "info-dummy.json",
                  new SimpleDateFormat("dd/MM/yyyy"),
                  DummyData.class);
        ltsDummyData =
                fileJsonUtils.buildListObjectByFileJson(requestDummy);
        
        for(DummyData data:ltsDummyData){
            requestObjectJson = new RequestObjectJson(
                    new SimpleDateFormat("dd/MM/yyyy"),
                    data);
            
            log.info(fileJsonUtils.convertObjectToJson(requestObjectJson));
        }
       
        log.info("------------------------------------------------------------");
        
        requestCreateDummy = new RequestFileJson<DummyData>(
                "C:\\temp",
                "info-dummy-demo.json",
                new SimpleDateFormat("dd/MM/yyyy"),
                ltsDummyData,
                null); 
        fileJsonUtils.buildObjectToFileJson(requestCreateDummy);
    }
        
    
}