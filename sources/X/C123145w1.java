package X;

import com.facebook.cameracore.ardelivery.model.ARAssetType;

/* renamed from: X.5w1  reason: invalid class name and case insensitive filesystem */
public final class C123145w1 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public C123145w1(C135056c3 r5) {
        String A002 = AnonymousClass6SG.A00();
        AnonymousClass00C.A08(A002);
        this.A03 = A002;
        AnonymousClass6VA r2 = r5.A01;
        String str = "";
        if (r2.A02 == ARAssetType.EFFECT) {
            String A003 = AnonymousClass5YC.A00(r5);
            AnonymousClass00C.A08(A003);
            this.A00 = A003;
            String str2 = r2.A0B;
            if (str2 != null) {
                str2 = r5.A0A ? Integer.toString(r5.hashCode()) : str2;
                AnonymousClass00C.A0B(str2);
            } else {
                str2 = str;
            }
            this.A01 = str2;
            String str3 = r5.A06;
            this.A02 = str3 != null ? AnonymousClass098.A05(str3, "\"", str, false) : str;
            this.A04 = "AREffect";
            return;
        }
        this.A00 = str;
        this.A02 = str;
        this.A04 = str;
        this.A01 = str;
    }
}
