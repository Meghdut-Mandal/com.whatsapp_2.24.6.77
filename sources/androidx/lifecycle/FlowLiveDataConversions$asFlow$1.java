package androidx.lifecycle;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C001600r;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", f = "FlowLiveData.kt", i = {0, 0, 0, 1, 1, 2, 2}, l = {97, 101, 102}, m = "invokeSuspend", n = {"$this$flow", "channel", "observer", "$this$flow", "observer", "$this$flow", "observer"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1"})
public final class FlowLiveDataConversions$asFlow$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C001600r $this_asFlow;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowLiveDataConversions$asFlow$1(C001600r r2, C023509x r3) {
        super(2, r3);
        this.$this_asFlow = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        FlowLiveDataConversions$asFlow$1 flowLiveDataConversions$asFlow$1 = new FlowLiveDataConversions$asFlow$1(this.$this_asFlow, r4);
        flowLiveDataConversions$asFlow$1.L$0 = obj;
        return flowLiveDataConversions$asFlow$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0088 A[Catch:{ all -> 0x00b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008f A[Catch:{ all -> 0x00bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.0AO r8 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r11.label
            r7 = 3
            r6 = 2
            r10 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0048
            if (r0 == r10) goto L_0x0038
            if (r0 == r6) goto L_0x0025
            if (r0 != r7) goto L_0x0020
            java.lang.Object r1 = r11.L$2
            X.0iv r1 = (X.C12950iv) r1
            java.lang.Object r4 = r11.L$1
            X.04S r4 = (X.AnonymousClass04S) r4
            java.lang.Object r3 = r11.L$0
            X.05G r3 = (X.AnonymousClass05G) r3
            X.AnonymousClass0AN.A00(r12)     // Catch:{ all -> 0x0035 }
            goto L_0x007a
        L_0x0020:
            java.lang.IllegalStateException r6 = X.AnonymousClass000.A0e()
            throw r6
        L_0x0025:
            java.lang.Object r1 = r11.L$2
            X.0iv r1 = (X.C12950iv) r1
            java.lang.Object r4 = r11.L$1
            X.04S r4 = (X.AnonymousClass04S) r4
            java.lang.Object r3 = r11.L$0
            X.05G r3 = (X.AnonymousClass05G) r3
            X.AnonymousClass0AN.A00(r12)     // Catch:{ all -> 0x0035 }
            goto L_0x0089
        L_0x0035:
            r6 = move-exception
            goto L_0x00bc
        L_0x0038:
            java.lang.Object r4 = r11.L$2
            X.04S r4 = (X.AnonymousClass04S) r4
            java.lang.Object r9 = r11.L$1
            X.0r7 r9 = (X.C17330r7) r9
            java.lang.Object r3 = r11.L$0
            X.05G r3 = (X.AnonymousClass05G) r3
            X.AnonymousClass0AN.A00(r12)
            goto L_0x0076
        L_0x0048:
            X.AnonymousClass0AN.A00(r12)
            java.lang.Object r3 = r11.L$0
            X.05G r3 = (X.AnonymousClass05G) r3
            r1 = -1
            java.lang.Integer r0 = X.C023109s.A00
            X.0iw r9 = X.C05750Qx.A00(r0, r1)
            r0 = 0
            X.2ui r4 = new X.2ui
            r4.<init>(r9, r0)
            X.03P r2 = X.C36401kF.A0y()
            X.00r r1 = r11.$this_asFlow
            androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1 r0 = new androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1
            r0.<init>(r4, r5)
            r11.L$0 = r3
            r11.L$1 = r9
            r11.L$2 = r4
            r11.label = r10
            java.lang.Object r0 = X.AnonymousClass0A2.A00(r11, r2, r0)
            if (r0 != r8) goto L_0x0076
            return r8
        L_0x0076:
            X.0iv r1 = r9.BNo()     // Catch:{ all -> 0x00b9 }
        L_0x007a:
            r11.L$0 = r3     // Catch:{ all -> 0x00b7 }
            r11.L$1 = r4     // Catch:{ all -> 0x00b7 }
            r11.L$2 = r1     // Catch:{ all -> 0x00b7 }
            r11.label = r6     // Catch:{ all -> 0x00b7 }
            java.lang.Object r12 = r1.A01(r11)     // Catch:{ all -> 0x00b7 }
            if (r12 != r8) goto L_0x0089
            goto L_0x00a2
        L_0x0089:
            boolean r0 = X.AnonymousClass000.A1X(r12)     // Catch:{ all -> 0x00bb }
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r0 = r1.A00()     // Catch:{ all -> 0x00bb }
            r11.L$0 = r3     // Catch:{ all -> 0x00bb }
            r11.L$1 = r4     // Catch:{ all -> 0x00bb }
            r11.L$2 = r1     // Catch:{ all -> 0x00bb }
            r11.label = r7     // Catch:{ all -> 0x00bb }
            java.lang.Object r0 = r3.B6N(r0, r11)     // Catch:{ all -> 0x00bb }
            if (r0 != r8) goto L_0x007a
            goto L_0x00a3
        L_0x00a2:
            return r8
        L_0x00a3:
            return r8
        L_0x00a4:
            X.0in r3 = X.C12870in.A00
            X.03P r2 = X.C36401kF.A0y()
            X.00r r1 = r11.$this_asFlow
            androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2 r0 = new androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2
            r0.<init>(r4, r5)
            X.C36381kD.A1R(r2, r0, r3)
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x00b7:
            r6 = move-exception
            goto L_0x00bc
        L_0x00b9:
            r6 = move-exception
            goto L_0x00bc
        L_0x00bb:
            r6 = move-exception
        L_0x00bc:
            X.0in r3 = X.C12870in.A00
            X.03P r2 = X.C36401kF.A0y()
            X.00r r1 = r11.$this_asFlow
            androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2 r0 = new androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2
            r0.<init>(r4, r5)
            X.C36381kD.A1R(r2, r0, r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.FlowLiveDataConversions$asFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FlowLiveDataConversions$asFlow$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
