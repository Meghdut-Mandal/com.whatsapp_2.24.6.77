package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.whatsapp.R;

/* renamed from: X.0Fl  reason: invalid class name and case insensitive filesystem */
public class C03480Fl extends AppCompatImageView implements C17000qY {
    public final /* synthetic */ C09460cP A00;

    public boolean BQ3() {
        return false;
    }

    public boolean BQ4() {
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C03480Fl(Context context, C09460cP r4) {
        super(context, (AttributeSet) null, R.attr.f4nameremoved);
        this.A00 = r4;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AnonymousClass08F.A00(this, getContentDescription());
        setOnTouchListener(new C18110sd(this, this, r4, 0));
    }

    public boolean performClick() {
        if (!super.performClick()) {
            playSoundEffect(0);
            this.A00.A03();
        }
        return true;
    }

    public boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (!(drawable == null || background == null)) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            AnonymousClass076.A07(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
