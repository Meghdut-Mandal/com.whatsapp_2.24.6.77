package com.whatsapp.info.views;

import X.AnonymousClass00C;
import X.AnonymousClass22V;
import X.AnonymousClass231;
import X.C225314u;
import X.C33541fX;
import X.C36371kC;
import X.C36381kD;
import X.C36411kG;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

public class StarredMessageInfoView extends AnonymousClass231 {
    public final C225314u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StarredMessageInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        this.A00 = C36381kD.A0S(context);
        setIcon((int) R.drawable.ic_action_star);
        AnonymousClass22V.A01(context, this, R.string.f12nameremoved);
    }

    public final void setupOnClickListener(C33541fX r2) {
        AnonymousClass00C.A0D(r2, 0);
        setOnClickListener(r2);
    }

    public final void A08(long j, boolean z) {
        if (j <= 0 || z) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        WaTextView waTextView = new WaTextView(C36371kC.A0B(this));
        waTextView.setLayoutParams(C36371kC.A0N());
        waTextView.setId(R.id.starred_messages_count);
        ViewGroup A0O = C36411kG.A0O(this, R.id.right_view_container);
        View findViewById = A0O.findViewById(R.id.starred_messages_count);
        if (findViewById != null) {
            A0O.removeView(findViewById);
        }
        A0O.addView(waTextView);
        C36411kG.A1E(waTextView, this.A03.A0M(), j);
    }

    public final C225314u getActivity() {
        return this.A00;
    }
}
