package X;

/* renamed from: X.9hW  reason: invalid class name and case insensitive filesystem */
public abstract class C200509hW {
    public static void A00(byte[] bArr, int[] iArr) {
        byte[] bArr2 = bArr;
        long A09 = C165567td.A09(bArr2, 0) | C165577te.A0E(bArr2, 0);
        long A0E = (C165577te.A0E(bArr2, 4) | C165567td.A09(bArr2, 4)) << 6;
        long A092 = C165567td.A09(bArr2, 7);
        long A0E2 = (C165577te.A0E(bArr2, 10) | C165567td.A09(bArr2, 10)) << 3;
        long A093 = C165567td.A09(bArr2, 13);
        long A094 = ((((long) bArr[19]) << 24) & 4278190080L) | C165567td.A09(bArr2, 16) | C165577te.A0E(bArr2, 16);
        long A095 = C165567td.A09(bArr2, 20);
        long A0E3 = (C165577te.A0E(bArr2, 23) | C165567td.A09(bArr2, 23)) << 5;
        long A096 = C165567td.A09(bArr2, 26);
        long A0E4 = ((C165577te.A0E(bArr2, 29) | C165567td.A09(bArr2, 29)) & 8388607) << 2;
        long j = (A0E4 + 16777216) >> 25;
        long j2 = (((((long) bArr[3]) << 24) & 4278190080L) | A09) + (19 * j);
        long j3 = (A0E + 16777216) >> 25;
        long A0E5 = ((C165577te.A0E(bArr2, 7) | A092) << 5) + j3;
        long j4 = A0E - (j3 << 25);
        long j5 = (A0E2 + 16777216) >> 25;
        long A0E6 = ((C165577te.A0E(bArr2, 13) | A093) << 2) + j5;
        long j6 = A0E2 - (j5 << 25);
        long j7 = (A094 + 16777216) >> 25;
        long A0E7 = ((C165577te.A0E(bArr2, 20) | A095) << 7) + j7;
        long j8 = A094 - (j7 << 25);
        long j9 = (A0E3 + 16777216) >> 25;
        long A0E8 = ((C165577te.A0E(bArr2, 26) | A096) << 4) + j9;
        long j10 = A0E3 - (j9 << 25);
        long j11 = (j2 + 33554432) >> 26;
        long j12 = j4 + j11;
        long j13 = j2 - (j11 << 26);
        long j14 = (A0E5 + 33554432) >> 26;
        long j15 = j6 + j14;
        long j16 = A0E5 - (j14 << 26);
        long j17 = (A0E6 + 33554432) >> 26;
        long j18 = j8 + j17;
        long j19 = A0E6 - (j17 << 26);
        long j20 = (A0E7 + 33554432) >> 26;
        long j21 = j10 + j20;
        long j22 = A0E7 - (j20 << 26);
        long j23 = (A0E8 + 33554432) >> 26;
        iArr[0] = (int) j13;
        iArr[1] = (int) j12;
        iArr[2] = (int) j16;
        iArr[3] = (int) j15;
        iArr[4] = (int) j19;
        iArr[5] = (int) j18;
        iArr[6] = (int) j22;
        iArr[7] = (int) j21;
        iArr[8] = (int) (A0E8 - (j23 << 26));
        iArr[9] = (int) ((A0E4 - (j << 25)) + j23);
    }
}
