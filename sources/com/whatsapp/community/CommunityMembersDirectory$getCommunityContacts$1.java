package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass147;
import X.AnonymousClass19R;
import X.C005602m;
import X.C009003v;
import X.C023509x;
import X.C28401Sn;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.CommunityMembersDirectory$getCommunityContacts$1", f = "CommunityMembersDirectory.kt", i = {}, l = {419}, m = "invokeSuspend", n = {}, s = {})
public final class CommunityMembersDirectory$getCommunityContacts$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass147 $parentJid;
    public int label;
    public final /* synthetic */ C28401Sn this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunityMembersDirectory$getCommunityContacts$1(C28401Sn r2, AnonymousClass147 r3, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$parentJid = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new CommunityMembersDirectory$getCommunityContacts$1(this.this$0, this.$parentJid, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C28401Sn r4 = this.this$0;
            AnonymousClass147 r3 = this.$parentJid;
            C005602m r2 = AnonymousClass19R.A00;
            this.label = 1;
            obj = AnonymousClass0A2.A00(this, r2, new CommunityMembersDirectory$getCommunityContacts$3(r4, r3, (C023509x) null));
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommunityMembersDirectory$getCommunityContacts$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
