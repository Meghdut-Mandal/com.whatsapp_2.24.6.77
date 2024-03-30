package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.24C  reason: invalid class name */
public final class AnonymousClass24C extends TextEmojiLabel implements C22927Ayd {
    public final AnonymousClass1T1 A00;
    public final AnonymousClass2bI A01;
    public final Context A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass24C(Context context, AnonymousClass1T1 r5, AnonymousClass2bI r6) {
        super(context, (AttributeSet) null);
        AnonymousClass00C.A0D(r5, 1);
        this.A00 = r5;
        this.A02 = context;
        this.A01 = r6;
        AnonymousClass088.A06(this, R.style.f13nameremoved);
        setGravity(17);
        A0I(this.A00.A0O(this.A01, true));
    }

    public View getBodyView() {
        return this;
    }

    public LinearLayout.LayoutParams getBodyViewLayoutParams() {
        LinearLayout.LayoutParams A0N = C36381kD.A0N();
        A0N.gravity = 3;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        A0N.setMargins(dimensionPixelSize, getResources().getDimensionPixelSize(R.dimen.f7nameremoved), dimensionPixelSize, A0N.bottomMargin);
        return A0N;
    }
}
