package com.whatsapp.mediacomposer.bottombar.filterswipe;

import X.AnonymousClass00C;
import X.C36331k8;
import X.C36341k9;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;

public final class FilterSwipeView extends LinearLayout {
    public final TextView A00 = C36341k9.A0M(this, R.id.filter_swipe_text);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FilterSwipeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        View.inflate(getContext(), R.layout.f9nameremoved, this);
        C36331k8.A0q(context, this, R.string.f12nameremoved);
    }

    public final int getFilterSwipeTextViewVisibility() {
        return this.A00.getVisibility();
    }

    public final void setFilterSwipeTextVisibility(int i) {
        this.A00.setVisibility(i);
    }

    public final void setText(int i) {
        this.A00.setText(i);
    }
}
