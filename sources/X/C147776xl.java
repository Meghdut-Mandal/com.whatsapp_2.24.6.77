package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;

/* renamed from: X.6xl  reason: invalid class name and case insensitive filesystem */
public class C147776xl implements C236119d {
    public C132576Ui A00;
    public final AnonymousClass19A A01;

    public String A00(byte[] bArr, String str) {
        if (this.A00 == null) {
            Log.e("ACSSender/requestToSign need to set iq response listener first");
            return null;
        }
        AnonymousClass19A r9 = this.A01;
        String A09 = r9.A09();
        C203399nx r8 = new C203399nx("blinded_credential", bArr, (AnonymousClass1AL[]) null);
        C203399nx r4 = new C203399nx("project_name", str, (AnonymousClass1AL[]) null);
        AnonymousClass1AL[] r2 = new AnonymousClass1AL[1];
        int A1Y = C36371kC.A1Y("version", "2", r2);
        C203399nx[] r1 = new C203399nx[2];
        r1[A1Y] = r8;
        r1[1] = r4;
        C203399nx r42 = new C203399nx("sign_credential", r2, r1);
        AnonymousClass1AL[] r22 = new AnonymousClass1AL[4];
        C36341k9.A1L("xmlns", "privatestats", r22, A1Y);
        C36331k8.A1R(A09, r22, 1);
        C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r22, 2);
        C36341k9.A1V(r22, 3);
        if (r9.A0K(this, C36391kE.A0m(r42, r22), A09, 278, 32000)) {
            return A09;
        }
        Log.e("ACSSender/requestToSign failed to send iq request");
        return null;
    }

    public void BiM(C203399nx r9, String str) {
        C203399nx A0d = r9.A0d("sign_credential");
        long A0U = A0d.A0U("t");
        byte[] bArr = A0d.A0d("signed_credential").A01;
        byte[] bArr2 = A0d.A0d("acs_public_key").A01;
        C203399nx A0c = A0d.A0c("dleq_proof");
        if (A0c != null) {
            A0c.A0d("c");
            A0c.A0d("s");
        }
        C132576Ui r2 = this.A00;
        if (r2 != null) {
            synchronized (r2) {
                if (!str.equalsIgnoreCase(r2.A0D)) {
                    Log.e("ACSToken/onReceiveSignedToken iq requests messed up, reset");
                    C132576Ui.A00(r2);
                } else if (bArr2 == null || bArr == null) {
                    r2.A04.A04(10);
                    C132576Ui.A02(r2, false);
                } else {
                    r2.A08.execute(new AnonymousClass73L(r2, bArr2, bArr, 0, A0U));
                }
            }
        }
    }

    public C147776xl(AnonymousClass19A r1) {
        this.A01 = r1;
    }

    public void BVN(String str) {
        C36321k7.A1P("ACSSender/onDeliveryFailure iqId = ", str, AnonymousClass000.A0u());
        C132576Ui r2 = this.A00;
        if (r2 == null) {
            return;
        }
        if (!str.equalsIgnoreCase(r2.A0D)) {
            Log.e("ACSToken/onSendFailure mismatched iq id, reset");
            r2.A04.A04(12);
            C132576Ui.A00(r2);
            return;
        }
        C132576Ui.A01(r2, 5);
    }

    public void BWw(C203399nx r5, String str) {
        C36321k7.A1P("ACSSender/onError iqId = ", str, AnonymousClass000.A0u());
        C203399nx A0d = r5.A0d("error");
        int A0R = A0d.A0R("code");
        A0d.A0i("text", "");
        C132576Ui r2 = this.A00;
        if (r2 == null) {
            return;
        }
        if (!str.equalsIgnoreCase(r2.A0D)) {
            Log.e("ACSToken/onIqResponseError mismatched iq id, reset");
            C132576Ui.A00(r2);
        } else if (A0R == 500) {
            C132576Ui.A01(r2, 3);
        } else {
            Log.e("ACSToken/onIqResponseError iq errors, stop attempting to send iq");
            r2.A04.A04(11);
            C132576Ui.A02(r2, false);
        }
    }
}
