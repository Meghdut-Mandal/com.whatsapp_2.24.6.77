package com.whatsapp.expressionstray.stickergrid;

import X.AnonymousClass00C;
import X.AnonymousClass099;
import X.C012005e;
import X.C05250Oz;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36431kI;
import X.C36441kJ;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;

public final class StickersUpsellItemView extends ConstraintLayout {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StickersUpsellItemView(Context context) {
        this(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    public /* synthetic */ StickersUpsellItemView(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r7) {
        this(context, C36381kD.A0I(attributeSet, i2), C36391kE.A01(i2, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickersUpsellItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this, true);
        setBackgroundResource(R.drawable.stickers_upsell_ripple_background);
        C012005e.A02(this, R.id.stickers_upsell_close).setVisibility(0);
        C012005e.A02(this, R.id.stickers_upsell_image).setVisibility(8);
        C36351kA.A1A(this, R.id.stickers_upsell_new, 8);
        C36391kE.A0O(this, R.id.stickers_upsell_title).setText(R.string.f12nameremoved);
        TextView A0O = C36391kE.A0O(this, R.id.stickers_upsell_subtitle);
        String A0m = C36361kB.A0m(A0O.getContext(), R.string.f12nameremoved);
        String A0x = C36351kA.A0x(A0O.getContext(), A0m, new Object[1], 0, R.string.f12nameremoved);
        int A0C = AnonymousClass099.A0C(A0x, A0m, 0, false);
        SpannableStringBuilder A0P = C36441kJ.A0P(A0x);
        A0P.setSpan(new ForegroundColorSpan(C36351kA.A02(A0O.getContext(), A0O.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved)), A0C, C36441kJ.A09(A0m, A0C), 33);
        A0O.setText(A0P);
        A0O.setContentDescription(C36431kI.A18(A0O));
        A0O.setPadding(A0O.getPaddingLeft(), A0O.getPaddingTop(), A0O.getPaddingRight(), A0O.getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StickersUpsellItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }
}
