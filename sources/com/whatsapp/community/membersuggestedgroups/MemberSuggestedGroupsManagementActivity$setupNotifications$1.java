package com.whatsapp.community.membersuggestedgroups;

import X.AnonymousClass000;
import X.AnonymousClass05H;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass4Z8;
import X.C009003v;
import X.C023509x;
import X.C36401kF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity$setupNotifications$1", f = "MemberSuggestedGroupsManagementActivity.kt", i = {}, l = {362}, m = "invokeSuspend", n = {}, s = {})
public final class MemberSuggestedGroupsManagementActivity$setupNotifications$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ MemberSuggestedGroupsManagementActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberSuggestedGroupsManagementActivity$setupNotifications$1(MemberSuggestedGroupsManagementActivity memberSuggestedGroupsManagementActivity, C023509x r3) {
        super(2, r3);
        this.this$0 = memberSuggestedGroupsManagementActivity;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new MemberSuggestedGroupsManagementActivity$setupNotifications$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new MemberSuggestedGroupsManagementActivity$setupNotifications$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass05H r3 = C36401kF.A0T(this.this$0).A0B;
            AnonymousClass4Z8 r0 = new AnonymousClass4Z8(this.this$0, 6);
            this.label = 1;
            if (r3.B36(this, r0) == r5) {
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
