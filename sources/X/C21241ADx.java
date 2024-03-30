package X;

import java.util.Locale;

/* renamed from: X.ADx  reason: case insensitive filesystem */
public class C21241ADx implements AnonymousClass1XD {
    public int A00 = 0;
    public final /* synthetic */ B34 A01;
    public final /* synthetic */ AnonymousClass1YH A02;

    public C21241ADx(B34 b34, AnonymousClass1YH r3) {
        this.A02 = r3;
        this.A01 = b34;
    }

    private void A00() {
        int i = this.A00;
        AnonymousClass1YH r0 = this.A02;
        if (i < 3) {
            r0.A0A.A09(this);
            this.A00++;
            return;
        }
        C24611Dc r3 = r0.A0D;
        Locale locale = Locale.US;
        Object[] objArr = new Object[1];
        C36331k8.A1W(objArr, i);
        r3.A05(String.format(locale, "AccountRecoveryNotification: sendGetPaymentMethods retry failed, attempts made: %d", objArr));
    }

    public void Bes(C202059ky r3) {
        this.A02.A0D.A05("AccountRecoveryNotification: sendGetPaymentMethods request error");
        A00();
    }

    public void Bf0(C202059ky r3) {
        this.A02.A0D.A05("AccountRecoveryNotification: sendGetPaymentMethods response error");
        A00();
    }

    public void Bf1(AnonymousClass9KX r4) {
        AnonymousClass1YH r2 = this.A02;
        r2.A0D.A06("AccountRecoveryNotification: sendGetPaymentMethods success");
        AnonymousClass1EU r22 = r2.A0C;
        AnonymousClass16S A0O = C165617ti.A0O(r22);
        if (A0O != null) {
            AnonymousClass1EU.A00(r22);
            if (A0O.A06() != null) {
                AnonymousClass1EU.A00(r22);
                C207249un A06 = A0O.A06();
                if (A06 != null) {
                    B34 b34 = this.A01;
                    b34.Bws(A06.A08);
                    b34.B5D((String) null, false);
                }
            }
        }
    }
}
