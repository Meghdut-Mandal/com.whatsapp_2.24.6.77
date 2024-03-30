package X;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

/* renamed from: X.4jn  reason: invalid class name and case insensitive filesystem */
public final class C95094jn extends ConstraintLayout {
    public final AnonymousClass00T A00;
    public final AnonymousClass00T A01;
    public final AnonymousClass00T A02;
    public final AnonymousClass00T A03;
    public final WaImageView A04 = C90474aD.A0P(this, R.id.stickers_upsell_image);

    public C95094jn(Context context) {
        super(context, (AttributeSet) null, 0);
        C000800j r1 = C000800j.NONE;
        this.A03 = C001400p.A00(r1, new C152667Lj(context));
        this.A01 = C001400p.A00(r1, new C152647Lh(context));
        this.A02 = C001400p.A00(r1, new C152657Li(context));
        this.A00 = C001400p.A00(r1, new C152637Lg(context));
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this, true);
        setBackgroundResource(R.drawable.stickers_upsell_background);
        C36331k8.A0q(context, this, R.string.f12nameremoved);
        C36361kB.A0G(this, R.id.stickers_upsell_close).setVisibility(0);
    }

    private final int getImageHeightLandscape() {
        return C36331k8.A02(this.A00);
    }

    private final int getImageHeightPortrait() {
        return C36331k8.A02(this.A01);
    }

    private final int getImageWidthLandscape() {
        return C36331k8.A02(this.A02);
    }

    private final int getImageWidthPortrait() {
        return C36331k8.A02(this.A03);
    }

    public void onConfigurationChanged(Configuration configuration) {
        int A022;
        int A023;
        super.onConfigurationChanged(configuration);
        if (configuration != null) {
            if (configuration.orientation == 2) {
                A022 = C36331k8.A02(this.A02);
            } else {
                A022 = C36331k8.A02(this.A03);
            }
            if (configuration.orientation == 2) {
                A023 = C36331k8.A02(this.A00);
            } else {
                A023 = C36331k8.A02(this.A01);
            }
            this.A04.setLayoutParams(new AnonymousClass0BJ(A022, A023));
        }
    }
}
