package X;

import java.util.Iterator;

public abstract class AYF implements Iterator, AnonymousClass00W {
    public int A00;
    public boolean A01 = true;
    public final AYD[] A02;

    private final int A01(int i) {
        AYD ayd;
        Object[] objArr;
        int bitCount;
        AYD[] aydArr = this.A02;
        AYD ayd2 = aydArr[i];
        int i2 = ayd2.A01;
        if (i2 < ayd2.A00) {
            return i;
        }
        Object[] objArr2 = ayd2.A02;
        if (i2 >= objArr2.length) {
            return -1;
        }
        Object obj = objArr2[i2];
        AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        AnonymousClass6YE r1 = (AnonymousClass6YE) obj;
        if (i == 6) {
            ayd = aydArr[7];
            objArr = r1.A02;
            bitCount = objArr.length;
        } else {
            ayd = aydArr[i + 1];
            objArr = r1.A02;
            bitCount = Integer.bitCount(r1.A00) * 2;
        }
        ayd.A02 = objArr;
        ayd.A00 = bitCount;
        ayd.A01 = 0;
        return A01(i + 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0039 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A02() {
        /*
            r7 = this;
            X.AYD[] r5 = r7.A02
            int r4 = r7.A00
            r0 = r5[r4]
            int r1 = r0.A01
            int r0 = r0.A00
            if (r1 >= r0) goto L_0x000d
            return
        L_0x000d:
            r3 = 0
            r6 = -1
            if (r6 >= r4) goto L_0x0048
            int r0 = r7.A01(r4)
            if (r0 != r6) goto L_0x0028
            r2 = r5[r4]
            int r1 = r2.A01
            java.lang.Object[] r0 = r2.A02
            int r0 = r0.length
            if (r1 >= r0) goto L_0x002d
            int r0 = r1 + 1
            r2.A01 = r0
            int r0 = r7.A01(r4)
        L_0x0028:
            if (r0 == r6) goto L_0x002d
            r7.A00 = r0
            return
        L_0x002d:
            if (r4 <= 0) goto L_0x0039
            int r0 = r4 + -1
            r1 = r5[r0]
            int r0 = r1.A01
            int r0 = r0 + 1
            r1.A01 = r0
        L_0x0039:
            r1 = r5[r4]
            X.6YE r0 = X.AnonymousClass6YE.A04
            java.lang.Object[] r0 = r0.A02
            r1.A02 = r0
            r1.A00 = r3
            r1.A01 = r3
            int r4 = r4 + -1
            goto L_0x000d
        L_0x0048:
            r7.A01 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AYF.A02():void");
    }

    public void remove() {
        C1513479e r2;
        if (this instanceof C166627wY) {
            C166627wY r5 = (C166627wY) this;
            if (r5.A02) {
                if (r5.hasNext()) {
                    Object A03 = r5.A03();
                    r2 = r5.A03;
                    C07710Yz.A02(r2).remove(r5.A01);
                    C166627wY.A00(r5, r2.A01, A03, AnonymousClass000.A0J(A03), 0);
                } else {
                    r2 = r5.A03;
                    C07710Yz.A02(r2).remove(r5.A01);
                }
                r5.A01 = null;
                r5.A02 = false;
                r5.A00 = r2.A00;
                return;
            }
            throw C165617ti.A0V();
        }
        throw AnonymousClass001.A0E("Operation is not supported for read-only collection");
    }

    public AYF(AnonymousClass6YE r5, AYD[] aydArr) {
        this.A02 = aydArr;
        AYD ayd = aydArr[0];
        ayd.A02 = r5.A02;
        ayd.A00 = Integer.bitCount(r5.A00) * 2;
        ayd.A01 = 0;
        this.A00 = 0;
        A02();
    }

    public final Object A03() {
        if (hasNext()) {
            AYD ayd = this.A02[this.A00];
            return ayd.A02[ayd.A01];
        }
        throw C165617ti.A0e();
    }

    public boolean hasNext() {
        return this.A01;
    }

    public Object next() {
        if (hasNext()) {
            Object next = this.A02[this.A00].next();
            A02();
            return next;
        }
        throw C165617ti.A0e();
    }
}
