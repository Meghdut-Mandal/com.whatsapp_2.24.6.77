package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.R;

/* renamed from: X.1o9  reason: invalid class name and case insensitive filesystem */
public final class C38271o9 extends FrameLayout implements C18700tb {
    public C18820ts A00;
    public AnonymousClass1QZ A01;
    public boolean A02;
    public final LottieAnimationView A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38271o9(Context context, C89014Ux r13) {
        super(context);
        C36321k7.A0v(context, 1, r13);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C36331k8.A0C(generatedComponent());
        }
        View.inflate(context, R.layout.f9nameremoved, this);
        View A0G = C36361kB.A0G(this, R.id.ti_bubble);
        Drawable A0H = C36381kD.A0H(C36371kC.A0B(this), R.drawable.balloon_incoming_normal);
        AnonymousClass00C.A08(A0H);
        Rect A06 = AnonymousClass001.A06();
        A0H.getPadding(A06);
        C100744vb r0 = new C100744vb(A0H, getWhatsAppLocale());
        r0.A00 = true;
        A0G.setBackground(r0);
        int dimensionPixelSize = C36341k9.A0F(this).getDimensionPixelSize(R.dimen.f7nameremoved);
        AnonymousClass1JZ.A07(A0G, getWhatsAppLocale(), C36341k9.A0F(this).getDimensionPixelSize(R.dimen.f7nameremoved), dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        getWhatsAppLocale();
        AnonymousClass1JZ.A03(A0G, r13.B8x() + A06.left, 0);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) C36361kB.A0G(this, R.id.typing_indicator);
        this.A03 = lottieAnimationView;
        lottieAnimationView.setSpeed(C36401kF.A1X(getWhatsAppLocale()) ? -1.0f : 1.0f);
        setVisibility(8);
    }

    public final void setWhatsAppLocale(C18820ts r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A01;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public final C18820ts getWhatsAppLocale() {
        C18820ts r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A09();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        LottieAnimationView lottieAnimationView = this.A03;
        if (i == 0) {
            lottieAnimationView.setAnimation((int) R.raw.typing_indicator);
            C34081gQ.A07(lottieAnimationView, C36341k9.A0F(this).getColor(R.color.f6nameremoved));
            lottieAnimationView.A04();
            return;
        }
        lottieAnimationView.A03();
    }
}
