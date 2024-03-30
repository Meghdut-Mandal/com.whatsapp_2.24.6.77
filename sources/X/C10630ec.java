package X;

import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;

/* renamed from: X.0ec  reason: invalid class name and case insensitive filesystem */
public final class C10630ec implements C17320r6 {
    public static final Unsafe A0E = AnonymousClass0Z6.A00();
    public static final int[] A0F = new int[0];
    public final int A00;
    public final int A01;
    public final int[] A02;
    public final int A03;
    public final int A04;
    public final AnonymousClass0QS A05;
    public final AnonymousClass0X1 A06;
    public final AnonymousClass0QT A07;
    public final C17630rj A08;
    public final AnonymousClass0QU A09;
    public final AnonymousClass0QW A0A;
    public final boolean A0B;
    public final int[] A0C;
    public final Object[] A0D;

    public C10630ec(AnonymousClass0QS r1, AnonymousClass0X1 r2, AnonymousClass0QT r3, C17630rj r4, AnonymousClass0QU r5, AnonymousClass0QW r6, int[] iArr, int[] iArr2, Object[] objArr, int i, int i2, int i3, int i4, boolean z) {
        this.A02 = iArr;
        this.A0D = objArr;
        this.A00 = i;
        this.A01 = i2;
        this.A0B = z;
        this.A0C = iArr2;
        this.A03 = i3;
        this.A04 = i4;
        this.A09 = r5;
        this.A06 = r2;
        this.A0A = r6;
        this.A05 = r1;
        this.A08 = r4;
        this.A07 = r3;
    }

