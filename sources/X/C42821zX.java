package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import com.whatsapp.WaViewPager;

/* renamed from: X.1zX  reason: invalid class name and case insensitive filesystem */
public abstract class C42821zX extends ViewPager implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C42821zX(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            ((WaViewPager) this).A00 = C36341k9.A0T(((C27861Qc) ((C27851Qb) generatedComponent())).A0M);
        }
    }

    public C42821zX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            ((WaViewPager) this).A00 = C36341k9.A0T(((C27861Qc) ((C27851Qb) generatedComponent())).A0M);
        }
    }
}
