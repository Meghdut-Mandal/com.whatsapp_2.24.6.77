package X;

import com.whatsapp.util.Log;

/* renamed from: X.B9e  reason: case insensitive filesystem */
public class C23196B9e implements B1Q {
    public Object A00;
    public final int A01;

    public C23196B9e(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void Bdl(C202059ky r4) {
        switch (this.A01) {
            case 0:
                Log.e("PAY: BrazilDeviceRegistrationAction/getPaymentProviderPublicKey iq returned null");
                ((C195129Sp) this.A00).A00(C202059ky.A00(), (AF3) null);
                return;
            case 1:
                Log.e("PAY: BrazilVerifyCardOTPSendAction getProviderEncryptionKeyAsync iq returned null");
                ((AnonymousClass9XQ) this.A00).A02(C202059ky.A00(), (AF3) null);
                return;
            default:
                Log.e("PAY: BrazilVerifyCardOTPSendAction/provider key iq returned null");
                AnonymousClass8g7 r1 = (AnonymousClass8g7) this.A00;
                AnonymousClass8g7.A00(r1, r1.A06);
                return;
        }
    }

    public void Bdm(AF3 af3) {
        switch (this.A01) {
            case 0:
                ((C195129Sp) this.A00).A00((C202059ky) null, af3);
                return;
            case 1:
                ((AnonymousClass9XQ) this.A00).A02((C202059ky) null, af3);
                return;
            default:
                AnonymousClass8g7 r3 = (AnonymousClass8g7) this.A00;
                AnonymousClass8g7.A00(r3, r3.A02.A03((AF2) af3.A00, r3.A06));
                return;
        }
    }
}
