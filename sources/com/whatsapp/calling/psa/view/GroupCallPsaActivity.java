package com.whatsapp.calling.psa.view;

import X.AnonymousClass00T;
import X.AnonymousClass0A2;
import X.AnonymousClass498;
import X.AnonymousClass499;
import X.AnonymousClass4FF;
import X.C008903u;
import X.C023109s;
import X.C023509x;
import X.C109325Xd;
import X.C18800tq;
import X.C225314u;
import X.C33311f5;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C36441kJ;
import X.C89314Wb;
import android.os.Bundle;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.whatsapp.calling.psa.viewmodel.GroupCallPsaViewModel;
import com.whatsapp.calling.psa.viewmodel.GroupCallPsaViewModel$fetchSuggestions$1;

public final class GroupCallPsaActivity extends C225314u {
    public boolean A00;
    public final AnonymousClass00T A01;

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C36361kB.A1C(A0B, this);
        }
    }

    public GroupCallPsaActivity(int i) {
        this.A00 = false;
        C89314Wb.A00(this, 42);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C36331k8.A0l(this);
        getWindow().setStatusBarColor(0);
        LifecycleCoroutineScopeImpl A002 = C33311f5.A00(this);
        GroupCallPsaActivity$onCreate$1 groupCallPsaActivity$onCreate$1 = new GroupCallPsaActivity$onCreate$1(this, (C023509x) null);
        C008903u r4 = C008903u.A00;
        Integer num = C023109s.A00;
        AnonymousClass0A2.A02(num, r4, groupCallPsaActivity$onCreate$1, A002);
        GroupCallPsaViewModel groupCallPsaViewModel = (GroupCallPsaViewModel) this.A01.getValue();
        AnonymousClass0A2.A02(num, r4, new GroupCallPsaViewModel$fetchSuggestions$1(groupCallPsaViewModel, (C023509x) null), C109325Xd.A00(groupCallPsaViewModel));
    }

    public GroupCallPsaActivity() {
        this(0);
        this.A01 = C36441kJ.A0a(new AnonymousClass499(this), new AnonymousClass498(this), new AnonymousClass4FF(this), C36441kJ.A1A(GroupCallPsaViewModel.class));
    }
}
