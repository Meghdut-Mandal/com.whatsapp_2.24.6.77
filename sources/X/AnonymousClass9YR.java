package X;

/* renamed from: X.9YR  reason: invalid class name */
public abstract class AnonymousClass9YR {
    public int A00;
    public C191799En A01;
    public final C23074B3e A02;

    public int A00() {
        int readInt;
        boolean z = this instanceof C177758eK;
        A01();
        if (z) {
            C23074B3e b3e = this.A02;
            b3e.readInt();
            readInt = b3e.readInt() * this.A01.A00[((C188498zg) C36371kC.A0r(C188498zg.A00, b3e.readByte() & 255)).typeId];
            byte[] bArr = new byte[readInt];
            C21219ADb aDb = (C21219ADb) b3e;
            aDb.A00.Bmr(bArr);
            aDb.A01.write(new byte[bArr.length]);
        } else {
            C23074B3e b3e2 = this.A02;
            b3e2.readInt();
            readInt = b3e2.readInt() * this.A01.A00[((C188498zg) C36371kC.A0r(C188498zg.A00, b3e2.readByte() & 255)).typeId];
            A03((long) readInt);
        }
        return this.A00 + 4 + 4 + 1 + readInt;
    }

    public long A01() {
        int i;
        int i2 = this.A00;
        if (i2 == 1) {
            i = this.A02.readByte();
        } else if (i2 == 2) {
            i = this.A02.readShort();
        } else if (i2 == 4) {
            i = this.A02.readInt();
        } else if (i2 == 8) {
            return this.A02.readLong();
        } else {
            throw AnonymousClass001.A08("ID Length must be 1, 2, 4, or 8");
        }
        return (long) i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: X.8zg[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x02ff, code lost:
        A01();
        r5.readInt();
        r5.readInt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0313, code lost:
        r8 = (r6.A00 + 4) + 4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r19 = this;
            X.9En r0 = new X.9En
            r0.<init>()
            r6 = r19
            r6.A01 = r0
        L_0x0009:
            X.B3e r5 = r6.A02     // Catch:{ EOFException -> 0x0371 }
            byte r0 = r5.readByte()     // Catch:{ EOFException -> 0x0371 }
            if (r0 != 0) goto L_0x0009
            int r3 = r5.readInt()     // Catch:{ EOFException -> 0x0371 }
            r6.A00 = r3     // Catch:{ EOFException -> 0x0371 }
            X.9En r7 = r6.A01     // Catch:{ EOFException -> 0x0371 }
            r4 = 0
            r8 = -1
            r2 = 0
            r1 = -1
        L_0x001d:
            X.8zg[] r0 = X.C188498zg.values()     // Catch:{ EOFException -> 0x0371 }
            int r0 = r0.length     // Catch:{ EOFException -> 0x0371 }
            if (r2 >= r0) goto L_0x0033
            X.8zg[] r0 = X.C188498zg.values()     // Catch:{ EOFException -> 0x0371 }
            r0 = r0[r2]     // Catch:{ EOFException -> 0x0371 }
            int r0 = r0.typeId     // Catch:{ EOFException -> 0x0371 }
            int r1 = java.lang.Math.max(r0, r1)     // Catch:{ EOFException -> 0x0371 }
            int r2 = r2 + 1
            goto L_0x001d
        L_0x0033:
            int r0 = r1 + 1
            int[] r0 = new int[r0]     // Catch:{ EOFException -> 0x0371 }
            r7.A00 = r0     // Catch:{ EOFException -> 0x0371 }
            java.util.Arrays.fill(r0, r8)     // Catch:{ EOFException -> 0x0371 }
        L_0x003c:
            X.8zg[] r0 = X.C188498zg.values()     // Catch:{ EOFException -> 0x0371 }
            int r0 = r0.length     // Catch:{ EOFException -> 0x0371 }
            if (r4 >= r0) goto L_0x005a
            int[] r2 = r7.A00     // Catch:{ EOFException -> 0x0371 }
            X.8zg[] r0 = X.C188498zg.values()     // Catch:{ EOFException -> 0x0371 }
            r0 = r0[r4]     // Catch:{ EOFException -> 0x0371 }
            int r1 = r0.typeId     // Catch:{ EOFException -> 0x0371 }
            X.8zg[] r0 = X.C188498zg.values()     // Catch:{ EOFException -> 0x0371 }
            r0 = r0[r4]     // Catch:{ EOFException -> 0x0371 }
            int r0 = r0.size     // Catch:{ EOFException -> 0x0371 }
            r2[r1] = r0     // Catch:{ EOFException -> 0x0371 }
            int r4 = r4 + 1
            goto L_0x003c
        L_0x005a:
            int[] r1 = r7.A00     // Catch:{ EOFException -> 0x0371 }
            X.8zg r4 = X.C188498zg.A02     // Catch:{ EOFException -> 0x0371 }
            int r0 = r4.typeId     // Catch:{ EOFException -> 0x0371 }
            r1[r0] = r3     // Catch:{ EOFException -> 0x0371 }
            r5.readLong()     // Catch:{ EOFException -> 0x0371 }
        L_0x0065:
            boolean r0 = r5.BK5()     // Catch:{ EOFException -> 0x0371 }
            if (r0 == 0) goto L_0x0371
            byte r0 = r5.readByte()     // Catch:{ EOFException -> 0x0371 }
            r3 = r0 & 255(0xff, float:3.57E-43)
            r5.readInt()     // Catch:{ EOFException -> 0x0371 }
            int r0 = r5.readInt()     // Catch:{ EOFException -> 0x0371 }
            long r0 = X.C165597tg.A0C(r0)
            r2 = 12
            if (r3 == r2) goto L_0x0088
            r2 = 28
            if (r3 == r2) goto L_0x0088
            r6.A03(r0)     // Catch:{ EOFException -> 0x0371 }
            goto L_0x0065
        L_0x0088:
            r7 = 0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x0065
            byte r2 = r5.readByte()     // Catch:{ EOFException -> 0x0371 }
            r7 = r2 & 255(0xff, float:3.57E-43)
            r2 = 1
            long r0 = r0 - r2
            r2 = 144(0x90, float:2.02E-43)
            if (r7 == r2) goto L_0x0335
            r2 = 195(0xc3, float:2.73E-43)
            if (r7 == r2) goto L_0x0341
            r2 = 254(0xfe, float:3.56E-43)
            if (r7 == r2) goto L_0x032a
            r2 = 255(0xff, float:3.57E-43)
            if (r7 == r2) goto L_0x0335
            switch(r7) {
                case 1: goto L_0x031a;
                case 2: goto L_0x0309;
                case 3: goto L_0x0309;
                case 4: goto L_0x02f4;
                case 5: goto L_0x0335;
                case 6: goto L_0x02f4;
                case 7: goto L_0x0335;
                case 8: goto L_0x02ff;
                default: goto L_0x00aa;
            }     // Catch:{ EOFException -> 0x0371 }
        L_0x00aa:
            switch(r7) {
                case 32: goto L_0x0175;
                case 33: goto L_0x00d6;
                case 34: goto L_0x00b2;
                case 35: goto L_0x00d0;
                default: goto L_0x00ad;
            }     // Catch:{ EOFException -> 0x0371 }
        L_0x00ad:
            switch(r7) {
                case 137: goto L_0x0335;
                case 138: goto L_0x0335;
                case 139: goto L_0x0335;
                case 140: goto L_0x0335;
                case 141: goto L_0x0335;
                case 142: goto L_0x02ff;
                default: goto L_0x00b0;
            }     // Catch:{ EOFException -> 0x0371 }
        L_0x00b0:
            goto L_0x0352
        L_0x00b2:
            r6.A01()     // Catch:{ EOFException -> 0x0371 }
            r5.readInt()     // Catch:{ EOFException -> 0x0371 }
            int r7 = r5.readInt()     // Catch:{ EOFException -> 0x0371 }
            r6.A01()     // Catch:{ EOFException -> 0x0371 }
            int r2 = r6.A00     // Catch:{ EOFException -> 0x0371 }
            int r7 = r7 * r2
            long r2 = (long) r7     // Catch:{ EOFException -> 0x0371 }
            r6.A03(r2)     // Catch:{ EOFException -> 0x0371 }
            int r3 = r6.A00     // Catch:{ EOFException -> 0x0371 }
            int r2 = r3 + 4
            int r8 = r2 + 4
            int r8 = r8 + r3
            int r8 = r8 + r7
            goto L_0x033d
        L_0x00d0:
            int r8 = r6.A00()     // Catch:{ EOFException -> 0x0371 }
            goto L_0x033d
        L_0x00d6:
            boolean r2 = r6 instanceof X.C177758eK     // Catch:{ EOFException -> 0x0371 }
            if (r2 == 0) goto L_0x015a
            r8 = r6
            X.8eK r8 = (X.C177758eK) r8     // Catch:{ EOFException -> 0x0371 }
            r8.A01()     // Catch:{ EOFException -> 0x0371 }
            X.B3e r7 = r8.A02     // Catch:{ EOFException -> 0x0371 }
            r7.readInt()     // Catch:{ EOFException -> 0x0371 }
            long r9 = r8.A01()     // Catch:{ EOFException -> 0x0371 }
            int r15 = r7.readInt()     // Catch:{ EOFException -> 0x0371 }
            X.9Em r2 = r8.A00     // Catch:{ EOFException -> 0x0371 }
            java.util.ArrayList r13 = X.AnonymousClass001.A0I()     // Catch:{ EOFException -> 0x0371 }
            java.util.Map r12 = r2.A00     // Catch:{ EOFException -> 0x0371 }
            java.lang.Long r2 = java.lang.Long.valueOf(r9)     // Catch:{ EOFException -> 0x0371 }
        L_0x00f9:
            java.lang.Object r14 = r12.get(r2)     // Catch:{ EOFException -> 0x0371 }
            X.9KN r14 = (X.AnonymousClass9KN) r14     // Catch:{ EOFException -> 0x0371 }
            r13.add(r14)     // Catch:{ EOFException -> 0x0371 }
            if (r14 == 0) goto L_0x0113
            long r2 = r14.A01     // Catch:{ EOFException -> 0x0371 }
            r10 = 0
            int r9 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r9 == 0) goto L_0x0113
            long r2 = r14.A01     // Catch:{ EOFException -> 0x0371 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ EOFException -> 0x0371 }
            goto L_0x00f9
        L_0x0113:
            java.util.Iterator r11 = r13.iterator()     // Catch:{ EOFException -> 0x0371 }
        L_0x0117:
            boolean r2 = r11.hasNext()     // Catch:{ EOFException -> 0x0371 }
            if (r2 == 0) goto L_0x0150
            java.lang.Object r2 = r11.next()     // Catch:{ EOFException -> 0x0371 }
            X.9KN r2 = (X.AnonymousClass9KN) r2     // Catch:{ EOFException -> 0x0371 }
            java.util.List r2 = r2.A02     // Catch:{ EOFException -> 0x0371 }
            java.util.Iterator r10 = r2.iterator()     // Catch:{ EOFException -> 0x0371 }
        L_0x0129:
            boolean r2 = r10.hasNext()     // Catch:{ EOFException -> 0x0371 }
            if (r2 == 0) goto L_0x0117
            java.lang.Object r2 = r10.next()     // Catch:{ EOFException -> 0x0371 }
            X.8zg r2 = (X.C188498zg) r2     // Catch:{ EOFException -> 0x0371 }
            if (r2 != r4) goto L_0x013b
            r8.A01()     // Catch:{ EOFException -> 0x0371 }
            goto L_0x0129
        L_0x013b:
            r9 = r7
            X.ADb r9 = (X.C21219ADb) r9     // Catch:{ EOFException -> 0x0371 }
            int r2 = r2.size     // Catch:{ EOFException -> 0x0371 }
            byte[] r3 = new byte[r2]     // Catch:{ EOFException -> 0x0371 }
            X.B3e r2 = r9.A00     // Catch:{ EOFException -> 0x0371 }
            r2.Bmr(r3)     // Catch:{ EOFException -> 0x0371 }
            int r2 = r3.length     // Catch:{ EOFException -> 0x0371 }
            byte[] r3 = new byte[r2]     // Catch:{ EOFException -> 0x0371 }
            java.io.DataOutputStream r2 = r9.A01     // Catch:{ EOFException -> 0x0371 }
            r2.write(r3)     // Catch:{ EOFException -> 0x0371 }
            goto L_0x0129
        L_0x0150:
            int r3 = r8.A00     // Catch:{ EOFException -> 0x0371 }
            int r2 = r3 + 4
            int r2 = r2 + r3
            int r8 = r2 + 4
            int r8 = r8 + r15
            goto L_0x033d
        L_0x015a:
            r6.A01()     // Catch:{ EOFException -> 0x0371 }
            r5.readInt()     // Catch:{ EOFException -> 0x0371 }
            r6.A01()     // Catch:{ EOFException -> 0x0371 }
            int r7 = r5.readInt()     // Catch:{ EOFException -> 0x0371 }
            long r2 = (long) r7     // Catch:{ EOFException -> 0x0371 }
            r6.A03(r2)     // Catch:{ EOFException -> 0x0371 }
            int r3 = r6.A00     // Catch:{ EOFException -> 0x0371 }
            int r2 = r3 + 4
            int r2 = r2 + r3
            int r8 = r2 + 4
            int r8 = r8 + r7
            goto L_0x033d
        L_0x0175:
            boolean r2 = r6 instanceof X.C177758eK     // Catch:{ EOFException -> 0x0371 }
            if (r2 == 0) goto L_0x022a
            r6.A01()     // Catch:{ EOFException -> 0x0371 }
            r5.readInt()     // Catch:{ EOFException -> 0x0371 }
            r6.A01()     // Catch:{ EOFException -> 0x0371 }
            r6.A01()     // Catch:{ EOFException -> 0x0371 }
            r6.A01()     // Catch:{ EOFException -> 0x0371 }
            r6.A01()     // Catch:{ EOFException -> 0x0371 }
            r6.A01()     // Catch:{ EOFException -> 0x0371 }
            r6.A01()     // Catch:{ EOFException -> 0x0371 }
            r5.readInt()     // Catch:{ EOFException -> 0x0371 }
            int r2 = r6.A00     // Catch:{ EOFException -> 0x0371 }
            int r2 = r2 * 7
            int r2 = r2 + 4
            int r2 = r2 + 4
            short r10 = r5.readShort()     // Catch:{ EOFException -> 0x0371 }
            r13 = 65535(0xffff, float:9.1834E-41)
            r10 = r10 & r13
            int r12 = r2 + 2
            r7 = 0
            r9 = 0
        L_0x01a8:
            if (r9 >= r10) goto L_0x01cf
            r5.readShort()     // Catch:{ EOFException -> 0x0371 }
            byte r2 = r5.readByte()     // Catch:{ EOFException -> 0x0371 }
            r3 = r2 & 255(0xff, float:3.57E-43)
            java.util.Map r2 = X.C188498zg.A00     // Catch:{ EOFException -> 0x0371 }
            java.lang.Object r8 = X.C36371kC.A0r(r2, r3)     // Catch:{ EOFException -> 0x0371 }
            X.8zg r8 = (X.C188498zg) r8     // Catch:{ EOFException -> 0x0371 }
            X.9En r2 = r6.A01     // Catch:{ EOFException -> 0x0371 }
            int[] r3 = r2.A00     // Catch:{ EOFException -> 0x0371 }
            int r2 = r8.typeId     // Catch:{ EOFException -> 0x0371 }
            r8 = r3[r2]     // Catch:{ EOFException -> 0x0371 }
            long r2 = (long) r8     // Catch:{ EOFException -> 0x0371 }
            r6.A03(r2)     // Catch:{ EOFException -> 0x0371 }
            int r2 = r8 + 1
            int r2 = r2 + 2
            int r12 = r12 + r2
            int r9 = r9 + 1
            goto L_0x01a8
        L_0x01cf:
            short r11 = r5.readShort()     // Catch:{ EOFException -> 0x0371 }
            r11 = r11 & r13
            int r10 = r12 + 2
            r9 = 0
        L_0x01d7:
            if (r9 >= r11) goto L_0x0213
            r6.A01()     // Catch:{ EOFException -> 0x0371 }
            byte r3 = r5.readByte()     // Catch:{ EOFException -> 0x0371 }
            java.util.Map r2 = X.C188498zg.A00     // Catch:{ EOFException -> 0x0371 }
            java.lang.Object r8 = X.C36371kC.A0r(r2, r3)     // Catch:{ EOFException -> 0x0371 }
            X.8zg r8 = (X.C188498zg) r8     // Catch:{ EOFException -> 0x0371 }
            if (r8 != r4) goto L_0x01fe
            r6.A01()     // Catch:{ EOFException -> 0x0371 }
        L_0x01ed:
            int r2 = r6.A00     // Catch:{ EOFException -> 0x0371 }
            int r12 = r2 + 1
            X.9En r2 = r6.A01     // Catch:{ EOFException -> 0x0371 }
            int[] r3 = r2.A00     // Catch:{ EOFException -> 0x0371 }
            int r2 = r8.typeId     // Catch:{ EOFException -> 0x0371 }
            int r10 = X.C165607th.A0C(r3, r2, r12, r10)     // Catch:{ EOFException -> 0x0371 }
            int r9 = r9 + 1
            goto L_0x01d7
        L_0x01fe:
            r12 = r5
            X.ADb r12 = (X.C21219ADb) r12     // Catch:{ EOFException -> 0x0371 }
            int r2 = r8.size     // Catch:{ EOFException -> 0x0371 }
            byte[] r3 = new byte[r2]     // Catch:{ EOFException -> 0x0371 }
            X.B3e r2 = r12.A00     // Catch:{ EOFException -> 0x0371 }
            r2.Bmr(r3)     // Catch:{ EOFException -> 0x0371 }
            int r2 = r3.length     // Catch:{ EOFException -> 0x0371 }
            byte[] r3 = new byte[r2]     // Catch:{ EOFException -> 0x0371 }
            java.io.DataOutputStream r2 = r12.A01     // Catch:{ EOFException -> 0x0371 }
            r2.write(r3)     // Catch:{ EOFException -> 0x0371 }
            goto L_0x01ed
        L_0x0213:
            short r3 = r5.readShort()     // Catch:{ EOFException -> 0x0371 }
            r3 = r3 & r13
            int r8 = r10 + 2
        L_0x021a:
            if (r7 >= r3) goto L_0x033d
            r6.A01()     // Catch:{ EOFException -> 0x0371 }
            r5.readByte()     // Catch:{ EOFException -> 0x0371 }
            int r2 = r6.A00     // Catch:{ EOFException -> 0x0371 }
            int r2 = r2 + 1
            int r8 = r8 + r2
            int r7 = r7 + 1
            goto L_0x021a
        L_0x022a:
            r7 = r6
            X.8eJ r7 = (X.C177748eJ) r7     // Catch:{ EOFException -> 0x0371 }
            long r15 = r7.A01()     // Catch:{ EOFException -> 0x0371 }
            X.B3e r12 = r7.A02     // Catch:{ EOFException -> 0x0371 }
            r12.readInt()     // Catch:{ EOFException -> 0x0371 }
            long r17 = r7.A01()     // Catch:{ EOFException -> 0x0371 }
            r7.A01()     // Catch:{ EOFException -> 0x0371 }
            r7.A01()     // Catch:{ EOFException -> 0x0371 }
            r7.A01()     // Catch:{ EOFException -> 0x0371 }
            r7.A01()     // Catch:{ EOFException -> 0x0371 }
            r7.A01()     // Catch:{ EOFException -> 0x0371 }
            r12.readInt()     // Catch:{ EOFException -> 0x0371 }
            int r2 = r7.A00     // Catch:{ EOFException -> 0x0371 }
            int r2 = r2 * 7
            int r2 = r2 + 4
            int r2 = r2 + 4
            short r9 = r12.readShort()     // Catch:{ EOFException -> 0x0371 }
            r14 = 65535(0xffff, float:9.1834E-41)
            r9 = r9 & r14
            int r13 = r2 + 2
            r8 = 0
        L_0x025f:
            if (r8 >= r9) goto L_0x0286
            r12.readShort()     // Catch:{ EOFException -> 0x0371 }
            byte r2 = r12.readByte()     // Catch:{ EOFException -> 0x0371 }
            r3 = r2 & 255(0xff, float:3.57E-43)
            java.util.Map r2 = X.C188498zg.A00     // Catch:{ EOFException -> 0x0371 }
            java.lang.Object r10 = X.C36371kC.A0r(r2, r3)     // Catch:{ EOFException -> 0x0371 }
            X.8zg r10 = (X.C188498zg) r10     // Catch:{ EOFException -> 0x0371 }
            X.9En r2 = r7.A01     // Catch:{ EOFException -> 0x0371 }
            int[] r3 = r2.A00     // Catch:{ EOFException -> 0x0371 }
            int r2 = r10.typeId     // Catch:{ EOFException -> 0x0371 }
            r10 = r3[r2]     // Catch:{ EOFException -> 0x0371 }
            long r2 = (long) r10     // Catch:{ EOFException -> 0x0371 }
            r7.A03(r2)     // Catch:{ EOFException -> 0x0371 }
            int r2 = r10 + 1
            int r2 = r2 + 2
            int r13 = r13 + r2
            int r8 = r8 + 1
            goto L_0x025f
        L_0x0286:
            short r11 = r12.readShort()     // Catch:{ EOFException -> 0x0371 }
            r11 = r11 & r14
            int r9 = r13 + 2
            r10 = 0
        L_0x028e:
            if (r10 >= r11) goto L_0x02bc
            r7.A01()     // Catch:{ EOFException -> 0x0371 }
            byte r3 = r12.readByte()     // Catch:{ EOFException -> 0x0371 }
            java.util.Map r2 = X.C188498zg.A00     // Catch:{ EOFException -> 0x0371 }
            java.lang.Object r8 = X.C36371kC.A0r(r2, r3)     // Catch:{ EOFException -> 0x0371 }
            X.8zg r8 = (X.C188498zg) r8     // Catch:{ EOFException -> 0x0371 }
            X.9En r2 = r7.A01     // Catch:{ EOFException -> 0x0371 }
            int[] r3 = r2.A00     // Catch:{ EOFException -> 0x0371 }
            int r2 = r8.typeId     // Catch:{ EOFException -> 0x0371 }
            r2 = r3[r2]     // Catch:{ EOFException -> 0x0371 }
            long r2 = (long) r2     // Catch:{ EOFException -> 0x0371 }
            r7.A03(r2)     // Catch:{ EOFException -> 0x0371 }
            int r2 = r7.A00     // Catch:{ EOFException -> 0x0371 }
            int r3 = r2 + 1
            X.9En r2 = r7.A01     // Catch:{ EOFException -> 0x0371 }
            int[] r2 = r2.A00     // Catch:{ EOFException -> 0x0371 }
            int r8 = r8.typeId     // Catch:{ EOFException -> 0x0371 }
            int r9 = X.C165607th.A0C(r2, r8, r3, r9)     // Catch:{ EOFException -> 0x0371 }
            int r10 = r10 + 1
            goto L_0x028e
        L_0x02bc:
            short r10 = r12.readShort()     // Catch:{ EOFException -> 0x0371 }
            r10 = r10 & r14
            X.8zg[] r14 = new X.C188498zg[r10]     // Catch:{ EOFException -> 0x0371 }
            int r8 = r9 + 2
            r9 = 0
        L_0x02c6:
            if (r9 >= r10) goto L_0x02e1
            r7.A01()     // Catch:{ EOFException -> 0x0371 }
            byte r2 = r12.readByte()     // Catch:{ EOFException -> 0x0371 }
            r3 = r2 & 255(0xff, float:3.57E-43)
            java.util.Map r2 = X.C188498zg.A00     // Catch:{ EOFException -> 0x0371 }
            java.lang.Object r2 = X.C36371kC.A0r(r2, r3)     // Catch:{ EOFException -> 0x0371 }
            r14[r9] = r2     // Catch:{ EOFException -> 0x0371 }
            int r2 = r7.A00     // Catch:{ EOFException -> 0x0371 }
            int r2 = r2 + 1
            int r8 = r8 + r2
            int r9 = r9 + 1
            goto L_0x02c6
        L_0x02e1:
            X.9KN r13 = new X.9KN     // Catch:{ EOFException -> 0x0371 }
            r13.<init>(r14, r15, r17)     // Catch:{ EOFException -> 0x0371 }
            X.9Em r2 = r7.A00     // Catch:{ EOFException -> 0x0371 }
            java.util.Map r7 = r2.A00     // Catch:{ EOFException -> 0x0371 }
            long r2 = r13.A00     // Catch:{ EOFException -> 0x0371 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ EOFException -> 0x0371 }
            r7.put(r2, r13)     // Catch:{ EOFException -> 0x0371 }
            goto L_0x033d
        L_0x02f4:
            r6.A01()     // Catch:{ EOFException -> 0x0371 }
            r5.readInt()     // Catch:{ EOFException -> 0x0371 }
            int r2 = r6.A00     // Catch:{ EOFException -> 0x0371 }
            int r8 = r2 + 4
            goto L_0x033d
        L_0x02ff:
            r6.A01()     // Catch:{ EOFException -> 0x0371 }
            r5.readInt()     // Catch:{ EOFException -> 0x0371 }
            r5.readInt()     // Catch:{ EOFException -> 0x0371 }
            goto L_0x0313
        L_0x0309:
            int r2 = r6.A00     // Catch:{ EOFException -> 0x0371 }
            int r2 = r2 + 4
            int r2 = r2 + 4
            long r2 = (long) r2     // Catch:{ EOFException -> 0x0371 }
            r6.A03(r2)     // Catch:{ EOFException -> 0x0371 }
        L_0x0313:
            int r2 = r6.A00     // Catch:{ EOFException -> 0x0371 }
            int r2 = r2 + 4
            int r8 = r2 + 4
            goto L_0x033d
        L_0x031a:
            int r2 = r6.A00     // Catch:{ EOFException -> 0x0371 }
            long r2 = (long) r2     // Catch:{ EOFException -> 0x0371 }
            r6.A03(r2)     // Catch:{ EOFException -> 0x0371 }
            int r2 = r6.A00     // Catch:{ EOFException -> 0x0371 }
            long r2 = (long) r2     // Catch:{ EOFException -> 0x0371 }
            long r0 = r0 - r2
            r6.A01()     // Catch:{ EOFException -> 0x0371 }
            int r8 = r6.A00     // Catch:{ EOFException -> 0x0371 }
            goto L_0x033d
        L_0x032a:
            r5.readInt()     // Catch:{ EOFException -> 0x0371 }
            r6.A01()     // Catch:{ EOFException -> 0x0371 }
            int r2 = r6.A00     // Catch:{ EOFException -> 0x0371 }
            int r8 = r2 + 4
            goto L_0x033d
        L_0x0335:
            int r2 = r6.A00     // Catch:{ EOFException -> 0x0371 }
            long r2 = (long) r2     // Catch:{ EOFException -> 0x0371 }
            r6.A03(r2)     // Catch:{ EOFException -> 0x0371 }
            int r8 = r6.A00     // Catch:{ EOFException -> 0x0371 }
        L_0x033d:
            long r2 = (long) r8     // Catch:{ EOFException -> 0x0371 }
            long r0 = r0 - r2
            goto L_0x0088
        L_0x0341:
            java.io.PrintStream r1 = java.lang.System.err     // Catch:{ EOFException -> 0x0371 }
            java.lang.String r0 = "+--- PRIMITIVE ARRAY NODATA DUMP"
            r1.println(r0)     // Catch:{ EOFException -> 0x0371 }
            r6.A00()     // Catch:{ EOFException -> 0x0371 }
            java.lang.String r0 = "Don't know how to load a nodata array"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)     // Catch:{ EOFException -> 0x0371 }
            goto L_0x0370
        L_0x0352:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ EOFException -> 0x0371 }
            java.lang.String r0 = "loadHeapDump loop with unknown tag "
            r2.append(r0)     // Catch:{ EOFException -> 0x0371 }
            r2.append(r7)     // Catch:{ EOFException -> 0x0371 }
            java.lang.String r0 = " with "
            r2.append(r0)     // Catch:{ EOFException -> 0x0371 }
            long r0 = r5.BnX()     // Catch:{ EOFException -> 0x0371 }
            r2.append(r0)     // Catch:{ EOFException -> 0x0371 }
            java.lang.String r0 = " bytes possibly remaining"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0c(r0, r2)     // Catch:{ EOFException -> 0x0371 }
        L_0x0370:
            throw r0     // Catch:{ EOFException -> 0x0371 }
        L_0x0371:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9YR.A02():void");
    }

    public void A03(long j) {
        C23074B3e b3e = this.A02;
        b3e.Bre(b3e.position() + j);
    }

    public AnonymousClass9YR(C23074B3e b3e) {
        this.A02 = b3e;
    }
}
