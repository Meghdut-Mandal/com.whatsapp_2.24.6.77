package X;

/* renamed from: X.7wO  reason: invalid class name and case insensitive filesystem */
public final class C166527wO extends AYM {
    public int A00;
    public boolean A01;
    public Object[] A02;

    public static final void A00(C166527wO r4, int i, int i2) {
        int i3 = (r4.A00 - i2) * 5;
        while (i2 < r4.A00) {
            Object[] objArr = r4.A02;
            objArr[i2] = C165607th.A1Z(objArr, i2 - 1)[(i >> i3) & 31];
            i3 -= 5;
            i2++;
        }
    }

    public C166527wO(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.A00 = i3;
        Object[] objArr2 = new Object[i3];
        this.A02 = objArr2;
        boolean A1S = AnonymousClass000.A1S(i, i2);
        this.A01 = A1S;
        objArr2[0] = objArr;
        A00(this, i - (A1S ? 1 : 0), 1);
    }

    public Object previous() {
        if (hasPrevious()) {
            int i = this.A00 - 1;
            this.A00 = i;
            if (this.A01) {
                this.A01 = false;
            } else {
                int i2 = 0;
                while (((i >> i2) & 31) == 31) {
                    i2 += 5;
                }
                if (i2 > 0) {
                    A00(this, i, ((this.A00 - 1) - (i2 / 5)) + 1);
                }
            }
            int i3 = this.A00 & 31;
            Object obj = this.A02[this.A00 - 1];
            AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
            return ((Object[]) obj)[i3];
        }
        throw C165617ti.A0e();
    }
}
