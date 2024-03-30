package com.whatsapp.reportinfra.repo;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass3Fj;
import X.C009003v;
import X.C023409w;
import X.C023509x;
import X.C203399nx;
import X.C36321k7;
import X.C64433Ny;
import com.whatsapp.jid.UserJid;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.reportinfra.repo.SpamReportRepo$sendIndividualSpamReport$2", f = "SpamReportRepo.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
public final class SpamReportRepo$sendIndividualSpamReport$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ UserJid $jid;
    public final /* synthetic */ String $reportOrigin;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SpamReportRepo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpamReportRepo$sendIndividualSpamReport$2(UserJid userJid, SpamReportRepo spamReportRepo, String str, C023509x r5) {
        super(2, r5);
        this.this$0 = spamReportRepo;
        this.$jid = userJid;
        this.$reportOrigin = str;
    }

    public final C023509x create(Object obj, C023509x r6) {
        SpamReportRepo$sendIndividualSpamReport$2 spamReportRepo$sendIndividualSpamReport$2 = new SpamReportRepo$sendIndividualSpamReport$2(this.$jid, this.this$0, this.$reportOrigin, r6);
        spamReportRepo$sendIndividualSpamReport$2.L$0 = obj;
        return spamReportRepo$sendIndividualSpamReport$2;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r2 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            List list = (List) this.L$0;
            C64433Ny r1 = this.this$0.A09;
            UserJid userJid = this.$jid;
            String str = this.$reportOrigin;
            this.label = 1;
            String A09 = r1.A00.A09();
            AnonymousClass3Fj r3 = r1.A02;
            C36321k7.A11(str, userJid, list);
            C203399nx r0 = r3.A00(userJid, r3.A00.A01(userJid), A09, str, list, C023409w.A00).A00;
            AnonymousClass00C.A08(r0);
            obj = C64433Ny.A00(r0, r1, A09, this);
            if (obj == r2) {
                return r2;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SpamReportRepo$sendIndividualSpamReport$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
