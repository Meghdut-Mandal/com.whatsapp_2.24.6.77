package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;

/* renamed from: X.2D5  reason: invalid class name */
public final class AnonymousClass2D5 extends C43722Jo {
    public final AnonymousClass1KF A00;
    public final C65263Rj A01;
    public final AnonymousClass1CF A02;

    public Drawable BCW(Context context, C18820ts r3) {
        AnonymousClass00C.A0D(context, 0);
        return AnonymousClass00E.A00(context, R.drawable.vec_ic_positive_bot_feedback);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2D5(AnonymousClass1HX r1, AnonymousClass1KF r2, C65263Rj r3, AnonymousClass1CF r4, C24961El r5) {
        super(r1, r3, r4, r5);
        C36321k7.A1B(r1, r5, r4, r3, r2);
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
    }

    public String BIN(C88744Tw r3) {
        return C36361kB.A0m(C36341k9.A0C(r3), R.string.f12nameremoved);
    }

    public int getId() {
        return 33;
    }
}