    private final int A00(int i) {
        if (i >= this.A00 && i <= this.A01) {
            int i2 = 0;
            int[] iArr = this.A02;
            int length = (iArr.length / 3) - 1;
            while (i2 <= length) {
                int i3 = (length + i2) >>> 1;
                int i4 = i3 * 3;
                int i5 = iArr[i4];
                if (i == i5) {
                    return i4;
                }
                if (i < i5) {
                    length = i3 - 1;
                } else {
                    i2 = i3 + 1;
                }
            }
        }
        return -1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r5 >= 0) goto L_0x0010;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01(X.C07050Wd r6, X.C17320r6 r7, byte[] r8, int r9, int r10) {
        /*
            int r4 = r9 + 1
            r3 = r8
            byte r5 = r8[r9]
            r1 = r6
            if (r5 >= 0) goto L_0x0010
            int r4 = A0A(r6, r8, r5, r4)
            int r5 = r6.A00
            if (r5 < 0) goto L_0x0022
        L_0x0010:
            int r10 = r10 - r4
            if (r5 > r10) goto L_0x0022
            r0 = r7
            java.lang.Object r2 = r7.Byh()
            int r5 = r5 + r4
            r0.Byr(r1, r2, r3, r4, r5)
            r7.Byo(r2)
            r6.A02 = r2
            return r5
        L_0x0022:
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.0Na r0 = new X.0Na
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10630ec.A01(X.0Wd, X.0r6, byte[], int, int):int");
    }

    public static int A07(C07050Wd r14, byte[] bArr, int i) {
        int i2;
        int i3;
        byte b;
        int A082 = A08(r14, bArr, i);
        int i4 = r14.A00;
        if (i4 < 0) {
            throw new C05050Na("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else if (i4 == 0) {
            r14.A02 = "";
            return A082;
        } else {
            int i5 = A082;
            C06310Tc r0 = AnonymousClass0RO.A00;
            int length = bArr.length;
            if ((A082 | i4 | ((length - A082) - i4)) >= 0) {
                int i6 = A082 + i4;
                char[] cArr = new char[i4];
                int i7 = 0;
                while (i2 < i6) {
                    byte b2 = bArr[i2];
                    if (b2 < 0) {
                        break;
                    }
                    i5 = i2 + 1;
                    cArr[i3] = (char) b2;
                    i7 = i3 + 1;
                }
                while (i2 < i6) {
                    int i8 = i2 + 1;
                    byte b3 = bArr[i2];
                    if (b3 >= 0) {
                        int i9 = i3 + 1;
                        cArr[i3] = (char) b3;
                        i2 = i8;
                        while (true) {
                            i3 = i9;
                            if (i2 >= i6 || (b = bArr[i2]) < 0) {
                                break;
                            }
                            i2++;
                            i9++;
                            cArr[i3] = (char) b;
                        }
                    } else {
                        if (b3 < -32) {
                            if (i8 < i6) {
                                i2 = i8 + 1;
                                int i10 = i3 + 1;
                                byte b4 = bArr[i8];
                                if (b3 < -62 || b4 > -65) {
                                    throw new C05050Na("Protocol message had invalid UTF-8.");
                                }
                                cArr[i3] = (char) (((b3 & 31) << 6) | (b4 & 63));
                                i3 = i10;
                            }
                        } else if (b3 < -16) {
                            if (i8 < i6 - 1) {
                                int i11 = i8 + 1;
                                i2 = i11 + 1;
                                int i12 = i3 + 1;
                                byte b5 = bArr[i8];
                                byte b6 = bArr[i11];
                                if (b5 <= -65) {
                                    if (b3 == -32) {
                                        if (b5 >= -96) {
                                            b3 = -32;
                                        }
                                    } else if (b3 == -19) {
                                        if (b5 < -96) {
                                            b3 = -19;
                                        }
                                    }
                                    if (b6 <= -65) {
                                        cArr[i3] = (char) (((b3 & 15) << 12) | ((b5 & 63) << 6) | (b6 & 63));
                                        i3 = i12;
                                    }
                                }
                                throw new C05050Na("Protocol message had invalid UTF-8.");
                            }
                        } else if (i8 < i6 - 2) {
                            int i13 = i8 + 1;
                            int i14 = i13 + 1;
                            i2 = i14 + 1;
                            byte b7 = bArr[i8];
                            byte b8 = bArr[i13];
                            byte b9 = bArr[i14];
                            if (b7 > -65 || (((b3 << 28) + (b7 + 112)) >> 30) != 0 || b8 > -65 || b9 > -65) {
                                throw new C05050Na("Protocol message had invalid UTF-8.");
                            }
                            byte b10 = ((b3 & 7) << 18) | ((b7 & 63) << 12) | ((b8 & 63) << 6) | (b9 & 63);
                            cArr[i3] = (char) ((b10 >>> 10) + 55232);
                            cArr[i3 + 1] = (char) ((b10 & 1023) + 56320);
                            i3 += 2;
                        }
                        throw new C05050Na("Protocol message had invalid UTF-8.");
                    }
                }
                r14.A02 = new String(cArr, 0, i3);
                return A082 + i4;
            }
            Object[] objArr = new Object[3];
            AnonymousClass000.A1L(objArr, length, 0);
            AnonymousClass000.A1K(objArr, A082);
            objArr[2] = Integer.valueOf(i4);
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", objArr));
        }
    }

    public static int A08(C07050Wd r2, byte[] bArr, int i) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return A0A(r2, bArr, b, i2);
        }
        r2.A00 = b;
        return i2;
    }

    public static int A09(C07050Wd r8, byte[] bArr, int i) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            r8.A01 = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            b = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b & Byte.MAX_VALUE)) << i4;
            i3++;
        }
        r8.A01 = j2;
        return i3;
    }

    public static int A0A(C07050Wd r4, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = i & 127;
        int i7 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            i5 = b << 7;
        } else {
            int i8 = i6 | ((b & Byte.MAX_VALUE) << 7);
            int i9 = i7 + 1;
            byte b2 = bArr[i7];
            if (b2 >= 0) {
                i4 = b2 << 14;
            } else {
                i6 = i8 | ((b2 & Byte.MAX_VALUE) << 14);
                i7 = i9 + 1;
                byte b3 = bArr[i9];
                if (b3 >= 0) {
                    i5 = b3 << 21;
                } else {
                    i8 = i6 | ((b3 & Byte.MAX_VALUE) << 21);
                    i9 = i7 + 1;
                    byte b4 = bArr[i7];
                    if (b4 >= 0) {
                        i4 = b4 << 28;
                    } else {
                        i3 = i8 | ((b4 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            i7 = i9 + 1;
                            if (bArr[i9] >= 0) {
                                break;
                            }
                            i9 = i7;
                        }
                        r4.A00 = i3;
                        return i7;
                    }
                }
            }
            r4.A00 = i8 | i4;
            return i9;
        }
        i3 = i6 | i5;
        r4.A00 = i3;
        return i7;
    }

    public static int A0B(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static long A0C(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    private final C17320r6 A0E(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.A0D;
        C17320r6 r0 = (C17320r6) objArr[i3];
        if (r0 != null) {
            return r0;
        }
        C17320r6 A002 = C07150Wn.A02.A00((Class) objArr[i3 + 1]);
        objArr[i3] = A002;
        return A002;
    }

    public static NullPointerException A0F() {
        return new NullPointerException("zze");
    }

    private final boolean A0H(Object obj, int i) {
        int[] iArr = this.A02;
        int i2 = iArr[i + 2];
        long j = (long) (i2 & 1048575);
        if (j == 1048575) {
            int i3 = iArr[i + 1];
            long j2 = (long) (i3 & 1048575);
            switch ((i3 >>> 20) & 255) {
                case 0:
                    if (Double.doubleToRawLongBits(Double.longBitsToDouble(AnonymousClass0Z6.A00.A01(obj, j2))) != 0) {
                        return true;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(Float.intBitsToFloat(AnonymousClass0Z6.A00.A00(obj, j2))) != 0) {
                        return true;
                    }
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    if (AnonymousClass0Z6.A00.A01(obj, j2) != 0) {
                        return true;
                    }
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    if (AnonymousClass0Z6.A00.A00(obj, j2) != 0) {
                        return true;
                    }
                    break;
                case 7:
                    return AnonymousClass0Z6.A07(obj, j2);
                case 8:
                    Object A022 = AnonymousClass0Z6.A00.A02(obj, j2);
                    if (A022 instanceof String) {
                        if (!((String) A022).isEmpty()) {
                            return true;
                        }
                    } else if (!(A022 instanceof C10960fV)) {
                        throw new IllegalArgumentException();
                    } else if (!C10960fV.A00.equals(A022)) {
                        return true;
                    }
                    break;
                case 9:
                case 17:
                    if (AnonymousClass0Z6.A00.A02(obj, j2) != null) {
                        return true;
                    }
                    break;
                case 10:
                    if (!C10960fV.A00.equals(AnonymousClass0Z6.A00.A02(obj, j2))) {
                        return true;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if ((AnonymousClass0Z6.A00.A00(obj, j) & (1 << (i2 >>> 20))) != 0) {
            return true;
        }
        return false;
    }

    private final boolean A0I(Object obj, int i, int i2) {
        return AnonymousClass000.A1S(AnonymousClass0Z6.A00.A00(obj, (long) (this.A02[i2 + 2] & 1048575)), i);
    }

    public final Object Byh() {
        return new AnonymousClass0M7();
    }

    public final void Byo(Object obj) {
        int i = this.A03;
        while (true) {
            int i2 = this.A04;
            if (i < i2) {
                int i3 = this.A0C[i];
                if (AnonymousClass0Z6.A00.A02(obj, (long) (this.A02[i3 + 1] & 1048575)) != null) {
                    throw AnonymousClass001.A0A("zzc");
                }
                i++;
            } else {
                int[] iArr = this.A0C;
                int length = iArr.length;
                while (i2 < length) {
                    this.A06.A00(obj, (long) iArr[i2]);
                    i2++;
                }
                ((AnonymousClass0M8) obj).zzc.A01 = false;
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0116, code lost:
        r11 = r7 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0123, code lost:
        r11 = r7 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0178, code lost:
        r0 = r6.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x017a, code lost:
        r10.putObject(r5, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0195, code lost:
        r10.putInt(r5, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01a9, code lost:
        r10.putLong(r5, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b4, code lost:
        r19 = r19 | r17;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Byr(X.C07050Wd r37, java.lang.Object r38, byte[] r39, int r40, int r41) {
        /*
            r36 = this;
            r11 = r40
            r34 = r36
            r0 = r34
            boolean r0 = r0.A0B
            r6 = r37
            r5 = r38
            r4 = r39
            r35 = r41
            if (r0 == 0) goto L_0x026e
            sun.misc.Unsafe r10 = A0E
            r3 = -1
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = -1
            r9 = 0
            r19 = 0
            r16 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001f:
            r0 = r35
            if (r11 >= r0) goto L_0x0258
            int r7 = r11 + 1
            byte r13 = r39[r11]
            if (r13 >= 0) goto L_0x002f
            int r7 = A0A(r6, r4, r13, r7)
            int r13 = r6.A00
        L_0x002f:
            int r18 = r13 >>> 3
            r12 = r13 & 7
            r0 = r18
            if (r0 <= r2) goto L_0x0068
            int r2 = r9 / 3
            r0 = r34
            int r8 = r0.A00
            r0 = r18
            if (r0 < r8) goto L_0x0255
            r0 = r34
            int r8 = r0.A01
            r0 = r18
            if (r0 > r8) goto L_0x0255
            r0 = r34
            int[] r14 = r0.A02
            int r0 = r14.length
            int r0 = r0 / 3
            int r11 = r0 + -1
        L_0x0052:
            if (r2 > r11) goto L_0x0255
            int r0 = r11 + r2
            int r15 = r0 >>> 1
            int r9 = r15 * 3
            r8 = r14[r9]
            r0 = r18
            if (r0 == r8) goto L_0x006e
            if (r0 >= r8) goto L_0x0065
            int r11 = r15 + -1
            goto L_0x0052
        L_0x0065:
            int r2 = r15 + 1
            goto L_0x0052
        L_0x0068:
            r2 = r34
            int r9 = r2.A00(r0)
        L_0x006e:
            if (r9 == r3) goto L_0x0255
            r0 = r34
            int[] r8 = r0.A02
            int r0 = r9 + 1
            r11 = r8[r0]
            int r0 = r11 >>> 20
            r14 = r0 & 255(0xff, float:3.57E-43)
            r0 = r11 & r1
            long r2 = (long) r0
            r0 = 17
            if (r14 > r0) goto L_0x01b8
            int r0 = r9 + 2
            r8 = r8[r0]
            int r0 = r8 >>> 20
            r17 = 1
            int r17 = r17 << r0
            r8 = r8 & r1
            r0 = r16
            if (r8 == r0) goto L_0x00a8
            if (r0 == r1) goto L_0x009b
            long r15 = (long) r0
            r0 = r15
            r15 = r19
            r10.putInt(r5, r0, r15)
        L_0x009b:
            r0 = 1048575(0xfffff, float:1.469367E-39)
            if (r8 == r0) goto L_0x00a6
            long r15 = (long) r8
            r0 = r15
            int r19 = r10.getInt(r5, r0)
        L_0x00a6:
            r16 = r8
        L_0x00a8:
            r0 = 5
            switch(r14) {
                case 0: goto L_0x00d3;
                case 1: goto L_0x00ec;
                case 2: goto L_0x0100;
                case 3: goto L_0x0100;
                case 4: goto L_0x017e;
                case 5: goto L_0x010a;
                case 6: goto L_0x011a;
                case 7: goto L_0x0127;
                case 8: goto L_0x0143;
                case 9: goto L_0x0155;
                case 10: goto L_0x0171;
                case 11: goto L_0x017e;
                case 12: goto L_0x017e;
                case 13: goto L_0x011a;
                case 14: goto L_0x010a;
                case 15: goto L_0x0187;
                case 16: goto L_0x0199;
                default: goto L_0x00ac;
            }
        L_0x00ac:
            r2 = r5
            X.0M8 r2 = (X.AnonymousClass0M8) r2
            X.0YB r1 = r2.zzc
            X.0YB r0 = X.AnonymousClass0YB.A04
            if (r1 != r0) goto L_0x00bb
            X.0YB r1 = X.AnonymousClass0YB.A00()
            r2.zzc = r1
        L_0x00bb:
            r20 = r6
            r21 = r1
            r22 = r4
            r23 = r13
            r24 = r7
            r25 = r35
            int r11 = A02(r20, r21, r22, r23, r24, r25)
        L_0x00cb:
            r2 = r18
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r3 = -1
            goto L_0x001f
        L_0x00d3:
            r0 = 1
            if (r12 != r0) goto L_0x00ac
            long r0 = A0C(r4, r7)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            X.0V5 r20 = X.AnonymousClass0Z6.A00
            long r24 = java.lang.Double.doubleToLongBits(r0)
            r21 = r5
            r22 = r2
            r20.A06(r21, r22, r24)
            goto L_0x0116
        L_0x00ec:
            if (r12 != r0) goto L_0x00ac
            int r0 = A0B(r4, r7)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            X.0V5 r1 = X.AnonymousClass0Z6.A00
            int r0 = java.lang.Float.floatToIntBits(r0)
            r1.A05(r5, r2, r0)
            goto L_0x0123
        L_0x0100:
            if (r12 != 0) goto L_0x00ac
            int r11 = A09(r6, r4, r7)
            long r0 = r6.A01
            goto L_0x01a9
        L_0x010a:
            r0 = 1
            if (r12 != r0) goto L_0x00ac
            long r14 = A0C(r4, r7)
            r11 = r5
            r12 = r2
            r10.putLong(r11, r12, r14)
        L_0x0116:
            int r11 = r7 + 8
            goto L_0x01b4
        L_0x011a:
            if (r12 != r0) goto L_0x00ac
            int r0 = A0B(r4, r7)
            r10.putInt(r5, r2, r0)
        L_0x0123:
            int r11 = r7 + 4
            goto L_0x01b4
        L_0x0127:
            if (r12 != 0) goto L_0x00ac
            int r11 = A09(r6, r4, r7)
            long r0 = r6.A01
            r12 = 0
            int r7 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r7)
            boolean r0 = X.AnonymousClass0Z6.A01
            if (r0 == 0) goto L_0x013f
            X.AnonymousClass0Z6.A03(r5, r2, r1)
            goto L_0x01b4
        L_0x013f:
            X.AnonymousClass0Z6.A04(r5, r2, r1)
            goto L_0x01b4
        L_0x0143:
            r0 = 2
            if (r12 != r0) goto L_0x00ac
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r11 = r11 & r0
            if (r11 != 0) goto L_0x0150
            int r11 = A06(r6, r4, r7)
            goto L_0x0178
        L_0x0150:
            int r11 = A07(r6, r4, r7)
            goto L_0x0178
        L_0x0155:
            r0 = 2
            if (r12 != r0) goto L_0x00ac
            r0 = r34
            X.0r6 r1 = r0.A0E(r9)
            r0 = r35
            int r11 = A01(r6, r1, r4, r7, r0)
            java.lang.Object r1 = r10.getObject(r5, r2)
            if (r1 == 0) goto L_0x0178
            java.lang.Object r0 = r6.A02
            X.0M8 r0 = X.AnonymousClass0WB.A00(r1, r0)
            goto L_0x017a
        L_0x0171:
            r0 = 2
            if (r12 != r0) goto L_0x00ac
            int r11 = A05(r6, r4, r7)
        L_0x0178:
            java.lang.Object r0 = r6.A02
        L_0x017a:
            r10.putObject(r5, r2, r0)
            goto L_0x01b4
        L_0x017e:
            if (r12 != 0) goto L_0x00ac
            int r11 = A08(r6, r4, r7)
            int r0 = r6.A00
            goto L_0x0195
        L_0x0187:
            if (r12 != 0) goto L_0x00ac
            int r11 = A08(r6, r4, r7)
            int r0 = r6.A00
            int r1 = r0 >>> 1
            r0 = r0 & 1
            int r0 = -r0
            r0 = r0 ^ r1
        L_0x0195:
            r10.putInt(r5, r2, r0)
            goto L_0x01b4
        L_0x0199:
            if (r12 != 0) goto L_0x00ac
            int r11 = A09(r6, r4, r7)
            long r7 = r6.A01
            r0 = 1
            long r12 = r7 >>> r0
            r0 = 1
            long r7 = r7 & r0
            long r0 = -r7
            long r0 = r0 ^ r12
        L_0x01a9:
            r20 = r10
            r21 = r5
            r22 = r2
            r24 = r0
            r20.putLong(r21, r22, r24)
        L_0x01b4:
            r19 = r19 | r17
            goto L_0x00cb
        L_0x01b8:
            r0 = 27
            if (r14 != r0) goto L_0x0201
            r0 = 2
            if (r12 != r0) goto L_0x00ac
            java.lang.Object r1 = r10.getObject(r5, r2)
            X.0sA r1 = (X.C17850sA) r1
            r0 = r1
            X.0jh r0 = (X.C13330jh) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x01dd
            int r8 = r1.size()
            int r0 = r8 + r8
            if (r8 != 0) goto L_0x01d6
            r0 = 10
        L_0x01d6:
            X.0sA r1 = r1.Byg(r0)
            r10.putObject(r5, r2, r1)
        L_0x01dd:
            r0 = r34
            X.0r6 r3 = r0.A0E(r9)
            r0 = r35
            int r11 = A01(r6, r3, r4, r7, r0)
        L_0x01e9:
            java.lang.Object r0 = r6.A02
            r1.add(r0)
            r0 = r35
            if (r11 >= r0) goto L_0x00cb
            int r2 = A08(r6, r4, r11)
            int r0 = r6.A00
            if (r13 != r0) goto L_0x00cb
            r0 = r35
            int r11 = A01(r6, r3, r4, r2, r0)
            goto L_0x01e9
        L_0x0201:
            r0 = 49
            if (r14 > r0) goto L_0x0227
            long r0 = (long) r11
            r27 = r12
            r28 = r9
            r29 = r14
            r30 = r0
            r32 = r2
            r20 = r34
            r21 = r6
            r22 = r5
            r23 = r4
            r24 = r7
            r25 = r35
            r26 = r13
            int r11 = r20.A04(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r32)
        L_0x0222:
            if (r11 != r7) goto L_0x00cb
            r7 = r11
            goto L_0x00ac
        L_0x0227:
            r0 = 50
            if (r14 != r0) goto L_0x0236
            r0 = 2
            if (r12 != r0) goto L_0x00ac
            r10.getObject(r5, r2)
            java.lang.NullPointerException r1 = A0F()
            throw r1
        L_0x0236:
            r27 = r18
            r28 = r12
            r29 = r11
            r30 = r14
            r31 = r9
            r32 = r2
            r20 = r34
            r21 = r6
            r22 = r5
            r23 = r4
            r24 = r7
            r25 = r35
            r26 = r13
            int r11 = r20.A03(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            goto L_0x0222
        L_0x0255:
            r9 = 0
            goto L_0x00ac
        L_0x0258:
            r0 = r16
            if (r0 == r1) goto L_0x0262
            long r1 = (long) r0
            r0 = r19
            r10.putInt(r5, r1, r0)
        L_0x0262:
            r0 = r35
            if (r11 == r0) goto L_0x0279
            java.lang.String r0 = "Failed to parse the message."
            X.0Na r1 = new X.0Na
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x026e:
            r7 = 0
            r1 = r34
            r2 = r6
            r3 = r5
            r5 = r11
            r6 = r35
            r1.A0J(r2, r3, r4, r5, r6, r7)
        L_0x0279:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10630ec.Byr(X.0Wd, java.lang.Object, byte[], int, int):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008f, code lost:
        if (r7 != r1) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b9, code lost:
        if (r3 != r0) goto L_0x00ef;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Byt(java.lang.Object r12, java.lang.Object r13) {
        /*
            r11 = this;
            int[] r6 = r11.A02
            int r5 = r6.length
            r10 = 0
            r4 = 0
        L_0x0005:
            if (r4 >= r5) goto L_0x00df
            int r0 = r4 + 1
            r2 = r6[r0]
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r2 & r3
            long r0 = (long) r0
            int r2 = r2 >>> 20
            r2 = r2 & 255(0xff, float:3.57E-43)
            switch(r2) {
                case 0: goto L_0x002f;
                case 1: goto L_0x0054;
                case 2: goto L_0x0079;
                case 3: goto L_0x0079;
                case 4: goto L_0x0092;
                case 5: goto L_0x0079;
                case 6: goto L_0x0092;
                case 7: goto L_0x00a7;
                case 8: goto L_0x00bd;
                case 9: goto L_0x00bd;
                case 10: goto L_0x00bd;
                case 11: goto L_0x0092;
                case 12: goto L_0x0092;
                case 13: goto L_0x0092;
                case 14: goto L_0x0079;
                case 15: goto L_0x0092;
                case 16: goto L_0x0079;
                case 17: goto L_0x00bd;
                case 18: goto L_0x00c7;
                case 19: goto L_0x00c7;
                case 20: goto L_0x00c7;
                case 21: goto L_0x00c7;
                case 22: goto L_0x00c7;
                case 23: goto L_0x00c7;
                case 24: goto L_0x00c7;
                case 25: goto L_0x00c7;
                case 26: goto L_0x00c7;
                case 27: goto L_0x00c7;
                case 28: goto L_0x00c7;
                case 29: goto L_0x00c7;
                case 30: goto L_0x00c7;
                case 31: goto L_0x00c7;
                case 32: goto L_0x00c7;
                case 33: goto L_0x00c7;
                case 34: goto L_0x00c7;
                case 35: goto L_0x00c7;
                case 36: goto L_0x00c7;
                case 37: goto L_0x00c7;
                case 38: goto L_0x00c7;
                case 39: goto L_0x00c7;
                case 40: goto L_0x00c7;
                case 41: goto L_0x00c7;
                case 42: goto L_0x00c7;
                case 43: goto L_0x00c7;
                case 44: goto L_0x00c7;
                case 45: goto L_0x00c7;
                case 46: goto L_0x00c7;
                case 47: goto L_0x00c7;
                case 48: goto L_0x00c7;
                case 49: goto L_0x00c7;
                case 50: goto L_0x00c7;
                case 51: goto L_0x001b;
                case 52: goto L_0x001b;
                case 53: goto L_0x001b;
                case 54: goto L_0x001b;
                case 55: goto L_0x001b;
                case 56: goto L_0x001b;
                case 57: goto L_0x001b;
                case 58: goto L_0x001b;
                case 59: goto L_0x001b;
                case 60: goto L_0x001b;
                case 61: goto L_0x001b;
                case 62: goto L_0x001b;
                case 63: goto L_0x001b;
                case 64: goto L_0x001b;
                case 65: goto L_0x001b;
                case 66: goto L_0x001b;
                case 67: goto L_0x001b;
                case 68: goto L_0x001b;
                default: goto L_0x0018;
            }
        L_0x0018:
            int r4 = r4 + 3
            goto L_0x0005
        L_0x001b:
            int r2 = r4 + 2
            r2 = r6[r2]
            r2 = r2 & r3
            long r2 = (long) r2
            X.0V5 r8 = X.AnonymousClass0Z6.A00
            int r7 = r8.A00(r12, r2)
            int r2 = r8.A00(r13, r2)
            if (r7 != r2) goto L_0x00ef
            goto L_0x00c7
        L_0x002f:
            boolean r3 = r11.A0H(r12, r4)
            boolean r2 = r11.A0H(r13, r4)
            if (r3 != r2) goto L_0x00ef
            X.0V5 r9 = X.AnonymousClass0Z6.A00
            long r2 = r9.A01(r12, r0)
            double r2 = java.lang.Double.longBitsToDouble(r2)
            long r7 = java.lang.Double.doubleToLongBits(r2)
            long r0 = r9.A01(r13, r0)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            long r1 = java.lang.Double.doubleToLongBits(r0)
            goto L_0x008d
        L_0x0054:
            boolean r3 = r11.A0H(r12, r4)
            boolean r2 = r11.A0H(r13, r4)
            if (r3 != r2) goto L_0x00ef
            X.0V5 r7 = X.AnonymousClass0Z6.A00
            int r2 = r7.A00(r12, r0)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            int r3 = java.lang.Float.floatToIntBits(r2)
            int r0 = r7.A00(r13, r0)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x00b9
        L_0x0079:
            boolean r3 = r11.A0H(r12, r4)
            boolean r2 = r11.A0H(r13, r4)
            if (r3 != r2) goto L_0x00ef
            X.0V5 r2 = X.AnonymousClass0Z6.A00
            long r7 = r2.A01(r12, r0)
            long r1 = r2.A01(r13, r0)
        L_0x008d:
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00ef
            goto L_0x0018
        L_0x0092:
            boolean r3 = r11.A0H(r12, r4)
            boolean r2 = r11.A0H(r13, r4)
            if (r3 != r2) goto L_0x00ef
            X.0V5 r2 = X.AnonymousClass0Z6.A00
            int r3 = r2.A00(r12, r0)
            int r0 = r2.A00(r13, r0)
            goto L_0x00b9
        L_0x00a7:
            boolean r3 = r11.A0H(r12, r4)
            boolean r2 = r11.A0H(r13, r4)
            if (r3 != r2) goto L_0x00ef
            boolean r3 = X.AnonymousClass0Z6.A07(r12, r0)
            boolean r0 = X.AnonymousClass0Z6.A07(r13, r0)
        L_0x00b9:
            if (r3 != r0) goto L_0x00ef
            goto L_0x0018
        L_0x00bd:
            boolean r3 = r11.A0H(r12, r4)
            boolean r2 = r11.A0H(r13, r4)
            if (r3 != r2) goto L_0x00ef
        L_0x00c7:
            X.0V5 r3 = X.AnonymousClass0Z6.A00
            java.lang.Object r2 = r3.A02(r12, r0)
            java.lang.Object r1 = r3.A02(r13, r0)
            java.lang.Class r0 = X.C07450Xs.A03
            if (r2 == r1) goto L_0x0018
            if (r2 == 0) goto L_0x00ef
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x00ef
            goto L_0x0018
        L_0x00df:
            X.0M8 r12 = (X.AnonymousClass0M8) r12
            X.0YB r1 = r12.zzc
            X.0M8 r13 = (X.AnonymousClass0M8) r13
            X.0YB r0 = r13.zzc
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00ef
            r0 = 1
            return r0
        L_0x00ef:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10630ec.Byt(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00da, code lost:
        r0 = X.AnonymousClass0WB.A00;
        r0 = 1237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00de, code lost:
        if (r1 == false) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e0, code lost:
        r0 = 1231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ea, code lost:
        r6 = r6 * 53;
        r0 = ((java.lang.String) X.AnonymousClass0Z6.A00.A02(r10, r1)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0129, code lost:
        r6 = r6 * 53;
        r0 = X.AnonymousClass000.A0I(X.AnonymousClass0Z6.A00.A02(r10, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        r3 = r3 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013c, code lost:
        r6 = r6 * 53;
        r1 = ((java.lang.Number) X.AnonymousClass0Z6.A00.A02(r10, r1)).longValue();
        r0 = X.AnonymousClass0WB.A00;
        r0 = X.AnonymousClass000.A08(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0157, code lost:
        r6 = r6 * 53;
        r0 = X.AnonymousClass0Z6.A00.A02(r10, r1).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0163, code lost:
        r6 = r6 + r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(java.lang.Object r10) {
        /*
            r9 = this;
            int[] r5 = r9.A02
            int r4 = r5.length
            r3 = 0
            r6 = 0
        L_0x0005:
            if (r3 >= r4) goto L_0x0177
            int r0 = r3 + 1
            r7 = r5[r0]
            r8 = r5[r3]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r7
            long r1 = (long) r0
            int r0 = r7 >>> 20
            r0 = r0 & 255(0xff, float:3.57E-43)
            r7 = 37
            switch(r0) {
                case 0: goto L_0x001e;
                case 1: goto L_0x0036;
                case 2: goto L_0x0048;
                case 3: goto L_0x0048;
                case 4: goto L_0x0058;
                case 5: goto L_0x0048;
                case 6: goto L_0x0058;
                case 7: goto L_0x0062;
                case 8: goto L_0x00ea;
                case 9: goto L_0x0166;
                case 10: goto L_0x0157;
                case 11: goto L_0x0058;
                case 12: goto L_0x0058;
                case 13: goto L_0x0058;
                case 14: goto L_0x0048;
                case 15: goto L_0x0058;
                case 16: goto L_0x0048;
                case 17: goto L_0x0166;
                case 18: goto L_0x0157;
                case 19: goto L_0x0157;
                case 20: goto L_0x0157;
                case 21: goto L_0x0157;
                case 22: goto L_0x0157;
                case 23: goto L_0x0157;
                case 24: goto L_0x0157;
                case 25: goto L_0x0157;
                case 26: goto L_0x0157;
                case 27: goto L_0x0157;
                case 28: goto L_0x0157;
                case 29: goto L_0x0157;
                case 30: goto L_0x0157;
                case 31: goto L_0x0157;
                case 32: goto L_0x0157;
                case 33: goto L_0x0157;
                case 34: goto L_0x0157;
                case 35: goto L_0x0157;
                case 36: goto L_0x0157;
                case 37: goto L_0x0157;
                case 38: goto L_0x0157;
                case 39: goto L_0x0157;
                case 40: goto L_0x0157;
                case 41: goto L_0x0157;
                case 42: goto L_0x0157;
                case 43: goto L_0x0157;
                case 44: goto L_0x0157;
                case 45: goto L_0x0157;
                case 46: goto L_0x0157;
                case 47: goto L_0x0157;
                case 48: goto L_0x0157;
                case 49: goto L_0x0157;
                case 50: goto L_0x0157;
                case 51: goto L_0x0069;
                case 52: goto L_0x0089;
                case 53: goto L_0x00a3;
                case 54: goto L_0x00ab;
                case 55: goto L_0x00b3;
                case 56: goto L_0x00ba;
                case 57: goto L_0x00c1;
                case 58: goto L_0x00c8;
                case 59: goto L_0x00e4;
                case 60: goto L_0x00f9;
                case 61: goto L_0x0100;
                case 62: goto L_0x0107;
                case 63: goto L_0x010e;
                case 64: goto L_0x0115;
                case 65: goto L_0x011c;
                case 66: goto L_0x0123;
                case 67: goto L_0x0136;
                case 68: goto L_0x0151;
                default: goto L_0x001b;
            }
        L_0x001b:
            int r3 = r3 + 3
            goto L_0x0005
        L_0x001e:
            int r6 = r6 * 53
            X.0V5 r0 = X.AnonymousClass0Z6.A00
            long r0 = r0.A01(r10, r1)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            long r1 = java.lang.Double.doubleToLongBits(r0)
            java.nio.charset.Charset r0 = X.AnonymousClass0WB.A00
            int r0 = X.AnonymousClass000.A08(r1)
            goto L_0x0163
        L_0x0036:
            int r6 = r6 * 53
            X.0V5 r0 = X.AnonymousClass0Z6.A00
            int r0 = r0.A00(r10, r1)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x0163
        L_0x0048:
            int r6 = r6 * 53
            X.0V5 r0 = X.AnonymousClass0Z6.A00
            long r1 = r0.A01(r10, r1)
            java.nio.charset.Charset r0 = X.AnonymousClass0WB.A00
            int r0 = X.AnonymousClass000.A08(r1)
            goto L_0x0163
        L_0x0058:
            int r6 = r6 * 53
            X.0V5 r0 = X.AnonymousClass0Z6.A00
            int r0 = r0.A00(r10, r1)
            goto L_0x0163
        L_0x0062:
            int r6 = r6 * 53
            boolean r1 = X.AnonymousClass0Z6.A07(r10, r1)
            goto L_0x00da
        L_0x0069:
            boolean r0 = r9.A0I(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            int r6 = r6 * 53
            X.0V5 r0 = X.AnonymousClass0Z6.A00
            java.lang.Object r0 = r0.A02(r10, r1)
            java.lang.Number r0 = (java.lang.Number) r0
            double r0 = r0.doubleValue()
            long r1 = java.lang.Double.doubleToLongBits(r0)
            java.nio.charset.Charset r0 = X.AnonymousClass0WB.A00
            int r0 = X.AnonymousClass000.A08(r1)
            goto L_0x0163
        L_0x0089:
            boolean r0 = r9.A0I(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            int r6 = r6 * 53
            X.0V5 r0 = X.AnonymousClass0Z6.A00
            java.lang.Object r0 = r0.A02(r10, r1)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            int r0 = java.lang.Float.floatToIntBits(r0)
            goto L_0x0163
        L_0x00a3:
            boolean r0 = r9.A0I(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x013c
        L_0x00ab:
            boolean r0 = r9.A0I(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x013c
        L_0x00b3:
            boolean r0 = r9.A0I(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x0129
        L_0x00ba:
            boolean r0 = r9.A0I(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x013c
        L_0x00c1:
            boolean r0 = r9.A0I(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x0129
        L_0x00c8:
            boolean r0 = r9.A0I(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            int r6 = r6 * 53
            X.0V5 r0 = X.AnonymousClass0Z6.A00
            java.lang.Object r0 = r0.A02(r10, r1)
            boolean r1 = X.AnonymousClass000.A1X(r0)
        L_0x00da:
            java.nio.charset.Charset r0 = X.AnonymousClass0WB.A00
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L_0x0163
            r0 = 1231(0x4cf, float:1.725E-42)
            goto L_0x0163
        L_0x00e4:
            boolean r0 = r9.A0I(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
        L_0x00ea:
            int r6 = r6 * 53
            X.0V5 r0 = X.AnonymousClass0Z6.A00
            java.lang.Object r0 = r0.A02(r10, r1)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.hashCode()
            goto L_0x0163
        L_0x00f9:
            boolean r0 = r9.A0I(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x0157
        L_0x0100:
            boolean r0 = r9.A0I(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x0157
        L_0x0107:
            boolean r0 = r9.A0I(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x0129
        L_0x010e:
            boolean r0 = r9.A0I(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x0129
        L_0x0115:
            boolean r0 = r9.A0I(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x0129
        L_0x011c:
            boolean r0 = r9.A0I(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
            goto L_0x013c
        L_0x0123:
            boolean r0 = r9.A0I(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
        L_0x0129:
            int r6 = r6 * 53
            X.0V5 r0 = X.AnonymousClass0Z6.A00
            java.lang.Object r0 = r0.A02(r10, r1)
            int r0 = X.AnonymousClass000.A0I(r0)
            goto L_0x0163
        L_0x0136:
            boolean r0 = r9.A0I(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
        L_0x013c:
            int r6 = r6 * 53
            X.0V5 r0 = X.AnonymousClass0Z6.A00
            java.lang.Object r0 = r0.A02(r10, r1)
            java.lang.Number r0 = (java.lang.Number) r0
            long r1 = r0.longValue()
            java.nio.charset.Charset r0 = X.AnonymousClass0WB.A00
            int r0 = X.AnonymousClass000.A08(r1)
            goto L_0x0163
        L_0x0151:
            boolean r0 = r9.A0I(r10, r8, r3)
            if (r0 == 0) goto L_0x001b
        L_0x0157:
            int r6 = r6 * 53
            X.0V5 r0 = X.AnonymousClass0Z6.A00
            java.lang.Object r0 = r0.A02(r10, r1)
            int r0 = r0.hashCode()
        L_0x0163:
            int r6 = r6 + r0
            goto L_0x001b
        L_0x0166:
            X.0V5 r0 = X.AnonymousClass0Z6.A00
            java.lang.Object r0 = r0.A02(r10, r1)
            if (r0 == 0) goto L_0x0172
            int r7 = r0.hashCode()
        L_0x0172:
            int r6 = r6 * 53
            int r6 = r6 + r7
            goto L_0x001b
        L_0x0177:
            int r1 = r6 * 53
            X.0M8 r10 = (X.AnonymousClass0M8) r10
            X.0YB r0 = r10.zzc
            int r0 = r0.hashCode()
            int r1 = r1 + r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10630ec.zza(java.lang.Object):int");
    }

    public static int A05(C07050Wd r4, byte[] bArr, int i) {
        int A082 = A08(r4, bArr, i);
        int i2 = r4.A00;
        if (i2 >= 0) {
            int length = bArr.length;
            if (i2 > length - A082) {
                throw new C05050Na("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            } else if (i2 == 0) {
                r4.A02 = C10960fV.A00;
                return A082;
            } else {
                C10960fV.A00(A082, A082 + i2, length);
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArr, A082, bArr2, 0, i2);
                r4.A02 = new AnonymousClass0M5(bArr2);
                return A082 + i2;
            }
        } else {
            throw new C05050Na("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    public static int A06(C07050Wd r4, byte[] bArr, int i) {
        int A082 = A08(r4, bArr, i);
        int i2 = r4.A00;
        if (i2 < 0) {
            throw new C05050Na("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else if (i2 == 0) {
            r4.A02 = "";
            return A082;
        } else {
            r4.A02 = new String(bArr, A082, i2, AnonymousClass0WB.A04);
            return A082 + i2;
        }
    }

    public static Field A0G(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Field ");
            A0u.append(str);
            A0u.append(" for ");
            A0u.append(name);
            throw new RuntimeException(AnonymousClass000.A0p(" not found. Known fields are ", arrays, A0u));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0095, code lost:
        r3 = X.AnonymousClass0Z6.A00;
        r3.A07(r14, r9, r3.A02(r15, r9));
        r3.A05(r14, (long) (r2[r6 + 2] & 1048575), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0107, code lost:
        r1.A05(r14, r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x011f, code lost:
        r7.A06(r8, r9, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0122, code lost:
        r7 = r2[r6 + 2];
        r1 = (long) (1048575 & r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0130, code lost:
        if (r1 == 1048575) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0132, code lost:
        r5 = X.AnonymousClass0Z6.A00;
        r5.A05(r14, r1, (1 << (r7 >>> 20)) | r5.A00(r14, r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Byp(java.lang.Object r14, java.lang.Object r15) {
        /*
            r13 = this;
            java.util.Objects.requireNonNull(r15)
            r6 = 0
        L_0x0004:
            int[] r2 = r13.A02
            int r0 = r2.length
            r8 = r14
            if (r6 >= r0) goto L_0x0153
            int r0 = r6 + 1
            r1 = r2[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            long r9 = (long) r0
            r4 = r2[r6]
            int r0 = r1 >>> 20
            r0 = r0 & 255(0xff, float:3.57E-43)
            switch(r0) {
                case 0: goto L_0x010b;
                case 1: goto L_0x00f3;
                case 2: goto L_0x00e6;
                case 3: goto L_0x00e6;
                case 4: goto L_0x00d9;
                case 5: goto L_0x00e6;
                case 6: goto L_0x00d9;
                case 7: goto L_0x00c3;
                case 8: goto L_0x00b3;
                case 9: goto L_0x005f;
                case 10: goto L_0x00b3;
                case 11: goto L_0x00d9;
                case 12: goto L_0x00d9;
                case 13: goto L_0x00d9;
                case 14: goto L_0x00e6;
                case 15: goto L_0x00d9;
                case 16: goto L_0x00e6;
                case 17: goto L_0x005f;
                case 18: goto L_0x00ac;
                case 19: goto L_0x00ac;
                case 20: goto L_0x00ac;
                case 21: goto L_0x00ac;
                case 22: goto L_0x00ac;
                case 23: goto L_0x00ac;
                case 24: goto L_0x00ac;
                case 25: goto L_0x00ac;
                case 26: goto L_0x00ac;
                case 27: goto L_0x00ac;
                case 28: goto L_0x00ac;
                case 29: goto L_0x00ac;
                case 30: goto L_0x00ac;
                case 31: goto L_0x00ac;
                case 32: goto L_0x00ac;
                case 33: goto L_0x00ac;
                case 34: goto L_0x00ac;
                case 35: goto L_0x00ac;
                case 36: goto L_0x00ac;
                case 37: goto L_0x00ac;
                case 38: goto L_0x00ac;
                case 39: goto L_0x00ac;
                case 40: goto L_0x00ac;
                case 41: goto L_0x00ac;
                case 42: goto L_0x00ac;
                case 43: goto L_0x00ac;
                case 44: goto L_0x00ac;
                case 45: goto L_0x00ac;
                case 46: goto L_0x00ac;
                case 47: goto L_0x00ac;
                case 48: goto L_0x00ac;
                case 49: goto L_0x00ac;
                case 50: goto L_0x0142;
                case 51: goto L_0x008f;
                case 52: goto L_0x008f;
                case 53: goto L_0x008f;
                case 54: goto L_0x008f;
                case 55: goto L_0x008f;
                case 56: goto L_0x008f;
                case 57: goto L_0x008f;
                case 58: goto L_0x008f;
                case 59: goto L_0x008f;
                case 60: goto L_0x001f;
                case 61: goto L_0x0088;
                case 62: goto L_0x0088;
                case 63: goto L_0x0088;
                case 64: goto L_0x0088;
                case 65: goto L_0x0088;
                case 66: goto L_0x0088;
                case 67: goto L_0x0088;
                case 68: goto L_0x001f;
                default: goto L_0x001c;
            }
        L_0x001c:
            int r6 = r6 + 3
            goto L_0x0004
        L_0x001f:
            int r0 = r6 + 1
            r1 = r2[r0]
            r7 = r2[r6]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            boolean r3 = r13.A0I(r15, r7, r6)
            if (r3 == 0) goto L_0x001c
            boolean r3 = r13.A0I(r14, r7, r6)
            if (r3 == 0) goto L_0x005d
            X.0V5 r3 = X.AnonymousClass0Z6.A00
            java.lang.Object r5 = r3.A02(r14, r0)
        L_0x003c:
            X.0V5 r4 = X.AnonymousClass0Z6.A00
            java.lang.Object r3 = r4.A02(r15, r0)
            if (r5 == 0) goto L_0x005a
            if (r3 == 0) goto L_0x001c
            X.0M8 r3 = X.AnonymousClass0WB.A00(r5, r3)
        L_0x004a:
            r4.A07(r14, r0, r3)
            int r0 = r6 + 2
            r1 = r2[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            r4.A05(r14, r0, r7)
            goto L_0x001c
        L_0x005a:
            if (r3 == 0) goto L_0x001c
            goto L_0x004a
        L_0x005d:
            r5 = 0
            goto L_0x003c
        L_0x005f:
            int r0 = r6 + 1
            r1 = r2[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            boolean r3 = r13.A0H(r15, r6)
            if (r3 == 0) goto L_0x001c
            X.0V5 r5 = X.AnonymousClass0Z6.A00
            java.lang.Object r4 = r5.A02(r14, r0)
            java.lang.Object r3 = r5.A02(r15, r0)
            if (r4 == 0) goto L_0x0085
            if (r3 == 0) goto L_0x001c
            X.0M8 r3 = X.AnonymousClass0WB.A00(r4, r3)
        L_0x0080:
            r5.A07(r14, r0, r3)
            goto L_0x0122
        L_0x0085:
            if (r3 == 0) goto L_0x001c
            goto L_0x0080
        L_0x0088:
            boolean r0 = r13.A0I(r15, r4, r6)
            if (r0 == 0) goto L_0x001c
            goto L_0x0095
        L_0x008f:
            boolean r0 = r13.A0I(r15, r4, r6)
            if (r0 == 0) goto L_0x001c
        L_0x0095:
            X.0V5 r3 = X.AnonymousClass0Z6.A00
            java.lang.Object r0 = r3.A02(r15, r9)
            r3.A07(r14, r9, r0)
            int r0 = r6 + 2
            r1 = r2[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r0 = (long) r1
            r3.A05(r14, r0, r4)
            goto L_0x001c
        L_0x00ac:
            X.0X1 r0 = r13.A06
            r0.A01(r14, r15, r9)
            goto L_0x001c
        L_0x00b3:
            boolean r0 = r13.A0H(r15, r6)
            if (r0 == 0) goto L_0x001c
            X.0V5 r1 = X.AnonymousClass0Z6.A00
            java.lang.Object r0 = r1.A02(r15, r9)
            r1.A07(r14, r9, r0)
            goto L_0x0122
        L_0x00c3:
            boolean r0 = r13.A0H(r15, r6)
            if (r0 == 0) goto L_0x001c
            boolean r1 = X.AnonymousClass0Z6.A07(r15, r9)
            boolean r0 = X.AnonymousClass0Z6.A01
            if (r0 == 0) goto L_0x00d5
            X.AnonymousClass0Z6.A03(r14, r9, r1)
            goto L_0x0122
        L_0x00d5:
            X.AnonymousClass0Z6.A04(r14, r9, r1)
            goto L_0x0122
        L_0x00d9:
            boolean r0 = r13.A0H(r15, r6)
            if (r0 == 0) goto L_0x001c
            X.0V5 r1 = X.AnonymousClass0Z6.A00
            int r0 = r1.A00(r15, r9)
            goto L_0x0107
        L_0x00e6:
            boolean r0 = r13.A0H(r15, r6)
            if (r0 == 0) goto L_0x001c
            X.0V5 r7 = X.AnonymousClass0Z6.A00
            long r11 = r7.A01(r15, r9)
            goto L_0x011f
        L_0x00f3:
            boolean r0 = r13.A0H(r15, r6)
            if (r0 == 0) goto L_0x001c
            X.0V5 r1 = X.AnonymousClass0Z6.A00
            int r0 = r1.A00(r15, r9)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            int r0 = java.lang.Float.floatToIntBits(r0)
        L_0x0107:
            r1.A05(r14, r9, r0)
            goto L_0x0122
        L_0x010b:
            boolean r0 = r13.A0H(r15, r6)
            if (r0 == 0) goto L_0x001c
            X.0V5 r7 = X.AnonymousClass0Z6.A00
            long r0 = r7.A01(r15, r9)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            long r11 = java.lang.Double.doubleToLongBits(r0)
        L_0x011f:
            r7.A06(r8, r9, r11)
        L_0x0122:
            int r0 = r6 + 2
            r7 = r2[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r7
            long r1 = (long) r0
            r3 = 1048575(0xfffff, double:5.18065E-318)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x001c
            X.0V5 r5 = X.AnonymousClass0Z6.A00
            int r4 = r5.A00(r14, r1)
            r3 = 1
            int r0 = r7 >>> 20
            int r3 = r3 << r0
            r3 = r3 | r4
            r5.A05(r14, r1, r3)
            goto L_0x001c
        L_0x0142:
            java.lang.Class r0 = X.C07450Xs.A03
            X.0V5 r0 = X.AnonymousClass0Z6.A00
            r0.A02(r14, r9)
            r0.A02(r15, r9)
            java.lang.String r0 = "isEmpty"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0153:
            X.C07450Xs.A00(r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10630ec.Byp(java.lang.Object, java.lang.Object):void");
    }

    public static int A02(C07050Wd r8, AnonymousClass0YB r9, byte[] bArr, int i, int i2, int i3) {
        Object r0;
        int i4 = i2;
        if ((i >>> 3) != 0) {
            int i5 = i & 7;
            C07050Wd r3 = r8;
            byte[] bArr2 = bArr;
            if (i5 == 0) {
                int A092 = A09(r8, bArr, i2);
                r9.A01(i, Long.valueOf(r8.A01));
                return A092;
            } else if (i5 == 1) {
                r9.A01(i, Long.valueOf(A0C(bArr, i2)));
                return i2 + 8;
            } else if (i5 == 2) {
                int A082 = A08(r8, bArr, i2);
                int i6 = r8.A00;
                if (i6 >= 0) {
                    int length = bArr.length;
                    if (i6 <= length - A082) {
                        if (i6 == 0) {
                            r0 = C10960fV.A00;
                        } else {
                            C10960fV.A00(A082, A082 + i6, length);
                            byte[] bArr3 = new byte[i6];
                            System.arraycopy(bArr, A082, bArr3, 0, i6);
                            r0 = new AnonymousClass0M5(bArr3);
                        }
                        r9.A01(i, r0);
                        return A082 + i6;
                    }
                    throw new C05050Na("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                throw new C05050Na("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            } else if (i5 == 3) {
                int i7 = (i & -8) | 4;
                AnonymousClass0YB A002 = AnonymousClass0YB.A00();
                int i8 = 0;
                while (true) {
                    int i9 = i3;
                    if (i4 >= i3) {
                        break;
                    }
                    i4 = A08(r3, bArr, i4);
                    i8 = r3.A00;
                    if (i8 == i7) {
                        break;
                    }
                    i4 = A02(r3, A002, bArr2, i8, i4, i9);
                }
                if (i4 > i3 || i8 != i7) {
                    throw new C05050Na("Failed to parse the message.");
                }
                r9.A01(i, A002);
                return i4;
            } else if (i5 == 5) {
                r9.A01(i, Integer.valueOf(A0B(bArr, i2)));
                return i2 + 4;
            }
        }
        throw new C05050Na("Protocol message contained an invalid tag (zero).");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0083, code lost:
        r8.putObject(r10, r0, r4);
        r8.putInt(r10, r2, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008b, code lost:
        return r22 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0096, code lost:
        r8.putObject(r10, r0, r4);
        r8.putInt(r10, r2, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009e, code lost:
        return r22 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0026, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0120, code lost:
        r8.putObject(r10, r0, r4);
        r8.putInt(r10, r2, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0126, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x014c, code lost:
        if (r8.getInt(r10, r2) != r9) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x014e, code lost:
        r6 = r8.getObject(r10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0152, code lost:
        if (r6 == null) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0154, code lost:
        r4 = X.AnonymousClass0WB.A00(r6, r7.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x015a, code lost:
        r8.putObject(r10, r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x015d, code lost:
        r8.putInt(r10, r2, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0160, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0161, code lost:
        r4 = r7.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int A03(X.C07050Wd r19, java.lang.Object r20, byte[] r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, long r30) {
        /*
            r18 = this;
            r5 = r22
            sun.misc.Unsafe r8 = A0E
            r13 = r18
            int[] r1 = r13.A02
            r14 = r29
            int r0 = r29 + 2
            r1 = r1[r0]
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r0
            long r2 = (long) r1
            r11 = 5
            r4 = 2
            r7 = r19
            r10 = r20
            r6 = r21
            r15 = r23
            r9 = r25
            r12 = r26
            r0 = r30
            switch(r28) {
                case 51: goto L_0x0027;
                case 52: goto L_0x0037;
                case 53: goto L_0x005c;
                case 54: goto L_0x005c;
                case 55: goto L_0x006a;
                case 56: goto L_0x0078;
                case 57: goto L_0x008c;
                case 58: goto L_0x0046;
                case 59: goto L_0x009f;
                case 60: goto L_0x00d2;
                case 61: goto L_0x00dd;
                case 62: goto L_0x006a;
                case 63: goto L_0x00e9;
                case 64: goto L_0x008c;
                case 65: goto L_0x0078;
                case 66: goto L_0x00f9;
                case 67: goto L_0x010c;
                case 68: goto L_0x0127;
                default: goto L_0x0026;
            }
        L_0x0026:
            return r5
        L_0x0027:
            r4 = 1
            if (r12 != r4) goto L_0x0026
            long r6 = A0C(r6, r5)
            double r6 = java.lang.Double.longBitsToDouble(r6)
            java.lang.Double r4 = java.lang.Double.valueOf(r6)
            goto L_0x0083
        L_0x0037:
            if (r12 != r11) goto L_0x0026
            int r4 = A0B(r6, r5)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            goto L_0x0096
        L_0x0046:
            if (r26 != 0) goto L_0x0026
            int r13 = A09(r7, r6, r5)
            long r4 = r7.A01
            r11 = 0
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            boolean r4 = X.AnonymousClass000.A1P(r6)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            goto L_0x0120
        L_0x005c:
            if (r26 != 0) goto L_0x0026
            int r13 = A09(r7, r6, r5)
            long r4 = r7.A01
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            goto L_0x0120
        L_0x006a:
            if (r26 != 0) goto L_0x0026
            int r13 = A08(r7, r6, r5)
            int r4 = r7.A00
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0120
        L_0x0078:
            r4 = 1
            if (r12 != r4) goto L_0x0026
            long r6 = A0C(r6, r5)
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
        L_0x0083:
            r8.putObject(r10, r0, r4)
            r8.putInt(r10, r2, r9)
            int r0 = r22 + 8
            return r0
        L_0x008c:
            if (r12 != r11) goto L_0x0026
            int r4 = A0B(r6, r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x0096:
            r8.putObject(r10, r0, r4)
            r8.putInt(r10, r2, r9)
            int r0 = r22 + 4
            return r0
        L_0x009f:
            if (r12 != r4) goto L_0x0026
            int r5 = A08(r7, r6, r5)
            int r11 = r7.A00
            if (r11 != 0) goto L_0x00ad
            java.lang.String r4 = ""
            goto L_0x015a
        L_0x00ad:
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            r27 = r27 & r4
            if (r27 == 0) goto L_0x00c5
            int r7 = r5 + r11
            X.0Tc r4 = X.AnonymousClass0RO.A00
            boolean r4 = r4.A00(r6, r5, r7)
            if (r4 != 0) goto L_0x00c5
            java.lang.String r1 = "Protocol message had invalid UTF-8."
            X.0Na r0 = new X.0Na
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x00c5:
            java.nio.charset.Charset r7 = X.AnonymousClass0WB.A04
            java.lang.String r4 = new java.lang.String
            r4.<init>(r6, r5, r11, r7)
            r8.putObject(r10, r0, r4)
            int r5 = r5 + r11
            goto L_0x015d
        L_0x00d2:
            if (r12 != r4) goto L_0x0026
            X.0r6 r4 = r13.A0E(r14)
            int r5 = A01(r7, r4, r6, r5, r15)
            goto L_0x0148
        L_0x00dd:
            if (r12 != r4) goto L_0x0026
            int r5 = A05(r7, r6, r5)
            java.lang.Object r4 = r7.A02
            r8.putObject(r10, r0, r4)
            goto L_0x015d
        L_0x00e9:
            if (r26 != 0) goto L_0x0026
            int r5 = A08(r7, r6, r5)
            int r4 = r7.A00
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r8.putObject(r10, r0, r4)
            goto L_0x015d
        L_0x00f9:
            if (r26 != 0) goto L_0x0026
            int r13 = A08(r7, r6, r5)
            int r4 = r7.A00
            int r5 = r4 >>> 1
            r4 = r4 & 1
            int r4 = -r4
            r4 = r4 ^ r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x0120
        L_0x010c:
            if (r26 != 0) goto L_0x0026
            int r13 = A09(r7, r6, r5)
            long r6 = r7.A01
            r4 = 1
            long r11 = r6 >>> r4
            r4 = 1
            long r6 = r6 & r4
            long r4 = -r6
            long r4 = r4 ^ r11
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
        L_0x0120:
            r8.putObject(r10, r0, r4)
            r8.putInt(r10, r2, r9)
            return r13
        L_0x0127:
            r4 = 3
            if (r12 != r4) goto L_0x0026
            X.0r6 r11 = r13.A0E(r14)
            r4 = r24 & -8
            r17 = r4 | 4
            X.0ec r11 = (X.C10630ec) r11
            X.0M7 r4 = new X.0M7
            r4.<init>()
            r16 = r15
            r14 = r6
            r15 = r5
            r12 = r7
            r13 = r4
            int r5 = r11.A0J(r12, r13, r14, r15, r16, r17)
            r11.Byo(r4)
            r7.A02 = r4
        L_0x0148:
            int r4 = r8.getInt(r10, r2)
            if (r4 != r9) goto L_0x0161
            java.lang.Object r6 = r8.getObject(r10, r0)
            if (r6 == 0) goto L_0x0161
            java.lang.Object r4 = r7.A02
            X.0M8 r4 = X.AnonymousClass0WB.A00(r6, r4)
        L_0x015a:
            r8.putObject(r10, r0, r4)
        L_0x015d:
            r8.putInt(r10, r2, r9)
            return r5
        L_0x0161:
            java.lang.Object r4 = r7.A02
            goto L_0x015a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10630ec.A03(X.0Wd, java.lang.Object, byte[], int, int, int, int, int, int, int, int, long):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0264, code lost:
        if (r14 != r0) goto L_0x0267;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0266, code lost:
        return r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x026e, code lost:
        throw new X.C05050Na("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01a6, code lost:
        throw new X.C05050Na("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int A04(X.C07050Wd r18, java.lang.Object r19, byte[] r20, int r21, int r22, int r23, int r24, int r25, int r26, long r27, long r29) {
        /*
            r17 = this;
            r4 = r19
            r14 = r21
            sun.misc.Unsafe r6 = A0E
            r0 = r29
            java.lang.Object r2 = r6.getObject(r4, r0)
            X.0sA r2 = (X.C17850sA) r2
            r3 = r2
            X.0jh r3 = (X.C13330jh) r3
            boolean r3 = r3.A00
            if (r3 != 0) goto L_0x0026
            int r5 = r2.size()
            int r3 = r5 + r5
            if (r5 != 0) goto L_0x001f
            r3 = 10
        L_0x001f:
            X.0sA r2 = r2.Byg(r3)
            r6.putObject(r4, r0, r2)
        L_0x0026:
            r8 = 5
            r9 = 0
            r5 = 1
            r0 = 2
            r1 = r17
            r11 = r18
            r13 = r20
            r15 = r22
            r3 = r23
            r7 = r24
            r6 = r25
            switch(r26) {
                case 18: goto L_0x0226;
                case 19: goto L_0x020f;
                case 20: goto L_0x01f2;
                case 21: goto L_0x01f2;
                case 22: goto L_0x023d;
                case 23: goto L_0x01db;
                case 24: goto L_0x01c4;
                case 25: goto L_0x01a7;
                case 26: goto L_0x0134;
                case 27: goto L_0x0066;
                case 28: goto L_0x00f6;
                case 29: goto L_0x023d;
                case 30: goto L_0x0085;
                case 31: goto L_0x01c4;
                case 32: goto L_0x01db;
                case 33: goto L_0x00d9;
                case 34: goto L_0x00bc;
                case 35: goto L_0x0226;
                case 36: goto L_0x020f;
                case 37: goto L_0x01f2;
                case 38: goto L_0x01f2;
                case 39: goto L_0x023d;
                case 40: goto L_0x01db;
                case 41: goto L_0x01c4;
                case 42: goto L_0x01a7;
                case 43: goto L_0x023d;
                case 44: goto L_0x0085;
                case 45: goto L_0x01c4;
                case 46: goto L_0x01db;
                case 47: goto L_0x00d9;
                case 48: goto L_0x00bc;
                default: goto L_0x003c;
            }
        L_0x003c:
            r0 = 3
            if (r7 != r0) goto L_0x0266
            X.0r6 r4 = r1.A0E(r6)
            r0 = r23 & -8
            r16 = r0 | 4
        L_0x0047:
            r10 = r4
            X.0ec r10 = (X.C10630ec) r10
            X.0M7 r12 = new X.0M7
            r12.<init>()
            int r1 = r10.A0J(r11, r12, r13, r14, r15, r16)
            r10.Byo(r12)
            r11.A02 = r12
            r2.add(r12)
            if (r1 >= r15) goto L_0x0065
            int r14 = A08(r11, r13, r1)
            int r0 = r11.A00
            if (r3 == r0) goto L_0x0047
        L_0x0065:
            return r1
        L_0x0066:
            if (r7 != r0) goto L_0x0266
            X.0r6 r5 = r1.A0E(r6)
            int r4 = A01(r11, r5, r13, r14, r15)
        L_0x0070:
            java.lang.Object r0 = r11.A02
            r2.add(r0)
            if (r4 >= r15) goto L_0x0084
            int r1 = A08(r11, r13, r4)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x0084
            int r4 = A01(r11, r5, r13, r1, r15)
            goto L_0x0070
        L_0x0084:
            return r4
        L_0x0085:
            if (r7 != r0) goto L_0x00b2
            int r14 = A08(r11, r13, r14)
            int r0 = r11.A00
            int r0 = r0 + r14
            if (r14 >= r0) goto L_0x0098
            A08(r11, r13, r14)
            java.lang.NullPointerException r1 = A0F()
            throw r1
        L_0x0098:
            if (r14 != r0) goto L_0x00aa
            X.0M8 r4 = (X.AnonymousClass0M8) r4
            X.0YB r1 = r4.zzc
            X.0YB r0 = X.AnonymousClass0YB.A04
            if (r1 != r0) goto L_0x00a3
            r1 = 0
        L_0x00a3:
            java.lang.Class r0 = X.C07450Xs.A03
            if (r1 == 0) goto L_0x0266
            r4.zzc = r1
            return r14
        L_0x00aa:
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.0Na r1 = new X.0Na
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x00b2:
            if (r24 != 0) goto L_0x0266
            A08(r11, r13, r14)
            java.lang.NullPointerException r0 = A0F()
            throw r0
        L_0x00bc:
            if (r7 != r0) goto L_0x00cf
            int r14 = A08(r11, r13, r14)
            int r0 = r11.A00
            int r0 = r0 + r14
            if (r14 >= r0) goto L_0x0264
            A09(r11, r13, r14)
            java.lang.NullPointerException r0 = A0F()
            throw r0
        L_0x00cf:
            if (r24 != 0) goto L_0x0266
            A09(r11, r13, r14)
            java.lang.NullPointerException r0 = A0F()
            throw r0
        L_0x00d9:
            if (r7 != r0) goto L_0x00ec
            int r14 = A08(r11, r13, r14)
            int r0 = r11.A00
            int r0 = r0 + r14
            if (r14 >= r0) goto L_0x0264
            A08(r11, r13, r14)
            java.lang.NullPointerException r0 = A0F()
            throw r0
        L_0x00ec:
            if (r24 != 0) goto L_0x0266
            A08(r11, r13, r14)
            java.lang.NullPointerException r0 = A0F()
            throw r0
        L_0x00f6:
            if (r7 != r0) goto L_0x0266
            int r14 = A08(r11, r13, r14)
            int r5 = r11.A00
            if (r5 < 0) goto L_0x019f
            int r4 = r13.length
        L_0x0101:
            int r0 = r4 - r14
            if (r5 > r0) goto L_0x0267
            if (r5 != 0) goto L_0x011f
            X.0fV r0 = X.C10960fV.A00
            r2.add(r0)
        L_0x010c:
            if (r14 >= r15) goto L_0x0266
            int r1 = A08(r11, r13, r14)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x0266
            int r14 = A08(r11, r13, r1)
            int r5 = r11.A00
            if (r5 < 0) goto L_0x019f
            goto L_0x0101
        L_0x011f:
            int r0 = r14 + r5
            X.C10960fV.A00(r14, r0, r4)
            byte[] r1 = new byte[r5]
            r0 = 0
            java.lang.System.arraycopy(r13, r14, r1, r0, r5)
            X.0M5 r0 = new X.0M5
            r0.<init>(r1)
            r2.add(r0)
            int r14 = r14 + r5
            goto L_0x010c
        L_0x0134:
            if (r7 != r0) goto L_0x0266
            r0 = 536870912(0x20000000, double:2.652494739E-315)
            long r27 = r27 & r0
            java.lang.String r5 = ""
            int r0 = (r27 > r9 ? 1 : (r27 == r9 ? 0 : -1))
            int r14 = A08(r11, r13, r14)
            if (r0 != 0) goto L_0x0169
        L_0x0145:
            int r4 = r11.A00
            if (r4 < 0) goto L_0x019f
            if (r4 != 0) goto L_0x015d
            r2.add(r5)
        L_0x014e:
            if (r14 >= r15) goto L_0x0266
            int r1 = A08(r11, r13, r14)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x0266
            int r14 = A08(r11, r13, r1)
            goto L_0x0145
        L_0x015d:
            java.nio.charset.Charset r1 = X.AnonymousClass0WB.A04
            java.lang.String r0 = new java.lang.String
            r0.<init>(r13, r14, r4, r1)
            r2.add(r0)
            int r14 = r14 + r4
            goto L_0x014e
        L_0x0169:
            int r6 = r11.A00
            if (r6 < 0) goto L_0x019f
            if (r6 != 0) goto L_0x0181
            r2.add(r5)
        L_0x0172:
            if (r14 >= r15) goto L_0x0266
            int r1 = A08(r11, r13, r14)
            int r0 = r11.A00
            if (r3 != r0) goto L_0x0266
            int r14 = A08(r11, r13, r1)
            goto L_0x0169
        L_0x0181:
            int r4 = r14 + r6
            X.0Tc r0 = X.AnonymousClass0RO.A00
            boolean r0 = r0.A00(r13, r14, r4)
            if (r0 == 0) goto L_0x0197
            java.nio.charset.Charset r1 = X.AnonymousClass0WB.A04
            java.lang.String r0 = new java.lang.String
            r0.<init>(r13, r14, r6, r1)
            r2.add(r0)
            r14 = r4
            goto L_0x0172
        L_0x0197:
            java.lang.String r0 = "Protocol message had invalid UTF-8."
            X.0Na r1 = new X.0Na
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x019f:
            java.lang.String r0 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            X.0Na r1 = new X.0Na
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x01a7:
            if (r7 != r0) goto L_0x01ba
            int r14 = A08(r11, r13, r14)
            int r0 = r11.A00
            int r0 = r0 + r14
            if (r14 >= r0) goto L_0x0264
            A09(r11, r13, r14)
            java.lang.NullPointerException r0 = A0F()
            throw r0
        L_0x01ba:
            if (r24 != 0) goto L_0x0266
            A09(r11, r13, r14)
            java.lang.NullPointerException r0 = A0F()
            throw r0
        L_0x01c4:
            if (r7 != r0) goto L_0x01d4
            int r14 = A08(r11, r13, r14)
            int r0 = r11.A00
            int r0 = r0 + r14
            if (r14 >= r0) goto L_0x0264
            java.lang.NullPointerException r0 = A0F()
            throw r0
        L_0x01d4:
            if (r7 != r8) goto L_0x0266
            java.lang.NullPointerException r0 = A0F()
            throw r0
        L_0x01db:
            if (r7 != r0) goto L_0x01eb
            int r14 = A08(r11, r13, r14)
            int r0 = r11.A00
            int r0 = r0 + r14
            if (r14 >= r0) goto L_0x0264
            java.lang.NullPointerException r0 = A0F()
            throw r0
        L_0x01eb:
            if (r7 != r5) goto L_0x0266
            java.lang.NullPointerException r0 = A0F()
            throw r0
        L_0x01f2:
            if (r7 != r0) goto L_0x0205
            int r14 = A08(r11, r13, r14)
            int r0 = r11.A00
            int r0 = r0 + r14
            if (r14 >= r0) goto L_0x0264
            A09(r11, r13, r14)
            java.lang.NullPointerException r0 = A0F()
            throw r0
        L_0x0205:
            if (r24 != 0) goto L_0x0266
            A09(r11, r13, r14)
            java.lang.NullPointerException r0 = A0F()
            throw r0
        L_0x020f:
            if (r7 != r0) goto L_0x021f
            int r14 = A08(r11, r13, r14)
            int r0 = r11.A00
            int r0 = r0 + r14
            if (r14 >= r0) goto L_0x0264
            java.lang.NullPointerException r0 = A0F()
            throw r0
        L_0x021f:
            if (r7 != r8) goto L_0x0266
            java.lang.NullPointerException r0 = A0F()
            throw r0
        L_0x0226:
            if (r7 != r0) goto L_0x0236
            int r14 = A08(r11, r13, r14)
            int r0 = r11.A00
            int r0 = r0 + r14
            if (r14 >= r0) goto L_0x0264
            java.lang.NullPointerException r0 = A0F()
            throw r0
        L_0x0236:
            if (r7 != r5) goto L_0x0266
            java.lang.NullPointerException r0 = A0F()
            throw r0
        L_0x023d:
            if (r7 != r0) goto L_0x025a
            int r14 = A08(r11, r13, r14)
            int r0 = r11.A00
            int r0 = r0 + r14
            if (r14 >= r0) goto L_0x0250
            A08(r11, r13, r14)
            java.lang.NullPointerException r1 = A0F()
            throw r1
        L_0x0250:
            if (r14 == r0) goto L_0x0266
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.0Na r1 = new X.0Na
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x025a:
            if (r24 != 0) goto L_0x0266
            A08(r11, r13, r14)
            java.lang.NullPointerException r0 = A0F()
            throw r0
        L_0x0264:
            if (r14 != r0) goto L_0x0267
        L_0x0266:
            return r14
        L_0x0267:
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            X.0Na r1 = new X.0Na
            r1.<init>((java.lang.String) r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10630ec.A04(X.0Wd, java.lang.Object, byte[], int, int, int, int, int, int, long, long):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0171, code lost:
        if (r38 == false) goto L_0x0173;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C10630ec A0D(X.AnonymousClass0QS r39, X.AnonymousClass0X1 r40, X.AnonymousClass0QT r41, X.C15980oM r42, X.AnonymousClass0QU r43, X.AnonymousClass0QW r44) {
        /*
            r8 = r42
            boolean r0 = r8 instanceof X.C10570eV
            if (r0 == 0) goto L_0x036a
            X.0eV r8 = (X.C10570eV) r8
            int r0 = r8.A00
            r1 = 1
            r0 = r0 & 1
            r2 = 2
            if (r0 != r1) goto L_0x0011
            r2 = 1
        L_0x0011:
            r1 = 0
            r0 = 2
            boolean r38 = X.AnonymousClass000.A1S(r2, r0)
            java.lang.String r12 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a"
            int r26 = r12.length()
            char r0 = r12.charAt(r1)
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r0 < r4) goto L_0x0031
            r0 = 1
        L_0x0027:
            int r1 = r0 + 1
            char r0 = r12.charAt(r0)
            if (r0 < r4) goto L_0x0032
            r0 = r1
            goto L_0x0027
        L_0x0031:
            r1 = 1
        L_0x0032:
            int r11 = r1 + 1
            char r3 = r12.charAt(r1)
            if (r3 < r4) goto L_0x0051
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x003e:
            int r1 = r11 + 1
            char r0 = r12.charAt(r11)
            if (r0 < r4) goto L_0x004e
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r2
            r3 = r3 | r0
            int r2 = r2 + 13
            r11 = r1
            goto L_0x003e
        L_0x004e:
            int r0 = r0 << r2
            r3 = r3 | r0
            r11 = r1
        L_0x0051:
            if (r3 != 0) goto L_0x024a
            int[] r16 = A0F
            r5 = 0
            r2 = 0
            r6 = 0
            r7 = 0
            r1 = 0
            r0 = 0
            r15 = 0
        L_0x005c:
            sun.misc.Unsafe r25 = A0E
            java.lang.Object[] r10 = r8.A02
            X.0rj r3 = r8.A01
            r28 = r3
            java.lang.Class r24 = r28.getClass()
            int r3 = r7 * 3
            int[] r3 = new int[r3]
            r23 = r3
            int r7 = r7 + r7
            java.lang.Object[] r9 = new java.lang.Object[r7]
            int r37 = r0 + r6
            r22 = r0
            r21 = r37
            r20 = 0
            r19 = 0
        L_0x007b:
            r3 = r26
            if (r11 >= r3) goto L_0x034e
            int r3 = r11 + 1
            char r8 = r12.charAt(r11)
            if (r8 < r4) goto L_0x009e
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r7 = 13
        L_0x008b:
            int r6 = r3 + 1
            char r3 = r12.charAt(r3)
            if (r3 < r4) goto L_0x009b
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r7
            r8 = r8 | r3
            int r7 = r7 + 13
            r3 = r6
            goto L_0x008b
        L_0x009b:
            int r3 = r3 << r7
            r8 = r8 | r3
            goto L_0x009f
        L_0x009e:
            r6 = r3
        L_0x009f:
            int r3 = r6 + 1
            char r7 = r12.charAt(r6)
            if (r7 < r4) goto L_0x00c1
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r6 = 13
        L_0x00ab:
            int r11 = r3 + 1
            char r4 = r12.charAt(r3)
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r3) goto L_0x00be
            r3 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r6
            r7 = r7 | r3
            int r6 = r6 + 13
            r3 = r11
            goto L_0x00ab
        L_0x00be:
            int r4 = r4 << r6
            r7 = r7 | r4
            goto L_0x00c2
        L_0x00c1:
            r11 = r3
        L_0x00c2:
            r6 = r7 & 255(0xff, float:3.57E-43)
            r3 = r7 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x00ce
            int r3 = r19 + 1
            r16[r19] = r20
            r19 = r3
        L_0x00ce:
            r3 = 51
            if (r6 < r3) goto L_0x00f8
            int r3 = r11 + 1
            char r4 = r12.charAt(r11)
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r11) goto L_0x01cb
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00e1:
            int r11 = r3 + 1
            char r13 = r12.charAt(r3)
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r13 < r3) goto L_0x00f4
            r3 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r14
            r4 = r4 | r3
            int r14 = r14 + 13
            r3 = r11
            goto L_0x00e1
        L_0x00f4:
            int r13 = r13 << r14
            r4 = r4 | r13
            goto L_0x01cc
        L_0x00f8:
            int r17 = r15 + 1
            r4 = r10[r15]
            java.lang.String r4 = (java.lang.String) r4
            r3 = r24
            java.lang.reflect.Field r4 = A0G(r3, r4)
            r3 = 9
            if (r6 == r3) goto L_0x0184
            r3 = 17
            if (r6 == r3) goto L_0x0184
            r3 = 27
            if (r6 == r3) goto L_0x0173
            r3 = 49
            if (r6 == r3) goto L_0x0173
            r3 = 12
            if (r6 == r3) goto L_0x0171
            r3 = 30
            if (r6 == r3) goto L_0x0171
            r3 = 44
            if (r6 == r3) goto L_0x0171
            r3 = 50
            if (r6 != r3) goto L_0x013f
            int r14 = r22 + 1
            r16[r22] = r20
            int r13 = r20 / 3
            int r13 = r13 + r13
            int r15 = r17 + 1
            r3 = r10[r17]
            r9[r13] = r3
            r3 = r7 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x017f
            int r17 = r15 + 1
            int r13 = r13 + 1
            r3 = r10[r15]
            r9[r13] = r3
            r22 = r14
        L_0x013f:
            r3 = r25
            long r3 = r3.objectFieldOffset(r4)
            int r13 = (int) r3
            r18 = r13
            r4 = r7 & 4096(0x1000, float:5.74E-42)
            r3 = 4096(0x1000, float:5.74E-42)
            if (r4 != r3) goto L_0x0193
            r3 = 17
            if (r6 > r3) goto L_0x0193
            int r4 = r11 + 1
            char r3 = r12.charAt(r11)
            r13 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r13) goto L_0x01a6
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x0161:
            int r11 = r4 + 1
            char r4 = r12.charAt(r4)
            if (r4 < r13) goto L_0x0190
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r14
            r3 = r3 | r4
            int r14 = r14 + 13
            r4 = r11
            goto L_0x0161
        L_0x0171:
            if (r38 != 0) goto L_0x013f
        L_0x0173:
            int r3 = r20 / 3
            int r15 = r17 + 1
            int r3 = r3 + r3
            int r13 = r3 + 1
            r3 = r10[r17]
            r9[r13] = r3
            goto L_0x0181
        L_0x017f:
            r22 = r14
        L_0x0181:
            r17 = r15
            goto L_0x013f
        L_0x0184:
            int r3 = r20 / 3
            int r3 = r3 + r3
            int r13 = r3 + 1
            java.lang.Class r3 = r4.getType()
            r9[r13] = r3
            goto L_0x013f
        L_0x0190:
            int r4 = r4 << r14
            r3 = r3 | r4
            goto L_0x01a7
        L_0x0193:
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r3 = 0
            r4 = 18
            if (r6 < r4) goto L_0x01bd
            r4 = 49
            if (r6 > r4) goto L_0x01bd
            int r4 = r21 + 1
            r16[r21] = r18
            r21 = r4
            goto L_0x01bd
        L_0x01a6:
            r11 = r4
        L_0x01a7:
            int r14 = r5 + r5
            int r4 = r3 / 32
            int r14 = r14 + r4
            r13 = r10[r14]
            boolean r4 = r13 instanceof java.lang.reflect.Field
            if (r4 == 0) goto L_0x01c0
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
        L_0x01b4:
            r4 = r25
            long r14 = r4.objectFieldOffset(r13)
            int r13 = (int) r14
            int r3 = r3 % 32
        L_0x01bd:
            r15 = r17
            goto L_0x020c
        L_0x01c0:
            java.lang.String r13 = (java.lang.String) r13
            r4 = r24
            java.lang.reflect.Field r13 = A0G(r4, r13)
            r10[r14] = r13
            goto L_0x01b4
        L_0x01cb:
            r11 = r3
        L_0x01cc:
            int r13 = r6 + -51
            r3 = 9
            if (r13 == r3) goto L_0x01dc
            r3 = 17
            if (r13 == r3) goto L_0x01dc
            r3 = 12
            if (r13 != r3) goto L_0x01e8
            if (r38 != 0) goto L_0x01e8
        L_0x01dc:
            int r3 = r20 / 3
            int r14 = r15 + 1
            int r3 = r3 + r3
            int r13 = r3 + 1
            r3 = r10[r15]
            r9[r13] = r3
            r15 = r14
        L_0x01e8:
            int r4 = r4 + r4
            r13 = r10[r4]
            boolean r3 = r13 instanceof java.lang.reflect.Field
            if (r3 == 0) goto L_0x023f
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
        L_0x01f1:
            r3 = r25
            long r13 = r3.objectFieldOffset(r13)
            int r3 = (int) r13
            r18 = r3
            int r13 = r4 + 1
            r4 = r10[r13]
            boolean r3 = r4 instanceof java.lang.reflect.Field
            if (r3 == 0) goto L_0x0234
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
        L_0x0204:
            r3 = r25
            long r3 = r3.objectFieldOffset(r4)
            int r13 = (int) r3
            r3 = 0
        L_0x020c:
            int r17 = r20 + 1
            r23[r20] = r8
            int r14 = r17 + 1
            r4 = r7 & 512(0x200, float:7.175E-43)
            r8 = 0
            if (r4 == 0) goto L_0x0219
            r8 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x0219:
            r4 = r7 & 256(0x100, float:3.59E-43)
            r7 = 0
            if (r4 == 0) goto L_0x0220
            r7 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0220:
            r7 = r7 | r8
            int r4 = r6 << 20
            r7 = r7 | r4
            r7 = r7 | r18
            r23[r17] = r7
            int r20 = r14 + 1
            int r3 = r3 << 20
            r3 = r3 | r13
            r23[r14] = r3
            r4 = 55296(0xd800, float:7.7486E-41)
            goto L_0x007b
        L_0x0234:
            java.lang.String r4 = (java.lang.String) r4
            r3 = r24
            java.lang.reflect.Field r4 = A0G(r3, r4)
            r10[r13] = r4
            goto L_0x0204
        L_0x023f:
            java.lang.String r13 = (java.lang.String) r13
            r3 = r24
            java.lang.reflect.Field r13 = A0G(r3, r13)
            r10[r4] = r13
            goto L_0x01f1
        L_0x024a:
            int r0 = r11 + 1
            char r5 = r12.charAt(r11)
            if (r5 < r4) goto L_0x0269
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x0256:
            int r1 = r0 + 1
            char r0 = r12.charAt(r0)
            if (r0 < r4) goto L_0x0266
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r2
            r5 = r5 | r0
            int r2 = r2 + 13
            r0 = r1
            goto L_0x0256
        L_0x0266:
            int r0 = r0 << r2
            r5 = r5 | r0
            r0 = r1
        L_0x0269:
            int r3 = r0 + 1
            char r9 = r12.charAt(r0)
            if (r9 < r4) goto L_0x0288
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r2 = 13
        L_0x0275:
            int r1 = r3 + 1
            char r0 = r12.charAt(r3)
            if (r0 < r4) goto L_0x0285
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r2
            r9 = r9 | r0
            int r2 = r2 + 13
            r3 = r1
            goto L_0x0275
        L_0x0285:
            int r0 = r0 << r2
            r9 = r9 | r0
            r3 = r1
        L_0x0288:
            int r0 = r3 + 1
            char r2 = r12.charAt(r3)
            if (r2 < r4) goto L_0x02a7
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r3 = 13
        L_0x0294:
            int r1 = r0 + 1
            char r0 = r12.charAt(r0)
            if (r0 < r4) goto L_0x02a4
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r3
            r2 = r2 | r0
            int r3 = r3 + 13
            r0 = r1
            goto L_0x0294
        L_0x02a4:
            int r0 = r0 << r3
            r2 = r2 | r0
            r0 = r1
        L_0x02a7:
            int r7 = r0 + 1
            char r1 = r12.charAt(r0)
            if (r1 < r4) goto L_0x02c6
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r6 = 13
        L_0x02b3:
            int r3 = r7 + 1
            char r0 = r12.charAt(r7)
            if (r0 < r4) goto L_0x02c3
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r6
            r1 = r1 | r0
            int r6 = r6 + 13
            r7 = r3
            goto L_0x02b3
        L_0x02c3:
            int r0 = r0 << r6
            r1 = r1 | r0
            r7 = r3
        L_0x02c6:
            int r0 = r7 + 1
            char r7 = r12.charAt(r7)
            if (r7 < r4) goto L_0x02e5
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r6 = 13
        L_0x02d2:
            int r3 = r0 + 1
            char r0 = r12.charAt(r0)
            if (r0 < r4) goto L_0x02e2
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r6
            r7 = r7 | r0
            int r6 = r6 + 13
            r0 = r3
            goto L_0x02d2
        L_0x02e2:
            int r0 = r0 << r6
            r7 = r7 | r0
            r0 = r3
        L_0x02e5:
            int r11 = r0 + 1
            char r6 = r12.charAt(r0)
            if (r6 < r4) goto L_0x0304
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x02f1:
            int r3 = r11 + 1
            char r0 = r12.charAt(r11)
            if (r0 < r4) goto L_0x0301
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r10
            r6 = r6 | r0
            int r10 = r10 + 13
            r11 = r3
            goto L_0x02f1
        L_0x0301:
            int r0 = r0 << r10
            r6 = r6 | r0
            r11 = r3
        L_0x0304:
            int r0 = r11 + 1
            char r10 = r12.charAt(r11)
            if (r10 < r4) goto L_0x0323
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x0310:
            int r3 = r0 + 1
            char r0 = r12.charAt(r0)
            if (r0 < r4) goto L_0x0320
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r11
            r10 = r10 | r0
            int r11 = r11 + 13
            r0 = r3
            goto L_0x0310
        L_0x0320:
            int r0 = r0 << r11
            r10 = r10 | r0
            r0 = r3
        L_0x0323:
            int r11 = r0 + 1
            char r0 = r12.charAt(r0)
            if (r0 < r4) goto L_0x0342
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x032f:
            int r13 = r11 + 1
            char r3 = r12.charAt(r11)
            if (r3 < r4) goto L_0x033f
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r14
            r0 = r0 | r3
            int r14 = r14 + 13
            r11 = r13
            goto L_0x032f
        L_0x033f:
            int r3 = r3 << r14
            r0 = r0 | r3
            r11 = r13
        L_0x0342:
            int r3 = r0 + r6
            int r3 = r3 + r10
            int[] r3 = new int[r3]
            r16 = r3
            int r15 = r5 + r5
            int r15 = r15 + r9
            goto L_0x005c
        L_0x034e:
            X.0ec r24 = new X.0ec
            r25 = r39
            r26 = r40
            r27 = r41
            r29 = r43
            r30 = r44
            r31 = r23
            r32 = r16
            r33 = r9
            r34 = r2
            r35 = r1
            r36 = r0
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            return r24
        L_0x036a:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10630ec.A0D(X.0QS, X.0X1, X.0QT, X.0oM, X.0QU, X.0QW):X.0ec");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b5, code lost:
        if ((r20 & r16) == 0) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b7, code lost:
        r2 = X.AnonymousClass0WB.A00(r5.getObject(r6, r0), r12.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c1, code lost:
        r5.putObject(r6, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c4, code lost:
        r20 = r20 | r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f3, code lost:
        r5.putInt(r6, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0118, code lost:
        r2 = r12.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x015a, code lost:
        r5.putLong(r6, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0174, code lost:
        r13 = r7 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018d, code lost:
        r13 = r7 + 8;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r21v3, types: [byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x024d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x027e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0J(X.C07050Wd r38, java.lang.Object r39, byte[] r40, int r41, int r42, int r43) {
        /*
            r37 = this;
            r13 = r41
            sun.misc.Unsafe r5 = A0E
            r21 = 0
            r1 = -1
            r4 = 0
            r20 = 0
            r2 = 1048575(0xfffff, float:1.469367E-39)
        L_0x000d:
            r10 = r37
            r6 = r39
            r14 = r42
            r22 = r43
            if (r13 >= r14) goto L_0x0250
            int r7 = r13 + 1
            r11 = r40
            byte r21 = r40[r13]
            r12 = r38
            if (r21 >= 0) goto L_0x002b
            r0 = r21
            int r7 = A0A(r12, r11, r0, r7)
            int r0 = r12.A00
            r21 = r0
        L_0x002b:
            int r19 = r21 >>> 3
            r13 = r21 & 7
            r3 = 3
            r0 = r19
            if (r0 <= r1) goto L_0x023d
            int r4 = r4 / r3
            int r1 = r10.A00
            if (r0 < r1) goto L_0x023b
            int r1 = r10.A01
            if (r0 > r1) goto L_0x023b
            int[] r9 = r10.A02
            int r0 = r9.length
            int r0 = r0 / 3
            int r8 = r0 + -1
        L_0x0044:
            if (r4 > r8) goto L_0x023b
            int r0 = r8 + r4
            int r15 = r0 >>> 1
            int r3 = r15 * 3
            r1 = r9[r3]
            r0 = r19
            if (r0 != r1) goto L_0x0231
            r4 = r3
        L_0x0053:
            r0 = -1
            if (r4 == r0) goto L_0x023b
            int[] r9 = r10.A02
            int r0 = r4 + 1
            r18 = r9[r0]
            int r0 = r18 >>> 20
            r8 = r0 & 255(0xff, float:3.57E-43)
            r15 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r18 & r15
            long r0 = (long) r0
            r3 = 17
            if (r8 > r3) goto L_0x0195
            int r3 = r4 + 2
            r17 = r9[r3]
            int r3 = r17 >>> 20
            r9 = 1
            int r16 = r9 << r3
            r17 = r17 & r15
            r3 = r17
            if (r3 == r2) goto L_0x0191
            if (r2 == r15) goto L_0x0081
            long r2 = (long) r2
            r15 = r20
            r5.putInt(r6, r2, r15)
        L_0x0081:
            r2 = r17
            long r2 = (long) r2
            int r20 = r5.getInt(r6, r2)
        L_0x0088:
            r2 = 5
            switch(r8) {
                case 0: goto L_0x0178;
                case 1: goto L_0x0161;
                case 2: goto L_0x0152;
                case 3: goto L_0x0152;
                case 4: goto L_0x00eb;
                case 5: goto L_0x0145;
                case 6: goto L_0x013b;
                case 7: goto L_0x0120;
                case 8: goto L_0x010b;
                case 9: goto L_0x00ff;
                case 10: goto L_0x00f7;
                case 11: goto L_0x00eb;
                case 12: goto L_0x00eb;
                case 13: goto L_0x013b;
                case 14: goto L_0x0145;
                case 15: goto L_0x00dc;
                case 16: goto L_0x00cc;
                default: goto L_0x008c;
            }
        L_0x008c:
            r2 = 3
            if (r13 != r2) goto L_0x0245
            X.0r6 r3 = r10.A0E(r4)
            int r2 = r19 << 3
            r28 = r2 | 4
            X.0ec r3 = (X.C10630ec) r3
            X.0M7 r2 = new X.0M7
            r2.<init>()
            r23 = r12
            r25 = r11
            r27 = r14
            r22 = r3
            r24 = r2
            r26 = r7
            int r13 = r22.A0J(r23, r24, r25, r26, r27, r28)
            r3.Byo(r2)
            r12.A02 = r2
        L_0x00b3:
            r2 = r20 & r16
            if (r2 == 0) goto L_0x0118
            java.lang.Object r3 = r5.getObject(r6, r0)
            java.lang.Object r2 = r12.A02
            X.0M8 r2 = X.AnonymousClass0WB.A00(r3, r2)
        L_0x00c1:
            r5.putObject(r6, r0, r2)
        L_0x00c4:
            r20 = r20 | r16
        L_0x00c6:
            r1 = r19
            r2 = r17
            goto L_0x000d
        L_0x00cc:
            if (r13 != 0) goto L_0x0245
            int r13 = A09(r12, r11, r7)
            long r7 = r12.A01
            long r9 = r7 >>> r9
            r2 = 1
            long r7 = r7 & r2
            long r2 = -r7
            long r2 = r2 ^ r9
            goto L_0x015a
        L_0x00dc:
            if (r13 != 0) goto L_0x0245
            int r13 = A08(r12, r11, r7)
            int r2 = r12.A00
            int r3 = r2 >>> 1
            r2 = r2 & 1
            int r2 = -r2
            r2 = r2 ^ r3
            goto L_0x00f3
        L_0x00eb:
            if (r13 != 0) goto L_0x0245
            int r13 = A08(r12, r11, r7)
            int r2 = r12.A00
        L_0x00f3:
            r5.putInt(r6, r0, r2)
            goto L_0x00c4
        L_0x00f7:
            r2 = 2
            if (r13 != r2) goto L_0x0245
            int r13 = A05(r12, r11, r7)
            goto L_0x0118
        L_0x00ff:
            r2 = 2
            if (r13 != r2) goto L_0x0245
            X.0r6 r2 = r10.A0E(r4)
            int r13 = A01(r12, r2, r11, r7, r14)
            goto L_0x00b3
        L_0x010b:
            r2 = 2
            if (r13 != r2) goto L_0x0245
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            r2 = r2 & r18
            if (r2 != 0) goto L_0x011b
            int r13 = A06(r12, r11, r7)
        L_0x0118:
            java.lang.Object r2 = r12.A02
            goto L_0x00c1
        L_0x011b:
            int r13 = A07(r12, r11, r7)
            goto L_0x0118
        L_0x0120:
            if (r13 != 0) goto L_0x0245
            int r13 = A09(r12, r11, r7)
            long r2 = r12.A01
            r10 = 0
            int r7 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r7 != 0) goto L_0x012f
            r9 = 0
        L_0x012f:
            boolean r2 = X.AnonymousClass0Z6.A01
            if (r2 == 0) goto L_0x0137
            X.AnonymousClass0Z6.A03(r6, r0, r9)
            goto L_0x00c4
        L_0x0137:
            X.AnonymousClass0Z6.A04(r6, r0, r9)
            goto L_0x00c4
        L_0x013b:
            if (r13 != r2) goto L_0x0245
            int r2 = A0B(r11, r7)
            r5.putInt(r6, r0, r2)
            goto L_0x0174
        L_0x0145:
            if (r13 != r9) goto L_0x0245
            long r12 = A0C(r11, r7)
            r9 = r6
            r8 = r5
            r10 = r0
            r8.putLong(r9, r10, r12)
            goto L_0x018d
        L_0x0152:
            if (r13 != 0) goto L_0x0245
            int r13 = A09(r12, r11, r7)
            long r2 = r12.A01
        L_0x015a:
            r7 = r0
            r9 = r2
            r5.putLong(r6, r7, r9)
            goto L_0x00c4
        L_0x0161:
            if (r13 != r2) goto L_0x0245
            int r2 = A0B(r11, r7)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            X.0V5 r3 = X.AnonymousClass0Z6.A00
            int r2 = java.lang.Float.floatToIntBits(r2)
            r3.A05(r6, r0, r2)
        L_0x0174:
            int r13 = r7 + 4
            goto L_0x00c4
        L_0x0178:
            if (r13 != r9) goto L_0x0245
            long r2 = A0C(r11, r7)
            double r2 = java.lang.Double.longBitsToDouble(r2)
            X.0V5 r8 = X.AnonymousClass0Z6.A00
            long r12 = java.lang.Double.doubleToLongBits(r2)
            r9 = r6
            r10 = r0
            r8.A06(r9, r10, r12)
        L_0x018d:
            int r13 = r7 + 8
            goto L_0x00c4
        L_0x0191:
            r17 = r2
            goto L_0x0088
        L_0x0195:
            r3 = 27
            if (r8 != r3) goto L_0x01da
            r3 = 2
            if (r13 != r3) goto L_0x0243
            java.lang.Object r3 = r5.getObject(r6, r0)
            X.0sA r3 = (X.C17850sA) r3
            r8 = r3
            X.0jh r8 = (X.C13330jh) r8
            boolean r8 = r8.A00
            if (r8 != 0) goto L_0x01ba
            int r9 = r3.size()
            int r8 = r9 + r9
            if (r9 != 0) goto L_0x01b3
            r8 = 10
        L_0x01b3:
            X.0sA r3 = r3.Byg(r8)
            r5.putObject(r6, r0, r3)
        L_0x01ba:
            X.0r6 r6 = r10.A0E(r4)
            r17 = r2
            int r13 = A01(r12, r6, r11, r7, r14)
        L_0x01c4:
            java.lang.Object r0 = r12.A02
            r3.add(r0)
            if (r13 >= r14) goto L_0x00c6
            int r2 = A08(r12, r11, r13)
            int r1 = r12.A00
            r0 = r21
            if (r0 != r1) goto L_0x00c6
            int r13 = A01(r12, r6, r11, r2, r14)
            goto L_0x01c4
        L_0x01da:
            r17 = r2
            r2 = 49
            if (r8 > r2) goto L_0x0203
            r2 = r18
            long r2 = (long) r2
            r28 = r14
            r24 = r12
            r25 = r6
            r26 = r11
            r23 = r10
            r27 = r7
            r29 = r21
            r30 = r13
            r31 = r4
            r32 = r8
            r33 = r2
            r35 = r0
            int r13 = r23.A04(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35)
        L_0x01ff:
            if (r13 != r7) goto L_0x00c6
            r7 = r13
            goto L_0x0245
        L_0x0203:
            r2 = 50
            if (r8 != r2) goto L_0x0212
            r2 = 2
            if (r13 != r2) goto L_0x0245
            r5.getObject(r6, r0)
            java.lang.NullPointerException r0 = A0F()
            throw r0
        L_0x0212:
            r28 = r14
            r24 = r12
            r25 = r6
            r26 = r11
            r32 = r18
            r33 = r8
            r34 = r4
            r35 = r0
            r23 = r10
            r27 = r7
            r29 = r21
            r30 = r19
            r31 = r13
            int r13 = r23.A03(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            goto L_0x01ff
        L_0x0231:
            if (r0 >= r1) goto L_0x0237
            int r8 = r15 + -1
            goto L_0x0044
        L_0x0237:
            int r4 = r15 + 1
            goto L_0x0044
        L_0x023b:
            r4 = 0
            goto L_0x0247
        L_0x023d:
            int r4 = r10.A00(r0)
            goto L_0x0053
        L_0x0243:
            r17 = r2
        L_0x0245:
            r2 = r17
        L_0x0247:
            r1 = r22
            r0 = r21
            if (r0 != r1) goto L_0x0275
            if (r43 == 0) goto L_0x0275
            r13 = r7
        L_0x0250:
            r3 = 1048575(0xfffff, float:1.469367E-39)
            if (r2 == r3) goto L_0x025b
            long r0 = (long) r2
            r2 = r20
            r5.putInt(r6, r0, r2)
        L_0x025b:
            int r4 = r10.A03
        L_0x025d:
            int r0 = r10.A04
            if (r4 >= r0) goto L_0x0293
            int[] r0 = r10.A0C
            r0 = r0[r4]
            int[] r1 = r10.A02
            int r0 = r0 + 1
            r0 = r1[r0]
            r0 = r0 & r3
            long r0 = (long) r0
            X.0V5 r2 = X.AnonymousClass0Z6.A00
            r2.A02(r6, r0)
            int r4 = r4 + 1
            goto L_0x025d
        L_0x0275:
            r3 = r6
            X.0M8 r3 = (X.AnonymousClass0M8) r3
            X.0YB r1 = r3.zzc
            X.0YB r0 = X.AnonymousClass0YB.A04
            if (r1 != r0) goto L_0x0284
            X.0YB r1 = X.AnonymousClass0YB.A00()
            r3.zzc = r1
        L_0x0284:
            r8 = r12
            r10 = r11
            r13 = r14
            r9 = r1
            r11 = r21
            r12 = r7
            int r13 = A02(r8, r9, r10, r11, r12, r13)
            r1 = r19
            goto L_0x000d
        L_0x0293:
            if (r43 != 0) goto L_0x0298
            if (r13 != r14) goto L_0x02a1
            return r13
        L_0x0298:
            if (r13 > r14) goto L_0x02a1
            r1 = r22
            r0 = r21
            if (r0 != r1) goto L_0x02a1
            return r13
        L_0x02a1:
            java.lang.String r1 = "Failed to parse the message."
            X.0Na r0 = new X.0Na
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10630ec.A0J(X.0Wd, java.lang.Object, byte[], int, int, int):int");
    }
}
