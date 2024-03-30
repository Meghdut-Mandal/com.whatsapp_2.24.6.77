package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.3pd  reason: invalid class name and case insensitive filesystem */
public class C76903pd implements C236119d {
    public final AnonymousClass19A A00;
    public final AnonymousClass4RY A01;
    public final AnonymousClass17Z A02;
    public final C20810yC A03;

    private void A00(int i) {
        this.A01.BfB(new AnonymousClass39R((UserJid) null, (String) null, (String) null, -1, i));
    }

    public void BVN(String str) {
        Log.e("GetUserByCustomUrlProtocol/onDeliveryFailure");
        A00(408);
    }

    public void BWw(C203399nx r2, String str) {
        Log.e("GetUserByCustomUrlProtocol/onError");
        A00(AnonymousClass3ME.A00(r2));
    }

    public void BiM(C203399nx r8, String str) {
        UserJid A0l;
        Log.e("GetUserByCustomUrlProtocol/onSuccess");
        C203399nx A0c = r8.A0c(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
        if (A0c == null || (A0l = C36431kI.A0l(A0c.A0i("jid", (String) null))) == null) {
            A00(0);
            return;
        }
        int i = 2;
        if (this.A03.A0E(1849)) {
            i = 3;
        }
        this.A01.BfB(new AnonymousClass39R(A0l, (String) null, (String) null, i, 0));
    }

    public C76903pd(AnonymousClass17Z r1, C20810yC r2, AnonymousClass19A r3, AnonymousClass4RY r4) {
        this.A03 = r2;
        this.A00 = r3;
        this.A02 = r1;
        this.A01 = r4;
    }
}
