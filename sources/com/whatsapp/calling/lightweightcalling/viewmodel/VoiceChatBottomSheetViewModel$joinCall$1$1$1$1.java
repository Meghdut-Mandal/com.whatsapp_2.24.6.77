package com.whatsapp.calling.lightweightcalling.viewmodel;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C107265Nh;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel$joinCall$1$1$1$1", f = "VoiceChatBottomSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class VoiceChatBottomSheetViewModel$joinCall$1$1$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C107265Nh $callLog;
    public final /* synthetic */ Context $context;
    public int label;
    public final /* synthetic */ VoiceChatBottomSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoiceChatBottomSheetViewModel$joinCall$1$1$1$1(Context context, VoiceChatBottomSheetViewModel voiceChatBottomSheetViewModel, C107265Nh r4, C023509x r5) {
        super(2, r5);
        this.this$0 = voiceChatBottomSheetViewModel;
        this.$context = context;
        this.$callLog = r4;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new VoiceChatBottomSheetViewModel$joinCall$1$1$1$1(this.$context, this.this$0, this.$callLog, r6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        if (r2 == 0) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.label
            if (r0 != 0) goto L_0x0071
            X.AnonymousClass0AN.A00(r11)
            com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel r0 = r10.this$0
            X.6YM r4 = r0.A01
            if (r4 == 0) goto L_0x006c
            android.content.Context r2 = r10.$context
            X.5Nh r3 = r10.$callLog
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.Voip.getCallInfo()
            X.C18740tg.A06(r1)
            boolean r0 = r4.A1S
            if (r0 != 0) goto L_0x001f
            X.C90474aD.A12(r4, r1)
        L_0x001f:
            X.1ND r4 = r4.A2G
            java.util.Map r0 = r1.participants
            java.util.Set r0 = r0.keySet()
            java.util.ArrayList r7 = X.C36441kJ.A15(r0)
            java.lang.String r6 = r1.callId
            X.1NE r4 = (X.AnonymousClass1NE) r4
            r0 = 1
            boolean r0 = r4.A09(r2, r0)
            if (r0 == 0) goto L_0x006c
            X.00I r1 = r4.A01
            if (r1 == 0) goto L_0x006f
            java.lang.Object r0 = r1.A00
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x006f
            java.lang.Object r0 = r1.A01
            int r2 = X.AnonymousClass000.A0I(r0)
            if (r2 != 0) goto L_0x0055
        L_0x004a:
            java.lang.String r0 = "CallsManagerImpl/acceptCallFromVoiceChatLobby/ error in VC lobby entry point logging"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r1 = "Lobby entry point type cannot be 0"
            r0 = 0
            X.C18740tg.A0D(r0, r1)
        L_0x0055:
            r8 = 0
            int r1 = r3.A08
            r0 = 2
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            X.6NW r5 = new X.6NW
            r5.<init>(r3, r2, r8, r0)
            r9 = 1
            int r0 = X.AnonymousClass1NE.A01(r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x006c
            com.whatsapp.voipcalling.Voip.acceptCall()
        L_0x006c:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x006f:
            r2 = 0
            goto L_0x004a
        L_0x0071:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel$joinCall$1$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((VoiceChatBottomSheetViewModel$joinCall$1$1$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
