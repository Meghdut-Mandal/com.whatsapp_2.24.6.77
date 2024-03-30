package X;

import android.text.TextUtils;

/* renamed from: X.1Vl  reason: invalid class name and case insensitive filesystem */
public class C29131Vl {
    public C1262463d A00 = null;
    public final C19630wG A01;
    public final C24601Db A02;
    public final C24631De A03;
    public final AnonymousClass1EU A04;

    public static C1262463d A00(C29131Vl r4) {
        C198699e3 r1;
        String str;
        B66 A012;
        C24631De r2 = r4.A03;
        if (r2.A02() != null) {
            r1 = r4.A04.A03(r2.A02().A03);
        } else {
            r1 = null;
        }
        AnonymousClass16U A013 = r2.A01();
        if (A013 != null) {
            str = ((AnonymousClass16V) A013).A02;
        } else {
            str = null;
        }
        if (r1 == null || (A012 = r1.A01(str)) == null) {
            return null;
        }
        return A012.BFQ(r4.A01, r4.A02);
    }

    public String A01() {
        C24611Dc r2;
        StringBuilder sb;
        String str;
        C1262463d r5 = this.A00;
        if (r5 == null) {
            r5 = A00(this);
            this.A00 = r5;
            if (r5 == null) {
                return null;
            }
        }
        C24601Db r4 = r5.A01;
        String string = r4.A03().getString("payments_device_id", (String) null);
        if (!TextUtils.isEmpty(string)) {
            r2 = r5.A02;
            sb = new StringBuilder();
            str = "PaymentDeviceId: from cache: ";
        } else {
            string = r5.A00();
            r4.A03().edit().putString("payments_device_id", string).apply();
            r2 = r5.A02;
            sb = new StringBuilder();
            str = "PaymentDeviceId: generated: ";
        }
        sb.append(str);
        sb.append(string);
        C24611Dc.A02(r2, (String) null, sb.toString());
        return string;
    }

    public C29131Vl(C19630wG r2, C24601Db r3, C24631De r4, AnonymousClass1EU r5) {
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
    }
}
