package X;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.5fB  reason: invalid class name and case insensitive filesystem */
public abstract class C113215fB {
    public static final Map A00 = AnonymousClass001.A0J();

    public static void A00(String str, AbstractCollection abstractCollection, byte[] bArr) {
        bArr[2] = -46;
        bArr[3] = -48;
        abstractCollection.add(InetAddress.getByAddress(str, bArr));
    }

    public static void A01(String str, AbstractCollection abstractCollection, byte[] bArr) {
        bArr[2] = -4;
        bArr[3] = 61;
        abstractCollection.add(InetAddress.getByAddress(str, bArr));
    }

    public static void A03(String str, AbstractCollection abstractCollection, byte[] bArr) {
        bArr[2] = -35;
        bArr[3] = 48;
        abstractCollection.add(InetAddress.getByAddress(str, bArr));
        A00.put(str, abstractCollection);
    }

    public static void A05(byte[] bArr) {
        bArr[0] = -99;
        bArr[1] = -16;
    }

    public static void A08(byte[] bArr, byte b) {
        bArr[6] = b;
        bArr[7] = -58;
    }

    public static byte[] A09() {
        byte[] bArr = new byte[4];
        bArr[0] = 31;
        bArr[1] = 13;
        return bArr;
    }

    public static byte[] A0A(byte b, byte b2, int i) {
        byte[] bArr = new byte[i];
        bArr[0] = b;
        bArr[1] = b2;
        return bArr;
    }

    public static void A02(String str, AbstractCollection abstractCollection, byte[] bArr) {
        bArr[14] = 114;
        bArr[15] = 96;
        abstractCollection.add(InetAddress.getByAddress(str, bArr));
    }

    public static void A04(String str, AbstractCollection abstractCollection, byte[] bArr, byte b, int i) {
        bArr[i] = b;
        abstractCollection.add(InetAddress.getByAddress(str, bArr));
    }

    public static void A06(byte[] bArr) {
        bArr[8] = -6;
        bArr[9] = -50;
        bArr[10] = -80;
    }

    public static void A07(byte[] bArr) {
        bArr[11] = 12;
        bArr[12] = 0;
        bArr[13] = 0;
    }

