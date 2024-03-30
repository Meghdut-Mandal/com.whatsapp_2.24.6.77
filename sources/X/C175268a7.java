package X;

import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.8a7  reason: invalid class name and case insensitive filesystem */
public final class C175268a7 extends C81843xi {
    public final AnonymousClass141 A00;
    public final /* synthetic */ C175328aD A01;

    public C175268a7(AnonymousClass141 r1, C175328aD r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object A02() {
        boolean A06 = this.A00.A06();
        C175328aD r2 = this.A01;
        if (A06) {
            r2.A00 = null;
            return null;
        }
        Context context = r2.A02.A00;
        return r2.A01.A07(context, this.A00, 0.0f, context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), false);
    }
}
