package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6SR  reason: invalid class name */
public final class AnonymousClass6SR {
    public AnonymousClass6MF A00 = null;
    public C161027m0 A01 = null;
    public AnonymousClass7fG A02 = null;
    public final AnonymousClass68W A03;
    public final C142106oL A04;
    public final C139046j9 A05;
    public final C158987iZ A06;
    public final AnonymousClass7eT A07;
    public final C16140og A08;
    public final AtomicLong A09 = new AtomicLong();
    public final AtomicReference A0A = new AtomicReference(AnonymousClass6S1.A02);
    public final AtomicReference A0B = new AtomicReference();

    public static String A00(String str, int i) {
        String str2;
        boolean A1S = AnonymousClass000.A1S(i, 2);
        StringBuilder A0u = AnonymousClass000.A0u();
        if (A1S) {
            str2 = "cc_";
        } else {
            str2 = "nc_";
        }
        return AnonymousClass000.A0p(str2, str, A0u);
    }

    public static void A01(AnonymousClass6SR r10, C161027m0 r11, AnonymousClass6S1 r12) {
        long now = r10.A07.now();
        C161027m0 r4 = r11;
        if (r12.A01.A00) {
            Iterator A10 = C36371kC.A10(AnonymousClass001.A0J());
            while (A10.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A10);
                r11.BPL(C90494aF.A0f(A11), C36431kI.A09(A11.getValue()));
            }
            HashMap A0J = AnonymousClass001.A0J();
            if ("".length() > 0) {
                A0J.put("fb_request_id", "");
            }
            Iterator A102 = C36371kC.A10(A0J);
            while (A102.hasNext()) {
                Map.Entry A112 = AnonymousClass000.A11(A102);
                r11.BPB(C90494aF.A0f(A112), C90514aH.A10(A112));
            }
        }
        if (r12.A00 != 2) {
            r11.BQ7("bloks_query", true);
        } else {
            r4.B2A(0, "bloks_query", true, now);
        }
    }

    public AnonymousClass6SR(C142106oL r4, C139046j9 r5, C16140og r6) {
        C158987iZ r0 = AnonymousClass6NR.A00().A01;
        this.A06 = r0;
        AnonymousClass7eT BI9 = r0.BI9();
        this.A07 = BI9;
        this.A04 = r4;
        this.A05 = r5;
        this.A08 = r6;
        this.A03 = new AnonymousClass68W(BI9.now());
    }
}
