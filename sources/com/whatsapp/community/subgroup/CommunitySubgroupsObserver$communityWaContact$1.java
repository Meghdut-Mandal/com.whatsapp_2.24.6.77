package com.whatsapp.community.subgroup;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass3BL;
import X.C005502l;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.subgroup.CommunitySubgroupsObserver$communityWaContact$1", f = "CommunitySubgroupsObserver.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
public final class CommunitySubgroupsObserver$communityWaContact$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ AnonymousClass3BL this$0;

    @DebugMetadata(c = "com.whatsapp.community.subgroup.CommunitySubgroupsObserver$communityWaContact$1$1", f = "CommunitySubgroupsObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.community.subgroup.CommunitySubgroupsObserver$communityWaContact$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass0A1 implements C009003v {
        public int label;

        public final C023509x create(Object obj, C023509x r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                AnonymousClass0AN.A00(obj);
                AnonymousClass3BL r0 = AnonymousClass3BL.this;
                return r0.A01.A08(r0.A0D);
            }
            throw AnonymousClass000.A0e();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunitySubgroupsObserver$communityWaContact$1(AnonymousClass3BL r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new CommunitySubgroupsObserver$communityWaContact$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CommunitySubgroupsObserver$communityWaContact$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            final AnonymousClass3BL r3 = this.this$0;
            C005502l r2 = r3.A0E;
            AnonymousClass1 r0 = new AnonymousClass1((C023509x) null);
            this.label = 1;
            obj = AnonymousClass0A2.A00(this, r2, r0);
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
}
