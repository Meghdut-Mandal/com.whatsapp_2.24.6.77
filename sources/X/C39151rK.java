package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;

/* renamed from: X.1rK  reason: invalid class name and case insensitive filesystem */
public final class C39151rK extends ConstraintLayout implements C18700tb {
    public C18820ts A00;
    public AnonymousClass1QZ A01;
    public boolean A02;

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

    public C39151rK(Context context, C33541fX r6, int i, int i2, int i3) {
        super(context);
        Resources resources;
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C36331k8.A0C(generatedComponent());
        }
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this, true);
        C36391kE.A0N(this, R.id.icon).setImageResource(i3);
        ImageView A0N = C36391kE.A0N(this, R.id.right_arrow_icon);
        C36321k7.A0L(getContext(), A0N, getWhatsAppLocale(), R.drawable.ic_fab_next);
        if (C222013h.A07 && (resources = context.getResources()) != null) {
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f7nameremoved);
            A0N.getLayoutParams().width = dimensionPixelSize;
            C36411kG.A1A(A0N, dimensionPixelSize);
        }
        C36351kA.A0E(this).setText(i);
        TextView A0P = C36391kE.A0P(this, R.id.description);
        if (i2 == 0) {
            A0P.setVisibility(8);
        } else {
            A0P.setText(i2);
        }
        findViewById(R.id.container).setOnClickListener(r6);
    }
}
