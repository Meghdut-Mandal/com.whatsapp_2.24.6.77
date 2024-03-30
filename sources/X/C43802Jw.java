package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;

/* renamed from: X.2Jw  reason: invalid class name and case insensitive filesystem */
public final class C43802Jw extends C70693fZ {
    public final C24801Dv A00;
    public final AnonymousClass1X4 A01;
    public final C25361Fz A02;
    public final AnonymousClass1EL A03;

    public Drawable BCW(Context context, C18820ts r3) {
        AnonymousClass00C.A0D(context, 0);
        return AnonymousClass00E.A00(context, R.drawable.ic_action_share);
    }

    public C43802Jw(C24801Dv r1, AnonymousClass1X4 r2, C25361Fz r3, AnonymousClass1EL r4) {
        C36321k7.A18(r2, r1, r4, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
    }

    public boolean BBr() {
        return true;
    }

    public String BIN(C88744Tw r3) {
        return C36361kB.A0m(C36341k9.A0C(r3), R.string.f12nameremoved);
    }

    public int getId() {
        return 6;
    }
}
