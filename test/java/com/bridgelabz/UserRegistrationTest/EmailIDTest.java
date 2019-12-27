package com.bridgelabz.UserRegistrationTest;

import com.brideglabz.UserRegistration.UserRegistration;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailIDTest {
private String id;
private String validationResult;

public EmailIDTest(String id,String validationResult) {
    super();
    this.id = id;
    this.validationResult = validationResult;
}
@Parameterized.Parameters
    public static Collection emailIdList(){
    return Arrays.asList(new Object[][] {
            {"abc@yahoo.com","Valid"},
            {"abc-100@yahoo.com","Valid"},
            {"abc.100@yahoo.com","Valid"},
            {"abc111@abc.com","Valid"},
            {"abc-100@abc.net","Valid"},
            {"abc.100@abc.com.au","Valid"},
            {"abc@1.com","Valid"},
            {"abc@gmail.com.com","Valid"},
            {"abc-gmail.com","Invalid"},
            {"abc@.com.my","Invalid"},
            {"abc123@gmail.a","Invalid"},
            {"abc123@.com","Invalid"},
            {"abc123@.com.com","Invalid"},
            {".abc@abc.com","Invalid"},
            {"abc()*@gmail.com","Invalid"},
            {"abc@%*.com","Invalid"},
            {"abc..2002@gmail.com","Invalid"},
            {"abc.@gmail.com","Invalid"},
            {"abc@abc@gmail.com","Invalid"},
            {"abc@gmail.com.1a","Invalid"},
            {"abc@gmail.com.aa.au","Invalid"}});
}
@Test
public void emailListValidation(){
    UserRegistration userRegistration = new UserRegistration();
    String validatingEmailId = userRegistration.validatingEmailId(id);
    Assert.assertEquals(validationResult,validatingEmailId);

}
}
