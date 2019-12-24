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
    public void ValidateUsername_IfMorethanTwo_ReturnValid() {
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
}
