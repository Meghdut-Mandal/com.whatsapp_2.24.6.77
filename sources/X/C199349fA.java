package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.9fA  reason: invalid class name and case insensitive filesystem */
public class C199349fA {
    public final C20810yC A00;
    public final AnonymousClass19A A01;

    public void A01(C236119d r8, C203399nx r9, String str, int i) {
        try {
            C236119d r1 = r8;
            String str2 = str;
            if (this.A00.A0E(1319)) {
                A00(r8, str);
            } else {
                this.A01.A0E(r1, r9, str2, i, 32000);
            }
        } catch (C235919b e) {
            Log.e(e.getMessage());
        }
    }

    public void A02(C236119d r8, C203399nx r9, String str, int i) {
        try {
            C236119d r1 = r8;
            String str2 = str;
            if (this.A00.A0E(1319)) {
                A00(r8, str);
            } else {
                this.A01.A0F(r1, r9, str2, i, 32000);
            }
        } catch (C235919b e) {
            Log.e(e.getMessage());
        }
    }

    public C199349fA(C20810yC r1, AnonymousClass19A r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static boolean A00(C236119d r6, String str) {
        ArrayList A0I = AnonymousClass001.A0I();
        C203399nx.A0E("error", A0I, new AnonymousClass1AL[]{new AnonymousClass1AL("code", 451), new AnonymousClass1AL("text", "commerce-features-disabled")});
        AnonymousClass1AL[] r2 = new AnonymousClass1AL[1];
        C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "IQErrorResponse", r2, 0);
        r6.BWw(C203399nx.A05("iq", r2, C165577te.A1b(A0I, 0)), str);
        return false;
    }
}
