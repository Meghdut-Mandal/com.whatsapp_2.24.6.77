package X;

import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;

/* renamed from: X.4wu  reason: invalid class name and case insensitive filesystem */
public abstract class C101064wu extends C101074wv {
    public Bundle A00 = null;
    public AccountAuthenticatorResponse A01 = null;

    public void finish() {
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.A01;
        if (accountAuthenticatorResponse != null) {
            Bundle bundle = this.A00;
            if (bundle != null) {
                accountAuthenticatorResponse.onResult(bundle);
            } else {
                accountAuthenticatorResponse.onError(4, "canceled");
            }
            this.A01 = null;
        }
        super.finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AccountAuthenticatorResponse accountAuthenticatorResponse = (AccountAuthenticatorResponse) getIntent().getParcelableExtra("accountAuthenticatorResponse");
        this.A01 = accountAuthenticatorResponse;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onRequestContinued();
        }
    }
}
