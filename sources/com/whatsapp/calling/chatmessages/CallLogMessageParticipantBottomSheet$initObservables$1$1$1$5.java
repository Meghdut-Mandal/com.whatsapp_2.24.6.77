package com.whatsapp.calling.chatmessages;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheet$initObservables$1$1$1$5", f = "CallLogMessageParticipantBottomSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallLogMessageParticipantBottomSheet$initObservables$1$1$1$5 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ CallLogMessageParticipantBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallLogMessageParticipantBottomSheet$initObservables$1$1$1$5(CallLogMessageParticipantBottomSheet callLogMessageParticipantBottomSheet, C023509x r3) {
        super(2, r3);
        this.this$0 = callLogMessageParticipantBottomSheet;
    }

    public final C023509x create(Object obj, C023509x r4) {
        CallLogMessageParticipantBottomSheet$initObservables$1$1$1$5 callLogMessageParticipantBottomSheet$initObservables$1$1$1$5 = new CallLogMessageParticipantBottomSheet$initObservables$1$1$1$5(this.this$0, r4);
        callLogMessageParticipantBottomSheet$initObservables$1$1$1$5.L$0 = obj;
        return callLogMessageParticipantBottomSheet$initObservables$1$1$1$5;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            if (this.L$0 != null) {
                this.this$0.A1c();
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CallLogMessageParticipantBottomSheet$initObservables$1$1$1$5) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}