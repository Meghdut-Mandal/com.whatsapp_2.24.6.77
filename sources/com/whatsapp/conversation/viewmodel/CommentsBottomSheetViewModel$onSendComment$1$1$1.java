package com.whatsapp.conversation.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass1X4;
import X.AnonymousClass2bB;
import X.AnonymousClass3BG;
import X.AnonymousClass3JL;
import X.AnonymousClass3L1;
import X.AnonymousClass3T1;
import X.AnonymousClass3XT;
import X.AnonymousClass4UX;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import X.C145166tS;
import X.C195759Vv;
import X.C36371kC;
import X.C40001uV;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.viewmodel.CommentsBottomSheetViewModel$onSendComment$1$1$1", f = "CommentsBottomSheetViewModel.kt", i = {}, l = {237}, m = "invokeSuspend", n = {}, s = {})
public final class CommentsBottomSheetViewModel$onSendComment$1$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass3T1 $parentMessage;
    public final /* synthetic */ String $sanitizedText;
    public int label;
    public final /* synthetic */ C40001uV this$0;

    @DebugMetadata(c = "com.whatsapp.conversation.viewmodel.CommentsBottomSheetViewModel$onSendComment$1$1$1$1", f = "CommentsBottomSheetViewModel.kt", i = {}, l = {257}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.conversation.viewmodel.CommentsBottomSheetViewModel$onSendComment$1$1$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r6) {
            return new AnonymousClass1(r2, str, r6);
        }

        public final Object invokeSuspend(Object obj) {
            AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AnonymousClass0AN.A00(obj);
                C40001uV r0 = C40001uV.this;
                AnonymousClass1X4 r8 = r0.A05;
                List A11 = C36371kC.A11(r0.A0B);
                String str = str;
                Integer num = new Integer(EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING);
                AnonymousClass3T1 r7 = r2;
                AnonymousClass00C.A0D(r7, 0);
                Integer num2 = num;
                r8.A0D((C145166tS) null, (AnonymousClass3XT) null, (AnonymousClass3JL) null, new AnonymousClass2bB(new C195759Vv(r7.A0L(), r7.A1J), r7.A1N), (AnonymousClass3BG) null, (AnonymousClass3T1) null, (AnonymousClass3L1) null, (AnonymousClass4UX) null, num2, str, A11, (List) null, false, false, false);
                final C40001uV r02 = C40001uV.this;
                C005502l r2 = r02.A0H;
                AnonymousClass1 r1 = new C009003v((C023509x) null) {
                    public int label;

                    public final C023509x create(Object obj, C023509x r4) {
                        return 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public CommentsBottomSheetViewModel$onSendComment$1$1$1(C40001uV r2, AnonymousClass3T1 r3, String str, C023509x r5) {
                            super(2, r5);
                            this.this$0 = r2;
                            this.$sanitizedText = str;
                            this.$parentMessage = r3;
                        }

                        public final C023509x create(Object obj, C023509x r6) {
                            return new CommentsBottomSheetViewModel$onSendComment$1$1$1(this.this$0, this.$parentMessage, this.$sanitizedText, r6);
                        }

                        public final Object invokeSuspend(Object obj) {
                            AnonymousClass0AO r7 = AnonymousClass0AO.COROUTINE_SUSPENDED;
                            int i = this.label;
                            if (i == 0) {
                                AnonymousClass0AN.A00(obj);
                                final C40001uV r5 = this.this$0;
                                C005502l r4 = r5.A0G;
                                final String str = this.$sanitizedText;
                                final AnonymousClass3T1 r2 = this.$parentMessage;
                                AnonymousClass1 r0 = new AnonymousClass1((C023509x) null);
                                this.label = 1;
                                if (AnonymousClass0A2.A00(this, r4, r0) == r7) {
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
                            return ((CommentsBottomSheetViewModel$onSendComment$1$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
                        }
                    }
