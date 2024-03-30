package X;

import java.util.ListIterator;

public abstract class AYM implements ListIterator, AnonymousClass00W {
    public int A00;
    public int A01;

    public void add(Object obj) {
        if (this instanceof C166537wP) {
            C166537wP r2 = (C166537wP) this;
            C166537wP.A00(r2);
            C21921Acr acr = r2.A03;
            acr.add(r2.A00, obj);
            r2.A00++;
            r2.A01 = acr.size();
            r2.A00 = acr.A0M();
            r2.A01 = -1;
            C166537wP.A01(r2);
            return;
        }
        throw AnonymousClass001.A0E("Operation is not supported for read-only collection");
    }

    public boolean hasNext() {
        return AnonymousClass000.A1T(this.A00, this.A01);
    }

    public boolean hasPrevious() {
        return AnonymousClass000.A1R(this.A00);
    }

    public Object next() {
        Object[] objArr;
        if (this instanceof C166527wO) {
            C166527wO r5 = (C166527wO) this;
            if (r5.hasNext()) {
                int i = r5.A00 & 31;
                Object obj = r5.A02[r5.A00 - 1];
                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
                Object obj2 = ((Object[]) obj)[i];
                int i2 = r5.A00 + 1;
                r5.A00 = i2;
                if (i2 == r5.A01) {
                    r5.A01 = true;
                } else {
                    int i3 = 0;
                    while (((i2 >> i3) & 31) == 0) {
                        i3 += 5;
                    }
                    if (i3 > 0) {
                        C166527wO.A00(r5, i2, ((r5.A00 - 1) - (i3 / 5)) + 1);
                        return obj2;
                    }
                }
                return obj2;
            }
            throw C165617ti.A0e();
        } else if (this instanceof C166507wM) {
            C166507wM r1 = (C166507wM) this;
            if (r1.hasNext()) {
                r1.A00++;
                return r1.A00;
            }
            throw C165617ti.A0e();
        } else if (this instanceof C166537wP) {
            C166537wP r4 = (C166537wP) this;
            C166537wP.A00(r4);
            if (r4.hasNext()) {
                int i4 = r4.A00;
                r4.A01 = i4;
                C166527wO r2 = r4.A02;
                if (r2 == null) {
                    objArr = r4.A03.A04;
                    r4.A00 = i4 + 1;
                } else if (r2.hasNext()) {
                    r4.A00 = i4 + 1;
                    return r2.next();
                } else {
                    objArr = r4.A03.A04;
                    r4.A00 = i4 + 1;
                    i4 -= r2.A01;
                }
                return objArr[i4];
            }
            throw C165617ti.A0e();
        } else if (this instanceof C166517wN) {
            C166517wN r42 = (C166517wN) this;
            if (r42.hasNext()) {
                C166527wO r3 = r42.A00;
                if (r3.hasNext()) {
                    r42.A00++;
                    return r3.next();
                }
                Object[] objArr2 = r42.A01;
                int i5 = r42.A00;
                r42.A00 = i5 + 1;
                return objArr2[i5 - r3.A01];
            }
            throw C165617ti.A0e();
        } else {
            C166497wL r32 = (C166497wL) this;
            if (r32.hasNext()) {
                Object[] objArr3 = r32.A00;
                int i6 = r32.A00;
                r32.A00 = i6 + 1;
                return objArr3[i6];
            }
            throw C165617ti.A0e();
        }
    }

    public int previousIndex() {
        return this.A00 - 1;
    }

    public void remove() {
        if (this instanceof C166537wP) {
            C166537wP r3 = (C166537wP) this;
            C166537wP.A00(r3);
            int i = r3.A01;
            if (i != -1) {
                C21921Acr acr = r3.A03;
                acr.remove(i);
                int i2 = r3.A01;
                if (i2 < r3.A00) {
                    r3.A00 = i2;
                }
                r3.A01 = acr.size();
                r3.A00 = acr.A0M();
                r3.A01 = -1;
                C166537wP.A01(r3);
                return;
            }
            throw C165617ti.A0V();
        }
        throw AnonymousClass001.A0E("Operation is not supported for read-only collection");
    }

    public void set(Object obj) {
        if (this instanceof C166537wP) {
            C166537wP r2 = (C166537wP) this;
            C166537wP.A00(r2);
            int i = r2.A01;
            if (i != -1) {
                C21921Acr acr = r2.A03;
                acr.set(i, obj);
                r2.A00 = acr.A0M();
                C166537wP.A01(r2);
                return;
            }
            throw C165617ti.A0V();
        }
        throw AnonymousClass001.A0E("Operation is not supported for read-only collection");
    }

    public AYM(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public int nextIndex() {
        return this.A00;
    }
}
