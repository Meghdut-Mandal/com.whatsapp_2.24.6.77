package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import com.whatsapp.HomePagerSlidingTabStrip;

/* renamed from: X.1oq  reason: invalid class name and case insensitive filesystem */
public abstract class C38431oq extends HorizontalScrollView implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;

    public void A02() {
        if (this instanceof HomePagerSlidingTabStrip) {
            HomePagerSlidingTabStrip homePagerSlidingTabStrip = (HomePagerSlidingTabStrip) this;
            if (!homePagerSlidingTabStrip.A00) {
                homePagerSlidingTabStrip.A00 = true;
                homePagerSlidingTabStrip.generatedComponent();
            }
        } else if (!this.A01) {
            this.A01 = true;
            generatedComponent();
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

    public C38431oq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02();
    }
}
