package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.2JV  reason: invalid class name */
public final class AnonymousClass2JV extends C70713fb {
    public final AnonymousClass17Y A00;
    public final C25791Hr A01;
    public final AnonymousClass196 A02;
    public final AnonymousClass1NO A03;
    public final C19770wU A04;

    public Drawable BCW(Context context, C18820ts r3) {
        AnonymousClass00C.A0D(context, 0);
        return AnonymousClass00E.A00(context, R.drawable.ic_action_unstar);
    }

    public boolean BtJ(Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        if (!collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!C36391kE.A0l(it).A15) {
                        break;
                    }
                } else {
                    break;
                }
            }
            return false;
        }
        if (A00(collection)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2JV(AnonymousClass17Y r1, C25791Hr r2, AnonymousClass196 r3, AnonymousClass1NO r4, C20810yC r5, C25361Fz r6, C19770wU r7) {
        super(r5, r6);
        C36321k7.A1B(r5, r6, r1, r7, r3);
        C36321k7.A10(r4, r2);
        this.A00 = r1;
        this.A04 = r7;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
    }

    public String BIN(C88744Tw r3) {
        return C36361kB.A0m(C36341k9.A0C(r3), R.string.f12nameremoved);
    }

    public int getId() {
        return 3;
    }
}
