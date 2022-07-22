package com.provectus.kafka.ui.helpers;

public class TestConfiguration {
  public static boolean CLEAR_REPORTS_DIR =
      Boolean.parseBoolean(System.getProperty("CLEAR_REPORTS_DIR", "true"));
  public static String BASE_API_URL = System.getProperty("BASE_URL", "http://localhost:8080");
  public static String BASE_WEB_URL = System.getProperty("BASE_DOCKER_URL", "https://google.com");
  public static boolean USE_LOCAL_BROWSER =
      Boolean.parseBoolean(System.getProperty("USE_LOCAL_BROWSER", "true"));
  public static String REPORTS_FOLDER = System.getProperty("REPORTS_FOLDER", "allure-results");
  public static Boolean SCREENSHOTS =
      Boolean.parseBoolean(System.getProperty("SCREENSHOTS", "true"));
  public static Boolean SAVE_PAGE_SOURCE =
      Boolean.parseBoolean(System.getProperty("SAVE_PAGE_SOURCE", "false"));
  public static Boolean REOPEN_BROWSER_ON_FAIL =
      Boolean.parseBoolean(System.getProperty("REOPEN_BROWSER_ON_FAIL", "true"));
  public static String BROWSER = System.getProperty("BROWSER", "chrome");
  public static String BROWSER_SIZE = System.getProperty("BROWSER_SIZE", "1920x1080");
  public static Boolean ENABLE_VNC = Boolean.parseBoolean(System.getProperty("ENABLE_VNC", "true"));
  public static String SELENOID_IMAGE_NAME = System.getProperty("SELENOID_DOCKER_IMAGE", "aerokube/selenoid");
  public static String SELENOID_IMAGE_TAG = System.getProperty("SELENOID_IMAGE_TAG", "1.10.8");
  public static String VNC_CHROME_TAG = System.getProperty("SELENOID_CHROME_TAG", "103.0");

}
