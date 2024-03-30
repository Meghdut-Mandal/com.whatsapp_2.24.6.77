package X;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* renamed from: X.7wP  reason: invalid class name and case insensitive filesystem */
public final class C166537wP extends AYM implements ListIterator, AnonymousClass00W {
    public int A00;
    public int A01 = -1;
    public C166527wO A02;
    public final C21921Acr A03;

    public static final void A00(C166537wP r2) {
        if (r2.A00 != r2.A03.A0M()) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C166537wP r7) {
        /*
            X.Acr r1 = r7.A03
            java.lang.Object[] r6 = r1.A03
            if (r6 != 0) goto L_0x000a
            r0 = 0
        L_0x0007:
            r7.A02 = r0
            return
        L_0x000a:
            int r0 = r1.size()
            int r0 = r0 + -1
            r5 = r0 & -32
            int r4 = r7.A00
            if (r4 <= r5) goto L_0x0017
            r4 = r5
        L_0x0017:
            int r0 = r1.A00
            int r0 = r0 / 5
            int r1 = r0 + 1
            X.7wO r3 = r7.A02
            if (r3 != 0) goto L_0x0027
            X.7wO r0 = new X.7wO
            r0.<init>(r6, r4, r5, r1)
            goto L_0x0007
        L_0x0027:
            r3.A00 = r4
            r3.A01 = r5
            r3.A00 = r1
            java.lang.Object[] r2 = r3.A02
            int r0 = r2.length
            if (r0 >= r1) goto L_0x0036
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3.A02 = r2
        L_0x0036:
            r1 = 0
            r2[r1] = r6
            r0 = 1
            if (r4 != r5) goto L_0x003d
            r1 = 1
        L_0x003d:
            r3.A01 = r1
            int r4 = r4 - r1
            X.C166527wO.A00(r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C166537wP.A01(X.7wP):void");
    }

    public C166537wP(C21921Acr acr, int i) {
        super(i, acr.size());
        this.A03 = acr;
        this.A00 = acr.A0M();
        A01(this);
    }

    public Object previous() {
        Object[] objArr;
        A00(this);
        if (hasPrevious()) {
            int i = this.A00;
            int i2 = i - 1;
            this.A01 = i2;
            C166527wO r0 = this.A02;
            if (r0 == null) {
                objArr = this.A03.A04;
                this.A00 = i2;
            } else {
                int i3 = r0.A01;
                if (i > i3) {
                    objArr = this.A03.A04;
                    this.A00 = i2;
                    i2 -= i3;
                } else {
                    this.A00 = i2;
                    return r0.previous();
                }
            }
            return objArr[i2];
        }
        throw C165617ti.A0e();
    }
}
