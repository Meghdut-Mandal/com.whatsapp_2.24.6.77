package com.whatsapp.community.subgroup;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass147;
import X.AnonymousClass3BL;
import X.C009003v;
import X.C023509x;
import X.C40051uf;
import X.C586530n;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.subgroup.CommunitySubgroupsObserver$groupParticipantsObserver$1$onMeLeavingGroup$1", f = "CommunitySubgroupsObserver.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
public final class CommunitySubgroupsObserver$groupParticipantsObserver$1$onMeLeavingGroup$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass147 $gjid;
    public int label;
    public final /* synthetic */ AnonymousClass3BL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunitySubgroupsObserver$groupParticipantsObserver$1$onMeLeavingGroup$1(AnonymousClass3BL r2, AnonymousClass147 r3, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$gjid = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new CommunitySubgroupsObserver$groupParticipantsObserver$1$onMeLeavingGroup$1(this.this$0, this.$gjid, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass3BL r4 = this.this$0;
            AnonymousClass147 r3 = this.$gjid;
            this.label = 1;
            obj = AnonymousClass0A2.A00(this, r4.A0E, new CommunitySubgroupsObserver$getParentGroupJid$2(r4, r3, (C023509x) null));
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        if (AnonymousClass00C.A0J(this.this$0.A0D, obj)) {
            Iterator A00 = AnonymousClass3BL.A00(this.this$0);
            while (A00.hasNext()) {
                C40051uf r0 = ((C586530n) A00.next()).A00;
                r0.A0b.A03(r0.A0h);
            }
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommunitySubgroupsObserver$groupParticipantsObserver$1$onMeLeavingGroup$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
