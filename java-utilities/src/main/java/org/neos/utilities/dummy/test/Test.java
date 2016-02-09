package org.neos.utilities.dummy.test;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.neos.utilities.data.RequestFileJson;
import org.neos.utilities.dummy.data.DummyData;
import org.neos.utilities.dummy.data.InformationData;
import org.neos.utilities.file.FileJsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class Test {

	@Autowired
    private   FileJsonUtils fileJsonUtils;
    private   RequestFileJson<InformationData> requestOpen;
    private   RequestFileJson<DummyData> requestDummy;
    

    public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
        
        ClassPathXmlApplicationContext ctx =
                        new ClassPathXmlApplicationContext("spring-config.xml");
        //ctx.refresh();
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
            log.info(data.toString());
        }
    }
    
}