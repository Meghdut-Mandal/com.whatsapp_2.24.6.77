package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;
import com.whatsapp.collections.observablelistview.ObservableListView;

/* renamed from: X.1fN  reason: invalid class name and case insensitive filesystem */
public abstract class C33461fN extends ListView implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;

    public void A01() {
        if (!this.A01) {
            this.A01 = true;
            ((ObservableListView) this).A0A = (AnonymousClass13J) ((C27861Qc) ((C27851Qb) generatedComponent())).A0M.A6z.get();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = new AnonymousClass1QZ(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C33461fN(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
    }

    public C33461fN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }

    public C33461fN(Context context) {
        super(context);
        A01();
    }
}
