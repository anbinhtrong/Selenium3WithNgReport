package testng;


import model.MyConcatenator;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class NewTest {

  @Test
  public void testConcatanate() throws Exception {
    String concatenated = MyConcatenator.concatanate(new String[]{"one", "two", "three", "four"});

    AssertJUnit.assertEquals("one,two,three,four", concatenated);

  }
}
