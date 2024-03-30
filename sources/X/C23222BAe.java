package X;

import com.whatsapp.R;

/* renamed from: X.BAe  reason: case insensitive filesystem */
public class C23222BAe implements C22953Az5 {
    public Object A00;
    public final int A01;

    public C23222BAe(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BeS(C202059ky r6) {
        int i;
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            C167687yZ r4 = (C167687yZ) obj;
            if (r6 != null) {
                AnonymousClass17Y r3 = r4.A0B;
                r3.A02();
                int i3 = r6.A00;
                int i4 = R.string.f12nameremoved;
                if (i3 == 443) {
                    i4 = R.string.f12nameremoved;
                }
                r3.A06(i4, 0);
                r4.A09.A0C(new AnonymousClass9OX(1));
                return;
            }
            C165597tg.A1E(r4.A0M, r4, 4);
            return;
        }
        C183628r6 r42 = (C183628r6) obj;
        if (r6 == null || (i = r6.A00) != 11495) {
            C22953Az5 az5 = r42.A02;
            if (az5 != null) {
                az5.BeS(r6);
                return;
            }
            return;
        }
        C36321k7.A1T("PAY: reject collect; error code: ", AnonymousClass000.A0u(), i);
        AE4 ae4 = r42.A03;
        ae4.A0A.Boy(new C81123wV((Object) r42, 47));
        ae4.A00.A02();
        AnonymousClass3SJ.A01(r42.A00, 100);
    }
}
