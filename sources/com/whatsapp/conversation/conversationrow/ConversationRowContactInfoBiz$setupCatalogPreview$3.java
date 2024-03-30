package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass01P;
import X.AnonymousClass05K;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass155;
import X.AnonymousClass3LK;
import X.AnonymousClass4Z9;
import X.AnonymousClass8Z7;
import X.C009003v;
import X.C023509x;
import X.C13170jR;
import X.C39791tm;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.ConversationRowContactInfoBiz$setupCatalogPreview$3", f = "ConversationRowContactInfoBiz.kt", i = {}, l = {231}, m = "invokeSuspend", n = {}, s = {})
public final class ConversationRowContactInfoBiz$setupCatalogPreview$3 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C39791tm $catalogPreviewViewModel;
    public int label;
    public final /* synthetic */ AnonymousClass8Z7 this$0;

    @DebugMetadata(c = "com.whatsapp.conversation.conversationrow.ConversationRowContactInfoBiz$setupCatalogPreview$3$1", f = "ConversationRowContactInfoBiz.kt", i = {}, l = {232}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.conversation.conversationrow.ConversationRowContactInfoBiz$setupCatalogPreview$3$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r5) {
            return new AnonymousClass1(r5, r2, r5);
        }

        public final Object invokeSuspend(Object obj) {
            AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AnonymousClass0AN.A00(obj);
                C39791tm r4 = r2;
                AnonymousClass05K r3 = r4.A07;
                AnonymousClass4Z9 r0 = new AnonymousClass4Z9(r4, r5, 6);
                this.label = 1;
                if (r3.B36(this, r0) == r6) {
                    return r6;
                }
            } else if (i != 1) {
                throw AnonymousClass000.A0e();
            } else {
                AnonymousClass0AN.A00(obj);
            }
            throw new C13170jR();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowContactInfoBiz$setupCatalogPreview$3(AnonymousClass8Z7 r2, C39791tm r3, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$catalogPreviewViewModel = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new ConversationRowContactInfoBiz$setupCatalogPreview$3(this.this$0, this.$catalogPreviewViewModel, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r7 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final AnonymousClass8Z7 r5 = this.this$0;
            AnonymousClass155 r4 = r5.A0A;
            AnonymousClass01P r3 = AnonymousClass01P.STARTED;
            final C39791tm r2 = this.$catalogPreviewViewModel;
            AnonymousClass1 r0 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (AnonymousClass3LK.A01(r3, r4, this, r0) == r7) {
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
        return ((ConversationRowContactInfoBiz$setupCatalogPreview$3) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
