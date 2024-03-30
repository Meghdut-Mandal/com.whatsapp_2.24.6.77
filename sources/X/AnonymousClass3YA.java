package X;

import android.view.View;
import com.whatsapp.authentication.AppAuthSettingsActivity;

/* renamed from: X.3YA  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3YA implements View.OnClickListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AppAuthSettingsActivity A01;

    public /* synthetic */ AnonymousClass3YA(AppAuthSettingsActivity appAuthSettingsActivity, long j) {
        this.A01 = appAuthSettingsActivity;
        this.A00 = j;
    }

    public final void onClick(View view) {
        C36341k9.A0w(C36421kH.A0A(this.A01), "privacy_fingerprint_timeout", this.A00);
    }
}
