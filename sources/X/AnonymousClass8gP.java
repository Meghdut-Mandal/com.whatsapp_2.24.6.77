package X;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: X.8gP  reason: invalid class name */
public class AnonymousClass8gP extends AnonymousClass9I1 {
    public final Context A00;
    public final AnonymousClass17Y A01;
    public final AnonymousClass19A A02;
    public final AE0 A03;
    public final C29221Vu A04;
    public final C195479Ul A05;
    public final AF7 A06;
    public final C29131Vl A07;

    public AnonymousClass8gP(Context context, AnonymousClass17Y r3, AnonymousClass19A r4, C202269lR r5, AE0 ae0, C29221Vu r7, C29121Vk r8, C195479Ul r9, AF7 af7, C29131Vl r11) {
        super(r5.A04, r8);
        this.A00 = context;
        this.A01 = r3;
        this.A02 = r4;
        this.A07 = r11;
        this.A05 = r9;
        this.A06 = af7;
        this.A04 = r7;
        this.A03 = ae0;
    }

    public static void A00(C135086c7 r14, C135086c7 r15, C175818b6 r16, C22964AzG azG, AnonymousClass8gP r18, String str, String str2) {
        AnonymousClass8gP r13 = r18;
        AnonymousClass9YX r11 = r13.A00;
        r11.A02("upi-generate-otp");
        AnonymousClass19A r1 = r13.A02;
        String A09 = r1.A09();
        ArrayList arrayList = C185958vB.A00;
        C185958vB r2 = new C185958vB(A09, C165607th.A0s(r14), str, r13.A07.A01(), (String) C165577te.A0g(r16.A05), (String) C165577te.A0g(r15), r13.A03.A0B(), str2);
        C165577te.A1A(r1, new B7O(r13.A00, r13.A01, r13.A04, r11, azG, r13, r2), r2.A00, A09);
    }

    public void A01(C135086c7 r16, C175818b6 r17, C22964AzG azG, String str) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PAY: IndiaUpiOtpAction requestOtp withCallback: ");
        C36331k8.A1S(A0u, true);
        this.A06.Buu();
        C175818b6 r4 = r17;
        String str2 = r4.A0E;
        C135086c7 r3 = r16;
        C22964AzG azG2 = azG;
        String str3 = str;
        if (C202349ld.A02(r4.A08)) {
            this.A05.A01(this.A00, (AnonymousClass9YX) null, new AEV(r3, r4, azG2, this, str3));
        } else {
            A00(r4.A08, r3, r4, azG2, this, str2, str3);
        }
    }
}
