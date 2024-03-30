package com.whatsapp.reportinfra.repo;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C28981Uw;
import X.C64433Ny;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.reportinfra.repo.SpamReportRepo$sendNewsLetterSpamReport$2", f = "SpamReportRepo.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {})
public final class SpamReportRepo$sendNewsLetterSpamReport$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C28981Uw $newsletterJid;
    public final /* synthetic */ String $reportOrigin;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SpamReportRepo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpamReportRepo$sendNewsLetterSpamReport$2(C28981Uw r2, SpamReportRepo spamReportRepo, String str, C023509x r5) {
        super(2, r5);
        this.this$0 = spamReportRepo;
        this.$newsletterJid = r2;
        this.$reportOrigin = str;
    }

    public final C023509x create(Object obj, C023509x r6) {
        SpamReportRepo$sendNewsLetterSpamReport$2 spamReportRepo$sendNewsLetterSpamReport$2 = new SpamReportRepo$sendNewsLetterSpamReport$2(this.$newsletterJid, this.this$0, this.$reportOrigin, r6);
        spamReportRepo$sendNewsLetterSpamReport$2.L$0 = obj;
        return spamReportRepo$sendNewsLetterSpamReport$2;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C64433Ny r4 = this.this$0.A09;
            C28981Uw r3 = this.$newsletterJid;
            String str = this.$reportOrigin;
            this.label = 1;
            String A09 = r4.A00.A09();
            obj = C64433Ny.A00(r4.A03.A00(r3, A09, str, (List) this.L$0), r4, A09, this);
            if (obj == r6) {
                return r6;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SpamReportRepo$sendNewsLetterSpamReport$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
