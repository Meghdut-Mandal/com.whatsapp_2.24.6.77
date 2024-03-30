package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.R;

/* renamed from: X.4eT  reason: invalid class name and case insensitive filesystem */
public final class C92704eT extends FrameLayout {
    public final C106305Jd A00;

    public C92704eT(Context context) {
        super(context);
        C36351kA.A0C(this).inflate(R.layout.f9nameremoved, this, true);
        View A0G = C36361kB.A0G(this, R.id.parent_container);
        C106305Jd r0 = new C106305Jd(context);
        this.A00 = r0;
        ((ViewGroup) C36361kB.A0G(this, R.id.chips_container)).addView(r0);
        C36341k9.A0q(getContext(), A0G, R.color.f6nameremoved);
    }
}
