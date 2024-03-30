package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.whatsapp.WaImageView;

/* renamed from: X.1Rd  reason: invalid class name and case insensitive filesystem */
public abstract class C28061Rd extends AppCompatImageView implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;

    public void A03() {
        if (!this.A01) {
            this.A01 = true;
            ((WaImageView) this).A00 = (C18820ts) ((C27861Qc) ((C27851Qb) generatedComponent())).A0M.A9X.get();
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

    public C28061Rd(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A03();
    }

    public C28061Rd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A03();
    }

    public C28061Rd(Context context) {
        super(context, (AttributeSet) null);
        A03();
    }
}
