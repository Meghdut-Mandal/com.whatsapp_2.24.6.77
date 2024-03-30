package com.whatsapp.events;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass01N;
import X.AnonymousClass01P;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass1N6;
import X.AnonymousClass3LK;
import X.C009003v;
import X.C023509x;
import X.C36331k8;
import X.C36421kH;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventCreationActivity$onCreate$1", f = "EventCreationActivity.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
public final class EventCreationActivity$onCreate$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ EventCreationActivity this$0;

    @DebugMetadata(c = "com.whatsapp.events.EventCreationActivity$onCreate$1$1", f = "EventCreationActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.events.EventCreationActivity$onCreate$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                AnonymousClass0AN.A00(obj);
                EventCreationActivity eventCreationActivity = EventCreationActivity.this;
                AnonymousClass1N6 r2 = eventCreationActivity.A00;
                if (r2 != null) {
                    r2.A02(C36421kH.A0O(eventCreationActivity.A05), 55);
                    return AnonymousClass0AJ.A00;
                }
                throw C36331k8.A0d("navigationTimeSpentManager");
            }
            throw AnonymousClass000.A0e();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventCreationActivity$onCreate$1(EventCreationActivity eventCreationActivity, C023509x r3) {
        super(2, r3);
        this.this$0 = eventCreationActivity;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new EventCreationActivity$onCreate$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new EventCreationActivity$onCreate$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass01N r4 = this.this$0.A06;
            AnonymousClass00C.A08(r4);
            AnonymousClass01P r3 = AnonymousClass01P.CREATED;
            final EventCreationActivity eventCreationActivity = this.this$0;
            AnonymousClass1 r0 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (AnonymousClass3LK.A00(r3, r4, this, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }
}
