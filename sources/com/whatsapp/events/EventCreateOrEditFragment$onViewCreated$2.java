package com.whatsapp.events;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass01N;
import X.AnonymousClass01P;
import X.AnonymousClass05H;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass3LK;
import X.AnonymousClass4N8;
import X.AnonymousClass4Z9;
import X.C009003v;
import X.C023509x;
import X.C07430Xq;
import X.C36331k8;
import X.C40071us;
import android.os.Bundle;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventCreateOrEditFragment$onViewCreated$2", f = "EventCreateOrEditFragment.kt", i = {}, l = {219}, m = "invokeSuspend", n = {}, s = {})
public final class EventCreateOrEditFragment$onViewCreated$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ Bundle $savedInstanceState;
    public int label;
    public final /* synthetic */ EventCreateOrEditFragment this$0;

    @DebugMetadata(c = "com.whatsapp.events.EventCreateOrEditFragment$onViewCreated$2$1", f = "EventCreateOrEditFragment.kt", i = {}, l = {222}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.events.EventCreateOrEditFragment$onViewCreated$2$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r5) {
            return new AnonymousClass1(bundle, eventCreateOrEditFragment, r5);
        }

        public final Object invokeSuspend(Object obj) {
            AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AnonymousClass0AN.A00(obj);
                EventCreateOrEditFragment eventCreateOrEditFragment = eventCreateOrEditFragment;
                C40071us r0 = eventCreateOrEditFragment.A0H;
                if (r0 == null) {
                    throw C36331k8.A0d("eventCreateOrEditViewModel");
                }
                AnonymousClass05H A00 = C07430Xq.A00(AnonymousClass4N8.A00, C07430Xq.A01, r0.A0G);
                AnonymousClass4Z9 r02 = new AnonymousClass4Z9(bundle, eventCreateOrEditFragment, 8);
                this.label = 1;
                if (A00.B36(this, r02) == r6) {
                    return r6;
                }
            } else if (i == 1) {
                AnonymousClass0AN.A00(obj);
            } else {
                throw AnonymousClass000.A0e();
            }
            return AnonymousClass0AJ.A00;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventCreateOrEditFragment$onViewCreated$2(Bundle bundle, EventCreateOrEditFragment eventCreateOrEditFragment, C023509x r4) {
        super(2, r4);
        this.this$0 = eventCreateOrEditFragment;
        this.$savedInstanceState = bundle;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new EventCreateOrEditFragment$onViewCreated$2(this.$savedInstanceState, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r7 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass01N r5 = this.this$0.A0P;
            AnonymousClass00C.A08(r5);
            AnonymousClass01P r4 = AnonymousClass01P.CREATED;
            final EventCreateOrEditFragment eventCreateOrEditFragment = this.this$0;
            final Bundle bundle = this.$savedInstanceState;
            AnonymousClass1 r0 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (AnonymousClass3LK.A00(r4, r5, this, r0) == r7) {
                return r7;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EventCreateOrEditFragment$onViewCreated$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
