package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;

/* renamed from: X.9zq  reason: invalid class name and case insensitive filesystem */
public final class C209339zq implements B5S, C161967nm {
    public C161967nm A00;
    public B3I A01 = new A03(new B3I[0]);
    public C206419tN A02;
    public B5S[] A03;
    public final B5S[] A04;
    public final C1893793l A05;
    public final ArrayList A06 = AnonymousClass001.A0I();
    public final IdentityHashMap A07 = new IdentityHashMap();

    public void B2Y(long j) {
        ArrayList arrayList = this.A06;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((B3I) arrayList.get(i)).B2Y(j);
            }
            return;
        }
        this.A01.B2Y(j);
    }

    public boolean B3Y(long j, long j2) {
        ArrayList arrayList = this.A06;
        if (arrayList.isEmpty()) {
            return this.A01.B3Y(j, j2);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((B5S) arrayList.get(i)).B3Y(j, j2);
        }
        return false;
    }

    public void B5V(long j, boolean z) {
        for (B5S B5V : this.A03) {
            B5V.B5V(j, z);
        }
    }

    public long B8K(C199399fF r3, long j) {
        return this.A03[0].B8K(r3, j);
    }

    public long B92(long j) {
        return this.A01.B92(j);
    }

    public long B93() {
        return this.A01.B93();
    }

    public long BEW() {
        return this.A01.BEW();
    }

    public void BPe() {
        B5S[] b5sArr = this.A04;
        int i = 0;
        do {
            b5sArr[i].BPe();
            i++;
        } while (i < 2);
    }

    public /* bridge */ /* synthetic */ void BUd(B3I b3i) {
        this.A00.BUd(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: X.9tK[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BdO(X.B5S r11) {
        /*
            r10 = this;
            java.util.ArrayList r0 = r10.A06
            r0.remove(r11)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x004a
            X.B5S[] r9 = r10.A04
            r8 = 2
            r2 = 0
            r1 = 0
        L_0x0010:
            r0 = r9[r2]
            X.9tN r0 = r0.BIW()
            int r0 = r0.A01
            int r1 = r1 + r0
            int r2 = r2 + 1
            if (r2 < r8) goto L_0x0010
            X.9tK[] r7 = new X.C206389tK[r1]
            r6 = 0
            r5 = 0
        L_0x0021:
            r0 = r9[r6]
            X.9tN r4 = r0.BIW()
            int r3 = r4.A01
            r2 = 0
        L_0x002a:
            if (r2 >= r3) goto L_0x003a
            int r1 = r5 + 1
            X.1Ak r0 = r4.A02
            java.lang.Object r0 = r0.get(r2)
            r7[r5] = r0
            int r2 = r2 + 1
            r5 = r1
            goto L_0x002a
        L_0x003a:
            int r6 = r6 + 1
            if (r6 < r8) goto L_0x0021
            X.9tN r0 = new X.9tN
            r0.<init>(r7)
            r10.A02 = r0
            X.7nm r0 = r10.A00
            r0.BdO(r10)
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C209339zq.BdO(X.B5S):void");
    }

    public void Bm4(C161967nm r5, long j) {
        this.A00 = r5;
        ArrayList arrayList = this.A06;
        B5S[] b5sArr = this.A04;
        Collections.addAll(arrayList, b5sArr);
        int i = 0;
        do {
            b5sArr[i].Bm4(this, j);
            i++;
        } while (i < 2);
    }

    public long Bmt() {
        B5S[] b5sArr = this.A04;
        long Bmt = b5sArr[0].Bmt();
        char c = 1;
        while (c < 2) {
            if (b5sArr[c].Bmt() == -9223372036854775807L) {
                c = 2;
            } else {
                throw AnonymousClass001.A09("Child reported discontinuity.");
            }
        }
        if (Bmt != -9223372036854775807L) {
            B5S[] b5sArr2 = this.A03;
            int length = b5sArr2.length;
            int i = 0;
            while (i < length) {
                B5S b5s = b5sArr2[i];
                if (b5s == b5sArr[0] || b5s.Bpa(Bmt, false) == Bmt) {
                    i++;
                } else {
                    throw AnonymousClass001.A09("Unexpected child seekToUs result.");
                }
            }
        }
        return Bmt;
    }

    public long Bpa(long j, boolean z) {
        long Bpa = this.A03[0].Bpa(j, z);
        int i = 1;
        while (true) {
            B5S[] b5sArr = this.A03;
            if (i >= b5sArr.length) {
                return Bpa;
            }
            if (b5sArr[i].Bpa(Bpa, z) == Bpa) {
                i++;
            } else {
                throw AnonymousClass001.A09("Unexpected child seekToUs result.");
            }
        }
    }

    public long Bpe(B2j[] b2jArr, B5T[] b5tArr, boolean[] zArr, boolean[] zArr2, long j) {
        B2j[] b2jArr2;
        B2j b2j;
        int A0I;
        long j2 = j;
        int length = b5tArr.length;
        int[] iArr = new int[length];
        int[] iArr2 = new int[length];
        int i = 0;
        while (true) {
            b2jArr2 = b2jArr;
            if (i >= length) {
                break;
            }
            if (b2jArr[i] == null) {
                A0I = -1;
            } else {
                A0I = AnonymousClass000.A0I(this.A07.get(b2jArr[i]));
            }
            iArr[i] = A0I;
            iArr2[i] = -1;
            if (b5tArr[i] != null) {
                C206389tK r4 = b5tArr[i].A02;
                int i2 = 0;
                while (true) {
                    B5S[] b5sArr = this.A04;
                    if (i2 >= 2) {
                        break;
                    } else if (b5sArr[i2].BIW().A02.indexOf(r4) >= 0) {
                        iArr2[i] = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            i++;
        }
        IdentityHashMap identityHashMap = this.A07;
        identityHashMap.clear();
        B2j[] b2jArr3 = new B2j[length];
        B2j[] b2jArr4 = new B2j[length];
        B5T[] b5tArr2 = new B5T[length];
        B5S[] b5sArr2 = this.A04;
        ArrayList A14 = C36441kJ.A14(2);
        int i3 = 0;
        do {
            for (int i4 = 0; i4 < length; i4++) {
                B5T b5t = null;
                if (iArr[i4] == i3) {
                    b2j = b2jArr[i4];
                } else {
                    b2j = null;
                }
                b2jArr4[i4] = b2j;
                if (iArr2[i4] == i3) {
                    b5t = b5tArr[i4];
                }
                b5tArr2[i4] = b5t;
            }
            long Bpe = b5sArr2[i3].Bpe(b2jArr4, b5tArr2, zArr, zArr2, j2);
            if (i3 == 0) {
                j2 = Bpe;
            } else if (Bpe != j2) {
                throw AnonymousClass001.A09("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i5 = 0; i5 < length; i5++) {
                boolean z2 = true;
                if (iArr2[i5] == i3) {
                    C200319h9.A02(AnonymousClass000.A1V(b2jArr4[i5]));
                    b2jArr3[i5] = b2jArr4[i5];
                    C36341k9.A1K(b2jArr4[i5], identityHashMap, i3);
                    z = true;
                } else if (iArr[i5] == i3) {
                    if (b2jArr4[i5] != null) {
                        z2 = false;
                    }
                    C200319h9.A02(z2);
                }
            }
            if (z) {
                A14.add(b5sArr2[i3]);
            }
            i3++;
        } while (i3 < 2);
        System.arraycopy(b2jArr3, 0, b2jArr2, 0, length);
        B5S[] b5sArr3 = new B5S[A14.size()];
        this.A03 = b5sArr3;
        A14.toArray(b5sArr3);
        this.A01 = new A03(this.A03);
        return j2;
    }

    public void Brc(boolean z) {
        ArrayList arrayList = this.A06;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((B3I) arrayList.get(i)).Brc(z);
            }
            return;
        }
        this.A01.Brc(z);
    }

    public void Bwk(byte b, boolean z) {
        ArrayList arrayList = this.A06;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((B3I) arrayList.get(i)).Bwk(b, z);
            }
            return;
        }
        this.A01.Bwk(b, z);
    }

    public C209339zq(C1893793l r3, B5S... b5sArr) {
        this.A05 = r3;
        this.A04 = b5sArr;
    }

    public C206419tN BIW() {
        return this.A02;
    }
}
