package com.whatsapp.storage;

import X.AnonymousClass11F;
import X.AnonymousClass13J;
import X.AnonymousClass16J;
import X.AnonymousClass191;
import X.AnonymousClass1A1;
import X.AnonymousClass1DF;
import X.AnonymousClass1SV;
import X.AnonymousClass1TA;
import X.AnonymousClass1X7;
import X.AnonymousClass2Ty;
import X.AnonymousClass2bU;
import X.AnonymousClass4V2;
import X.C011004s;
import X.C18740tg;
import X.C19700wN;
import X.C20310xM;
import X.C24801Dv;
import X.C28981Uw;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C74833mF;
import X.C89004Uw;
import X.C90394a5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;

public class StorageUsageMediaGalleryFragment extends Hilt_StorageUsageMediaGalleryFragment {
    public int A00;
    public C24801Dv A01;
    public C19700wN A02;
    public C20310xM A03;
    public AnonymousClass1DF A04;
    public AnonymousClass16J A05;
    public AnonymousClass1TA A06;
    public AnonymousClass11F A07;
    public AnonymousClass1A1 A08;
    public AnonymousClass1X7 A09;
    public AnonymousClass1SV A0A;
    public AnonymousClass13J A0B;
    public final AnonymousClass191 A0C = C90394a5.A00(this, 35);

    public void A1P(Bundle bundle) {
        this.A0Y = true;
        Bundle bundle2 = this.A0A;
        if (bundle2 != null) {
            this.A00 = bundle2.getInt("storage_media_gallery_fragment_gallery_type", 0);
            TextView A0O = C36391kE.A0O(this.A0F, R.id.no_media_text);
            if (this.A00 == 0) {
                AnonymousClass11F A0i = C36351kA.A0i(bundle2, "storage_media_gallery_fragment_jid");
                C18740tg.A06(A0i);
                this.A07 = A0i;
                boolean z = A0i instanceof C28981Uw;
                int i = R.string.f12nameremoved;
                if (z) {
                    i = R.string.f12nameremoved;
                }
                A0O.setText(i);
            } else {
                A0O.setVisibility(8);
            }
        }
        C011004s.A09(this.A08, true);
        C011004s.A09(A0d().findViewById(R.id.no_media), true);
        A1g(false);
        this.A05.registerObserver(this.A0C);
    }

    public boolean A1k(AnonymousClass4V2 r5, AnonymousClass2Ty r6) {
        AnonymousClass2bU r3 = ((C74833mF) r5).A02;
        boolean A1i = A1i();
        C89004Uw r0 = (C89004Uw) A0i();
        if (A1i) {
            r6.setChecked(r0.Bvv(r3));
            return true;
        }
        r0.Bur(r3);
        r6.setChecked(true);
        return true;
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    public void A1H() {
        super.A1H();
        this.A05.unregisterObserver(this.A0C);
    }
}
