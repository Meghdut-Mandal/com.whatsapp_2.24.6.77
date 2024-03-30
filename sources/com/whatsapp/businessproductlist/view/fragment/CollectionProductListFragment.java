package com.whatsapp.businessproductlist.view.fragment;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass17Y;
import X.AnonymousClass185;
import X.AnonymousClass1KK;
import X.AnonymousClass1KP;
import X.AnonymousClass3L6;
import X.BA7;
import X.C19730wQ;
import X.C198849eI;
import X.C202279lS;
import X.C20810yC;
import X.C22116Ah1;
import X.C22358AlL;
import X.C22359AlM;
import X.C22924Aya;
import X.C24801Dv;
import X.C36331k8;
import X.C36381kD;
import X.C36431kI;
import X.C95354ke;
import android.os.Bundle;
import android.view.View;

public class CollectionProductListFragment extends Hilt_CollectionProductListFragment {
    public int A00 = -1;
    public C24801Dv A01;
    public AnonymousClass17Y A02;
    public C19730wQ A03;
    public AnonymousClass1KK A04;
    public C198849eI A05;
    public C202279lS A06;
    public AnonymousClass1KP A07;
    public AnonymousClass16D A08;
    public AnonymousClass185 A09;
    public AnonymousClass171 A0A;
    public C20810yC A0B;
    public AnonymousClass3L6 A0C;
    public Integer A0D;
    public String A0E;
    public String A0F;
    public final AnonymousClass00T A0G = C36431kI.A1I(new C22116Ah1(this));

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        C95354ke r5 = (C95354ke) this.A0G.getValue();
        r5.A00.A03(r5.A01.A00, A1a(), A1c(), C36381kD.A1U(this.A00, -1));
    }

    public final String A1c() {
        String str = this.A0E;
        if (str != null) {
            return str;
        }
        throw C36331k8.A0d("collectionId");
    }

    public void A1L() {
        super.A1L();
        if (this.A0D != null) {
            C22924Aya aya = this.A0B;
            AnonymousClass00C.A0B(aya);
            Integer num = this.A0D;
            AnonymousClass00C.A0B(num);
            aya.BXZ(num.intValue());
            this.A0D = null;
        }
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        String string = A0b().getString("collection-id", "");
        AnonymousClass00C.A08(string);
        this.A0E = string;
        this.A0F = A0b().getString("collection-index");
        this.A00 = A0b().getInt("category_browsing_entry_point", -1);
        A0b().getInt("category_level", -1);
        AnonymousClass00T r3 = this.A0G;
        BA7.A01(this, ((C95354ke) r3.getValue()).A00.A03, new C22358AlL(this), 30);
        BA7.A01(this, ((C95354ke) r3.getValue()).A00.A05, new C22359AlM(this), 29);
    }
}
