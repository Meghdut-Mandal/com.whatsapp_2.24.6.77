package com.whatsapp.calling.chatmessages;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass141;
import X.AnonymousClass3UL;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import X.C107265Nh;
import android.content.Context;
import com.whatsapp.jid.GroupJid;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1", f = "CallLogMessageParticipantBottomSheetViewModel.kt", i = {}, l = {170}, m = "invokeSuspend", n = {}, s = {})
public final class CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C107265Nh $callLog;
    public final /* synthetic */ Context $context;
    public int label;
    public final /* synthetic */ CallLogMessageParticipantBottomSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1(Context context, CallLogMessageParticipantBottomSheetViewModel callLogMessageParticipantBottomSheetViewModel, C107265Nh r4, C023509x r5) {
        super(2, r5);
        this.$callLog = r4;
        this.this$0 = callLogMessageParticipantBottomSheetViewModel;
        this.$context = context;
    }

    public final C023509x create(Object obj, C023509x r6) {
        C107265Nh r3 = this.$callLog;
        return new CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1(this.$context, this.this$0, r3, r6);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            boolean A1S = AnonymousClass000.A1S(this.$callLog.A08, 2);
            GroupJid groupJid = this.$callLog.A0D;
            CallLogMessageParticipantBottomSheetViewModel callLogMessageParticipantBottomSheetViewModel = this.this$0;
            AnonymousClass141 A01 = AnonymousClass3UL.A01(callLogMessageParticipantBottomSheetViewModel.A09, callLogMessageParticipantBottomSheetViewModel.A0G, groupJid, callLogMessageParticipantBottomSheetViewModel.A0H, A1S);
            if (A01 != null) {
                CallLogMessageParticipantBottomSheetViewModel callLogMessageParticipantBottomSheetViewModel2 = this.this$0;
                Context context = this.$context;
                C107265Nh r9 = this.$callLog;
                List A04 = AnonymousClass3UL.A04(callLogMessageParticipantBottomSheetViewModel2.A05, callLogMessageParticipantBottomSheetViewModel2.A09, callLogMessageParticipantBottomSheetViewModel2.A0E, A01);
                AnonymousClass00C.A08(A04);
                C005502l r0 = callLogMessageParticipantBottomSheetViewModel2.A0K;
                CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1$1$1 callLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1$1$1 = new CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1$1$1(context, callLogMessageParticipantBottomSheetViewModel2, A01, r9, A04, (C023509x) null);
                this.label = 1;
                if (AnonymousClass0A2.A00(this, r0, callLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1$1$1) == r3) {
                    return r3;
                }
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CallLogMessageParticipantBottomSheetViewModel$clickCallButton$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
