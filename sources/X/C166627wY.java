package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: X.7wY  reason: invalid class name and case insensitive filesystem */
public class C166627wY extends AYF implements Iterator, AnonymousClass00W {
    public int A00;
    public Object A01;
    public boolean A02;
    public final C1513479e A03;

    public C166627wY(C1513479e r2, AYD[] aydArr) {
        super(r2.A01, aydArr);
        this.A03 = r2;
        this.A00 = r2.A00;
    }

    public static final void A00(C166627wY r5, AnonymousClass6YE r6, Object obj, int i, int i2) {
        int i3 = i2 * 5;
        if (i3 > 30) {
            AYD[] aydArr = r5.A02;
            AYD ayd = aydArr[i2];
            Object[] objArr = r6.A02;
            int length = objArr.length;
            int i4 = 0;
            ayd.A02 = objArr;
            ayd.A00 = length;
            while (true) {
                ayd.A01 = i4;
                if (AnonymousClass00C.A0J(ayd.A02[i4], obj)) {
                    break;
                }
                ayd = aydArr[i2];
                i4 = ayd.A01 + 2;
            }
        } else {
            int i5 = 1 << ((i >> i3) & 31);
            int i6 = r6.A00;
            if ((i5 & i6) != 0) {
                int A0D = r6.A0D(i5);
                AYD ayd2 = r5.A02[i2];
                ayd2.A02 = r6.A02;
                ayd2.A00 = Integer.bitCount(i6) * 2;
                ayd2.A01 = A0D;
            } else {
                int A0E = r6.A0E(i5);
                AnonymousClass6YE A0G = r6.A0G(A0E);
                AYD ayd3 = r5.A02[i2];
                ayd3.A02 = r6.A02;
                ayd3.A00 = Integer.bitCount(r6.A00) * 2;
                ayd3.A01 = A0E;
                A00(r5, A0G, obj, i, i2 + 1);
                return;
            }
        }
        r5.A00 = i2;
    }

    public Object next() {
        if (this.A03.A00 == this.A00) {
            this.A01 = A03();
            this.A02 = true;
            return super.next();
        }
        throw new ConcurrentModificationException();
    }
}
