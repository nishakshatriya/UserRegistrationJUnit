import com.bridgelabz.UserRegistration.*;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void ValidateUsername_IfFirstLetterCapital_ReturnValid() {
        UserRegistration userFirstName = new UserRegistration();
        String firstname = userFirstName.validatingUserName("Nisha");
        Assert.assertEquals("Valid",firstname);
    }

    @Test
    public void ValidateUsername_IfMinThreeLetters_ReturnValid() {
        UserRegistration userFirstName = new UserRegistration();
        String firstname = userFirstName.validatingUserName("Nish");
        Assert.assertEquals("Valid",firstname);
    }


    @Test
    public void ValidateUserName_IfFirstLetterNotCapital_ReturnInvalid() {
        UserRegistration userFirstName_Invalid = new UserRegistration();
        String firstname = userFirstName_Invalid.validatingUserName("nisha");
        Assert.assertEquals("Invalid",firstname);

    }

    @Test
    public void ValidateUserName_IfLessthanThree_ReturnInvalid() {
        UserRegistration userFirstName_Invalid = new UserRegistration();
        String firstname = userFirstName_Invalid.validatingUserName("ni");
        Assert.assertEquals("Invalid",firstname);

    }

    @Test
    public void ValidateUserName_IfSpaceEncountered_ReturnInvalid() {
        UserRegistration userFirstName_Invalid = new UserRegistration();
        String firstname = userFirstName_Invalid.validatingUserName("ni sha");
        Assert.assertEquals("Invalid",firstname);
    }
//LAST_NAME_VALIDATION
    @Test
    public void ValidateUserLastName_IfFirstLetterCapital_ReturnValid() {
        UserRegistration userLastName = new UserRegistration();
        String lastname = userLastName.validatingUserLastName("Kshatriya");
        Assert.assertEquals("Valid",lastname);
    }

    @Test
    public void ValidateUserLastName_IfMinThreeLetters_ReturnValid() {
        UserRegistration userLastName = new UserRegistration();
        String lastname = userLastName.validatingUserLastName("Ksh");
        Assert.assertEquals("Valid",lastname);
    }

    @Test
    public void ValidateUserNameLastName_IfFirstLetterNotCaps_ReturnInvalid() {
        UserRegistration userLastName = new UserRegistration();
        String lastname = userLastName.validatingUserLastName("kshatriya");
        Assert.assertEquals("Invalid",lastname);
    }

    @Test
    public void ValidateUserLastName_IfLessThanThreeLetter_ReturnInvalid() {
        UserRegistration userLastName = new UserRegistration();
        String lastname = userLastName.validatingUserLastName("ks");
        Assert.assertEquals("Invalid",lastname);
    }

    @Test
    public void ValidateUserLastName_IfEncounteredSpecialSymbl_ReturnInvalid() {
        UserRegistration userLastName = new UserRegistration();
        String lastname = userLastName.validatingUserLastName("ksh@triya");
        Assert.assertEquals("Invalid",lastname);

    }
//EMAIL_ID_VALIDATION
    @Test
    public void ValidateEmail_IfContainsAllMandatoryParts_ReturnValid() {
        UserRegistration email_Id = new UserRegistration();
        String id = email_Id.validatingEmailId("nisha.kshatriya@gmail.com");
        Assert.assertEquals("Valid",id);
    }

    @Test
    public void ValidateEmail_IfhasMandatoryAndOptionalPart_ReturnValid() {
        UserRegistration email_Id = new UserRegistration();
        String id = email_Id.validatingEmailId("nisha.kshatriya@gmail.com.in");
        Assert.assertEquals("Valid",id);
    }

    @Test
    public void ValidateEmail_IfContainNoMandatoryParts_ReturnInvalid() {
        UserRegistration email_Id = new UserRegistration();
        String id = email_Id.validatingEmailId("nisha.kshatriya@gmail.");
        Assert.assertEquals("Invalid",id);

    }
//MOBILE_NUMBER_FORMAT_VALIDATION
    @Test
    public void ValidateMobileNumberFormat_IfCountryCodePresent_ReturnValid() {
        UserRegistration mobile_number = new UserRegistration();
        String number_format = mobile_number.validatingMobileNumberFormat("+91 9922123456");
        Assert.assertEquals("Valid",number_format);
    }

    @Test
    public void ValidateMobileNumberFormat_IfSpacesPresent_ReturnValid() {
        UserRegistration mobile_number = new UserRegistration();
        String number_format = mobile_number.validatingMobileNumberFormat("91 9922123456");
        Assert.assertEquals("Valid",number_format);
    }

    @Test
    public void ValidateMobileNumberFormat_IfNoCountryCodeAndSpacePresent_ReturnValid() {
        UserRegistration mobile_number = new UserRegistration();
        String number_format = mobile_number.validatingMobileNumberFormat("9922123456");
        Assert.assertEquals("Valid",number_format);

    }

    @Test
    public void ValidateMobileNumber_IfNoPredefinedFormat_ReturnInvalid() {
        UserRegistration mobile_number = new UserRegistration();
        String number_format = mobile_number.validatingMobileNumberFormat("91 12345");
        Assert.assertEquals("Invalid",number_format);

    }
}
