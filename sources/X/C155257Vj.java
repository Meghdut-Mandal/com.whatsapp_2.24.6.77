package X;

import java.util.concurrent.Executor;

/* renamed from: X.7Vj  reason: invalid class name and case insensitive filesystem */
public final class C155257Vj extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ String $appId;
    public final /* synthetic */ AnonymousClass7cU $bloksDebuggerListener;
    public final /* synthetic */ String $cacheKey;
    public final /* synthetic */ String $cacheLookupDedupeKey;
    public final /* synthetic */ C006302t $callback;
    public final /* synthetic */ boolean $diskCacheEnabled;
    public final /* synthetic */ boolean $isPayloadPrebundled = false;
    public final /* synthetic */ AnonymousClass6C0 $queryInfo;
    public final /* synthetic */ Executor $responseThreadExecutor;
    public final /* synthetic */ C123105vw this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C155257Vj(C123105vw r3, AnonymousClass6C0 r4, String str, String str2, String str3, Executor executor, C006302t r9, boolean z) {
        super(1);
        this.this$0 = r3;
        this.$cacheLookupDedupeKey = str;
        this.$callback = r9;
        this.$cacheKey = str2;
        this.$appId = str3;
        this.$queryInfo = r4;
        this.$diskCacheEnabled = z;
        this.$responseThreadExecutor = executor;
        this.$bloksDebuggerListener = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0051, code lost:
        if (r5.$isPayloadPrebundled != false) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r19) {
        /*
            r18 = this;
            r7 = r19
            X.011 r7 = (X.AnonymousClass011) r7
            r5 = r18
            X.5vw r0 = r5.this$0
            java.util.Set r1 = r0.A03
            java.lang.String r0 = r5.$cacheLookupDedupeKey
            r1.remove(r0)
            if (r7 == 0) goto L_0x0042
            java.lang.Object r6 = r7.first
            X.5oo r6 = (X.C118835oo) r6
            boolean r0 = r6 instanceof X.C100554vD
            if (r0 == 0) goto L_0x003f
            X.02t r4 = r5.$callback
            java.lang.String r3 = r5.$cacheKey
            X.4vD r6 = (X.C100554vD) r6
            X.72B r2 = r6.A01
            java.lang.Object r1 = r7.second
            X.5on r1 = (X.C118825on) r1
            X.4vA r0 = new X.4vA
            r0.<init>(r1, r2, r3)
            r4.invoke(r0)
            X.02t r4 = r5.$callback
            java.lang.String r3 = r5.$cacheKey
            X.69R r2 = r6.A00
            java.lang.Object r1 = r7.second
            X.5on r1 = (X.C118825on) r1
            X.4v9 r0 = new X.4v9
            r0.<init>(r2, r1, r3)
            r4.invoke(r0)
        L_0x003f:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0042:
            X.5vw r8 = r5.this$0
            java.lang.String r11 = r5.$cacheKey
            java.lang.String r2 = r5.$appId
            X.6C0 r10 = r5.$queryInfo
            boolean r0 = r5.$diskCacheEnabled
            if (r0 == 0) goto L_0x0053
            boolean r0 = r5.$isPayloadPrebundled
            r13 = 1
            if (r0 == 0) goto L_0x0054
        L_0x0053:
            r13 = 0
        L_0x0054:
            java.util.concurrent.Executor r1 = r5.$responseThreadExecutor
            r14 = 0
            X.02t r12 = r5.$callback
            r0 = 0
            X.AnonymousClass00C.A0D(r11, r0)
            X.C36321k7.A0x(r2, r10)
            r0 = 4
            X.AnonymousClass00C.A0D(r1, r0)
            r0 = 6
            X.AnonymousClass00C.A0D(r12, r0)
            java.util.Set r1 = r8.A04
            boolean r0 = r1.contains(r11)
            if (r0 != 0) goto L_0x003f
            X.4v4 r9 = new X.4v4
            r9.<init>()
            X.5wu r7 = new X.5wu
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r1.add(r11)
            X.7kt r0 = r8.A00
            long r0 = r0.currentMonotonicTimestamp()
            java.lang.String r2 = "request_start"
            r9.A00(r2, r0)
            java.lang.String r1 = "query_src"
            java.lang.String r0 = "www"
            r9.A01(r1, r0)
            X.5n8 r0 = r8.A02
            java.lang.String r15 = r10.A02
            java.util.Map r6 = r10.A03
            X.005 r0 = r0.A00
            java.lang.Object r11 = r0.get()
            X.6Pn r11 = (X.C131556Pn) r11
            java.lang.String r0 = "{\"server_params\":{"
            java.lang.StringBuilder r5 = X.C90524aI.A0i(r0)
            java.util.Iterator r4 = X.AnonymousClass000.A0y(r6)
            r3 = 0
        L_0x00a8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00d3
            java.util.Map$Entry r1 = X.AnonymousClass000.A11(r4)
            java.lang.String r0 = X.C90494aF.A0f(r1)
            java.lang.Object r2 = r1.getValue()
            java.lang.String r1 = "\""
            r5.append(r1)
            r5.append(r0)
            java.lang.String r0 = "\":\""
            r5.append(r0)
            r5.append(r2)
            r5.append(r1)
            X.C90504aG.A1O(r5, r6, r3)
            int r3 = r3 + 1
            goto L_0x00a8
        L_0x00d3:
            java.lang.String r0 = "}}"
            java.lang.String r16 = X.AnonymousClass000.A0q(r0, r5)
            X.AnonymousClass00C.A08(r16)
            java.lang.String r3 = "ASYNC_COMPONENT"
            r0 = 0
            r2 = 0
            X.6bn r12 = new X.6bn
            r12.<init>(r0, r3, r2)
            X.7qt r13 = new X.7qt
            r13.<init>(r7, r2)
            r17 = r14
            r11.A03(r12, r13, r14, r15, r16, r17)
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C155257Vj.invoke(java.lang.Object):java.lang.Object");
    }
}
