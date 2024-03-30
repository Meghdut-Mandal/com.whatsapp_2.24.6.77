package com.whatsapp.newsletter.multiadmin;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass040;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass4WV;
import X.C009003v;
import X.C023509x;
import X.C28981Uw;
import X.C36321k7;
import X.C36331k8;
import X.C62403Ga;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector$onSend$1", f = "InviteNewsletterAdminSelector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class InviteNewsletterAdminSelector$onSend$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $caption;
    public final /* synthetic */ List $inviteeJids;
    public final /* synthetic */ C28981Uw $newsletterJid;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ InviteNewsletterAdminSelector this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InviteNewsletterAdminSelector$onSend$1(C28981Uw r2, InviteNewsletterAdminSelector inviteNewsletterAdminSelector, String str, List list, C023509x r6) {
        super(2, r6);
        this.this$0 = inviteNewsletterAdminSelector;
        this.$newsletterJid = r2;
        this.$inviteeJids = list;
        this.$caption = str;
    }

    public final C023509x create(Object obj, C023509x r8) {
        InviteNewsletterAdminSelector inviteNewsletterAdminSelector = this.this$0;
        InviteNewsletterAdminSelector$onSend$1 inviteNewsletterAdminSelector$onSend$1 = new InviteNewsletterAdminSelector$onSend$1(this.$newsletterJid, inviteNewsletterAdminSelector, this.$caption, this.$inviteeJids, r8);
        inviteNewsletterAdminSelector$onSend$1.L$0 = obj;
        return inviteNewsletterAdminSelector$onSend$1;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass040 r3 = (AnonymousClass040) this.L$0;
            InviteNewsletterAdminSelector inviteNewsletterAdminSelector = this.this$0;
            C62403Ga r7 = inviteNewsletterAdminSelector.A02;
            if (r7 != null) {
                C28981Uw r5 = this.$newsletterJid;
                List list = this.$inviteeJids;
                AnonymousClass4WV r6 = new AnonymousClass4WV(r5, inviteNewsletterAdminSelector, this.$caption, 1);
                AnonymousClass00C.A0D(r3, 0);
                C36321k7.A0x(r5, list);
                C36331k8.A1T(new NewsletterAdminInvitationHandler$inviteAdminsForChannel$1(r5, r6, r7, list, (C023509x) null), r3);
                return AnonymousClass0AJ.A00;
            }
            throw C36331k8.A0d("newsletterAdminInvitationHandler");
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((InviteNewsletterAdminSelector$onSend$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
