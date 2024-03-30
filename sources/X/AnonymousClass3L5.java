package X;

import java.util.Collection;

/* renamed from: X.3L5  reason: invalid class name */
public final class AnonymousClass3L5 {
    public final C25731Hl A00;
    public final C220412q A01;
    public final C21010yW A02;

    public final void A00(int i) {
        AnonymousClass2PN r1 = new AnonymousClass2PN();
        r1.A01 = Integer.valueOf(i);
        r1.A02 = C36441kJ.A0y(this.A01.A01.size());
        r1.A00 = Boolean.valueOf(this.A00.A04());
        this.A02.Bly(r1);
    }

    public final void A01(int i, int i2) {
        C44832Pa r2 = new C44832Pa();
        r2.A01 = Integer.valueOf(i);
        r2.A00 = Integer.valueOf(i2);
        r2.A02 = C36441kJ.A0y(this.A01.A01.size());
        Integer num = r2.A00;
        if (num != null && num.intValue() == 1) {
            C25731Hl.A00(this.A00, "folder_open_count");
        }
        this.A02.Bly(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (((X.AnonymousClass2EO) r8).A01 != false) goto L_0x000b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0014  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C53502rQ r8, java.lang.Integer r9) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.AnonymousClass2EO
            r2 = 3
            if (r0 == 0) goto L_0x0057
            X.2EO r8 = (X.AnonymousClass2EO) r8
            boolean r0 = r8.A01
            if (r0 == 0) goto L_0x0074
        L_0x000b:
            r6 = 1
        L_0x000c:
            r5 = 5
            r4 = 2
            r3 = 13
            r0 = 10
            if (r9 == 0) goto L_0x001b
            int r1 = r9.intValue()
            if (r1 != r5) goto L_0x0032
            r2 = 1
        L_0x001b:
            X.2OF r1 = new X.2OF
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A01 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r1.A00 = r0
            X.0yW r0 = r7.A02
            r0.Bly(r1)
            return
        L_0x0032:
            if (r1 == r0) goto L_0x0055
            if (r1 == r3) goto L_0x0055
            r0 = 15
            if (r1 != r0) goto L_0x003d
            r2 = 9
            goto L_0x001b
        L_0x003d:
            r0 = 7
            if (r1 != r0) goto L_0x0043
            r2 = 10
            goto L_0x001b
        L_0x0043:
            r0 = 4
            if (r1 != r0) goto L_0x0049
            r2 = 11
            goto L_0x001b
        L_0x0049:
            if (r1 != r2) goto L_0x004e
            r2 = 12
            goto L_0x001b
        L_0x004e:
            r2 = 14
            if (r1 != r4) goto L_0x001b
            r2 = 13
            goto L_0x001b
        L_0x0055:
            r2 = 2
            goto L_0x001b
        L_0x0057:
            boolean r0 = r8 instanceof X.AnonymousClass2EN
            if (r0 != 0) goto L_0x0076
            boolean r0 = r8 instanceof X.AnonymousClass2EM
            if (r0 != 0) goto L_0x0076
            boolean r0 = r8 instanceof X.AnonymousClass2EQ
            if (r0 != 0) goto L_0x0074
            boolean r0 = r8 instanceof X.AnonymousClass2EP
            if (r0 != 0) goto L_0x000b
            boolean r0 = r8 instanceof X.AnonymousClass2EL
            if (r0 != 0) goto L_0x000b
            boolean r0 = r8 instanceof X.AnonymousClass2EK
            if (r0 != 0) goto L_0x000b
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x0074:
            r6 = 3
            goto L_0x000c
        L_0x0076:
            r6 = 0
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3L5.A02(X.2rQ, java.lang.Integer):void");
    }

    public final void A03(C53502rQ r2, Integer num, Integer num2, int i) {
        AnonymousClass11F r0;
        Collection collection;
        if ((r2 instanceof AnonymousClass2EP) || (r2 instanceof AnonymousClass2EQ)) {
            r0 = null;
        } else if (r2 instanceof AnonymousClass2EM) {
            r0 = ((AnonymousClass2EM) r2).A00;
        } else if (r2 instanceof AnonymousClass2EO) {
            r0 = ((AnonymousClass2EO) r2).A00;
        } else if (r2 instanceof AnonymousClass2EK) {
            r0 = ((AnonymousClass2EK) r2).A00;
        } else {
            if (r2 instanceof AnonymousClass2EN) {
                collection = ((AnonymousClass2EN) r2).A00;
            } else if (r2 instanceof AnonymousClass2EL) {
                collection = ((AnonymousClass2EL) r2).A00;
            } else {
                throw C36441kJ.A18();
            }
            r0 = (AnonymousClass11F) C007103b.A0I(collection);
        }
        A04(r0, num, num2, i);
    }

    public final void A04(AnonymousClass11F r4, Integer num, Integer num2, int i) {
        Boolean bool;
        if (r4 != null) {
            bool = Boolean.valueOf(AnonymousClass143.A0G(r4));
        } else {
            bool = null;
        }
        C45202Ql r1 = new C45202Ql();
        r1.A03 = Integer.valueOf(i);
        r1.A00 = bool;
        r1.A01 = num;
        r1.A04 = C36441kJ.A0y(this.A01.A01.size());
        r1.A02 = num2;
        this.A02.Bly(r1);
    }

    public final void A05(Integer num, Integer num2) {
        AnonymousClass2PM r1 = new AnonymousClass2PM();
        r1.A01 = num;
        r1.A00 = Boolean.valueOf(this.A00.A04());
        r1.A02 = num2;
        this.A02.Bly(r1);
    }

    public AnonymousClass3L5(C25731Hl r1, C220412q r2, C21010yW r3) {
        C36321k7.A11(r3, r2, r1);
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }
}
