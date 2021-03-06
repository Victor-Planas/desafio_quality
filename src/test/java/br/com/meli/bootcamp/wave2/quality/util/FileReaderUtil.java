package br.com.meli.bootcamp.wave2.quality.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileReaderUtil {

  public static String readResourcesString(String filePath) throws IOException {
    var fileStream = FileReaderUtil.class.getClassLoader().getResourceAsStream(filePath);
    return new String(fileStream.readAllBytes(), StandardCharsets.UTF_8);

  }
}
