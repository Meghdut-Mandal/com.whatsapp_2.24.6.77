package X;

/* renamed from: X.0nC  reason: invalid class name and case insensitive filesystem */
public class C15350nC extends AnonymousClass05F implements AnonymousClass05H, AnonymousClass05J, AnonymousClass05M {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public Object[] A04;
    public final int A05;
    public final int A06;
    public final Integer A07;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: X.09x[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: X.09x[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: X.09x[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: X.09x[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: X.09x[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: X.09x[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: X.09x[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: X.09x[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: X.09x[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0038, code lost:
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        r3 = (X.C15360nD) r3;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=X.09x[], code=java.lang.Object[], for r13v0, types: [X.09x[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C023509x[] A08(java.lang.Object[] r13) {
        /*
            r12 = this;
            int r7 = r13.length
            int r0 = r12.A00
            if (r0 == 0) goto L_0x003b
            X.0UH[] r6 = r12.A02
            if (r6 == 0) goto L_0x003b
            r5 = 0
            int r4 = r6.length
        L_0x000b:
            if (r5 >= r4) goto L_0x003b
            r3 = r6[r5]
            if (r3 == 0) goto L_0x0038
            X.0nD r3 = (X.C15360nD) r3
            X.09x r2 = r3.A01
            if (r2 == 0) goto L_0x0038
            long r10 = r12.A01(r3)
            r8 = 0
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0038
            int r0 = r13.length
            if (r7 < r0) goto L_0x0030
            int r0 = r13.length
            r1 = 2
            int r0 = r0 * 2
            int r0 = java.lang.Math.max(r1, r0)
            java.lang.Object[] r13 = X.AnonymousClass00C.A0K(r13, r0)
        L_0x0030:
            int r1 = r7 + 1
            r13[r7] = r2
            r0 = 0
            r3.A01 = r0
            r7 = r1
        L_0x0038:
            int r5 = r5 + 1
            goto L_0x000b
        L_0x003b:
            X.09x[] r13 = (X.C023509x[]) r13
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15350nC.A08(X.09x[]):X.09x[]");
    }

    public /* bridge */ /* synthetic */ AnonymousClass0UH[] A0C(int i) {
        return new C15360nD[2];
    }

    public Object B36(C023509x r2, AnonymousClass05G r3) {
        return A02(r2, r3, this);
    }

    public Object B6N(Object obj, C023509x r13) {
        C12890ip r5;
        Object obj2 = obj;
        if (!BwB(obj)) {
            AnonymousClass0AR A022 = AnonymousClass0AA.A02(r13);
            C023509x[] r4 = AnonymousClass0RY.A00;
            synchronized (this) {
                if (A07(obj)) {
                    A022.resumeWith(AnonymousClass0AJ.A00);
                    r4 = A08(r4);
                    r5 = null;
                } else {
                    long min = Math.min(this.A02, this.A03);
                    int i = this.A00;
                    int i2 = this.A01;
                    r5 = new C12890ip(obj2, A022, this, ((long) (i + i2)) + min);
                    A05(r5);
                    this.A01 = i2 + 1;
                    if (this.A05 == 0) {
                        r4 = A08(r4);
                    }
                }
            }
            if (r5 != null) {
                AnonymousClass0AR.A05(new C15170mo(r5), A022);
            }
            for (C023509x r1 : r4) {
                if (r1 != null) {
                    r1.resumeWith(AnonymousClass0AJ.A00);
                }
            }
            Object A0G = A022.A0G();
            AnonymousClass0AO r0 = AnonymousClass0AO.COROUTINE_SUSPENDED;
            if (A0G != r0) {
                A0G = AnonymousClass0AJ.A00;
            }
            if (A0G == r0) {
                return A0G;
            }
        }
        return AnonymousClass0AJ.A00;
    }

    public void BoY() {
        synchronized (this) {
            long j = this.A02;
            long min = Math.min(j, this.A03) + ((long) this.A00);
            A04(min, j, min, min + ((long) this.A01));
        }
    }

    private final long A01(C15360nD r10) {
        long j = r10.A00;
        long min = Math.min(this.A02, this.A03);
        if (j < min + ((long) this.A00) || (this.A05 <= 0 && j <= min && this.A01 != 0)) {
            return j;
        }
        return -1;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:210)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static /* synthetic */ X.AnonymousClass0AO A02(X.C023509x r13, X.AnonymousClass05G r14, X.C15350nC r15) {
        /*
            boolean r0 = r13 instanceof X.C14030kq
            if (r0 == 0) goto L_0x0028
            r8 = r13
            X.0kq r8 = (X.C14030kq) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0028
            int r2 = r2 - r1
            r8.label = r2
        L_0x0012:
            java.lang.Object r2 = r8.result
            X.0AO r9 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r8.label
            r7 = 3
            r6 = 2
            r1 = 1
            if (r0 == 0) goto L_0x004f
            if (r0 == r1) goto L_0x0042
            if (r0 == r6) goto L_0x002e
            if (r0 == r7) goto L_0x002e
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0028:
            X.0kq r8 = new X.0kq
            r8.<init>(r13, r15)
            goto L_0x0012
        L_0x002e:
            java.lang.Object r5 = r8.L$3
            X.03e r5 = (X.C007403e) r5
            java.lang.Object r4 = r8.L$2
            X.0nD r4 = (X.C15360nD) r4
            java.lang.Object r14 = r8.L$1
            X.05G r14 = (X.AnonymousClass05G) r14
            java.lang.Object r15 = r8.L$0
            X.0nC r15 = (X.C15350nC) r15
            X.AnonymousClass0AN.A00(r2)     // Catch:{ all -> 0x010b }
            goto L_0x007d
        L_0x0042:
            java.lang.Object r4 = r8.L$2
            X.0nD r4 = (X.C15360nD) r4
            java.lang.Object r14 = r8.L$1
            X.05G r14 = (X.AnonymousClass05G) r14
            java.lang.Object r15 = r8.L$0
            X.0nC r15 = (X.C15350nC) r15
            goto L_0x006e
        L_0x004f:
            X.AnonymousClass0AN.A00(r2)
            X.0UH r4 = r15.A09()
            X.0nD r4 = (X.C15360nD) r4
            boolean r0 = r14 instanceof X.C13070j7     // Catch:{ all -> 0x010b }
            if (r0 == 0) goto L_0x0071
            r0 = r14
            X.0j7 r0 = (X.C13070j7) r0     // Catch:{ all -> 0x010b }
            r8.L$0 = r15     // Catch:{ all -> 0x010b }
            r8.L$1 = r14     // Catch:{ all -> 0x010b }
            r8.L$2 = r4     // Catch:{ all -> 0x010b }
            r8.label = r1     // Catch:{ all -> 0x010b }
            java.lang.Object r0 = r0.A00(r8)     // Catch:{ all -> 0x010b }
            if (r0 != r9) goto L_0x0071
            return r9
        L_0x006e:
            X.AnonymousClass0AN.A00(r2)     // Catch:{ all -> 0x010b }
        L_0x0071:
            X.02h r1 = r8.getContext()     // Catch:{ all -> 0x010b }
            X.03x r0 = X.C007403e.A00     // Catch:{ all -> 0x010b }
            X.02i r5 = r1.get(r0)     // Catch:{ all -> 0x010b }
            X.03e r5 = (X.C007403e) r5     // Catch:{ all -> 0x010b }
        L_0x007d:
            X.09x[] r11 = X.AnonymousClass0RY.A00     // Catch:{ all -> 0x010b }
            monitor-enter(r15)     // Catch:{ all -> 0x010b }
            long r2 = r15.A01(r4)     // Catch:{ all -> 0x0108 }
            r12 = 0
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x008d
            X.035 r10 = X.AnonymousClass0RX.A00     // Catch:{ all -> 0x0108 }
            goto L_0x00ac
        L_0x008d:
            long r0 = r4.A00     // Catch:{ all -> 0x0108 }
            java.lang.Object[] r12 = r15.A04     // Catch:{ all -> 0x0108 }
            X.AnonymousClass00C.A0B(r12)     // Catch:{ all -> 0x0108 }
            int r11 = (int) r2     // Catch:{ all -> 0x0108 }
            int r10 = r12.length     // Catch:{ all -> 0x0108 }
            int r10 = r10 + -1
            r10 = r10 & r11
            r10 = r12[r10]     // Catch:{ all -> 0x0108 }
            boolean r11 = r10 instanceof X.C12890ip     // Catch:{ all -> 0x0108 }
            if (r11 == 0) goto L_0x00a3
            X.0ip r10 = (X.C12890ip) r10     // Catch:{ all -> 0x0108 }
            java.lang.Object r10 = r10.A01     // Catch:{ all -> 0x0108 }
        L_0x00a3:
            r11 = 1
            long r2 = r2 + r11
            r4.A00 = r2     // Catch:{ all -> 0x0108 }
            X.09x[] r11 = r15.A0D(r0)     // Catch:{ all -> 0x0108 }
        L_0x00ac:
            monitor-exit(r15)     // Catch:{ all -> 0x010b }
            r3 = 0
            int r2 = r11.length     // Catch:{ all -> 0x010b }
        L_0x00af:
            if (r3 >= r2) goto L_0x00bd
            r1 = r11[r3]     // Catch:{ all -> 0x010b }
            if (r1 == 0) goto L_0x00ba
            X.0AJ r0 = X.AnonymousClass0AJ.A00     // Catch:{ all -> 0x010b }
            r1.resumeWith(r0)     // Catch:{ all -> 0x010b }
        L_0x00ba:
            int r3 = r3 + 1
            goto L_0x00af
        L_0x00bd:
            X.035 r0 = X.AnonymousClass0RX.A00     // Catch:{ all -> 0x010b }
            if (r10 != r0) goto L_0x00ea
            r8.L$0 = r15     // Catch:{ all -> 0x010b }
            r8.L$1 = r14     // Catch:{ all -> 0x010b }
            r8.L$2 = r4     // Catch:{ all -> 0x010b }
            r8.L$3 = r5     // Catch:{ all -> 0x010b }
            r8.label = r6     // Catch:{ all -> 0x010b }
            X.0AR r3 = X.AnonymousClass0AA.A02(r8)     // Catch:{ all -> 0x010b }
            monitor-enter(r15)     // Catch:{ all -> 0x010b }
            long r10 = r15.A01(r4)     // Catch:{ all -> 0x0108 }
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00df
            r4.A01 = r3     // Catch:{ all -> 0x0108 }
            r4.A01 = r3     // Catch:{ all -> 0x0108 }
            goto L_0x00e4
        L_0x00df:
            X.0AJ r0 = X.AnonymousClass0AJ.A00     // Catch:{ all -> 0x0108 }
            r3.resumeWith(r0)     // Catch:{ all -> 0x0108 }
        L_0x00e4:
            monitor-exit(r15)     // Catch:{ all -> 0x010b }
            java.lang.Object r0 = r3.A0G()     // Catch:{ all -> 0x010b }
            goto L_0x0105
        L_0x00ea:
            if (r5 == 0) goto L_0x00f7
            boolean r0 = r5.BL7()     // Catch:{ all -> 0x010b }
            if (r0 != 0) goto L_0x00f7
            java.util.concurrent.CancellationException r0 = r5.B9P()     // Catch:{ all -> 0x010b }
            goto L_0x010a
        L_0x00f7:
            r8.L$0 = r15     // Catch:{ all -> 0x010b }
            r8.L$1 = r14     // Catch:{ all -> 0x010b }
            r8.L$2 = r4     // Catch:{ all -> 0x010b }
            r8.L$3 = r5     // Catch:{ all -> 0x010b }
            r8.label = r7     // Catch:{ all -> 0x010b }
            java.lang.Object r0 = r14.B6N(r10, r8)     // Catch:{ all -> 0x010b }
        L_0x0105:
            if (r0 != r9) goto L_0x007d
            return r9
        L_0x0108:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x010b }
        L_0x010a:
            throw r0     // Catch:{ all -> 0x010b }
        L_0x010b:
            r0 = move-exception
            r15.A0A(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15350nC.A02(X.09x, X.05G, X.0nC):X.0AO");
    }

    private final void A03() {
        AnonymousClass0UH[] r10;
        Object[] objArr = this.A04;
        AnonymousClass00C.A0B(objArr);
        long j = this.A02;
        long j2 = this.A03;
        long min = Math.min(j, j2);
        objArr[(objArr.length - 1) & ((int) min)] = null;
        this.A00--;
        long j3 = min + 1;
        if (j2 < j3) {
            this.A03 = j3;
        }
        if (j < j3) {
            if (!(this.A00 == 0 || (r10 = this.A02) == null)) {
                for (AnonymousClass0UH r7 : r10) {
                    if (r7 != null) {
                        C15360nD r72 = (C15360nD) r7;
                        if (r72.A00 >= 0 && r72.A00 < j3) {
                            r72.A00 = j3;
                        }
                    }
                }
            }
            this.A02 = j3;
        }
    }

    private final void A05(Object obj) {
        int i = this.A00 + this.A01;
        Object[] objArr = this.A04;
        if (objArr == null) {
            objArr = AnonymousClass001.A0M();
            this.A04 = objArr;
        } else {
            int length = objArr.length;
            if (i >= length) {
                int i2 = length * 2;
                if (i2 > 0) {
                    Object[] objArr2 = new Object[i2];
                    this.A04 = objArr2;
                    long min = Math.min(this.A02, this.A03);
                    for (int i3 = 0; i3 < i; i3++) {
                        int i4 = (int) (((long) i3) + min);
                        objArr2[(i2 - 1) & i4] = objArr[(objArr.length - 1) & i4];
                    }
                    objArr = objArr2;
                } else {
                    throw AnonymousClass001.A09("Buffer size overflow");
                }
            }
        }
        objArr[(objArr.length - 1) & ((int) (Math.min(this.A02, this.A03) + ((long) i)))] = obj;
    }

    public static final void A06(C15350nC r10) {
        if (r10.A05 != 0 || r10.A01 > 1) {
            Object[] objArr = r10.A04;
            AnonymousClass00C.A0B(objArr);
            while (true) {
                int i = r10.A01;
                if (i > 0) {
                    long min = Math.min(r10.A02, r10.A03);
                    int i2 = r10.A00;
                    int length = objArr.length - 1;
                    if (objArr[length & ((int) ((min + ((long) (i2 + i))) - 1))] == AnonymousClass0RX.A00) {
                        int i3 = i - 1;
                        r10.A01 = i3;
                        objArr[length & ((int) (min + ((long) (i2 + i3))))] = null;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        if (r1 != 2) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A07(java.lang.Object r20) {
        /*
            r19 = this;
            r10 = r19
            int r0 = r10.A00
            r9 = r20
            if (r0 != 0) goto L_0x002a
            int r1 = r10.A06
            if (r1 == 0) goto L_0x0028
            r10.A05(r9)
            int r0 = r10.A00
            int r0 = r0 + 1
            r10.A00 = r0
            if (r0 <= r1) goto L_0x001a
            r10.A03()
        L_0x001a:
            long r2 = r10.A02
            long r0 = r10.A03
            long r2 = java.lang.Math.min(r2, r0)
            int r0 = r10.A00
            long r0 = (long) r0
            long r2 = r2 + r0
            r10.A02 = r2
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        L_0x002a:
            int r8 = r10.A00
            int r7 = r10.A05
            r6 = 1
            r5 = 0
            if (r8 < r7) goto L_0x0046
            long r3 = r10.A02
            long r1 = r10.A03
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0046
            java.lang.Integer r0 = r10.A07
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r5) goto L_0x0029
            r0 = 2
            if (r1 == r0) goto L_0x0070
        L_0x0046:
            r10.A05(r9)
            int r0 = r8 + 1
            r10.A00 = r0
            if (r0 <= r7) goto L_0x0052
            r10.A03()
        L_0x0052:
            long r13 = r10.A02
            long r11 = r10.A03
            long r15 = java.lang.Math.min(r13, r11)
            int r0 = r10.A00
            long r0 = (long) r0
            long r15 = r15 + r0
            long r2 = r15 - r11
            int r1 = (int) r2
            int r0 = r10.A06
            if (r1 <= r0) goto L_0x0070
            r0 = 1
            long r11 = r11 + r0
            int r0 = r10.A01
            long r0 = (long) r0
            long r17 = r15 + r0
            r10.A04(r11, r13, r15, r17)
        L_0x0070:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15350nC.A07(java.lang.Object):boolean");
    }

    public /* bridge */ /* synthetic */ AnonymousClass0UH A0B() {
        return new C15360nD();
    }

    public final C023509x[] A0D(long j) {
        int i;
        int i2;
        long j2;
        AnonymousClass0UH[] r13;
        long j3 = this.A02;
        if (j <= j3) {
            long min = Math.min(j3, this.A03);
            long j4 = ((long) this.A00) + min;
            long j5 = j4;
            int i3 = this.A05;
            int i4 = i3;
            if (i3 == 0 && this.A01 > 0) {
                j4++;
            }
            int i5 = this.A00;
            if (!(i5 == 0 || (r13 = this.A02) == null)) {
                for (AnonymousClass0UH r4 : r13) {
                    if (r4 != null) {
                        C15360nD r42 = (C15360nD) r4;
                        if (r42.A00 >= 0 && r42.A00 < j4) {
                            j4 = r42.A00;
                        }
                    }
                }
            }
            if (j4 > j3) {
                if (i5 > 0) {
                    i2 = this.A01;
                    i = Math.min(i2, i4 - ((int) (j5 - j4)));
                } else {
                    i = this.A01;
                    i2 = i;
                }
                C023509x[] r132 = AnonymousClass0RY.A00;
                long j6 = ((long) i2) + j5;
                if (i > 0) {
                    r132 = new C023509x[i];
                    Object[] objArr = this.A04;
                    AnonymousClass00C.A0B(objArr);
                    long j7 = j5;
                    int i6 = 0;
                    while (j5 < j6) {
                        int length = objArr.length - 1;
                        Object obj = objArr[length & ((int) j5)];
                        AnonymousClass035 r3 = AnonymousClass0RX.A00;
                        if (obj != r3) {
                            AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            C12890ip r15 = (C12890ip) obj;
                            int i7 = i6 + 1;
                            r132[i6] = r15.A02;
                            objArr[length & ((int) j5)] = r3;
                            objArr[length & ((int) j7)] = r15.A01;
                            j2 = 1;
                            j7++;
                            if (i7 >= i) {
                                break;
                            }
                            i6 = i7;
                        } else {
                            j2 = 1;
                        }
                        j5 += j2;
                    }
                    j5 = j7;
                }
                int i8 = (int) (j5 - min);
                if (this.A00 == 0) {
                    j4 = j5;
                }
                long max = Math.max(this.A03, j5 - ((long) Math.min(this.A06, i8)));
                if (i4 == 0 && max < j6) {
                    Object[] objArr2 = this.A04;
                    AnonymousClass00C.A0B(objArr2);
                    if (AnonymousClass00C.A0J(objArr2[(objArr2.length - 1) & ((int) max)], AnonymousClass0RX.A00)) {
                        j5++;
                        max++;
                    }
                }
                A04(max, j4, j5, j6);
                A06(this);
                if (r132.length != 0) {
                    return A08(r132);
                }
                return r132;
            }
        }
        return AnonymousClass0RY.A00;
    }

    public AnonymousClass05H B7l(Integer num, C005102h r3, int i) {
        if (i == 0 || i == -3) {
            return this;
        }
        return new C15420nJ(num, r3, this, i);
    }

    public boolean BwB(Object obj) {
        int i;
        boolean z;
        C023509x[] r5 = AnonymousClass0RY.A00;
        synchronized (this) {
            if (A07(obj)) {
                r5 = A08(r5);
                z = true;
            } else {
                z = false;
            }
        }
        for (C023509x r1 : r5) {
            if (r1 != null) {
                r1.resumeWith(AnonymousClass0AJ.A00);
            }
        }
        return z;
    }

    public C15350nC(Integer num, int i, int i2) {
        this.A06 = i;
        this.A05 = i2;
        this.A07 = num;
    }

    private final void A04(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long min2 = Math.min(this.A02, this.A03); min2 < min; min2++) {
            Object[] objArr = this.A04;
            AnonymousClass00C.A0B(objArr);
            objArr[(objArr.length - 1) & ((int) min2)] = null;
        }
        this.A03 = j;
        this.A02 = j2;
        this.A00 = (int) (j3 - min);
        this.A01 = (int) (j4 - j3);
    }
}
