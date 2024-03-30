package X;

import android.os.SystemClock;

/* renamed from: X.6vY  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C146406vY implements C158367go {
    public final /* synthetic */ C121555tK A00;
    public final /* synthetic */ AnonymousClass7gS A01;
    public final /* synthetic */ AnonymousClass620 A02;
    public final /* synthetic */ C101314xL A03;
    public final /* synthetic */ C124945z3 A04;
    public final /* synthetic */ AnonymousClass5JZ A05;

    public /* synthetic */ C146406vY(C121555tK r1, AnonymousClass7gS r2, AnonymousClass620 r3, C101314xL r4, C124945z3 r5, AnonymousClass5JZ r6) {
        this.A03 = r4;
        this.A01 = r2;
        this.A05 = r6;
        this.A00 = r1;
        this.A04 = r5;
        this.A02 = r3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: X.5Qv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: X.5Qv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v17, resolved type: X.54L} */
    /* JADX WARNING: type inference failed for: r7v14, types: [X.54M] */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01a1, code lost:
        if (r10 >= 500) goto L_0x01a3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0290 A[Catch:{ all -> 0x02ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02bb A[Catch:{ all -> 0x02ff }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass6XL Bos(X.C1265864p r32) {
        /*
            r31 = this;
            r0 = r31
            X.4xL r5 = r0.A03
            X.7gS r7 = r0.A01
            X.5JZ r11 = r0.A05
            X.5tK r10 = r0.A00
            X.5z3 r4 = r0.A04
            X.620 r14 = r0.A02
            X.5zK r6 = r5.A0Y
            X.1BV r1 = r5.A0P
            r0 = 1
            r13 = r32
            int r1 = r1.A01(r13, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6.A07 = r1
            boolean r1 = r5 instanceof X.AnonymousClass5C3
            if (r1 == 0) goto L_0x0039
            java.lang.String r2 = r13.A05
            java.lang.String r1 = "fallback"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0039
            r1 = 27
        L_0x002f:
            X.5xo r0 = new X.5xo
            r0.<init>(r13, r1)
            X.6XL r1 = X.AnonymousClass6XL.A01(r0)
            return r1
        L_0x0039:
            X.1D9 r1 = r5.A0a     // Catch:{ NoSuchAlgorithmException -> 0x0309, IOException -> 0x0315 }
            X.6Pj r9 = r5.A0V     // Catch:{ NoSuchAlgorithmException -> 0x0309, IOException -> 0x0315 }
            X.5z9 r3 = r9.A02     // Catch:{ NoSuchAlgorithmException -> 0x0309, IOException -> 0x0315 }
            java.io.File r2 = r3.A07     // Catch:{ NoSuchAlgorithmException -> 0x0309, IOException -> 0x0315 }
            X.C18740tg.A06(r2)     // Catch:{ NoSuchAlgorithmException -> 0x0309, IOException -> 0x0315 }
            X.71q r18 = r1.A03(r7, r9, r2)     // Catch:{ NoSuchAlgorithmException -> 0x0309, IOException -> 0x0315 }
            android.net.Uri$Builder r1 = X.AnonymousClass5JZ.A00(r13, r11)     // Catch:{ all -> 0x02ff }
            java.lang.String r1 = X.C90474aD.A0b(r1)     // Catch:{ all -> 0x02ff }
            r6.A0N = r1     // Catch:{ all -> 0x02ff }
            long r7 = r5.A00     // Catch:{ all -> 0x02ff }
            boolean r26 = X.C101314xL.A04(r5)     // Catch:{ all -> 0x02ff }
            boolean r27 = r5.A0L()     // Catch:{ all -> 0x02ff }
            X.C18740tg.A06(r2)     // Catch:{ all -> 0x02ff }
            boolean r28 = r9.A02()     // Catch:{ all -> 0x02ff }
            X.1Gl r3 = r3.A06     // Catch:{ all -> 0x02ff }
            r30 = r3
            boolean r3 = r5.A0L()     // Catch:{ all -> 0x02ff }
            boolean r29 = X.AnonymousClass000.A1Q(r3)
            X.64M r3 = X.C101314xL.A02(r5)     // Catch:{ all -> 0x02ff }
            java.lang.String r23 = r3.A00()     // Catch:{ all -> 0x02ff }
            X.5yb r3 = new X.5yb     // Catch:{ all -> 0x02ff }
            r17 = r10
            r19 = r30
            r20 = r13
            r21 = r2
            r22 = r1
            r24 = r7
            r16 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r26, r27, r28, r29)     // Catch:{ all -> 0x02ff }
            X.C18740tg.A06(r3)     // Catch:{ all -> 0x02ff }
            X.C18740tg.A06(r3)     // Catch:{ all -> 0x02ff }
            X.71q r10 = r3.A03     // Catch:{ all -> 0x02ff }
            r25 = 0
            if (r10 != 0) goto L_0x0099
            r2 = 3
            goto L_0x0274
        L_0x0099:
            boolean r1 = r3.A09     // Catch:{ all -> 0x02ff }
            r4.A01 = r1     // Catch:{ all -> 0x02ff }
            X.7sR r1 = new X.7sR     // Catch:{ all -> 0x02ff }
            r1.<init>(r3, r4, r0)     // Catch:{ all -> 0x02ff }
            boolean r2 = r3.A07     // Catch:{ all -> 0x02ff }
            if (r2 == 0) goto L_0x00d3
            int[] r8 = r4.A0A     // Catch:{ all -> 0x02ff }
            if (r8 == 0) goto L_0x00c7
            int r2 = r8.length     // Catch:{ all -> 0x02ff }
            if (r2 <= 0) goto L_0x00c7
            X.5Qv r9 = r10.A01     // Catch:{ all -> 0x02ff }
            X.5tK r2 = r3.A02     // Catch:{ all -> 0x02ff }
            X.54M r7 = new X.54M     // Catch:{ all -> 0x02ff }
            r7.<init>(r2, r9, r8)     // Catch:{ all -> 0x02ff }
        L_0x00b6:
            X.60s r15 = r7.A04     // Catch:{ all -> 0x02ff }
        L_0x00b8:
            X.1GE r12 = r4.A04     // Catch:{ all -> 0x02ff }
            java.lang.String r2 = r3.A05     // Catch:{ all -> 0x02ff }
            r21 = r2
            r17 = 0
            X.64p r8 = r3.A04     // Catch:{ all -> 0x02ff }
            int r2 = r8.A00     // Catch:{ all -> 0x02ff }
            r16 = r2
            goto L_0x00d9
        L_0x00c7:
            X.5Qv r9 = r10.A01     // Catch:{ all -> 0x02ff }
            X.5tK r8 = r3.A02     // Catch:{ all -> 0x02ff }
            r2 = 65536(0x10000, float:9.18355E-41)
            X.54L r7 = new X.54L     // Catch:{ all -> 0x02ff }
            r7.<init>(r8, r9, r2)     // Catch:{ all -> 0x02ff }
            goto L_0x00b6
        L_0x00d3:
            X.5Qv r7 = r10.A01     // Catch:{ all -> 0x02ff }
            r9 = r7
            r15 = r25
            goto L_0x00b8
        L_0x00d9:
            boolean r24 = X.AnonymousClass000.A1Q(r16)
            java.lang.String r2 = r3.A06     // Catch:{ all -> 0x02ff }
            r23 = 0
            r19 = r12
            r20 = r1
            r22 = r2
            X.6VO r12 = r19.A00(r20, r21, r22, r23, r24)     // Catch:{ all -> 0x02ff }
            long r1 = r3.A00     // Catch:{ all -> 0x02ff }
            r19 = r1
            long r1 = r3.A01     // Catch:{ all -> 0x02ff }
            java.lang.String r24 = "file"
            r22 = r12
            r23 = r7
            r26 = r19
            r28 = r1
            r22.A05(r23, r24, r25, r26, r28)     // Catch:{ all -> 0x02ff }
            java.util.Objects.requireNonNull(r9)     // Catch:{ all -> 0x02ff }
            r1 = 15
            X.7qf r2 = new X.7qf     // Catch:{ all -> 0x02ff }
            r2.<init>(r9, r1)     // Catch:{ all -> 0x02ff }
            java.lang.String r7 = "hash"
            java.util.List r1 = r12.A0D     // Catch:{ all -> 0x02ff }
            android.util.Pair r2 = android.util.Pair.create(r7, r2)     // Catch:{ all -> 0x02ff }
            r1.add(r2)     // Catch:{ all -> 0x02ff }
            X.5tY r9 = new X.5tY     // Catch:{ all -> 0x02ff }
            r9.<init>(r15, r12, r10)     // Catch:{ all -> 0x02ff }
            java.util.concurrent.atomic.AtomicReference r1 = r4.A09     // Catch:{ all -> 0x02ff }
            X.6VO r7 = r9.A01     // Catch:{ all -> 0x02ff }
            X.C18740tg.A06(r7)     // Catch:{ all -> 0x02ff }
            r1.set(r7)     // Catch:{ all -> 0x02ff }
            java.lang.String r12 = r4.A08     // Catch:{ IOException -> 0x023a }
            X.5zK r2 = r4.A07     // Catch:{ 5R3 -> 0x01fd, IOException -> 0x01f5 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)     // Catch:{ 5R3 -> 0x01fd, IOException -> 0x01f5 }
            r2.A06 = r1     // Catch:{ 5R3 -> 0x01fd, IOException -> 0x01f5 }
            java.lang.String r1 = r8.A04     // Catch:{ 5R3 -> 0x01fd, IOException -> 0x01f5 }
            r2.A0J = r1     // Catch:{ 5R3 -> 0x01fd, IOException -> 0x01f5 }
            long r15 = android.os.SystemClock.uptimeMillis()     // Catch:{ 5R3 -> 0x01fd, IOException -> 0x01f5 }
            java.lang.Long r1 = java.lang.Long.valueOf(r15)     // Catch:{ 5R3 -> 0x01fd, IOException -> 0x01f5 }
            r2.A0F = r1     // Catch:{ 5R3 -> 0x01fd, IOException -> 0x01f5 }
            int r10 = r7.A04(r8)     // Catch:{ 5R3 -> 0x01fd, IOException -> 0x01f5 }
            A00(r7, r2)     // Catch:{ IOException -> 0x023a }
            java.lang.Long r1 = X.C36441kJ.A0y(r10)     // Catch:{ IOException -> 0x023a }
            r2.A0A = r1     // Catch:{ IOException -> 0x023a }
            java.lang.String r1 = r7.A03     // Catch:{ IOException -> 0x023a }
            r2.A0L = r1     // Catch:{ IOException -> 0x023a }
            X.17Z r1 = X.AnonymousClass17Z.$redex_init_class     // Catch:{ IOException -> 0x023a }
            r1 = 400(0x190, float:5.6E-43)
            if (r10 != r1) goto L_0x0172
            X.4xL r2 = r4.A06     // Catch:{ IOException -> 0x023a }
            java.util.concurrent.FutureTask r2 = r2.A02     // Catch:{ IOException -> 0x023a }
            boolean r2 = r2.isCancelled()     // Catch:{ IOException -> 0x023a }
            if (r2 == 0) goto L_0x0172
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x023a }
            java.lang.String r1 = "mediaupload/upload-error/cancelled/400 "
        L_0x0161:
            X.C36321k7.A1P(r1, r12, r2)     // Catch:{ IOException -> 0x023a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x023a }
        L_0x0168:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)     // Catch:{ IOException -> 0x023a }
        L_0x016c:
            android.util.Pair r2 = android.util.Pair.create(r2, r1)     // Catch:{ IOException -> 0x023a }
            goto L_0x020d
        L_0x0172:
            java.lang.String r7 = " "
            java.lang.String r2 = "mediaupload/upload-error/response-code="
            if (r10 < r1) goto L_0x01a9
            java.lang.StringBuilder r1 = X.C90464aC.A0h(r10, r2)     // Catch:{ IOException -> 0x023a }
            X.C36321k7.A1P(r7, r12, r1)     // Catch:{ IOException -> 0x023a }
            r1 = 507(0x1fb, float:7.1E-43)
            if (r10 == r1) goto L_0x01a6
            r1 = 429(0x1ad, float:6.01E-43)
            if (r10 == r1) goto L_0x01a6
            r1 = 401(0x191, float:5.62E-43)
            r2 = 13
            if (r10 == r1) goto L_0x01e6
            r1 = 415(0x19f, float:5.82E-43)
            r2 = 36
            if (r10 == r1) goto L_0x01e6
            r1 = 413(0x19d, float:5.79E-43)
            r2 = 24
            if (r10 == r1) goto L_0x01e6
            r1 = 408(0x198, float:5.72E-43)
            if (r10 == r1) goto L_0x01a3
            r1 = 500(0x1f4, float:7.0E-43)
            r2 = 9
            if (r10 < r1) goto L_0x01e6
        L_0x01a3:
            r2 = 8
            goto L_0x01e6
        L_0x01a6:
            r2 = 15
            goto L_0x01e6
        L_0x01a9:
            if (r10 >= 0) goto L_0x01ca
            X.4xL r1 = r4.A06     // Catch:{ IOException -> 0x023a }
            java.util.concurrent.FutureTask r1 = r1.A02     // Catch:{ IOException -> 0x023a }
            boolean r1 = r1.isCancelled()     // Catch:{ IOException -> 0x023a }
            if (r1 == 0) goto L_0x01bc
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x023a }
            java.lang.String r1 = "mediaupload/upload-error/cancelled "
            goto L_0x0161
        L_0x01bc:
            java.lang.StringBuilder r1 = X.C90464aC.A0h(r10, r2)     // Catch:{ IOException -> 0x023a }
            X.C36321k7.A1P(r7, r12, r1)     // Catch:{ IOException -> 0x023a }
            r1 = 17
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x023a }
            goto L_0x0168
        L_0x01ca:
            boolean r1 = r4.A01     // Catch:{ IOException -> 0x023a }
            if (r1 == 0) goto L_0x01eb
            X.5xN r1 = r4.A00     // Catch:{ IOException -> 0x023a }
            if (r1 == 0) goto L_0x01da
            java.lang.String r1 = r1.A00     // Catch:{ IOException -> 0x023a }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ IOException -> 0x023a }
            if (r1 == 0) goto L_0x01eb
        L_0x01da:
            X.0yC r2 = r4.A03     // Catch:{ IOException -> 0x023a }
            r1 = 3300(0xce4, float:4.624E-42)
            boolean r1 = r2.A0E(r1)     // Catch:{ IOException -> 0x023a }
            if (r1 == 0) goto L_0x01eb
            r2 = 29
        L_0x01e6:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x023a }
            goto L_0x01ef
        L_0x01eb:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)     // Catch:{ IOException -> 0x023a }
        L_0x01ef:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)     // Catch:{ IOException -> 0x023a }
            goto L_0x016c
        L_0x01f5:
            r8 = move-exception
            X.5zK r2 = r4.A07     // Catch:{ all -> 0x0233 }
            java.lang.String r1 = r7.A04     // Catch:{ all -> 0x0233 }
            r2.A0M = r1     // Catch:{ all -> 0x0233 }
            throw r8     // Catch:{ all -> 0x0233 }
        L_0x01fd:
            r1 = 26
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0233 }
            r1 = 0
            android.util.Pair r2 = X.C90514aH.A0P(r2, r1)     // Catch:{ all -> 0x0233 }
            X.5zK r1 = r4.A07     // Catch:{ IOException -> 0x023a }
            A00(r7, r1)     // Catch:{ IOException -> 0x023a }
        L_0x020d:
            java.lang.Object r1 = r2.first     // Catch:{ IOException -> 0x023a }
            int r1 = X.C90514aH.A0H(r1)     // Catch:{ IOException -> 0x023a }
            X.5xo r7 = new X.5xo     // Catch:{ IOException -> 0x023a }
            r7.<init>(r8, r1)     // Catch:{ IOException -> 0x023a }
            java.lang.Object r1 = r2.second     // Catch:{ IOException -> 0x023a }
            int r1 = X.C90514aH.A0H(r1)     // Catch:{ IOException -> 0x023a }
            r7.A00 = r1     // Catch:{ IOException -> 0x023a }
            r7.A01 = r9     // Catch:{ IOException -> 0x023a }
            X.71q r1 = r9.A02     // Catch:{ IOException -> 0x023a }
            X.5vC r1 = r1.A00()     // Catch:{ IOException -> 0x023a }
            r7.A02 = r1     // Catch:{ IOException -> 0x023a }
            X.5xN r1 = r4.A00     // Catch:{ IOException -> 0x023a }
            r7.A03 = r1     // Catch:{ IOException -> 0x023a }
            boolean r1 = r4.A02     // Catch:{ IOException -> 0x023a }
            r7.A04 = r1     // Catch:{ IOException -> 0x023a }
            goto L_0x027b
        L_0x0233:
            r2 = move-exception
            X.5zK r1 = r4.A07     // Catch:{ IOException -> 0x023a }
            A00(r7, r1)     // Catch:{ IOException -> 0x023a }
            throw r2     // Catch:{ IOException -> 0x023a }
        L_0x023a:
            r7 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02ff }
            java.lang.String r1 = "mediaupload/io-error/"
            r2.append(r1)     // Catch:{ all -> 0x02ff }
            android.net.Uri r1 = android.net.Uri.parse(r21)     // Catch:{ all -> 0x02ff }
            java.lang.String r1 = r1.getHost()     // Catch:{ all -> 0x02ff }
            r2.append(r1)     // Catch:{ all -> 0x02ff }
            java.lang.String r1 = "/"
            r2.append(r1)     // Catch:{ all -> 0x02ff }
            java.lang.String r1 = r4.A08     // Catch:{ all -> 0x02ff }
            X.C36351kA.A1Q(r1, r2, r7)     // Catch:{ all -> 0x02ff }
            X.5zK r2 = r4.A07     // Catch:{ all -> 0x02ff }
            java.lang.String r1 = X.C90484aE.A0k(r7)     // Catch:{ all -> 0x02ff }
            r2.A0K = r1     // Catch:{ all -> 0x02ff }
            boolean r1 = r7 instanceof java.net.UnknownHostException     // Catch:{ all -> 0x02ff }
            if (r1 == 0) goto L_0x0268
            r2 = 22
            goto L_0x0274
        L_0x0268:
            X.1BU r1 = r4.A05     // Catch:{ all -> 0x02ff }
            boolean r1 = r1.A03(r7)     // Catch:{ all -> 0x02ff }
            r2 = 17
            if (r1 == 0) goto L_0x0274
            r2 = 18
        L_0x0274:
            X.64p r1 = r3.A04     // Catch:{ all -> 0x02ff }
            X.5xo r7 = new X.5xo     // Catch:{ all -> 0x02ff }
            r7.<init>(r1, r2)     // Catch:{ all -> 0x02ff }
        L_0x027b:
            long r1 = r5.A0i     // Catch:{ all -> 0x02ff }
            r8 = 0
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 > 0) goto L_0x028a
            long r1 = r5.A00     // Catch:{ all -> 0x02ff }
            int r3 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r3 > 0) goto L_0x028a
            r0 = 0
        L_0x028a:
            int r3 = r7.A06     // Catch:{ all -> 0x02ff }
            r1 = 26
            if (r3 != r1) goto L_0x02bb
            java.lang.String r1 = r5.A03     // Catch:{ all -> 0x02ff }
            X.5xC r2 = X.C101314xL.A01(r14, r5, r11, r1)     // Catch:{ all -> 0x02ff }
            int r1 = r2.A01     // Catch:{ all -> 0x02ff }
            if (r1 != 0) goto L_0x029f
            int r1 = r2.A00     // Catch:{ all -> 0x02ff }
            long r1 = (long) r1     // Catch:{ all -> 0x02ff }
            r5.A00 = r1     // Catch:{ all -> 0x02ff }
        L_0x029f:
            X.1BS r3 = r5.A0f     // Catch:{ all -> 0x02ff }
            r1 = r30
            java.lang.String r2 = r1.A02     // Catch:{ all -> 0x02ff }
            r11 = 0
            java.util.concurrent.atomic.AtomicInteger r1 = r14.A01     // Catch:{ all -> 0x02ff }
            int r12 = r1.get()     // Catch:{ all -> 0x02ff }
            r7 = r3
            r8 = r2
            r9 = r25
            r10 = r9
            X.6yn r2 = r7.A0C(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x02ff }
            X.6XL r1 = new X.6XL     // Catch:{ all -> 0x02ff }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x02ff }
            goto L_0x02fb
        L_0x02bb:
            if (r3 == 0) goto L_0x02f7
            java.util.concurrent.FutureTask r1 = r5.A02     // Catch:{ all -> 0x02ff }
            boolean r1 = r1.isCancelled()     // Catch:{ all -> 0x02ff }
            if (r1 != 0) goto L_0x02f7
            long r1 = r5.A0i     // Catch:{ all -> 0x02ff }
            int r4 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x02da
            java.lang.String r1 = r5.A03     // Catch:{ all -> 0x02ff }
            X.5xC r2 = X.C101314xL.A01(r14, r5, r11, r1)     // Catch:{ all -> 0x02ff }
            int r1 = r2.A01     // Catch:{ all -> 0x02ff }
            if (r1 != 0) goto L_0x02da
            int r1 = r2.A00     // Catch:{ all -> 0x02ff }
            long r1 = (long) r1     // Catch:{ all -> 0x02ff }
            r5.A00 = r1     // Catch:{ all -> 0x02ff }
        L_0x02da:
            r1 = 29
            if (r3 != r1) goto L_0x02f0
            r22 = 0
            r21 = -1
            r24 = 1
            X.6XL r1 = new X.6XL     // Catch:{ all -> 0x02ff }
            r19 = r1
            r20 = r7
            r23 = r0
            r19.<init>(r20, r21, r22, r23, r24)     // Catch:{ all -> 0x02ff }
            goto L_0x02fb
        L_0x02f0:
            int r1 = r7.A00     // Catch:{ all -> 0x02ff }
            X.6XL r1 = X.AnonymousClass6XL.A04(r7, r1, r0)     // Catch:{ all -> 0x02ff }
            goto L_0x02fb
        L_0x02f7:
            X.6XL r1 = X.AnonymousClass6XL.A02(r7)     // Catch:{ all -> 0x02ff }
        L_0x02fb:
            r18.close()     // Catch:{ NoSuchAlgorithmException -> 0x0309, IOException -> 0x0315 }
            goto L_0x0314
        L_0x02ff:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x0304 }
            goto L_0x0308
        L_0x0304:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0309, IOException -> 0x0315 }
        L_0x0308:
            throw r1     // Catch:{ NoSuchAlgorithmException -> 0x0309, IOException -> 0x0315 }
        L_0x0309:
            r0 = move-exception
            java.lang.String r0 = X.C90484aE.A0k(r0)
            r6.A0K = r0
            r1 = 16
            goto L_0x002f
        L_0x0314:
            return r1
        L_0x0315:
            r0 = move-exception
            java.lang.String r0 = X.C90484aE.A0k(r0)
            r6.A0K = r0
            r1 = 3
            X.5xo r0 = new X.5xo
            r0.<init>(r13, r1)
            X.6XL r1 = X.AnonymousClass6XL.A01(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146406vY.Bos(X.64p):X.6XL");
    }

    public static void A00(AnonymousClass6VO r2, C125105zK r3) {
        r3.A0E = Long.valueOf(SystemClock.uptimeMillis());
        r3.A09 = Long.valueOf(r2.A00);
        r3.A02 = r2.A02;
    }
}
