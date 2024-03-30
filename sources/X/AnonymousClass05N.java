package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.05N  reason: invalid class name */
public final class AnonymousClass05N extends AnonymousClass05F implements AnonymousClass05L, AnonymousClass05H, AnonymousClass05M {
    public static final AtomicReferenceFieldUpdater A01 = AtomicReferenceFieldUpdater.newUpdater(AnonymousClass05N.class, Object.class, "_state");
    public int A00;
    public volatile Object _state;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        r7 = (X.C15370nE[]) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        if (r7 == null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
        r6 = r7.length;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
        if (r5 >= r6) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        r4 = r7[r5];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        if (r4 == null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        r3 = X.C15370nE.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0037, code lost:
        r2 = r3.get(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        if (r2 == null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        r1 = X.AnonymousClass05E.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003f, code lost:
        if (r2 == r1) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0041, code lost:
        r0 = X.AnonymousClass05E.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0043, code lost:
        if (r2 != r0) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0049, code lost:
        if (X.AnonymousClass0A8.A00(r4, r2, r1, r3) == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004b, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0052, code lost:
        if (X.AnonymousClass0A8.A00(r4, r2, r0, r3) == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0054, code lost:
        ((X.AnonymousClass0AR) r2).resumeWith(X.AnonymousClass0AJ.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005c, code lost:
        monitor-enter(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r0 = r10.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005f, code lost:
        if (r0 != r8) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0062, code lost:
        r7 = r10.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0064, code lost:
        monitor-exit(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0065, code lost:
        r8 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0067, code lost:
        r0 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x006f, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A00(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = A01     // Catch:{ all -> 0x0070 }
            java.lang.Object r2 = r3.get(r10)     // Catch:{ all -> 0x0070 }
            r1 = 0
            if (r11 == 0) goto L_0x0012
            boolean r0 = X.AnonymousClass00C.A0J(r2, r11)     // Catch:{ all -> 0x0070 }
            if (r0 != 0) goto L_0x0012
            monitor-exit(r10)
            return r1
        L_0x0012:
            boolean r0 = X.AnonymousClass00C.A0J(r2, r12)     // Catch:{ all -> 0x0070 }
            r9 = 1
            if (r0 != 0) goto L_0x006e
            r3.set(r10, r12)     // Catch:{ all -> 0x0070 }
            int r1 = r10.A00     // Catch:{ all -> 0x0070 }
            r0 = r1 & 1
            if (r0 != 0) goto L_0x006a
            int r8 = r1 + 1
            r10.A00 = r8     // Catch:{ all -> 0x0070 }
            X.0UH[] r7 = r10.A02     // Catch:{ all -> 0x0070 }
            monitor-exit(r10)
        L_0x0029:
            X.0nE[] r7 = (X.C15370nE[]) r7
            if (r7 == 0) goto L_0x005c
            int r6 = r7.length
            r5 = 0
        L_0x002f:
            if (r5 >= r6) goto L_0x005c
            r4 = r7[r5]
            if (r4 == 0) goto L_0x004b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = X.C15370nE.A00
        L_0x0037:
            java.lang.Object r2 = r3.get(r4)
            if (r2 == 0) goto L_0x004b
            X.035 r1 = X.AnonymousClass05E.A01
            if (r2 == r1) goto L_0x004b
            X.035 r0 = X.AnonymousClass05E.A00
            if (r2 != r0) goto L_0x004e
            boolean r0 = X.AnonymousClass0A8.A00(r4, r2, r1, r3)
            if (r0 == 0) goto L_0x0037
        L_0x004b:
            int r5 = r5 + 1
            goto L_0x002f
        L_0x004e:
            boolean r0 = X.AnonymousClass0A8.A00(r4, r2, r0, r3)
            if (r0 == 0) goto L_0x0037
            X.0AR r2 = (X.AnonymousClass0AR) r2
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            r2.resumeWith(r0)
            goto L_0x004b
        L_0x005c:
            monitor-enter(r10)
            int r0 = r10.A00     // Catch:{ all -> 0x0070 }
            if (r0 != r8) goto L_0x0062
            goto L_0x0067
        L_0x0062:
            X.0UH[] r7 = r10.A02     // Catch:{ all -> 0x0070 }
            monitor-exit(r10)
            r8 = r0
            goto L_0x0029
        L_0x0067:
            int r0 = r8 + 1
            goto L_0x006c
        L_0x006a:
            int r0 = r1 + 2
        L_0x006c:
            r10.A00 = r0     // Catch:{ all -> 0x0070 }
        L_0x006e:
            monitor-exit(r10)
            return r9
        L_0x0070:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass05N.A00(java.lang.Object, java.lang.Object):boolean");
    }

    public /* bridge */ /* synthetic */ AnonymousClass0UH[] A0C(int i) {
        return new C15370nE[2];
    }

    public AnonymousClass05H B7l(Integer num, C005102h r4, int i) {
        if (i >= 0 || (i != -2 && i == -3)) {
            return this;
        }
        return new C15420nJ(num, r4, this, i);
    }

    public /* bridge */ /* synthetic */ AnonymousClass0UH A0B() {
        return new C15370nE();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010d, code lost:
        if (r1.A0G() == r9) goto L_0x010f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00aa A[Catch:{ all -> 0x0113 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00af A[ADDED_TO_REGION, Catch:{ all -> 0x0113 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bc A[Catch:{ all -> 0x0113 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00cf A[Catch:{ all -> 0x0113 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e3 A[Catch:{ all -> 0x0113 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object B36(X.C023509x r16, X.AnonymousClass05G r17) {
        /*
            r15 = this;
            r11 = r17
            r3 = r16
            boolean r0 = r3 instanceof X.C14040kr
            if (r0 == 0) goto L_0x003b
            r10 = r3
            X.0kr r10 = (X.C14040kr) r10
            int r2 = r10.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003b
            int r2 = r2 - r1
            r10.label = r2
        L_0x0016:
            java.lang.Object r2 = r10.result
            X.0AO r9 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r10.label
            r14 = 0
            r8 = 3
            r7 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0069
            if (r0 == r1) goto L_0x005c
            if (r0 == r7) goto L_0x0049
            if (r0 != r8) goto L_0x0041
            java.lang.Object r6 = r10.L$4
            java.lang.Object r5 = r10.L$3
            X.03e r5 = (X.C007403e) r5
            java.lang.Object r4 = r10.L$2
            X.0UH r4 = (X.AnonymousClass0UH) r4
            java.lang.Object r11 = r10.L$1
            X.05G r11 = (X.AnonymousClass05G) r11
            java.lang.Object r3 = r10.L$0
            X.05F r3 = (X.AnonymousClass05F) r3
            goto L_0x0099
        L_0x003b:
            X.0kr r10 = new X.0kr
            r10.<init>(r3, r15)
            goto L_0x0016
        L_0x0041:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0049:
            java.lang.Object r6 = r10.L$4
            java.lang.Object r5 = r10.L$3
            X.03e r5 = (X.C007403e) r5
            java.lang.Object r4 = r10.L$2
            X.0UH r4 = (X.AnonymousClass0UH) r4
            java.lang.Object r11 = r10.L$1
            X.05G r11 = (X.AnonymousClass05G) r11
            java.lang.Object r3 = r10.L$0
            X.05F r3 = (X.AnonymousClass05F) r3
            goto L_0x00d1
        L_0x005c:
            java.lang.Object r4 = r10.L$2
            X.0UH r4 = (X.AnonymousClass0UH) r4
            java.lang.Object r11 = r10.L$1
            X.05G r11 = (X.AnonymousClass05G) r11
            java.lang.Object r3 = r10.L$0
            X.05F r3 = (X.AnonymousClass05F) r3
            goto L_0x0088
        L_0x0069:
            X.AnonymousClass0AN.A00(r2)
            X.0UH r4 = r15.A09()
            boolean r0 = r11 instanceof X.C13070j7     // Catch:{ all -> 0x0110 }
            if (r0 == 0) goto L_0x0086
            r0 = r11
            X.0j7 r0 = (X.C13070j7) r0     // Catch:{ all -> 0x0110 }
            r10.L$0 = r15     // Catch:{ all -> 0x0110 }
            r10.L$1 = r11     // Catch:{ all -> 0x0110 }
            r10.L$2 = r4     // Catch:{ all -> 0x0110 }
            r10.label = r1     // Catch:{ all -> 0x0110 }
            java.lang.Object r0 = r0.A00(r10)     // Catch:{ all -> 0x0110 }
            if (r0 != r9) goto L_0x0086
            return r9
        L_0x0086:
            r3 = r15
            goto L_0x008b
        L_0x0088:
            X.AnonymousClass0AN.A00(r2)     // Catch:{ all -> 0x0113 }
        L_0x008b:
            X.02h r1 = r10.getContext()     // Catch:{ all -> 0x0113 }
            X.03x r0 = X.C007403e.A00     // Catch:{ all -> 0x0113 }
            X.02i r5 = r1.get(r0)     // Catch:{ all -> 0x0113 }
            X.03e r5 = (X.C007403e) r5     // Catch:{ all -> 0x0113 }
            r6 = r14
            goto L_0x009c
        L_0x0099:
            X.AnonymousClass0AN.A00(r2)     // Catch:{ all -> 0x0113 }
        L_0x009c:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A01     // Catch:{ all -> 0x0113 }
            java.lang.Object r2 = r0.get(r3)     // Catch:{ all -> 0x0113 }
            if (r5 == 0) goto L_0x00af
            boolean r0 = r5.BL7()     // Catch:{ all -> 0x0113 }
            if (r0 != 0) goto L_0x00af
            java.util.concurrent.CancellationException r0 = r5.B9P()     // Catch:{ all -> 0x0113 }
            throw r0     // Catch:{ all -> 0x0113 }
        L_0x00af:
            if (r6 == 0) goto L_0x00b7
            boolean r0 = r6.equals(r2)     // Catch:{ all -> 0x0113 }
            if (r0 != 0) goto L_0x00d4
        L_0x00b7:
            X.035 r1 = X.C05980Rv.A01     // Catch:{ all -> 0x0113 }
            r0 = r2
            if (r2 != r1) goto L_0x00bd
            r0 = r14
        L_0x00bd:
            r10.L$0 = r3     // Catch:{ all -> 0x0113 }
            r10.L$1 = r11     // Catch:{ all -> 0x0113 }
            r10.L$2 = r4     // Catch:{ all -> 0x0113 }
            r10.L$3 = r5     // Catch:{ all -> 0x0113 }
            r10.L$4 = r2     // Catch:{ all -> 0x0113 }
            r10.label = r7     // Catch:{ all -> 0x0113 }
            java.lang.Object r0 = r11.B6N(r0, r10)     // Catch:{ all -> 0x0113 }
            if (r0 == r9) goto L_0x010f
            r6 = r2
            goto L_0x00d4
        L_0x00d1:
            X.AnonymousClass0AN.A00(r2)     // Catch:{ all -> 0x0113 }
        L_0x00d4:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = X.C15370nE.A00     // Catch:{ all -> 0x0113 }
            X.035 r12 = X.AnonymousClass05E.A00     // Catch:{ all -> 0x0113 }
            java.lang.Object r1 = r13.getAndSet(r4, r12)     // Catch:{ all -> 0x0113 }
            X.AnonymousClass00C.A0B(r1)     // Catch:{ all -> 0x0113 }
            X.035 r0 = X.AnonymousClass05E.A01     // Catch:{ all -> 0x0113 }
            if (r1 == r0) goto L_0x009c
            r10.L$0 = r3     // Catch:{ all -> 0x0113 }
            r10.L$1 = r11     // Catch:{ all -> 0x0113 }
            r10.L$2 = r4     // Catch:{ all -> 0x0113 }
            r10.L$3 = r5     // Catch:{ all -> 0x0113 }
            r10.L$4 = r6     // Catch:{ all -> 0x0113 }
            r10.label = r8     // Catch:{ all -> 0x0113 }
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.AnonymousClass0AR.A02     // Catch:{ all -> 0x0113 }
            X.09x r2 = X.AnonymousClass0AA.A01(r10)     // Catch:{ all -> 0x0113 }
            r0 = 1
            X.0AR r1 = new X.0AR     // Catch:{ all -> 0x0113 }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x0113 }
            r1.A0J()     // Catch:{ all -> 0x0113 }
            boolean r0 = X.AnonymousClass0A8.A00(r4, r12, r1, r13)     // Catch:{ all -> 0x0113 }
            if (r0 != 0) goto L_0x0109
            X.0AJ r0 = X.AnonymousClass0AJ.A00     // Catch:{ all -> 0x0113 }
            r1.resumeWith(r0)     // Catch:{ all -> 0x0113 }
        L_0x0109:
            java.lang.Object r0 = r1.A0G()     // Catch:{ all -> 0x0113 }
            if (r0 != r9) goto L_0x009c
        L_0x010f:
            return r9
        L_0x0110:
            r0 = move-exception
            r3 = r15
            goto L_0x0114
        L_0x0113:
            r0 = move-exception
        L_0x0114:
            r3.A0A(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass05N.B36(X.09x, X.05G):java.lang.Object");
    }

    public boolean B3B(Object obj, Object obj2) {
        if (obj == null) {
            obj = C05980Rv.A01;
        }
        if (obj2 == null) {
            obj2 = C05980Rv.A01;
        }
        return A00(obj, obj2);
    }

    public void BoY() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    public Object getValue() {
        AnonymousClass035 r1 = C05980Rv.A01;
        Object obj = A01.get(this);
        if (obj == r1) {
            return null;
        }
        return obj;
    }

    public void setValue(Object obj) {
        if (obj == null) {
            obj = C05980Rv.A01;
        }
        A00((Object) null, obj);
    }

    public AnonymousClass05N(Object obj) {
        this._state = obj;
    }

    public Object B6N(Object obj, C023509x r3) {
        setValue(obj);
        return AnonymousClass0AJ.A00;
    }

    public boolean BwB(Object obj) {
        setValue(obj);
        return true;
    }
}
