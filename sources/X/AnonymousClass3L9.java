package X;

import android.app.KeyguardManager;
import android.content.Context;
import com.whatsapp.util.Log;

/* renamed from: X.3L9  reason: invalid class name */
public final class AnonymousClass3L9 {
    public final Context A00;
    public final C21060yb A01;

    public AnonymousClass3L9(Context context, C21060yb r3) {
        AnonymousClass00C.A0D(r3, 2);
        this.A00 = context;
        this.A01 = r3;
    }

    public final boolean A00() {
        return AnonymousClass000.A1V(this.A00.getSystemService("credential"));
    }

    public final boolean A02() {
        long A002 = AnonymousClass1L0.A00(this.A00, "com.google.android.gms");
        C36321k7.A1V("PasskeyGooglePlayChecks / determineDeviceGMSVersionCode:  ", AnonymousClass000.A0u(), A002);
        boolean A1U = C36401kF.A1U((A002 > 231300000 ? 1 : (A002 == 231300000 ? 0 : -1)));
        C36321k7.A1X("PasskeyGooglePlayChecks / gmsVersionIsNewEnough : ", AnonymousClass000.A0u(), A1U);
        return A1U;
    }

    public final boolean A03() {
        long A002 = AnonymousClass1L0.A00(this.A00, "com.google.android.gms");
        C36321k7.A1V("PasskeyGooglePlayChecks / determineDeviceGMSVersionCode:  ", AnonymousClass000.A0u(), A002);
        boolean A1U = C36401kF.A1U((A002 > 231300000 ? 1 : (A002 == 231300000 ? 0 : -1)));
        C36321k7.A1X("PasskeyGooglePlayChecks / gmsVersionIsNewEnough : ", AnonymousClass000.A0u(), A1U);
        return A1U;
    }

    public final boolean A04() {
        AnonymousClass0L0 r2 = new AnonymousClass0L0(C34201gc.A00(this.A00));
        C36321k7.A1K(r2, "PasskeyGooglePlayChecks / googlePlayServicesStatus : ", AnonymousClass000.A0u());
        boolean A1Q = AnonymousClass000.A1Q(r2.A01);
        C36321k7.A1X("PasskeyGooglePlayChecks / isGooglePlayServicesEnabled : ", AnonymousClass000.A0u(), A1Q);
        return A1Q;
    }

    public final boolean A01() {
        String str;
        boolean z = false;
        if (C19550w8.A01()) {
            KeyguardManager A06 = this.A01.A06();
            if (A06 != null) {
                z = A06.isDeviceSecure();
            } else {
                str = "PasskeyGooglePlayChecks / isDeviceSecured:  no keyguard service";
                Log.i(str);
            }
        } else {
            str = "PasskeyGooglePlayChecks / isDeviceSecured:  android too old";
            Log.i(str);
        }
        C36321k7.A1X("PasskeyGooglePlayChecks / isDeviceSecured:  ", AnonymousClass000.A0u(), z);
        return z;
    }
}
