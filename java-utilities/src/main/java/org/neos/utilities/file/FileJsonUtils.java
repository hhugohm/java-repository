package org.neos.utilities.file;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.neos.utilities.constants.FileConstants;
import org.neos.utilities.data.RequestFileJson;

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

		return ltsInformation;
	}

}
