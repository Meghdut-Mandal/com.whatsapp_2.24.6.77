package X;

import com.whatsapp.qrcode.QrScannerViewV2;

/* renamed from: X.4X4  reason: invalid class name */
public class AnonymousClass4X4 implements C160747lW {
    public Object A00;
    public final int A01;

    public AnonymousClass4X4(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BRd(float f, float f2) {
        if (this.A01 == 0) {
            ((AnonymousClass3UB) this.A00).A0S.A0H(new AnonymousClass732(this, f, f2, 2));
        }
    }

    public void BRe(boolean z) {
        if (this.A01 == 0) {
            ((AnonymousClass3UB) this.A00).A0S.A0H(new AnonymousClass75B(49, (Object) this, z));
        }
    }

    public void BSu(Exception exc, int i) {
        if (this.A01 != 0) {
            QrScannerViewV2 qrScannerViewV2 = (QrScannerViewV2) this.A00;
            if (qrScannerViewV2.A04 != null) {
                qrScannerViewV2.A08.post(new C81293wm((Object) this, i, 8));
                return;
            }
            return;
        }
        ((AnonymousClass3UB) this.A00).A0S.Bp3(new C81293wm((Object) this, i, 6));
    }

    public void BdY() {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            QrScannerViewV2 qrScannerViewV2 = (QrScannerViewV2) obj;
            if (qrScannerViewV2.A04 != null) {
                C81133wW.A00(qrScannerViewV2.A08, this, 43);
                return;
            }
            return;
        }
        AnonymousClass3UB r1 = (AnonymousClass3UB) obj;
        r1.A0E = false;
        r1.A0S.A0H(new C81133wW((Object) this, 22));
    }

    public void Bdu(AnonymousClass67E r3) {
        if (this.A01 != 0) {
            QrScannerViewV2 qrScannerViewV2 = (QrScannerViewV2) this.A00;
            if (qrScannerViewV2.A04 != null) {
                qrScannerViewV2.A08.post(C80313vC.A00(this, r3, 12));
            }
        }
    }

    public void BkF() {
    }
}
