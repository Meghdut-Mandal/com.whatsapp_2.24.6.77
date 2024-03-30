package X;

import java.util.Iterator;
import java.util.TreeMap;

/* renamed from: X.6iW  reason: invalid class name and case insensitive filesystem */
public final class C138686iW implements C162187oA, C158917iS {
    public static final TreeMap A08 = new TreeMap();
    public int A00;
    public final double[] A01;
    public final long[] A02;
    public final String[] A03;
    public final byte[][] A04;
    public final int A05;
    public final int[] A06;
    public volatile String A07;

    public void close() {
    }

    public final void A00() {
        TreeMap treeMap = A08;
        synchronized (treeMap) {
            C36331k8.A1Q(this, treeMap, this.A05);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                AnonymousClass00C.A08(it);
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    public void B1m(int i, byte[] bArr) {
        this.A06[i] = 5;
        this.A04[i] = bArr;
    }

    public void B1o(int i, long j) {
        this.A06[i] = 2;
        this.A02[i] = j;
    }

    public void B1p(int i) {
        this.A06[i] = 1;
    }

    public void B1q(int i, String str) {
        this.A06[i] = 4;
        this.A03[i] = str;
    }

    public void B1r(C162187oA r7) {
        int i = this.A00;
        if (1 <= i) {
            int i2 = 1;
            while (true) {
                int i3 = this.A06[i2];
                if (i3 == 1) {
                    r7.B1p(i2);
                } else if (i3 == 2) {
                    r7.B1o(i2, this.A02[i2]);
                } else if (i3 == 3) {
                    ((C138676iV) r7).A00.bindDouble(i2, this.A01[i2]);
                } else if (i3 == 4) {
                    String str = this.A03[i2];
                    if (str != null) {
                        r7.B1q(i2, str);
                    } else {
                        throw AnonymousClass001.A08("Required value was null.");
                    }
                } else if (i3 == 5) {
                    byte[] bArr = this.A04[i2];
                    if (bArr != null) {
                        r7.B1m(i2, bArr);
                    } else {
                        throw AnonymousClass001.A08("Required value was null.");
                    }
                }
                if (i2 != i) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public String BHo() {
        String str = this.A07;
        if (str != null) {
            return str;
        }
        throw C36381kD.A0l();
    }

    public C138686iW(int i) {
        this.A05 = i;
        int i2 = i + 1;
        this.A06 = new int[i2];
        this.A02 = new long[i2];
        this.A01 = new double[i2];
        this.A03 = new String[i2];
        this.A04 = new byte[i2][];
    }
}
