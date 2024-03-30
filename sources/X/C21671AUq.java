package X;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Arrays;

/* renamed from: X.AUq  reason: case insensitive filesystem */
public class C21671AUq implements Comparable, Serializable {
    public static final C21671AUq A02 = C196989at.A00;
    public static final long serialVersionUID = 1;
    public transient int A00;
    public transient String A01;
    public final byte[] data;

    public C21671AUq(byte[] bArr) {
        AnonymousClass00C.A0C(bArr, 1);
        this.data = bArr;
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    public byte A00(int i) {
        byte[] bArr;
        int i2;
        if (this instanceof C22579Ap8) {
            C22579Ap8 ap8 = (C22579Ap8) this;
            int[] iArr = ap8.A00;
            byte[][] bArr2 = ap8.A01;
            int length = bArr2.length;
            C1902797o.A00((long) iArr[length - 1], (long) i, 1);
            int binarySearch = Arrays.binarySearch(iArr, 0, length, i + 1);
            if (binarySearch < 0) {
                binarySearch = ~binarySearch;
            }
            if (binarySearch == 0) {
                i2 = 0;
            } else {
                i2 = iArr[binarySearch - 1];
            }
            int i3 = iArr[length + binarySearch];
            bArr = bArr2[binarySearch];
            i = (i - i2) + i3;
        } else {
            C21671AUq aUq = C196989at.A00;
            bArr = this.data;
        }
        return bArr[i];
    }

    public int A01() {
        if (this instanceof C22579Ap8) {
            C22579Ap8 ap8 = (C22579Ap8) this;
            return ap8.A00[ap8.A01.length - 1];
        }
        C21671AUq aUq = C196989at.A00;
        return this.data.length;
    }

    public String A02() {
        if (this instanceof C22579Ap8) {
            return new C21671AUq(((C22579Ap8) this).A05()).A02();
        }
        C21671AUq aUq = C196989at.A00;
        char[] cArr = new char[(r7 * 2)];
        int i = 0;
        for (byte b : this.data) {
            int i2 = i + 1;
            char[] cArr2 = C196989at.A01;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public boolean A03(C21671AUq aUq, int i) {
        int i2;
        if (this instanceof C22579Ap8) {
            C22579Ap8 ap8 = (C22579Ap8) this;
            int i3 = 0;
            int i4 = 0;
            if (0 > ap8.A01() - i) {
                return false;
            }
            int[] iArr = ap8.A00;
            byte[][] bArr = ap8.A01;
            int length = bArr.length;
            int binarySearch = Arrays.binarySearch(iArr, 0, length, 1);
            if (binarySearch < 0) {
                binarySearch = ~binarySearch;
            }
            while (i3 < i) {
                if (binarySearch == 0) {
                    i2 = 0;
                } else {
                    i2 = iArr[binarySearch - 1];
                }
                int i5 = iArr[length + binarySearch];
                int min = Math.min(i, (iArr[binarySearch] - i2) + i2) - i3;
                if (!aUq.A04(bArr[binarySearch], i4, i5 + (i3 - i2), min)) {
                    return false;
                }
                i4 += min;
                i3 += min;
                binarySearch++;
            }
            return true;
        }
        C21671AUq aUq2 = C196989at.A00;
        return aUq.A04(this.data, 0, 0, i);
    }

    public boolean A04(byte[] bArr, int i, int i2, int i3) {
        int i4;
        if (this instanceof C22579Ap8) {
            C22579Ap8 ap8 = (C22579Ap8) this;
            AnonymousClass00C.A0C(bArr, 1);
            if (i >= 0 && i <= ap8.A01() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
                int i5 = i3 + i;
                int[] iArr = ap8.A00;
                byte[][] bArr2 = ap8.A01;
                int length = bArr2.length;
                int binarySearch = Arrays.binarySearch(iArr, 0, length, i + 1);
                if (binarySearch < 0) {
                    binarySearch = ~binarySearch;
                }
                while (i < i5) {
                    if (binarySearch == 0) {
                        i4 = 0;
                    } else {
                        i4 = iArr[binarySearch - 1];
                    }
                    int i6 = iArr[length + binarySearch];
                    int min = Math.min(i5, (iArr[binarySearch] - i4) + i4) - i;
                    int i7 = i6 + (i - i4);
                    byte[] bArr3 = bArr2[binarySearch];
                    AnonymousClass00C.A0C(bArr3, 0);
                    int i8 = 0;
                    while (i8 < min) {
                        if (bArr3[i8 + i7] == bArr[i8 + i2]) {
                            i8++;
                        }
                    }
                    i2 += min;
                    i += min;
                    binarySearch++;
                }
                return true;
            }
        } else {
            AnonymousClass00C.A0C(bArr, 1);
            C21671AUq aUq = C196989at.A00;
            if (i >= 0) {
                byte[] bArr4 = this.data;
                if (i <= bArr4.length - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
                    int i9 = 0;
                    while (i9 < i3) {
                        if (bArr4[i9 + i] == bArr[i9 + i2]) {
                            i9++;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C21671AUq aUq = (C21671AUq) obj;
        AnonymousClass00C.A0C(aUq, 0);
        C21671AUq aUq2 = C196989at.A00;
        int A012 = A01();
        int A013 = aUq.A01();
        int min = Math.min(A012, A013);
        int i = 0;
        while (i < min) {
            byte A002 = A00(i) & 255;
            byte A003 = aUq.A00(i) & 255;
            if (A002 == A003) {
                i++;
            } else if (A002 < A003) {
                return -1;
            } else {
                return 1;
            }
        }
        if (A012 == A013) {
            return 0;
        }
        if (A012 < A013) {
            return -1;
        }
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r6 = (X.C21671AUq) r6;
        r2 = r6.A01();
        r1 = r5.data;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            X.AUq r0 = X.C196989at.A00
            r4 = 0
            r3 = 1
            if (r6 == r5) goto L_0x001b
            boolean r0 = r6 instanceof X.C21671AUq
            if (r0 == 0) goto L_0x001c
            X.AUq r6 = (X.C21671AUq) r6
            int r2 = r6.A01()
            byte[] r1 = r5.data
            int r0 = r1.length
            if (r2 != r0) goto L_0x001c
            boolean r0 = r6.A04(r1, r4, r4, r0)
            if (r0 == 0) goto L_0x001c
        L_0x001b:
            return r3
        L_0x001c:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21671AUq.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        C21671AUq aUq = C196989at.A00;
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.data);
        this.A00 = hashCode;
        return hashCode;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (r1 < 65536) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00c1, code lost:
        if (r0 != 64) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0172, code lost:
        r8 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r18 = this;
            X.AUq r0 = X.C196989at.A00
            r13 = 0
            r12 = r18
            byte[] r11 = r12.data
            int r10 = r11.length
            if (r10 != 0) goto L_0x000d
            java.lang.String r0 = "[size=0]"
            return r0
        L_0x000d:
            r9 = 64
            r15 = 0
            r8 = 0
            r0 = 0
        L_0x0012:
            byte r1 = r11[r15]
            r14 = 127(0x7f, float:1.78E-43)
            r7 = 159(0x9f, float:2.23E-43)
            r6 = 31
            r5 = 13
            r4 = 65533(0xfffd, float:9.1831E-41)
            r3 = 10
            r2 = 65536(0x10000, float:9.18355E-41)
            if (r1 < 0) goto L_0x0062
            int r17 = r0 + 1
            if (r0 == r9) goto L_0x00c3
            if (r1 == r3) goto L_0x0038
            if (r1 == r5) goto L_0x0038
            if (r6 >= r1) goto L_0x0172
            if (r14 > r1) goto L_0x0038
            if (r7 >= r1) goto L_0x0172
            if (r1 == r4) goto L_0x0172
            r0 = 2
            if (r1 >= r2) goto L_0x0039
        L_0x0038:
            r0 = 1
        L_0x0039:
            int r8 = r8 + r0
            int r15 = r15 + 1
        L_0x003c:
            r0 = r17
            if (r15 >= r10) goto L_0x008e
            byte r1 = r11[r15]
            if (r1 < 0) goto L_0x008e
            int r16 = r15 + 1
            byte r1 = r11[r15]
            int r17 = r17 + 1
            if (r0 == r9) goto L_0x00c3
            if (r1 == r3) goto L_0x005d
            if (r1 == r5) goto L_0x005d
            if (r1 < 0) goto L_0x005d
            if (r6 >= r1) goto L_0x0172
            if (r14 > r1) goto L_0x005d
            if (r7 >= r1) goto L_0x0172
            if (r1 == r4) goto L_0x0172
            r0 = 2
            if (r1 >= r2) goto L_0x005e
        L_0x005d:
            r0 = 1
        L_0x005e:
            int r8 = r8 + r0
            r15 = r16
            goto L_0x003c
        L_0x0062:
            int r3 = r1 >> 5
            r2 = -2
            r5 = 128(0x80, float:1.794E-43)
            if (r3 != r2) goto L_0x0091
            int r1 = r15 + 1
            if (r10 <= r1) goto L_0x00c1
            byte r6 = r11[r15]
            byte r2 = r11[r1]
            r1 = r2 & 192(0xc0, float:2.69E-43)
            if (r1 != r5) goto L_0x00c1
            r3 = r2 ^ 3968(0xf80, float:5.56E-42)
            int r1 = r6 << 6
            r3 = r3 ^ r1
            if (r3 < r5) goto L_0x00c1
            int r2 = r0 + 1
            if (r0 == r9) goto L_0x00c3
            if (r7 >= r3) goto L_0x0172
            if (r3 == r4) goto L_0x0172
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = 2
            if (r3 >= r1) goto L_0x008a
            r0 = 1
        L_0x008a:
            int r8 = r8 + r0
            int r15 = r15 + 2
        L_0x008d:
            r0 = r2
        L_0x008e:
            if (r15 >= r10) goto L_0x00c3
            goto L_0x0012
        L_0x0091:
            int r6 = r1 >> 4
            r4 = 55296(0xd800, float:7.7486E-41)
            r3 = 57343(0xdfff, float:8.0355E-41)
            if (r6 != r2) goto L_0x0175
            int r6 = r15 + 2
            if (r10 <= r6) goto L_0x00c1
            byte r7 = r11[r15]
            int r1 = r15 + 1
            byte r2 = r11[r1]
            r1 = r2 & 192(0xc0, float:2.69E-43)
            if (r1 != r5) goto L_0x00c1
            byte r6 = r11[r6]
            r1 = r6 & 192(0xc0, float:2.69E-43)
            if (r1 != r5) goto L_0x00c1
            r1 = -123008(0xfffffffffffe1f80, float:NaN)
            r6 = r6 ^ r1
            int r1 = r2 << 6
            r6 = r6 ^ r1
            int r1 = r7 << 12
            r6 = r6 ^ r1
            r1 = 2048(0x800, float:2.87E-42)
            if (r6 < r1) goto L_0x00c1
            if (r4 > r6) goto L_0x015e
            if (r3 < r6) goto L_0x015e
        L_0x00c1:
            if (r0 != r9) goto L_0x0172
        L_0x00c3:
            r0 = -1
            r4 = 93
            java.lang.String r3 = "…]"
            java.lang.String r5 = "[size="
            if (r8 != r0) goto L_0x0101
            if (r10 > r9) goto L_0x00e6
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "[hex="
            r2.append(r0)
            java.lang.String r0 = r12.A02()
            r2.append(r0)
        L_0x00de:
            r2.append(r4)
        L_0x00e1:
            java.lang.String r0 = r2.toString()
            return r0
        L_0x00e6:
            java.lang.StringBuilder r2 = X.C90464aC.A0h(r10, r5)
            java.lang.String r0 = " hex="
            r2.append(r0)
            byte[] r1 = new byte[r9]
            java.lang.System.arraycopy(r11, r13, r1, r13, r9)
            X.AUq r0 = new X.AUq
            r0.<init>(r1)
            java.lang.String r0 = r0.A02()
            r2.append(r0)
            goto L_0x014d
        L_0x0101:
            java.lang.String r6 = r12.A01
            if (r6 != 0) goto L_0x0116
            boolean r0 = r12 instanceof X.C22579Ap8
            if (r0 == 0) goto L_0x0110
            r0 = r12
            X.Ap8 r0 = (X.C22579Ap8) r0
            byte[] r11 = r0.A05()
        L_0x0110:
            java.lang.String r6 = X.C165607th.A0w(r11)
            r12.A01 = r6
        L_0x0116:
            java.lang.String r2 = r6.substring(r13, r8)
            X.AnonymousClass00C.A04(r2)
            java.lang.String r1 = "\\"
            java.lang.String r0 = "\\\\"
            java.lang.String r2 = X.AnonymousClass098.A05(r2, r1, r0, r13)
            java.lang.String r1 = "\n"
            java.lang.String r0 = "\\n"
            java.lang.String r2 = X.AnonymousClass098.A05(r2, r1, r0, r13)
            java.lang.String r1 = "\r"
            java.lang.String r0 = "\\r"
            java.lang.String r1 = X.AnonymousClass098.A05(r2, r1, r0, r13)
            int r0 = r6.length()
            if (r8 >= r0) goto L_0x0151
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0v(r5)
            byte[] r0 = r12.data
            int r0 = r0.length
            r2.append(r0)
            java.lang.String r0 = " text="
            r2.append(r0)
            r2.append(r1)
        L_0x014d:
            r2.append(r3)
            goto L_0x00e1
        L_0x0151:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "[text="
            r2.append(r0)
            r2.append(r1)
            goto L_0x00de
        L_0x015e:
            int r2 = r0 + 1
            if (r0 == r9) goto L_0x00c3
            r0 = 65533(0xfffd, float:9.1831E-41)
            if (r6 == r0) goto L_0x0172
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = 2
            if (r6 >= r1) goto L_0x016d
            r0 = 1
        L_0x016d:
            int r8 = r8 + r0
            int r15 = r15 + 3
            goto L_0x008d
        L_0x0172:
            r8 = -1
            goto L_0x00c3
        L_0x0175:
            int r1 = r1 >> 3
            if (r1 != r2) goto L_0x00c1
            int r2 = r15 + 3
            if (r10 <= r2) goto L_0x00c1
            byte r14 = r11[r15]
            int r1 = r15 + 1
            byte r6 = r11[r1]
            r1 = r6 & 192(0xc0, float:2.69E-43)
            if (r1 != r5) goto L_0x00c1
            int r1 = r15 + 2
            byte r7 = r11[r1]
            r1 = r7 & 192(0xc0, float:2.69E-43)
            if (r1 != r5) goto L_0x00c1
            byte r2 = r11[r2]
            r1 = r2 & 192(0xc0, float:2.69E-43)
            if (r1 != r5) goto L_0x00c1
            r1 = 3678080(0x381f80, float:5.154088E-39)
            r2 = r2 ^ r1
            int r1 = r7 << 6
            r2 = r2 ^ r1
            int r1 = r6 << 12
            r2 = r2 ^ r1
            int r1 = r14 << 18
            r2 = r2 ^ r1
            r1 = 1114111(0x10ffff, float:1.561202E-39)
            if (r2 > r1) goto L_0x00c1
            if (r4 > r2) goto L_0x00c1
            if (r3 >= r2) goto L_0x00c1
            r1 = 65536(0x10000, float:9.18355E-41)
            if (r2 < r1) goto L_0x00c1
            int r2 = r0 + 1
            if (r0 == r9) goto L_0x00c3
            int r8 = r8 + 2
            int r15 = r15 + 4
            goto L_0x008d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21671AUq.toString():java.lang.String");
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        int readInt = objectInputStream.readInt();
        int i = 0;
        if (readInt >= 0) {
            byte[] bArr = new byte[readInt];
            while (i < readInt) {
                int read = objectInputStream.read(bArr, i, readInt - i);
                if (read != -1) {
                    i += read;
                } else {
                    throw C165617ti.A0T();
                }
            }
            C21671AUq aUq = new C21671AUq(bArr);
            Field declaredField = C21671AUq.class.getDeclaredField("data");
            AnonymousClass00C.A04(declaredField);
            declaredField.setAccessible(true);
            declaredField.set(this, aUq.data);
            return;
        }
        throw AnonymousClass000.A0d("byteCount < 0: ", AnonymousClass000.A0u(), readInt);
    }
}
