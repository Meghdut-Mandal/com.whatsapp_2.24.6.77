package com.whatsapp.community.subgroup;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass3BL;
import X.AnonymousClass3QK;
import X.C007103b;
import X.C009003v;
import X.C023509x;
import X.C36321k7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.subgroup.CommunitySubgroupsObserver$getCommunitySubgroupsMeParticipating$2", f = "CommunitySubgroupsObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CommunitySubgroupsObserver$getCommunitySubgroupsMeParticipating$2 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ AnonymousClass3BL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunitySubgroupsObserver$getCommunitySubgroupsMeParticipating$2(AnonymousClass3BL r2, C023509x r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new CommunitySubgroupsObserver$getCommunitySubgroupsMeParticipating$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CommunitySubgroupsObserver$getCommunitySubgroupsMeParticipating$2(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass3BL r0 = this.this$0;
            List A0V = C007103b.A0V(r0.A00.A04(r0.A0D));
            ArrayList A0J = C36321k7.A0J(A0V);
            Iterator it = A0V.iterator();
            while (it.hasNext()) {
                AnonymousClass3QK.A00(A0J, it);
            }
            return A0J;
        }
        throw AnonymousClass000.A0e();
    }
}
