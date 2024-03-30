package com.whatsapp.events;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import X.C132636Up;
import X.C36361kB;
import X.C40071us;
import X.C51232nU;
import android.os.Handler;
import android.os.Message;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventCreateOrEditViewModel$createCallLink$3", f = "EventCreateOrEditViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class EventCreateOrEditViewModel$createCallLink$3 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C51232nU $callLinkType;
    public int label;
    public final /* synthetic */ C40071us this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventCreateOrEditViewModel$createCallLink$3(C51232nU r2, C40071us r3, C023509x r4) {
        super(2, r4);
        this.this$0 = r3;
        this.$callLinkType = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new EventCreateOrEditViewModel$createCallLink$3(this.$callLinkType, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            this.this$0.A02.A01.A00(new C132636Up(Message.obtain((Handler) null, 0, C36361kB.A1a(this.$callLinkType, C51232nU.WA_VIDEO_CALL) ? 1 : 0, 0), "create_call_link"));
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EventCreateOrEditViewModel$createCallLink$3) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
