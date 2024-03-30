package com.whatsapp.product.newsletterenforcements.userreports;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass32d;
import X.C001700s;
import X.C009003v;
import X.C023509x;
import X.C36351kA;
import X.C76293od;
import X.C76383om;
import X.C76393on;
import X.C76403oo;
import X.C82263yQ;
import com.whatsapp.newsletterenforcements.client.NewsletterUserReportsNetworkClient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.newsletterenforcements.userreports.NewsletterUserReportsViewModel$submitAppeal$1", f = "NewsletterUserReportsViewModel.kt", i = {}, l = {145}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterUserReportsViewModel$submitAppeal$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $reason;
    public final /* synthetic */ String $reportId;
    public int label;
    public final /* synthetic */ NewsletterUserReportsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterUserReportsViewModel$submitAppeal$1(NewsletterUserReportsViewModel newsletterUserReportsViewModel, String str, String str2, C023509x r5) {
        super(2, r5);
        this.this$0 = newsletterUserReportsViewModel;
        this.$reportId = str;
        this.$reason = str2;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new NewsletterUserReportsViewModel$submitAppeal$1(this.this$0, this.$reportId, this.$reason, r6);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            this.this$0.A05.A0C(C76393on.A00);
            try {
                NewsletterUserReportsNetworkClient newsletterUserReportsNetworkClient = this.this$0.A03;
                String str = this.$reportId;
                String str2 = this.$reason;
                this.label = 1;
                obj = newsletterUserReportsNetworkClient.A00(str, str2, this);
                if (obj == r4) {
                    return r4;
                }
            } catch (C82263yQ unused) {
                this.this$0.A05.A0C(C76383om.A00);
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        AnonymousClass32d r0 = this.this$0.A04;
        String str3 = this.$reportId;
        C36351kA.A1J(str3, obj, 1);
        r0.A00.put(str3, obj);
        this.this$0.A05.A0C(C76403oo.A00);
        NewsletterUserReportsViewModel newsletterUserReportsViewModel = this.this$0;
        C001700s r2 = newsletterUserReportsViewModel.A00;
        Enumeration elements = newsletterUserReportsViewModel.A04.A00.elements();
        AnonymousClass00C.A08(elements);
        ArrayList list = Collections.list(elements);
        AnonymousClass00C.A08(list);
        r2.A0C(new C76293od(list));
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NewsletterUserReportsViewModel$submitAppeal$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
