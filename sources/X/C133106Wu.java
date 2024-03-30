package X;

/* renamed from: X.6Wu  reason: invalid class name and case insensitive filesystem */
public class C133106Wu {
    public long A00 = 0;
    public long A01 = 0;
    public long A02 = 0;
    public long A03 = 0;
    public long A04 = 0;
    public long A05 = 0;
    public long A06 = 0;
    public final C21010yW A07;
    public final C21430zE A08;
    public final boolean A09;
    public final boolean A0A;
    public final C19970wo A0B;

    public static void A01(C133106Wu r2, Integer num, int i, int i2) {
        String str;
        String str2;
        C21430zE r22 = r2.A08;
        if (num.intValue() == 0) {
            str = "api_1";
        } else {
            str = "api_2";
        }
        r22.markerAnnotate(i, "camera_api", str);
        if (i2 == 1) {
            str2 = "camera_core";
        } else {
            str2 = "wa";
        }
        r22.markerAnnotate(i, "camera_type", str2);
    }

    public static void A04(C133106Wu r2, String str, String str2) {
        if (r2.A0A) {
            C21430zE r22 = r2.A08;
            if (!r22.BMN(554251647)) {
                r22.markerStart(554251647, "startup_type", str);
                r22.markerAnnotate(554251647, "origin", str2);
            }
        }
    }

    public void A05(short s) {
        if (this.A0A) {
            this.A08.markerEnd(554251647, s);
        }
    }

    public C133106Wu(C19970wo r3, C20810yC r4, C21010yW r5, C21430zE r6) {
        this.A0B = r3;
        this.A07 = r5;
        this.A08 = r6;
        this.A09 = r4.A0E(125);
        this.A0A = r4.A0E(980);
    }

    public static void A00(C133106Wu r2, int i, int i2) {
        String str;
        Integer valueOf = Integer.valueOf(i2);
        if (valueOf == null || (str = valueOf.toString()) == null) {
            str = "";
        }
        r2.A08.markerAnnotate(i, "camera_facing", str);
    }

    public static void A02(C133106Wu r2, String str, int i) {
        String A0q = AnonymousClass000.A0q("_end", AnonymousClass000.A0v(str));
        if (r2.A0A) {
            r2.A08.markerPoint(i, A0q);
        }
    }

    public static void A03(C133106Wu r2, String str, int i) {
        String A0q = AnonymousClass000.A0q("_start", AnonymousClass000.A0v(str));
        if (r2.A0A) {
            r2.A08.markerPoint(i, A0q);
        }
    }
}
