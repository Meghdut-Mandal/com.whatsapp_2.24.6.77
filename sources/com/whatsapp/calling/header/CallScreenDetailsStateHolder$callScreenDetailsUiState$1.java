package com.whatsapp.calling.header;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C019408g;
import X.C023509x;
import X.C124175xi;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.header.CallScreenDetailsStateHolder$callScreenDetailsUiState$1", f = "CallScreenDetailsStateHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallScreenDetailsStateHolder$callScreenDetailsUiState$1 extends AnonymousClass0A1 implements C019408g {
    public /* synthetic */ Object L$0;
    public /* synthetic */ boolean Z$0;
    public int label;
    public final /* synthetic */ C124175xi this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallScreenDetailsStateHolder$callScreenDetailsUiState$1(C124175xi r2, C023509x r3) {
        super(3, r3);
        this.this$0 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (r8 != false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        if (r0 == null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b7, code lost:
        if (r1 != com.whatsapp.voipcalling.CallState.RECEIVED_CALL) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0035, code lost:
        if (r2 == false) goto L_0x0037;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.label
            if (r0 != 0) goto L_0x00c1
            X.AnonymousClass0AN.A00(r11)
            java.lang.Object r6 = r10.L$0
            X.6OZ r6 = (X.AnonymousClass6OZ) r6
            boolean r2 = r10.Z$0
            X.5xi r0 = r10.this$0
            X.5t8 r5 = r0.A01
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            X.147 r4 = r6.A06
            if (r4 == 0) goto L_0x00bb
            X.16D r0 = r5.A02
            X.141 r0 = r0.A0D(r4)
        L_0x001f:
            r5.A00 = r0
            X.0wy r7 = r6.A04
            int r1 = r7.size()
            r3 = 0
            r0 = 1
            boolean r8 = X.AnonymousClass000.A1S(r1, r0)
            boolean r0 = r6.A0N
            if (r0 == 0) goto L_0x0098
            boolean r0 = r6.A0K
            if (r0 == 0) goto L_0x003a
            if (r2 != 0) goto L_0x003a
        L_0x0037:
            r1 = 1
            if (r8 == 0) goto L_0x003b
        L_0x003a:
            r1 = 0
        L_0x003b:
            com.whatsapp.voipcalling.CallState r0 = r6.A09
            X.AnonymousClass00C.A07(r0)
            r5.A01 = r0
            if (r1 == 0) goto L_0x00be
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()
            boolean r0 = r6.A0J
            if (r0 != 0) goto L_0x005f
            X.16D r1 = r5.A02
            com.whatsapp.jid.UserJid r0 = r6.A08
            if (r0 != 0) goto L_0x0064
        L_0x0052:
            boolean r0 = r6.A0K
            if (r0 == 0) goto L_0x0059
            if (r4 == 0) goto L_0x0059
            r3 = 1
        L_0x0059:
            X.52x r0 = new X.52x
            r0.<init>(r9, r3)
            return r0
        L_0x005f:
            r0 = r4
            if (r4 == 0) goto L_0x006e
            X.16D r1 = r5.A02
        L_0x0064:
            X.11F r0 = (X.AnonymousClass11F) r0
            X.141 r0 = r1.A0D(r0)
            r9.add(r0)
            goto L_0x0052
        L_0x006e:
            java.util.Collection r0 = r7.values()
            java.util.ArrayList r8 = X.C36411kG.A13(r0)
            java.util.Iterator r7 = r0.iterator()
        L_0x007a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0094
            X.6EE r2 = X.C90524aI.A0J(r7)
            boolean r0 = r2.A0J
            if (r0 != 0) goto L_0x007a
            X.16D r1 = r5.A02
            com.whatsapp.jid.UserJid r0 = r2.A08
            X.141 r0 = r1.A0D(r0)
            r8.add(r0)
            goto L_0x007a
        L_0x0094:
            r9.addAll(r8)
            goto L_0x0052
        L_0x0098:
            com.whatsapp.voipcalling.CallState r2 = r5.A01
            com.whatsapp.voipcalling.CallState r1 = r6.A09
            int r0 = r6.A01
            boolean r0 = X.C34681hT.A0U(r2, r1, r0)
            if (r0 != 0) goto L_0x0037
            X.AnonymousClass00C.A07(r1)
            boolean r0 = X.C131856Qx.A01(r1)
            if (r0 != 0) goto L_0x0037
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r1 == r0) goto L_0x0037
            boolean r0 = r6.A0J
            if (r0 == 0) goto L_0x003a
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 != r0) goto L_0x003a
            goto L_0x0037
        L_0x00bb:
            r0 = 0
            goto L_0x001f
        L_0x00be:
            X.52y r0 = X.C1030152y.A00
            return r0
        L_0x00c1:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.header.CallScreenDetailsStateHolder$callScreenDetailsUiState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object BKt(Object obj, Object obj2, Object obj3) {
        boolean A1X = AnonymousClass000.A1X(obj2);
        CallScreenDetailsStateHolder$callScreenDetailsUiState$1 callScreenDetailsStateHolder$callScreenDetailsUiState$1 = new CallScreenDetailsStateHolder$callScreenDetailsUiState$1(this.this$0, (C023509x) obj3);
        callScreenDetailsStateHolder$callScreenDetailsUiState$1.L$0 = obj;
        callScreenDetailsStateHolder$callScreenDetailsUiState$1.Z$0 = A1X;
        return callScreenDetailsStateHolder$callScreenDetailsUiState$1.invokeSuspend(AnonymousClass0AJ.A00);
    }
}
