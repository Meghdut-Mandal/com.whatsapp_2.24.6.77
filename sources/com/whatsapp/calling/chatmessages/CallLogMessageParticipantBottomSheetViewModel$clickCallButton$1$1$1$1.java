package com.whatsapp.calling.chatmessages;

import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass141;
import X.C009003v;
import X.C023509x;
import X.C107265Nh;
import android.content.Context;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1$1$1", f = "CallLogMessageParticipantBottomSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C107265Nh $callLog;
    public final /* synthetic */ List $contactList;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AnonymousClass141 $it;
    public int label;
    public final /* synthetic */ CallLogMessageParticipantBottomSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1$1$1(Context context, CallLogMessageParticipantBottomSheetViewModel callLogMessageParticipantBottomSheetViewModel, AnonymousClass141 r4, C107265Nh r5, List list, C023509x r7) {
        super(2, r7);
        this.this$0 = callLogMessageParticipantBottomSheetViewModel;
        this.$contactList = list;
        this.$context = context;
        this.$callLog = r5;
        this.$it = r4;
    }

    public final C023509x create(Object obj, C023509x r9) {
        CallLogMessageParticipantBottomSheetViewModel callLogMessageParticipantBottomSheetViewModel = this.this$0;
        List list = this.$contactList;
        return new CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1$1$1(this.$context, callLogMessageParticipantBottomSheetViewModel, this.$it, this.$callLog, list, r9);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        if (r1.A07 != 7) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0070, code lost:
        if (r1.A07 != 7) goto L_0x0072;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.label
            if (r0 != 0) goto L_0x0075
            X.AnonymousClass0AN.A00(r11)
            com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel r1 = r10.this$0
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x0047
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x0047
            X.1ND r2 = r1.A06
            java.util.List r5 = r10.$contactList
            android.content.Context r3 = r10.$context
            X.5Nh r1 = r10.$callLog
            boolean r0 = r1.A0N()
            if (r0 == 0) goto L_0x0037
            r6 = 45
        L_0x0021:
            X.5Nh r0 = r10.$callLog
            com.whatsapp.jid.GroupJid r4 = r0.A0D
            r8 = 1
            X.1NE r2 = (X.AnonymousClass1NE) r2
            r7 = 0
            r9 = 0
            r2.BPc(r3, r4, r5, r6, r7, r8, r9)
        L_0x002d:
            com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel r0 = r10.this$0
            X.05L r1 = r0.A0M
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            r1.setValue(r0)
            return r0
        L_0x0037:
            X.6by r0 = r1.A04
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x0044
            int r1 = r1.A07
            r0 = 7
            r6 = 47
            if (r1 == r0) goto L_0x0021
        L_0x0044:
            r6 = 46
            goto L_0x0021
        L_0x0047:
            X.1ND r2 = r1.A06
            java.util.List r5 = r10.$contactList
            android.content.Context r3 = r10.$context
            X.5Nh r1 = r10.$callLog
            boolean r0 = r1.A0N()
            if (r0 == 0) goto L_0x0065
            r6 = 45
        L_0x0057:
            com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel r0 = r10.this$0
            boolean r7 = r0.A03
            X.141 r0 = r10.$it
            com.whatsapp.jid.GroupJid r4 = X.C36421kH.A0P(r0)
            r2.Buc(r3, r4, r5, r6, r7)
            goto L_0x002d
        L_0x0065:
            X.6by r0 = r1.A04
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x0072
            int r1 = r1.A07
            r0 = 7
            r6 = 47
            if (r1 == r0) goto L_0x0057
        L_0x0072:
            r6 = 46
            goto L_0x0057
        L_0x0075:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
