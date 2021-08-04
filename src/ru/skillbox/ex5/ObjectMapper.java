package ru.skillbox.ex5;

import java.io.IOException;
import java.io.InputStream;

public class ObjectMapper {
    public <T> T readValue(InputStream src, Class<T> valueType)
            throws IOException, JsonParseException, JsonMappingException {
        return null;
    }
}
