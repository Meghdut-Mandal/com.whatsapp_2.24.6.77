package X;

import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.6qh  reason: invalid class name and case insensitive filesystem */
public class C143526qh implements C159307j9, C87584Pj {
    public AnonymousClass6QG A00;
    public AnonymousClass6DV A01;
    public final C001700s A02 = C36431kI.A0S();
    public final C145896uh A03;
    public final C116795lD A04 = new C116795lD(this);
    public final C116805lE A05 = new C116805lE(this);
    public final C124535yM A06;
    public final C159377jG A07 = new C143736r2(this);
    public final C20810yC A08;
    public final AnonymousClass1QW A09;
    public final AnonymousClass3F3 A0A;
    public final Map A0B = Collections.synchronizedMap(C36431kI.A1G());
    public final AnonymousClass00S A0C = new C165077sq(this, 2);
    public final C142616pA A0D;
    public final C142646pD A0E;
    public final C130846Mq A0F;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.C143526qh r8, int r9) {
        /*
            r2 = 0
            r1 = 39
            if (r9 == 0) goto L_0x000f
            r0 = 1
            r1 = 38
            if (r9 == r0) goto L_0x000f
            r0 = 2
            if (r9 == r0) goto L_0x0030
            r1 = 78
        L_0x000f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x0013:
            X.6pD r1 = r8.A0E
            r5 = 0
            int r6 = r0.intValue()
            r7 = 2
            X.6QG r0 = r8.A00
            if (r0 == 0) goto L_0x0027
            int r0 = r0.A02()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L_0x0027:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4 = 0
            r1.A08(r2, r3, r4, r5, r6, r7)
        L_0x002f:
            return
        L_0x0030:
            X.1QW r0 = r8.A09
            boolean r1 = r0.A06()
            r0 = 5
            if (r1 == 0) goto L_0x003b
            r0 = 86
        L_0x003b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x002f
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C143526qh.A04(X.6qh, int):void");
    }

    public static boolean A07(AnonymousClass6QG r3) {
        if (r3 == null) {
            return false;
        }
        String str = r3.A08;
        return "device".equals(str) || "pin_on_map".equals(str) || "manual".equals(str);
    }

    private AnonymousClass5DY A00(C119275pY r5) {
        C1025950u r1 = (C1025950u) r5.A01;
        if (!r1.A00.isEmpty()) {
            List list = r1.A00;
            return new AnonymousClass5DY(new C163547qN(this, 0), new AnonymousClass5ZQ(this, 0), list);
        }
        this.A0D.A04(Integer.valueOf(this.A00.A02()), 83, 2);
        return null;
    }

    private AnonymousClass5Da A01() {
        C119275pY r2 = (C119275pY) C36371kC.A0r(this.A0B, 3);
        if (r2 == null || r2.A00 != 1) {
            return null;
        }
        ArrayList arrayList = ((AnonymousClass315) r2.A01).A00;
        if (arrayList.isEmpty()) {
            return null;
        }
        return new AnonymousClass5Da(new C163547qN(this, 1), new AnonymousClass5ZQ(this, 1), new C147066wc(this), arrayList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fd, code lost:
        if (r0 != null) goto L_0x00ff;
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.C143526qh r7) {
        /*
            java.util.Map r5 = r7.A0B
            java.util.Iterator r2 = X.AnonymousClass000.A0z(r5)
        L_0x0006:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0018
            java.lang.Object r0 = r2.next()
            X.5pY r0 = (X.C119275pY) r0
            int r1 = r0.A00
            r0 = 2
            if (r1 != r0) goto L_0x0006
            return
        L_0x0018:
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            boolean r0 = r7.A06()
            if (r0 != 0) goto L_0x0064
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            X.1QW r0 = r7.A09
            X.0yC r1 = r0.A03
            r0 = 4610(0x1202, float:6.46E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0043
            r0 = 0
            X.5EM r1 = new X.5EM
            r1.<init>(r0)
        L_0x0038:
            r3.add(r1)
        L_0x003b:
            r2.addAll(r3)
            java.lang.Class<X.6qh> r3 = X.C143526qh.class
            monitor-enter(r3)
            goto L_0x015c
        L_0x0043:
            r1 = 16
            X.5EE r0 = new X.5EE
            r0.<init>(r1)
            r3.add(r0)
            X.5Dm r0 = new X.5Dm
            r0.<init>()
            r3.add(r0)
            X.5Dm r0 = new X.5Dm
            r0.<init>()
            r3.add(r0)
            r0 = 1
            X.5EC r1 = new X.5EC
            r1.<init>(r0)
            goto L_0x0038
        L_0x0064:
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            X.6QG r0 = r7.A00
            boolean r0 = A07(r0)
            if (r0 != 0) goto L_0x0083
            X.1QW r0 = r7.A09
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0083
            r3 = 0
            X.7jG r1 = r7.A07
            X.5EF r0 = new X.5EF
            r0.<init>(r1, r3)
            r4.add(r0)
        L_0x0083:
            r2.addAll(r4)
            X.1QW r0 = r7.A09
            X.0yC r1 = r0.A03
            r0 = 4610(0x1202, float:6.46E-42)
            boolean r0 = r1.A0E(r0)
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            if (r0 == 0) goto L_0x00e8
            java.util.Iterator r6 = X.AnonymousClass000.A10(r5)
        L_0x009a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x013d
            java.lang.Object r0 = r6.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            java.lang.Object r1 = X.C90514aH.A0p(r0, r5)
            X.5pY r1 = (X.C119275pY) r1
            if (r3 == 0) goto L_0x00e0
            r0 = 1
            if (r3 == r0) goto L_0x00ca
            r0 = 2
            if (r3 == r0) goto L_0x00c5
            r0 = 3
            if (r3 != r0) goto L_0x009a
            X.5Da r1 = r7.A01()
            if (r1 == 0) goto L_0x009a
        L_0x00c1:
            r4.add(r1)
            goto L_0x009a
        L_0x00c5:
            X.5DY r1 = r7.A00(r1)
            goto L_0x00c1
        L_0x00ca:
            java.lang.Object r1 = r1.A01
            X.50v r1 = (X.C1026050v) r1
            java.util.List r0 = r1.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00de
            java.util.List r0 = r1.A00
            X.2Xl r1 = new X.2Xl
            r1.<init>(r7, r0)
            goto L_0x00c1
        L_0x00de:
            r1 = 0
            goto L_0x00c1
        L_0x00e0:
            java.util.ArrayList r0 = r7.A02()
            r4.addAll(r0)
            goto L_0x009a
        L_0x00e8:
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            r0 = 2
            java.lang.Object r1 = X.C36371kC.A0r(r5, r0)
            X.5pY r1 = (X.C119275pY) r1
            if (r1 == 0) goto L_0x0156
            java.lang.Object r0 = r1.A01
            if (r0 == 0) goto L_0x0156
            X.5DY r0 = r7.A00(r1)
            if (r0 == 0) goto L_0x0102
        L_0x00ff:
            r3.add(r0)
        L_0x0102:
            r4.addAll(r3)
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            r0 = 1
            java.lang.Object r0 = X.C36371kC.A0r(r5, r0)
            X.5pY r0 = (X.C119275pY) r0
            if (r0 == 0) goto L_0x0150
            java.lang.Object r1 = r0.A01
            if (r1 == 0) goto L_0x0150
            X.50v r1 = (X.C1026050v) r1
            java.util.List r0 = r1.A00
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x012a
            java.util.List r0 = r1.A00
            X.2Xl r1 = new X.2Xl
            r1.<init>(r7, r0)
        L_0x0127:
            r3.add(r1)
        L_0x012a:
            r4.addAll(r3)
            java.util.ArrayList r0 = r7.A02()
            r4.addAll(r0)
            X.5Da r0 = r7.A01()
            if (r0 == 0) goto L_0x013d
            r4.add(r0)
        L_0x013d:
            r2.addAll(r4)
            X.5Di r0 = new X.5Di
            r0.<init>()
            r2.add(r0)
            X.6QG r0 = r7.A00
            java.util.ArrayList r3 = r7.A08(r0)
            goto L_0x003b
        L_0x0150:
            X.5Dm r1 = new X.5Dm
            r1.<init>()
            goto L_0x0127
        L_0x0156:
            X.5Dm r0 = new X.5Dm
            r0.<init>()
            goto L_0x00ff
        L_0x015c:
            X.5yM r1 = r7.A06     // Catch:{ all -> 0x016e }
            r0 = 1
            r1.A02 = r0     // Catch:{ all -> 0x016e }
            java.util.List r0 = r1.A08     // Catch:{ all -> 0x016e }
            r0.clear()     // Catch:{ all -> 0x016e }
            r0.addAll(r2)     // Catch:{ all -> 0x016e }
            r7.A0A()     // Catch:{ all -> 0x016e }
            monitor-exit(r3)     // Catch:{ all -> 0x016e }
            return
        L_0x016e:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x016e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C143526qh.A03(X.6qh):void");
    }

    public static void A05(C143526qh r3, C1261662u r4, int i, int i2) {
        synchronized (C143526qh.class) {
            C124535yM r1 = r3.A06;
            r1.A02 = 4;
            r1.A00 = i;
            r1.A07 = r4;
            r1.A01 = i2;
            r3.A0A();
        }
    }

    private boolean A06() {
        Map map = this.A0B;
        if (!map.isEmpty()) {
            Iterator A0y = AnonymousClass000.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y);
                if (((C119275pY) A11.getValue()).A00 != 0 || AnonymousClass000.A0I(A11.getKey()) == 3) {
                }
            }
            return true;
        }
        return false;
    }

    public void A09() {
        synchronized (C143526qh.class) {
            C124535yM r1 = this.A06;
            r1.A04 = null;
            r1.A06 = null;
            r1.A02 = 1;
        }
    }

    public void A0A() {
        this.A02.A0C(this.A06);
    }

    public void BSS(C1261662u r3, int i) {
        C119275pY r1 = (C119275pY) C36371kC.A0r(this.A0B, 0);
        if (r1 != null) {
            r1.A00 = 2;
        }
        A05(this, r3, i, 1);
    }

    public void BST(C128836Du r9) {
        AnonymousClass6DV r1 = this.A01;
        if (r1 != null) {
            r1.A00 = true;
            this.A01 = null;
        }
        ArrayList A0I = AnonymousClass001.A0I();
        A0I.add(r9.A09);
        AnonymousClass6QG r2 = this.A00;
        C18740tg.A06(r2);
        String str = r9.A02;
        AnonymousClass6DV r12 = new AnonymousClass6DV(r2, new C165377tK(r9, this, 1), r9.A01, str, A0I, 2);
        this.A01 = r12;
        this.A0F.A00(r12);
    }

    public void BUV(AnonymousClass315 r5) {
        synchronized (C143526qh.class) {
            C119275pY r1 = (C119275pY) C36371kC.A0r(this.A0B, 3);
            if (r1 != null) {
                r1.A00 = 1;
                r1.A01 = r5;
                if (!r5.A00.isEmpty()) {
                    A04(this, 3);
                }
                if (A06()) {
                    A03(this);
                }
            }
        }
    }

    public C143526qh(C142616pA r3, C142646pD r4, C145896uh r5, C130846Mq r6, C20810yC r7, AnonymousClass1QW r8, AnonymousClass3F3 r9) {
        this.A08 = r7;
        this.A09 = r8;
        this.A06 = new C124535yM();
        this.A03 = r5;
        this.A0A = r9;
        r5.A0A = this;
        r5.A0B = this;
        this.A0D = r3;
        this.A0E = r4;
        r5.A08 = this;
        this.A0F = r6;
    }

    private ArrayList A02() {
        Object r3;
        Object obj;
        ArrayList A0I = AnonymousClass001.A0I();
        AnonymousClass6QG r2 = this.A00;
        AnonymousClass00S r5 = this.A0C;
        A0I.add(new AnonymousClass5EI(r2, r5, R.string.f12nameremoved));
        if (A07(this.A00)) {
            C119275pY r0 = (C119275pY) C36371kC.A0r(this.A0B, 0);
            if (r0 == null || (obj = r0.A01) == null) {
                r3 = new AnonymousClass5EC(false);
            } else {
                C128836Du r1 = (C128836Du) obj;
                if (r1.A09.isEmpty()) {
                    r3 = new AnonymousClass5EB(r5);
                } else {
                    r3 = new AnonymousClass5EJ(this.A00, this.A05, r1.A09);
                }
            }
        } else {
            r3 = new AnonymousClass5EA(this.A04);
        }
        A0I.add(r3);
        return A0I;
    }

    public ArrayList A08(AnonymousClass6QG r4) {
        ArrayList A0I = AnonymousClass001.A0I();
        A0I.add(new C105075Dg());
        if (r4 == null || (r4.A04() && !A07(this.A00) && this.A09.A05())) {
            return A0I;
        }
        A0I.add(new C105195Ds(new C135436ch(this, 44)));
        return A0I;
    }
}
