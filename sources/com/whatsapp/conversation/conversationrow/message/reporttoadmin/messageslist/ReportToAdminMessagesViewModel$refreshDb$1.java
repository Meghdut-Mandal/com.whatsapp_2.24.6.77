package com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass147;
import X.AnonymousClass19R;
import X.AnonymousClass39U;
import X.C009003v;
import X.C023509x;
import X.C02680Bk;
import X.C39961uN;
import com.whatsapp.reporttoadmin.db.RtaMessagesDbRepo$getMessages$2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesViewModel$refreshDb$1", f = "ReportToAdminMessagesViewModel.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
public final class ReportToAdminMessagesViewModel$refreshDb$1 extends AnonymousClass0A1 implements C009003v {
    public Object L$0;
    public int label;
    public final /* synthetic */ C39961uN this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportToAdminMessagesViewModel$refreshDb$1(C39961uN r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new ReportToAdminMessagesViewModel$refreshDb$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ReportToAdminMessagesViewModel$refreshDb$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C39961uN r5;
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            r5 = this.this$0;
            AnonymousClass39U r4 = r5.A00;
            if (r4 != null) {
                AnonymousClass147 r3 = r5.A06;
                this.L$0 = r5;
                this.label = 1;
                obj = AnonymousClass0A2.A00(this, AnonymousClass19R.A01, new RtaMessagesDbRepo$getMessages$2((C02680Bk) null, r3, r4, (C023509x) null));
                if (obj == r6) {
                    return r6;
                }
            }
            return AnonymousClass0AJ.A00;
        } else if (i == 1) {
            r5 = (C39961uN) this.L$0;
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        r5.A01.A0C(obj);
        return AnonymousClass0AJ.A00;
    }
}
