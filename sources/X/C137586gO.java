package X;

/* renamed from: X.6gO  reason: invalid class name and case insensitive filesystem */
public final class C137586gO implements AnonymousClass7bX, C161607nB {
    public static final C137566gM A05 = new C137566gM();
    public final AnonymousClass5RU A00;
    public final C114255gv A01;
    public final C156937bC A02;
    public final AnonymousClass5RW A03;
    public final boolean A04;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        if (r1 == r0) goto L_0x0028;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(X.AnonymousClass69C r4, X.C137586gO r5, int r6) {
        /*
            r0 = 5
            boolean r0 = X.AnonymousClass000.A1S(r6, r0)
            r2 = 1
            if (r0 != 0) goto L_0x001d
            r0 = 6
            if (r6 == r0) goto L_0x001d
            r0 = 3
            if (r6 == r0) goto L_0x0022
            r0 = 4
            if (r6 == r0) goto L_0x0022
            if (r6 == r2) goto L_0x0050
            r0 = 2
            if (r6 == r0) goto L_0x0050
            java.lang.String r0 = "Lazy list does not support beyond bounds layout for the specified direction"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x001d:
            X.5RU r1 = r5.A00
            X.5RU r0 = X.AnonymousClass5RU.Horizontal
            goto L_0x0026
        L_0x0022:
            X.5RU r1 = r5.A00
            X.5RU r0 = X.AnonymousClass5RU.Vertical
        L_0x0026:
            if (r1 != r0) goto L_0x0050
        L_0x0028:
            r3 = 0
            if (r2 != 0) goto L_0x004a
            boolean r0 = A01(r5, r6)
            r2 = 1
            if (r0 == 0) goto L_0x004b
            int r1 = r4.A00
            X.7bC r0 = r5.A02
            X.6f0 r0 = (X.C136796f0) r0
            androidx.compose.foundation.lazy.LazyListState r0 = r0.A01
            X.7n5 r0 = r0.A0N
            java.lang.Object r0 = r0.getValue()
            X.7bB r0 = (X.C156927bB) r0
            X.6ge r0 = (X.C137746ge) r0
            int r0 = r0.A04
            int r0 = r0 - r2
            if (r1 >= r0) goto L_0x004a
        L_0x0049:
            r3 = 1
        L_0x004a:
            return r3
        L_0x004b:
            int r0 = r4.A01
            if (r0 <= 0) goto L_0x004a
            goto L_0x0049
        L_0x0050:
            r2 = 0
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137586gO.A00(X.69C, X.6gO, int):boolean");
    }

    public /* synthetic */ C161267mT Bva(C161267mT r2) {
        return AnonymousClass5WL.A00(this, r2);
    }

    public C137586gO(AnonymousClass5RU r1, C114255gv r2, C156937bC r3, AnonymousClass5RW r4, boolean z) {
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = z;
        this.A03 = r4;
        this.A00 = r1;
    }

    public static final boolean A01(C137586gO r3, int i) {
        if (AnonymousClass000.A1O(i)) {
            return false;
        }
        if (i != 2) {
            if (i != 5) {
                if (i != 6) {
                    if (AnonymousClass000.A1S(i, 3)) {
                        int ordinal = r3.A03.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                throw C36441kJ.A18();
                            }
                        }
                    } else if (i == 4) {
                        int ordinal2 = r3.A03.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                throw C36441kJ.A18();
                            }
                        }
                    } else {
                        throw AnonymousClass001.A09("Lazy list does not support beyond bounds layout for the specified direction");
                    }
                }
                if (!r3.A04) {
                    return true;
                }
                return false;
            }
            return r3.A04;
        }
        return true;
    }

    public /* synthetic */ boolean B0v(C006302t r2) {
        return C90464aC.A1Y(this, r2);
    }

    public /* synthetic */ Object B7V(Object obj, C009003v r3) {
        return r3.invoke(obj, this);
    }
}
