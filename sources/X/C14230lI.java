package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {54, 76, 79}, m = "invokeSuspend", n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
/* renamed from: X.0lI  reason: invalid class name and case insensitive filesystem */
public final class C14230lI extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass00S $arrayFactory;
    public final /* synthetic */ AnonymousClass05H[] $flows;
    public final /* synthetic */ AnonymousClass05G $this_combineInternal;
    public final /* synthetic */ C019408g $transform;
    public int I$0;
    public int I$1;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14230lI(C023509x r2, AnonymousClass00S r3, C019408g r4, AnonymousClass05G r5, AnonymousClass05H[] r6) {
        super(2, r2);
        this.$flows = r6;
        this.$arrayFactory = r3;
        this.$transform = r4;
        this.$this_combineInternal = r5;
    }

    public final C023509x create(Object obj, C023509x r8) {
        C023509x r1 = r8;
        C14230lI r0 = new C14230lI(r1, this.$arrayFactory, this.$transform, this.$this_combineInternal, this.$flows);
        r0.L$0 = obj;
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0076, code lost:
        if (r12 == r11) goto L_0x0078;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r1 = r19
            X.0AO r11 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            r10 = r18
            int r0 = r10.label
            r9 = 0
            r8 = 3
            r7 = 2
            r6 = 1
            if (r0 == 0) goto L_0x002d
            if (r0 == r6) goto L_0x0079
            if (r0 == r7) goto L_0x0019
            if (r0 == r8) goto L_0x0019
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        L_0x0019:
            int r9 = r10.I$1
            int r5 = r10.I$0
            java.lang.Object r2 = r10.L$2
            byte[] r2 = (byte[]) r2
            java.lang.Object r15 = r10.L$1
            X.0r7 r15 = (X.C17330r7) r15
            java.lang.Object r4 = r10.L$0
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            X.AnonymousClass0AN.A00(r1)
            goto L_0x0063
        L_0x002d:
            X.AnonymousClass0AN.A00(r1)
            java.lang.Object r3 = r10.L$0
            X.040 r3 = (X.AnonymousClass040) r3
            X.05H[] r0 = r10.$flows
            int r5 = r0.length
            if (r5 == 0) goto L_0x0099
            java.lang.Object[] r4 = new java.lang.Object[r5]
            X.035 r0 = X.C05980Rv.A02
            java.util.Arrays.fill(r4, r9, r5, r0)
            r14 = 0
            java.lang.Integer r2 = X.C023109s.A00
            X.0iw r15 = X.C05750Qx.A00(r2, r5)
            java.util.concurrent.atomic.AtomicInteger r13 = new java.util.concurrent.atomic.AtomicInteger
            r13.<init>(r5)
            r1 = 0
        L_0x004d:
            X.05H[] r0 = r10.$flows
            X.0lH r12 = new X.0lH
            r17 = r1
            r16 = r0
            r12.<init>(r13, r14, r15, r16, r17)
            X.03u r0 = X.C008903u.A00
            X.AnonymousClass0A2.A02(r2, r0, r12, r3)
            int r1 = r1 + 1
            if (r1 < r5) goto L_0x004d
            byte[] r2 = new byte[r5]
        L_0x0063:
            int r0 = r9 + 1
            byte r9 = (byte) r0
            r10.L$0 = r4
            r10.L$1 = r15
            r10.L$2 = r2
            r10.I$0 = r5
            r10.I$1 = r9
            r10.label = r6
            java.lang.Object r12 = r15.Bmy(r10)
            if (r12 != r11) goto L_0x0090
        L_0x0078:
            return r11
        L_0x0079:
            int r9 = r10.I$1
            int r5 = r10.I$0
            java.lang.Object r2 = r10.L$2
            byte[] r2 = (byte[]) r2
            java.lang.Object r15 = r10.L$1
            X.0r7 r15 = (X.C17330r7) r15
            java.lang.Object r4 = r10.L$0
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            X.AnonymousClass0AN.A00(r1)
            X.0X8 r1 = (X.AnonymousClass0X8) r1
            java.lang.Object r12 = r1.A00
        L_0x0090:
            boolean r0 = r12 instanceof X.C06340Tf
            if (r0 == 0) goto L_0x0095
            r12 = 0
        L_0x0095:
            X.0Ug r12 = (X.C06600Ug) r12
            if (r12 != 0) goto L_0x009c
        L_0x0099:
            X.0AJ r11 = X.AnonymousClass0AJ.A00
            return r11
        L_0x009c:
            int r3 = r12.A00
            r1 = r4[r3]
            java.lang.Object r0 = r12.A01
            r4[r3] = r0
            X.035 r0 = X.C05980Rv.A02
            if (r1 != r0) goto L_0x00aa
            int r5 = r5 + -1
        L_0x00aa:
            byte r0 = r2[r3]
            if (r0 == r9) goto L_0x00be
            byte r0 = (byte) r9
            r2[r3] = r0
            java.lang.Object r12 = r15.BwC()
            boolean r0 = r12 instanceof X.C06340Tf
            if (r0 == 0) goto L_0x00ba
            r12 = 0
        L_0x00ba:
            X.0Ug r12 = (X.C06600Ug) r12
            if (r12 != 0) goto L_0x009c
        L_0x00be:
            if (r5 != 0) goto L_0x0063
            X.00S r0 = r10.$arrayFactory
            java.lang.Object r3 = r0.invoke()
            if (r3 != 0) goto L_0x00e0
            X.08g r1 = r10.$transform
            X.05G r0 = r10.$this_combineInternal
            r10.L$0 = r4
            r10.L$1 = r15
            r10.L$2 = r2
            r10.I$0 = r5
            r10.I$1 = r9
            r10.label = r7
            java.lang.Object r0 = r1.BKt(r0, r4, r10)
            if (r0 == r11) goto L_0x0078
            r5 = 0
            goto L_0x0063
        L_0x00e0:
            int r1 = r4.length
            r0 = 0
            java.lang.System.arraycopy(r4, r0, r3, r0, r1)
            X.08g r1 = r10.$transform
            X.05G r0 = r10.$this_combineInternal
            r10.L$0 = r4
            r10.L$1 = r15
            r10.L$2 = r2
            r10.I$0 = r5
            r10.I$1 = r9
            r10.label = r8
            java.lang.Object r0 = r1.BKt(r0, r3, r10)
            if (r0 != r11) goto L_0x0063
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14230lI.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C14230lI) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
