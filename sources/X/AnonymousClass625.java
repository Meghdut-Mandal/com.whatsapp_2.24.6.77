package X;

import android.app.Activity;
import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.625  reason: invalid class name */
public final class AnonymousClass625 {
    public final C33771fu A00;
    public final C33751fs A01;

    public final void A00(Activity activity, Context context) {
        C39001qm A002 = AnonymousClass3LW.A00(context);
        A002.A0d(R.string.f12nameremoved);
        A002.A0c(R.string.f12nameremoved);
        A002.A0r(false);
        A002.A0h(new C163437qC(context, this, 11), R.string.f12nameremoved);
        C163297py.A00(A002, activity, 37, R.string.f12nameremoved);
        AnonymousClass0FM create = A002.create();
        AnonymousClass00C.A08(create);
        create.setCanceledOnTouchOutside(false);
        create.show();
    }

    public AnonymousClass625(C33771fu r1, C33751fs r2) {
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
