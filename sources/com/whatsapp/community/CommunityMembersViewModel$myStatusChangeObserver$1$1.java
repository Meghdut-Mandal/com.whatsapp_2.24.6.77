package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C18660tW;
import X.C36441kJ;
import com.whatsapp.jid.PhoneUserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.CommunityMembersViewModel$myStatusChangeObserver$1$1", f = "CommunityMembersViewModel.kt", i = {}, l = {198}, m = "invokeSuspend", n = {}, s = {})
public final class CommunityMembersViewModel$myStatusChangeObserver$1$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ CommunityMembersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunityMembersViewModel$myStatusChangeObserver$1$1(CommunityMembersViewModel communityMembersViewModel, C023509x r3) {
        super(2, r3);
        this.this$0 = communityMembersViewModel;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new CommunityMembersViewModel$myStatusChangeObserver$1$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CommunityMembersViewModel$myStatusChangeObserver$1$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            CommunityMembersViewModel communityMembersViewModel = this.this$0;
            C18660tW r0 = new C18660tW(new PhoneUserJid[]{C36441kJ.A0n(communityMembersViewModel.A06)}, 1);
            this.label = 1;
            if (CommunityMembersViewModel.A01(communityMembersViewModel, this, r0, false) == r5) {
                return r5;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }
}
