package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;

/* renamed from: X.2JO  reason: invalid class name */
public abstract class AnonymousClass2JO extends C43712Jn {
    public final AnonymousClass3QW A00;

    public boolean A03(C225314u r3, AnonymousClass3T1 r4) {
        AnonymousClass00C.A0D(r4, 0);
        return A02(r3, r4, 3, false);
    }

    public Drawable BCW(Context context, C18820ts r3) {
        AnonymousClass00C.A0D(context, 0);
        return AnonymousClass00E.A00(context, R.drawable.ic_action_undo_keep);
    }

    public AnonymousClass2JO(AnonymousClass1X4 r1, AnonymousClass3QW r2) {
        super(r1, r2);
        this.A00 = r2;
    }

    public String BIN(C88744Tw r3) {
        return C36361kB.A0m(C36341k9.A0C(r3), R.string.f12nameremoved);
    }

    public int getId() {
        return 20;
    }
}
