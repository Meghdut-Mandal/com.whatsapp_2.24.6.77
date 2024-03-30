package X;

import android.graphics.Typeface;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.5Kp  reason: invalid class name and case insensitive filesystem */
public final class C106625Kp extends C96964oB {
    public final Typeface A00;
    public final View A01;
    public final WaTextView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106625Kp(View view) {
        super(view);
        AnonymousClass00C.A0D(view, 1);
        View view2 = this.A0H;
        this.A02 = C36341k9.A0Q(view2, R.id.title);
        this.A01 = C36361kB.A0G(view2, R.id.avatar_pack_layout);
        Typeface createFromAsset = Typeface.createFromAsset(view.getResources().getAssets(), "fonts/Roboto-Medium.ttf");
        AnonymousClass00C.A08(createFromAsset);
        this.A00 = createFromAsset;
    }
}
