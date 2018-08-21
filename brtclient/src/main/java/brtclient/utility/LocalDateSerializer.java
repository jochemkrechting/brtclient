package brtclient.utility;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateSerializer extends StdSerializer<LocalDate> {

  LocalDateSerializer() {
    super(LocalDate.class);
  }

  @Override
  public void serialize(LocalDate date, JsonGenerator generator, SerializerProvider serializer) throws IOException {
    generator.writeString(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
  }
}
