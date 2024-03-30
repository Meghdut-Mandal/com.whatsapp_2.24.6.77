package com.whatsapp.bonsai.components;

import X.AnonymousClass00C;
import X.C36321k7;
import X.C36391kE;
import X.C56142vo;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;

public final class InputPrompt extends ConstraintLayout {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InputPrompt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C36321k7.A0v(context, 1, attributeSet);
        View.inflate(context, R.layout.f9nameremoved, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C56142vo.A00);
        AnonymousClass00C.A08(obtainStyledAttributes);
        ImageView A0N = C36391kE.A0N(this, R.id.input_icon);
        TextView A0P = C36391kE.A0P(this, R.id.text_entry);
        try {
            A0N.setImageResource(obtainStyledAttributes.getResourceId(1, R.drawable.vec_bonsai_magic_button));
            A0P.setHint(obtainStyledAttributes.getResourceId(0, R.string.f12nameremoved));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
