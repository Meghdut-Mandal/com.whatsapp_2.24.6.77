package X;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/* renamed from: X.8xE  reason: invalid class name and case insensitive filesystem */
public class C187098xE extends ByteArrayOutputStream {
    public synchronized void reset() {
        Arrays.fill(this.buf, 0, this.count, (byte) 0);
        this.count = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0587, code lost:
        r1 = X.C165607th.A0E(r56, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x058d, code lost:
        if (r1 < 10) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x058f, code lost:
        r2 = r3.A02;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0592, code lost:
        r1 = X.C165607th.A0E(r55, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0598, code lost:
        if (r1 < 10) goto L_0x0592;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x059a, code lost:
        r2 = r3.A03;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x059d, code lost:
        r1 = X.C165607th.A0E(r54, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x05a3, code lost:
        if (r1 < 10) goto L_0x059d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x05a5, code lost:
        X.C203779or.A0D(r4, r52, r3.A00);
        r11[r6] = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x05b0, code lost:
        if ((r37 + r6) == 10) goto L_0x05c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x05b2, code lost:
        X.C203469o5.A04(r4, r52, r56, r55, r54);
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x05bf, code lost:
        if (r5 >= 8) goto L_0x05c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x05c2, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x05c6, code lost:
        r8 = new X.AnonymousClass9M1[8];
        r8[0] = r7;
        r6 = 0;
        r7 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x05cc, code lost:
        r5 = 1 << r6;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x05cf, code lost:
        if (r4 >= r5) goto L_0x05e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x05d1, code lost:
        r3 = r8[r7 - r5];
        r2 = r11[r6];
        r1 = new X.AnonymousClass9M1();
        r8[r7] = r1;
        X.C203469o5.A01(r3, r2, r1, false);
        r4 = r4 + 1;
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x05e7, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x05ea, code lost:
        if (r6 < 3) goto L_0x05cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x05ec, code lost:
        r44 = new int[80];
        r7 = new int[10];
        r1 = r8[0].A03;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x05f9, code lost:
        r0 = X.C165607th.A0E(r1, r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x05fd, code lost:
        if (r0 < 10) goto L_0x05f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x05ff, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0600, code lost:
        r1 = X.C165607th.A0E(r7, r44, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0606, code lost:
        if (r1 < 10) goto L_0x0600;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0608, code lost:
        r43 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x060a, code lost:
        r43 = r43 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x060e, code lost:
        if (r43 >= 8) goto L_0x0625;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0610, code lost:
        X.C203779or.A0D(r7, r8[r43].A03, r7);
        r3 = r43 * 10;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x061a, code lost:
        r44[r3 + r0] = r7[r0];
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0622, code lost:
        if (r0 >= 10) goto L_0x060a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0625, code lost:
        X.C203779or.A0C(r7, r7, r7);
        r1 = new int[10];
        r42 = new int[8];
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x062f, code lost:
        r0 = X.C165607th.A0E(r7, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0633, code lost:
        if (r0 < 10) goto L_0x062f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0635, code lost:
        X.C203779or.A05(r1);
        r0 = r42;
        X.C203779or.A01(0, 0, r1, r0);
        X.C203779or.A01(5, 4, r1, r0);
        r1 = X.C203779or.A00;
        r6 = 256 - java.lang.Integer.numberOfLeadingZeros(r1[7]);
        r14 = (r6 + 29) / 30;
        r41 = new int[4];
        r5 = new int[r14];
        r0 = new int[r14];
        r40 = r0;
        r13 = new int[r14];
        r12 = new int[r14];
        r11 = new int[r14];
        r39 = 0;
        r0[0] = 1;
        X.C200499hV.A00(r42, r12, r6);
        X.C200499hV.A00(r1, r11, r6);
        java.lang.System.arraycopy(r11, 0, r13, 0, r14);
        r4 = r14 - 1;
        r3 = -1 - (java.lang.Integer.numberOfLeadingZeros(r12[r4] | 1) - (((r14 * 30) + 2) - r6));
        r1 = r11[0];
        r50 = (2 - (r1 * r1)) * r1;
        r50 = r50 * (2 - (r1 * r50));
        r50 = r50 * (2 - (r1 * r50));
        r50 = r50 * (2 - (r1 * r50));
        r2 = r6 * 49;
        r1 = 47;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x06a5, code lost:
        if (r6 >= 46) goto L_0x06a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x06a7, code lost:
        r1 = 80;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x06a9, code lost:
        r51 = (r2 + r1) / 17;
        r2 = r14;
        r36 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x06b1, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x06b2, code lost:
        if (r0 >= r2) goto L_0x0781;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x06b6, code lost:
        if (r12[r0] == 0) goto L_0x077d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x06bc, code lost:
        if (r36 >= r51) goto L_0x07e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x06be, code lost:
        r36 = r36 + 30;
        r35 = r13[0];
        r34 = r12[0];
        r1 = 30;
        r15 = 1;
        r33 = 0;
        r32 = 0;
        r31 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x06cd, code lost:
        r0 = java.lang.Integer.numberOfTrailingZeros((-1 << r1) | r34);
        r34 = r34 >> r0;
        r15 = r15 << r0;
        r33 = r33 << r0;
        r3 = r3 - r0;
        r1 = r1 - r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x06e0, code lost:
        if (r1 > 0) goto L_0x0722;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x06e2, code lost:
        r41[0] = r15;
        r41[1] = r33;
        r41[2] = r32;
        r41[3] = r31;
        X.C200499hV.A02(r5, r40, r41, r11, r14, r50);
        X.C200499hV.A01(r13, r12, r41, r2);
        r0 = r2 - 1;
        r26 = r13[r0];
        r25 = r12[r0];
        r15 = r2 - 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0711, code lost:
        if ((((r15 >> 31) | ((r26 >> 31) ^ r26)) | ((r25 >> 31) ^ r25)) != 0) goto L_0x06b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0713, code lost:
        r13[r15] = (r26 << 30) | r13[r15];
        r12[r15] = r12[r15] | (r25 << 30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0722, code lost:
        if (r3 >= 0) goto L_0x0760;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0724, code lost:
        r3 = -r3;
        r26 = -r35;
        r46 = -r15;
        r45 = -r33;
        r0 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0734, code lost:
        if (r0 <= r1) goto L_0x0737;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0736, code lost:
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0737, code lost:
        r25 = ((-1 >>> (32 - r0)) & 63) & ((r34 * r26) * ((r34 * r34) - 2));
        r35 = r34;
        r34 = r26;
        r15 = r32;
        r32 = r46;
        r33 = r31;
        r31 = r45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0752, code lost:
        r34 = r34 + (r35 * r25);
        r32 = r32 + (r15 * r25);
        r31 = r31 + (r25 * r33);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0760, code lost:
        r0 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0762, code lost:
        if (r0 <= r1) goto L_0x0765;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0067, code lost:
        r20 = new int[10];
        r21 = new int[10];
        r6 = new byte[32];
        java.lang.System.arraycopy(r2, 0, r6, 0, java.lang.Math.min(r2.length, 32));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0764, code lost:
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0765, code lost:
        r25 = ((-1 >>> (32 - r0)) & 15) & ((-((((r35 + 1) & 4) << 1) + r35)) * r34);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0779, code lost:
        r2 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x077d, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0781, code lost:
        r1 = r2 - 1;
        r15 = r13[r1] >> 31;
        r14 = r5[r4] >> 31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x078b, code lost:
        if (r14 >= 0) goto L_0x07ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x078d, code lost:
        r12 = 0;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x078f, code lost:
        if (r12 >= r4) goto L_0x07a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0791, code lost:
        r3 = X.C165607th.A0C(r11, r12, r5[r12], r3);
        r5[r12] = 1073741823 & r3;
        r3 = r3 >> 30;
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x07a2, code lost:
        r0 = X.C165607th.A0C(r11, r4, r5[r4], r3);
        r5[r4] = r0;
        r14 = r0 >> 30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0084, code lost:
        if (X.C203469o5.A05(r6) == false) goto L_0x01af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x07ac, code lost:
        if (r15 >= 0) goto L_0x07de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x07ae, code lost:
        r0 = 0;
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x07b0, code lost:
        if (r0 >= r4) goto L_0x07c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x07b2, code lost:
        r12 = r12 - r5[r0];
        r5[r0] = 1073741823 & r12;
        r12 = r12 >> 30;
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x07c0, code lost:
        r12 = r12 - r5[r4];
        r5[r4] = r12;
        r14 = r12 >> 30;
        r0 = 0;
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x07c9, code lost:
        if (r0 >= r1) goto L_0x07d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x07cb, code lost:
        r12 = r12 - r13[r0];
        r13[r0] = 1073741823 & r12;
        r12 = r12 >> 30;
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x07d9, code lost:
        r13[r1] = r12 - r13[r1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x07de, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x07e1, code lost:
        if (r13[0] == 1) goto L_0x07fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0086, code lost:
        r4 = r6[31];
        r9 = (r4 & 128) >>> 7;
        r6[31] = (byte) (r4 & Byte.MAX_VALUE);
        r0 = r21;
        X.C203779or.A02(r6, r0, 0, 0);
        X.C203779or.A02(r6, r0, 16, 5);
        r21[9] = r21[9] & 16777215;
        r13 = new int[10];
        r12 = new int[10];
        X.C203779or.A0A(r21, r13);
        r18 = X.C203469o5.A05;
        X.C203779or.A0D(r18, r13, r12);
        r13[0] = r13[0] - 1;
        X.C165587tf.A1V(r12, 0);
        r15 = new int[10];
        r14 = new int[10];
        X.C203779or.A0D(r13, r12, r15);
        X.C203779or.A0A(r12, r14);
        X.C203779or.A0D(r15, r14, r15);
        X.C203779or.A0A(r14, r14);
        X.C203779or.A0D(r14, r15, r14);
        r10 = new int[10];
        r8 = new int[10];
        X.C203779or.A0A(r14, r10);
        X.C203779or.A0D(r14, r10, r10);
        r7 = new int[10];
        X.C203779or.A0A(r10, r7);
        X.C203779or.A0D(r14, r7, r7);
        X.C203779or.A0B(r7, r7, 2);
        X.C203779or.A0D(r10, r7, r7);
        r5 = new int[10];
        X.C203779or.A0B(r7, r5, 5);
        X.C203779or.A0D(r7, r5, r5);
        r4 = new int[10];
        X.C203779or.A0B(r5, r4, 5);
        X.C203779or.A0D(r7, r4, r4);
        X.C203779or.A0B(r4, r7, 10);
        X.C203779or.A0D(r5, r7, r7);
        X.C203779or.A0B(r7, r5, 25);
        X.C203779or.A0D(r7, r5, r5);
        X.C203779or.A0B(r5, r4, 25);
        X.C203779or.A0D(r7, r4, r4);
        X.C203779or.A0B(r4, r7, 50);
        X.C203779or.A0D(r5, r7, r7);
        X.C203779or.A0B(r7, r5, 125);
        X.C203779or.A0D(r7, r5, r5);
        X.C203779or.A0B(r5, r7, 2);
        X.C203779or.A0D(r7, r14, r8);
        X.C203779or.A0D(r8, r15, r8);
        r0 = new int[10];
        X.C203779or.A0A(r8, r0);
        X.C203779or.A0D(r0, r12, r0);
        X.C203779or.A0E(r0, r13, r10);
        X.C203779or.A05(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x07e3, code lost:
        r0 = r42;
        X.C203779or.A00(0, 0, r0, r7);
        X.C203779or.A00(4, 5, r0, r7);
        r7[9] = r7[9] & 16777215;
        r6 = r43 - 1;
        r2 = new int[10];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x07fd, code lost:
        if (r1 >= r2) goto L_0x0806;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0801, code lost:
        if (r13[r1] != 0) goto L_0x07e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0803, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0806, code lost:
        if (r14 >= 0) goto L_0x0825;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0808, code lost:
        r2 = 0;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x080a, code lost:
        if (r2 >= r4) goto L_0x081d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x080c, code lost:
        r1 = X.C165607th.A0C(r11, r2, r5[r2], r1);
        r5[r2] = 1073741823 & r1;
        r1 = r1 >> 30;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x081d, code lost:
        r5[r4] = X.C165607th.A0C(r11, r4, r5[r4], r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0825, code lost:
        r12 = 0;
        r4 = 0;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0829, code lost:
        if (r6 <= 0) goto L_0x07e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0831, code lost:
        if (r4 >= java.lang.Math.min(32, r6)) goto L_0x083f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0833, code lost:
        r2 = r2 | (((long) r5[r39]) << r4);
        r4 = r4 + 30;
        r39 = r39 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x083f, code lost:
        r42[r12] = (int) r2;
        r2 = r2 >>> 32;
        r4 = r4 - 32;
        r6 = r6 - 32;
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x084c, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x084d, code lost:
        if (r6 <= 0) goto L_0x0876;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x084f, code lost:
        r5 = r6 - 1;
        r3 = r5 * 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0853, code lost:
        r2[r1] = r44[r3 + r1];
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x085b, code lost:
        if (r1 < 10) goto L_0x0853;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x085d, code lost:
        X.C203779or.A0D(r2, r7, r2);
        r4 = r6 * 10;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0863, code lost:
        r44[r4 + r3] = r2[r3];
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x086b, code lost:
        if (r3 < 10) goto L_0x0863;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x086d, code lost:
        X.C203779or.A0D(r7, r8[r6].A03, r7);
        r6 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0876, code lost:
        r1 = X.C165607th.A0E(r7, r44, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x087c, code lost:
        if (r1 < 10) goto L_0x0876;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x087e, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x087f, code lost:
        r3 = r8[r5];
        r1 = new int[10];
        r0 = new int[10];
        r6 = r5 * 10;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0888, code lost:
        r0[r4] = r44[r6 + r4];
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0890, code lost:
        if (r4 < 10) goto L_0x0888;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0892, code lost:
        X.C203779or.A0D(r3.A01, r0, r1);
        X.C203779or.A0D(r3.A02, r0, r0);
        r2 = new int[10];
        r3 = new int[10];
        r4 = new int[10];
        X.C203779or.A0F(r0, r1, r2, r3);
        X.C203779or.A0D(r1, r0, r4);
        X.C203779or.A0D(r4, X.C203469o5.A06, r4);
        X.C203779or.A05(r2);
        X.C203779or.A05(r3);
        r7 = X.C203469o5.A00;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x08b6, code lost:
        r7[r38 + r1] = r2[r1];
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x08be, code lost:
        if (r1 < 10) goto L_0x08b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x08c0, code lost:
        r6 = r38 + 10;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x08c3, code lost:
        r7[r6 + r2] = r3[r2];
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x08cb, code lost:
        if (r2 < 10) goto L_0x08c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x08cd, code lost:
        r3 = r6 + 10;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x08d0, code lost:
        r7[r3 + r2] = r4[r2];
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x08d8, code lost:
        if (r2 < 10) goto L_0x08d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x08da, code lost:
        r38 = r3 + 10;
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x08de, code lost:
        if (r5 < 8) goto L_0x087f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x08e0, code lost:
        r37 = r37 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x08e4, code lost:
        if (r37 >= 8) goto L_0x08e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x08e8, code lost:
        monitor-exit(r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:?, code lost:
        r9 = X.C203469o5.A06(r28, 7);
        r8 = X.C203469o5.A06(r27, 5);
        r5 = new X.AnonymousClass9M1();
        r4 = r5.A01;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x08ff, code lost:
        r1 = X.C165607th.A0E(r20, r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0148, code lost:
        r4 = 0;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0907, code lost:
        if (r1 < 10) goto L_0x08ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0909, code lost:
        r2 = r5.A02;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x090c, code lost:
        r1 = X.C165607th.A0E(r21, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0912, code lost:
        if (r1 < 10) goto L_0x090c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0914, code lost:
        X.C203779or.A06(r5.A03);
        X.C203779or.A0D(r4, r2, r5.A00);
        r7 = X.C203469o5.A07(r5, 8);
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0923, code lost:
        r23[r0] = 0;
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0929, code lost:
        if (r0 < 10) goto L_0x0923;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x092b, code lost:
        X.C203779or.A06(r59);
        X.C203779or.A06(r58);
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0932, code lost:
        r24[r0] = 0;
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0936, code lost:
        if (r0 < 10) goto L_0x0932;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x014a, code lost:
        r6 = r6 | r10[r4];
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0938, code lost:
        X.C203779or.A06(r57);
        r5 = 252;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x093d, code lost:
        r1 = r9[r5];
        r32 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0941, code lost:
        if (r1 == 0) goto L_0x095d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0943, code lost:
        r0 = r1 >> 31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:?, code lost:
        X.C203469o5.A02(X.C203469o5.A01[(r1 ^ r0) >>> 1], r24, r57, r23, r59, r58, X.AnonymousClass000.A1P(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x095d, code lost:
        r1 = r8[r5];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x095f, code lost:
        if (r1 == 0) goto L_0x0979;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0961, code lost:
        r0 = r1 >> 31;
        r1 = (r1 ^ r0) >>> 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0966, code lost:
        if (r0 == 0) goto L_0x096a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x014f, code lost:
        if (r4 < 10) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0968, code lost:
        r32 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x096a, code lost:
        X.C203469o5.A02(r7[r1], r24, r57, r23, r59, r58, r32);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0979, code lost:
        r5 = r5 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x097b, code lost:
        if (r5 >= 0) goto L_0x097e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x097e, code lost:
        X.C203469o5.A04(r24, r57, r23, r59, r58);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x098c, code lost:
        r4 = new byte[32];
        r5 = new int[10];
        r2 = new int[10];
        X.C203779or.A08(r58, r2);
        X.C203779or.A0D(r23, r2, r5);
        X.C203779or.A0D(r59, r2, r2);
        X.C203779or.A05(r5);
        X.C203779or.A05(r2);
        r7 = new int[10];
        r0 = new int[10];
        r3 = new int[10];
        X.C203779or.A0A(r5, r0);
        X.C203779or.A0A(r2, r3);
        X.C203779or.A0D(r0, r3, r7);
        X.C203779or.A0E(r3, r0, r3);
        X.C203779or.A0D(r7, r18, r7);
        r1 = 0;
        X.C165587tf.A1V(r7, 0);
        X.C203779or.A0E(r7, r3, r7);
        X.C203779or.A05(r7);
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x09cb, code lost:
        r3 = r3 | r7[r1];
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x09d0, code lost:
        if (r1 < 10) goto L_0x09cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x09d2, code lost:
        r3 = (((r3 >>> 1) | (r3 & 1)) - 1) >> 31;
        X.C203779or.A03(r4, r2, 0, 0);
        X.C203779or.A03(r4, r2, 5, 16);
        X.C165587tf.A1T(r4, (r5[0] & 1) << 7, r4[31], 31);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x09f2, code lost:
        if (r3 == 0) goto L_0x01af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x09fa, code lost:
        if (java.util.Arrays.equals(r4, r60) == false) goto L_0x01af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x09fc, code lost:
        r17 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x015e, code lost:
        if (X.AnonymousClass000.A1P((((r6 >>> 1) | (r6 & 1)) - 1) >> 31) == false) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0160, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0161, code lost:
        r4 = X.C165607th.A0E(r8, r20, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0167, code lost:
        if (r4 >= 10) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x016a, code lost:
        X.C203779or.A0C(r0, r13, r10);
        X.C203779or.A05(r10);
        r4 = 0;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0172, code lost:
        r5 = r5 | r10[r4];
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0177, code lost:
        if (r4 < 10) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0186, code lost:
        if (X.AnonymousClass000.A1P((((r5 >>> 1) | (r5 & 1)) - 1) >> 31) == false) goto L_0x01af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0188, code lost:
        X.C203779or.A0D(r8, X.C203779or.A01, r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x018f, code lost:
        X.C203779or.A05(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0195, code lost:
        if (r9 != 1) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0197, code lost:
        r4 = 0;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0199, code lost:
        r5 = r5 | r20[r4];
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x019e, code lost:
        if (r4 < 10) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01ad, code lost:
        if (X.AnonymousClass000.A1P((((r5 >>> 1) | (r5 & 1)) - 1) >> 31) == false) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01b8, code lost:
        if (r9 != (r20[0] & 1)) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01ba, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01bb, code lost:
        r20[r4] = -r20[r4];
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01c2, code lost:
        if (r4 >= 10) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01c5, code lost:
        r4 = new X.C22716AtK();
        r33 = new byte[64];
        r4.update(r60, 0, 32);
        r4.update(r2, 0, 32);
        r4.update(r24, 0, r1);
        r0 = r33;
        r4.B5n(r0, 0);
        r23 = ((long) X.C165577te.A0B(r0, 0)) & 4294967295L;
        r27 = ((long) (X.C203469o5.A00(r33, 4) << 4)) & 4294967295L;
        r25 = ((long) X.C165577te.A0B(r33, 7)) & 4294967295L;
        r29 = ((long) X.C165577te.A0B(r33, 35)) & 4294967295L;
        r40 = ((long) (X.C203469o5.A00(r33, 39) << 4)) & 4294967295L;
        r46 = ((long) X.C165577te.A0B(r33, 42)) & 4294967295L;
        r52 = ((long) (X.C203469o5.A00(r33, 46) << 4)) & 4294967295L;
        r56 = ((long) X.C165577te.A0B(r33, 49)) & 4294967295L;
        r54 = ((long) (X.C203469o5.A00(r33, 53) << 4)) & 4294967295L;
        r50 = ((long) X.C165577te.A0B(r33, 56)) & 4294967295L;
        r48 = ((long) (X.C203469o5.A00(r33, 60) << 4)) & 4294967295L;
        r31 = ((long) r33[63]) & 255;
        r10 = (((long) (X.C203469o5.A00(r33, 32) << 4)) & 4294967295L) - (r31 * -50998291);
        r48 = r48 + (r50 >> 28);
        r50 = r50 & 268435455;
        r2 = (((long) X.C165577te.A0B(r33, 28)) & 4294967295L) - (r48 * -50998291);
        r46 = (r46 - (r31 * -6428113)) - (r48 * 5343);
        r8 = (((long) (X.C203469o5.A00(r33, 25) << 4)) & 4294967295L) - (r50 * -50998291);
        r40 = ((r40 - (r31 * 127719000)) - (r48 * -6428113)) - (r50 * 5343);
        r54 = r54 + (r56 >> 28);
        r56 = r56 & 268435455;
        r12 = (((long) X.C165577te.A0B(r33, 21)) & 4294967295L) - (r54 * -50998291);
        r29 = (((r29 - (r31 * 19280294)) - (r48 * 127719000)) - (r50 * -6428113)) - (r54 * 5343);
        r14 = (((long) (X.C203469o5.A00(r33, 18) << 4)) & 4294967295L) - (r56 * -50998291);
        r10 = (((r10 - (r48 * 19280294)) - (r50 * 127719000)) - (r54 * -6428113)) - (r56 * 5343);
        r52 = (r52 - (r31 * 5343)) + (r46 >> 28);
        r4 = (((long) X.C165577te.A0B(r33, 14)) & 4294967295L) - (r52 * -50998291);
        r46 = (r46 & 268435455) + (r40 >> 28);
        r8 = (((r8 - (r54 * 19280294)) - (r56 * 127719000)) - (r52 * -6428113)) - (r46 * 5343);
        r40 = (r40 & 268435455) + (r29 >> 28);
        r29 = (r29 & 268435455) + (r10 >> 28);
        r27 = r27 - (r29 * -50998291);
        r25 = (r25 - (r40 * -50998291)) - (r29 * 19280294);
        r6 = (((((long) (X.C203469o5.A00(r33, 11) << 4)) & 4294967295L) - (r46 * -50998291)) - (r40 * 19280294)) - (r29 * 127719000);
        r4 = ((r4 - (r46 * 19280294)) - (r40 * 127719000)) - (r29 * -6428113);
        r14 = (((r14 - (r52 * 19280294)) - (r46 * 127719000)) - (r40 * -6428113)) - (r29 * 5343);
        r2 = ((((r2 - (r50 * 19280294)) - (r54 * 127719000)) - (r56 * -6428113)) - (r52 * 5343)) + (r8 >> 28);
        r2 = r2 & 268435455;
        r29 = r2 >>> 27;
        r10 = ((r10 & 268435455) + (r2 >> 28)) + r29;
        r23 = r23 - (r10 * -50998291);
        r27 = (r27 - (r10 * 19280294)) + (r23 >> 28);
        r25 = (r25 - (r10 * 127719000)) + (r27 >> 28);
        r6 = (r6 - (r10 * -6428113)) + (r25 >> 28);
        r4 = (r4 - (r10 * 5343)) + (r6 >> 28);
        r14 = r14 + (r4 >> 28);
        r12 = ((((r12 - (r56 * 19280294)) - (r52 * 127719000)) - (r46 * -6428113)) - (r40 * 5343)) + (r14 >> 28);
        r8 = (r8 & 268435455) + (r12 >> 28);
        r2 = r2 + (r8 >> 28);
        r10 = (r2 >> 28) - r29;
        r23 = (r23 & 268435455) + (r10 & -50998291);
        r27 = ((r27 & 268435455) + (r10 & 19280294)) + (r23 >> 28);
        r25 = ((r25 & 268435455) + (r10 & 127719000)) + (r27 >> 28);
        r6 = ((r6 & 268435455) + (r10 & -6428113)) + (r25 >> 28);
        r4 = ((r4 & 268435455) + (r10 & 5343)) + (r6 >> 28);
        r14 = (r14 & 268435455) + (r4 >> 28);
        r12 = (r12 & 268435455) + (r14 >> 28);
        r8 = (r8 & 268435455) + (r12 >> 28);
        r11 = new byte[32];
        X.C203469o5.A03(r11, 0, (r23 & 268435455) | ((r27 & 268435455) << 28));
        X.C203469o5.A03(r11, 7, ((r6 & 268435455) << 28) | (r25 & 268435455));
        X.C203469o5.A03(r11, 14, (r4 & 268435455) | ((r14 & 268435455) << 28));
        X.C203469o5.A03(r11, 21, (r12 & 268435455) | ((r8 & 268435455) << 28));
        r4 = (int) ((r2 & 268435455) + (r8 >> 28));
        r11[28] = (byte) r4;
        r11[29] = (byte) (r4 >>> 8);
        r11[30] = (byte) (r4 >>> 16);
        r11[31] = (byte) (r4 >>> 24);
        r28 = new int[8];
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0467, code lost:
        r28[r2] = X.C165577te.A0B(r58, r2 * 4);
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0473, code lost:
        if (r2 < 8) goto L_0x0467;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0475, code lost:
        r27 = new int[8];
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x047a, code lost:
        r27[r1] = X.C165577te.A0B(r11, r1 * 4);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0484, code lost:
        if (r1 < 8) goto L_0x047a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0486, code lost:
        r23 = new int[10];
        r59 = new int[10];
        r58 = new int[10];
        r24 = new int[10];
        r57 = new int[10];
        r29 = X.C203469o5.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x049e, code lost:
        monitor-enter(r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x04a1, code lost:
        if (X.C203469o5.A00 != null) goto L_0x08e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x04a3, code lost:
        r5 = new X.AnonymousClass9M1();
        r2 = X.C203469o5.A03;
        r4 = r5.A01;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x04ad, code lost:
        r0 = X.C165607th.A0E(r2, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x04b1, code lost:
        if (r0 < 10) goto L_0x04ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x04b3, code lost:
        r1 = X.C203469o5.A04;
        r3 = r5.A02;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x04b8, code lost:
        r0 = X.C165607th.A0E(r1, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x04bc, code lost:
        if (r0 < 10) goto L_0x04b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x04be, code lost:
        X.C203779or.A06(r5.A03);
        X.C203779or.A0D(r4, r3, r5.A00);
        X.C203469o5.A01 = X.C203469o5.A07(r5, 32);
        r56 = new int[10];
        r55 = new int[10];
        r54 = new int[10];
        r53 = new int[10];
        r52 = new int[10];
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x04e5, code lost:
        r3 = X.C165607th.A0E(r2, r56, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x04eb, code lost:
        if (r3 < 10) goto L_0x04e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x04ed, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x04ee, code lost:
        r2 = X.C165607th.A0E(r1, r55, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x04f4, code lost:
        if (r2 < 10) goto L_0x04ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x04f6, code lost:
        X.C203779or.A06(r54);
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x04fa, code lost:
        r2 = X.C165607th.A0E(r56, r53, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0502, code lost:
        if (r2 < 10) goto L_0x04fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0504, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0505, code lost:
        r2 = X.C165607th.A0E(r55, r52, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x050d, code lost:
        if (r2 < 10) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x050f, code lost:
        X.C203469o5.A00 = new int[1920];
        r37 = 0;
        r38 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0519, code lost:
        r11 = new X.AnonymousClass9M1[4];
        r7 = new X.AnonymousClass9M1();
        r1 = r7.A01;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0524, code lost:
        r1[r0] = 0;
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0528, code lost:
        if (r0 < 10) goto L_0x0524;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x052a, code lost:
        X.C203779or.A06(r7.A02);
        X.C203779or.A06(r7.A03);
        r1 = r7.A00;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0537, code lost:
        r1[r0] = 0;
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x053b, code lost:
        if (r0 < 10) goto L_0x0537;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x053d, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x053e, code lost:
        r5 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x053f, code lost:
        if (r6 >= 4) goto L_0x05c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0541, code lost:
        r2 = new X.AnonymousClass9M1();
        r3 = r2.A01;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0549, code lost:
        r1 = X.C165607th.A0E(r56, r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x054f, code lost:
        if (r1 < 10) goto L_0x0549;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0551, code lost:
        r3 = r2.A02;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0554, code lost:
        r1 = X.C165607th.A0E(r55, r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x055a, code lost:
        if (r1 < 10) goto L_0x0554;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x055c, code lost:
        r3 = r2.A03;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x055f, code lost:
        r1 = X.C165607th.A0E(r54, r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0565, code lost:
        if (r1 < 10) goto L_0x055f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0567, code lost:
        r1 = r53;
        X.C203779or.A0D(r1, r52, r2.A00);
        X.C203469o5.A01(r7, r2, r7, true);
        r4 = r1;
        X.C203469o5.A04(r4, r52, r56, r55, r54);
        r3 = new X.AnonymousClass9M1();
        r2 = r3.A01;
        r1 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A00(X.C21756AZk r62, byte[] r63) {
        /*
            r61 = this;
            r16 = r61
            monitor-enter(r16)
            r3 = 64
            r6 = r63
            int r4 = r6.length     // Catch:{ all -> 0x0a07 }
            if (r3 == r4) goto L_0x000f
            r16.reset()     // Catch:{ all -> 0x0a07 }
            goto L_0x0a00
        L_0x000f:
            r0 = r62
            byte[] r0 = r0.A00     // Catch:{ all -> 0x0a07 }
            byte[] r2 = X.AnonymousClass124.A02(r0)     // Catch:{ all -> 0x0a07 }
            r0 = r16
            byte[] r0 = r0.buf     // Catch:{ all -> 0x0a07 }
            r24 = r0
            r0 = r16
            int r1 = r0.count     // Catch:{ all -> 0x0a07 }
            r23 = 0
            r8 = 32
            byte[] r0 = new byte[r8]     // Catch:{ all -> 0x0a07 }
            r60 = r0
            int r7 = java.lang.Math.min(r4, r8)     // Catch:{ all -> 0x0a07 }
            r5 = 0
            r4 = 0
            java.lang.System.arraycopy(r6, r5, r0, r5, r7)     // Catch:{ all -> 0x0a07 }
            byte[] r0 = new byte[r8]     // Catch:{ all -> 0x0a07 }
            r58 = r0
            int r5 = java.lang.Math.min(r8, r8)     // Catch:{ all -> 0x0a07 }
            java.lang.System.arraycopy(r6, r8, r0, r4, r5)     // Catch:{ all -> 0x0a07 }
            boolean r0 = X.C203469o5.A05(r60)     // Catch:{ all -> 0x0a07 }
            r17 = 0
            if (r0 == 0) goto L_0x01af
            r0 = 8
            int[] r8 = new int[r0]     // Catch:{ all -> 0x0a07 }
            r6 = 8
            r5 = 0
        L_0x004c:
            int r4 = r5 * 4
            r0 = r58
            int r0 = X.C165577te.A0B(r0, r4)     // Catch:{ all -> 0x0a07 }
            r8[r5] = r0     // Catch:{ all -> 0x0a07 }
            int r5 = r5 + 1
            if (r5 < r6) goto L_0x004c
            int[] r7 = X.C203469o5.A07     // Catch:{ all -> 0x0a07 }
            r6 = 7
        L_0x005d:
            r5 = r8[r6]     // Catch:{ all -> 0x0a07 }
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r5 ^ r4
            r0 = r7[r6]     // Catch:{ all -> 0x0a07 }
            r4 = r4 ^ r0
            if (r5 >= r4) goto L_0x0140
            r4 = 10
            int[] r0 = new int[r4]     // Catch:{ all -> 0x0a07 }
            r20 = r0
            int[] r0 = new int[r4]     // Catch:{ all -> 0x0a07 }
            r21 = r0
            r19 = 32
            r0 = 32
            byte[] r6 = new byte[r0]     // Catch:{ all -> 0x0a07 }
            int r4 = r2.length     // Catch:{ all -> 0x0a07 }
            int r5 = java.lang.Math.min(r4, r0)     // Catch:{ all -> 0x0a07 }
            r4 = 0
            java.lang.System.arraycopy(r2, r4, r6, r4, r5)     // Catch:{ all -> 0x0a07 }
            boolean r0 = X.C203469o5.A05(r6)     // Catch:{ all -> 0x0a07 }
            if (r0 == 0) goto L_0x01af
            r5 = 31
            byte r4 = r6[r5]     // Catch:{ all -> 0x0a07 }
            r0 = r4 & 128(0x80, float:1.794E-43)
            int r9 = r0 >>> 7
            r0 = r4 & 127(0x7f, float:1.78E-43)
            byte r0 = (byte) r0     // Catch:{ all -> 0x0a07 }
            r6[r5] = r0     // Catch:{ all -> 0x0a07 }
            r5 = 0
            r0 = r21
            X.C203779or.A02(r6, r0, r5, r5)     // Catch:{ all -> 0x0a07 }
            r5 = 16
            r4 = 5
            X.C203779or.A02(r6, r0, r5, r4)     // Catch:{ all -> 0x0a07 }
            r5 = 9
            r4 = r21[r5]     // Catch:{ all -> 0x0a07 }
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r0
            r21[r5] = r4     // Catch:{ all -> 0x0a07 }
            r0 = 10
            int[] r13 = new int[r0]     // Catch:{ all -> 0x0a07 }
            int[] r12 = new int[r0]     // Catch:{ all -> 0x0a07 }
            r0 = r21
            X.C203779or.A0A(r0, r13)     // Catch:{ all -> 0x0a07 }
            int[] r18 = X.C203469o5.A05     // Catch:{ all -> 0x0a07 }
            r0 = r18
            X.C203779or.A0D(r0, r13, r12)     // Catch:{ all -> 0x0a07 }
            r0 = r13[r23]     // Catch:{ all -> 0x0a07 }
            int r0 = r0 + -1
            r13[r23] = r0     // Catch:{ all -> 0x0a07 }
            r0 = 0
            X.C165587tf.A1V(r12, r0)     // Catch:{ all -> 0x0a07 }
            r11 = 10
            int[] r15 = new int[r11]     // Catch:{ all -> 0x0a07 }
            int[] r14 = new int[r11]     // Catch:{ all -> 0x0a07 }
            X.C203779or.A0D(r13, r12, r15)     // Catch:{ all -> 0x0a07 }
            X.C203779or.A0A(r12, r14)     // Catch:{ all -> 0x0a07 }
            X.C203779or.A0D(r15, r14, r15)     // Catch:{ all -> 0x0a07 }
            X.C203779or.A0A(r14, r14)     // Catch:{ all -> 0x0a07 }
            X.C203779or.A0D(r14, r15, r14)     // Catch:{ all -> 0x0a07 }
            int[] r10 = new int[r11]     // Catch:{ all -> 0x0a07 }
            int[] r8 = new int[r11]     // Catch:{ all -> 0x0a07 }
            X.C203779or.A0A(r14, r10)     // Catch:{ all -> 0x0a07 }
            X.C203779or.A0D(r14, r10, r10)     // Catch:{ all -> 0x0a07 }
            int[] r7 = new int[r11]     // Catch:{ all -> 0x0a07 }
            X.C203779or.A0A(r10, r7)     // Catch:{ all -> 0x0a07 }
            X.C203779or.A0D(r14, r7, r7)     // Catch:{ all -> 0x0a07 }
            r6 = 2
            X.C203779or.A0B(r7, r7, r6)     // Catch:{ all -> 0x0a07 }
            X.C203779or.A0D(r10, r7, r7)     // Catch:{ all -> 0x0a07 }
            int[] r5 = new int[r11]     // Catch:{ all -> 0x0a07 }
            r0 = 5
            X.C203779or.A0B(r7, r5, r0)     // Catch:{ all -> 0x0a07 }
            X.C203779or.A0D(r7, r5, r5)     // Catch:{ all -> 0x0a07 }
            int[] r4 = new int[r11]     // Catch:{ all -> 0x0a07 }
            X.C203779or.A0B(r5, r4, r0)     // Catch:{ all -> 0x0a07 }
            X.C203779or.A0D(r7, r4, r4)     // Catch:{ all -> 0x0a07 }
            X.C203779or.A0B(r4, r7, r11)     // Catch:{ all -> 0x0a07 }
            X.C203779or.A0D(r5, r7, r7)     // Catch:{ all -> 0x0a07 }
            r0 = 25
            X.C203779or.A0B(r7, r5, r0)     // Catch:{ all -> 0x0a07 }
            X.C203779or.A0D(r7, r5, r5)     // Catch:{ all -> 0x0a07 }
            X.C203779or.A0B(r5, r4, r0)     // Catch:{ all -> 0x0a07 }
            X.C203779or.A0D(r7, r4, r4)     // Catch:{ all -> 0x0a07 }
            r0 = 50
            X.C203779or.A0B(r4, r7, r0)     // Catch:{ all -> 0x0a07 }
            X.C203779or.A0D(r5, r7, r7)     // Catch:{ all -> 0x0a07 }
            r0 = 125(0x7d, float:1.75E-43)
            X.C203779or.A0B(r7, r5, r0)     // Catch:{ all -> 0x0a07 }
            X.C203779or.A0D(r7, r5, r5)     // Catch:{ all -> 0x0a07 }
            X.C203779or.A0B(r5, r7, r6)     // Catch:{ all -> 0x0a07 }
            X.C203779or.A0D(r7, r14, r8)     // Catch:{ all -> 0x0a07 }
            X.C203779or.A0D(r8, r15, r8)     // Catch:{ all -> 0x0a07 }
            int[] r0 = new int[r11]     // Catch:{ all -> 0x0a07 }
            X.C203779or.A0A(r8, r0)     // Catch:{ all -> 0x0a07 }
            X.C203779or.A0D(r0, r12, r0)     // Catch:{ all -> 0x0a07 }
            X.C203779or.A0E(r0, r13, r10)     // Catch:{ all -> 0x0a07 }
            X.C203779or.A05(r10)     // Catch:{ all -> 0x0a07 }
            goto L_0x0148
        L_0x0140:
            if (r5 > r4) goto L_0x01af
            int r6 = r6 + -1
            if (r6 < 0) goto L_0x01af
            goto L_0x005d
        L_0x0148:
            r4 = 0
            r6 = 0
        L_0x014a:
            r5 = r10[r4]     // Catch:{ all -> 0x0a07 }
            r6 = r6 | r5
            int r4 = r4 + 1
            if (r4 < r11) goto L_0x014a
            int r5 = r6 >>> 1
            r4 = r6 & 1
            r5 = r5 | r4
            int r4 = r5 + -1
            int r4 = r4 >> 31
            boolean r4 = X.AnonymousClass000.A1P(r4)     // Catch:{ all -> 0x0a07 }
            if (r4 == 0) goto L_0x016a
            r4 = 0
        L_0x0161:
            r0 = r20
            int r4 = X.C165607th.A0E(r8, r0, r4)     // Catch:{ all -> 0x0a07 }
            if (r4 >= r11) goto L_0x018f
            goto L_0x0161
        L_0x016a:
            X.C203779or.A0C(r0, r13, r10)     // Catch:{ all -> 0x0a07 }
            X.C203779or.A05(r10)     // Catch:{ all -> 0x0a07 }
            r4 = 0
            r5 = 0
        L_0x0172:
            r0 = r10[r4]     // Catch:{ all -> 0x0a07 }
            r5 = r5 | r0
            int r4 = r4 + 1
            if (r4 < r11) goto L_0x0172
            int r4 = r5 >>> 1
            r0 = r5 & 1
            r4 = r4 | r0
            int r0 = r4 + -1
            int r0 = r0 >> 31
            boolean r0 = X.AnonymousClass000.A1P(r0)     // Catch:{ all -> 0x0a07 }
            if (r0 == 0) goto L_0x01af
            int[] r4 = X.C203779or.A01     // Catch:{ all -> 0x0a07 }
            r0 = r20
            X.C203779or.A0D(r8, r4, r0)     // Catch:{ all -> 0x0a07 }
        L_0x018f:
            X.C203779or.A05(r20)     // Catch:{ all -> 0x0a07 }
            r22 = 1
            r0 = 1
            if (r9 != r0) goto L_0x01b4
            r4 = 0
            r5 = 0
        L_0x0199:
            r0 = r20[r4]     // Catch:{ all -> 0x0a07 }
            r5 = r5 | r0
            int r4 = r4 + 1
            if (r4 < r11) goto L_0x0199
            int r4 = r5 >>> 1
            r0 = r5 & 1
            r4 = r4 | r0
            int r0 = r4 + -1
            int r0 = r0 >> 31
            boolean r0 = X.AnonymousClass000.A1P(r0)     // Catch:{ all -> 0x0a07 }
            if (r0 == 0) goto L_0x01b4
        L_0x01af:
            r16.reset()     // Catch:{ all -> 0x0a07 }
            goto L_0x0a02
        L_0x01b4:
            r0 = r20[r23]     // Catch:{ all -> 0x0a07 }
            r0 = r0 & 1
            if (r9 != r0) goto L_0x01c5
            r4 = 0
        L_0x01bb:
            r0 = r20[r4]     // Catch:{ all -> 0x0a07 }
            int r0 = -r0
            r20[r4] = r0     // Catch:{ all -> 0x0a07 }
            int r4 = r4 + 1
            if (r4 >= r11) goto L_0x01c5
            goto L_0x01bb
        L_0x01c5:
            X.AtK r4 = new X.AtK     // Catch:{ all -> 0x0a07 }
            r4.<init>()     // Catch:{ all -> 0x0a07 }
            byte[] r0 = new byte[r3]     // Catch:{ all -> 0x0a07 }
            r33 = r0
            r5 = 0
            r3 = 32
            r0 = r60
            r4.update(r0, r5, r3)     // Catch:{ all -> 0x0a07 }
            r0 = 32
            r4.update(r2, r5, r0)     // Catch:{ all -> 0x0a07 }
            r0 = r24
            r4.update(r0, r5, r1)     // Catch:{ all -> 0x0a07 }
            r0 = r33
            r4.B5n(r0, r5)     // Catch:{ all -> 0x0a07 }
            int r0 = X.C165577te.A0B(r0, r5)     // Catch:{ all -> 0x0a07 }
            long r0 = (long) r0     // Catch:{ all -> 0x0a07 }
            r31 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r23 = r0 & r31
            r2 = 4
            r0 = r33
            int r0 = X.C203469o5.A00(r0, r2)     // Catch:{ all -> 0x0a07 }
            int r0 = r0 << r2
            long r0 = (long) r0     // Catch:{ all -> 0x0a07 }
            long r27 = r0 & r31
            r1 = 7
            r0 = r33
            int r0 = X.C165577te.A0B(r0, r1)     // Catch:{ all -> 0x0a07 }
            long r0 = (long) r0     // Catch:{ all -> 0x0a07 }
            long r25 = r0 & r31
            r1 = 11
            r0 = r33
            int r0 = X.C203469o5.A00(r0, r1)     // Catch:{ all -> 0x0a07 }
            int r0 = r0 << r2
            long r6 = (long) r0     // Catch:{ all -> 0x0a07 }
            long r6 = r6 & r31
            r1 = 14
            r0 = r33
            int r0 = X.C165577te.A0B(r0, r1)     // Catch:{ all -> 0x0a07 }
            long r4 = (long) r0     // Catch:{ all -> 0x0a07 }
            long r4 = r4 & r31
            r1 = 18
            r0 = r33
            int r0 = X.C203469o5.A00(r0, r1)     // Catch:{ all -> 0x0a07 }
            int r0 = r0 << r2
            long r14 = (long) r0     // Catch:{ all -> 0x0a07 }
            long r14 = r14 & r31
            r1 = 21
            r0 = r33
            int r0 = X.C165577te.A0B(r0, r1)     // Catch:{ all -> 0x0a07 }
            long r12 = (long) r0     // Catch:{ all -> 0x0a07 }
            long r12 = r12 & r31
            r1 = 25
            r0 = r33
            int r0 = X.C203469o5.A00(r0, r1)     // Catch:{ all -> 0x0a07 }
            int r0 = r0 << r2
            long r8 = (long) r0     // Catch:{ all -> 0x0a07 }
            long r8 = r8 & r31
            r1 = 28
            r0 = r33
            int r0 = X.C165577te.A0B(r0, r1)     // Catch:{ all -> 0x0a07 }
            long r2 = (long) r0     // Catch:{ all -> 0x0a07 }
            long r2 = r2 & r31
            r1 = 32
            r0 = r33
            int r0 = X.C203469o5.A00(r0, r1)     // Catch:{ all -> 0x0a07 }
            int r0 = r0 << 4
            long r10 = (long) r0     // Catch:{ all -> 0x0a07 }
            long r10 = r10 & r31
            r1 = 35
            r0 = r33
            int r0 = X.C165577te.A0B(r0, r1)     // Catch:{ all -> 0x0a07 }
            long r0 = (long) r0     // Catch:{ all -> 0x0a07 }
            long r29 = r0 & r31
            r0 = 39
            r1 = r33
            int r0 = X.C203469o5.A00(r1, r0)     // Catch:{ all -> 0x0a07 }
            int r0 = r0 << 4
            long r0 = (long) r0     // Catch:{ all -> 0x0a07 }
            long r40 = r0 & r31
            r0 = 42
            r1 = r33
            int r0 = X.C165577te.A0B(r1, r0)     // Catch:{ all -> 0x0a07 }
            long r0 = (long) r0     // Catch:{ all -> 0x0a07 }
            long r46 = r0 & r31
            r0 = 46
            r1 = r33
            int r0 = X.C203469o5.A00(r1, r0)     // Catch:{ all -> 0x0a07 }
            int r0 = r0 << 4
            long r0 = (long) r0     // Catch:{ all -> 0x0a07 }
            long r52 = r0 & r31
            r0 = 49
            r1 = r33
            int r0 = X.C165577te.A0B(r1, r0)     // Catch:{ all -> 0x0a07 }
            long r0 = (long) r0     // Catch:{ all -> 0x0a07 }
            long r56 = r0 & r31
            r0 = 53
            r1 = r33
            int r0 = X.C203469o5.A00(r1, r0)     // Catch:{ all -> 0x0a07 }
            int r0 = r0 << 4
            long r0 = (long) r0     // Catch:{ all -> 0x0a07 }
            long r54 = r0 & r31
            r0 = 56
            r1 = r33
            int r0 = X.C165577te.A0B(r1, r0)     // Catch:{ all -> 0x0a07 }
            long r0 = (long) r0     // Catch:{ all -> 0x0a07 }
            long r50 = r0 & r31
            r0 = 60
            r1 = r33
            int r0 = X.C203469o5.A00(r1, r0)     // Catch:{ all -> 0x0a07 }
            int r0 = r0 << 4
            long r0 = (long) r0     // Catch:{ all -> 0x0a07 }
            long r48 = r0 & r31
            r0 = 63
            byte r0 = r33[r0]     // Catch:{ all -> 0x0a07 }
            long r0 = (long) r0     // Catch:{ all -> 0x0a07 }
            r31 = r0
            r0 = 255(0xff, double:1.26E-321)
            long r31 = r31 & r0
            r44 = -50998291(0xfffffffffcf5d3ed, double:NaN)
            long r0 = r31 * r44
            long r10 = r10 - r0
            r42 = 19280294(0x12631a6, double:9.525731E-317)
            long r0 = r31 * r42
            long r29 = r29 - r0
            r38 = 127719000(0x79cd658, double:6.310157E-316)
            long r0 = r31 * r38
            long r40 = r40 - r0
            r36 = -6428113(0xffffffffff9dea2f, double:NaN)
            long r0 = r31 * r36
            long r46 = r46 - r0
            r34 = 5343(0x14df, double:2.64E-320)
            long r31 = r31 * r34
            long r52 = r52 - r31
            r33 = 28
            long r0 = r50 >> r33
            long r48 = r48 + r0
            r31 = 268435455(0xfffffff, double:1.326247364E-315)
            long r50 = r50 & r31
            long r0 = r48 * r44
            long r2 = r2 - r0
            long r0 = r48 * r42
            long r10 = r10 - r0
            long r0 = r48 * r38
            long r29 = r29 - r0
            long r0 = r48 * r36
            long r40 = r40 - r0
            long r48 = r48 * r34
            long r46 = r46 - r48
            long r0 = r50 * r44
            long r8 = r8 - r0
            long r0 = r50 * r42
            long r2 = r2 - r0
            long r0 = r50 * r38
            long r10 = r10 - r0
            long r0 = r50 * r36
            long r29 = r29 - r0
            long r50 = r50 * r34
            long r40 = r40 - r50
            long r0 = r56 >> r33
            long r54 = r54 + r0
            long r56 = r56 & r31
            long r0 = r54 * r44
            long r12 = r12 - r0
            long r0 = r54 * r42
            long r8 = r8 - r0
            long r0 = r54 * r38
            long r2 = r2 - r0
            long r0 = r54 * r36
            long r10 = r10 - r0
            long r54 = r54 * r34
            long r29 = r29 - r54
            long r0 = r56 * r44
            long r14 = r14 - r0
            long r0 = r56 * r42
            long r12 = r12 - r0
            long r0 = r56 * r38
            long r8 = r8 - r0
            long r0 = r56 * r36
            long r2 = r2 - r0
            long r56 = r56 * r34
            long r10 = r10 - r56
            long r0 = r46 >> r33
            long r52 = r52 + r0
            long r46 = r46 & r31
            long r0 = r52 * r44
            long r4 = r4 - r0
            long r0 = r52 * r42
            long r14 = r14 - r0
            long r0 = r52 * r38
            long r12 = r12 - r0
            long r0 = r52 * r36
            long r8 = r8 - r0
            long r52 = r52 * r34
            long r2 = r2 - r52
            long r0 = r40 >> r33
            long r46 = r46 + r0
            long r40 = r40 & r31
            long r0 = r46 * r44
            long r6 = r6 - r0
            long r0 = r46 * r42
            long r4 = r4 - r0
            long r0 = r46 * r38
            long r14 = r14 - r0
            long r0 = r46 * r36
            long r12 = r12 - r0
            long r46 = r46 * r34
            long r8 = r8 - r46
            long r0 = r29 >> r33
            long r40 = r40 + r0
            long r29 = r29 & r31
            long r0 = r40 * r44
            long r25 = r25 - r0
            long r0 = r40 * r42
            long r6 = r6 - r0
            long r0 = r40 * r38
            long r4 = r4 - r0
            long r0 = r40 * r36
            long r14 = r14 - r0
            long r40 = r40 * r34
            long r12 = r12 - r40
            long r0 = r10 >> r33
            long r29 = r29 + r0
            long r10 = r10 & r31
            long r0 = r29 * r44
            long r27 = r27 - r0
            long r0 = r29 * r42
            long r25 = r25 - r0
            long r0 = r29 * r38
            long r6 = r6 - r0
            long r0 = r29 * r36
            long r4 = r4 - r0
            long r29 = r29 * r34
            long r14 = r14 - r29
            long r0 = r8 >> r33
            long r2 = r2 + r0
            long r8 = r8 & r31
            long r0 = r2 >> r33
            long r10 = r10 + r0
            long r2 = r2 & r31
            r0 = 27
            long r29 = r2 >>> r0
            long r10 = r10 + r29
            long r0 = r10 * r44
            long r23 = r23 - r0
            long r0 = r10 * r42
            long r27 = r27 - r0
            long r0 = r10 * r38
            long r25 = r25 - r0
            long r0 = r10 * r36
            long r6 = r6 - r0
            long r10 = r10 * r34
            long r4 = r4 - r10
            long r0 = r23 >> r33
            long r27 = r27 + r0
            long r23 = r23 & r31
            long r0 = r27 >> r33
            long r25 = r25 + r0
            long r27 = r27 & r31
            long r0 = r25 >> r33
            long r6 = r6 + r0
            long r25 = r25 & r31
            long r0 = r6 >> r33
            long r4 = r4 + r0
            long r6 = r6 & r31
            long r0 = r4 >> r33
            long r14 = r14 + r0
            long r4 = r4 & r31
            long r0 = r14 >> r33
            long r12 = r12 + r0
            long r14 = r14 & r31
            long r0 = r12 >> r33
            long r8 = r8 + r0
            long r12 = r12 & r31
            long r0 = r8 >> r33
            long r2 = r2 + r0
            long r8 = r8 & r31
            long r10 = r2 >> r33
            long r2 = r2 & r31
            long r10 = r10 - r29
            long r0 = r10 & r44
            long r23 = r23 + r0
            long r0 = r10 & r42
            long r27 = r27 + r0
            long r0 = r10 & r38
            long r25 = r25 + r0
            long r0 = r10 & r36
            long r6 = r6 + r0
            long r10 = r10 & r34
            long r4 = r4 + r10
            long r0 = r23 >> r33
            long r27 = r27 + r0
            long r23 = r23 & r31
            long r0 = r27 >> r33
            long r25 = r25 + r0
            long r27 = r27 & r31
            long r0 = r25 >> r33
            long r6 = r6 + r0
            long r25 = r25 & r31
            long r0 = r6 >> r33
            long r4 = r4 + r0
            long r6 = r6 & r31
            long r0 = r4 >> r33
            long r14 = r14 + r0
            long r4 = r4 & r31
            long r0 = r14 >> r33
            long r12 = r12 + r0
            long r14 = r14 & r31
            long r0 = r12 >> r33
            long r8 = r8 + r0
            long r12 = r12 & r31
            long r0 = r8 >> r33
            long r2 = r2 + r0
            long r8 = r8 & r31
            r0 = 32
            byte[] r11 = new byte[r0]     // Catch:{ all -> 0x0a07 }
            long r27 = r27 << r33
            long r23 = r23 | r27
            r10 = 0
            r0 = r23
            X.C203469o5.A03(r11, r10, r0)     // Catch:{ all -> 0x0a07 }
            long r6 = r6 << r33
            long r6 = r6 | r25
            r0 = 7
            X.C203469o5.A03(r11, r0, r6)     // Catch:{ all -> 0x0a07 }
            long r14 = r14 << r33
            long r4 = r4 | r14
            r0 = 14
            X.C203469o5.A03(r11, r0, r4)     // Catch:{ all -> 0x0a07 }
            long r8 = r8 << r33
            long r12 = r12 | r8
            r0 = 21
            X.C203469o5.A03(r11, r0, r12)     // Catch:{ all -> 0x0a07 }
            int r4 = (int) r2     // Catch:{ all -> 0x0a07 }
            byte r0 = (byte) r4     // Catch:{ all -> 0x0a07 }
            r11[r33] = r0     // Catch:{ all -> 0x0a07 }
            r1 = 29
            int r0 = r4 >>> 8
            byte r0 = (byte) r0     // Catch:{ all -> 0x0a07 }
            r11[r1] = r0     // Catch:{ all -> 0x0a07 }
            r1 = 30
            int r0 = r4 >>> 16
            byte r0 = (byte) r0     // Catch:{ all -> 0x0a07 }
            r11[r1] = r0     // Catch:{ all -> 0x0a07 }
            r1 = 31
            int r0 = r4 >>> 24
            byte r0 = (byte) r0     // Catch:{ all -> 0x0a07 }
            r11[r1] = r0     // Catch:{ all -> 0x0a07 }
            r10 = 8
            int[] r0 = new int[r10]     // Catch:{ all -> 0x0a07 }
            r28 = r0
            r2 = 0
        L_0x0467:
            int r1 = r2 * 4
            r0 = r58
            int r0 = X.C165577te.A0B(r0, r1)     // Catch:{ all -> 0x0a07 }
            r28[r2] = r0     // Catch:{ all -> 0x0a07 }
            int r2 = r2 + 1
            if (r2 < r10) goto L_0x0467
            int[] r0 = new int[r10]     // Catch:{ all -> 0x0a07 }
            r27 = r0
            r1 = 0
        L_0x047a:
            int r0 = r1 * 4
            int r0 = X.C165577te.A0B(r11, r0)     // Catch:{ all -> 0x0a07 }
            r27[r1] = r0     // Catch:{ all -> 0x0a07 }
            int r1 = r1 + 1
            if (r1 < r10) goto L_0x047a
            r9 = 10
            int[] r0 = new int[r9]     // Catch:{ all -> 0x0a07 }
            r23 = r0
            int[] r0 = new int[r9]     // Catch:{ all -> 0x0a07 }
            r59 = r0
            int[] r0 = new int[r9]     // Catch:{ all -> 0x0a07 }
            r58 = r0
            int[] r0 = new int[r9]     // Catch:{ all -> 0x0a07 }
            r24 = r0
            int[] r0 = new int[r9]     // Catch:{ all -> 0x0a07 }
            r57 = r0
            java.lang.Object r29 = X.C203469o5.A02     // Catch:{ all -> 0x0a07 }
            monitor-enter(r29)     // Catch:{ all -> 0x0a07 }
            int[] r0 = X.C203469o5.A00     // Catch:{ all -> 0x0a04 }
            if (r0 != 0) goto L_0x08e8
            X.9M1 r5 = new X.9M1     // Catch:{ all -> 0x0a04 }
            r5.<init>()     // Catch:{ all -> 0x0a04 }
            int[] r2 = X.C203469o5.A03     // Catch:{ all -> 0x0a04 }
            int[] r4 = r5.A01     // Catch:{ all -> 0x0a04 }
            r0 = 0
        L_0x04ad:
            int r0 = X.C165607th.A0E(r2, r4, r0)     // Catch:{ all -> 0x0a04 }
            if (r0 < r9) goto L_0x04ad
            int[] r1 = X.C203469o5.A04     // Catch:{ all -> 0x0a04 }
            int[] r3 = r5.A02     // Catch:{ all -> 0x0a04 }
            r0 = 0
        L_0x04b8:
            int r0 = X.C165607th.A0E(r1, r3, r0)     // Catch:{ all -> 0x0a04 }
            if (r0 < r9) goto L_0x04b8
            int[] r0 = r5.A03     // Catch:{ all -> 0x0a04 }
            X.C203779or.A06(r0)     // Catch:{ all -> 0x0a04 }
            int[] r0 = r5.A00     // Catch:{ all -> 0x0a04 }
            X.C203779or.A0D(r4, r3, r0)     // Catch:{ all -> 0x0a04 }
            r0 = 32
            X.9M1[] r0 = X.C203469o5.A07(r5, r0)     // Catch:{ all -> 0x0a04 }
            X.C203469o5.A01 = r0     // Catch:{ all -> 0x0a04 }
            int[] r0 = new int[r9]     // Catch:{ all -> 0x0a04 }
            r56 = r0
            int[] r0 = new int[r9]     // Catch:{ all -> 0x0a04 }
            r55 = r0
            int[] r0 = new int[r9]     // Catch:{ all -> 0x0a04 }
            r54 = r0
            int[] r0 = new int[r9]     // Catch:{ all -> 0x0a04 }
            r53 = r0
            int[] r0 = new int[r9]     // Catch:{ all -> 0x0a04 }
            r52 = r0
            r3 = 0
        L_0x04e5:
            r0 = r56
            int r3 = X.C165607th.A0E(r2, r0, r3)     // Catch:{ all -> 0x0a04 }
            if (r3 < r9) goto L_0x04e5
            r2 = 0
        L_0x04ee:
            r0 = r55
            int r2 = X.C165607th.A0E(r1, r0, r2)     // Catch:{ all -> 0x0a04 }
            if (r2 < r9) goto L_0x04ee
            X.C203779or.A06(r54)     // Catch:{ all -> 0x0a04 }
            r2 = 0
        L_0x04fa:
            r1 = r56
            r0 = r53
            int r2 = X.C165607th.A0E(r1, r0, r2)     // Catch:{ all -> 0x0a04 }
            if (r2 < r9) goto L_0x04fa
            r2 = 0
        L_0x0505:
            r1 = r55
            r0 = r52
            int r2 = X.C165607th.A0E(r1, r0, r2)     // Catch:{ all -> 0x0a04 }
            if (r2 < r9) goto L_0x0505
            r0 = 1920(0x780, float:2.69E-42)
            int[] r0 = new int[r0]     // Catch:{ all -> 0x0a04 }
            X.C203469o5.A00 = r0     // Catch:{ all -> 0x0a04 }
            r37 = 0
            r38 = 0
        L_0x0519:
            r8 = 4
            X.9M1[] r11 = new X.AnonymousClass9M1[r8]     // Catch:{ all -> 0x0a04 }
            X.9M1 r7 = new X.9M1     // Catch:{ all -> 0x0a04 }
            r7.<init>()     // Catch:{ all -> 0x0a04 }
            int[] r1 = r7.A01     // Catch:{ all -> 0x0a04 }
            r0 = 0
        L_0x0524:
            r1[r0] = r17     // Catch:{ all -> 0x0a04 }
            int r0 = r0 + 1
            if (r0 < r9) goto L_0x0524
            int[] r0 = r7.A02     // Catch:{ all -> 0x0a04 }
            X.C203779or.A06(r0)     // Catch:{ all -> 0x0a04 }
            int[] r0 = r7.A03     // Catch:{ all -> 0x0a04 }
            X.C203779or.A06(r0)     // Catch:{ all -> 0x0a04 }
            int[] r1 = r7.A00     // Catch:{ all -> 0x0a04 }
            r0 = 0
        L_0x0537:
            r1[r0] = r17     // Catch:{ all -> 0x0a04 }
            int r0 = r0 + 1
            if (r0 < r9) goto L_0x0537
            r6 = 0
        L_0x053e:
            r5 = 1
            if (r6 >= r8) goto L_0x05c6
            X.9M1 r2 = new X.9M1     // Catch:{ all -> 0x0a04 }
            r2.<init>()     // Catch:{ all -> 0x0a04 }
            int[] r3 = r2.A01     // Catch:{ all -> 0x0a04 }
            r1 = 0
        L_0x0549:
            r0 = r56
            int r1 = X.C165607th.A0E(r0, r3, r1)     // Catch:{ all -> 0x0a04 }
            if (r1 < r9) goto L_0x0549
            int[] r3 = r2.A02     // Catch:{ all -> 0x0a04 }
            r1 = 0
        L_0x0554:
            r0 = r55
            int r1 = X.C165607th.A0E(r0, r3, r1)     // Catch:{ all -> 0x0a04 }
            if (r1 < r9) goto L_0x0554
            int[] r3 = r2.A03     // Catch:{ all -> 0x0a04 }
            r1 = 0
        L_0x055f:
            r0 = r54
            int r1 = X.C165607th.A0E(r0, r3, r1)     // Catch:{ all -> 0x0a04 }
            if (r1 < r9) goto L_0x055f
            int[] r3 = r2.A00     // Catch:{ all -> 0x0a04 }
            r1 = r53
            r0 = r52
            X.C203779or.A0D(r1, r0, r3)     // Catch:{ all -> 0x0a04 }
            X.C203469o5.A01(r7, r2, r7, r5)     // Catch:{ all -> 0x0a04 }
            r4 = r1
            r3 = r52
            r2 = r56
            r1 = r55
            r0 = r54
            X.C203469o5.A04(r4, r3, r2, r1, r0)     // Catch:{ all -> 0x0a04 }
            X.9M1 r3 = new X.9M1     // Catch:{ all -> 0x0a04 }
            r3.<init>()     // Catch:{ all -> 0x0a04 }
            int[] r2 = r3.A01     // Catch:{ all -> 0x0a04 }
            r1 = 0
        L_0x0587:
            r0 = r56
            int r1 = X.C165607th.A0E(r0, r2, r1)     // Catch:{ all -> 0x0a04 }
            if (r1 < r9) goto L_0x0587
            int[] r2 = r3.A02     // Catch:{ all -> 0x0a04 }
            r1 = 0
        L_0x0592:
            r0 = r55
            int r1 = X.C165607th.A0E(r0, r2, r1)     // Catch:{ all -> 0x0a04 }
            if (r1 < r9) goto L_0x0592
            int[] r2 = r3.A03     // Catch:{ all -> 0x0a04 }
            r1 = 0
        L_0x059d:
            r0 = r54
            int r1 = X.C165607th.A0E(r0, r2, r1)     // Catch:{ all -> 0x0a04 }
            if (r1 < r9) goto L_0x059d
            int[] r2 = r3.A00     // Catch:{ all -> 0x0a04 }
            r0 = r52
            X.C203779or.A0D(r4, r0, r2)     // Catch:{ all -> 0x0a04 }
            r11[r6] = r3     // Catch:{ all -> 0x0a04 }
            int r0 = r37 + r6
            if (r0 == r9) goto L_0x05c2
        L_0x05b2:
            r3 = r52
            r2 = r56
            r1 = r55
            r0 = r54
            X.C203469o5.A04(r4, r3, r2, r1, r0)     // Catch:{ all -> 0x0a04 }
            int r5 = r5 + 1
            if (r5 >= r10) goto L_0x05c2
            goto L_0x05b2
        L_0x05c2:
            int r6 = r6 + 1
            goto L_0x053e
        L_0x05c6:
            X.9M1[] r8 = new X.AnonymousClass9M1[r10]     // Catch:{ all -> 0x0a04 }
            r8[r17] = r7     // Catch:{ all -> 0x0a04 }
            r6 = 0
            r7 = 1
        L_0x05cc:
            int r5 = r22 << r6
            r4 = 0
        L_0x05cf:
            if (r4 >= r5) goto L_0x05e7
            int r0 = r7 - r5
            r3 = r8[r0]     // Catch:{ all -> 0x0a04 }
            r2 = r11[r6]     // Catch:{ all -> 0x0a04 }
            X.9M1 r1 = new X.9M1     // Catch:{ all -> 0x0a04 }
            r1.<init>()     // Catch:{ all -> 0x0a04 }
            r8[r7] = r1     // Catch:{ all -> 0x0a04 }
            r0 = 0
            X.C203469o5.A01(r3, r2, r1, r0)     // Catch:{ all -> 0x0a04 }
            int r4 = r4 + 1
            int r7 = r7 + 1
            goto L_0x05cf
        L_0x05e7:
            int r6 = r6 + 1
            r0 = 3
            if (r6 < r0) goto L_0x05cc
            r0 = 80
            int[] r0 = new int[r0]     // Catch:{ all -> 0x0a04 }
            r44 = r0
            int[] r7 = new int[r9]     // Catch:{ all -> 0x0a04 }
            r0 = r8[r17]     // Catch:{ all -> 0x0a04 }
            int[] r1 = r0.A03     // Catch:{ all -> 0x0a04 }
            r0 = 0
        L_0x05f9:
            int r0 = X.C165607th.A0E(r1, r7, r0)     // Catch:{ all -> 0x0a04 }
            if (r0 < r9) goto L_0x05f9
            r1 = 0
        L_0x0600:
            r0 = r44
            int r1 = X.C165607th.A0E(r7, r0, r1)     // Catch:{ all -> 0x0a04 }
            if (r1 < r9) goto L_0x0600
            r43 = 0
        L_0x060a:
            int r43 = r43 + 1
            r0 = r43
            if (r0 >= r10) goto L_0x0625
            r0 = r8[r43]     // Catch:{ all -> 0x0a04 }
            int[] r0 = r0.A03     // Catch:{ all -> 0x0a04 }
            X.C203779or.A0D(r7, r0, r7)     // Catch:{ all -> 0x0a04 }
            int r3 = r43 * 10
            r0 = 0
        L_0x061a:
            int r2 = r3 + r0
            r1 = r7[r0]     // Catch:{ all -> 0x0a04 }
            r44[r2] = r1     // Catch:{ all -> 0x0a04 }
            int r0 = r0 + 1
            if (r0 >= r9) goto L_0x060a
            goto L_0x061a
        L_0x0625:
            X.C203779or.A0C(r7, r7, r7)     // Catch:{ all -> 0x0a04 }
            int[] r1 = new int[r9]     // Catch:{ all -> 0x0a04 }
            int[] r0 = new int[r10]     // Catch:{ all -> 0x0a04 }
            r42 = r0
            r0 = 0
        L_0x062f:
            int r0 = X.C165607th.A0E(r7, r1, r0)     // Catch:{ all -> 0x0a04 }
            if (r0 < r9) goto L_0x062f
            X.C203779or.A05(r1)     // Catch:{ all -> 0x0a04 }
            r3 = 0
            r0 = r42
            X.C203779or.A01(r3, r3, r1, r0)     // Catch:{ all -> 0x0a04 }
            r2 = 4
            r3 = 5
            X.C203779or.A01(r3, r2, r1, r0)     // Catch:{ all -> 0x0a04 }
            int[] r1 = X.C203779or.A00     // Catch:{ all -> 0x0a04 }
            r6 = 256(0x100, float:3.59E-43)
            r0 = 7
            r0 = r1[r0]     // Catch:{ all -> 0x0a04 }
            int r0 = java.lang.Integer.numberOfLeadingZeros(r0)     // Catch:{ all -> 0x0a04 }
            int r6 = r6 - r0
            int r0 = r6 + 29
            int r14 = r0 / 30
            int[] r0 = new int[r2]     // Catch:{ all -> 0x0a04 }
            r41 = r0
            int[] r5 = new int[r14]     // Catch:{ all -> 0x0a04 }
            int[] r0 = new int[r14]     // Catch:{ all -> 0x0a04 }
            r40 = r0
            int[] r13 = new int[r14]     // Catch:{ all -> 0x0a04 }
            int[] r12 = new int[r14]     // Catch:{ all -> 0x0a04 }
            int[] r11 = new int[r14]     // Catch:{ all -> 0x0a04 }
            r39 = 0
            r0[r17] = r22     // Catch:{ all -> 0x0a04 }
            r0 = r42
            X.C200499hV.A00(r0, r12, r6)     // Catch:{ all -> 0x0a04 }
            X.C200499hV.A00(r1, r11, r6)     // Catch:{ all -> 0x0a04 }
            r1 = 0
            java.lang.System.arraycopy(r11, r1, r13, r1, r14)     // Catch:{ all -> 0x0a04 }
            int r4 = r14 + -1
            r0 = r12[r4]     // Catch:{ all -> 0x0a04 }
            r0 = r0 | 1
            int r1 = java.lang.Integer.numberOfLeadingZeros(r0)     // Catch:{ all -> 0x0a04 }
            int r0 = r14 * 30
            int r0 = r0 + 2
            int r0 = r0 - r6
            int r1 = r1 - r0
            int r3 = -1 - r1
            r1 = r11[r17]     // Catch:{ all -> 0x0a04 }
            int r0 = r1 * r1
            int r50 = 2 - r0
            int r50 = r50 * r1
            int r0 = r1 * r50
            int r0 = 2 - r0
            int r50 = r50 * r0
            int r0 = r1 * r50
            int r0 = 2 - r0
            int r50 = r50 * r0
            int r1 = r1 * r50
            int r0 = 2 - r1
            int r50 = r50 * r0
            int r2 = r6 * 49
            r0 = 46
            r1 = 47
            if (r6 >= r0) goto L_0x06a9
            r1 = 80
        L_0x06a9:
            int r2 = r2 + r1
            int r0 = r2 / 17
            r51 = r0
            r2 = r14
            r36 = 0
        L_0x06b1:
            r0 = 0
        L_0x06b2:
            if (r0 >= r2) goto L_0x0781
            r1 = r12[r0]     // Catch:{ all -> 0x0a04 }
            if (r1 == 0) goto L_0x077d
            r1 = r36
            r0 = r51
            if (r1 >= r0) goto L_0x07e3
            int r36 = r36 + 30
            r35 = r13[r17]     // Catch:{ all -> 0x0a04 }
            r34 = r12[r17]     // Catch:{ all -> 0x0a04 }
            r1 = 30
            r15 = 1
            r33 = 0
            r32 = 0
            r31 = 1
        L_0x06cd:
            r25 = -1
            int r0 = r25 << r1
            r0 = r0 | r34
            int r0 = java.lang.Integer.numberOfTrailingZeros(r0)     // Catch:{ all -> 0x0a04 }
            int r34 = r34 >> r0
            int r15 = r15 << r0
            int r33 = r33 << r0
            int r3 = r3 - r0
            int r1 = r1 - r0
            r30 = 2
            if (r1 > 0) goto L_0x0722
            r41[r17] = r15     // Catch:{ all -> 0x0a04 }
            r41[r22] = r33     // Catch:{ all -> 0x0a04 }
            r41[r30] = r32     // Catch:{ all -> 0x0a04 }
            r0 = 3
            r41[r0] = r31     // Catch:{ all -> 0x0a04 }
            r45 = r5
            r46 = r40
            r47 = r41
            r48 = r11
            r49 = r14
            X.C200499hV.A02(r45, r46, r47, r48, r49, r50)     // Catch:{ all -> 0x0a04 }
            r0 = r41
            X.C200499hV.A01(r13, r12, r0, r2)     // Catch:{ all -> 0x0a04 }
            int r0 = r2 + -1
            r26 = r13[r0]     // Catch:{ all -> 0x0a04 }
            r25 = r12[r0]     // Catch:{ all -> 0x0a04 }
            int r15 = r2 + -2
            int r1 = r15 >> 31
            int r0 = r26 >> 31
            r0 = r0 ^ r26
            r1 = r1 | r0
            int r0 = r25 >> 31
            r0 = r0 ^ r25
            r1 = r1 | r0
            if (r1 != 0) goto L_0x06b1
            r1 = r13[r15]     // Catch:{ all -> 0x0a04 }
            int r0 = r26 << 30
            r0 = r0 | r1
            r13[r15] = r0     // Catch:{ all -> 0x0a04 }
            r1 = r12[r15]     // Catch:{ all -> 0x0a04 }
            int r0 = r25 << 30
            r1 = r1 | r0
            r12[r15] = r1     // Catch:{ all -> 0x0a04 }
            goto L_0x0779
        L_0x0722:
            if (r3 >= 0) goto L_0x0760
            int r3 = -r3
            r0 = r35
            int r0 = -r0
            r26 = r0
            int r0 = -r15
            r46 = r0
            r0 = r33
            int r0 = -r0
            r45 = r0
            int r0 = r3 + 1
            if (r0 <= r1) goto L_0x0737
            r0 = r1
        L_0x0737:
            int r0 = 32 - r0
            int r25 = r25 >>> r0
            r25 = r25 & 63
            int r15 = r34 * r26
            int r0 = r34 * r34
            int r0 = r0 - r30
            int r15 = r15 * r0
            r25 = r25 & r15
            r35 = r34
            r34 = r26
            r15 = r32
            r32 = r46
            r33 = r31
            r31 = r45
        L_0x0752:
            int r0 = r35 * r25
            int r34 = r34 + r0
            int r0 = r15 * r25
            int r32 = r32 + r0
            int r25 = r25 * r33
            int r31 = r31 + r25
            goto L_0x06cd
        L_0x0760:
            int r0 = r3 + 1
            if (r0 <= r1) goto L_0x0765
            r0 = r1
        L_0x0765:
            int r0 = 32 - r0
            int r25 = r25 >>> r0
            r25 = r25 & 15
            int r0 = r35 + 1
            r0 = r0 & 4
            int r0 = r0 << r22
            int r0 = r0 + r35
            int r0 = -r0
            int r0 = r0 * r34
            r25 = r25 & r0
            goto L_0x0752
        L_0x0779:
            int r2 = r2 + -1
            goto L_0x06b1
        L_0x077d:
            int r0 = r0 + 1
            goto L_0x06b2
        L_0x0781:
            int r1 = r2 + -1
            r0 = r13[r1]     // Catch:{ all -> 0x0a04 }
            int r15 = r0 >> 31
            r0 = r5[r4]     // Catch:{ all -> 0x0a04 }
            int r14 = r0 >> 31
            if (r14 >= 0) goto L_0x07ac
            r12 = 0
            r3 = 0
        L_0x078f:
            if (r12 >= r4) goto L_0x07a2
            r0 = r5[r12]     // Catch:{ all -> 0x0a04 }
            int r3 = X.C165607th.A0C(r11, r12, r0, r3)     // Catch:{ all -> 0x0a04 }
            r0 = 1073741823(0x3fffffff, float:1.9999999)
            r0 = r0 & r3
            r5[r12] = r0     // Catch:{ all -> 0x0a04 }
            int r3 = r3 >> 30
            int r12 = r12 + 1
            goto L_0x078f
        L_0x07a2:
            r0 = r5[r4]     // Catch:{ all -> 0x0a04 }
            int r0 = X.C165607th.A0C(r11, r4, r0, r3)     // Catch:{ all -> 0x0a04 }
            r5[r4] = r0     // Catch:{ all -> 0x0a04 }
            int r14 = r0 >> 30
        L_0x07ac:
            if (r15 >= 0) goto L_0x07de
            r0 = 0
            r12 = 0
        L_0x07b0:
            if (r0 >= r4) goto L_0x07c0
            r3 = r5[r0]     // Catch:{ all -> 0x0a04 }
            int r12 = r12 - r3
            r3 = 1073741823(0x3fffffff, float:1.9999999)
            r3 = r3 & r12
            r5[r0] = r3     // Catch:{ all -> 0x0a04 }
            int r12 = r12 >> 30
            int r0 = r0 + 1
            goto L_0x07b0
        L_0x07c0:
            r0 = r5[r4]     // Catch:{ all -> 0x0a04 }
            int r12 = r12 - r0
            r5[r4] = r12     // Catch:{ all -> 0x0a04 }
            int r14 = r12 >> 30
            r0 = 0
            r12 = 0
        L_0x07c9:
            if (r0 >= r1) goto L_0x07d9
            r3 = r13[r0]     // Catch:{ all -> 0x0a04 }
            int r12 = r12 - r3
            r3 = 1073741823(0x3fffffff, float:1.9999999)
            r3 = r3 & r12
            r13[r0] = r3     // Catch:{ all -> 0x0a04 }
            int r12 = r12 >> 30
            int r0 = r0 + 1
            goto L_0x07c9
        L_0x07d9:
            r0 = r13[r1]     // Catch:{ all -> 0x0a04 }
            int r12 = r12 - r0
            r13[r1] = r12     // Catch:{ all -> 0x0a04 }
        L_0x07de:
            r3 = r13[r17]     // Catch:{ all -> 0x0a04 }
            r1 = 1
            if (r3 == r1) goto L_0x07fd
        L_0x07e3:
            r2 = 0
            r0 = r42
            X.C203779or.A00(r2, r2, r0, r7)     // Catch:{ all -> 0x0a04 }
            r2 = 4
            r1 = 5
            X.C203779or.A00(r2, r1, r0, r7)     // Catch:{ all -> 0x0a04 }
            r2 = 9
            r1 = r7[r2]     // Catch:{ all -> 0x0a04 }
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r0
            r7[r2] = r1     // Catch:{ all -> 0x0a04 }
            int r6 = r43 + -1
            int[] r2 = new int[r9]     // Catch:{ all -> 0x0a04 }
            goto L_0x084c
        L_0x07fd:
            if (r1 >= r2) goto L_0x0806
            r0 = r13[r1]     // Catch:{ all -> 0x0a04 }
            if (r0 != 0) goto L_0x07e3
            int r1 = r1 + 1
            goto L_0x07fd
        L_0x0806:
            if (r14 >= 0) goto L_0x0825
            r2 = 0
            r1 = 0
        L_0x080a:
            if (r2 >= r4) goto L_0x081d
            r0 = r5[r2]     // Catch:{ all -> 0x0a04 }
            int r1 = X.C165607th.A0C(r11, r2, r0, r1)     // Catch:{ all -> 0x0a04 }
            r0 = 1073741823(0x3fffffff, float:1.9999999)
            r0 = r0 & r1
            r5[r2] = r0     // Catch:{ all -> 0x0a04 }
            int r1 = r1 >> 30
            int r2 = r2 + 1
            goto L_0x080a
        L_0x081d:
            r0 = r5[r4]     // Catch:{ all -> 0x0a04 }
            int r0 = X.C165607th.A0C(r11, r4, r0, r1)     // Catch:{ all -> 0x0a04 }
            r5[r4] = r0     // Catch:{ all -> 0x0a04 }
        L_0x0825:
            r12 = 0
            r4 = 0
            r2 = 0
        L_0x0829:
            if (r6 <= 0) goto L_0x07e3
        L_0x082b:
            r0 = 32
            int r0 = java.lang.Math.min(r0, r6)     // Catch:{ all -> 0x0a04 }
            if (r4 >= r0) goto L_0x083f
            int r11 = r39 + 1
            r0 = r5[r39]     // Catch:{ all -> 0x0a04 }
            long r0 = (long) r0     // Catch:{ all -> 0x0a04 }
            long r0 = r0 << r4
            long r2 = r2 | r0
            int r4 = r4 + 30
            r39 = r11
            goto L_0x082b
        L_0x083f:
            int r1 = r12 + 1
            int r0 = (int) r2     // Catch:{ all -> 0x0a04 }
            r42[r12] = r0     // Catch:{ all -> 0x0a04 }
            long r2 = r2 >>> r19
            int r4 = r4 + -32
            int r6 = r6 + -32
            r12 = r1
            goto L_0x0829
        L_0x084c:
            r1 = 0
            if (r6 <= 0) goto L_0x0876
            int r5 = r6 + -1
            int r3 = r5 * 10
        L_0x0853:
            int r0 = r3 + r1
            r0 = r44[r0]     // Catch:{ all -> 0x0a04 }
            r2[r1] = r0     // Catch:{ all -> 0x0a04 }
            int r1 = r1 + 1
            if (r1 < r9) goto L_0x0853
            X.C203779or.A0D(r2, r7, r2)     // Catch:{ all -> 0x0a04 }
            int r4 = r6 * 10
            r3 = 0
        L_0x0863:
            int r1 = r4 + r3
            r0 = r2[r3]     // Catch:{ all -> 0x0a04 }
            r44[r1] = r0     // Catch:{ all -> 0x0a04 }
            int r3 = r3 + 1
            if (r3 < r9) goto L_0x0863
            r0 = r8[r6]     // Catch:{ all -> 0x0a04 }
            int[] r0 = r0.A03     // Catch:{ all -> 0x0a04 }
            X.C203779or.A0D(r7, r0, r7)     // Catch:{ all -> 0x0a04 }
            r6 = r5
            goto L_0x084c
        L_0x0876:
            r0 = r44
            int r1 = X.C165607th.A0E(r7, r0, r1)     // Catch:{ all -> 0x0a04 }
            if (r1 < r9) goto L_0x0876
            r5 = 0
        L_0x087f:
            r3 = r8[r5]     // Catch:{ all -> 0x0a04 }
            int[] r1 = new int[r9]     // Catch:{ all -> 0x0a04 }
            int[] r0 = new int[r9]     // Catch:{ all -> 0x0a04 }
            int r6 = r5 * 10
            r4 = 0
        L_0x0888:
            int r2 = r6 + r4
            r2 = r44[r2]     // Catch:{ all -> 0x0a04 }
            r0[r4] = r2     // Catch:{ all -> 0x0a04 }
            int r4 = r4 + 1
            if (r4 < r9) goto L_0x0888
            int[] r2 = r3.A01     // Catch:{ all -> 0x0a04 }
            X.C203779or.A0D(r2, r0, r1)     // Catch:{ all -> 0x0a04 }
            int[] r2 = r3.A02     // Catch:{ all -> 0x0a04 }
            X.C203779or.A0D(r2, r0, r0)     // Catch:{ all -> 0x0a04 }
            int[] r2 = new int[r9]     // Catch:{ all -> 0x0a04 }
            int[] r3 = new int[r9]     // Catch:{ all -> 0x0a04 }
            int[] r4 = new int[r9]     // Catch:{ all -> 0x0a04 }
            X.C203779or.A0F(r0, r1, r2, r3)     // Catch:{ all -> 0x0a04 }
            X.C203779or.A0D(r1, r0, r4)     // Catch:{ all -> 0x0a04 }
            int[] r0 = X.C203469o5.A06     // Catch:{ all -> 0x0a04 }
            X.C203779or.A0D(r4, r0, r4)     // Catch:{ all -> 0x0a04 }
            X.C203779or.A05(r2)     // Catch:{ all -> 0x0a04 }
            X.C203779or.A05(r3)     // Catch:{ all -> 0x0a04 }
            int[] r7 = X.C203469o5.A00     // Catch:{ all -> 0x0a04 }
            r1 = 0
        L_0x08b6:
            int r6 = r38 + r1
            r0 = r2[r1]     // Catch:{ all -> 0x0a04 }
            r7[r6] = r0     // Catch:{ all -> 0x0a04 }
            int r1 = r1 + 1
            if (r1 < r9) goto L_0x08b6
            int r6 = r38 + 10
            r2 = 0
        L_0x08c3:
            int r1 = r6 + r2
            r0 = r3[r2]     // Catch:{ all -> 0x0a04 }
            r7[r1] = r0     // Catch:{ all -> 0x0a04 }
            int r2 = r2 + 1
            if (r2 < r9) goto L_0x08c3
            int r3 = r6 + 10
            r2 = 0
        L_0x08d0:
            int r1 = r3 + r2
            r0 = r4[r2]     // Catch:{ all -> 0x0a04 }
            r7[r1] = r0     // Catch:{ all -> 0x0a04 }
            int r2 = r2 + 1
            if (r2 < r9) goto L_0x08d0
            int r38 = r3 + 10
            int r5 = r5 + 1
            if (r5 < r10) goto L_0x087f
            int r37 = r37 + 1
            r0 = r37
            if (r0 >= r10) goto L_0x08e8
            goto L_0x0519
        L_0x08e8:
            monitor-exit(r29)     // Catch:{ all -> 0x0a04 }
            r1 = 7
            r0 = r28
            byte[] r9 = X.C203469o5.A06(r0, r1)     // Catch:{ all -> 0x0a07 }
            r1 = 5
            r0 = r27
            byte[] r8 = X.C203469o5.A06(r0, r1)     // Catch:{ all -> 0x0a07 }
            X.9M1 r5 = new X.9M1     // Catch:{ all -> 0x0a07 }
            r5.<init>()     // Catch:{ all -> 0x0a07 }
            int[] r4 = r5.A01     // Catch:{ all -> 0x0a07 }
            r1 = 0
        L_0x08ff:
            r0 = r20
            int r1 = X.C165607th.A0E(r0, r4, r1)     // Catch:{ all -> 0x0a07 }
            r3 = 10
            if (r1 < r3) goto L_0x08ff
            int[] r2 = r5.A02     // Catch:{ all -> 0x0a07 }
            r1 = 0
        L_0x090c:
            r0 = r21
            int r1 = X.C165607th.A0E(r0, r2, r1)     // Catch:{ all -> 0x0a07 }
            if (r1 < r3) goto L_0x090c
            int[] r0 = r5.A03     // Catch:{ all -> 0x0a07 }
            X.C203779or.A06(r0)     // Catch:{ all -> 0x0a07 }
            int[] r0 = r5.A00     // Catch:{ all -> 0x0a07 }
            X.C203779or.A0D(r4, r2, r0)     // Catch:{ all -> 0x0a07 }
            X.9M1[] r7 = X.C203469o5.A07(r5, r10)     // Catch:{ all -> 0x0a07 }
            r0 = 0
        L_0x0923:
            r23[r0] = r17     // Catch:{ all -> 0x0a07 }
            int r0 = r0 + 1
            r6 = 10
            if (r0 < r3) goto L_0x0923
            X.C203779or.A06(r59)     // Catch:{ all -> 0x0a07 }
            X.C203779or.A06(r58)     // Catch:{ all -> 0x0a07 }
            r0 = 0
        L_0x0932:
            r24[r0] = r17     // Catch:{ all -> 0x0a07 }
            int r0 = r0 + 1
            if (r0 < r3) goto L_0x0932
            X.C203779or.A06(r57)     // Catch:{ all -> 0x0a07 }
            r5 = 252(0xfc, float:3.53E-43)
        L_0x093d:
            byte r1 = r9[r5]     // Catch:{ all -> 0x0a07 }
            r32 = 0
            if (r1 == 0) goto L_0x095d
            int r0 = r1 >> 31
            r1 = r1 ^ r0
            int r1 = r1 >>> r22
            boolean r31 = X.AnonymousClass000.A1P(r0)
            X.9M1[] r0 = X.C203469o5.A01     // Catch:{ all -> 0x0a07 }
            r25 = r0[r1]     // Catch:{ all -> 0x0a07 }
            r26 = r24
            r27 = r57
            r28 = r23
            r29 = r59
            r30 = r58
            X.C203469o5.A02(r25, r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x0a07 }
        L_0x095d:
            byte r1 = r8[r5]     // Catch:{ all -> 0x0a07 }
            if (r1 == 0) goto L_0x0979
            int r0 = r1 >> 31
            r1 = r1 ^ r0
            int r1 = r1 >>> r22
            if (r0 == 0) goto L_0x096a
            r32 = 1
        L_0x096a:
            r26 = r7[r1]     // Catch:{ all -> 0x0a07 }
            r27 = r24
            r28 = r57
            r29 = r23
            r30 = r59
            r31 = r58
            X.C203469o5.A02(r26, r27, r28, r29, r30, r31, r32)     // Catch:{ all -> 0x0a07 }
        L_0x0979:
            int r5 = r5 + -1
            if (r5 >= 0) goto L_0x097e
            goto L_0x098c
        L_0x097e:
            r4 = r24
            r3 = r57
            r2 = r23
            r1 = r59
            r0 = r58
            X.C203469o5.A04(r4, r3, r2, r1, r0)     // Catch:{ all -> 0x0a07 }
            goto L_0x093d
        L_0x098c:
            r0 = 32
            byte[] r4 = new byte[r0]     // Catch:{ all -> 0x0a07 }
            int[] r5 = new int[r6]     // Catch:{ all -> 0x0a07 }
            int[] r2 = new int[r6]     // Catch:{ all -> 0x0a07 }
            r0 = r58
            X.C203779or.A08(r0, r2)     // Catch:{ all -> 0x0a07 }
            r0 = r23
            X.C203779or.A0D(r0, r2, r5)     // Catch:{ all -> 0x0a07 }
            r0 = r59
            X.C203779or.A0D(r0, r2, r2)     // Catch:{ all -> 0x0a07 }
            X.C203779or.A05(r5)     // Catch:{ all -> 0x0a07 }
            X.C203779or.A05(r2)     // Catch:{ all -> 0x0a07 }
            int[] r7 = new int[r6]     // Catch:{ all -> 0x0a07 }
            int[] r0 = new int[r6]     // Catch:{ all -> 0x0a07 }
            int[] r3 = new int[r6]     // Catch:{ all -> 0x0a07 }
            X.C203779or.A0A(r5, r0)     // Catch:{ all -> 0x0a07 }
            X.C203779or.A0A(r2, r3)     // Catch:{ all -> 0x0a07 }
            X.C203779or.A0D(r0, r3, r7)     // Catch:{ all -> 0x0a07 }
            X.C203779or.A0E(r3, r0, r3)     // Catch:{ all -> 0x0a07 }
            r0 = r18
            X.C203779or.A0D(r7, r0, r7)     // Catch:{ all -> 0x0a07 }
            r1 = 0
            X.C165587tf.A1V(r7, r1)     // Catch:{ all -> 0x0a07 }
            X.C203779or.A0E(r7, r3, r7)     // Catch:{ all -> 0x0a07 }
            X.C203779or.A05(r7)     // Catch:{ all -> 0x0a07 }
            r3 = 0
        L_0x09cb:
            r0 = r7[r1]     // Catch:{ all -> 0x0a07 }
            r3 = r3 | r0
            int r1 = r1 + 1
            if (r1 < r6) goto L_0x09cb
            int r1 = r3 >>> 1
            r0 = r3 & 1
            r1 = r1 | r0
            int r0 = r1 + -1
            int r3 = r0 >> 31
            r1 = 0
            X.C203779or.A03(r4, r2, r1, r1)     // Catch:{ all -> 0x0a07 }
            r1 = 16
            r0 = 5
            X.C203779or.A03(r4, r2, r0, r1)     // Catch:{ all -> 0x0a07 }
            r2 = 31
            byte r1 = r4[r2]     // Catch:{ all -> 0x0a07 }
            r0 = r5[r17]     // Catch:{ all -> 0x0a07 }
            r0 = r0 & 1
            int r0 = r0 << 7
            X.C165587tf.A1T(r4, r0, r1, r2)     // Catch:{ all -> 0x0a07 }
            if (r3 == 0) goto L_0x01af
            r0 = r60
            boolean r0 = java.util.Arrays.equals(r4, r0)     // Catch:{ all -> 0x0a07 }
            if (r0 == 0) goto L_0x01af
            r17 = 1
            goto L_0x01af
        L_0x0a00:
            r17 = 0
        L_0x0a02:
            monitor-exit(r16)
            return r17
        L_0x0a04:
            r0 = move-exception
            monitor-exit(r29)     // Catch:{ all -> 0x0a04 }
            throw r0     // Catch:{ all -> 0x0a07 }
        L_0x0a07:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C187098xE.A00(X.AZk, byte[]):boolean");
    }
}
