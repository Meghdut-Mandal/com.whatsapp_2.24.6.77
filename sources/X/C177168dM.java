package X;

import android.text.TextUtils;

/* renamed from: X.8dM  reason: invalid class name and case insensitive filesystem */
public final class C177168dM extends C21197ACf {
    public final AnonymousClass1FQ A00;

    public void B22(AnonymousClass6CO r7, AnonymousClass8NK r8, AnonymousClass3T1 r9) {
        C180838mV r4;
        C24611Dc r2;
        String str;
        AnonymousClass91I r3;
        StringBuilder A0u;
        String str2;
        AnonymousClass00C.A0D(r9, 0);
        C36321k7.A0x(r8, r7);
        if (!(r9 instanceof C180838mV) || (r4 = (C180838mV) r9) == null) {
            throw C165567td.A0K(0);
        }
        super.B22(r7, r8, r9);
        AnonymousClass1FQ r5 = this.A00;
        if (r4 instanceof C180978mj) {
            r3 = AnonymousClass91I.A2U;
        } else if (r4 instanceof C180968mi) {
            r3 = AnonymousClass91I.A2T;
        } else {
            r2 = r5.A0A;
            str = "buildWebRequestSystemEvent: message type not supported";
            r2.A05(str);
        }
        String str3 = r4.A00;
        if (TextUtils.isEmpty(str3)) {
            r2 = r5.A0A;
            A0u = AnonymousClass000.A0u();
            str2 = "buildWebRequestSystemEvent: failed to retrieve request message id for type: ";
        } else {
            AnonymousClass1EU r0 = r5.A09;
            AnonymousClass1EU.A00(r0);
            C202319lY A0R = C165587tf.A0R(r0.A05, str3, (String) null);
            if (A0R == null || TextUtils.isEmpty(A0R.A0I) || A0R.A08 == null) {
                r2 = r5.A0A;
                A0u = AnonymousClass000.A0u();
                str2 = "buildWebRequestSystemEvent: request transaction, currency, or amount is null for type: ";
            } else {
                r8.A0X(r3);
                String A03 = AnonymousClass143.A03(r4.A0L());
                if (A03 == null) {
                    A03 = "";
                }
                r8.A0Y(A03);
                r8.A0Y(A0R.A0I);
                r8.A0Y(String.valueOf(A0R.A08.A00.scaleByPowerOfTen(3).longValue()));
                return;
            }
        }
        str = AnonymousClass000.A0l(r3, str2, A0u);
        r2.A05(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C177168dM(C20520xh r1, AnonymousClass1FQ r2) {
        super(r1);
        C36321k7.A0x(r1, r2);
        this.A00 = r2;
    }
}
