package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.AutoFitGridRecyclerView;

/* renamed from: X.4oN  reason: invalid class name and case insensitive filesystem */
public abstract class C97084oN extends RecyclerView implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;

    public void A16() {
        if (!this.A01) {
            this.A01 = true;
            AutoFitGridRecyclerView autoFitGridRecyclerView = (AutoFitGridRecyclerView) this;
            C18800tq r1 = ((C27861Qc) ((C27851Qb) generatedComponent())).A0M;
            autoFitGridRecyclerView.A01 = C36341k9.A0V(r1);
            autoFitGridRecyclerView.A00 = C36341k9.A0T(r1);
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

    public C97084oN(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A16();
    }

    public C97084oN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A16();
    }

    public C97084oN(Context context) {
        super(context, (AttributeSet) null);
        A16();
    }
}
