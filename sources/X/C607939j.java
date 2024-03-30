package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.39j  reason: invalid class name and case insensitive filesystem */
public final class C607939j {
    public final View A00;
    public final FrameLayout A01;
    public final ImageView A02;
    public final ImageView A03;
    public final TextView A04;
    public final TextView A05;

    public C607939j(View view) {
        AnonymousClass00C.A0D(view, 1);
        this.A05 = C36341k9.A0M(view, R.id.banner_title);
        this.A04 = C36341k9.A0M(view, R.id.banner_text);
        this.A02 = C36341k9.A0L(view, R.id.banner_icon);
        this.A03 = C36341k9.A0L(view, R.id.cancel);
        this.A00 = C36361kB.A0G(view, R.id.in_app_banner);
        this.A01 = (FrameLayout) C36361kB.A0G(view, R.id.banner_icon_frame);
    }
}
