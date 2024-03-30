package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.24E  reason: invalid class name */
public final class AnonymousClass24E extends TextEmojiLabel implements C22931Ayh {
    public final AnonymousClass1T1 A00;
    public final AnonymousClass2bI A01;
    public final Context A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass24E(Context context, AnonymousClass1T1 r4, AnonymousClass2bI r5) {
        super(context, (AttributeSet) null);
        AnonymousClass00C.A0D(r4, 1);
        this.A00 = r4;
        this.A02 = context;
        this.A01 = r5;
        AnonymousClass088.A06(this, R.style.f13nameremoved);
        setGravity(17);
        setEllipsize(TextUtils.TruncateAt.END);
        setMaxLines(3);
        A0I(this.A00.A0N(this.A01));
    }

    public View getTitleView() {
        return this;
    }

    public LinearLayout.LayoutParams getTitleViewLayoutParams() {
        LinearLayout.LayoutParams A0N = C36381kD.A0N();
        A0N.gravity = 17;
        A0N.setMargins(0, getResources().getDimensionPixelSize(R.dimen.f7nameremoved), 0, A0N.bottomMargin);
        return A0N;
    }
}
