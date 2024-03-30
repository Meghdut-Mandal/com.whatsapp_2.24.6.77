package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.0hz  reason: invalid class name and case insensitive filesystem */
public final class C12400hz implements Iterator, AnonymousClass00W {
    public int A00 = -1;
    public C15020mZ A01;
    public int A02;
    public int A03;
    public int A04;
    public final /* synthetic */ C12830ij A05;

    public C12400hz(C12830ij r3) {
        this.A05 = r3;
        int A022 = C15040mb.A02(0, 0, r3.A01.length());
        this.A03 = A022;
        this.A04 = A022;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r0 < r1) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00() {
        /*
            r8 = this;
            int r7 = r8.A04
            r5 = 0
            if (r7 >= 0) goto L_0x000b
            r8.A00 = r5
            r0 = 0
            r8.A01 = r0
            return
        L_0x000b:
            X.0ij r6 = r8.A05
            int r1 = r6.A00
            r2 = -1
            r3 = 1
            if (r1 <= 0) goto L_0x001b
            int r0 = r8.A02
            int r0 = r0 + 1
            r8.A02 = r0
            if (r0 >= r1) goto L_0x0053
        L_0x001b:
            java.lang.CharSequence r4 = r6.A01
            int r0 = r4.length()
            if (r7 > r0) goto L_0x0053
            X.03v r1 = r6.A02
            int r0 = r8.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r1.invoke(r4, r0)
            X.011 r1 = (X.AnonymousClass011) r1
            if (r1 == 0) goto L_0x0053
            java.lang.Object r0 = r1.first
            int r2 = X.AnonymousClass000.A0I(r0)
            java.lang.Object r0 = r1.second
            int r1 = X.AnonymousClass000.A0I(r0)
            int r0 = r8.A03
            X.0mZ r0 = X.C15040mb.A05(r0, r2)
            r8.A01 = r0
            int r2 = r2 + r1
            r8.A03 = r2
            if (r1 != 0) goto L_0x004d
            r5 = 1
        L_0x004d:
            int r2 = r2 + r5
        L_0x004e:
            r8.A04 = r2
            r8.A00 = r3
            return
        L_0x0053:
            int r4 = r8.A03
            java.lang.CharSequence r0 = r6.A01
            int r0 = r0.length()
            int r1 = r0 + -1
            X.0mZ r0 = new X.0mZ
            r0.<init>(r4, r1)
            r8.A01 = r0
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12400hz.A00():void");
    }

    public boolean hasNext() {
        if (this.A00 == -1) {
            A00();
        }
        return AnonymousClass000.A1O(this.A00);
    }

    public /* bridge */ /* synthetic */ Object next() {
        if (this.A00 == -1) {
            A00();
        }
        if (this.A00 != 0) {
            C15020mZ r1 = this.A01;
            AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.A01 = null;
            this.A00 = -1;
            return r1;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw AnonymousClass000.A0x();
    }
}
