package X;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.accountsync.LoginActivity;
import com.whatsapp.util.Log;
import java.util.Arrays;

/* renamed from: X.4aJ  reason: invalid class name and case insensitive filesystem */
public class C90534aJ extends AbstractAccountAuthenticator {
    public final Context A00;

    public Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) {
        Log.i("account/sync/addAccount");
        Bundle A07 = AnonymousClass001.A07();
        Intent A0H = C36441kJ.A0H(this.A00, LoginActivity.class);
        A0H.putExtra("accountAuthenticatorResponse", accountAuthenticatorResponse);
        A07.putParcelable("intent", A0H);
        return A07;
    }

    public Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle) {
        Log.i("account/sync/confirmCredentials");
        return null;
    }

    public Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse, String str) {
        Log.i("account/sync/editProperties");
        return null;
    }

    public Bundle getAuthToken(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        Log.i("account/sync/getAuthToken");
        return null;
    }

    public String getAuthTokenLabel(String str) {
        Log.i("account/sync/getAuthTokenLabel");
        return null;
    }

    public Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        Log.i("account/sync/updateCredentials");
        return null;
    }

    public C90534aJ(Context context) {
        super(context);
        this.A00 = context;
    }

    public Bundle hasFeatures(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String[] strArr) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("account/sync/hasFeatures: ");
        C36321k7.A1a(A0u, Arrays.toString(strArr));
        return null;
    }
}
