package com.whatsapp.businessdirectory.view.custom;

import X.AnonymousClass00C;
import X.C05250Oz;
import X.C12380hx;
import X.C12810ih;
import X.C14610lu;
import X.C15060md;
import X.C18660tW;
import X.C36381kD;
import X.C36391kE;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.R;

public final class DirectoryProductImagesCardView extends CardView {
    public ShimmerFrameLayout A00;
    public final LinearLayout A01;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DirectoryProductImagesCardView(Context context) {
        this(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    public final boolean A00() {
        C12810ih A02 = C15060md.A02(new C14610lu(ShimmerFrameLayout.class), new C18660tW(this.A01, 0));
        AnonymousClass00C.A0E(A02, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesJvmKt.filterIsInstance>");
        C12380hx r3 = new C12380hx(A02);
        while (r3.hasNext()) {
            if (C36391kE.A0N((View) r3.next(), R.id.product_image_view).getDrawable() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean A01() {
        C12810ih A02 = C15060md.A02(new C14610lu(ShimmerFrameLayout.class), new C18660tW(this.A01, 0));
        AnonymousClass00C.A0E(A02, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesJvmKt.filterIsInstance>");
        C12380hx r2 = new C12380hx(A02);
        while (r2.hasNext()) {
            if (C36391kE.A0N((View) r2.next(), R.id.product_empty_view).getDrawable().isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final LinearLayout getImagesContainerView() {
        return this.A01;
    }

    public /* synthetic */ DirectoryProductImagesCardView(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r7) {
        this(context, C36381kD.A0I(attributeSet, i2), C36391kE.A01(i2, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DirectoryProductImagesCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, linearLayout.getResources().getDimensionPixelSize(R.dimen.f7nameremoved)));
        this.A01 = linearLayout;
        addView(linearLayout);
        setPreventCornerOverlap(false);
        setRadius(getResources().getDimension(R.dimen.f7nameremoved));
        setCardElevation(0.0f);
        setCardBackgroundColor(0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DirectoryProductImagesCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }
}
