package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.3pc  reason: invalid class name and case insensitive filesystem */
public class C76893pc implements C236119d {
    public final AnonymousClass17Y A00;
    public final AnonymousClass19A A01;
    public final AnonymousClass4RY A02;

    private void A00(int i) {
        this.A00.Bp3(C80313vC.A00(this, new AnonymousClass39R((UserJid) null, (String) null, (String) null, -1, i), 16));
    }

    public void BVN(String str) {
        Log.e("sendScanContactQr/delivery-error");
        A00(408);
    }

    public void BWw(C203399nx r2, String str) {
        Log.e("sendScanContactQr/response-error");
        A00(AnonymousClass3ME.A00(r2));
    }

    public void BiM(C203399nx r10, String str) {
        String str2;
        int i;
        C203399nx A0c = r10.A0c("qr");
        if (A0c != null) {
            String A0i = A0c.A0i("jid", (String) null);
            String A0i2 = A0c.A0i("notify", (String) null);
            UserJid A0l = C36431kI.A0l(A0i);
            if (A0l == null) {
                str2 = "sendScanContactQr/error: invalid jid";
            } else {
                String A0i3 = A0c.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null);
                String str3 = null;
                if ("contact".equals(A0i3)) {
                    i = 0;
                } else if ("subscribe".equals(A0i3)) {
                    i = 1;
                } else if ("message".equals(A0i3)) {
                    C203399nx A0c2 = A0c.A0c("message");
                    if (A0c2 != null) {
                        str3 = A0c2.A0e();
                    }
                    i = 2;
                } else {
                    str2 = AnonymousClass000.A0p("sendScanContactQr/error: invalid type ", A0i3, AnonymousClass000.A0u());
                }
                Log.e("sendScanContactQr/success");
                this.A00.Bp3(C80313vC.A00(this, new AnonymousClass39R(A0l, A0i2, str3, i, 0), 16));
                return;
            }
        } else {
            str2 = "sendScanContactQr/error: missing node";
        }
        Log.e(str2);
        A00(0);
    }

    public C76893pc(AnonymousClass17Y r1, AnonymousClass19A r2, AnonymousClass4RY r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
