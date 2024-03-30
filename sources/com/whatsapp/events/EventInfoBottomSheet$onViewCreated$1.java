package com.whatsapp.events;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass01N;
import X.AnonymousClass01P;
import X.AnonymousClass05H;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass3LK;
import X.AnonymousClass4N9;
import X.AnonymousClass4Z8;
import X.C009003v;
import X.C023509x;
import X.C07430Xq;
import X.C36331k8;
import X.C40091uu;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventInfoBottomSheet$onViewCreated$1", f = "EventInfoBottomSheet.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
public final class EventInfoBottomSheet$onViewCreated$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ EventInfoBottomSheet this$0;

    @DebugMetadata(c = "com.whatsapp.events.EventInfoBottomSheet$onViewCreated$1$1", f = "EventInfoBottomSheet.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.events.EventInfoBottomSheet$onViewCreated$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
        }

        public final Object invokeSuspend(Object obj) {
            AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AnonymousClass0AN.A00(obj);
                EventInfoBottomSheet eventInfoBottomSheet = EventInfoBottomSheet.this;
                C40091uu r0 = eventInfoBottomSheet.A04;
                if (r0 == null) {
                    throw C36331k8.A0d("eventInfoViewModel");
                }
                AnonymousClass05H A00 = C07430Xq.A00(AnonymousClass4N9.A00, C07430Xq.A01, r0.A0B);
                AnonymousClass4Z8 r02 = new AnonymousClass4Z8(eventInfoBottomSheet, 16);
                this.label = 1;
                if (A00.B36(this, r02) == r5) {
                    return r5;
                }
            } else if (i == 1) {
                AnonymousClass0AN.A00(obj);
            } else {
                throw AnonymousClass000.A0e();
            }
            return AnonymousClass0AJ.A00;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventInfoBottomSheet$onViewCreated$1(EventInfoBottomSheet eventInfoBottomSheet, C023509x r3) {
        super(2, r3);
        this.this$0 = eventInfoBottomSheet;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new EventInfoBottomSheet$onViewCreated$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new EventInfoBottomSheet$onViewCreated$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass01N r4 = this.this$0.A0P;
            AnonymousClass00C.A08(r4);
            AnonymousClass01P r3 = AnonymousClass01P.CREATED;
            final EventInfoBottomSheet eventInfoBottomSheet = this.this$0;
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
