package org.neos.utilities.data;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import lombok.extern.slf4j.Slf4j;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.springframework.stereotype.Component;





@Component
@Slf4j
public class JSONDateTimeDeserialize extends JsonDeserializer<Date> {
   
    public Date deserialize(JsonParser jp, DeserializationContext dc) throws IOException, JsonProcessingException {
        try {
            System.out.println("------------"+jp.getText() );
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            cal.setTime(sdf.parse(jp.getText()));
            
            /*DateTimeFormatter formatter = DateTimeFormat.forPattern("dd/MM/yyyy");
            DateTime dateTime= formatter.parseDateTime(jp.getText());*/
            
            
            return new Date(cal.getTimeInMillis());
        } catch (Exception ex) {
            log.error(JSONDateTimeDeserialize.class.getName(), ex);
        }
        return null;

    }
}
