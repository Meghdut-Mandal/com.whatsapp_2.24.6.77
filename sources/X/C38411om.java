package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.whatsapp.gifsearch.GifSearchContainer;

/* renamed from: X.1om  reason: invalid class name and case insensitive filesystem */
public abstract class C38411om extends FrameLayout implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;

    public void A01() {
        if (!this.A01) {
            this.A01 = true;
            GifSearchContainer gifSearchContainer = (GifSearchContainer) this;
            C18800tq r1 = ((C27861Qc) ((C27851Qb) generatedComponent())).A0M;
            gifSearchContainer.A0C = (AnonymousClass1GZ) r1.AOO.get();
            gifSearchContainer.A0I = C36401kF.A0f(r1);
            gifSearchContainer.A0B = C36351kA.A0g(r1);
            gifSearchContainer.A07 = C36351kA.A0U(r1);
            gifSearchContainer.A09 = C36341k9.A0T(r1);
            gifSearchContainer.A08 = C36351kA.A0Y(r1);
            gifSearchContainer.A0H = C36351kA.A0m(r1);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C38411om(Context context) {
        super(context);
        A01();
    }

    public C38411om(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
    }

    public C38411om(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A01();
    }

    public C38411om(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }
}
