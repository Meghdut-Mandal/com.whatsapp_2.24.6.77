package com.whatsapp.events;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass2bT;
import X.C009003v;
import X.C023509x;
import X.C29701Xq;
import X.C36331k8;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventInfoFragment$cancelEventNotification$1", f = "EventInfoFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class EventInfoFragment$cancelEventNotification$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass2bT $message;
    public int label;
    public final /* synthetic */ EventInfoFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventInfoFragment$cancelEventNotification$1(AnonymousClass2bT r2, EventInfoFragment eventInfoFragment, C023509x r4) {
        super(2, r4);
        this.this$0 = eventInfoFragment;
        this.$message = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new EventInfoFragment$cancelEventNotification$1(this.$message, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            C29701Xq r2 = this.this$0.A06;
            if (r2 != null) {
                AnonymousClass2bT r1 = this.$message;
                AnonymousClass00C.A0D(r1, 0);
                r2.A05.A04(85, C29701Xq.A00(r1), "EventNotificationHelper");
                return AnonymousClass0AJ.A00;
            }
            throw C36331k8.A0d("eventEditNotificationManager");
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EventInfoFragment$cancelEventNotification$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
