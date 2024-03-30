package com.whatsapp.messaging.offline;

import X.AnonymousClass00C;
import X.AnonymousClass19A;
import X.C006302t;
import java.util.concurrent.atomic.AtomicBoolean;

public final class DelayedStanzasFetcher$StanzaFetcher {
    public final AtomicBoolean A00 = new AtomicBoolean(false);
    public final AnonymousClass19A A01;
    public final C006302t A02;

    public DelayedStanzasFetcher$StanzaFetcher(AnonymousClass19A r3, C006302t r4) {
        AnonymousClass00C.A0D(r3, 3);
        AnonymousClass00C.A0D(r4, 4);
        this.A01 = r3;
        this.A02 = r4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C023509x r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof X.AnonymousClass7AN
            if (r0 == 0) goto L_0x00ba
            r8 = r14
            X.7AN r8 = (X.AnonymousClass7AN) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ba
            int r2 = r2 - r1
            r8.label = r2
        L_0x0012:
            java.lang.Object r5 = r8.result
            X.0AO r3 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r8.label
            r4 = 1
            java.lang.String r2 = "DelayedStanzasManager/sendPullRequest/"
            if (r0 == 0) goto L_0x006d
            if (r0 != r4) goto L_0x00c1
            X.AnonymousClass0AN.A00(r5)
        L_0x0022:
            X.96o r5 = (X.C1900196o) r5
            boolean r0 = r5 instanceof X.C177778eM
            if (r0 != 0) goto L_0x004c
            boolean r0 = r5 instanceof X.C177768eL
            if (r0 == 0) goto L_0x004f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r0 = "notification"
            r1.append(r0)
            java.lang.String r0 = " error "
            r1.append(r0)
            X.8eL r5 = (X.C177768eL) r5
            X.9nx r0 = r5.A00
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x004c:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x004f:
            boolean r0 = r5 instanceof X.C177788eN
            if (r0 == 0) goto L_0x004c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r0 = "notification"
            r1.append(r0)
            java.lang.String r0 = " delivery failure"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x004c
        L_0x006d:
            X.AnonymousClass0AN.A00(r5)
            java.util.concurrent.atomic.AtomicBoolean r1 = r13.A00
            r0 = 0
            boolean r0 = r1.getAndSet(r0)
            if (r0 == 0) goto L_0x004c
            X.19A r5 = r13.A01
            java.lang.String r7 = r5.A09()
            X.02t r0 = r13.A02
            X.1Uj r0 = (X.C28871Uj) r0
            java.lang.Object r0 = r0.invoke(r7)
            X.33b r0 = (X.C592133b) r0
            X.9nx r6 = r0.A00
            X.AnonymousClass00C.A08(r6)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r0 = "notification"
            r1.append(r0)
            java.lang.String r0 = " sending an iq "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r8.L$0 = r13
            r8.label = r4
            r9 = 200(0xc8, float:2.8E-43)
            r10 = 32000(0x7d00, double:1.581E-319)
            r12 = 0
            java.lang.Object r5 = r5.A08(r6, r7, r8, r9, r10, r12)
            if (r5 != r3) goto L_0x0022
            return r3
        L_0x00ba:
            X.7AN r8 = new X.7AN
            r8.<init>(r13, r14)
            goto L_0x0012
        L_0x00c1:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.offline.DelayedStanzasFetcher$StanzaFetcher.A00(X.09x):java.lang.Object");
    }
}
