package X;

import android.os.Bundle;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;

/* renamed from: X.0dN  reason: invalid class name and case insensitive filesystem */
public final class C09920dN implements C17210qu {
    public final /* synthetic */ SignInHubActivity A00;

    public /* synthetic */ C09920dN(SignInHubActivity signInHubActivity) {
        this.A00 = signInHubActivity;
    }

    public final void Ba7(AnonymousClass0V4 r1) {
    }

    public final AnonymousClass0V4 BUt(Bundle bundle, int i) {
        SignInHubActivity signInHubActivity = this.A00;
        Set set = AnonymousClass0XK.A00;
        synchronized (set) {
        }
        return new C03750Ho(signInHubActivity, set);
    }

    public final /* bridge */ /* synthetic */ void Ba0(AnonymousClass0V4 r4, Object obj) {
        SignInHubActivity signInHubActivity = this.A00;
        signInHubActivity.setResult(signInHubActivity.A00, signInHubActivity.A01);
        signInHubActivity.finish();
    }
}
