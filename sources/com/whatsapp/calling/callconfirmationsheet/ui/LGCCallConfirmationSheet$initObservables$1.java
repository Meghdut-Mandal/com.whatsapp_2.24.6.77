package com.whatsapp.calling.callconfirmationsheet.ui;

import X.AnonymousClass000;
import X.AnonymousClass01P;
import X.AnonymousClass040;
import X.AnonymousClass05H;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass3LK;
import X.C009003v;
import X.C023509x;
import X.C02380Ab;
import X.C36361kB;
import com.whatsapp.calling.callconfirmationsheet.vm.LGCCallConfirmationSheetViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callconfirmationsheet.ui.LGCCallConfirmationSheet$initObservables$1", f = "LGCCallConfirmationSheet.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
public final class LGCCallConfirmationSheet$initObservables$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ LGCCallConfirmationSheet this$0;

    @DebugMetadata(c = "com.whatsapp.calling.callconfirmationsheet.ui.LGCCallConfirmationSheet$initObservables$1$1", f = "LGCCallConfirmationSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.calling.callconfirmationsheet.ui.LGCCallConfirmationSheet$initObservables$1$1  reason: invalid class name */
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
                AnonymousClass040 r4 = (AnonymousClass040) this.L$0;
                AnonymousClass05H r2 = ((LGCCallConfirmationSheetViewModel) LGCCallConfirmationSheet.this.A01.getValue()).A0B;
                final LGCCallConfirmationSheet lGCCallConfirmationSheet = LGCCallConfirmationSheet.this;
                C36361kB.A1T(new C009003v((C023509x) null) {
                    public /* synthetic */ Object L$0;
                    public int label;

                    public final C023509x create(Object obj, C023509x r4) {
                        AnonymousClass1 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public LGCCallConfirmationSheet$initObservables$1(LGCCallConfirmationSheet lGCCallConfirmationSheet, C023509x r3) {
                            super(2, r3);
                            this.this$0 = lGCCallConfirmationSheet;
                        }

                        public final C023509x create(Object obj, C023509x r4) {
                            return new LGCCallConfirmationSheet$initObservables$1(this.this$0, r4);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            return new LGCCallConfirmationSheet$initObservables$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
                        }

                        public final Object invokeSuspend(Object obj) {
                            AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
                            int i = this.label;
                            if (i == 0) {
                                AnonymousClass0AN.A00(obj);
                                final LGCCallConfirmationSheet lGCCallConfirmationSheet = this.this$0;
                                C02380Ab A0m = lGCCallConfirmationSheet.A0m();
                                AnonymousClass01P r2 = AnonymousClass01P.STARTED;
                                AnonymousClass1 r0 = new AnonymousClass1((C023509x) null);
                                this.label = 1;
                                if (AnonymousClass3LK.A01(r2, A0m, this, r0) == r6) {
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
