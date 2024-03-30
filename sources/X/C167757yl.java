package X;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: X.7yl  reason: invalid class name and case insensitive filesystem */
public class C167757yl extends AnonymousClass04R {
    public C28201Rs A00 = C36441kJ.A0t();
    public String A01;
    public boolean A02;
    public final C001700s A03 = C36431kI.A0S();
    public final C21100yf A04;
    public final C18820ts A05;
    public final AnonymousClass3DI A06;
    public final C197639c2 A07;
    public final AnonymousClass9OF A08;

    public static void A03(C167757yl r3) {
        C193699Mm r2 = new C193699Mm(5);
        r2.A03 = C36421kH.A1a(r3.A0S().A0A);
        r2.A04 = "DEEP_LINK".equals(r3.A01);
        r3.A00.A0D(r2);
    }

    public static void A01(C167757yl r2) {
        if (!r2.A04.A09(C21100yf.A0k) || !r2.A0S().A0P || TextUtils.isEmpty(r2.A0S().A0F)) {
            A03(r2);
        } else {
            C193699Mm.A00(r2.A00, 3);
        }
    }

    public static void A02(C167757yl r15) {
        if (!r15.A04.A09(C21100yf.A0h) || TextUtils.isEmpty(r15.A0S().A0I)) {
            A01(r15);
            return;
        }
        AnonymousClass9OF r1 = r15.A08;
        Context context = r1.A01.A00;
        AnonymousClass17Y r9 = r1.A00;
        AnonymousClass9YX r12 = new AnonymousClass9YX();
        AnonymousClass8gA r7 = new AnonymousClass8gA(context, r9, r1.A03, r1.A06, r12, r1.A07);
        String str = r15.A0S().A08;
        C191929Fa r8 = new C191929Fa(r15);
        AnonymousClass19A r92 = r7.A02;
        String A09 = r92.A09();
        AnonymousClass6QB A0T = C36421kH.A0T();
        C165567td.A1C(new AnonymousClass1AL("xmlns", "w:pay"), A0T);
        C203539oF.A0E(A0T, A09);
        AnonymousClass6QB A0a = C165587tf.A0a();
        C36331k8.A1D(A0a, "action", "upi-verify-qr-code");
        if (C203539oF.A0V(str, 1, false)) {
            C36331k8.A1D(A0a, "signed-qr-code", str);
        }
        r92.A0E(new B7M(r7.A00, r7.A01, r7.A03, AnonymousClass9I1.A04(r7, "upi-verify-qr-code"), r7, r8), C165567td.A0I(A0a, A0T), A09, 204, 0);
    }

    public C203479o6 A0S() {
        Object A042 = this.A03.A04();
        C18740tg.A06(A042);
        return (C203479o6) A042;
    }

    public C167757yl(C21100yf r2, C18820ts r3, AnonymousClass3DI r4, AnonymousClass9OF r5, C197639c2 r6) {
        this.A04 = r2;
        this.A07 = r6;
        this.A05 = r3;
        this.A08 = r5;
        this.A06 = r4;
    }
}
