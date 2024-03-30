package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.WaImageView;

/* renamed from: X.4wn  reason: invalid class name and case insensitive filesystem */
public abstract class C101044wn extends WaImageView {
    public boolean A00;

    public void A03() {
        if (!this.A00) {
            this.A00 = true;
            this.A00 = C36341k9.A0U(generatedComponent());
        }
    }

    public C101044wn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A03();
    }

    public C101044wn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A03();
    }

    public C101044wn(Context context) {
        super(context);
        A03();
    }
}
