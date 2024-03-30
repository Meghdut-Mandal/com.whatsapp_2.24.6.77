package com.whatsapp.product.newsletterenforcements.enforcedmessages;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass141;
import X.C009003v;
import X.C023509x;
import X.C28981Uw;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesViewModel$fetchContact$2", f = "EnforcedMessagesViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class EnforcedMessagesViewModel$fetchContact$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C28981Uw $newsletterJid;
    public int label;
    public final /* synthetic */ EnforcedMessagesViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnforcedMessagesViewModel$fetchContact$2(C28981Uw r2, EnforcedMessagesViewModel enforcedMessagesViewModel, C023509x r4) {
        super(2, r4);
        this.this$0 = enforcedMessagesViewModel;
        this.$newsletterJid = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new EnforcedMessagesViewModel$fetchContact$2(this.$newsletterJid, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass141 A08 = this.this$0.A02.A08(this.$newsletterJid);
            if (A08 == null) {
                return null;
            }
            this.this$0.A01.A0C(A08);
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EnforcedMessagesViewModel$fetchContact$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
