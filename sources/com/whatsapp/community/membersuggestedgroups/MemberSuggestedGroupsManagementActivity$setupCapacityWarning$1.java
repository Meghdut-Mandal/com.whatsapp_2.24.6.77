package com.whatsapp.community.membersuggestedgroups;

import X.AnonymousClass000;
import X.AnonymousClass01P;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass3LK;
import X.C009003v;
import X.C019408g;
import X.C023509x;
import X.C12990iz;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity$setupCapacityWarning$1", f = "MemberSuggestedGroupsManagementActivity.kt", i = {}, l = {288}, m = "invokeSuspend", n = {}, s = {})
public final class MemberSuggestedGroupsManagementActivity$setupCapacityWarning$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ MemberSuggestedGroupsManagementActivity this$0;

    @DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity$setupCapacityWarning$1$1", f = "MemberSuggestedGroupsManagementActivity.kt", i = {}, l = {291}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementActivity$setupCapacityWarning$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
        }

        public final Object invokeSuspend(Object obj) {
            AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AnonymousClass0AN.A00(obj);
                C12990iz r3 = new C12990iz(new C019408g((C023509x) null) {
                    public /* synthetic */ Object L$0;
                    public /* synthetic */ Object L$1;
                    public int label;

                    public /* bridge */ /* synthetic */ Object BKt(Object obj, Object obj2, Object obj3) {
                        AnonymousClass1 r1 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public MemberSuggestedGroupsManagementActivity$setupCapacityWarning$1(MemberSuggestedGroupsManagementActivity memberSuggestedGroupsManagementActivity, C023509x r3) {
                            super(2, r3);
                            this.this$0 = memberSuggestedGroupsManagementActivity;
                        }

                        public final C023509x create(Object obj, C023509x r4) {
                            return new MemberSuggestedGroupsManagementActivity$setupCapacityWarning$1(this.this$0, r4);
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            return new MemberSuggestedGroupsManagementActivity$setupCapacityWarning$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
                        }

                        public final Object invokeSuspend(Object obj) {
                            AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
                            int i = this.label;
                            if (i == 0) {
                                AnonymousClass0AN.A00(obj);
                                final MemberSuggestedGroupsManagementActivity memberSuggestedGroupsManagementActivity = this.this$0;
                                AnonymousClass01P r2 = AnonymousClass01P.STARTED;
                                AnonymousClass1 r0 = new AnonymousClass1((C023509x) null);
                                this.label = 1;
                                if (AnonymousClass3LK.A01(r2, memberSuggestedGroupsManagementActivity, this, r0) == r5) {
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