package com.whatsapp.calling.chatmessages;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import android.widget.TextView;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheet$initObservables$1$1$1$3", f = "CallLogMessageParticipantBottomSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallLogMessageParticipantBottomSheet$initObservables$1$1$1$3 extends AnonymousClass0A1 implements C009003v {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ CallLogMessageParticipantBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallLogMessageParticipantBottomSheet$initObservables$1$1$1$3(CallLogMessageParticipantBottomSheet callLogMessageParticipantBottomSheet, C023509x r3) {
        super(2, r3);
        this.this$0 = callLogMessageParticipantBottomSheet;
    }

    public final C023509x create(Object obj, C023509x r4) {
        CallLogMessageParticipantBottomSheet$initObservables$1$1$1$3 callLogMessageParticipantBottomSheet$initObservables$1$1$1$3 = new CallLogMessageParticipantBottomSheet$initObservables$1$1$1$3(this.this$0, r4);
        callLogMessageParticipantBottomSheet$initObservables$1$1$1$3.L$0 = obj;
        return callLogMessageParticipantBottomSheet$initObservables$1$1$1$3;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            Number number = (Number) this.L$0;
            if (number != null) {
                CallLogMessageParticipantBottomSheet callLogMessageParticipantBottomSheet = this.this$0;
                int intValue = number.intValue();
                TextView textView = callLogMessageParticipantBottomSheet.A00;
                if (textView != null) {
                    textView.setText(intValue);
                }
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CallLogMessageParticipantBottomSheet$initObservables$1$1$1$3) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
