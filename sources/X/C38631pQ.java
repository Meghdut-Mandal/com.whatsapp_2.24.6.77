package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.whatsapp.wds.components.actiontile.WDSActionTile;

/* renamed from: X.1pQ  reason: invalid class name and case insensitive filesystem */
public abstract class C38631pQ extends LinearLayout implements C18700tb {
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

    public C38631pQ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            ((WDSActionTile) this).A04 = C36341k9.A0V(((C27861Qc) ((C27851Qb) generatedComponent())).A0M);
        }
    }
}
