package org.example;

import org.junit.Assert;
import org.junit.Test;

public class APITesting {


  @Test
  public void test_sum() {
    int x = 2;
    int y = 2;
    Assert.assertEquals(4, x + y);
  }


}
