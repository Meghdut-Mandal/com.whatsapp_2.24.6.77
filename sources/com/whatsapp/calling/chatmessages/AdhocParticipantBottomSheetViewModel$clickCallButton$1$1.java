package com.whatsapp.calling.chatmessages;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.C009003v;
import X.C023509x;
import X.C107265Nh;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheetViewModel$clickCallButton$1$1", f = "AdhocParticipantBottomSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AdhocParticipantBottomSheetViewModel$clickCallButton$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C107265Nh $callLog;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ boolean $launchVideo;
    public int label;
    public final /* synthetic */ AdhocParticipantBottomSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdhocParticipantBottomSheetViewModel$clickCallButton$1$1(Context context, AdhocParticipantBottomSheetViewModel adhocParticipantBottomSheetViewModel, C107265Nh r4, C023509x r5, boolean z) {
        super(2, r5);
        this.this$0 = adhocParticipantBottomSheetViewModel;
        this.$context = context;
        this.$callLog = r4;
        this.$launchVideo = z;
    }

    public final C023509x create(Object obj, C023509x r8) {
        return new AdhocParticipantBottomSheetViewModel$clickCallButton$1$1(this.$context, this.this$0, this.$callLog, r8, this.$launchVideo);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007f, code lost:
        if (r1.A07 != 7) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.label
            if (r0 != 0) goto L_0x0084
            X.AnonymousClass0AN.A00(r7)
            com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheetViewModel r0 = r6.this$0
            X.05L r0 = r0.A0H
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.Iterator r2 = r0.iterator()
        L_0x0019:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002e
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.3JW r0 = (X.AnonymousClass3JW) r0
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0019
            r3.add(r1)
            goto L_0x0019
        L_0x002e:
            java.util.ArrayList r5 = X.C36321k7.A0J(r3)
            java.util.Iterator r1 = r3.iterator()
        L_0x0036:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0048
            java.lang.Object r0 = r1.next()
            X.3JW r0 = (X.AnonymousClass3JW) r0
            X.141 r0 = r0.A02
            r5.add(r0)
            goto L_0x0036
        L_0x0048:
            boolean r0 = X.C36401kF.A1a(r5)
            if (r0 == 0) goto L_0x0061
            com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheetViewModel r0 = r6.this$0
            X.1ND r4 = r0.A05
            android.content.Context r3 = r6.$context
            X.5Nh r1 = r6.$callLog
            boolean r0 = r0.A0I
            if (r0 == 0) goto L_0x006b
            r2 = 21
        L_0x005c:
            boolean r0 = r6.$launchVideo
            r4.Bub(r3, r5, r2, r0)
        L_0x0061:
            com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheetViewModel r0 = r6.this$0
            X.05L r1 = r0.A0D
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            r1.setValue(r0)
            return r0
        L_0x006b:
            boolean r0 = r1.A0N()
            if (r0 == 0) goto L_0x0074
            r2 = 45
            goto L_0x005c
        L_0x0074:
            X.6by r0 = r1.A04
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x0081
            int r1 = r1.A07
            r0 = 7
            r2 = 47
            if (r1 == r0) goto L_0x005c
        L_0x0081:
            r2 = 46
            goto L_0x005c
        L_0x0084:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheetViewModel$clickCallButton$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AdhocParticipantBottomSheetViewModel$clickCallButton$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
