package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.HashMap;

/* renamed from: X.1Ok  reason: invalid class name and case insensitive filesystem */
public class C27491Ok {
    public final C19970wo A00;
    public final C21010yW A01;
    public final HashMap A02;

    public C27491Ok(C19970wo r2, C21010yW r3) {
        HashMap hashMap = new HashMap();
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = hashMap;
    }

    public static void A00(C27491Ok r5, C1041758o r6) {
        HashMap hashMap = r5.A02;
        Number number = (Number) hashMap.get(r6);
        if (number != null) {
            r6.A0B = Long.valueOf(C19970wo.A00(r5.A00) - number.longValue());
            hashMap.remove(r6);
            return;
        }
        r6.A0B = -1L;
    }

    public static void A01(C192519Hh r4, C1041758o r5) {
        AnonymousClass9OU r3 = r4.A00;
        C194899Rr r0 = r3.A02;
        int i = 0;
        int i2 = 0;
        if (r0 != null) {
            i2 = 1;
            if (r0.A03) {
                i2 = 0;
            }
            i = 1;
        }
        C194899Rr r02 = r3.A08;
        if (r02 != null) {
            i |= 2;
            if (!r02.A03) {
                i2 |= 2;
            }
        }
        C194899Rr r03 = r3.A09;
        if (r03 != null) {
            i |= 4;
            if (!r03.A03) {
                i2 |= 4;
            }
        }
        C194899Rr r04 = r3.A07;
        if (r04 != null) {
            i |= 8;
            if (!r04.A03) {
                i2 |= 8;
            }
        }
        C194899Rr r05 = r3.A01;
        if (r05 != null) {
            i |= 16;
            if (!r05.A03) {
                i2 |= 16;
            }
        }
        C194899Rr r06 = r3.A03;
        if (r06 != null) {
            i |= 32;
            if (!r06.A03) {
                i2 |= 32;
            }
        }
        C194899Rr r07 = r3.A06;
        if (r07 != null) {
            i |= 64;
            if (!r07.A03) {
                i2 |= 64;
            }
        }
        C194899Rr r08 = r3.A04;
        if (r08 != null) {
            i |= 128;
            if (!r08.A03) {
                i2 |= 128;
            }
        }
        C194899Rr r09 = r3.A05;
        if (r09 != null) {
            i |= 256;
            if (!r09.A03) {
                i2 |= 256;
            }
        }
        C194899Rr r010 = r3.A00;
        if (r010 != null) {
            i |= 512;
            if (!r010.A03) {
                i2 |= 512;
            }
        }
        C194899Rr r011 = r3.A0B;
        if (r011 != null) {
            i |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            if (!r011.A03) {
                i2 |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            }
        }
        r5.A0D = Long.valueOf((long) i);
        r5.A0A = Long.valueOf((long) i2);
        r5.A0G = Long.valueOf((long) r4.A01.length);
    }
}
