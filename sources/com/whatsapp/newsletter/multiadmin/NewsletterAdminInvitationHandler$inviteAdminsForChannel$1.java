package com.whatsapp.newsletter.multiadmin;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass2YG;
import X.AnonymousClass30F;
import X.AnonymousClass354;
import X.AnonymousClass4OL;
import X.AnonymousClass4PA;
import X.AnonymousClass4TP;
import X.C009003v;
import X.C023509x;
import X.C18800tq;
import X.C19770wU;
import X.C28981Uw;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36391kE;
import X.C36441kJ;
import X.C62133Ex;
import X.C62403Ga;
import X.C86824Mk;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletter.multiadmin.NewsletterAdminInvitationHandler$inviteAdminsForChannel$1", f = "NewsletterAdminInvitationHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NewsletterAdminInvitationHandler$inviteAdminsForChannel$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass4TP $callback;
    public final /* synthetic */ List $inviteeJids;
    public final /* synthetic */ C28981Uw $newsletterJid;
    public int label;
    public final /* synthetic */ C62403Ga this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterAdminInvitationHandler$inviteAdminsForChannel$1(C28981Uw r2, AnonymousClass4TP r3, C62403Ga r4, List list, C023509x r6) {
        super(2, r6);
        this.this$0 = r4;
        this.$inviteeJids = list;
        this.$newsletterJid = r2;
        this.$callback = r3;
    }

    public final C023509x create(Object obj, C023509x r8) {
        return new NewsletterAdminInvitationHandler$inviteAdminsForChannel$1(this.$newsletterJid, this.$callback, this.this$0, this.$inviteeJids, r8);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            ArrayList A0I = AnonymousClass001.A0I();
            AnonymousClass4PA r0 = this.this$0.A00;
            if (r0 != null) {
                r0.cancel();
            }
            this.this$0.A01.A05(R.string.f12nameremoved, R.string.f12nameremoved);
            Iterator it = this.$inviteeJids.iterator();
            while (it.hasNext()) {
                UserJid A0o = C36441kJ.A0o(it);
                C62403Ga r4 = this.this$0;
                C28981Uw r8 = this.$newsletterJid;
                C86824Mk r02 = new C86824Mk(this.$callback, r4, A0I, this.$inviteeJids);
                C62133Ex r1 = r4.A03;
                AnonymousClass354 r12 = new AnonymousClass354(A0o, r02);
                C36321k7.A0w(r8, A0o);
                if (C36391kE.A1Z(r1.A06)) {
                    AnonymousClass30F r13 = r1.A01;
                    if (r13 != null) {
                        C19770wU A0Z = C36341k9.A0Z(r13.A00.A00);
                        C18800tq r14 = r13.A00.A00;
                        new AnonymousClass2YG(C36391kE.A0g(r14), r8, A0o, (AnonymousClass4OL) r14.A5l.get(), r14.Azc(), r12, A0Z).A01();
                    } else {
                        throw C36331k8.A0d("newsletterAdminInviteHandler");
                    }
                }
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((NewsletterAdminInvitationHandler$inviteAdminsForChannel$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
