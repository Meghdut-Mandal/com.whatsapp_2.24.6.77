package X;

/* renamed from: X.9hX  reason: invalid class name and case insensitive filesystem */
public abstract class C200519hX {
    public static void A01(byte[] bArr) {
        byte[] bArr2 = bArr;
        byte[] bArr3 = bArr2;
        long A09 = C165567td.A09(bArr3, 0);
        long A092 = C165567td.A09(bArr3, 5);
        long A093 = C165567td.A09(bArr3, 13);
        long A094 = C165567td.A09(bArr3, 18);
        long A095 = C165567td.A09(bArr3, 21);
        long A096 = C165567td.A09(bArr3, 26);
        long A097 = C165567td.A09(bArr3, 34);
        long A098 = C165567td.A09(bArr3, 39);
        long A099 = C165567td.A09(bArr3, 42);
        long A0E = ((C165577te.A0E(bArr3, 47) | C165567td.A09(bArr3, 47)) >>> 2) & 2097151;
        long A00 = (A00(bArr3, 49) >>> 7) & 2097151;
        long A002 = (A00(bArr3, 52) >>> 4) & 2097151;
        long A0E2 = ((C165577te.A0E(bArr3, 55) | C165567td.A09(bArr3, 55)) >>> 1) & 2097151;
        long A003 = (A00(bArr3, 57) >>> 6) & 2097151;
        long A004 = A00(bArr3, 60) >>> 3;
        long A005 = ((A00(bArr3, 28) >>> 7) & 2097151) + (A004 * 666643);
        long A006 = ((A00(bArr3, 31) >>> 4) & 2097151) + (A004 * 470296);
        long A0E3 = (((C165577te.A0E(bArr3, 34) | A097) >>> 1) & 2097151) + (A004 * 654183);
        long A007 = ((A00(bArr3, 36) >>> 6) & 2097151) - (A004 * 997805);
        long A0E4 = (((C165577te.A0E(bArr3, 39) | A098) >>> 3) & 2097151) + (A004 * 136657);
        long A0E5 = ((C165577te.A0E(bArr3, 42) | A099) & 2097151) - (A004 * 683901);
        long A0E6 = (((C165577te.A0E(bArr3, 26) | A096) >>> 2) & 2097151) + (A003 * 666643);
        long A008 = ((A00(bArr3, 23) >>> 5) & 2097151) + (A0E2 * 666643);
        long j = (A007 + (A003 * 136657)) - (A0E2 * 683901);
        long A0E7 = ((C165577te.A0E(bArr3, 21) | A095) & 2097151) + (A002 * 666643);
        long A0E8 = (((C165577te.A0E(bArr3, 18) | A094) >>> 3) & 2097151) + (A00 * 666643);
        long j2 = (((A006 + (A003 * 654183)) - (A0E2 * 997805)) + (A002 * 136657)) - (A00 * 683901);
        long A009 = ((A00(bArr3, 15) >>> 6) & 2097151) + (A0E * 666643);
        long j3 = A0E7 + (A00 * 470296) + (A0E * 654183);
        long j4 = (((A0E6 + (A0E2 * 470296)) + (A002 * 654183)) - (A00 * 997805)) + (A0E * 136657);
        long j5 = (A009 + 1048576) >> 21;
        long j6 = A0E8 + (A0E * 470296) + j5;
        long j7 = A009 - (j5 << 21);
        long j8 = (j3 + 1048576) >> 21;
        long j9 = (((A008 + (A002 * 470296)) + (A00 * 654183)) - (A0E * 997805)) + j8;
        long j10 = j3 - (j8 << 21);
        long j11 = (j4 + 1048576) >> 21;
        long j12 = (((((A005 + (A003 * 470296)) + (A0E2 * 654183)) - (A002 * 997805)) + (A00 * 136657)) - (A0E * 683901)) + j11;
        long j13 = j4 - (j11 << 21);
        long j14 = (j2 + 1048576) >> 21;
        long j15 = (((A0E3 - (A003 * 997805)) + (A0E2 * 136657)) - (A002 * 683901)) + j14;
        long j16 = j2 - (j14 << 21);
        long j17 = (j + 1048576) >> 21;
        long j18 = (A0E4 - (A003 * 683901)) + j17;
        long j19 = j - (j17 << 21);
        long j20 = (A0E5 + 1048576) >> 21;
        long A0010 = ((A00(bArr3, 44) >>> 5) & 2097151) + j20;
        long j21 = A0E5 - (j20 << 21);
        long j22 = (j6 + 1048576) >> 21;
        long j23 = j10 + j22;
        long j24 = j6 - (j22 << 21);
        long j25 = (j9 + 1048576) >> 21;
        long j26 = j13 + j25;
        long j27 = j9 - (j25 << 21);
        long j28 = (j12 + 1048576) >> 21;
        long j29 = j16 + j28;
        long j30 = j12 - (j28 << 21);
        long j31 = (j15 + 1048576) >> 21;
        long j32 = j19 + j31;
        long j33 = j15 - (j31 << 21);
        long j34 = (j18 + 1048576) >> 21;
        long j35 = j21 + j34;
        long j36 = j18 - (j34 << 21);
        long A0E9 = (((C165577te.A0E(bArr3, 13) | A093) >>> 1) & 2097151) + (A0010 * 666643);
        long j37 = j26 - (A0010 * 683901);
        long A0011 = ((A00(bArr3, 10) >>> 4) & 2097151) + (j35 * 666643);
        long A0012 = ((A00(bArr3, 7) >>> 7) & 2097151) + (j36 * 666643);
        long j38 = ((j23 - (A0010 * 997805)) + (j35 * 136657)) - (j36 * 683901);
        long A0E10 = (((C165577te.A0E(bArr3, 5) | A092) >>> 2) & 2097151) + (j32 * 666643);
        long A0013 = ((A00(bArr3, 2) >>> 5) & 2097151) + (j33 * 666643);
        long j39 = ((((j7 + (A0010 * 470296)) + (j35 * 654183)) - (j36 * 997805)) + (j32 * 136657)) - (j33 * 683901);
        long A0E11 = ((C165577te.A0E(bArr3, 0) | A09) & 2097151) + (j29 * 666643);
        long j40 = A0E10 + (j33 * 470296) + (j29 * 654183);
        long j41 = (((A0011 + (j36 * 470296)) + (j32 * 654183)) - (j33 * 997805)) + (j29 * 136657);
        long j42 = (A0E11 + 1048576) >> 21;
        long j43 = A0013 + (j29 * 470296) + j42;
        long j44 = A0E11 - (j42 << 21);
        long j45 = (j40 + 1048576) >> 21;
        long j46 = (((A0012 + (j32 * 470296)) + (j33 * 654183)) - (j29 * 997805)) + j45;
        long j47 = j40 - (j45 << 21);
        long j48 = (j41 + 1048576) >> 21;
        long j49 = (((((A0E9 + (j35 * 470296)) + (j36 * 654183)) - (j32 * 997805)) + (j33 * 136657)) - (j29 * 683901)) + j48;
        long j50 = j41 - (j48 << 21);
        long j51 = (j39 + 1048576) >> 21;
        long j52 = ((((j24 + (A0010 * 654183)) - (j35 * 997805)) + (j36 * 136657)) - (j32 * 683901)) + j51;
        long j53 = j39 - (j51 << 21);
        long j54 = (j38 + 1048576) >> 21;
        long j55 = ((j27 + (A0010 * 136657)) - (j35 * 683901)) + j54;
        long j56 = j38 - (j54 << 21);
        long j57 = (j37 + 1048576) >> 21;
        long j58 = j30 + j57;
        long j59 = j37 - (j57 << 21);
        long j60 = (j43 + 1048576) >> 21;
        long j61 = j47 + j60;
        long j62 = j43 - (j60 << 21);
        long j63 = (j46 + 1048576) >> 21;
        long j64 = j50 + j63;
        long j65 = j46 - (j63 << 21);
        long j66 = (j49 + 1048576) >> 21;
        long j67 = j53 + j66;
        long j68 = j49 - (j66 << 21);
        long j69 = (j52 + 1048576) >> 21;
        long j70 = j56 + j69;
        long j71 = j52 - (j69 << 21);
        long j72 = (j55 + 1048576) >> 21;
        long j73 = j59 + j72;
        long j74 = j55 - (j72 << 21);
        long j75 = (j58 + 1048576) >> 21;
        long j76 = j75 + 0;
        long j77 = j44 + (j76 * 666643);
        long j78 = j77 >> 21;
        long j79 = j62 + (j76 * 470296) + j78;
        long j80 = j77 - (j78 << 21);
        long j81 = j79 >> 21;
        long j82 = j61 + (j76 * 654183) + j81;
        long j83 = j79 - (j81 << 21);
        long j84 = j82 >> 21;
        long j85 = (j65 - (j76 * 997805)) + j84;
        long j86 = j82 - (j84 << 21);
        long j87 = j85 >> 21;
        long j88 = j64 + (j76 * 136657) + j87;
        long j89 = j85 - (j87 << 21);
        long j90 = j88 >> 21;
        long j91 = (j68 - (j76 * 683901)) + j90;
        long j92 = j88 - (j90 << 21);
        long j93 = j91 >> 21;
        long j94 = j67 + j93;
        long j95 = j91 - (j93 << 21);
        long j96 = j94 >> 21;
        long j97 = j71 + j96;
        long j98 = j94 - (j96 << 21);
        long j99 = j97 >> 21;
        long j100 = j70 + j99;
        long j101 = j97 - (j99 << 21);
        long j102 = j100 >> 21;
        long j103 = j74 + j102;
        long j104 = j100 - (j102 << 21);
        long j105 = j103 >> 21;
        long j106 = j73 + j105;
        long j107 = j103 - (j105 << 21);
        long j108 = j106 >> 21;
        long j109 = (j58 - (j75 << 21)) + j108;
        long j110 = j106 - (j108 << 21);
        long j111 = j109 >> 21;
        long j112 = j111 + 0;
        long j113 = j80 + (666643 * j112);
        long j114 = j95 - (j112 * 683901);
        long j115 = j113 >> 21;
        long j116 = j83 + (470296 * j112) + j115;
        long j117 = j113 - (j115 << 21);
        long j118 = j116 >> 21;
        long j119 = j86 + (654183 * j112) + j118;
        long j120 = j116 - (j118 << 21);
        long j121 = j119 >> 21;
        long j122 = (j89 - (997805 * j112)) + j121;
        long j123 = j119 - (j121 << 21);
        long j124 = j122 >> 21;
        long j125 = j92 + (136657 * j112) + j124;
        long j126 = j122 - (j124 << 21);
        long j127 = j125 >> 21;
        long j128 = j114 + j127;
        long j129 = j125 - (j127 << 21);
        long j130 = j128 >> 21;
        long j131 = j98 + j130;
        long j132 = j128 - (j130 << 21);
        long j133 = j131 >> 21;
        long j134 = j101 + j133;
        long j135 = j131 - (j133 << 21);
        long j136 = j134 >> 21;
        long j137 = j104 + j136;
        long j138 = j134 - (j136 << 21);
        long j139 = j137 >> 21;
        long j140 = j107 + j139;
        long j141 = j137 - (j139 << 21);
        long j142 = j140 >> 21;
        long j143 = j110 + j142;
        long j144 = j140 - (j142 << 21);
        long j145 = j143 >> 21;
        long j146 = (j109 - (j111 << 21)) + j145;
        long j147 = j143 - (j145 << 21);
        bArr2[0] = (byte) ((int) (j117 >> 0));
        C165577te.A0s(j117, bArr2, 8, 1);
        bArr2[2] = C165617ti.A00(5, j120, j117 >> 16);
        bArr2[3] = (byte) ((int) (j120 >> 3));
        C165577te.A0s(j120, bArr2, 11, 4);
        bArr2[5] = C165617ti.A00(2, j123, j120 >> 19);
        bArr2[6] = (byte) ((int) (j123 >> 6));
        bArr2[7] = C165617ti.A00(7, j126, j123 >> 14);
        C165577te.A0s(j126, bArr2, 1, 8);
        bArr2[9] = (byte) ((int) (j126 >> 9));
        bArr2[10] = C165617ti.A00(4, j129, j126 >> 17);
        bArr2[11] = (byte) ((int) (j129 >> 4));
        bArr2[12] = (byte) ((int) (j129 >> 12));
        bArr2[13] = C165617ti.A00(1, j132, j129 >> 20);
        bArr2[14] = (byte) ((int) (j132 >> 7));
        bArr2[15] = C165617ti.A00(6, j135, j132 >> 15);
        bArr2[16] = (byte) ((int) (j135 >> 2));
        bArr2[17] = (byte) ((int) (j135 >> 10));
        bArr2[18] = C165617ti.A00(3, j138, j135 >> 18);
        bArr2[19] = (byte) ((int) (j138 >> 5));
        bArr2[20] = (byte) ((int) (j138 >> 13));
        C165577te.A0s(j141, bArr2, 0, 21);
        bArr2[22] = (byte) ((int) (j141 >> 8));
        bArr2[23] = C165617ti.A00(5, j144, j141 >> 16);
        bArr2[24] = (byte) ((int) (j144 >> 3));
        bArr2[25] = (byte) ((int) (j144 >> 11));
        bArr2[26] = C165617ti.A00(2, j147, j144 >> 19);
        bArr2[27] = (byte) ((int) (j147 >> 6));
        C165607th.A1S(bArr2, (int) ((j147 >> 14) | (j146 << 7)), j146);
    }

    public static long A00(byte[] bArr, int i) {
        return ((((long) bArr[i + 3]) << 24) & 4278190080L) | C165567td.A09(bArr, i) | C165577te.A0E(bArr, i);
    }
}