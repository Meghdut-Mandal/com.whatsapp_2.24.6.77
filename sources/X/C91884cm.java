package X;

import android.text.style.LeadingMarginSpan;
import android.text.style.UpdateLayout;

/* renamed from: X.4cm  reason: invalid class name and case insensitive filesystem */
public final class C91884cm extends LeadingMarginSpan.Standard implements UpdateLayout {
    public final int A00;
    public final int A01;

    public C91884cm(int i, int i2) {
        super(0);
        this.A00 = i;
        this.A01 = i2;
    }

    public int getLeadingMargin(boolean z) {
        if (z) {
            return this.A00;
        }
        return this.A01;
    }

    public C91884cm() {
        this(2, 2);
    }
}
