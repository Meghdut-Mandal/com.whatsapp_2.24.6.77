package com.whatsapp.calling.callgrid.viewmodel;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass6ND;
import X.C009003v;
import X.C023509x;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callgrid.viewmodel.ScreenSharePeerTransitionStateProvider$peerEnteredTransitionState$1", f = "ScreenSharePeerTransitionStateProvider.kt", i = {}, l = {42, 43}, m = "invokeSuspend", n = {}, s = {})
public final class ScreenSharePeerTransitionStateProvider$peerEnteredTransitionState$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ UserJid $userJid;
    public int label;
    public final /* synthetic */ AnonymousClass6ND this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScreenSharePeerTransitionStateProvider$peerEnteredTransitionState$1(AnonymousClass6ND r2, UserJid userJid, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$userJid = userJid;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new ScreenSharePeerTransitionStateProvider$peerEnteredTransitionState$1(this.this$0, this.$userJid, r5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.0AO r6 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r7.label
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r2) goto L_0x0020
            if (r0 != r5) goto L_0x0038
            X.AnonymousClass0AN.A00(r8)
        L_0x000f:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0012:
            X.AnonymousClass0AN.A00(r8)
            r0 = 5000(0x1388, double:2.4703E-320)
            r7.label = r2
            java.lang.Object r0 = X.C07330Xf.A00(r7, r0)
            if (r0 != r6) goto L_0x0023
            return r6
        L_0x0020:
            X.AnonymousClass0AN.A00(r8)
        L_0x0023:
            X.6ND r4 = r7.this$0
            X.02l r3 = r4.A05
            com.whatsapp.jid.UserJid r2 = r7.$userJid
            r1 = 0
            com.whatsapp.calling.callgrid.viewmodel.ScreenSharePeerTransitionStateProvider$peerEnteredTransitionState$1$1 r0 = new com.whatsapp.calling.callgrid.viewmodel.ScreenSharePeerTransitionStateProvider$peerEnteredTransitionState$1$1
            r0.<init>(r2, r1)
            r7.label = r5
            java.lang.Object r0 = X.AnonymousClass0A2.A00(r7, r3, r0)
            if (r0 != r6) goto L_0x000f
            return r6
        L_0x0038:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.viewmodel.ScreenSharePeerTransitionStateProvider$peerEnteredTransitionState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ScreenSharePeerTransitionStateProvider$peerEnteredTransitionState$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}