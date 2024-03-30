package com.whatsapp.community.subgroup;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass147;
import X.AnonymousClass1LV;
import X.AnonymousClass3BL;
import X.C009003v;
import X.C023509x;
import X.C26831Lr;
import X.C36341k9;
import X.C40051uf;
import X.C586530n;
import X.C65893Tw;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.subgroup.CommunitySubgroupsObserver$groupParticipantsObserver$1$onMeRemovedFromGroup$1", f = "CommunitySubgroupsObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CommunitySubgroupsObserver$groupParticipantsObserver$1$onMeRemovedFromGroup$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass147 $gjid;
    public int label;
    public final /* synthetic */ AnonymousClass3BL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunitySubgroupsObserver$groupParticipantsObserver$1$onMeRemovedFromGroup$1(AnonymousClass3BL r2, AnonymousClass147 r3, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$gjid = r3;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new CommunitySubgroupsObserver$groupParticipantsObserver$1$onMeRemovedFromGroup$1(this.this$0, this.$gjid, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            if (AnonymousClass00C.A0J(this.this$0.A0D, this.this$0.A00.A02(this.$gjid))) {
                Iterator A00 = AnonymousClass3BL.A00(this.this$0);
                while (A00.hasNext()) {
                    C40051uf r5 = ((C586530n) A00.next()).A00;
                    AnonymousClass1LV r1 = r5.A0M;
                    AnonymousClass147 r4 = r5.A0h;
                    AnonymousClass00C.A0D(r4, 0);
                    C26831Lr r3 = r1.A09;
                    if (r3.A01.A01(new C65893Tw(r3, 4), r4).size() <= 0) {
                        C36341k9.A17(r5.A0v, 403);
                    }
                }
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommunitySubgroupsObserver$groupParticipantsObserver$1$onMeRemovedFromGroup$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
