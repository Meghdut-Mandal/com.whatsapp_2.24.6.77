package X;

import java.util.HashMap;

/* renamed from: X.59o  reason: invalid class name and case insensitive filesystem */
public abstract class C1044059o extends AnonymousClass6VU {
    public String A00 = "1.0";
    public final AnonymousClass7fR A01;
    public final C159177iw A02;
    public final C18820ts A03;
    public final AnonymousClass17Z A04;

    public C1044059o(C19700wN r10, AnonymousClass7fQ r11, AnonymousClass7fR r12, C159177iw r13, AnonymousClass17Z r14, C18820ts r15, C159487jR r16, C1265464l r17, C132406Tm r18, C19770wU r19) {
        super(r10, r11, r16, r17, r18, r19, "WA_BizDirectorySearch");
        this.A03 = r15;
        this.A01 = r12;
        this.A04 = r14;
        this.A02 = r13;
    }

    public static void A01(AnonymousClass6QG r3, HashMap hashMap) {
        Double d;
        Double d2;
        Object obj;
        String str;
        String str2 = r3.A08;
        hashMap.put("location_type", str2);
        if (str2.equals("country_default")) {
            obj = r3.A06;
            C18740tg.A06(obj);
            str = "country_code";
        } else {
            boolean A05 = r3.A05();
            if (A05) {
                d = r3.A03;
            } else {
                d = r3.A01;
            }
            hashMap.put("wa_biz_directory_lat", d);
            if (A05) {
                d2 = r3.A04;
            } else {
                d2 = r3.A02;
            }
            hashMap.put("wa_biz_directory_long", d2);
            obj = r3.A05;
            str = "radius";
        }
        hashMap.put(str, obj);
    }
}
