package X;

import java.util.List;

/* renamed from: X.9Wd  reason: invalid class name and case insensitive filesystem */
public abstract class C195819Wd {
    public boolean A00;
    public final List A01 = AnonymousClass001.A0I();
    public final List A02 = AnonymousClass001.A0I();
    public final AnonymousClass9OL A03;

    public final void A02(C176968cy r2) {
        synchronized (this) {
            this.A02.add(r2);
        }
    }

    public final C176968cy A00() {
        C176968cy r1 = (C176968cy) this.A03.A02.get();
        r1.A01 = C199649fg.A01;
        return r1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.8cY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.8cX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: X.8cY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: X.8cY} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.C176698cX
            if (r0 == 0) goto L_0x0071
            r4 = r6
            X.8cX r4 = (X.C176698cX) r4
            X.8cy r3 = r4.A00()
            r3.A06()
            r0 = 89
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A05 = r0
            java.lang.Class<X.8mo> r0 = X.C181028mo.class
            X.08f r0 = X.C36441kJ.A1A(r0)
            r3.A06 = r0
            X.8yo r0 = X.C187958yo.IN_DEVELOPMENT
            r3.A00 = r0
            X.8cs r2 = r3.A08()
            r2.A06()
            java.lang.Class<X.B6E> r0 = X.B6E.class
            X.08f r5 = X.C36441kJ.A1A(r0)
            X.AeZ r1 = X.C21964AeZ.A00
            r0 = 22
            X.C176908cs.A00(r2, r1, r5, r0)
            java.lang.Class<X.0rz> r0 = X.C17760rz.class
            X.08f r1 = X.C36441kJ.A1A(r0)
            X.004 r0 = r4.A00
            r2.A08(r0, r1)
            java.lang.Class<X.0rx> r0 = X.C17740rx.class
            X.08f r1 = X.C36441kJ.A1A(r0)
            X.004 r0 = r4.A03
            r2.A08(r0, r1)
            java.lang.Class<X.B6C> r0 = X.B6C.class
            X.08f r1 = X.C36441kJ.A1A(r0)
            X.004 r0 = r4.A01
            r2.A08(r0, r1)
            java.lang.Class<X.4VB> r0 = X.AnonymousClass4VB.class
            X.08f r1 = X.C36441kJ.A1A(r0)
            X.004 r0 = r4.A02
        L_0x005f:
            r2.A08(r0, r1)
            r2.A05()
            r0 = 1
            r2.A00 = r0
            r3.A05()
            r3.A00 = r0
            r4.A02(r3)
            return
        L_0x0071:
            r4 = r6
            X.8cY r4 = (X.C176708cY) r4
            X.8cy r3 = r4.A00()
            r3.A06()
            java.lang.Integer r0 = X.C36381kD.A0m()
            r3.A05 = r0
            java.lang.Class<X.2bV> r0 = X.AnonymousClass2bV.class
            X.08f r0 = X.C36441kJ.A1A(r0)
            r3.A06 = r0
            X.8yo r0 = X.C187958yo.FULLY_INTEGRATED
            r3.A00 = r0
            X.8cs r2 = r3.A08()
            r2.A06()
            java.lang.Class<X.B6E> r0 = X.B6E.class
            X.08f r5 = X.C36441kJ.A1A(r0)
            X.AeG r1 = X.C21945AeG.A00
            r0 = 22
            X.C176908cs.A00(r2, r1, r5, r0)
            java.lang.Class<X.B69> r0 = X.B69.class
            X.08f r1 = X.C36441kJ.A1A(r0)
            X.004 r0 = r4.A00
            r2.A08(r0, r1)
            java.lang.Class<X.0rz> r0 = X.C17760rz.class
            X.08f r1 = X.C36441kJ.A1A(r0)
            X.004 r0 = r4.A01
            r2.A08(r0, r1)
            java.lang.Class<X.0rx> r0 = X.C17740rx.class
            X.08f r1 = X.C36441kJ.A1A(r0)
            X.004 r0 = r4.A07
            r2.A08(r0, r1)
            java.lang.Class<X.B6C> r0 = X.B6C.class
            X.08f r1 = X.C36441kJ.A1A(r0)
            X.004 r0 = r4.A03
            r2.A08(r0, r1)
            java.lang.Class<X.B6B> r0 = X.B6B.class
            X.08f r1 = X.C36441kJ.A1A(r0)
            X.004 r0 = r4.A08
            r2.A08(r0, r1)
            java.lang.Class<X.4VA> r0 = X.AnonymousClass4VA.class
            X.08f r1 = X.C36441kJ.A1A(r0)
            X.004 r0 = r4.A04
            r2.A08(r0, r1)
            java.lang.Class<X.B6D> r0 = X.B6D.class
            X.08f r1 = X.C36441kJ.A1A(r0)
            X.004 r0 = r4.A09
            r2.A08(r0, r1)
            java.lang.Class<X.4VB> r0 = X.AnonymousClass4VB.class
            X.08f r1 = X.C36441kJ.A1A(r0)
            X.004 r0 = r4.A06
            r2.A08(r0, r1)
            java.lang.Class<X.B6A> r0 = X.B6A.class
            X.08f r1 = X.C36441kJ.A1A(r0)
            X.004 r0 = r4.A05
            r2.A08(r0, r1)
            java.lang.Class<X.B68> r0 = X.B68.class
            X.08f r1 = X.C36441kJ.A1A(r0)
            X.004 r0 = r4.A02
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195819Wd.A01():void");
    }

    public C195819Wd(AnonymousClass9OL r2) {
        this.A03 = r2;
    }
}
