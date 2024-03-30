package com.whatsapp.community.membersuggestedgroups;

import X.AnonymousClass000;
import X.AnonymousClass01P;
import X.AnonymousClass05K;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass3LK;
import X.AnonymousClass4Z9;
import X.C009003v;
import X.C023509x;
import X.C13170jR;
import X.C36401kF;
import androidx.appcompat.widget.Toolbar;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity$setupToolbar$1$1", f = "MemberSuggestedGroupsManagementActivity.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
public final class MemberSuggestedGroupsManagementActivity$setupToolbar$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ Toolbar $toolbar;
    public int label;
    public final /* synthetic */ MemberSuggestedGroupsManagementActivity this$0;

    @DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity$setupToolbar$1$1$1", f = "MemberSuggestedGroupsManagementActivity.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity$setupToolbar$1$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r5) {
            return new AnonymousClass1(toolbar, memberSuggestedGroupsManagementActivity, r5);
        }

        public final Object invokeSuspend(Object obj) {
            AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AnonymousClass0AN.A00(obj);
                AnonymousClass05K r4 = C36401kF.A0T(memberSuggestedGroupsManagementActivity).A0I;
                AnonymousClass4Z9 r0 = new AnonymousClass4Z9(toolbar, memberSuggestedGroupsManagementActivity, 3);
                this.label = 1;
                if (r4.B36(this, r0) == r6) {
                    return r6;
                }
            } else if (i != 1) {
                throw AnonymousClass000.A0e();
            } else {
                AnonymousClass0AN.A00(obj);
            }
            throw new C13170jR();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberSuggestedGroupsManagementActivity$setupToolbar$1$1(Toolbar toolbar, MemberSuggestedGroupsManagementActivity memberSuggestedGroupsManagementActivity, C023509x r4) {
        super(2, r4);
        this.this$0 = memberSuggestedGroupsManagementActivity;
        this.$toolbar = toolbar;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new MemberSuggestedGroupsManagementActivity$setupToolbar$1$1(this.$toolbar, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final MemberSuggestedGroupsManagementActivity memberSuggestedGroupsManagementActivity = this.this$0;
            AnonymousClass01P r3 = AnonymousClass01P.STARTED;
            final Toolbar toolbar = this.$toolbar;
            AnonymousClass1 r0 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            if (AnonymousClass3LK.A01(r3, memberSuggestedGroupsManagementActivity, this, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MemberSuggestedGroupsManagementActivity$setupToolbar$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
