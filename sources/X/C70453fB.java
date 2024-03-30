package X;

import android.content.Context;
import android.view.View;
import java.util.List;

/* renamed from: X.3fB  reason: invalid class name and case insensitive filesystem */
public final class C70453fB implements C22928Aye {
    public final Context A00;
    public final AnonymousClass3OV A01;
    public final AnonymousClass147 A02;
    public final AnonymousClass2bI A03;

    public C70453fB(Context context, AnonymousClass3OV r3, AnonymousClass147 r4, AnonymousClass2bI r5) {
        AnonymousClass00C.A0D(r3, 1);
        this.A01 = r3;
        this.A00 = context;
        this.A03 = r5;
        this.A02 = r4;
    }

    public List getCTAViews() {
        View[] viewArr = new View[2];
        Context context = this.A00;
        AnonymousClass2bI r8 = this.A03;
        C50842mj r2 = new C50842mj(context);
        r2.setOnClickListener(new AnonymousClass3YF(r2, r8, 44));
        viewArr[0] = r2;
        return C36341k9.A0m(this.A01.A01(context, this.A02, (AnonymousClass147) null, r8, 3, false), viewArr, 1);
    }
}
