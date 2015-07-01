package org.apache.mesos.hdfs.config;

/**
 * Indicates a failure to startup the config service, likely a jetty failure.
 */
public class ConfigServerException extends RuntimeException {

  public ConfigServerException() {
  }

  public ConfigServerException(Throwable cause) {
    super(cause);
  }

  public ConfigServerException(String message) {
    super(message);
  }
}
