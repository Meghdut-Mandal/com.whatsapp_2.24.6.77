package com.whatsapp.businessdirectory.viewmodel;

import X.AnonymousClass08X;
import X.AnonymousClass141;
import X.AnonymousClass315;
import X.AnonymousClass3F3;
import X.AnonymousClass7h8;
import X.AnonymousClass7h9;
import X.C001700s;
import X.C130036Jl;
import X.C142646pD;
import X.C28201Rs;
import X.C36331k8;
import X.C36371kC;
import X.C36391kE;
import X.C36431kI;
import X.C36441kJ;
import X.C87584Pj;
import X.C90514aH;
import android.app.Application;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class BusinessDirectoryFrequentContactedViewModel extends AnonymousClass08X implements C87584Pj, AnonymousClass7h8, AnonymousClass7h9 {
    public final C001700s A00 = C36431kI.A0S();
    public final C142646pD A01;
    public final AnonymousClass3F3 A02;
    public final C28201Rs A03 = C36441kJ.A0t();

    public void A0R() {
        C36331k8.A1E(this.A02.A00);
    }

    public void BUV(AnonymousClass315 r14) {
        synchronized (BusinessDirectoryFrequentContactedViewModel.class) {
            ArrayList arrayList = r14.A00;
            if (!arrayList.isEmpty()) {
                this.A00.A0C(arrayList);
                int size = arrayList.size();
                Iterator it = arrayList.iterator();
                int i = 0;
                while (it.hasNext()) {
                    if (C36391kE.A0f(it).A0E.A01()) {
                        i++;
                    }
                }
                int i2 = size - i;
                C142646pD r6 = this.A01;
                Iterator it2 = arrayList.iterator();
                int i3 = 0;
                while (it2.hasNext()) {
                    if (C36391kE.A0f(it2).A0E.A01()) {
                        i3++;
                    }
                }
                LinkedHashMap A1G = C36431kI.A1G();
                A1G.put("api_biz_count", C90514aH.A0l("local_biz_count", Integer.valueOf(i2), A1G, i3));
                LinkedHashMap A1G2 = C36431kI.A1G();
                A1G2.put("result", A1G);
                r6.A08((Integer) null, 12, A1G2, 12, 84, 2);
            }
        }
    }

    public /* bridge */ /* synthetic */ void BZO(Object obj) {
        this.A03.A0C(new C130036Jl((AnonymousClass141) obj, 0));
        this.A01.A08((Integer) null, C36371kC.A0o(), (Map) null, 12, 80, 1);
    }

    public void BhE(AnonymousClass141 r8) {
        this.A03.A0C(new C130036Jl(r8, 1));
        this.A01.A08((Integer) null, C36371kC.A0p(), (Map) null, 12, 81, 1);
    }

    public BusinessDirectoryFrequentContactedViewModel(Application application, C142646pD r5, AnonymousClass3F3 r6) {
        super(application);
        this.A02 = r6;
        this.A01 = r5;
        r5.A04((Integer) null, 12, 84);
        this.A02.A00(this, 100);
    }
}
