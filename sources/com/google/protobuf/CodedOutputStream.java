package com.google.protobuf;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass8I5;
import X.AnonymousClass8IA;
import X.AnonymousClass8IB;
import X.AnonymousClass92L;
import X.AnonymousClass9BD;
import X.AnonymousClass9TV;
import X.B63;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165597tg;
import X.C187368xk;
import X.C1897895p;
import X.C196659aK;
import X.C21070A7h;
import X.C21674AUx;
import X.C23073B3d;
import X.C36441kJ;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class CodedOutputStream extends C1897895p {
    public static final boolean A01 = UnsafeUtil.A05;
    public static final Logger A02 = C165587tf.A0p(CodedOutputStream.class);
    public AnonymousClass9TV A00;

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

    public final void A05() {
        AnonymousClass8IA r0 = (AnonymousClass8IA) this;
        if (r0.A01 - r0.A00 != 0) {
            throw AnonymousClass001.A09("Did not write as much data as expected.");
        }
    }

    public void A06(byte b) {
        if (this instanceof AnonymousClass8IB) {
            AnonymousClass8IB r3 = (AnonymousClass8IB) this;
            if (r3.A00 == r3.A02) {
                AnonymousClass8IB.A03(r3);
            }
            byte[] bArr = r3.A03;
            int i = r3.A00;
            r3.A00 = i + 1;
            bArr[i] = b;
            r3.A01++;
            return;
        }
        AnonymousClass8IA r4 = (AnonymousClass8IA) this;
        try {
            byte[] bArr2 = r4.A02;
            int i2 = r4.A00;
            r4.A00 = i2 + 1;
            bArr2[i2] = b;
        } catch (IndexOutOfBoundsException e) {
            Object[] A1Q = C36441kJ.A1Q();
            AnonymousClass000.A1L(A1Q, r4.A00, 0);
            throw new C187368xk(C165567td.A0V(r4.A01, A1Q), e);
        }
    }

    public void A07(int i) {
        if (this instanceof AnonymousClass8IB) {
            AnonymousClass8IB r1 = (AnonymousClass8IB) this;
            AnonymousClass8IB.A04(r1, 4);
            r1.A0M(i);
            return;
        }
        AnonymousClass8IA r4 = (AnonymousClass8IA) this;
        try {
            byte[] bArr = r4.A02;
            int i2 = r4.A00;
            int i3 = i2 + 1;
            r4.A00 = i3;
            C165597tg.A1N(bArr, i, i2);
            int i4 = i3 + 1;
            r4.A00 = i4;
            C165597tg.A1N(bArr, i >> 8, i3);
            int i5 = i4 + 1;
            r4.A00 = i5;
            C165597tg.A1N(bArr, i >> 16, i4);
            r4.A00 = i5 + 1;
            C165597tg.A1N(bArr, i >> 24, i5);
        } catch (IndexOutOfBoundsException e) {
            Object[] A1Q = C36441kJ.A1Q();
            AnonymousClass000.A1L(A1Q, r4.A00, 0);
            throw new C187368xk(C165567td.A0V(r4.A01, A1Q), e);
        }
    }

    public void A08(int i) {
        if (this instanceof AnonymousClass8IB) {
            AnonymousClass8IB r1 = (AnonymousClass8IB) this;
            AnonymousClass8IB.A04(r1, 5);
            r1.A0N(i);
            return;
        }
        AnonymousClass8IA r4 = (AnonymousClass8IA) this;
        while ((i & -128) != 0) {
            try {
                byte[] bArr = r4.A02;
                int i2 = r4.A00;
                r4.A00 = i2 + 1;
                C165597tg.A1O(bArr, i, i2);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                Object[] A1Q = C36441kJ.A1Q();
                AnonymousClass000.A1L(A1Q, r4.A00, 0);
                throw new C187368xk(C165567td.A0V(r4.A01, A1Q), e);
            }
        }
        byte[] bArr2 = r4.A02;
        int i3 = r4.A00;
        r4.A00 = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    public void A09(int i, int i2) {
        if (this instanceof AnonymousClass8IB) {
            AnonymousClass8IB r1 = (AnonymousClass8IB) this;
            AnonymousClass8IB.A04(r1, 14);
            r1.A0N((i << 3) | 5);
            r1.A0M(i2);
            return;
        }
        A08((i << 3) | 5);
        A07(i2);
    }

    public void A0A(int i, int i2) {
        if (this instanceof AnonymousClass8IB) {
            AnonymousClass8IB r2 = (AnonymousClass8IB) this;
            AnonymousClass8IB.A04(r2, 20);
            r2.A0N(i << 3);
            if (i2 >= 0) {
                r2.A0N(i2);
            } else {
                r2.A0P((long) i2);
            }
        } else {
            A08(i << 3);
            if (i2 >= 0) {
                A08(i2);
            } else {
                A0G((long) i2);
            }
        }
    }

    public void A0B(int i, int i2) {
        if (this instanceof AnonymousClass8IB) {
            AnonymousClass8IB r1 = (AnonymousClass8IB) this;
            AnonymousClass8IB.A04(r1, 20);
            r1.A0N(i << 3);
            r1.A0N(i2);
            return;
        }
        A08(i << 3);
        A08(i2);
    }

    public void A0C(int i, long j) {
        if (this instanceof AnonymousClass8IB) {
            AnonymousClass8IB r1 = (AnonymousClass8IB) this;
            AnonymousClass8IB.A04(r1, 18);
            r1.A0N((i << 3) | 1);
            r1.A0O(j);
            return;
        }
        A08((i << 3) | 1);
        A0F(j);
    }

    public void A0D(int i, long j) {
        if (this instanceof AnonymousClass8IB) {
            AnonymousClass8IB r1 = (AnonymousClass8IB) this;
            AnonymousClass8IB.A04(r1, 20);
            r1.A0N(i << 3);
            r1.A0P(j);
            return;
        }
        A08(i << 3);
        A0G(j);
    }

    public void A0E(int i, boolean z) {
        if (this instanceof AnonymousClass8IB) {
            AnonymousClass8IB r4 = (AnonymousClass8IB) this;
            AnonymousClass8IB.A04(r4, 11);
            r4.A0N(i << 3);
            byte b = z ? (byte) 1 : 0;
            byte[] bArr = r4.A03;
            int i2 = r4.A00;
            r4.A00 = i2 + 1;
            bArr[i2] = b;
            r4.A01++;
            return;
        }
        A08(i << 3);
        A06(z ? (byte) 1 : 0);
    }

    public void A0F(long j) {
        if (this instanceof AnonymousClass8IB) {
            AnonymousClass8IB r1 = (AnonymousClass8IB) this;
            AnonymousClass8IB.A04(r1, 8);
            r1.A0O(j);
            return;
        }
        AnonymousClass8IA r4 = (AnonymousClass8IA) this;
        try {
            byte[] bArr = r4.A02;
            int i = r4.A00;
            int i2 = i + 1;
            r4.A00 = i2;
            C165597tg.A1N(bArr, (int) j, i);
            int i3 = i2 + 1;
            r4.A00 = i3;
            C165577te.A0t(j, bArr, 8, i2);
            int i4 = i3 + 1;
            r4.A00 = i4;
            C165577te.A0t(j, bArr, 16, i3);
            int i5 = i4 + 1;
            r4.A00 = i5;
            C165577te.A0t(j, bArr, 24, i4);
            int i6 = i5 + 1;
            r4.A00 = i6;
            C165577te.A0t(j, bArr, 32, i5);
            int i7 = i6 + 1;
            r4.A00 = i7;
            C165577te.A0t(j, bArr, 40, i6);
            int i8 = i7 + 1;
            r4.A00 = i8;
            C165577te.A0t(j, bArr, 48, i7);
            r4.A00 = i8 + 1;
            C165577te.A0t(j, bArr, 56, i8);
        } catch (IndexOutOfBoundsException e) {
            Object[] A1Q = C36441kJ.A1Q();
            AnonymousClass000.A1L(A1Q, r4.A00, 0);
            throw new C187368xk(C165567td.A0V(r4.A01, A1Q), e);
        }
    }

    public void A0G(long j) {
        if (this instanceof AnonymousClass8IB) {
            AnonymousClass8IB r1 = (AnonymousClass8IB) this;
            AnonymousClass8IB.A04(r1, 10);
            r1.A0P(j);
            return;
        }
        AnonymousClass8IA r4 = (AnonymousClass8IA) this;
        if (!A01 || r4.A01 - r4.A00 < 10) {
            while ((j & -128) != 0) {
                try {
                    byte[] bArr = r4.A02;
                    int i = r4.A00;
                    r4.A00 = i + 1;
                    C165597tg.A1O(bArr, (int) j, i);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    Object[] A1Q = C36441kJ.A1Q();
                    AnonymousClass000.A1L(A1Q, r4.A00, 0);
                    throw new C187368xk(C165567td.A0V(r4.A01, A1Q), e);
                }
            }
            byte[] bArr2 = r4.A02;
            int i2 = r4.A00;
            r4.A00 = i2 + 1;
            bArr2[i2] = (byte) ((int) j);
            return;
        }
        while (true) {
            int i3 = ((j & -128) > 0 ? 1 : ((j & -128) == 0 ? 0 : -1));
            byte[] bArr3 = r4.A02;
            int i4 = r4.A00;
            r4.A00 = i4 + 1;
            long j2 = (long) i4;
            int i5 = (int) j;
            if (i3 == 0) {
                UnsafeUtil.A09(bArr3, j2, (byte) i5);
                return;
            } else {
                UnsafeUtil.A09(bArr3, j2, (byte) ((i5 & 127) | 128));
                j >>>= 7;
            }
        }
    }

    public final void A0J(AnonymousClass92L r4, String str) {
        A02.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", r4);
        byte[] bytes = str.getBytes(AnonymousClass9BD.A04);
        try {
            int length = bytes.length;
            A08(length);
            A0L(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new C187368xk(e);
        }
    }

    public void A0K(String str) {
        int A012;
        int i;
        int i2;
        int i3;
        if (this instanceof AnonymousClass8IB) {
            AnonymousClass8IB r4 = (AnonymousClass8IB) this;
            try {
                int length = str.length();
                int i4 = length * 3;
                int A002 = C165567td.A00(i4);
                int i5 = A002 + i4;
                int i6 = r4.A02;
                if (i5 > i6) {
                    byte[] bArr = new byte[i4];
                    int A013 = C196659aK.A00.A01(str, bArr, 0, i4);
                    r4.A08(A013);
                    r4.A0L(bArr, 0, A013);
                    return;
                }
                if (i5 > i6 - r4.A00) {
                    AnonymousClass8IB.A03(r4);
                }
                int A003 = C165567td.A00(length);
                i = r4.A00;
                if (A003 == A002) {
                    int i7 = i + A003;
                    r4.A00 = i7;
                    i3 = C196659aK.A00.A01(str, r4.A03, i7, i6 - i7);
                    r4.A00 = i;
                    i2 = (i3 - i) - A003;
                    r4.A0N(i2);
                } else {
                    i2 = C196659aK.A00(str);
                    r4.A0N(i2);
                    i3 = C196659aK.A00.A01(str, r4.A03, r4.A00, i2);
                }
                r4.A00 = i3;
                r4.A01 += i2;
            } catch (AnonymousClass92L e) {
                r4.A01 -= r4.A00 - i;
                r4.A00 = i;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new C187368xk(e2);
            } catch (AnonymousClass92L e3) {
                r4.A0J(e3, str);
            }
        } else {
            AnonymousClass8IA r5 = (AnonymousClass8IA) this;
            int i8 = r5.A00;
            try {
                int length2 = str.length();
                int A004 = C165567td.A00(length2 * 3);
                int A005 = C165567td.A00(length2);
                if (A005 == A004) {
                    int i9 = i8 + A005;
                    r5.A00 = i9;
                    A012 = C196659aK.A00.A01(str, r5.A02, i9, r5.A01 - i9);
                    r5.A00 = i8;
                    r5.A08((A012 - i8) - A005);
                } else {
                    r5.A08(C196659aK.A00(str));
                    byte[] bArr2 = r5.A02;
                    int i10 = r5.A00;
                    A012 = C196659aK.A00.A01(str, bArr2, i10, r5.A01 - i10);
                }
                r5.A00 = A012;
            } catch (AnonymousClass92L e4) {
                r5.A00 = i8;
                r5.A0J(e4, str);
            } catch (IndexOutOfBoundsException e5) {
                throw new C187368xk(e5);
            }
        }
    }

    public void A0L(byte[] bArr, int i, int i2) {
        if (this instanceof AnonymousClass8IB) {
            ((AnonymousClass8IB) this).A0Q(bArr, i, i2);
        } else {
            ((AnonymousClass8IA) this).A0M(bArr, i, i2);
        }
    }

    public static int A00(int i) {
        return C165567td.A00(i);
    }

    public static int A02(String str) {
        int i;
        String str2;
        try {
            str2 = str;
            int A002 = C196659aK.A00(str);
            str2 = A002;
            i = A002;
        } catch (AnonymousClass92L unused) {
            i = str2.getBytes(AnonymousClass9BD.A04).length;
        }
        return C165567td.A00(i) + i;
    }

    public void A0H(C21674AUx aUx) {
        A08(aUx.A02());
        AnonymousClass8I5 r4 = (AnonymousClass8I5) aUx;
        A0L(r4.bytes, r4.A07(), r4.A02());
    }

    public void A0I(B63 b63, C23073B3d b3d, int i) {
        C1897895p.A07(this, i);
        A08(((C21070A7h) b63).A0k(b3d));
        b3d.Bxf(this.A00, b63);
    }
}
