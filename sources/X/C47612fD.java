package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import com.whatsapp.bridge.wfal.WfalManager;
import java.util.Collection;

/* renamed from: X.2fD  reason: invalid class name and case insensitive filesystem */
public final class C47612fD extends C70703fa {
    public final WfalManager A00;
    public final C19630wG A01;
    public final C32421dW A02;

    public boolean BtJ(Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        return false;
    }

    public Drawable BCW(Context context, C18820ts r4) {
        return AnonymousClass00E.A00(this.A01.A00, R.drawable.ic_pip_instagram);
    }

    public C47612fD(WfalManager wfalManager, C19630wG r2, C32421dW r3) {
        C36321k7.A0x(r2, wfalManager);
        this.A01 = r2;
        this.A00 = wfalManager;
        this.A02 = r3;
    }

    public String BIN(C88744Tw r3) {
        return C36361kB.A0m(C36341k9.A0C(r3), R.string.f12nameremoved);
    }

    public int getId() {
        return 36;
    }
}
