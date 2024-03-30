package X;

import android.content.SharedPreferences;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.649  reason: invalid class name */
public class AnonymousClass649 {
    public final C19970wo A00;
    public final C21510zM A01;
    public final C119595q7 A02;
    public final C20970yS A03;
    public final AnonymousClass19A A04;

    public void A00(boolean z) {
        SharedPreferences sharedPreferences;
        String string;
        String str;
        AnonymousClass19A r7 = this.A04;
        String A09 = r7.A09();
        C21510zM r4 = this.A01;
        synchronized (r4) {
            sharedPreferences = r4.A00;
            string = sharedPreferences.getString("ab_props:sys:config_hash", (String) null);
        }
        if (string == null || z) {
            str = "";
        } else {
            synchronized (r4) {
                str = sharedPreferences.getString("ab_props:sys:config_hash", (String) null);
            }
        }
        AnonymousClass1AL[] r2 = new AnonymousClass1AL[2];
        r2[0] = new AnonymousClass1AL("protocol", 1);
        C36341k9.A1L("hash", str, r2, 1);
        C203399nx r42 = new C203399nx("props", r2);
        AnonymousClass1AL[] r3 = new AnonymousClass1AL[4];
        C36341k9.A1V(r3, 0);
        C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r3, 1);
        C36331k8.A1R(A09, r3, 2);
        C36341k9.A1L("xmlns", "abt", r3, 3);
        r7.A0K(new C165427tP(this, 1), C36391kE.A0m(r42, r3), A09, 220, 32000);
    }

    public AnonymousClass649(C19970wo r1, C21510zM r2, C119595q7 r3, C20970yS r4, AnonymousClass19A r5) {
        this.A00 = r1;
        this.A02 = r3;
        this.A04 = r5;
        this.A01 = r2;
        this.A03 = r4;
    }
}
