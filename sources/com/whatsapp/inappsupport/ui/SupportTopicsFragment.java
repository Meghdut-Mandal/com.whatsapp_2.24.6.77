package com.whatsapp.inappsupport.ui;

import X.AnonymousClass000;
import X.C18740tg;
import X.C24801Dv;
import X.C37891nN;
import X.C66733Xc;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.whatsapp.R;
import java.util.ArrayList;

public class SupportTopicsFragment extends Hilt_SupportTopicsFragment {
    public C66733Xc A00;
    public SupportTopicsActivity A01;
    public ArrayList A02;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.topic_list_header);
        if (this.A01.A01 != 2) {
            i = 8;
        }
        findViewById.setVisibility(i);
        ((AbsListView) inflate.findViewById(R.id.topic_list)).setAdapter(new C37891nN(this.A01, this.A02));
        return inflate;
    }

    public void A1O(Context context) {
        if (C24801Dv.A00(context) instanceof SupportTopicsActivity) {
            this.A01 = (SupportTopicsActivity) C24801Dv.A00(context);
            super.A1O(context);
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SupportTopicsFragment");
        A0u.append(" can only be used with ");
        throw AnonymousClass000.A0g("SupportTopicsActivity", A0u);
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        this.A00 = (C66733Xc) A0b().getParcelable("parent_topic");
        ArrayList parcelableArrayList = A0b().getParcelableArrayList("topics");
        C18740tg.A06(parcelableArrayList);
        this.A02 = parcelableArrayList;
    }
}
