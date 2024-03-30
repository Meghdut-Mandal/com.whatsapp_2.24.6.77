package androidx.compose.ui.platform;

import X.AnonymousClass012;
import X.AnonymousClass01M;
import X.AnonymousClass01Y;
import X.AnonymousClass05R;
import X.C009003v;
import X.C112445du;
import X.C154867Tv;
import X.C158777iD;
import com.whatsapp.R;

public final class WrappedComposition implements C158777iD, AnonymousClass01Y {
    public AnonymousClass01M A00;
    public C009003v A01 = C112445du.A00;
    public boolean A02;
    public final C158777iD A03;
    public final AndroidComposeView A04;

    public void BhM(AnonymousClass05R r2, AnonymousClass012 r3) {
        if (r2 == AnonymousClass05R.ON_DESTROY) {
            dispose();
        } else if (r2 == AnonymousClass05R.ON_CREATE && !this.A02) {
            Bqa(this.A01);
        }
    }

    public void Bqa(C009003v r3) {
        this.A04.setOnViewTreeOwnersAvailable(new C154867Tv(this, r3));
    }

    public void dispose() {
        if (!this.A02) {
            this.A02 = true;
            this.A04.setTag(R.id.wrapped_composition_tag, (Object) null);
            AnonymousClass01M r0 = this.A00;
            if (r0 != null) {
                r0.A05(this);
            }
        }
        this.A03.dispose();
    }

    public WrappedComposition(C158777iD r2, AndroidComposeView androidComposeView) {
        this.A04 = androidComposeView;
        this.A03 = r2;
    }
}
