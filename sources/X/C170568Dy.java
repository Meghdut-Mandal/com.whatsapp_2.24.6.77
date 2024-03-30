package X;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.8Dy  reason: invalid class name and case insensitive filesystem */
public final class C170568Dy extends AnonymousClass95R {
    public static final Logger A04 = C165587tf.A0p(C170568Dy.class);
    public static final boolean A05 = C203729od.A05;
    public int A00;
    public A44 A01;
    public final int A02;
    public final byte[] A03;

    public static int A02(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        int i = 2;
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    public final void A04(byte b) {
        try {
            byte[] bArr = this.A03;
            int i = this.A00;
            this.A00 = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            Object[] A1Q = C36441kJ.A1Q();
            AnonymousClass000.A1L(A1Q, this.A00, 0);
            throw new C187358xi(C165567td.A0V(this.A02, A1Q), e);
        }
    }

    public final void A05(int i) {
        long j;
        byte b;
        if (A05 && !C196949an.A00()) {
            int i2 = this.A02;
            int i3 = this.A00;
            if (i2 - i3 >= 5) {
                int i4 = i & -128;
                byte[] bArr = this.A03;
                this.A00 = i3 + 1;
                if (i4 == 0) {
                    j = (long) i3;
                    b = (byte) i;
                } else {
                    C203729od.A0A(bArr, (long) i3, (byte) (i | 128));
                    int i5 = i >>> 7;
                    if ((i5 & -128) != 0) {
                        int i6 = this.A00;
                        this.A00 = i6 + 1;
                        C203729od.A0A(bArr, (long) i6, (byte) (i5 | 128));
                        i5 >>>= 7;
                        if ((i5 & -128) != 0) {
                            int i7 = this.A00;
                            this.A00 = i7 + 1;
                            C203729od.A0A(bArr, (long) i7, (byte) (i5 | 128));
                            i5 >>>= 7;
                            if ((i5 & -128) != 0) {
                                int i8 = this.A00;
                                this.A00 = i8 + 1;
                                C203729od.A0A(bArr, (long) i8, (byte) (i5 | 128));
                                i5 >>>= 7;
                            }
                        }
                    }
                    int i9 = this.A00;
                    this.A00 = i9 + 1;
                    j = (long) i9;
                    b = (byte) i5;
                }
                C203729od.A0A(bArr, j, b);
                return;
            }
        }
        while ((i & -128) != 0) {
            try {
                byte[] bArr2 = this.A03;
                int i10 = this.A00;
                this.A00 = i10 + 1;
                C165597tg.A1O(bArr2, i, i10);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                Object[] A1Q = C36441kJ.A1Q();
                AnonymousClass000.A1L(A1Q, this.A00, 0);
                throw new C187358xi(C165567td.A0V(this.A02, A1Q), e);
            }
        }
        byte[] bArr3 = this.A03;
        int i11 = this.A00;
        this.A00 = i11 + 1;
        bArr3[i11] = (byte) i;
    }

    public final void A06(int i) {
        try {
            byte[] bArr = this.A03;
            int i2 = this.A00;
            int i3 = i2 + 1;
            this.A00 = i3;
            int A022 = C165617ti.A02(i, bArr, i2, i3);
            this.A00 = A022;
            int A023 = C165617ti.A02(i >> 8, bArr, i3, A022);
            this.A00 = A023;
            this.A00 = C165617ti.A02(i >> 16, bArr, A022, A023);
            bArr[A023] = (byte) (i >>> 24);
        } catch (IndexOutOfBoundsException e) {
            Object[] A1Q = C36441kJ.A1Q();
            AnonymousClass000.A1L(A1Q, this.A00, 0);
            throw new C187358xi(C165567td.A0V(this.A02, A1Q), e);
        }
    }

    public final void A07(int i, int i2) {
        A05(i << 3);
        if (i2 >= 0) {
            A05(i2);
        } else {
            A09((long) i2);
        }
    }

    public final void A09(long j) {
        if (!A05 || this.A02 - this.A00 < 10) {
            while ((j & -128) != 0) {
                try {
                    byte[] bArr = this.A03;
                    int i = this.A00;
                    this.A00 = i + 1;
                    C165597tg.A1O(bArr, (int) j, i);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    Object[] A1Q = C36441kJ.A1Q();
                    AnonymousClass000.A1L(A1Q, this.A00, 0);
                    throw new C187358xi(C165567td.A0V(this.A02, A1Q), e);
                }
            }
            byte[] bArr2 = this.A03;
            int i2 = this.A00;
            this.A00 = i2 + 1;
            bArr2[i2] = (byte) ((int) j);
            return;
        }
        while (true) {
            int i3 = ((j & -128) > 0 ? 1 : ((j & -128) == 0 ? 0 : -1));
            byte[] bArr3 = this.A03;
            int i4 = this.A00;
            this.A00 = i4 + 1;
            long j2 = (long) i4;
            int i5 = (int) j;
            if (i3 == 0) {
                C203729od.A0A(bArr3, j2, (byte) i5);
                return;
            } else {
                C203729od.A0A(bArr3, j2, (byte) ((i5 & 127) | 128));
                j >>>= 7;
            }
        }
    }

    public final void A0A(long j) {
        try {
            byte[] bArr = this.A03;
            int i = this.A00;
            int i2 = i + 1;
            this.A00 = i2;
            int A022 = C165617ti.A02((int) j, bArr, i, i2);
            this.A00 = A022;
            C165577te.A0s(j, bArr, 8, i2);
            int i3 = A022 + 1;
            this.A00 = i3;
            C165577te.A0s(j, bArr, 16, A022);
            int i4 = i3 + 1;
            this.A00 = i4;
            C165577te.A0s(j, bArr, 24, i3);
            int i5 = i4 + 1;
            this.A00 = i5;
            C165577te.A0s(j, bArr, 32, i4);
            int i6 = i5 + 1;
            this.A00 = i6;
            C165577te.A0s(j, bArr, 40, i5);
            int i7 = i6 + 1;
            this.A00 = i7;
            C165577te.A0s(j, bArr, 48, i6);
            this.A00 = i7 + 1;
            C165577te.A0s(j, bArr, 56, i7);
        } catch (IndexOutOfBoundsException e) {
            Object[] A1Q = C36441kJ.A1Q();
            AnonymousClass000.A1L(A1Q, this.A00, 0);
            throw new C187358xi(C165567td.A0V(this.A02, A1Q), e);
        }
    }

    public final void A0C(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.A03, this.A00, i2);
            this.A00 += i2;
        } catch (IndexOutOfBoundsException e) {
            Object[] A1Q = C36441kJ.A1Q();
            AnonymousClass000.A1L(A1Q, this.A00, 0);
            C165567td.A1X(A1Q, this.A02, i2);
            throw new C187358xi(String.format("Pos: %d, limit: %d, len: %d", A1Q), e);
        }
    }

    public C170568Dy(byte[] bArr, int i) {
        Objects.requireNonNull(bArr, "buffer");
        int length = bArr.length;
        if ((i | (length - i)) >= 0) {
            this.A03 = bArr;
            this.A00 = 0;
            this.A02 = i;
            return;
        }
        Object[] A1Q = C36441kJ.A1Q();
        AnonymousClass000.A1L(A1Q, length, 0);
        C165567td.A1X(A1Q, 0, i);
        throw C165607th.A0i("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", A1Q);
    }

    public static int A00(int i) {
        return C165567td.A00(i);
    }

    public static int A01(int i, String str) {
        int i2;
        int A042 = AnonymousClass95R.A04(i);
        try {
            i2 = C196639aB.A00(str);
        } catch (AnonymousClass92J unused) {
            i2 = str.getBytes(C197089b7.A00).length;
        }
        return A042 + C165567td.A00(i2) + i2;
    }

    public static int A03(C21673AUw aUw, int i) {
        int A042 = AnonymousClass95R.A04(i);
        int A012 = aUw.A01();
        return A042 + C165567td.A00(A012) + A012;
    }

    public final void A08(int i, String str) {
        int A002;
        AnonymousClass95R.A06(this, i);
        int i2 = this.A00;
        try {
            int length = str.length();
            int A003 = C165567td.A00(length * 3);
            int A004 = C165567td.A00(length);
            if (A004 == A003) {
                int i3 = i2 + A004;
                this.A00 = i3;
                A002 = C196639aB.A00.A00(str, this.A03, i3, this.A02 - i3);
                this.A00 = i2;
                A05((A002 - i2) - A004);
            } else {
                A05(C196639aB.A00(str));
                byte[] bArr = this.A03;
                int i4 = this.A00;
                A002 = C196639aB.A00.A00(str, bArr, i4, this.A02 - i4);
            }
            this.A00 = A002;
        } catch (AnonymousClass92J e) {
            this.A00 = i2;
            A04.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e);
            byte[] bytes = str.getBytes(C197089b7.A00);
            try {
                int length2 = bytes.length;
                A05(length2);
                A0C(bytes, 0, length2);
            } catch (IndexOutOfBoundsException e2) {
                throw new C187358xi(e2);
            } catch (C187358xi e3) {
                throw e3;
            }
        } catch (IndexOutOfBoundsException e4) {
            throw new C187358xi(e4);
        }
    }

    public final void A0B(C21673AUw aUw, int i) {
        AnonymousClass95R.A06(this, i);
        A05(aUw.A01());
        AnonymousClass8E0 r4 = (AnonymousClass8E0) aUw;
        A0C(r4.zzb, r4.A03(), r4.A01());
    }

    public C170568Dy() {
    }
}
