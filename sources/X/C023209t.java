package X;

import android.view.View;

/* renamed from: X.09t  reason: invalid class name and case insensitive filesystem */
public class C023209t extends C004201w {
    public final /* synthetic */ AnonymousClass02E A00;

    public C023209t(AnonymousClass02E r1) {
        this.A00 = r1;
    }

    public View A00(int i) {
        AnonymousClass02E r2 = this.A00;
        View view = r2.A0F;
        if (view != null) {
            return view.findViewById(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(r2);
        sb.append(" does not have a view");
        throw new IllegalStateException(sb.toString());
    }

    public boolean A01() {
        if (this.A00.A0F != null) {
            return true;
        }
        return false;
    }
}
