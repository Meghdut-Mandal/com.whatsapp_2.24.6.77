package X;

import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.6NB  reason: invalid class name */
public final class AnonymousClass6NB {
    public boolean A00;
    public final C1506776e A01 = C1506776e.A02(new C94384i8[16]);
    public final C1506776e A02 = C1506776e.A02(new C114375h9[16]);
    public final C1506776e A03 = C1506776e.A02(new C137846gp[16]);
    public final C1506776e A04 = C1506776e.A02(new C114375h9[16]);
    public final C161327mZ A05;

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0072 A[EDGE_INSN: B:44:0x0072->B:33:0x0072 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0015  */
    public static final void A00(X.C137856gq r8, X.C114375h9 r9) {
        /*
            X.6gq r7 = r8.A03
            boolean r0 = r7.A08
            if (r0 == 0) goto L_0x007c
            X.76e r6 = X.C1506776e.A01()
            X.6gq r0 = r7.A02
            if (r0 == 0) goto L_0x0077
            r6.A0D(r0)
        L_0x0011:
            int r0 = r6.A00
            if (r0 == 0) goto L_0x007b
            r5 = 1
            X.6gq r7 = X.C1506776e.A03(r6, r0)
            int r0 = r7.A00
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0077
            r4 = r7
        L_0x0021:
            int r0 = r4.A01
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0072
            r3 = 0
            r8 = r4
        L_0x0029:
            boolean r0 = r8 instanceof X.C161807nV
            if (r0 == 0) goto L_0x003c
            X.7nV r8 = (X.C161807nV) r8
            X.65T r0 = r8.BGK()
            boolean r0 = r0.A01(r9)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0068
            goto L_0x0011
        L_0x003c:
            int r0 = r8.A01
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0068
            boolean r0 = r8 instanceof X.C94114hf
            if (r0 == 0) goto L_0x0068
            r0 = r8
            X.4hf r0 = (X.C94114hf) r0
            X.6gq r2 = r0.A00
            r1 = 0
        L_0x004c:
            if (r2 == 0) goto L_0x006d
            int r0 = r2.A01
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0059
            int r1 = r1 + 1
            if (r1 != r5) goto L_0x005c
            r8 = r2
        L_0x0059:
            X.6gq r2 = r2.A02
            goto L_0x004c
        L_0x005c:
            X.76e r3 = X.C90464aC.A0G(r3)
            X.6gq r8 = X.C90524aI.A0D(r3, r8)
            r3.A0D(r2)
            goto L_0x0059
        L_0x0068:
            X.6gq r8 = X.AnonymousClass6VZ.A00(r3)
            goto L_0x006f
        L_0x006d:
            if (r1 != r5) goto L_0x0068
        L_0x006f:
            if (r8 == 0) goto L_0x0072
            goto L_0x0029
        L_0x0072:
            X.6gq r4 = r4.A02
            if (r4 == 0) goto L_0x0077
            goto L_0x0021
        L_0x0077:
            X.AnonymousClass6VZ.A04(r6, r7)
            goto L_0x0011
        L_0x007b:
            return
        L_0x007c:
            java.lang.String r0 = "visitSubtreeIf called on an unattached node"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6NB.A00(X.6gq, X.5h9):void");
    }

    public final void A01() {
        if (!this.A00) {
            this.A00 = true;
            C161327mZ r0 = this.A05;
            AnonymousClass7J4 r2 = new AnonymousClass7J4(this);
            C1506776e r1 = ((AndroidComposeView) r0).A0N;
            if (!r1.A0E(r2)) {
                r1.A0D(r2);
            }
        }
    }

    public AnonymousClass6NB(C161327mZ r3) {
        this.A05 = r3;
    }
}
