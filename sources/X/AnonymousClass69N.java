package X;

import android.view.View;

/* renamed from: X.69N  reason: invalid class name */
public final class AnonymousClass69N {
    public final int A00;
    public final C10900fP A01;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r5.compareTo(r2) > 0) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        r2 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r5.compareTo(r3) < 0) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A01(int r7) {
        /*
            r6 = this;
            X.0fP r5 = new X.0fP
            r5.<init>(r7)
            int r4 = r6.A00
            X.0fP r3 = new X.0fP
            r3.<init>(r4)
            X.0fP r0 = r6.A01
            if (r0 != 0) goto L_0x001a
            int r0 = r5.compareTo(r3)
            if (r0 >= 0) goto L_0x0040
        L_0x0016:
            r2 = r3
        L_0x0017:
            int r0 = r2.A00
            return r0
        L_0x001a:
            int r2 = r0.A00
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 ^ r0
            r0 = r0 ^ r2
            int r0 = java.lang.Integer.compare(r1, r0)
            if (r0 >= 0) goto L_0x0028
            r4 = r2
        L_0x0028:
            X.0fP r2 = new X.0fP
            r2.<init>(r4)
            int r0 = r3.compareTo(r2)
            if (r0 > 0) goto L_0x0042
            int r0 = r5.compareTo(r3)
            if (r0 < 0) goto L_0x0016
            int r0 = r5.compareTo(r2)
            if (r0 <= 0) goto L_0x0040
            goto L_0x0017
        L_0x0040:
            r2 = r5
            goto L_0x0017
        L_0x0042:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Cannot coerce value to an empty range: maximum "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " is less than minimum "
            r1.append(r0)
            r1.append(r3)
            r0 = 46
            r1.append(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0b(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass69N.A01(int):int");
    }

    public final boolean A02() {
        C10900fP r0 = this.A01;
        if (r0 == null || this.A00 != r0.A00) {
            return false;
        }
        return true;
    }

    public AnonymousClass69N(C10900fP r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public final int A00() {
        int i;
        int i2;
        if (A02()) {
            i = this.A00;
            int i3 = C112845eY.A00;
            i2 = 1073741824;
        } else {
            C10900fP r0 = this.A01;
            if (r0 == null) {
                return C112845eY.A00;
            }
            i = r0.A00;
            int i4 = C112845eY.A00;
            i2 = Integer.MIN_VALUE;
        }
        return View.MeasureSpec.makeMeasureSpec(i, i2);
    }
}
