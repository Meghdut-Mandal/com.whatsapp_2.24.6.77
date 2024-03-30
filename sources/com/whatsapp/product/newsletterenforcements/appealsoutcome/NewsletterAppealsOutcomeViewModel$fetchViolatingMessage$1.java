package com.whatsapp.product.newsletterenforcements.appealsoutcome;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass3T1;
import X.C009003v;
import X.C023509x;
import X.C28981Uw;
import X.C39621t1;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.appealsoutcome.NewsletterAppealsOutcomeViewModel$fetchViolatingMessage$1", f = "NewsletterAppealsOutcomeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterAppealsOutcomeViewModel$fetchViolatingMessage$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C28981Uw $newsletterJid;
    public final /* synthetic */ long $serverMsdId;
    public int label;
    public final /* synthetic */ C39621t1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterAppealsOutcomeViewModel$fetchViolatingMessage$1(C28981Uw r2, C39621t1 r3, C023509x r4, long j) {
        super(2, r4);
        this.this$0 = r3;
        this.$newsletterJid = r2;
        this.$serverMsdId = j;
    }

    public final C023509x create(Object obj, C023509x r8) {
        return new NewsletterAppealsOutcomeViewModel$fetchViolatingMessage$1(this.$newsletterJid, this.this$0, r8, this.$serverMsdId);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass3T1 A02 = this.this$0.A04.A02(this.$newsletterJid, this.$serverMsdId);
            if (A02 != null) {
                this.this$0.A01.A0C(A02);
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NewsletterAppealsOutcomeViewModel$fetchViolatingMessage$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
