package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", i = {}, l = {214, 218, 219, 225}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0lG  reason: invalid class name and case insensitive filesystem */
public final class C14210lG extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ Object $initialValue;
    public final /* synthetic */ AnonymousClass05J $shared;
    public final /* synthetic */ C17380rC $started;
    public final /* synthetic */ AnonymousClass05H $upstream;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14210lG(Object obj, C023509x r3, AnonymousClass05H r4, AnonymousClass05J r5, C17380rC r6) {
        super(2, r3);
        this.$started = r6;
        this.$upstream = r4;
        this.$shared = r5;
        this.$initialValue = obj;
    }

    public final C023509x create(Object obj, C023509x r8) {
        C17380rC r5 = this.$started;
        return new C14210lG(this.$initialValue, r8, this.$upstream, this.$shared, r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r0 != r2) goto L_0x00ae;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            X.0AO r2 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r13.label
            r6 = 4
            r5 = 3
            r7 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0017
            if (r0 == r3) goto L_0x00ab
            if (r0 == r7) goto L_0x0053
            if (r0 == r5) goto L_0x00ab
            if (r0 == r6) goto L_0x00ab
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0017:
            X.AnonymousClass0AN.A00(r14)
            X.0rC r4 = r13.$started
            X.0rC r0 = X.AnonymousClass0W6.A00
            if (r4 != r0) goto L_0x002d
            X.05H r1 = r13.$upstream
            X.05J r0 = r13.$shared
            r13.label = r3
        L_0x0026:
            java.lang.Object r0 = r1.B36(r13, r0)
        L_0x002a:
            if (r0 != r2) goto L_0x00ae
        L_0x002c:
            return r2
        L_0x002d:
            X.0rC r0 = X.AnonymousClass0W6.A01
            r8 = 0
            X.05J r3 = r13.$shared
            X.05F r3 = (X.AnonymousClass05F) r3
            monitor-enter(r3)
            if (r4 != r0) goto L_0x005d
            X.0nB r1 = r3.A01     // Catch:{ all -> 0x00b1 }
            if (r1 != 0) goto L_0x0044
            int r0 = r3.A00     // Catch:{ all -> 0x00b1 }
            X.0nB r1 = new X.0nB     // Catch:{ all -> 0x00b1 }
            r1.<init>(r0)     // Catch:{ all -> 0x00b1 }
            r3.A01 = r1     // Catch:{ all -> 0x00b1 }
        L_0x0044:
            monitor-exit(r3)
            X.0l0 r0 = new X.0l0
            r0.<init>(r8)
            r13.label = r7
            java.lang.Object r0 = X.C07350Xh.A00(r13, r0, r1)
            if (r0 != r2) goto L_0x0056
            return r2
        L_0x0053:
            X.AnonymousClass0AN.A00(r14)
        L_0x0056:
            X.05H r1 = r13.$upstream
            X.05J r0 = r13.$shared
            r13.label = r5
            goto L_0x0026
        L_0x005d:
            X.0nB r1 = r3.A01     // Catch:{ all -> 0x00b1 }
            if (r1 != 0) goto L_0x006a
            int r0 = r3.A00     // Catch:{ all -> 0x00b1 }
            X.0nB r1 = new X.0nB     // Catch:{ all -> 0x00b1 }
            r1.<init>(r0)     // Catch:{ all -> 0x00b1 }
            r3.A01 = r1     // Catch:{ all -> 0x00b1 }
        L_0x006a:
            monitor-exit(r3)
            X.05H r0 = r4.B37(r1)
            X.05H r5 = X.C07430Xq.A01(r0)
            X.05H r4 = r13.$upstream
            X.05J r3 = r13.$shared
            java.lang.Object r0 = r13.$initialValue
            X.0lF r1 = new X.0lF
            r1.<init>(r0, r8, r4, r3)
            r13.label = r6
            X.0Vg r0 = X.C06830Vg.$redex_init_class
            X.0lJ r0 = new X.0lJ
            r0.<init>(r8, r1)
            X.0nI r10 = X.C06830Vg.A00(r0, r5)
            java.lang.Integer r7 = X.C023109s.A00
            r11 = 0
            boolean r0 = r10 instanceof X.AnonymousClass05M
            if (r0 == 0) goto L_0x00a3
            X.03u r0 = X.C008903u.A00
            X.05H r6 = r10.B7l(r7, r0, r11)
        L_0x0098:
            X.0j8 r0 = X.C13080j8.A00
            java.lang.Object r0 = r6.B36(r13, r0)
            if (r0 == r2) goto L_0x002c
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            goto L_0x002a
        L_0x00a3:
            r12 = 2
            X.0nJ r6 = new X.0nJ
            r9 = r8
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto L_0x0098
        L_0x00ab:
            X.AnonymousClass0AN.A00(r14)
        L_0x00ae:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x00b1:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14210lG.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C14210lG) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
