package X;

import java.util.Objects;

/* renamed from: X.8I5  reason: invalid class name */
public class AnonymousClass8I5 extends AnonymousClass8I6 {
    public static final long serialVersionUID = 1;
    public final byte[] bytes;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r7 = (X.C21674AUx) r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r1 = 1
            if (r9 == r8) goto L_0x008b
            boolean r0 = r9 instanceof X.C21674AUx
            r4 = 0
            if (r0 == 0) goto L_0x0025
            int r2 = r8.A02()
            r7 = r9
            X.AUx r7 = (X.C21674AUx) r7
            int r3 = r7.A02()
            if (r2 != r3) goto L_0x0025
            if (r2 == 0) goto L_0x008b
            boolean r0 = r9 instanceof X.AnonymousClass8I5
            if (r0 == 0) goto L_0x0086
            int r1 = r8.hash
            int r0 = r7.hash
            if (r1 == 0) goto L_0x0026
            if (r0 == 0) goto L_0x0026
            if (r1 == r0) goto L_0x0026
        L_0x0025:
            return r4
        L_0x0026:
            if (r2 > r3) goto L_0x0075
            if (r2 > r3) goto L_0x005c
            boolean r0 = r7 instanceof X.AnonymousClass8I5
            if (r0 == 0) goto L_0x004f
            X.8I5 r7 = (X.AnonymousClass8I5) r7
            byte[] r6 = r8.bytes
            byte[] r5 = r7.bytes
            int r4 = r8.A07()
            int r3 = r4 + r2
            int r2 = r7.A07()
        L_0x003e:
            if (r4 >= r3) goto L_0x004d
            byte r1 = r6[r4]
            byte r0 = r5[r2]
            if (r1 == r0) goto L_0x0048
            r0 = 0
            return r0
        L_0x0048:
            int r4 = r4 + 1
            int r2 = r2 + 1
            goto L_0x003e
        L_0x004d:
            r0 = 1
            return r0
        L_0x004f:
            X.AUx r1 = r7.A03(r2)
            X.AUx r0 = r8.A03(r2)
            boolean r0 = r1.equals(r0)
            return r0
        L_0x005c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Ran off end of other: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", "
            r1.append(r0)
            r1.append(r2)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0d(r0, r1, r3)
            throw r0
        L_0x0075:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Length too large: "
            r1.append(r0)
            r1.append(r2)
            java.lang.IllegalArgumentException r0 = X.C165567td.A0O(r1, r2)
            throw r0
        L_0x0086:
            boolean r0 = r9.equals(r8)
            return r0
        L_0x008b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8I5.equals(java.lang.Object):boolean");
    }

    public int A07() {
        if (this instanceof AnonymousClass8I4) {
            return ((AnonymousClass8I4) this).bytesOffset;
        }
        return 0;
    }

    public AnonymousClass8I5(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.bytes = bArr;
    }
}
