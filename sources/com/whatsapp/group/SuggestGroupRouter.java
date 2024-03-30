package com.whatsapp.group;

import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass1BE;
import X.AnonymousClass3B1;
import X.AnonymousClass3TE;
import X.AnonymousClass4GU;
import X.C000800j;
import X.C001400p;
import X.C009504a;
import X.C009904e;
import X.C18800tq;
import X.C18830tt;
import X.C20810yC;
import X.C26581Ks;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36381kD;
import X.C36431kI;
import X.C36441kJ;
import X.C58292zd;
import X.C65673Ta;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager;

public final class SuggestGroupRouter extends Hilt_SuggestGroupRouter {
    public C58292zd A00;
    public final AnonymousClass00T A01 = AnonymousClass3TE.A02(this, "entry_point", -1);
    public final AnonymousClass00T A02 = C001400p.A00(C000800j.NONE, new AnonymousClass4GU(this));

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        if (bundle == null) {
            C36331k8.A0y(this.A0F);
            C58292zd r0 = this.A00;
            if (r0 != null) {
                Context A0a = A0a();
                AnonymousClass01I A0i = A0i();
                C18800tq r1 = r0.A00.A02;
                C20810yC A0V = C36341k9.A0V(r1);
                AnonymousClass3B1 r4 = new AnonymousClass3B1(A0i, A0a, this, C36351kA.A0M(r1), (MemberSuggestedGroupsManager) r1.A4q.get(), C36351kA.A0U(r1), A0V, C18830tt.A5b(r1.A00), AnonymousClass1BE.A00(), C26581Ks.A00());
                r4.A00 = r4.A03.BnD(new C65673Ta(r4, 6), new C009504a());
                Context A0a2 = A0a();
                Intent A0D = C36431kI.A0D();
                A0D.setClassName(A0a2.getPackageName(), "com.whatsapp.group.newgroup.NewGroup");
                A0D.putExtra("entry_point", C36331k8.A02(this.A01));
                A0D.putExtra("parent_group_jid_to_link", C36381kD.A0w(C36441kJ.A0m(this.A02)));
                C009904e r02 = r4.A00;
                if (r02 != null) {
                    r02.A02(A0D);
                    return;
                }
                throw C36331k8.A0d("suggestGroup");
            }
            throw C36331k8.A0d("suggestGroupResultHandlerFactory");
        }
    }
}
