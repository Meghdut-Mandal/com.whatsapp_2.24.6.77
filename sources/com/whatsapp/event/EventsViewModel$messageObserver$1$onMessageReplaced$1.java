package com.whatsapp.event;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass3T1;
import X.C009003v;
import X.C023509x;
import X.C39911uC;
import X.C90394a5;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.event.EventsViewModel$messageObserver$1$onMessageReplaced$1", f = "EventsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class EventsViewModel$messageObserver$1$onMessageReplaced$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass3T1 $newMessage;
    public int label;
    public final /* synthetic */ C90394a5 this$0;
    public final /* synthetic */ C39911uC this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventsViewModel$messageObserver$1$onMessageReplaced$1(C90394a5 r2, C39911uC r3, AnonymousClass3T1 r4, C023509x r5) {
        super(2, r5);
        this.this$0 = r2;
        this.$newMessage = r4;
        this.this$1 = r3;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new EventsViewModel$messageObserver$1$onMessageReplaced$1(this.this$0, this.this$1, this.$newMessage, r6);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            if (C90394a5.A03(this.this$0, this.$newMessage)) {
                C39911uC.A01(this.this$1);
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EventsViewModel$messageObserver$1$onMessageReplaced$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
