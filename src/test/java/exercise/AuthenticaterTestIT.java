package exercise;

import Utils.Mailer;
import exercise.realdatabase.UserFacadeRealDB;
import static org.mockito.Mockito.mock;


public class AuthenticaterTestIT extends AuthenticatorTest {
  
  @Override
  public Authenticator makeAuthenticator(){
     Mailer mailer = mock(Mailer.class);
     return new Authenticator(new UserFacadeRealDB("pu_localDB"), mailer);
  }
  
  
}
