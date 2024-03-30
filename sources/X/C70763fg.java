package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import java.util.Collection;

/* renamed from: X.3fg  reason: invalid class name and case insensitive filesystem */
public abstract class C70763fg implements C88784Ua {
    public final AnonymousClass3O0 A00;

    public boolean A00(C225314u r5, Collection collection) {
        AnonymousClass3SJ.A01(r5, 13);
        AnonymousClass3O0 r2 = this.A00;
        if (r2.A03 && r2.A00 == 2) {
            r2.A00 = 3;
            AnonymousClass3O0.A00(r2, 1);
        }
        return true;
    }

    public final Drawable BCW(Context context, C18820ts r3) {
        AnonymousClass00C.A0D(context, 0);
        return AnonymousClass00E.A00(context, R.drawable.ic_action_delete);
    }

    public boolean BtJ(Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        if (collection.size() != 1) {
            return true;
        }
        AnonymousClass3T1 A0S = C36421kH.A0S(collection);
        if (!(A0S instanceof AnonymousClass2bU) || !C66013Ui.A0z((AnonymousClass2bU) A0S)) {
            return true;
        }
        return false;
    }

    public C70763fg(AnonymousClass3O0 r1) {
        this.A00 = r1;
    }

    public final boolean BBr() {
        return false;
    }

    public final String BIN(C88744Tw r3) {
        return C36361kB.A0m(C36341k9.A0C(r3), R.string.f12nameremoved);
    }

    public final int getId() {
        return 21;
    }
}
