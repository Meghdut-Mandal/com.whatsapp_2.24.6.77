package com.whatsapp.bonsai.discovery;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass171;
import X.AnonymousClass1K7;
import X.AnonymousClass1RY;
import X.AnonymousClass48N;
import X.AnonymousClass48O;
import X.C019308f;
import X.C02380Ab;
import X.C12560iI;
import X.C19460v5;
import X.C19630wG;
import X.C27731Pn;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36401kF;
import X.C36441kJ;
import X.C40391vT;
import X.C55492ui;
import X.C84804Eq;
import X.C85734If;
import X.C85744Ig;
import X.C86624Lq;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.whatsapp.R;
import com.whatsapp.contact.photos.ContactPhotos$LoaderLifecycleEventObserver;

public final class BonsaiDiscoveryFragment extends Hilt_BonsaiDiscoveryFragment {
    public C19460v5 A00;
    public AnonymousClass1K7 A01;
    public AnonymousClass171 A02;
    public AnonymousClass1RY A03;
    public C27731Pn A04;
    public C19630wG A05;

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        C019308f A1A = C36441kJ.A1A(BonsaiDiscoveryViewModel.class);
        C12560iI A0a = C36441kJ.A0a(new AnonymousClass48N(this), new AnonymousClass48O(this), new C84804Eq(this), A1A);
        int i = A0b().getInt("position");
        BonsaiDiscoveryRecyclerView bonsaiDiscoveryRecyclerView = (BonsaiDiscoveryRecyclerView) C36361kB.A0G(view, R.id.contacts);
        A1D();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(AnonymousClass000.A0I(C36401kF.A0m(((BonsaiDiscoveryViewModel) A0a.getValue()).A06)));
        bonsaiDiscoveryRecyclerView.setLayoutManager(gridLayoutManager);
        C27731Pn r5 = this.A04;
        if (r5 != null) {
            C02380Ab A0m = A0m();
            AnonymousClass1RY A06 = r5.A06("bonsai-discovery", 0.0f, C36341k9.A0F(view).getDimensionPixelSize(R.dimen.f7nameremoved));
            A0m.A00();
            A0m.A00.A04(new ContactPhotos$LoaderLifecycleEventObserver(A06));
            this.A03 = A06;
            C40391vT r52 = new C40391vT(this);
            bonsaiDiscoveryRecyclerView.setAdapter(r52);
            C55492ui.A01(A0m(), bonsaiDiscoveryRecyclerView.A00, new C85734If(A0a), 32);
            C55492ui.A01(A0m(), ((BonsaiDiscoveryViewModel) A0a.getValue()).A00, new C86624Lq(r52, i), 34);
            C55492ui.A01(A0m(), ((BonsaiDiscoveryViewModel) A0a.getValue()).A06, new C85744Ig(gridLayoutManager), 33);
            return;
        }
        throw C36331k8.A0d("contactPhotos");
    }
}
