package X;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.8D7  reason: invalid class name */
public abstract class AnonymousClass8D7 extends C194279Ox {
    public static final boolean A01 = C203609oO.A06;
    public static final Logger A02 = C165587tf.A0p(AnonymousClass8D7.class);
    public C21017A3g A00;

    public static int A01(long j) {
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

    public void A02(byte b) {
        if (this instanceof AnonymousClass8D6) {
            AnonymousClass8D6 r2 = (AnonymousClass8D6) this;
            long j = r2.A00;
            long j2 = r2.A02;
            if (j < j2) {
                r2.A00 = 1 + j;
                C203609oO.A02.A07(j, b);
                return;
            }
            Object[] A1Q = C36441kJ.A1Q();
            AnonymousClass000.A1M(A1Q, 0, j);
            A1Q[1] = Long.valueOf(j2);
            AnonymousClass000.A1L(A1Q, 1, 2);
            throw new C187378xl(String.format("Pos: %d, limit: %d, len: %d", A1Q));
        } else if (this instanceof AnonymousClass8D4) {
            try {
                ((AnonymousClass8D4) this).A01.put(b);
            } catch (BufferOverflowException e) {
                throw new C187378xl((Throwable) e);
            }
        } else {
            AnonymousClass8D5 r4 = (AnonymousClass8D5) this;
            try {
                byte[] bArr = r4.A05;
                int i = r4.A00;
                r4.A00 = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e2) {
                Object[] A1Q2 = C36441kJ.A1Q();
                AnonymousClass000.A1L(A1Q2, r4.A00, 0);
                throw new C187378xl(C165567td.A0V(r4.A02, A1Q2), e2);
            }
        }
    }

    public void A03(int i) {
        long j;
        if (this instanceof AnonymousClass8D6) {
            AnonymousClass8D6 r7 = (AnonymousClass8D6) this;
            if (r7.A00 <= r7.A03) {
                while (true) {
                    int i2 = i & -128;
                    j = r7.A00;
                    if (i2 == 0) {
                        break;
                    }
                    r7.A00 = j + 1;
                    C203609oO.A02.A07(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
            } else {
                while (true) {
                    j = r7.A00;
                    long j2 = r7.A02;
                    if (j < j2) {
                        if ((i & -128) == 0) {
                            break;
                        }
                        r7.A00 = j + 1;
                        C203609oO.A02.A07(j, (byte) ((i & 127) | 128));
                        i >>>= 7;
                    } else {
                        Object[] A1Q = C36441kJ.A1Q();
                        AnonymousClass000.A1M(A1Q, 0, j);
                        A1Q[1] = Long.valueOf(j2);
                        AnonymousClass000.A1L(A1Q, 1, 2);
                        throw new C187378xl(String.format("Pos: %d, limit: %d, len: %d", A1Q));
                    }
                }
            }
            r7.A00 = 1 + j;
            C203609oO.A02.A07(j, (byte) i);
        } else if (this instanceof AnonymousClass8D4) {
            AnonymousClass8D4 r2 = (AnonymousClass8D4) this;
            while ((i & -128) != 0) {
                try {
                    r2.A01.put((byte) ((i & 127) | 128));
                    i >>>= 7;
                } catch (BufferOverflowException e) {
                    throw new C187378xl((Throwable) e);
                }
            }
            r2.A01.put((byte) i);
        } else {
            AnonymousClass8D5 r4 = (AnonymousClass8D5) this;
            if (!A01 || r4.A02 - r4.A00 < 10) {
                while ((i & -128) != 0) {
                    try {
                        byte[] bArr = r4.A05;
                        int i3 = r4.A00;
                        r4.A00 = i3 + 1;
                        C165597tg.A1O(bArr, i, i3);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e2) {
                        Object[] A1Q2 = C36441kJ.A1Q();
                        AnonymousClass000.A1L(A1Q2, r4.A00, 0);
                        throw new C187378xl(C165567td.A0V(r4.A02, A1Q2), e2);
                    }
                }
                byte[] bArr2 = r4.A05;
                int i4 = r4.A00;
                r4.A00 = i4 + 1;
                bArr2[i4] = (byte) i;
                return;
            }
            while (true) {
                int i5 = i & -128;
                byte[] bArr3 = r4.A05;
                int i6 = r4.A00;
                r4.A00 = i6 + 1;
                long j3 = (long) i6;
                if (i5 == 0) {
                    C203609oO.A08(bArr3, j3, (byte) i);
                    return;
                } else {
                    C203609oO.A08(bArr3, j3, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
            }
        }
    }

    public void A04(int i) {
        if (this instanceof AnonymousClass8D6) {
            AnonymousClass8D6 r5 = (AnonymousClass8D6) this;
            r5.A05.putInt((int) (r5.A00 - r5.A01), i);
            r5.A00 += 4;
        } else if (this instanceof AnonymousClass8D4) {
            try {
                ((AnonymousClass8D4) this).A01.putInt(i);
            } catch (BufferOverflowException e) {
                throw new C187378xl((Throwable) e);
            }
        } else {
            AnonymousClass8D5 r4 = (AnonymousClass8D5) this;
            try {
                byte[] bArr = r4.A05;
                int i2 = r4.A00;
                int i3 = i2 + 1;
                r4.A00 = i3;
                int A022 = C165617ti.A02(i, bArr, i2, i3);
                r4.A00 = A022;
                int A023 = C165617ti.A02(i >> 8, bArr, i3, A022);
                r4.A00 = A023;
                r4.A00 = C165617ti.A02(i >> 16, bArr, A022, A023);
                bArr[A023] = i >> 24;
            } catch (IndexOutOfBoundsException e2) {
                Object[] A1Q = C36441kJ.A1Q();
                AnonymousClass000.A1L(A1Q, r4.A00, 0);
                throw new C187378xl(C165567td.A0V(r4.A02, A1Q), e2);
            }
        }
    }

    public void A05(int i, int i2) {
        boolean z = this instanceof AnonymousClass8D6;
        A03(i << 3);
        if (i2 >= 0) {
            A03(i2);
        } else {
            A09((long) i2);
        }
    }

    public void A06(int i, int i2) {
        boolean z = this instanceof AnonymousClass8D6;
        A03((i << 3) | 5);
        A04(i2);
    }

    public void A07(int i, long j) {
        boolean z = this instanceof AnonymousClass8D6;
        A03((i << 3) | 1);
        A0A(j);
    }

    public void A08(int i, String str) {
        int A012;
        C187378xl r1;
        long j;
        long j2;
        if (this instanceof AnonymousClass8D6) {
            AnonymousClass8D6 r7 = (AnonymousClass8D6) this;
            C194279Ox.A04(r7, i);
            long j3 = r7.A00;
            try {
                int length = str.length();
                int A002 = C165567td.A00(length * 3);
                int A003 = C165567td.A00(length);
                if (A003 == A002) {
                    int i2 = ((int) (j3 - r7.A01)) + A003;
                    ByteBuffer byteBuffer = r7.A05;
                    byteBuffer.position(i2);
                    C201819kT.A01(str, byteBuffer);
                    int position = byteBuffer.position() - i2;
                    r7.A03(position);
                    j = r7.A00;
                    j2 = (long) position;
                } else {
                    int A004 = C201819kT.A00(str);
                    r7.A03(A004);
                    long j4 = r7.A00;
                    ByteBuffer byteBuffer2 = r7.A05;
                    byteBuffer2.position((int) (j4 - r7.A01));
                    C201819kT.A01(str, byteBuffer2);
                    j = r7.A00;
                    j2 = (long) A004;
                }
                r7.A00 = j + j2;
            } catch (AnonymousClass92I e) {
                r7.A00 = j3;
                r7.A05.position((int) (j3 - r7.A01));
                r7.A0D(e, str);
            } catch (IllegalArgumentException e2) {
                throw new C187378xl((Throwable) e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new C187378xl((Throwable) e3);
            }
        } else if (this instanceof AnonymousClass8D4) {
            AnonymousClass8D4 r3 = (AnonymousClass8D4) this;
            C194279Ox.A04(r3, i);
            ByteBuffer byteBuffer3 = r3.A01;
            int position2 = byteBuffer3.position();
            try {
                int length2 = str.length();
                int A005 = C165567td.A00(length2 * 3);
                int A006 = C165567td.A00(length2);
                if (A006 == A005) {
                    int position3 = byteBuffer3.position() + A006;
                    byteBuffer3.position(position3);
                    try {
                        C201819kT.A01(str, byteBuffer3);
                        int position4 = byteBuffer3.position();
                        byteBuffer3.position(position2);
                        r3.A03(position4 - position3);
                        byteBuffer3.position(position4);
                    } catch (IndexOutOfBoundsException e4) {
                        r1 = new C187378xl((Throwable) e4);
                        throw r1;
                    }
                } else {
                    r3.A03(C201819kT.A00(str));
                    try {
                        C201819kT.A01(str, byteBuffer3);
                    } catch (IndexOutOfBoundsException e5) {
                        r1 = new C187378xl((Throwable) e5);
                        throw r1;
                    }
                }
            } catch (AnonymousClass92I e6) {
                byteBuffer3.position(position2);
                r3.A0D(e6, str);
            } catch (IllegalArgumentException e7) {
                throw new C187378xl((Throwable) e7);
            }
        } else {
            AnonymousClass8D5 r4 = (AnonymousClass8D5) this;
            C194279Ox.A04(r4, i);
            int i3 = r4.A00;
            try {
                int length3 = str.length();
                int A007 = C165567td.A00(length3 * 3);
                int A008 = C165567td.A00(length3);
                if (A008 == A007) {
                    int i4 = i3 + A008;
                    r4.A00 = i4;
                    A012 = C201819kT.A00.A01(str, r4.A05, i4, r4.A02 - i4);
                    r4.A00 = i3;
                    r4.A03((A012 - i3) - A008);
                } else {
                    r4.A03(C201819kT.A00(str));
                    byte[] bArr = r4.A05;
                    int i5 = r4.A00;
                    A012 = C201819kT.A00.A01(str, bArr, i5, r4.A02 - i5);
                }
                r4.A00 = A012;
            } catch (AnonymousClass92I e8) {
                r4.A00 = i3;
                r4.A0D(e8, str);
            } catch (IndexOutOfBoundsException e9) {
                throw new C187378xl((Throwable) e9);
            }
        }
    }

    public void A09(long j) {
        long j2;
        if (this instanceof AnonymousClass8D6) {
            AnonymousClass8D6 r7 = (AnonymousClass8D6) this;
            if (r7.A00 <= r7.A03) {
                while (true) {
                    int i = ((j & -128) > 0 ? 1 : ((j & -128) == 0 ? 0 : -1));
                    j2 = r7.A00;
                    if (i == 0) {
                        break;
                    }
                    r7.A00 = j2 + 1;
                    C203609oO.A02.A07(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
            } else {
                while (true) {
                    j2 = r7.A00;
                    long j3 = r7.A02;
                    if (j2 < j3) {
                        if ((j & -128) == 0) {
                            break;
                        }
                        r7.A00 = j2 + 1;
                        C203609oO.A02.A07(j2, (byte) ((((int) j) & 127) | 128));
                        j >>>= 7;
                    } else {
                        Object[] A1Q = C36441kJ.A1Q();
                        AnonymousClass000.A1M(A1Q, 0, j2);
                        A1Q[1] = Long.valueOf(j3);
                        AnonymousClass000.A1L(A1Q, 1, 2);
                        throw new C187378xl(String.format("Pos: %d, limit: %d, len: %d", A1Q));
                    }
                }
            }
            r7.A00 = 1 + j2;
            C203609oO.A02.A07(j2, (byte) ((int) j));
        } else if (this instanceof AnonymousClass8D4) {
            AnonymousClass8D4 r5 = (AnonymousClass8D4) this;
            while ((-128 & j) != 0) {
                try {
                    r5.A01.put((byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                } catch (BufferOverflowException e) {
                    throw new C187378xl((Throwable) e);
                }
            }
            r5.A01.put((byte) ((int) j));
        } else {
            AnonymousClass8D5 r4 = (AnonymousClass8D5) this;
            if (!A01 || r4.A02 - r4.A00 < 10) {
                while ((j & -128) != 0) {
                    try {
                        byte[] bArr = r4.A05;
                        int i2 = r4.A00;
                        r4.A00 = i2 + 1;
                        C165597tg.A1O(bArr, (int) j, i2);
                        j >>>= 7;
                    } catch (IndexOutOfBoundsException e2) {
                        Object[] A1Q2 = C36441kJ.A1Q();
                        AnonymousClass000.A1L(A1Q2, r4.A00, 0);
                        throw new C187378xl(C165567td.A0V(r4.A02, A1Q2), e2);
                    }
                }
                byte[] bArr2 = r4.A05;
                int i3 = r4.A00;
                r4.A00 = i3 + 1;
                bArr2[i3] = (byte) ((int) j);
                return;
            }
            while (true) {
                int i4 = ((j & -128) > 0 ? 1 : ((j & -128) == 0 ? 0 : -1));
                byte[] bArr3 = r4.A05;
                int i5 = r4.A00;
                r4.A00 = i5 + 1;
                long j4 = (long) i5;
                int i6 = (int) j;
                if (i4 == 0) {
                    C203609oO.A08(bArr3, j4, (byte) i6);
                    return;
                } else {
                    C203609oO.A08(bArr3, j4, (byte) ((i6 & 127) | 128));
                    j >>>= 7;
                }
            }
        }
    }

    public void A0A(long j) {
        if (this instanceof AnonymousClass8D6) {
            AnonymousClass8D6 r5 = (AnonymousClass8D6) this;
            r5.A05.putLong((int) (r5.A00 - r5.A01), j);
            r5.A00 += 8;
        } else if (this instanceof AnonymousClass8D4) {
            try {
                ((AnonymousClass8D4) this).A01.putLong(j);
            } catch (BufferOverflowException e) {
                throw new C187378xl((Throwable) e);
            }
        } else {
            AnonymousClass8D5 r4 = (AnonymousClass8D5) this;
            try {
                byte[] bArr = r4.A05;
                int i = r4.A00;
                int i2 = i + 1;
                r4.A00 = i2;
                int A022 = C165617ti.A02((int) j, bArr, i, i2);
                r4.A00 = A022;
                C165577te.A0s(j, bArr, 8, i2);
                int i3 = A022 + 1;
                r4.A00 = i3;
                C165577te.A0s(j, bArr, 16, A022);
                int i4 = i3 + 1;
                r4.A00 = i4;
                C165577te.A0s(j, bArr, 24, i3);
                int i5 = i4 + 1;
                r4.A00 = i5;
                C165577te.A0s(j, bArr, 32, i4);
                int i6 = i5 + 1;
                r4.A00 = i6;
                C165577te.A0s(j, bArr, 40, i5);
                int i7 = i6 + 1;
                r4.A00 = i7;
                C165577te.A0s(j, bArr, 48, i6);
                r4.A00 = i7 + 1;
                C165577te.A0s(j, bArr, 56, i7);
            } catch (IndexOutOfBoundsException e2) {
                Object[] A1Q = C36441kJ.A1Q();
                AnonymousClass000.A1L(A1Q, r4.A00, 0);
                throw new C187378xl(C165567td.A0V(r4.A02, A1Q), e2);
            }
        }
    }

    public void A0B(AUv aUv, int i) {
        if (this instanceof AnonymousClass8D6) {
            C194279Ox.A04(this, i);
            A03(aUv.A02());
            aUv.A03(this);
            return;
        }
        C194279Ox.A04(this, i);
        A03(aUv.A02());
        aUv.A03(this);
    }

    public void A0C(C23118B5x b5x, B3S b3s, int i) {
        if (this instanceof AnonymousClass8D6) {
            C194279Ox.A04(this, i);
            A03(AnonymousClass8DG.A00(b3s, b5x));
            b3s.ByM(this.A00, b5x);
            return;
        }
        C194279Ox.A04(this, i);
        A03(AnonymousClass8DG.A00(b3s, b5x));
        b3s.ByM(this.A00, b5x);
    }

    public final void A0D(AnonymousClass92I r7, String str) {
        A02.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", r7);
        byte[] bytes = str.getBytes(C197079b6.A00);
        try {
            int length = bytes.length;
            A03(length);
            A0E(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new C187378xl((Throwable) e);
        } catch (C187378xl e2) {
            throw e2;
        }
    }

    public void A0E(byte[] bArr, int i, int i2) {
        byte[] bArr2 = bArr;
        if (this instanceof AnonymousClass8D6) {
            AnonymousClass8D6 r3 = (AnonymousClass8D6) this;
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = (long) i2;
                long j2 = r3.A00;
                if (r3.A02 - j >= j2) {
                    C203609oO.A02.A0E(bArr2, (long) i, j2, j);
                    r3.A00 += j;
                    return;
                }
            }
            Objects.requireNonNull(bArr, "value");
            Object[] A1Q = C36441kJ.A1Q();
            AnonymousClass000.A1M(A1Q, 0, r3.A00);
            AnonymousClass000.A1M(A1Q, 1, r3.A02);
            AnonymousClass000.A1L(A1Q, i2, 2);
            throw new C187378xl(String.format("Pos: %d, limit: %d, len: %d", A1Q));
        } else if (this instanceof AnonymousClass8D4) {
            try {
                ((AnonymousClass8D4) this).A01.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e) {
                throw new C187378xl((Throwable) e);
            } catch (BufferOverflowException e2) {
                throw new C187378xl((Throwable) e2);
            }
        } else {
            AnonymousClass8D5 r4 = (AnonymousClass8D5) this;
            try {
                System.arraycopy(bArr, i, r4.A05, r4.A00, i2);
                r4.A00 += i2;
            } catch (IndexOutOfBoundsException e3) {
                Object[] A1Q2 = C36441kJ.A1Q();
                AnonymousClass000.A1L(A1Q2, r4.A00, 0);
                C165567td.A1X(A1Q2, r4.A02, i2);
                throw new C187378xl(String.format("Pos: %d, limit: %d, len: %d", A1Q2), e3);
            }
        }
    }

    public static int A00(int i) {
        return C165567td.A00(i);
    }
}
