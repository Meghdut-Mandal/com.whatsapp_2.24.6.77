package com.whatsapp.community.communityInfo;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass01L;
import X.AnonymousClass147;
import X.AnonymousClass16I;
import X.AnonymousClass1RY;
import X.AnonymousClass3AS;
import X.AnonymousClass4FP;
import X.AnonymousClass4JC;
import X.C000800j;
import X.C001400p;
import X.C18800tq;
import X.C220712t;
import X.C233117z;
import X.C24361Cd;
import X.C24381Cf;
import X.C26421Kc;
import X.C27111My;
import X.C27731Pn;
import X.C32591ds;
import X.C34361gu;
import X.C34381gw;
import X.C36331k8;
import X.C36351kA;
import X.C36371kC;
import X.C36431kI;
import X.C40051uf;
import X.C53822rw;
import X.C56992xU;
import X.C58172zR;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

public final class CommunityHomeFragment extends Hilt_CommunityHomeFragment {
    public C58172zR A00;
    public AnonymousClass3AS A01;
    public C27731Pn A02;
    public C220712t A03;
    public C40051uf A04;
    public AnonymousClass1RY A05;
    public final AnonymousClass00T A06 = C001400p.A00(C000800j.NONE, new AnonymousClass4FP(this));

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerView = new RecyclerView(A0a(), (AttributeSet) null);
        recyclerView.setId(R.id.community_home_fragment_container);
        AnonymousClass01I A0i = A0i();
        AnonymousClass00C.A0E(A0i, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        AnonymousClass01L r4 = (AnonymousClass01L) A0i;
        C27731Pn r3 = this.A02;
        if (r3 != null) {
            this.A05 = r3.A03(A0a(), this, "CommunityHomeFragment");
            C58172zR r2 = this.A00;
            if (r2 != null) {
                AnonymousClass147 A0k = C36431kI.A0k(this.A06);
                AnonymousClass1RY r14 = this.A05;
                if (r14 == null) {
                    throw C36331k8.A0d("contactPhotoLoader");
                }
                C32591ds r22 = r2.A00;
                C18800tq r32 = r22.A02;
                r32.A1b.get();
                AnonymousClass16I A0S = C36351kA.A0S(r32);
                C24361Cd A0T = C36371kC.A0T(r32);
                C24381Cf A0Y = C36371kC.A0Y(r32);
                C27111My r23 = r22.A00;
                C233117z A0c = C36371kC.A0c(r32);
                AnonymousClass01L r6 = r4;
                AnonymousClass01L r5 = r4;
                AnonymousClass3AS r33 = new AnonymousClass3AS(r4, r5, r6, recyclerView, (C56992xU) r23.A0Y.get(), (C34361gu) r23.A0g.get(), (C34381gw) r23.A0h.get(), (C26421Kc) r32.A1A.get(), A0T, A0S, r14, A0Y, A0c, A0k);
                this.A01 = r33;
                C40051uf r1 = r33.A04;
                AnonymousClass00C.A08(r1);
                this.A04 = r1;
                C53822rw.A01(r4, r1.A02.A03, new AnonymousClass4JC(this), 38);
                return recyclerView;
            }
            throw C36331k8.A0d("subgroupsComponentFactory");
        }
        throw C36331k8.A0d("contactPhotos");
    }

    public void A1H() {
        super.A1H();
        AnonymousClass3AS r0 = this.A01;
        if (r0 == null) {
            throw C36331k8.A0d("subgroupsComponent");
        }
        r0.A07.A01();
    }
}