    static {
        String[] strArr = {"e1.whatsapp.net", "e1.whatsapp.net."};
        for (int i = 0; i < 2; i++) {
            String str = strArr[i];
            try {
                ArrayList A0I = AnonymousClass001.A0I();
                byte[] A0A = A0A((byte) 15, (byte) -59, 4);
                A0A[2] = -50;
                A04(str, A0I, A0A, (byte) -39, 3);
                A01(str, A0I, A0A((byte) 3, (byte) 33, 4));
                A00(str, A0I, A0A((byte) 15, (byte) -59, 4));
                A03(str, A0I, A0A((byte) 3, (byte) 33, 4));
            } catch (UnknownHostException unused) {
            }
        }
        String[] strArr2 = {"e10.whatsapp.net", "e10.whatsapp.net."};
        int i2 = 0;
        do {
            String str2 = strArr2[i2];
            try {
                ArrayList A0I2 = AnonymousClass001.A0I();
                byte[] A0A2 = A0A((byte) 15, (byte) -59, 4);
                A0A2[2] = -50;
                A04(str2, A0I2, A0A2, (byte) -39, 3);
                A01(str2, A0I2, A0A((byte) 3, (byte) 33, 4));
                A00(str2, A0I2, A0A((byte) 15, (byte) -59, 4));
                A03(str2, A0I2, A0A((byte) 3, (byte) 33, 4));
            } catch (UnknownHostException unused2) {
            }
            i2++;
        } while (i2 < 2);
        String[] strArr3 = {"e11.whatsapp.net", "e11.whatsapp.net."};
        int i3 = 0;
        do {
            String str3 = strArr3[i3];
            try {
                ArrayList A0I3 = AnonymousClass001.A0I();
                byte[] A0A3 = A0A((byte) 15, (byte) -59, 4);
                A0A3[2] = -50;
                A04(str3, A0I3, A0A3, (byte) -39, 3);
                A01(str3, A0I3, A0A((byte) 3, (byte) 33, 4));
                A00(str3, A0I3, A0A((byte) 15, (byte) -59, 4));
                A03(str3, A0I3, A0A((byte) 3, (byte) 33, 4));
            } catch (UnknownHostException unused3) {
            }
            i3++;
        } while (i3 < 2);
        String[] strArr4 = {"e12.whatsapp.net", "e12.whatsapp.net."};
        int i4 = 0;
        do {
            String str4 = strArr4[i4];
            try {
                ArrayList A0I4 = AnonymousClass001.A0I();
                byte[] A0A4 = A0A((byte) 15, (byte) -59, 4);
                A0A4[2] = -50;
                A04(str4, A0I4, A0A4, (byte) -39, 3);
                A01(str4, A0I4, A0A((byte) 3, (byte) 33, 4));
                A00(str4, A0I4, A0A((byte) 15, (byte) -59, 4));
                A03(str4, A0I4, A0A((byte) 3, (byte) 33, 4));
            } catch (UnknownHostException unused4) {
            }
            i4++;
        } while (i4 < 2);
        String[] strArr5 = {"e13.whatsapp.net", "e13.whatsapp.net."};
        int i5 = 0;
        do {
            String str5 = strArr5[i5];
            try {
                ArrayList A0I5 = AnonymousClass001.A0I();
                byte[] A0A5 = A0A((byte) 15, (byte) -59, 4);
                A0A5[2] = -50;
                A04(str5, A0I5, A0A5, (byte) -39, 3);
                A01(str5, A0I5, A0A((byte) 3, (byte) 33, 4));
                A00(str5, A0I5, A0A((byte) 15, (byte) -59, 4));
                A03(str5, A0I5, A0A((byte) 3, (byte) 33, 4));
            } catch (UnknownHostException unused5) {
            }
            i5++;
        } while (i5 < 2);
        String[] strArr6 = {"e14.whatsapp.net", "e14.whatsapp.net."};
        int i6 = 0;
        do {
            String str6 = strArr6[i6];
            try {
                ArrayList A0I6 = AnonymousClass001.A0I();
                byte[] A0A6 = A0A((byte) 15, (byte) -59, 4);
                A0A6[2] = -50;
                A04(str6, A0I6, A0A6, (byte) -39, 3);
                A01(str6, A0I6, A0A((byte) 3, (byte) 33, 4));
                A00(str6, A0I6, A0A((byte) 15, (byte) -59, 4));
                A03(str6, A0I6, A0A((byte) 3, (byte) 33, 4));
            } catch (UnknownHostException unused6) {
            }
            i6++;
        } while (i6 < 2);
        String[] strArr7 = {"e15.whatsapp.net", "e15.whatsapp.net."};
        int i7 = 0;
        do {
            String str7 = strArr7[i7];
            try {
                ArrayList A0I7 = AnonymousClass001.A0I();
                byte[] A0A7 = A0A((byte) 15, (byte) -59, 4);
                A0A7[2] = -50;
                A04(str7, A0I7, A0A7, (byte) -39, 3);
                A01(str7, A0I7, A0A((byte) 3, (byte) 33, 4));
                A00(str7, A0I7, A0A((byte) 15, (byte) -59, 4));
                A03(str7, A0I7, A0A((byte) 3, (byte) 33, 4));
            } catch (UnknownHostException unused7) {
            }
            i7++;
        } while (i7 < 2);
        String[] strArr8 = {"e16.whatsapp.net", "e16.whatsapp.net."};
        int i8 = 0;
        do {
            String str8 = strArr8[i8];
            try {
                ArrayList A0I8 = AnonymousClass001.A0I();
                byte[] A0A8 = A0A((byte) 15, (byte) -59, 4);
                A0A8[2] = -50;
                A04(str8, A0I8, A0A8, (byte) -39, 3);
                A01(str8, A0I8, A0A((byte) 3, (byte) 33, 4));
                A00(str8, A0I8, A0A((byte) 15, (byte) -59, 4));
                A03(str8, A0I8, A0A((byte) 3, (byte) 33, 4));
            } catch (UnknownHostException unused8) {
            }
            i8++;
        } while (i8 < 2);
        String[] strArr9 = {"e2.whatsapp.net", "e2.whatsapp.net."};
        int i9 = 0;
        do {
            String str9 = strArr9[i9];
            try {
                ArrayList A0I9 = AnonymousClass001.A0I();
                byte[] A0A9 = A0A((byte) 15, (byte) -59, 4);
                A0A9[2] = -50;
                A04(str9, A0I9, A0A9, (byte) -39, 3);
                A01(str9, A0I9, A0A((byte) 3, (byte) 33, 4));
                A00(str9, A0I9, A0A((byte) 15, (byte) -59, 4));
                A03(str9, A0I9, A0A((byte) 3, (byte) 33, 4));
            } catch (UnknownHostException unused9) {
            }
            i9++;
        } while (i9 < 2);
        String[] strArr10 = {"e3.whatsapp.net", "e3.whatsapp.net."};
        int i10 = 0;
        do {
            String str10 = strArr10[i10];
            try {
                ArrayList A0I10 = AnonymousClass001.A0I();
                byte[] A0A10 = A0A((byte) 15, (byte) -59, 4);
                A0A10[2] = -50;
                A04(str10, A0I10, A0A10, (byte) -39, 3);
                A01(str10, A0I10, A0A((byte) 3, (byte) 33, 4));
                A00(str10, A0I10, A0A((byte) 15, (byte) -59, 4));
                A03(str10, A0I10, A0A((byte) 3, (byte) 33, 4));
            } catch (UnknownHostException unused10) {
            }
            i10++;
        } while (i10 < 2);
        String[] strArr11 = {"e4.whatsapp.net", "e4.whatsapp.net."};
        int i11 = 0;
        do {
            String str11 = strArr11[i11];
            try {
                ArrayList A0I11 = AnonymousClass001.A0I();
                byte[] A0A11 = A0A((byte) 15, (byte) -59, 4);
                A0A11[2] = -50;
                A04(str11, A0I11, A0A11, (byte) -39, 3);
                A01(str11, A0I11, A0A((byte) 3, (byte) 33, 4));
                A00(str11, A0I11, A0A((byte) 15, (byte) -59, 4));
                A03(str11, A0I11, A0A((byte) 3, (byte) 33, 4));
            } catch (UnknownHostException unused11) {
            }
            i11++;
        } while (i11 < 2);
        String[] strArr12 = {"e5.whatsapp.net", "e5.whatsapp.net."};
        int i12 = 0;
        do {
            String str12 = strArr12[i12];
            try {
                ArrayList A0I12 = AnonymousClass001.A0I();
                byte[] A0A12 = A0A((byte) 15, (byte) -59, 4);
                A0A12[2] = -50;
                A04(str12, A0I12, A0A12, (byte) -39, 3);
                A01(str12, A0I12, A0A((byte) 3, (byte) 33, 4));
                A00(str12, A0I12, A0A((byte) 15, (byte) -59, 4));
                A03(str12, A0I12, A0A((byte) 3, (byte) 33, 4));
            } catch (UnknownHostException unused12) {
            }
            i12++;
        } while (i12 < 2);
        String[] strArr13 = {"e6.whatsapp.net", "e6.whatsapp.net."};
        int i13 = 0;
        do {
            String str13 = strArr13[i13];
            try {
                ArrayList A0I13 = AnonymousClass001.A0I();
                byte[] A0A13 = A0A((byte) 15, (byte) -59, 4);
                A0A13[2] = -50;
                A04(str13, A0I13, A0A13, (byte) -39, 3);
                A01(str13, A0I13, A0A((byte) 3, (byte) 33, 4));
                A00(str13, A0I13, A0A((byte) 15, (byte) -59, 4));
                A03(str13, A0I13, A0A((byte) 3, (byte) 33, 4));
            } catch (UnknownHostException unused13) {
            }
            i13++;
        } while (i13 < 2);
        String[] strArr14 = {"e7.whatsapp.net", "e7.whatsapp.net."};
        int i14 = 0;
        do {
            String str14 = strArr14[i14];
            try {
                ArrayList A0I14 = AnonymousClass001.A0I();
                byte[] A0A14 = A0A((byte) 15, (byte) -59, 4);
                A0A14[2] = -50;
                A04(str14, A0I14, A0A14, (byte) -39, 3);
                A01(str14, A0I14, A0A((byte) 3, (byte) 33, 4));
                A00(str14, A0I14, A0A((byte) 15, (byte) -59, 4));
                A03(str14, A0I14, A0A((byte) 3, (byte) 33, 4));
            } catch (UnknownHostException unused14) {
            }
            i14++;
        } while (i14 < 2);
        String[] strArr15 = {"e8.whatsapp.net", "e8.whatsapp.net."};
        int i15 = 0;
        do {
            String str15 = strArr15[i15];
            try {
                ArrayList A0I15 = AnonymousClass001.A0I();
                byte[] A0A15 = A0A((byte) 15, (byte) -59, 4);
                A0A15[2] = -50;
                A04(str15, A0I15, A0A15, (byte) -39, 3);
                A01(str15, A0I15, A0A((byte) 3, (byte) 33, 4));
                A00(str15, A0I15, A0A((byte) 15, (byte) -59, 4));
                A03(str15, A0I15, A0A((byte) 3, (byte) 33, 4));
            } catch (UnknownHostException unused15) {
            }
            i15++;
        } while (i15 < 2);
        String[] strArr16 = {"e9.whatsapp.net", "e9.whatsapp.net."};
        int i16 = 0;
        do {
            String str16 = strArr16[i16];
            try {
                ArrayList A0I16 = AnonymousClass001.A0I();
                byte[] A0A16 = A0A((byte) 15, (byte) -59, 4);
                A0A16[2] = -50;
                A04(str16, A0I16, A0A16, (byte) -39, 3);
                A01(str16, A0I16, A0A((byte) 3, (byte) 33, 4));
                A00(str16, A0I16, A0A((byte) 15, (byte) -59, 4));
                A03(str16, A0I16, A0A((byte) 3, (byte) 33, 4));
            } catch (UnknownHostException unused16) {
            }
            i16++;
        } while (i16 < 2);
        String[] strArr17 = {"g.whatsapp.net", "g.whatsapp.net."};
        for (int i17 = 0; i17 < 2; i17++) {
            String str17 = strArr17[i17];
            try {
                ArrayList A0I17 = AnonymousClass001.A0I();
                byte[] A09 = A09();
                A09[2] = 65;
                A04(str17, A0I17, A09, (byte) 50, 3);
                byte[] A092 = A09();
                A092[2] = 88;
                A04(str17, A0I17, A092, (byte) 61, 3);
                byte[] bArr = new byte[4];
                A05(bArr);
                bArr[2] = 19;
                A04(str17, A0I17, bArr, (byte) 54, 3);
                byte[] A093 = A09();
                A093[2] = 93;
                A04(str17, A0I17, A093, (byte) 54, 3);
                byte[] A094 = A09();
                A094[2] = 66;
                A04(str17, A0I17, A094, (byte) 51, 3);
                byte[] bArr2 = new byte[4];
                A05(bArr2);
                bArr2[2] = -27;
                A04(str17, A0I17, bArr2, (byte) 61, 3);
                byte[] A095 = A09();
                A095[2] = 70;
                A04(str17, A0I17, A095, (byte) 50, 3);
                byte[] bArr3 = new byte[4];
                A05(bArr3);
                bArr3[2] = 11;
                A04(str17, A0I17, bArr3, (byte) 54, 3);
                byte[] A096 = A09();
                A096[2] = 71;
                A04(str17, A0I17, A096, (byte) 50, 3);
                byte[] bArr4 = new byte[4];
                A05(bArr4);
                bArr4[2] = -15;
                A04(str17, A0I17, bArr4, (byte) 61, 3);
                byte[] A097 = A09();
                A097[2] = 67;
                A04(str17, A0I17, A097, (byte) 53, 3);
                byte[] bArr5 = new byte[4];
                A05(bArr5);
                bArr5[2] = 14;
                A04(str17, A0I17, bArr5, (byte) 53, 3);
                byte[] bArr6 = new byte[4];
                A05(bArr6);
                bArr6[2] = 3;
                A04(str17, A0I17, bArr6, (byte) 55, 3);
                byte[] bArr7 = new byte[4];
                A05(bArr7);
                bArr7[2] = 22;
                A04(str17, A0I17, bArr7, (byte) 54, 3);
                byte[] A0A17 = A0A((byte) 42, (byte) 3, 16);
                A0A17[2] = 40;
                A0A17[3] = Byte.MIN_VALUE;
                A0A17[4] = -14;
                A0A17[5] = 17;
                A08(A0A17, (byte) 0);
                A0A17[8] = -6;
                A0A17[9] = -50;
                A0A17[10] = -80;
                A07(A0A17);
                A0A17[14] = 114;
                A04(str17, A0I17, A0A17, (byte) 96, 15);
                byte[] A0A18 = A0A((byte) 42, (byte) 3, 16);
                A0A18[2] = 40;
                A0A18[3] = Byte.MIN_VALUE;
                A0A18[4] = -14;
                A0A18[5] = 17;
                A0A18[6] = 1;
                A0A18[7] = -54;
                A06(A0A18);
                A07(A0A18);
                A02(str17, A0I17, A0A18);
                byte[] A0A19 = A0A((byte) 42, (byte) 3, 16);
                A0A19[2] = 40;
                A0A19[3] = Byte.MIN_VALUE;
                A0A19[4] = -14;
                A0A19[5] = 52;
                A0A19[6] = 0;
                A0A19[7] = -57;
                A06(A0A19);
                A07(A0A19);
                A02(str17, A0I17, A0A19);
                byte[] A0A20 = A0A((byte) 42, (byte) 3, 16);
                A0A20[2] = 40;
                A0A20[3] = Byte.MIN_VALUE;
                A0A20[4] = -14;
                A0A20[5] = 52;
                A0A20[6] = 1;
                A0A20[7] = -57;
                A06(A0A20);
                A07(A0A20);
                A02(str17, A0I17, A0A20);
                byte[] A0A21 = A0A((byte) 42, (byte) 3, 16);
                A0A21[2] = 40;
                A0A21[3] = Byte.MIN_VALUE;
                A0A21[4] = -14;
                A0A21[5] = 3;
                A08(A0A21, (byte) 0);
                A06(A0A21);
                A07(A0A21);
                A02(str17, A0I17, A0A21);
                byte[] A0A22 = A0A((byte) 42, (byte) 3, 16);
                A0A22[2] = 40;
                A0A22[3] = Byte.MIN_VALUE;
                A0A22[4] = -14;
                A0A22[5] = 3;
                A0A22[6] = 1;
                A0A22[7] = -55;
                A06(A0A22);
                A07(A0A22);
                A02(str17, A0I17, A0A22);
                byte[] A0A23 = A0A((byte) 42, (byte) 3, 16);
                A0A23[2] = 40;
                A0A23[3] = Byte.MIN_VALUE;
                A0A23[4] = -14;
                A0A23[5] = 13;
                A08(A0A23, (byte) 0);
                A06(A0A23);
                A07(A0A23);
                A02(str17, A0I17, A0A23);
                byte[] A0A24 = A0A((byte) 42, (byte) 3, 16);
                A0A24[2] = 40;
                A0A24[3] = Byte.MIN_VALUE;
                A0A24[4] = -14;
                A0A24[5] = 13;
                A08(A0A24, (byte) 1);
                A06(A0A24);
                A07(A0A24);
                A02(str17, A0I17, A0A24);
                byte[] A0A25 = A0A((byte) 42, (byte) 3, 16);
                A0A25[2] = 40;
                A0A25[3] = Byte.MIN_VALUE;
                A0A25[4] = -14;
                A0A25[5] = 18;
                A08(A0A25, (byte) 0);
                A06(A0A25);
                A07(A0A25);
                A02(str17, A0I17, A0A25);
                byte[] A0A26 = A0A((byte) 42, (byte) 3, 16);
                A0A26[2] = 40;
                A0A26[3] = Byte.MIN_VALUE;
                A0A26[4] = -14;
                A0A26[5] = 18;
                A0A26[6] = 1;
                A0A26[7] = -60;
                A06(A0A26);
                A07(A0A26);
                A02(str17, A0I17, A0A26);
                byte[] A0A27 = A0A((byte) 42, (byte) 3, 16);
                A0A27[2] = 40;
                A0A27[3] = Byte.MIN_VALUE;
                A0A27[4] = -14;
                A0A27[5] = 44;
                A08(A0A27, (byte) 0);
                A06(A0A27);
                A07(A0A27);
                A02(str17, A0I17, A0A27);
                byte[] A0A28 = A0A((byte) 42, (byte) 3, 16);
                A0A28[2] = 40;
                A0A28[3] = Byte.MIN_VALUE;
                A0A28[4] = -14;
                A0A28[5] = 44;
                A08(A0A28, (byte) 1);
                A06(A0A28);
                A07(A0A28);
                A02(str17, A0I17, A0A28);
                byte[] A0A29 = A0A((byte) 42, (byte) 3, 16);
                A0A29[2] = 40;
                A0A29[3] = Byte.MIN_VALUE;
                A0A29[4] = -14;
                A0A29[5] = 1;
                A08(A0A29, (byte) 0);
                A06(A0A29);
                A07(A0A29);
                A0A29[14] = 114;
                A04(str17, A0I17, A0A29, (byte) 96, 15);
                byte[] A0A30 = A0A((byte) 42, (byte) 3, 16);
                A0A30[2] = 40;
                A0A30[3] = Byte.MIN_VALUE;
                A0A30[4] = -14;
                A0A30[5] = 49;
                A0A30[6] = 0;
                A0A30[7] = -57;
                A06(A0A30);
                A07(A0A30);
                A0A30[14] = 114;
                A04(str17, A0I17, A0A30, (byte) 96, 15);
                A00.put(str17, A0I17);
            } catch (UnknownHostException unused17) {
            }
        }
        String[] strArr18 = {"v.whatsapp.net", "v.whatsapp.net."};
        int i18 = 0;
        do {
            String str18 = strArr18[i18];
            try {
                ArrayList A0I18 = AnonymousClass001.A0I();
                byte[] A098 = A09();
                A098[2] = 65;
                A04(str18, A0I18, A098, (byte) 49, 3);
                byte[] A099 = A09();
                A099[2] = 88;
                A04(str18, A0I18, A099, (byte) 60, 3);
                byte[] bArr8 = new byte[4];
                A05(bArr8);
                bArr8[2] = 19;
                A04(str18, A0I18, bArr8, (byte) 53, 3);
                byte[] A0910 = A09();
                A0910[2] = 93;
                A04(str18, A0I18, A0910, (byte) 53, 3);
                byte[] A0911 = A09();
                A0911[2] = 66;
                A04(str18, A0I18, A0911, (byte) 56, 3);
                byte[] bArr9 = new byte[4];
                A05(bArr9);
                bArr9[2] = -27;
                A04(str18, A0I18, bArr9, (byte) 60, 3);
                byte[] A0912 = A09();
                A0912[2] = 70;
                A04(str18, A0I18, A0912, (byte) 49, 3);
                byte[] bArr10 = new byte[4];
                A05(bArr10);
                bArr10[2] = 11;
                A04(str18, A0I18, bArr10, (byte) 53, 3);
                byte[] A0913 = A09();
                A0913[2] = 71;
                A04(str18, A0I18, A0913, (byte) 49, 3);
                byte[] bArr11 = new byte[4];
                A05(bArr11);
                bArr11[2] = -15;
                A04(str18, A0I18, bArr11, (byte) 60, 3);
                byte[] A0914 = A09();
                A0914[2] = 67;
                A04(str18, A0I18, A0914, (byte) 52, 3);
                byte[] bArr12 = new byte[4];
                A05(bArr12);
                bArr12[2] = 14;
                A04(str18, A0I18, bArr12, (byte) 52, 3);
                byte[] bArr13 = new byte[4];
                A05(bArr13);
                bArr13[2] = 3;
                A04(str18, A0I18, bArr13, (byte) 54, 3);
                byte[] bArr14 = new byte[4];
                A05(bArr14);
                bArr14[2] = 22;
                A04(str18, A0I18, bArr14, (byte) 53, 3);
                byte[] A0A31 = A0A((byte) 42, (byte) 3, 16);
                A0A31[2] = 40;
                A0A31[3] = Byte.MIN_VALUE;
                A0A31[4] = -14;
                A0A31[5] = 17;
                A0A31[6] = 0;
                A0A31[7] = -59;
                A0A31[8] = -6;
                A0A31[9] = -50;
                A0A31[10] = -80;
                A07(A0A31);
                A0A31[14] = 1;
                A04(str18, A0I18, A0A31, (byte) 103, 15);
                byte[] A0A32 = A0A((byte) 42, (byte) 3, 16);
                A0A32[2] = 40;
                A0A32[3] = Byte.MIN_VALUE;
                A0A32[4] = -14;
                A0A32[5] = 17;
                A0A32[6] = 1;
                A0A32[7] = -63;
                A06(A0A32);
                A07(A0A32);
                A0A32[14] = 1;
                A04(str18, A0I18, A0A32, (byte) 103, 15);
                byte[] A0A33 = A0A((byte) 42, (byte) 3, 16);
                A0A33[2] = 40;
                A0A33[3] = Byte.MIN_VALUE;
                A0A33[4] = -14;
                A0A33[5] = 52;
                A08(A0A33, (byte) 0);
                A06(A0A33);
                A07(A0A33);
                A0A33[14] = 1;
                A04(str18, A0I18, A0A33, (byte) 103, 15);
                byte[] A0A34 = A0A((byte) 42, (byte) 3, 16);
                A0A34[2] = 40;
                A0A34[3] = Byte.MIN_VALUE;
                A0A34[4] = -14;
                A0A34[5] = 52;
                A08(A0A34, (byte) 1);
                A06(A0A34);
                A07(A0A34);
                A0A34[14] = 1;
                A04(str18, A0I18, A0A34, (byte) 103, 15);
                byte[] A0A35 = A0A((byte) 42, (byte) 3, 16);
                A0A35[2] = 40;
                A0A35[3] = Byte.MIN_VALUE;
                A0A35[4] = -14;
                A0A35[5] = 3;
                A0A35[6] = 0;
                A0A35[7] = -59;
                A06(A0A35);
                A07(A0A35);
                A0A35[14] = 1;
                A04(str18, A0I18, A0A35, (byte) 103, 15);
                byte[] A0A36 = A0A((byte) 42, (byte) 3, 16);
                A0A36[2] = 40;
                A0A36[3] = Byte.MIN_VALUE;
                A0A36[4] = -14;
                A0A36[5] = 3;
                A0A36[6] = 1;
                A0A36[7] = -63;
                A06(A0A36);
                A07(A0A36);
                A0A36[14] = 1;
                A04(str18, A0I18, A0A36, (byte) 103, 15);
                byte[] A0A37 = A0A((byte) 42, (byte) 3, 16);
                A0A37[2] = 40;
                A0A37[3] = Byte.MIN_VALUE;
                A0A37[4] = -14;
                A0A37[5] = 13;
                A0A37[6] = 0;
                A0A37[7] = -59;
                A06(A0A37);
                A07(A0A37);
                A0A37[14] = 1;
                A04(str18, A0I18, A0A37, (byte) 103, 15);
                byte[] A0A38 = A0A((byte) 42, (byte) 3, 16);
                A0A38[2] = 40;
                A0A38[3] = Byte.MIN_VALUE;
                A0A38[4] = -14;
                A0A38[5] = 13;
                A0A38[6] = 1;
                A0A38[7] = -59;
                A06(A0A38);
                A07(A0A38);
                A0A38[14] = 1;
                A04(str18, A0I18, A0A38, (byte) 103, 15);
                byte[] A0A39 = A0A((byte) 42, (byte) 3, 16);
                A0A39[2] = 40;
                A0A39[3] = Byte.MIN_VALUE;
                A0A39[4] = -14;
                A0A39[5] = 18;
                A0A39[6] = 0;
                A0A39[7] = -59;
                A06(A0A39);
                A07(A0A39);
                A0A39[14] = 1;
                A04(str18, A0I18, A0A39, (byte) 103, 15);
                byte[] A0A40 = A0A((byte) 42, (byte) 3, 16);
                A0A40[2] = 40;
                A0A40[3] = Byte.MIN_VALUE;
                A0A40[4] = -14;
                A0A40[5] = 18;
                A0A40[6] = 1;
                A0A40[7] = -47;
                A06(A0A40);
                A07(A0A40);
                A0A40[14] = 1;
                A04(str18, A0I18, A0A40, (byte) 103, 15);
                byte[] A0A41 = A0A((byte) 42, (byte) 3, 16);
                A0A41[2] = 40;
                A0A41[3] = Byte.MIN_VALUE;
                A0A41[4] = -14;
                A0A41[5] = 44;
                A0A41[6] = 0;
                A0A41[7] = -59;
                A06(A0A41);
                A07(A0A41);
                A0A41[14] = 1;
                A04(str18, A0I18, A0A41, (byte) 103, 15);
                byte[] A0A42 = A0A((byte) 42, (byte) 3, 16);
                A0A42[2] = 40;
                A0A42[3] = Byte.MIN_VALUE;
                A0A42[4] = -14;
                A0A42[5] = 44;
                A0A42[6] = 1;
                A0A42[7] = -59;
                A06(A0A42);
                A07(A0A42);
                A0A42[14] = 1;
                A04(str18, A0I18, A0A42, (byte) 103, 15);
                byte[] A0A43 = A0A((byte) 42, (byte) 3, 16);
                A0A43[2] = 40;
                A0A43[3] = Byte.MIN_VALUE;
                A0A43[4] = -14;
                A0A43[5] = 1;
                A0A43[6] = 0;
                A0A43[7] = -59;
                A06(A0A43);
                A07(A0A43);
                A0A43[14] = 1;
                A04(str18, A0I18, A0A43, (byte) 103, 15);
                byte[] A0A44 = A0A((byte) 42, (byte) 3, 16);
                A0A44[2] = 40;
                A0A44[3] = Byte.MIN_VALUE;
                A0A44[4] = -14;
                A0A44[5] = 49;
                A08(A0A44, (byte) 0);
                A06(A0A44);
                A07(A0A44);
                A0A44[14] = 1;
                A04(str18, A0I18, A0A44, (byte) 103, 15);
                A00.put(str18, A0I18);
            } catch (UnknownHostException unused18) {
            }
            i18++;
        } while (i18 < 2);
    }
}
