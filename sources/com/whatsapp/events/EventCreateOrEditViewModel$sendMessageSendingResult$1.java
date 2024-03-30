package com.whatsapp.events;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass19R;
import X.AnonymousClass31V;
import X.AnonymousClass3IN;
import X.C005602m;
import X.C009003v;
import X.C023509x;
import X.C36401kF;
import X.C40071us;
import com.whatsapp.coroutine.sideeffect.MainThreadSingleSideEffect$send$2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventCreateOrEditViewModel$sendMessageSendingResult$1", f = "EventCreateOrEditViewModel.kt", i = {}, l = {288}, m = "invokeSuspend", n = {}, s = {})
public final class EventCreateOrEditViewModel$sendMessageSendingResult$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass3IN $sendMessageState;
    public int label;
    public final /* synthetic */ C40071us this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventCreateOrEditViewModel$sendMessageSendingResult$1(AnonymousClass3IN r2, C40071us r3, C023509x r4) {
        super(2, r4);
        this.this$0 = r3;
        this.$sendMessageState = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new EventCreateOrEditViewModel$sendMessageSendingResult$1(this.$sendMessageState, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass31V r4 = this.this$0.A04;
            AnonymousClass3IN r3 = this.$sendMessageState;
            this.label = 1;
            C005602m r0 = AnonymousClass19R.A00;
            if (AnonymousClass0A2.A00(this, C36401kF.A0y(), new MainThreadSingleSideEffect$send$2(r4, r3, (C023509x) null)) == r5) {
                return r5;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EventCreateOrEditViewModel$sendMessageSendingResult$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
