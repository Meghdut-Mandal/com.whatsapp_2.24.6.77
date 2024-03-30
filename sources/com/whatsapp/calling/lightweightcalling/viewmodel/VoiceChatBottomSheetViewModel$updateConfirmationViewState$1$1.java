package com.whatsapp.calling.lightweightcalling.viewmodel;

import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel$updateConfirmationViewState$1$1", f = "VoiceChatBottomSheetViewModel.kt", i = {0}, l = {157}, m = "invokeSuspend", n = {"i"}, s = {"I$0"})
public final class VoiceChatBottomSheetViewModel$updateConfirmationViewState$1$1 extends AnonymousClass0A1 implements C009003v {
    public int I$0;
    public int label;
    public final /* synthetic */ VoiceChatBottomSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoiceChatBottomSheetViewModel$updateConfirmationViewState$1$1(VoiceChatBottomSheetViewModel voiceChatBottomSheetViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = voiceChatBottomSheetViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new VoiceChatBottomSheetViewModel$updateConfirmationViewState$1$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new VoiceChatBottomSheetViewModel$updateConfirmationViewState$1$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0012  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.0AO r3 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r7.label
            r2 = 1
            if (r0 == 0) goto L_0x003b
            if (r0 != r2) goto L_0x0053
            int r6 = r7.I$0
            X.AnonymousClass0AN.A00(r8)
        L_0x000e:
            int r6 = r6 + -1
        L_0x0010:
            if (r6 <= 0) goto L_0x004b
            com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel r5 = r7.this$0
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r1 = 0
            java.lang.Integer r0 = X.C90524aI.A0a(r6)
            r4[r1] = r0
            r1 = 2131755062(0x7f100036, float:1.9140993E38)
            X.2fu r0 = new X.2fu
            r0.<init>(r4, r1, r6)
            r5.A03 = r0
            X.00s r1 = r5.A08
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            r1.A0C(r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            r7.I$0 = r6
            r7.label = r2
            java.lang.Object r0 = X.C07330Xf.A00(r7, r0)
            if (r0 != r3) goto L_0x000e
            return r3
        L_0x003b:
            X.AnonymousClass0AN.A00(r8)
            com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel r0 = r7.this$0
            X.0yC r1 = r0.A0K
            r0 = 6083(0x17c3, float:8.524E-42)
            int r0 = r1.A07(r0)
            int r6 = r0 / 1000
            goto L_0x0010
        L_0x004b:
            com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel r1 = r7.this$0
            r0 = 0
            r1.A03 = r0
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0053:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel$updateConfirmationViewState$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
