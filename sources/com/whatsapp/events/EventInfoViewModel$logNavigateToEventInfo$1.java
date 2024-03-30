package com.whatsapp.events;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import X.C40091uu;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventInfoViewModel$logNavigateToEventInfo$1", f = "EventInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class EventInfoViewModel$logNavigateToEventInfo$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ C40091uu this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventInfoViewModel$logNavigateToEventInfo$1(C40091uu r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new EventInfoViewModel$logNavigateToEventInfo$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new EventInfoViewModel$logNavigateToEventInfo$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            C40091uu r0 = this.this$0;
            r0.A08.A02(C40091uu.A01(r0).A00, 56);
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }
}
