package com.whatsapp.product.reporttoadmin;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass11F;
import X.AnonymousClass147;
import X.AnonymousClass17Y;
import X.AnonymousClass2dL;
import X.AnonymousClass3T1;
import X.C009003v;
import X.C023509x;
import X.C36321k7;
import X.C36331k8;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.reporttoadmin.xmpp.RtaXmppClient;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.product.reporttoadmin.ReportToAdminDialogFragment$setButtons$1$1", f = "ReportToAdminDialogFragment.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
public final class ReportToAdminDialogFragment$setButtons$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $key;
    public final /* synthetic */ UserJid $senderUserJid;
    public int label;
    public final /* synthetic */ ReportToAdminDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportToAdminDialogFragment$setButtons$1$1(UserJid userJid, ReportToAdminDialogFragment reportToAdminDialogFragment, String str, C023509x r5) {
        super(2, r5);
        this.this$0 = reportToAdminDialogFragment;
        this.$senderUserJid = userJid;
        this.$key = str;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new ReportToAdminDialogFragment$setButtons$1$1(this.$senderUserJid, this.this$0, this.$key, r6);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            ReportToAdminDialogFragment reportToAdminDialogFragment = this.this$0;
            RtaXmppClient rtaXmppClient = reportToAdminDialogFragment.A04;
            if (rtaXmppClient != null) {
                AnonymousClass3T1 r0 = reportToAdminDialogFragment.A02;
                if (r0 == null) {
                    throw C36331k8.A0d("selectedMessage");
                }
                AnonymousClass11F r2 = r0.A1J.A00;
                AnonymousClass00C.A0E(r2, "null cannot be cast to non-null type com.whatsapp.jid.PermanentGroupJid");
                UserJid userJid = this.$senderUserJid;
                String str = this.$key;
                this.label = 1;
                obj = rtaXmppClient.A01((AnonymousClass147) r2, userJid, str, this);
                if (obj == r5) {
                    return r5;
                }
            } else {
                throw C36331k8.A0d("rtaXmppClient");
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        boolean z = obj instanceof AnonymousClass2dL;
        AnonymousClass17Y r1 = this.this$0.A00;
        if (r1 != null) {
            int i2 = R.string.f12nameremoved;
            if (z) {
                i2 = R.string.f12nameremoved;
            }
            r1.A06(i2, 1);
            return AnonymousClass0AJ.A00;
        }
        throw C36321k7.A06();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ReportToAdminDialogFragment$setButtons$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
