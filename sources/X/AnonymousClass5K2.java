package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

/* renamed from: X.5K2  reason: invalid class name */
public abstract class AnonymousClass5K2 extends C102254zZ {
    public final WaImageView A00 = C36431kI.A0X(this, R.id.kept_status);
    public final WaImageView A01 = C36431kI.A0X(this, R.id.starred_status);
    public final FrameLayout A02;
    public final LinearLayout A03 = C90514aH.A0U(this, R.id.button_frame);

    public abstract int getMark();

    public int getMarkTintColor() {
        return -1;
    }

    public abstract float getRatio();

    public void setMessage(AnonymousClass2bU r6) {
        this.A01 = r6;
        WaImageView waImageView = this.A01;
        WaImageView waImageView2 = this.A00;
        if (r6 != null) {
            C36421kH.A0v(waImageView, r6.A15 ? 1 : 0, 0, 8);
            C36421kH.A0v(waImageView2, C65453Sc.A03(this.A01) ? 1 : 0, 0, 8);
        }
    }

    public void setRadius(int i) {
        this.A00 = i;
        if (i > 0) {
            FrameLayout frameLayout = this.A02;
            C36371kC.A13(getContext(), frameLayout, R.drawable.search_media_thumbnail_rounded_overlay);
            C90474aD.A0z(frameLayout);
            ((GradientDrawable) frameLayout.getBackground()).setCornerRadius((float) i);
        }
    }

    public AnonymousClass5K2(Context context) {
        super(context);
        this.A00 = getRatio();
        View.inflate(context, R.layout.f9nameremoved, this);
        FrameLayout A0T = C36441kJ.A0T(this, R.id.overlay);
        this.A02 = A0T;
        ImageView A0G = C36401kF.A0G(this, R.id.button_image);
        Drawable A002 = AnonymousClass00E.A00(context, getMark());
        if (A002 != null) {
            int markTintColor = getMarkTintColor();
            A002 = markTintColor != -1 ? AnonymousClass3UF.A04(context, A002, markTintColor) : A002;
            A0G.setImageDrawable(A002);
            A0T.setLayoutParams(new FrameLayout.LayoutParams(-1, A002.getIntrinsicHeight() * 2, 80));
            A0T.setVisibility(0);
            A0G.setImageDrawable(A002);
        }
    }
}
