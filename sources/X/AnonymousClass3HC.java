package X;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3HC  reason: invalid class name */
public final class AnonymousClass3HC {
    public final C19460v5 A00;
    public final C89014Ux A01;
    public final C89014Ux A02;
    public final C89014Ux A03;
    public final C89014Ux A04;
    public final C89014Ux A05;
    public final C89014Ux A06;
    public final C89014Ux A07;
    public final C89014Ux A08;
    public final C89014Ux A09;
    public final C89014Ux A0A;
    public final C89014Ux A0B;
    public final C89014Ux A0C;
    public final C89014Ux A0D;
    public final Map A0E;
    public final Map A0F;
    public final AnonymousClass00T A0G = C36431kI.A1I(new C83684Ai(this));
    public final Map A0H;
    public final Map A0I = AnonymousClass001.A0J();

    public final void A01(Context context) {
        AnonymousClass00C.A0D(context, 0);
        this.A07.Bwf(context);
        this.A08.Bwf(context);
        this.A09.Bwf(context);
        this.A0A.Bwf(context);
        this.A0C.Bwf(context);
        this.A01.Bwf(context);
        this.A05.Bwf(context);
        this.A0D.Bwf(context);
        this.A06.Bwf(context);
        this.A02.Bwf(context);
        this.A03.Bwf(context);
        this.A0B.Bwf(context);
        this.A04.Bwf(context);
        Iterator A0y = AnonymousClass000.A0y(this.A0I);
        while (A0y.hasNext()) {
            ((C89014Ux) C36351kA.A0u(A0y)).Bwf(context);
        }
    }

    public final C89014Ux A00(int i) {
        Map map = this.A0I;
        Integer valueOf = Integer.valueOf(i);
        C89014Ux r1 = (C89014Ux) map.get(valueOf);
        if (r1 != null) {
            return r1;
        }
        C89014Ux r0 = (C89014Ux) this.A0H.get(valueOf);
        if (r0 == null) {
            r0 = this.A09;
        }
        C70603fQ r12 = new C70603fQ(r0);
        map.put(valueOf, r12);
        return r12;
    }

    public AnonymousClass3HC(C19460v5 r6, C19630wG r7, C18820ts r8, C20810yC r9, AnonymousClass13J r10) {
        C36321k7.A1B(r7, r9, r10, r8, r6);
        this.A00 = r6;
        this.A07 = new AnonymousClass2J2(r7, r8, r9);
        this.A08 = new C43592Iv(r7, r8, r9);
        this.A09 = new C70613fR(r7, r8, r9);
        this.A0C = new AnonymousClass2Iz(r7, r8, r9);
        this.A0A = new AnonymousClass2Iy(r7, r8, r9);
        this.A01 = new AnonymousClass2Ix(r7, r8, r9);
        this.A05 = new AnonymousClass2J4(r7, r8, r9, r10);
        this.A0D = new AnonymousClass2J6(r7, r8, r9);
        this.A06 = new AnonymousClass2J5(r7, r8, r9);
        this.A02 = new AnonymousClass2J7(r7, r8, r9);
        this.A03 = new AnonymousClass2J8(r7, r8, r9);
        this.A0B = new AnonymousClass2J0(r7, r8, r9);
        this.A04 = new AnonymousClass2J3(r7, r8, r9);
        HashMap A0J = AnonymousClass001.A0J();
        C36341k9.A1K(this.A07, A0J, 2);
        C36341k9.A1K(this.A08, A0J, 3);
        C36341k9.A1K(this.A09, A0J, 1);
        C36341k9.A1K(this.A0C, A0J, 5);
        C36341k9.A1K(this.A0A, A0J, 6);
        C36341k9.A1K(this.A0D, A0J, 7);
        C36341k9.A1K(this.A06, A0J, 8);
        C36341k9.A1K(this.A0B, A0J, 10);
        C36341k9.A1K(this.A01, A0J, 11);
        C36341k9.A1K(this.A05, A0J, 12);
        C36341k9.A1K(this.A02, A0J, 9);
        C36341k9.A1K(this.A03, A0J, 14);
        if (this.A00.A05()) {
            C36341k9.A1K(this.A0G.getValue(), A0J, 4);
        }
        C36341k9.A1K(this.A04, A0J, 13);
        this.A0F = A0J;
        Set entrySet = A0J.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C36331k8.A01(entrySet));
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(it);
            linkedHashMap.put(Integer.valueOf(AnonymousClass000.A0I(A11.getValue())), A11.getKey());
        }
        this.A0H = linkedHashMap;
        this.A0E = AnonymousClass001.A0J();
    }
}
