package com.whatsapp.product.newsletterenforcements.alerts;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass1ZM;
import X.C009003v;
import X.C023509x;
import X.C39771tc;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsViewModel$hideChannelAlertsBanner$2", f = "NewsletterAlertsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterAlertsViewModel$hideChannelAlertsBanner$2 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ C39771tc this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterAlertsViewModel$hideChannelAlertsBanner$2(C39771tc r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new NewsletterAlertsViewModel$hideChannelAlertsBanner$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new NewsletterAlertsViewModel$hideChannelAlertsBanner$2(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            C39771tc r1 = this.this$0;
            AnonymousClass1ZM r0 = r1.A06;
            r0.A00.A08(r1.A03, 0);
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }
}
