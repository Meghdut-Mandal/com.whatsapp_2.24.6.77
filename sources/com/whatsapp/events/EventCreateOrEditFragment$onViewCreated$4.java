package com.whatsapp.events;

import X.AnonymousClass000;
import X.AnonymousClass01P;
import X.AnonymousClass040;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass31V;
import X.AnonymousClass3LK;
import X.C009003v;
import X.C023509x;
import X.C36331k8;
import X.C40071us;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.events.EventCreateOrEditFragment$onViewCreated$4", f = "EventCreateOrEditFragment.kt", i = {}, l = {239}, m = "invokeSuspend", n = {}, s = {})
public final class EventCreateOrEditFragment$onViewCreated$4 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ EventCreateOrEditFragment this$0;

    @DebugMetadata(c = "com.whatsapp.events.EventCreateOrEditFragment$onViewCreated$4$1", f = "EventCreateOrEditFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.events.EventCreateOrEditFragment$onViewCreated$4$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public /* synthetic */ Object L$0;
        public int label;

        public final C023509x create(Object obj, C023509x r4) {
            AnonymousClass1 r0 = new AnonymousClass1(r4);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                AnonymousClass0AN.A00(obj);
                AnonymousClass040 r5 = (AnonymousClass040) this.L$0;
                final EventCreateOrEditFragment eventCreateOrEditFragment = EventCreateOrEditFragment.this;
                C40071us r0 = eventCreateOrEditFragment.A0H;
                if (r0 == null) {
                    throw C36331k8.A0d("eventCreateOrEditViewModel");
                }
                AnonymousClass31V r02 = r0.A05;
                AnonymousClass1 r2 = new C009003v((C023509x) null) {
                    public /* synthetic */ Object L$0;
                    public int label;

                    public final C023509x create(Object obj, C023509x r4) {
                        AnonymousClass1 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public EventCreateOrEditFragment$onViewCreated$4(EventCreateOrEditFragment eventCreateOrEditFragment, C023509x r3) {
                            super(2, r3);
                            this.this$0 = eventCreateOrEditFragment;
                        }

                        public final C023509x create(Object obj, C023509x r4) {
                            return new EventCreateOrEditFragment$onViewCreated$4(this.this$0, r4);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            return new EventCreateOrEditFragment$onViewCreated$4(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
                        }

                        public final Object invokeSuspend(Object obj) {
                            AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
                            int i = this.label;
                            if (i == 0) {
                                AnonymousClass0AN.A00(obj);
                                final EventCreateOrEditFragment eventCreateOrEditFragment = this.this$0;
                                AnonymousClass01P r2 = AnonymousClass01P.STARTED;
                                AnonymousClass1 r0 = new AnonymousClass1((C023509x) null);
                                this.label = 1;
                                if (AnonymousClass3LK.A01(r2, eventCreateOrEditFragment, this, r0) == r5) {
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
