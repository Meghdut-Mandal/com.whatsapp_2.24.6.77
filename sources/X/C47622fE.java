package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import com.whatsapp.bridge.wfal.WfalManager;
import java.util.Collection;

/* renamed from: X.2fE  reason: invalid class name and case insensitive filesystem */
public final class C47622fE extends C70703fa {
    public final WfalManager A00;
    public final C28781Ua A01;
    public final C19630wG A02;
    public final C32341dO A03;
    public final C32421dW A04;
    public final AnonymousClass3EM A05;

    public boolean BtJ(Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        if (this.A01.A00()) {
            return this.A05.A00(1, collection);
        }
        if (!this.A03.A02() || !super.BtJ(collection)) {
            return false;
        }
        return true;
    }

    public Drawable BCW(Context context, C18820ts r4) {
        return AnonymousClass00E.A00(this.A02.A00, R.drawable.ic_settings_fb);
    }

    public C47622fE(WfalManager wfalManager, C19630wG r3, C32341dO r4, C32421dW r5, AnonymousClass3EM r6, C28781Ua r7) {
        C36321k7.A18(r3, r7, wfalManager, r4);
        AnonymousClass00C.A0D(r6, 6);
        this.A02 = r3;
        this.A01 = r7;
        this.A00 = wfalManager;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r6;
    }

    public String BIN(C88744Tw r3) {
        return C36361kB.A0m(C36341k9.A0C(r3), R.string.f12nameremoved);
    }

    public int getId() {
        return 13;
    }
}
