package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.24D  reason: invalid class name */
public abstract class AnonymousClass24D extends TextEmojiLabel implements C22930Ayg {
    public AnonymousClass24D(Context context) {
        super(context);
        AnonymousClass088.A06(this, R.style.f13nameremoved);
        setGravity(17);
        setVisibility(8);
    }

    public View getSubtitleView() {
        return this;
    }

    public LinearLayout.LayoutParams getSubtitleViewLayoutParams() {
        LinearLayout.LayoutParams A0N = C36381kD.A0N();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        A0N.setMargins(dimensionPixelSize, getResources().getDimensionPixelSize(R.dimen.f7nameremoved), dimensionPixelSize, A0N.bottomMargin);
        return A0N;
    }
}
