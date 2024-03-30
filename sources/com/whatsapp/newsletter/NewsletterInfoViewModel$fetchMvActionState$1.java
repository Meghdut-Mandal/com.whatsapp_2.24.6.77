package com.whatsapp.newsletter;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass2EJ;
import X.C009003v;
import X.C023509x;
import X.C19460v5;
import X.C51302nb;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletter.NewsletterInfoViewModel$fetchMvActionState$1", f = "NewsletterInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterInfoViewModel$fetchMvActionState$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ AnonymousClass2EJ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterInfoViewModel$fetchMvActionState$1(AnonymousClass2EJ r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new NewsletterInfoViewModel$fetchMvActionState$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new NewsletterInfoViewModel$fetchMvActionState$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass2EJ r2 = this.this$0;
            C19460v5 r1 = r2.A0A;
            if (r1.A05()) {
                r1.A02();
                throw AnonymousClass001.A0A("isMetaVerifiedSubscriptionActive");
            }
            r2.A07.A0C(C51302nb.None);
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }
}
