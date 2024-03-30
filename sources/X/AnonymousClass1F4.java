package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1F4  reason: invalid class name */
public final class AnonymousClass1F4 {
    public final C19700wN A00;
    public final C19630wG A01;
    public final C19650wI A02;
    public final C19770wU A03;
    public final AnonymousClass005 A04;
    public final Set A05 = new LinkedHashSet();
    public final AnonymousClass00T A06 = new AnonymousClass00U(new AnonymousClass1F5(this));

    public AnonymousClass1F4(C19700wN r3, C19630wG r4, C19650wI r5, C19770wU r6, AnonymousClass005 r7) {
        AnonymousClass00C.A0D(r7, 1);
        AnonymousClass00C.A0D(r6, 2);
        AnonymousClass00C.A0D(r5, 3);
        AnonymousClass00C.A0D(r3, 4);
        AnonymousClass00C.A0D(r4, 5);
        this.A04 = r7;
        this.A03 = r6;
        this.A02 = r5;
        this.A00 = r3;
        this.A01 = r4;
    }

    public static final void A00(AnonymousClass1F4 r1, C63503Kh r2) {
        AnonymousClass4U1 r0;
        AnonymousClass00C.A0D(r2, 0);
        if (!r2.A01 && !r1.A04(r2)) {
            r2.A00();
        }
        if (!r2.A01 && r1.A04(r2) && (r0 = (AnonymousClass4U1) ((Map) r1.A06.getValue()).get(Integer.valueOf(r2.A02))) != null) {
            r0.BOL(r2);
        }
    }

    public final void A02(Runnable runnable, C63503Kh[] r7) {
        Object[] copyOf = Arrays.copyOf(r7, 1);
        AnonymousClass00C.A0D(copyOf, 0);
        List<C63503Kh> A0D = AnonymousClass02R.A0D(copyOf);
        for (C63503Kh r1 : A0D) {
            AnonymousClass00C.A0D(r1, 0);
            if (!r1.A01 && !A04(r1)) {
                r1.A00();
            }
        }
        if (!A0D.isEmpty()) {
            for (C63503Kh r12 : A0D) {
                AnonymousClass00C.A0D(r12, 0);
                if (!r12.A01 && A04(r12)) {
                    this.A03.Boy(new C35351iY(this, runnable, (Collection) A0D));
                    return;
                }
            }
        }
        this.A02.A00(runnable);
    }

    public final boolean A03(AnonymousClass3T1 r6) {
        Collection<C63503Kh> values = r6.A1e.values();
        if (values == null || !values.isEmpty()) {
            for (C63503Kh r1 : values) {
                AnonymousClass00C.A0B(r1);
                AnonymousClass00C.A0D(r1, 0);
                if (!r1.A01 && A04(r1)) {
                    return true;
                }
            }
        }
        AnonymousClass3T1 A0S = r6.A0S();
        if (A0S == null) {
            return false;
        }
        return A03(A0S);
    }

    public final boolean A04(C63503Kh r6) {
        int i = r6.A02;
        Integer valueOf = Integer.valueOf(i);
        AnonymousClass4U1 r0 = (AnonymousClass4U1) ((Map) this.A06.getValue()).get(valueOf);
        if (r0 == null) {
            if (this.A05.add(valueOf)) {
                C19700wN r2 = this.A00;
                StringBuilder sb = new StringBuilder();
                sb.append("type=");
                sb.append(r6.A03.A1I);
                sb.append(", tag=");
                sb.append(i);
                r2.A0E("fmessage-lazy-loading-no-tag-owner", sb.toString(), false);
            }
        } else if (r0.BJq(r6)) {
            return true;
        }
        return false;
    }

    public final void A01(AnonymousClass3T1 r3) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(r3.A1e.values());
        AnonymousClass3T1 A0S = r3.A0S();
        if (A0S != null) {
            arrayList.addAll(A0S.A1e.values());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A00(this, (C63503Kh) it.next());
        }
    }
}
