package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;

/* renamed from: X.8pO  reason: invalid class name and case insensitive filesystem */
public abstract class C182628pO extends C182688pU {
    public C102254zZ A00;

    public abstract String getDefaultMessageText();

    public abstract int getDrawableRes();

    public void setThumbnailOnClickListener(View.OnClickListener onClickListener) {
        this.A00.setId(R.id.thumb_view);
        this.A00.setOnClickListener(onClickListener);
    }

    public /* bridge */ /* synthetic */ CharSequence A06(AnonymousClass141 r12, AnonymousClass3T1 r13) {
        Drawable A0D = C165587tf.A0D(getContext(), getDrawableRes());
        TextPaint paint = this.A01.getPaint();
        int textSize = ((int) paint.getTextSize()) + getIconSizeIncrease();
        SpannableStringBuilder A0P = C36441kJ.A0P(AnonymousClass000.A0l("", "  ", AnonymousClass000.A0u()));
        C37351mE.A03(paint, A0D, A0P, textSize, 0, 1);
        Context context = getContext();
        boolean z = r13.A1J.A02;
        return AnonymousClass3TZ.A02(context, this.A01, this.A03, this.A06, r12, this.A08, A0P, z);
    }

    public int getIconSizeIncrease() {
        return C36341k9.A0F(this).getDimensionPixelSize(R.dimen.f7nameremoved);
    }

    public void setUpThumbView(C102254zZ r4) {
        r4.setRadius(getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
        r4.setLayoutParams(new FrameLayout.LayoutParams(getResources().getDimensionPixelSize(R.dimen.f7nameremoved), C36371kC.A03(this, R.dimen.f7nameremoved)));
        AnonymousClass1JZ.A03(r4, getResources().getDimensionPixelSize(R.dimen.f7nameremoved), 0);
    }

    public C182628pO(Context context, C33301f4 r2) {
        super(context, r2);
    }
}
