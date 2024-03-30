package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass4N4;
import X.C009003v;
import X.C023509x;
import X.C12790if;
import X.C18650tV;
import java.util.Collection;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.CommunityMembersViewModel$contactObserver$1$onContactsStateChanged$1", f = "CommunityMembersViewModel.kt", i = {}, l = {167}, m = "invokeSuspend", n = {}, s = {})
public final class CommunityMembersViewModel$contactObserver$1$onContactsStateChanged$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ Collection $contactsChanged;
    public int label;
    public final /* synthetic */ CommunityMembersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunityMembersViewModel$contactObserver$1$onContactsStateChanged$1(CommunityMembersViewModel communityMembersViewModel, Collection collection, C023509x r4) {
        super(2, r4);
        this.this$0 = communityMembersViewModel;
        this.$contactsChanged = collection;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new CommunityMembersViewModel$contactObserver$1$onContactsStateChanged$1(this.this$0, this.$contactsChanged, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            CommunityMembersViewModel communityMembersViewModel = this.this$0;
            Collection collection = this.$contactsChanged;
            AnonymousClass00C.A0D(collection, 0);
            C12790if r0 = new C12790if(AnonymousClass4N4.A00, new C18650tV(collection, 0));
            this.label = 1;
            if (CommunityMembersViewModel.A01(communityMembersViewModel, this, r0, false) == r6) {
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
        return ((CommunityMembersViewModel$contactObserver$1$onContactsStateChanged$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
