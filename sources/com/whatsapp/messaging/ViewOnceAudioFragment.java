package com.whatsapp.messaging;

import X.AnonymousClass1RY;
import X.AnonymousClass1V6;
import X.AnonymousClass3HF;
import X.AnonymousClass3MF;
import X.C175098Zq;
import X.C27731Pn;
import X.C36341k9;
import X.C36411kG;
import X.C46812bi;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public class ViewOnceAudioFragment extends Hilt_ViewOnceAudioFragment {
    public C27731Pn A00;
    public AnonymousClass3HF A01;
    public AnonymousClass1V6 A02;
    public AnonymousClass3MF A03;
    public AnonymousClass1RY A04;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        C36341k9.A0q(A0a(), inflate, R.color.f6nameremoved);
        inflate.setVisibility(0);
        A10(true);
        return inflate;
    }

    public void A1S(Bundle bundle, View view) {
        ViewGroup A0O = C36411kG.A0O(view, R.id.audio_bubble_container);
        C46812bi r10 = (C46812bi) this.A02;
        if (this.A04 == null) {
            this.A04 = this.A00.A05(A1D(), "conversation-row-inflater");
        }
        C175098Zq r4 = new C175098Zq(A1D(), this.A04, this, this.A01, this.A02, r10);
        r4.A24(true);
        r4.setEnabled(false);
        r4.setClickable(false);
        r4.setLongClickable(false);
        r4.A2M = false;
        A0O.removeAllViews();
        A0O.addView(r4);
    }
}
