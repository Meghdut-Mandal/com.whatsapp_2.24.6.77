package com.whatsapp.status.viewmodels;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.status.viewmodels.StatusesViewModel$refreshStatuses$1", f = "StatusesViewModel.kt", i = {0, 1, 2, 3, 3, 3, 3}, l = {296, 309, 311, 497}, m = "invokeSuspend", n = {"$this$launch", "refreshStatusesDeferred", "result", "result", "statuses", "mutedStatuses", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0", "L$0", "L$0", "L$1", "L$2", "L$3"})
public final class StatusesViewModel$refreshStatuses$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ boolean $shouldThrottle;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public final /* synthetic */ StatusesViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusesViewModel$refreshStatuses$1(StatusesViewModel statusesViewModel, C023509x r3, boolean z) {
        super(2, r3);
        this.$shouldThrottle = z;
        this.this$0 = statusesViewModel;
    }

    public final C023509x create(Object obj, C023509x r5) {
        StatusesViewModel$refreshStatuses$1 statusesViewModel$refreshStatuses$1 = new StatusesViewModel$refreshStatuses$1(this.this$0, r5, this.$shouldThrottle);
        statusesViewModel$refreshStatuses$1.L$0 = obj;
        return statusesViewModel$refreshStatuses$1;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        if (X.C07330Xf.A00(r12, 1000) == r9) goto L_0x0046;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0081 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b2 A[LOOP:0: B:27:0x00ac->B:29:0x00b2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e0 A[Catch:{ all -> 0x0139 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x010b A[LOOP:1: B:39:0x0105->B:41:0x010b, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.0AO r9 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r12.label
            r10 = 4
            r8 = 3
            r7 = 2
            r5 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002f
            if (r0 == r5) goto L_0x0047
            if (r0 == r7) goto L_0x0082
            if (r0 == r8) goto L_0x0098
            if (r0 != r10) goto L_0x002a
            java.lang.Object r8 = r12.L$4
            com.whatsapp.status.viewmodels.StatusesViewModel r8 = (com.whatsapp.status.viewmodels.StatusesViewModel) r8
            java.lang.Object r4 = r12.L$3
            X.0qq r4 = (X.C17170qq) r4
            java.lang.Object r7 = r12.L$2
            java.util.Set r7 = (java.util.Set) r7
            java.lang.Object r6 = r12.L$1
            java.lang.Object r3 = r12.L$0
            X.35f r3 = (X.C597735f) r3
            X.AnonymousClass0AN.A00(r13)
            goto L_0x00d7
        L_0x002a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x002f:
            X.AnonymousClass0AN.A00(r13)
            java.lang.Object r11 = r12.L$0
            X.040 r11 = (X.AnonymousClass040) r11
            boolean r0 = r12.$shouldThrottle
            if (r0 == 0) goto L_0x004e
            r0 = 1000(0x3e8, double:4.94E-321)
            r12.L$0 = r11
            r12.label = r5
            java.lang.Object r0 = X.C07330Xf.A00(r12, r0)
            if (r0 != r9) goto L_0x004e
        L_0x0046:
            return r9
        L_0x0047:
            java.lang.Object r11 = r12.L$0
            X.040 r11 = (X.AnonymousClass040) r11
            X.AnonymousClass0AN.A00(r13)
        L_0x004e:
            com.whatsapp.status.viewmodels.StatusesViewModel r0 = r12.this$0
            boolean r0 = com.whatsapp.status.viewmodels.StatusesViewModel.A04(r0)
            if (r0 == 0) goto L_0x005d
            com.whatsapp.status.viewmodels.StatusesViewModel r0 = r12.this$0
            X.1HT r0 = r0.A08
            r0.A04()
        L_0x005d:
            com.whatsapp.status.viewmodels.StatusesViewModel r1 = r12.this$0
            com.whatsapp.status.viewmodels.StatusesViewModel$refreshStatuses$1$refreshStatusesDeferred$1 r0 = new com.whatsapp.status.viewmodels.StatusesViewModel$refreshStatuses$1$refreshStatusesDeferred$1
            r0.<init>(r1, r2)
            X.03u r6 = X.C008903u.A00
            java.lang.Integer r4 = X.C023109s.A00
            X.0ml r0 = X.AnonymousClass0A2.A01(r4, r6, r0, r11)
            com.whatsapp.status.viewmodels.StatusesViewModel r3 = r12.this$0
            com.whatsapp.status.viewmodels.StatusesViewModel$refreshStatuses$1$fetchStatusUpdatesMapDeferred$1 r1 = new com.whatsapp.status.viewmodels.StatusesViewModel$refreshStatuses$1$fetchStatusUpdatesMapDeferred$1
            r1.<init>(r3, r2)
            X.0ml r1 = X.AnonymousClass0A2.A01(r4, r6, r1, r11)
            r12.L$0 = r0
            r12.label = r7
            java.lang.Object r13 = r1.B1c(r12)
            if (r13 != r9) goto L_0x0089
            return r9
        L_0x0082:
            java.lang.Object r0 = r12.L$0
            X.0sP r0 = (X.C17990sP) r0
            X.AnonymousClass0AN.A00(r13)
        L_0x0089:
            X.35f r13 = (X.C597735f) r13
            r12.L$0 = r13
            r12.label = r8
            java.lang.Object r0 = r0.B1c(r12)
            if (r0 == r9) goto L_0x0046
            r3 = r13
            r13 = r0
            goto L_0x009f
        L_0x0098:
            java.lang.Object r3 = r12.L$0
            X.35f r3 = (X.C597735f) r3
            X.AnonymousClass0AN.A00(r13)
        L_0x009f:
            r6 = r13
            X.3P0 r6 = (X.AnonymousClass3P0) r6
            java.util.List r0 = r6.A01
            java.util.ArrayList r4 = X.C36321k7.A0J(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x00ac:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00bc
            X.3Sz r0 = X.C36441kJ.A0h(r1)
            com.whatsapp.jid.UserJid r0 = r0.A09
            r4.add(r0)
            goto L_0x00ac
        L_0x00bc:
            java.util.Set r7 = X.C007103b.A0f(r4)
            com.whatsapp.status.viewmodels.StatusesViewModel r8 = r12.this$0
            X.0qq r4 = r8.A0I
            r12.L$0 = r3
            r12.L$1 = r6
            r12.L$2 = r7
            r12.L$3 = r4
            r12.L$4 = r8
            r12.label = r10
            java.lang.Object r0 = r4.BOV(r2, r12)
            if (r0 != r9) goto L_0x00d7
            return r9
        L_0x00d7:
            java.util.concurrent.atomic.AtomicBoolean r1 = r8.A0G     // Catch:{ all -> 0x0139 }
            r0 = 0
            boolean r0 = r1.compareAndSet(r0, r5)     // Catch:{ all -> 0x0139 }
            if (r0 == 0) goto L_0x00ed
            java.util.Set r1 = r3.A01     // Catch:{ all -> 0x0139 }
            java.util.Set r0 = r8.A02     // Catch:{ all -> 0x0139 }
            java.util.Set r0 = X.C007103b.A0e(r0)     // Catch:{ all -> 0x0139 }
            r0.addAll(r1)     // Catch:{ all -> 0x0139 }
            r8.A02 = r0     // Catch:{ all -> 0x0139 }
        L_0x00ed:
            X.0AJ r8 = X.AnonymousClass0AJ.A00     // Catch:{ all -> 0x0139 }
            r4.BwJ(r2)
            java.util.Map r1 = r3.A00
            int r0 = r1.size()
            int r0 = X.C000300d.A02(r0)
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r0)
            java.util.Iterator r4 = X.AnonymousClass000.A0y(r1)
        L_0x0105:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x012a
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r4)
            java.lang.Object r3 = r0.getKey()
            java.lang.Object r2 = r0.getValue()
            X.3Sz r2 = (X.C65663Sz) r2
            java.lang.Object r0 = r0.getKey()
            boolean r1 = r7.contains(r0)
            X.3Ed r0 = new X.3Ed
            r0.<init>(r2, r1)
            r5.put(r3, r0)
            goto L_0x0105
        L_0x012a:
            com.whatsapp.status.viewmodels.StatusesViewModel r0 = r12.this$0
            X.00s r0 = r0.A04
            r0.A0C(r5)
            com.whatsapp.status.viewmodels.StatusesViewModel r0 = r12.this$0
            X.00s r0 = r0.A05
            r0.A0C(r6)
            return r8
        L_0x0139:
            r0 = move-exception
            r4.BwJ(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.viewmodels.StatusesViewModel$refreshStatuses$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StatusesViewModel$refreshStatuses$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
