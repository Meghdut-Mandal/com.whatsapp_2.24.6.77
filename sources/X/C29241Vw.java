package X;

import android.content.SharedPreferences;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;

/* renamed from: X.1Vw  reason: invalid class name and case insensitive filesystem */
public class C29241Vw {
    public AZA A00;
    public final AnonymousClass130 A01;
    public final AnonymousClass19A A02;

    public void A00() {
        AnonymousClass130 r3 = this.A01;
        SharedPreferences A002 = r3.A0A.A00("keystore");
        if (A002.getInt("remaining_auth_key_rotation_attempts", 0) > 0) {
            long A003 = C19970wo.A00(r3.A05);
            if (A003 - A002.getLong("last_succeeded_auth_key_rotation_attempt", -1) >= 86400000) {
                long j = A002.getLong("last_failed_auth_key_rotation_attempt", -1);
                if (j == -1 || A003 - j > 1800000) {
                    if (this.A00 == null) {
                        this.A00 = AZA.A00();
                    }
                    AnonymousClass19A r6 = this.A02;
                    String A09 = r6.A09();
                    byte[] bArr = this.A00.A02.A01;
                    AnonymousClass6QB r4 = new AnonymousClass6QB("iq");
                    r4.A04(new AnonymousClass1AL((Jid) C177588e2.A00, "to"));
                    r4.A04(new AnonymousClass1AL("xmlns", "w:auth:key"));
                    r4.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"));
                    if (C203539oF.A0P(A09, 0, 9007199254740991L, false)) {
                        r4.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A09));
                    }
                    AnonymousClass6QB r2 = new AnonymousClass6QB("key");
                    C203539oF.A0I(bArr, 32, 32);
                    r2.A01 = bArr;
                    r4.A05(r2.A03());
                    r6.A0K(new C147796xn(r3, this, this.A00), r4.A03(), A09, 331, 32000);
                }
            }
        }
    }

    public C29241Vw(AnonymousClass130 r1, AnonymousClass19A r2) {
        this.A01 = r1;
        this.A02 = r2;
    }
}
