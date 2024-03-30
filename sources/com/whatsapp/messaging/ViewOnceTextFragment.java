package com.whatsapp.messaging;

import X.AnonymousClass2IN;
import X.AnonymousClass2bV;
import X.C36361kB;
import X.C36411kG;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public class ViewOnceTextFragment extends Hilt_ViewOnceTextFragment {
    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0E = C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
        A10(true);
        return A0E;
    }

    public void A1S(Bundle bundle, View view) {
        ViewGroup A0O = C36411kG.A0O(view, R.id.text_bubble_container);
        AnonymousClass2IN r1 = new AnonymousClass2IN(A0i(), this, (AnonymousClass2bV) this.A02);
        r1.A24(true);
        r1.setEnabled(false);
        r1.setClickable(false);
        r1.setLongClickable(false);
        r1.A2M = false;
        A0O.removeAllViews();
        A0O.addView(r1);
    }
}
