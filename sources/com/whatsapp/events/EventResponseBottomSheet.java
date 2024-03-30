package com.whatsapp.events;

import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass3Y1;
import X.AnonymousClass4BQ;
import X.AnonymousClass4BR;
import X.C012005e;
import X.C19420v0;
import X.C36341k9;
import X.C36431kI;
import X.C52292pC;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.whatsapp.R;

public final class EventResponseBottomSheet extends Hilt_EventResponseBottomSheet {
    public C19420v0 A00;
    public AnonymousClass005 A01;
    public AnonymousClass005 A02;
    public AnonymousClass005 A03;
    public LinearLayout A04;
    public LinearLayout A05;
    public final AnonymousClass00T A06 = C36431kI.A1I(new AnonymousClass4BQ(this));
    public final AnonymousClass00T A07 = C36431kI.A1I(new AnonymousClass4BR(this));

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        this.A04 = (LinearLayout) C012005e.A02(view, R.id.event_going_btn);
        this.A05 = (LinearLayout) C012005e.A02(view, R.id.event_not_going_btn);
        ImageView A0L = C36341k9.A0L(view, R.id.event_going_circle);
        ImageView A0L2 = C36341k9.A0L(view, R.id.event_not_going_circle);
        int ordinal = ((C52292pC) this.A06.getValue()).ordinal();
        if (ordinal == 1) {
            A0L.setImageResource(R.drawable.ic_spam_ok);
        } else if (ordinal == 2) {
            A0L2.setImageResource(R.drawable.ic_settings_disable);
        }
        LinearLayout linearLayout = this.A04;
        if (linearLayout != null) {
            AnonymousClass3Y1.A00(linearLayout, this, 4);
        }
        LinearLayout linearLayout2 = this.A05;
        if (linearLayout2 != null) {
            AnonymousClass3Y1.A00(linearLayout2, this, 5);
        }
    }

    public void A1J() {
        LinearLayout linearLayout = this.A04;
        if (linearLayout != null) {
            linearLayout.setOnClickListener((View.OnClickListener) null);
        }
        LinearLayout linearLayout2 = this.A05;
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener((View.OnClickListener) null);
        }
        this.A04 = null;
        this.A05 = null;
        super.A1J();
    }
}
