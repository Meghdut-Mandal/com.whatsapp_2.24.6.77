package com.whatsapp.newsletter;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass2EJ;
import X.C009003v;
import X.C023509x;
import X.C178208fK;
import X.C28981Uw;
import X.C36391kE;
import X.C62133Ex;
import X.C75943o4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletter.NewsletterInfoViewModel$fetchPendingAdmins$1", f = "NewsletterInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterInfoViewModel$fetchPendingAdmins$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C28981Uw $jid;
    public int label;
    public final /* synthetic */ AnonymousClass2EJ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterInfoViewModel$fetchPendingAdmins$1(C28981Uw r2, AnonymousClass2EJ r3, C023509x r4) {
        super(2, r4);
        this.this$0 = r3;
        this.$jid = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new NewsletterInfoViewModel$fetchPendingAdmins$1(this.$jid, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass2EJ r0 = this.this$0;
            C62133Ex r1 = r0.A0I;
            C28981Uw r3 = this.$jid;
            C75943o4 r4 = new C75943o4(r0);
            AnonymousClass00C.A0D(r3, 0);
            if (C36391kE.A1Z(r1.A06)) {
                r1.A05.A01(new C178208fK(r3, r4, false, false, true, false));
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NewsletterInfoViewModel$fetchPendingAdmins$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
