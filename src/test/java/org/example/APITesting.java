package org.example;

import io.restassured.RestAssured;
import org.junit.Assert;
import org.junit.Test;

public class APITesting {


  @Test
  public void test_sum() {
    int x = 2;
    int y = 2;
    Assert.assertEquals(4, x + y);
  }


  @Test
  public void google_test() {
    Object body = RestAssured.when()
      .get("https://www.google.com")
      .then()
      .statusCode(200)
      .extract()
      .asString();
    System.out.println(body);
    Assert.assertNotNull(body);
  }

}
