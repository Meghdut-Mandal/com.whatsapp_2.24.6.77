package com.whatsapp;

import X.AnonymousClass00E;
import X.AnonymousClass076;
import X.AnonymousClass08I;
import X.AnonymousClass1N6;
import X.C134926bp;
import X.C136226dy;
import X.C1496972k;
import X.C16550pQ;
import X.C18740tg;
import X.C19770wU;
import X.C20810yC;
import X.C23871Ae;
import X.C36351kA;
import X.C36361kB;
import X.C36401kF;
import X.C36441kJ;
import X.C95694m3;
import X.C95924mV;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

public class IntentChooserBottomSheetDialogFragment extends Hilt_IntentChooserBottomSheetDialogFragment implements C16550pQ {
    public int A00;
    public int A01;
    public C20810yC A02;
    public C23871Ae A03;
    public AnonymousClass1N6 A04;
    public C19770wU A05;
    public Integer A06;
    public ArrayList A07;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        boolean A0E = this.A02.A0E(689);
        int i = R.layout.f9nameremoved;
        if (A0E) {
            i = R.layout.f9nameremoved;
        }
        View A0E2 = C36361kB.A0E(layoutInflater, viewGroup, i);
        Bundle A0b = A0b();
        this.A00 = A0b.getInt("request_code");
        ArrayList parcelableArrayList = A0b.getParcelableArrayList("choosable_intents");
        C18740tg.A06(parcelableArrayList);
        this.A07 = C36441kJ.A15(parcelableArrayList);
        this.A01 = A0b.getInt("title_resource");
        if (A0b.containsKey("parent_fragment")) {
            this.A06 = Integer.valueOf(A0b.getInt("parent_fragment"));
        }
        TextView A0E3 = C36351kA.A0E(A0E2);
        RecyclerView recyclerView = (RecyclerView) A0E2.findViewById(R.id.intent_recycler);
        A0a();
        recyclerView.setLayoutManager(new C95694m3(this));
        ArrayList arrayList = this.A07;
        ArrayList A0v = C36401kF.A0v(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C134926bp r1 = (C134926bp) it.next();
            if (r1.A04) {
                A0v.add(r1);
                it.remove();
            }
        }
        Toolbar toolbar = (Toolbar) A0E2.findViewById(R.id.toolbar);
        if (toolbar != null) {
            Iterator it2 = A0v.iterator();
            while (it2.hasNext()) {
                C134926bp r8 = (C134926bp) it2.next();
                Drawable A002 = AnonymousClass00E.A00(A0a(), r8.A05);
                if (!(A002 == null || r8.A02 == null)) {
                    A002 = AnonymousClass08I.A01(A002);
                    AnonymousClass076.A06(A002, r8.A02.intValue());
                }
                toolbar.getMenu().add(0, r8.A00, 0, r8.A06).setIcon(A002).setIntent(r8.A07).setShowAsAction(r8.A01);
            }
            toolbar.A0C = new C136226dy(this);
        }
        recyclerView.setAdapter(new C95924mV(this, this.A07));
        A0E3.setText(this.A01);
        if (A1o()) {
            A0E2.setBackground((Drawable) null);
        }
        return A0E2;
    }

    public void A1M() {
        if (this.A02.A0E(6849) && this.A00 == 14) {
            this.A05.Boy(new C1496972k(this, 0));
        }
        super.A1M();
    }
}
