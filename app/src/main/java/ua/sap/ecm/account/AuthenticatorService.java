package ua.sap.ecm.account;



import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;


public class AuthenticatorService extends Service {

    private Authenticator authenticator ;

    @Override
    public void onCreate() {
        super.onCreate();
        authenticator = new Authenticator(this);
    }

    @Override
    public IBinder onBind(Intent intent) {
       // if (intent.getAction().equals(AccountManager.ACTION_AUTHENTICATOR_INTENT)) {
           // return getAuthenticator().getIBinder();
            return authenticator.getIBinder();
        //} else {
          //  return null;
       // }
    }

    protected Authenticator getAuthenticator() {
        if (authenticator == null) {
            authenticator = new Authenticator(this);
        }
        return authenticator;
    }
}