package X;

import android.content.Context;
import android.content.res.Resources;
import com.whatsapp.R;
import java.util.HashMap;

/* renamed from: X.8lk  reason: invalid class name and case insensitive filesystem */
public class C180408lk extends C200239gv {
    public HashMap A04(Context context) {
        AnonymousClass00C.A0D(context, 0);
        HashMap A04 = super.A04(context);
        A04.put(0, context.getString(R.string.f12nameremoved));
        return A04;
    }

    public HashMap A05(Context context, C202319lY r12, C207199ui r13) {
        Context context2 = context;
        AnonymousClass00C.A0D(context, 0);
        C202319lY r5 = r12;
        HashMap A05 = super.A05(context, r12, r13);
        if (this.A06.A08.A0K(r13.A0L)) {
            A05.put(C36371kC.A0p(), A01(context2, r5, (C206929uE) null, (C206909uC) null, context.getString(R.string.f12nameremoved), 5));
        }
        return A05;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C180408lk(Resources resources, AnonymousClass185 r2, C19970wo r3, C18820ts r4, AnonymousClass1A5 r5, C20810yC r6, AnonymousClass1EV r7, AnonymousClass1EU r8, AnonymousClass1FR r9, C32681e1 r10) {
        super(resources, r2, r3, r4, r5, r6, r7, r8, r9, r10);
        C36321k7.A1B(r3, r6, r10, resources, r9);
        C36321k7.A1C(r4, r8, r2, r7, r5);
    }
}
