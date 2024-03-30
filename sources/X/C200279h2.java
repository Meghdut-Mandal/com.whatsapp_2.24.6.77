package X;

import com.google.protobuf.UnsafeUtil;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.9h2  reason: invalid class name and case insensitive filesystem */
public abstract class C200279h2 {
    public int A00;
    public C203179nT A01;

    public static long A06(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static AnonymousClass8I7 A07(byte[] bArr, int i, int i2) {
        AnonymousClass8I7 r0 = new AnonymousClass8I7(bArr, i, i2);
        try {
            r0.A0I(i2);
            return r0;
        } catch (AnonymousClass186 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public double A08() {
        long A0Z;
        if (this instanceof AnonymousClass8I8) {
            A0Z = ((AnonymousClass8I8) this).A0Z();
        } else if (this instanceof AnonymousClass8I9) {
            A0Z = ((AnonymousClass8I9) this).A0Z();
        } else {
            A0Z = ((AnonymousClass8I7) this).A0Z();
        }
        return Double.longBitsToDouble(A0Z);
    }

    public float A09() {
        int A0W;
        if (this instanceof AnonymousClass8I8) {
            A0W = ((AnonymousClass8I8) this).A0W();
        } else if (this instanceof AnonymousClass8I9) {
            A0W = ((AnonymousClass8I9) this).A0W();
        } else {
            A0W = ((AnonymousClass8I7) this).A0W();
        }
        return Float.intBitsToFloat(A0W);
    }

    public int A0A() {
        if (this instanceof AnonymousClass8I8) {
            AnonymousClass8I8 r0 = (AnonymousClass8I8) this;
            return (int) (r0.A03 - r0.A04);
        } else if (this instanceof AnonymousClass8I9) {
            AnonymousClass8I9 r02 = (AnonymousClass8I9) this;
            return r02.A04 + r02.A03;
        } else {
            AnonymousClass8I7 r03 = (AnonymousClass8I7) this;
            return r03.A03 - r03.A04;
        }
    }

    public int A0B() {
        if (this instanceof AnonymousClass8I8) {
            return ((AnonymousClass8I8) this).A0X();
        }
        if (this instanceof AnonymousClass8I9) {
            return ((AnonymousClass8I9) this).A0X();
        }
        return ((AnonymousClass8I7) this).A0X();
    }

    public int A0C() {
        if (this instanceof AnonymousClass8I8) {
            return ((AnonymousClass8I8) this).A0W();
        }
        if (this instanceof AnonymousClass8I9) {
            return ((AnonymousClass8I9) this).A0W();
        }
        return ((AnonymousClass8I7) this).A0W();
    }

    public int A0D() {
        if (this instanceof AnonymousClass8I8) {
            return ((AnonymousClass8I8) this).A0X();
        }
        if (this instanceof AnonymousClass8I9) {
            return ((AnonymousClass8I9) this).A0X();
        }
        return ((AnonymousClass8I7) this).A0X();
    }

    public int A0E() {
        if (this instanceof AnonymousClass8I8) {
            return ((AnonymousClass8I8) this).A0W();
        }
        if (this instanceof AnonymousClass8I9) {
            return ((AnonymousClass8I9) this).A0W();
        }
        return ((AnonymousClass8I7) this).A0W();
    }

    public int A0F() {
        if (this instanceof AnonymousClass8I8) {
            return C165597tg.A02(((AnonymousClass8I8) this).A0X());
        }
        if (this instanceof AnonymousClass8I9) {
            return C165597tg.A02(((AnonymousClass8I9) this).A0X());
        }
        return C165597tg.A02(((AnonymousClass8I7) this).A0X());
    }

    public int A0G() {
        if (this instanceof AnonymousClass8I8) {
            AnonymousClass8I8 r1 = (AnonymousClass8I8) this;
            if (r1.A0T()) {
                r1.A01 = 0;
                return 0;
            }
            int A0X = r1.A0X();
            r1.A01 = A0X;
            if ((A0X >>> 3) != 0) {
                return A0X;
            }
            throw C165617ti.A0L("Protocol message contained an invalid tag (zero).");
        } else if (this instanceof AnonymousClass8I9) {
            AnonymousClass8I9 r12 = (AnonymousClass8I9) this;
            if (r12.A0T()) {
                r12.A02 = 0;
                return 0;
            }
            int A0X2 = r12.A0X();
            r12.A02 = A0X2;
            if ((A0X2 >>> 3) != 0) {
                return A0X2;
            }
            throw C165617ti.A0L("Protocol message contained an invalid tag (zero).");
        } else {
            AnonymousClass8I7 r13 = (AnonymousClass8I7) this;
            if (r13.A0T()) {
                r13.A01 = 0;
                return 0;
            }
            int A0X3 = r13.A0X();
            r13.A01 = A0X3;
            if ((A0X3 >>> 3) != 0) {
                return A0X3;
            }
            throw C165617ti.A0L("Protocol message contained an invalid tag (zero).");
        }
    }

    public int A0H() {
        if (this instanceof AnonymousClass8I8) {
            return ((AnonymousClass8I8) this).A0X();
        }
        if (this instanceof AnonymousClass8I9) {
            return ((AnonymousClass8I9) this).A0X();
        }
        return ((AnonymousClass8I7) this).A0X();
    }

    public int A0I(int i) {
        if (this instanceof AnonymousClass8I8) {
            AnonymousClass8I8 r4 = (AnonymousClass8I8) this;
            if (i >= 0) {
                int i2 = i + ((int) (r4.A03 - r4.A04));
                int i3 = r4.A00;
                if (i2 <= i3) {
                    r4.A00 = i2;
                    AnonymousClass8I8.A00(r4);
                    return i3;
                }
                throw C165587tf.A0J();
            }
            throw C165597tg.A0L();
        } else if (this instanceof AnonymousClass8I9) {
            AnonymousClass8I9 r2 = (AnonymousClass8I9) this;
            if (i >= 0) {
                int i4 = i + r2.A04 + r2.A03;
                int i5 = r2.A01;
                if (i4 <= i5) {
                    r2.A01 = i4;
                    AnonymousClass8I9.A01(r2);
                    return i5;
                }
                throw C165587tf.A0J();
            }
            throw C165597tg.A0L();
        } else {
            AnonymousClass8I7 r22 = (AnonymousClass8I7) this;
            if (i >= 0) {
                int i6 = i + (r22.A03 - r22.A04);
                if (i6 >= 0) {
                    int i7 = r22.A00;
                    if (i6 <= i7) {
                        r22.A00 = i6;
                        AnonymousClass8I7.A00(r22);
                        return i7;
                    }
                    throw C165587tf.A0J();
                }
                throw C165617ti.A0L("Failed to parse the message.");
            }
            throw C165597tg.A0L();
        }
    }

    public long A0J() {
        if (this instanceof AnonymousClass8I8) {
            return ((AnonymousClass8I8) this).A0Z();
        }
        if (this instanceof AnonymousClass8I9) {
            return ((AnonymousClass8I9) this).A0Z();
        }
        return ((AnonymousClass8I7) this).A0Z();
    }

    public long A0K() {
        if (this instanceof AnonymousClass8I8) {
            return ((AnonymousClass8I8) this).A0a();
        }
        if (this instanceof AnonymousClass8I9) {
            return ((AnonymousClass8I9) this).A0a();
        }
        return ((AnonymousClass8I7) this).A0a();
    }

    public long A0L() {
        if (this instanceof AnonymousClass8I8) {
            return ((AnonymousClass8I8) this).A0Z();
        }
        if (this instanceof AnonymousClass8I9) {
            return ((AnonymousClass8I9) this).A0Z();
        }
        return ((AnonymousClass8I7) this).A0Z();
    }

    public long A0M() {
        if (this instanceof AnonymousClass8I8) {
            return C165567td.A06(((AnonymousClass8I8) this).A0a());
        }
        if (this instanceof AnonymousClass8I9) {
            return C165567td.A06(((AnonymousClass8I9) this).A0a());
        }
        return C165567td.A06(((AnonymousClass8I7) this).A0a());
    }

    public long A0N() {
        if (this instanceof AnonymousClass8I8) {
            return ((AnonymousClass8I8) this).A0a();
        }
        if (this instanceof AnonymousClass8I9) {
            return ((AnonymousClass8I9) this).A0a();
        }
        return ((AnonymousClass8I7) this).A0a();
    }

    public C21674AUx A0O() {
        if (this instanceof AnonymousClass8I8) {
            AnonymousClass8I8 r4 = (AnonymousClass8I8) this;
            int A0X = r4.A0X();
            if (A0X > 0) {
                long j = r4.A02;
                long j2 = r4.A03;
                if (A0X <= ((int) (j - j2))) {
                    byte[] bArr = new byte[A0X];
                    long j3 = (long) A0X;
                    UnsafeUtil.A02.A0I(bArr, j2, 0, j3);
                    r4.A03 += j3;
                    return new AnonymousClass8I5(bArr);
                }
                throw C165587tf.A0J();
            } else if (A0X == 0) {
                return C21674AUx.A00;
            } else {
                throw C165597tg.A0L();
            }
        } else {
            if (this instanceof AnonymousClass8I9) {
                AnonymousClass8I9 r6 = (AnonymousClass8I9) this;
                int A0X2 = r6.A0X();
                int i = r6.A00;
                int i2 = r6.A03;
                if (A0X2 <= i - i2 && A0X2 > 0) {
                    AnonymousClass8I5 A012 = C21674AUx.A01(r6.A07, i2, A0X2);
                    r6.A03 += A0X2;
                    return A012;
                } else if (A0X2 != 0) {
                    byte[] A05 = AnonymousClass8I9.A05(r6, A0X2);
                    if (A05 != null) {
                        return C165607th.A0O(A05);
                    }
                    int i3 = r6.A03;
                    int i4 = r6.A00;
                    int i5 = i4 - i3;
                    r6.A04 += i4;
                    r6.A03 = 0;
                    r6.A00 = 0;
                    ArrayList A002 = AnonymousClass8I9.A00(r6, A0X2 - i5);
                    byte[] bArr2 = new byte[A0X2];
                    System.arraycopy(r6.A07, i3, bArr2, 0, i5);
                    Iterator it = A002.iterator();
                    while (it.hasNext()) {
                        byte[] bArr3 = (byte[]) it.next();
                        int length = bArr3.length;
                        System.arraycopy(bArr3, 0, bArr2, i5, length);
                        i5 += length;
                    }
                    return new AnonymousClass8I5(bArr2);
                }
            } else {
                AnonymousClass8I7 r3 = (AnonymousClass8I7) this;
                int A0X3 = r3.A0X();
                if (A0X3 > 0) {
                    int i6 = r3.A02;
                    int i7 = r3.A03;
                    int i8 = i6 - i7;
                    if (A0X3 <= i8) {
                        AnonymousClass8I5 A013 = C21674AUx.A01(r3.A06, i7, A0X3);
                        r3.A03 += A0X3;
                        return A013;
                    } else if (A0X3 <= i8) {
                        int i9 = A0X3 + i7;
                        r3.A03 = i9;
                        return new AnonymousClass8I5(Arrays.copyOfRange(r3.A06, i7, i9));
                    } else {
                        throw C165587tf.A0J();
                    }
                } else if (A0X3 != 0) {
                    throw C165597tg.A0L();
                }
            }
            return C21674AUx.A00;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0P() {
        /*
            r12 = this;
            boolean r0 = r12 instanceof X.AnonymousClass8I8
            if (r0 == 0) goto L_0x003b
            r3 = r12
            X.8I8 r3 = (X.AnonymousClass8I8) r3
            int r4 = r3.A0X()
            if (r4 <= 0) goto L_0x0031
            long r1 = r3.A02
            long r6 = r3.A03
            long r1 = r1 - r6
            int r0 = (int) r1
            if (r4 > r0) goto L_0x002c
            byte[] r5 = new byte[r4]
            long r10 = (long) r4
            r8 = 0
            X.9Yj r4 = com.google.protobuf.UnsafeUtil.A02
            r4.A0I(r5, r6, r8, r10)
            java.nio.charset.Charset r0 = X.AnonymousClass9BD.A04
            java.lang.String r2 = new java.lang.String
            r2.<init>(r5, r0)
            long r0 = r3.A03
            long r0 = r0 + r10
            r3.A03 = r0
            return r2
        L_0x002c:
            X.186 r0 = X.C165587tf.A0J()
            throw r0
        L_0x0031:
            if (r4 != 0) goto L_0x0036
            java.lang.String r2 = ""
            return r2
        L_0x0036:
            X.186 r0 = X.C165597tg.A0L()
            throw r0
        L_0x003b:
            boolean r0 = r12 instanceof X.AnonymousClass8I9
            if (r0 == 0) goto L_0x0082
            r5 = r12
            X.8I9 r5 = (X.AnonymousClass8I9) r5
            int r4 = r5.A0X()
            if (r4 <= 0) goto L_0x005e
            int r0 = r5.A00
            int r2 = r5.A03
            int r0 = r0 - r2
            if (r4 > r0) goto L_0x0063
            byte[] r1 = r5.A07
            java.nio.charset.Charset r0 = X.AnonymousClass9BD.A04
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1, r2, r4, r0)
        L_0x0058:
            int r0 = r5.A03
            int r0 = r0 + r4
            r5.A03 = r0
            return r3
        L_0x005e:
            if (r4 != 0) goto L_0x0063
            java.lang.String r3 = ""
            return r3
        L_0x0063:
            int r0 = r5.A00
            if (r4 > r0) goto L_0x0076
            X.AnonymousClass8I9.A02(r5, r4)
            byte[] r2 = r5.A07
            int r1 = r5.A03
            java.nio.charset.Charset r0 = X.AnonymousClass9BD.A04
            java.lang.String r3 = new java.lang.String
            r3.<init>(r2, r1, r4, r0)
            goto L_0x0058
        L_0x0076:
            byte[] r1 = X.AnonymousClass8I9.A04(r5, r4)
            java.nio.charset.Charset r0 = X.AnonymousClass9BD.A04
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1, r0)
            return r3
        L_0x0082:
            r5 = r12
            X.8I7 r5 = (X.AnonymousClass8I7) r5
            int r4 = r5.A0X()
            if (r4 <= 0) goto L_0x00a6
            int r0 = r5.A02
            int r3 = r5.A03
            int r0 = r0 - r3
            if (r4 > r0) goto L_0x00a1
            byte[] r2 = r5.A06
            java.nio.charset.Charset r0 = X.AnonymousClass9BD.A04
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2, r3, r4, r0)
            int r0 = r5.A03
            int r0 = r0 + r4
            r5.A03 = r0
            return r1
        L_0x00a1:
            X.186 r0 = X.C165587tf.A0J()
            throw r0
        L_0x00a6:
            if (r4 != 0) goto L_0x00ab
            java.lang.String r1 = ""
            return r1
        L_0x00ab:
            X.186 r0 = X.C165597tg.A0L()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200279h2.A0P():java.lang.String");
    }

    public String A0Q() {
        byte[] A04;
        String A002;
        int i;
        long j;
        int i2;
        byte A012;
        byte A013;
        if (this instanceof AnonymousClass8I8) {
            AnonymousClass8I8 r11 = (AnonymousClass8I8) this;
            int A0X = r11.A0X();
            if (A0X > 0) {
                long j2 = r11.A02;
                long j3 = r11.A03;
                if (A0X <= ((int) (j2 - j3))) {
                    int i3 = (int) (j3 - r11.A06);
                    ByteBuffer byteBuffer = r11.A07;
                    C200009gP r2 = C196659aK.A00;
                    if (byteBuffer.hasArray()) {
                        A002 = r2.A03(byteBuffer.array(), byteBuffer.arrayOffset() + i3, A0X);
                    } else if (!byteBuffer.isDirect() || !(r2 instanceof C173598Sh)) {
                        A002 = C200009gP.A00(byteBuffer, i3, A0X);
                    } else if ((i3 | A0X | ((byteBuffer.limit() - i3) - A0X)) >= 0) {
                        AnonymousClass9Yj r9 = UnsafeUtil.A02;
                        long A07 = r9.A07(byteBuffer, UnsafeUtil.A00) + ((long) i3);
                        long j4 = ((long) A0X) + A07;
                        char[] cArr = new char[A0X];
                        int i4 = 0;
                        while (j < j4 && (A013 = r9.A01(j)) >= 0) {
                            A07 = j + 1;
                            cArr[i] = (char) A013;
                            i4 = i + 1;
                        }
                        while (j < j4) {
                            long j5 = j + 1;
                            byte A014 = r9.A01(j);
                            if (A014 >= 0) {
                                int i5 = i + 1;
                                cArr[i] = (char) A014;
                                while (j5 < j4 && (A012 = r9.A01(j5)) >= 0) {
                                    j5++;
                                    cArr[i5] = (char) A012;
                                    i5++;
                                }
                                i = i5;
                                j = j5;
                            } else {
                                if (A014 >= -32) {
                                    if (A014 < -16) {
                                        if (j5 < j4 - 1) {
                                            long j6 = j5 + 1;
                                            byte A015 = r9.A01(j5);
                                            j = j6 + 1;
                                            byte A016 = r9.A01(j6);
                                            i2 = i + 1;
                                            C200379hJ.A01(A014, A015, A016, cArr, i);
                                        }
                                    } else if (j5 < j4 - 2) {
                                        long j7 = j5 + 1;
                                        byte A017 = r9.A01(j5);
                                        long j8 = j7 + 1;
                                        byte A018 = r9.A01(j7);
                                        j = j8 + 1;
                                        C200379hJ.A00(A014, A017, A018, r9.A01(j8), cArr, i);
                                        i = i + 1 + 1;
                                    }
                                    throw C165617ti.A0L("Protocol message had invalid UTF-8.");
                                } else if (j5 < j4) {
                                    j = j5 + 1;
                                    i2 = i + 1;
                                    C200379hJ.A02(A014, r9.A01(j5), cArr, i);
                                } else {
                                    throw C165617ti.A0L("Protocol message had invalid UTF-8.");
                                }
                                i = i2;
                            }
                        }
                        A002 = new String(cArr, 0, i);
                    } else {
                        Object[] A1Q = C36441kJ.A1Q();
                        C36331k8.A1X(A1Q, byteBuffer.limit(), 0, i3, 1);
                        AnonymousClass000.A1L(A1Q, A0X, 2);
                        throw C165597tg.A0Z("buffer limit=%d, index=%d, limit=%d", A1Q);
                    }
                    r11.A03 += (long) A0X;
                    return A002;
                }
                throw C165587tf.A0J();
            } else if (A0X == 0) {
                return "";
            } else {
                throw C165597tg.A0L();
            }
        } else if (this instanceof AnonymousClass8I9) {
            AnonymousClass8I9 r112 = (AnonymousClass8I9) this;
            int A0X2 = r112.A0X();
            int i6 = r112.A03;
            int i7 = r112.A00;
            if (A0X2 <= i7 - i6 && A0X2 > 0) {
                A04 = r112.A07;
                r112.A03 = i6 + A0X2;
            } else if (A0X2 == 0) {
                return "";
            } else {
                if (A0X2 <= i7) {
                    AnonymousClass8I9.A02(r112, A0X2);
                    A04 = r112.A07;
                    r112.A03 = A0X2;
                } else {
                    A04 = AnonymousClass8I9.A04(r112, A0X2);
                }
                i6 = 0;
            }
            return C196659aK.A00.A03(A04, i6, A0X2);
        } else {
            AnonymousClass8I7 r113 = (AnonymousClass8I7) this;
            int A0X3 = r113.A0X();
            if (A0X3 > 0) {
                int i8 = r113.A02;
                int i9 = r113.A03;
                if (A0X3 <= i8 - i9) {
                    String A03 = C196659aK.A00.A03(r113.A06, i9, A0X3);
                    r113.A03 += A0X3;
                    return A03;
                }
                throw C165587tf.A0J();
            } else if (A0X3 == 0) {
                return "";
            } else {
                throw C165597tg.A0L();
            }
        }
    }

    public void A0R(int i) {
        if (this instanceof AnonymousClass8I8) {
            if (((AnonymousClass8I8) this).A01 != i) {
                throw C165617ti.A0L("Protocol message end-group tag did not match expected tag.");
            }
        } else if (this instanceof AnonymousClass8I9) {
            if (((AnonymousClass8I9) this).A02 != i) {
                throw C165617ti.A0L("Protocol message end-group tag did not match expected tag.");
            }
        } else if (((AnonymousClass8I7) this).A01 != i) {
            throw C165617ti.A0L("Protocol message end-group tag did not match expected tag.");
        }
    }

    public void A0S(int i) {
        if (this instanceof AnonymousClass8I8) {
            AnonymousClass8I8 r0 = (AnonymousClass8I8) this;
            r0.A00 = i;
            AnonymousClass8I8.A00(r0);
        } else if (this instanceof AnonymousClass8I9) {
            AnonymousClass8I9 r02 = (AnonymousClass8I9) this;
            r02.A01 = i;
            AnonymousClass8I9.A01(r02);
        } else {
            AnonymousClass8I7 r03 = (AnonymousClass8I7) this;
            r03.A00 = i;
            AnonymousClass8I7.A00(r03);
        }
    }

    public boolean A0T() {
        if (this instanceof AnonymousClass8I8) {
            AnonymousClass8I8 r0 = (AnonymousClass8I8) this;
            return AnonymousClass000.A1Q((r0.A03 > r0.A02 ? 1 : (r0.A03 == r0.A02 ? 0 : -1)));
        } else if (this instanceof AnonymousClass8I9) {
            AnonymousClass8I9 r3 = (AnonymousClass8I9) this;
            if (r3.A03 != r3.A00 || AnonymousClass8I9.A03(r3, 1)) {
                return false;
            }
            return true;
        } else {
            AnonymousClass8I7 r02 = (AnonymousClass8I7) this;
            return AnonymousClass000.A1S(r02.A03, r02.A02);
        }
    }

    public boolean A0U() {
        if (this instanceof AnonymousClass8I8) {
            return AnonymousClass000.A1P((((AnonymousClass8I8) this).A0a() > 0 ? 1 : (((AnonymousClass8I8) this).A0a() == 0 ? 0 : -1)));
        }
        if (this instanceof AnonymousClass8I9) {
            return AnonymousClass000.A1P((((AnonymousClass8I9) this).A0a() > 0 ? 1 : (((AnonymousClass8I9) this).A0a() == 0 ? 0 : -1)));
        }
        return AnonymousClass000.A1P((((AnonymousClass8I7) this).A0a() > 0 ? 1 : (((AnonymousClass8I7) this).A0a() == 0 ? 0 : -1)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0179  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0V(int r10) {
        /*
            r9 = this;
            boolean r0 = r9 instanceof X.AnonymousClass8I8
            if (r0 == 0) goto L_0x0098
            r8 = r9
            X.8I8 r8 = (X.AnonymousClass8I8) r8
            r1 = r10 & 7
            r0 = 1
            if (r1 == 0) goto L_0x004d
            if (r1 == r0) goto L_0x0038
            r0 = 2
            if (r1 == r0) goto L_0x002d
            r0 = 3
            r5 = 4
            if (r1 == r0) goto L_0x01b7
            if (r1 == r5) goto L_0x0161
            r0 = 5
            if (r1 != r0) goto L_0x0027
            long r1 = r8.A02
            long r3 = r8.A03
            long r1 = r1 - r3
            int r0 = (int) r1
            if (r5 <= r0) goto L_0x0047
            X.186 r0 = X.C165587tf.A0J()
            throw r0
        L_0x0027:
            X.8SZ r0 = new X.8SZ
            r0.<init>()
            throw r0
        L_0x002d:
            int r5 = r8.A0X()
            if (r5 >= 0) goto L_0x003a
            X.186 r0 = X.C165597tg.A0L()
            throw r0
        L_0x0038:
            r5 = 8
        L_0x003a:
            long r1 = r8.A02
            long r3 = r8.A03
            long r1 = r1 - r3
            int r0 = (int) r1
            if (r5 <= r0) goto L_0x0047
            X.186 r0 = X.C165587tf.A0J()
            throw r0
        L_0x0047:
            long r0 = (long) r5
            long r3 = r3 + r0
            r8.A03 = r3
            goto L_0x01cc
        L_0x004d:
            long r2 = r8.A02
            long r0 = r8.A03
            long r2 = r2 - r0
            int r0 = (int) r2
            r7 = 10
            if (r0 < r7) goto L_0x0072
            r5 = 0
        L_0x0058:
            long r1 = r8.A03
            r3 = 1
            long r3 = r3 + r1
            r8.A03 = r3
            X.9Yj r0 = com.google.protobuf.UnsafeUtil.A02
            byte r0 = r0.A01(r1)
            if (r0 >= 0) goto L_0x01cc
            int r5 = r5 + 1
            if (r5 < r7) goto L_0x0058
            java.lang.String r0 = "CodedInputStream encountered a malformed varint."
            X.186 r0 = X.C165617ti.A0L(r0)
            throw r0
        L_0x0072:
            r6 = 0
        L_0x0073:
            long r2 = r8.A03
            long r4 = r8.A02
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0093
            r0 = 1
            long r0 = r0 + r2
            r8.A03 = r0
            X.9Yj r0 = com.google.protobuf.UnsafeUtil.A02
            byte r0 = r0.A01(r2)
            if (r0 >= 0) goto L_0x01cc
            int r6 = r6 + 1
            if (r6 < r7) goto L_0x0073
            java.lang.String r0 = "CodedInputStream encountered a malformed varint."
            X.186 r0 = X.C165617ti.A0L(r0)
            throw r0
        L_0x0093:
            X.186 r0 = X.C165587tf.A0J()
            throw r0
        L_0x0098:
            boolean r0 = r9 instanceof X.AnonymousClass8I9
            if (r0 == 0) goto L_0x011d
            r5 = r9
            X.8I9 r5 = (X.AnonymousClass8I9) r5
            r2 = r10 & 7
            r6 = 1
            if (r2 == 0) goto L_0x00df
            r0 = 8
            if (r2 == r6) goto L_0x00da
            r0 = 2
            if (r2 == r0) goto L_0x00d6
            r0 = 3
            r1 = 4
            if (r2 == r0) goto L_0x00bf
            if (r2 == r1) goto L_0x0161
            r0 = 5
            if (r2 != r0) goto L_0x00b9
            r5.A0b(r1)
            goto L_0x01cc
        L_0x00b9:
            X.8SZ r0 = new X.8SZ
            r0.<init>()
            throw r0
        L_0x00bf:
            int r0 = r5.A0G()
            if (r0 == 0) goto L_0x00cb
            boolean r0 = r5.A0V(r0)
            if (r0 != 0) goto L_0x00bf
        L_0x00cb:
            int r0 = r10 >>> 3
            int r0 = r0 << 3
            r0 = r0 | 4
            r5.A0R(r0)
            goto L_0x01cc
        L_0x00d6:
            int r0 = r5.A0X()
        L_0x00da:
            r5.A0b(r0)
            goto L_0x01cc
        L_0x00df:
            int r0 = r5.A00
            int r4 = r5.A03
            int r0 = r0 - r4
            r3 = 10
            r2 = 0
            if (r0 < r3) goto L_0x00ff
        L_0x00e9:
            byte[] r1 = r5.A07
            r0 = r4
            int r4 = r4 + 1
            r5.A03 = r4
            byte r0 = r1[r0]
            if (r0 >= 0) goto L_0x01cc
            int r2 = r2 + 1
            if (r2 < r3) goto L_0x00e9
            java.lang.String r0 = "CodedInputStream encountered a malformed varint."
            X.186 r0 = X.C165617ti.A0L(r0)
            throw r0
        L_0x00ff:
            int r0 = r5.A00
            if (r4 != r0) goto L_0x0106
            X.AnonymousClass8I9.A02(r5, r6)
        L_0x0106:
            byte[] r1 = r5.A07
            int r0 = r5.A03
            int r4 = r0 + 1
            r5.A03 = r4
            byte r0 = r1[r0]
            if (r0 >= 0) goto L_0x01cc
            int r2 = r2 + 1
            if (r2 < r3) goto L_0x00ff
            java.lang.String r0 = "CodedInputStream encountered a malformed varint."
            X.186 r0 = X.C165617ti.A0L(r0)
            throw r0
        L_0x011d:
            r6 = r9
            X.8I7 r6 = (X.AnonymousClass8I7) r6
            r1 = r10 & 7
            r0 = 1
            if (r1 == 0) goto L_0x017e
            if (r1 == r0) goto L_0x014b
            r0 = 2
            if (r1 == r0) goto L_0x0140
            r0 = 3
            r2 = 4
            if (r1 == r0) goto L_0x0163
            if (r1 == r2) goto L_0x0161
            r0 = 5
            if (r1 != r0) goto L_0x015b
            int r1 = r6.A02
            int r0 = r6.A03
            int r1 = r1 - r0
            if (r2 > r1) goto L_0x0156
            int r0 = r0 + 4
        L_0x013c:
            r6.A03 = r0
            goto L_0x01cc
        L_0x0140:
            int r2 = r6.A0X()
            if (r2 >= 0) goto L_0x014d
            X.186 r0 = X.C165597tg.A0L()
            throw r0
        L_0x014b:
            r2 = 8
        L_0x014d:
            int r1 = r6.A02
            int r0 = r6.A03
            int r1 = r1 - r0
            if (r2 > r1) goto L_0x0179
            int r0 = r0 + r2
            goto L_0x013c
        L_0x0156:
            X.186 r0 = X.C165587tf.A0J()
            throw r0
        L_0x015b:
            X.8SZ r0 = new X.8SZ
            r0.<init>()
            throw r0
        L_0x0161:
            r0 = 0
            return r0
        L_0x0163:
            int r0 = r6.A0G()
            if (r0 == 0) goto L_0x016f
            boolean r0 = r6.A0V(r0)
            if (r0 != 0) goto L_0x0163
        L_0x016f:
            int r0 = r10 >>> 3
            int r0 = r0 << 3
            r0 = r0 | 4
            r6.A0R(r0)
            goto L_0x01cc
        L_0x0179:
            X.186 r0 = X.C165587tf.A0J()
            throw r0
        L_0x017e:
            int r5 = r6.A02
            int r4 = r6.A03
            int r0 = r5 - r4
            r3 = 10
            r2 = 0
            if (r0 < r3) goto L_0x019f
        L_0x0189:
            byte[] r1 = r6.A06
            r0 = r4
            int r4 = r4 + 1
            r6.A03 = r4
            byte r0 = r1[r0]
            if (r0 >= 0) goto L_0x01cc
            int r2 = r2 + 1
            if (r2 < r3) goto L_0x0189
            java.lang.String r0 = "CodedInputStream encountered a malformed varint."
            X.186 r0 = X.C165617ti.A0L(r0)
            throw r0
        L_0x019f:
            r1 = r4
            if (r4 == r5) goto L_0x01ce
            byte[] r0 = r6.A06
            int r4 = r4 + 1
            r6.A03 = r4
            byte r0 = r0[r1]
            if (r0 >= 0) goto L_0x01cc
            int r2 = r2 + 1
            if (r2 < r3) goto L_0x019f
            java.lang.String r0 = "CodedInputStream encountered a malformed varint."
            X.186 r0 = X.C165617ti.A0L(r0)
            throw r0
        L_0x01b7:
            int r0 = r8.A0G()
            if (r0 == 0) goto L_0x01c3
            boolean r0 = r8.A0V(r0)
            if (r0 != 0) goto L_0x01b7
        L_0x01c3:
            int r0 = r10 >>> 3
            int r0 = r0 << 3
            r0 = r0 | 4
            r8.A0R(r0)
        L_0x01cc:
            r0 = 1
            return r0
        L_0x01ce:
            X.186 r0 = X.C165587tf.A0J()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200279h2.A0V(int):boolean");
    }
}
