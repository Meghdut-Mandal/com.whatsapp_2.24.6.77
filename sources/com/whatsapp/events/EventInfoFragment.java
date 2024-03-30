package com.whatsapp.events;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass17Y;
import X.AnonymousClass4BP;
import X.C005502l;
import X.C012005e;
import X.C023509x;
import X.C19730wQ;
import X.C20810yC;
import X.C27731Pn;
import X.C29541Xa;
import X.C29701Xq;
import X.C36321k7;
import X.C36331k8;
import X.C36371kC;
import X.C36411kG;
import X.C36431kI;
import X.C40931wL;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;

public final class EventInfoFragment extends Hilt_EventInfoFragment {
    public View A00;
    public RecyclerView A01;
    public AnonymousClass17Y A02;
    public C19730wQ A03;
    public C27731Pn A04;
    public C29541Xa A05;
    public C29701Xq A06;
    public C40931wL A07;
    public C20810yC A08;
    public WDSButton A09;
    public C005502l A0A;
    public final AnonymousClass00T A0B = C36431kI.A1I(new AnonymousClass4BP(this));

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return C36371kC.A0J(layoutInflater, viewGroup, R.layout.f9nameremoved, false);
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        this.A09 = C36431kI.A0y(view, R.id.event_info_action);
        this.A00 = C012005e.A02(view, R.id.event_info_action_divider);
        this.A01 = (RecyclerView) C012005e.A02(view, R.id.event_responses_recycler_view);
        C27731Pn r2 = this.A04;
        if (r2 != null) {
            this.A07 = new C40931wL(r2.A03(A0a(), this, "event-info-fragment"));
            RecyclerView recyclerView = this.A01;
            if (recyclerView != null) {
                A1D();
                C36321k7.A0Q(recyclerView);
            }
            RecyclerView recyclerView2 = this.A01;
            if (recyclerView2 != null) {
                C40931wL r0 = this.A07;
                if (r0 == null) {
                    throw C36331k8.A0Y();
                }
                recyclerView2.setAdapter(r0);
            }
            C36331k8.A1T(new EventInfoFragment$onViewCreated$1(this, (C023509x) null), C36411kG.A0T(this));
            return;
        }
        throw C36331k8.A0d("contactPhotos");
    }

    public void A1J() {
        WDSButton wDSButton = this.A09;
        if (wDSButton != null) {
            wDSButton.setOnClickListener((View.OnClickListener) null);
        }
        this.A09 = null;
        this.A00 = null;
        this.A01 = null;
        super.A1J();
    }
}
