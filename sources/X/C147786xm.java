package X;

import android.util.Base64;
import com.whatsapp.util.Log;

/* renamed from: X.6xm  reason: invalid class name and case insensitive filesystem */
public class C147786xm implements C236119d {
    public AnonymousClass6X1 A00;
    public final AnonymousClass19A A01;

    public String A00(byte[] bArr) {
        String str;
        if (this.A00 == null) {
            str = "PrivateStatsSender/requestToSign need to set iq response listener first";
        } else {
            AnonymousClass19A r2 = this.A01;
            String A09 = r2.A09();
            if (r2.A0K(this, new C35911jS(A09, bArr).A00, A09, 239, 32000)) {
                return A09;
            }
            str = "PrivateStatsSender/requestToSign failed to send iq request";
        }
        Log.e(str);
        return null;
    }

    public void BiM(C203399nx r12, String str) {
        C203399nx A0d = r12.A0d("sign_credential");
        long A0U = A0d.A0U("t");
        byte[] bArr = A0d.A0d("signed_credential").A01;
        byte[] bArr2 = A0d.A0d("acs_public_key").A01;
        C203399nx A0c = A0d.A0c("dleq_proof");
        if (A0c != null) {
            C203399nx A0d2 = A0c.A0d("c");
            C203399nx A0d3 = A0c.A0d("s");
            AnonymousClass6X1 r5 = this.A00;
            if (r5 != null) {
                byte[] bArr3 = A0d2.A01;
                byte[] bArr4 = A0d3.A01;
                synchronized (r5) {
                    if (bArr3 != null) {
                        AnonymousClass6V6.A03(r5.A05, "dleq_proof_c", Base64.encodeToString(bArr3, 10));
                    }
                    if (bArr4 != null) {
                        AnonymousClass6V6.A03(r5.A05, "dleq_proof_s", Base64.encodeToString(bArr4, 10));
                    }
                }
            }
        }
        AnonymousClass6X1 r52 = this.A00;
        if (r52 != null) {
            synchronized (r52) {
                if (!str.equalsIgnoreCase(r52.A0D)) {
                    Log.e("PrivateStatsToken/onReceiveSignedToken iq requests messed up, reset");
                    AnonymousClass6X1.A00(r52);
                } else if (bArr2 == null || bArr == null) {
                    r52.A05.A04(10);
                    AnonymousClass6X1.A03(r52, 3, false);
                } else {
                    r52.A07.Boy(new AnonymousClass73L(r52, bArr2, bArr, 4, A0U));
                }
            }
        }
    }

    public C147786xm(AnonymousClass19A r1) {
        this.A01 = r1;
    }

    public void BVN(String str) {
        C36321k7.A1P("PrivateStatsSender/onDeliveryFailure iqId = ", str, AnonymousClass000.A0u());
        AnonymousClass6X1 r2 = this.A00;
        if (r2 != null) {
            synchronized (r2) {
                if (!str.equalsIgnoreCase(r2.A0D)) {
                    Log.e("PrivateStats/onSendFailure mismatched iq id, reset");
                    r2.A05.A04(12);
                    AnonymousClass6X1.A00(r2);
                } else {
                    AnonymousClass6X1.A01(r2, 5);
                }
            }
        }
    }

    public void BWw(C203399nx r5, String str) {
        C36321k7.A1P("PrivateStatsSender/onError iqId = ", str, AnonymousClass000.A0u());
        C203399nx A0d = r5.A0d("error");
        int A0R = A0d.A0R("code");
        A0d.A0i("text", "");
        AnonymousClass6X1 r2 = this.A00;
        if (r2 != null) {
            synchronized (r2) {
                if (!str.equalsIgnoreCase(r2.A0D)) {
                    Log.e("PrivateStats/onIqResponseError mismatched iq id, reset");
                    AnonymousClass6X1.A00(r2);
                } else if (A0R == 500) {
                    AnonymousClass6X1.A01(r2, 3);
                } else {
                    Log.e("PrivateStats/onIqResponseError iq errors, stop attempting to send iq");
                    r2.A05.A04(11);
                    AnonymousClass6X1.A03(r2, 2, false);
                }
            }
        }
    }
}
