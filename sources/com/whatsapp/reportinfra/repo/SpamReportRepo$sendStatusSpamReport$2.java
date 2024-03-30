package com.whatsapp.reportinfra.repo;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass3T1;
import X.C009003v;
import X.C023509x;
import X.C177528dw;
import X.C64433Ny;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.reportinfra.repo.SpamReportRepo$sendStatusSpamReport$2", f = "SpamReportRepo.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
public final class SpamReportRepo$sendStatusSpamReport$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $reportOrigin;
    public final /* synthetic */ C177528dw $statusJid;
    public final /* synthetic */ AnonymousClass3T1 $statusMessage;
    public int label;
    public final /* synthetic */ SpamReportRepo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpamReportRepo$sendStatusSpamReport$2(C177528dw r2, AnonymousClass3T1 r3, SpamReportRepo spamReportRepo, String str, C023509x r6) {
        super(2, r6);
        this.this$0 = spamReportRepo;
        this.$statusJid = r2;
        this.$statusMessage = r3;
        this.$reportOrigin = str;
    }

    public final C023509x create(Object obj, C023509x r8) {
        return new SpamReportRepo$sendStatusSpamReport$2(this.$statusJid, this.$statusMessage, this.this$0, this.$reportOrigin, r8);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C64433Ny r5 = this.this$0.A09;
            C177528dw r4 = this.$statusJid;
            AnonymousClass3T1 r3 = this.$statusMessage;
            String str = this.$reportOrigin;
            this.label = 1;
            String A09 = r5.A00.A09();
            obj = C64433Ny.A00(r5.A04.A00(r4, r3, A09, str), r5, A09, this);
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
        return ((SpamReportRepo$sendStatusSpamReport$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
