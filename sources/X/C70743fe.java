package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.3fe  reason: invalid class name and case insensitive filesystem */
public final class C70743fe implements C88784Ua {
    public final AnonymousClass17Y A00;
    public final C21100yf A01;
    public final C28551Tc A02;
    public final C19460v5 A03;
    public final C20810yC A04;
    public final AnonymousClass1EL A05;
    public final AnonymousClass1AW A06;

    public Drawable BCW(Context context, C18820ts r3) {
        AnonymousClass00C.A0D(context, 0);
        return AnonymousClass00E.A00(context, R.drawable.ic_action_forward);
    }

    public boolean BtJ(Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        AnonymousClass11F r1 = C36421kH.A0S(collection).A1J.A00;
        if ((AnonymousClass143.A0G(r1) && this.A05.A02(r1)) || AnonymousClass143.A0H(r1)) {
            return false;
        }
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass3T1 A0l = C36391kE.A0l(it);
            if (!C66013Ui.A0W(this.A01, this.A04, A0l, this.A06)) {
                return false;
            }
        }
        return true;
    }

    public C70743fe(C19460v5 r1, AnonymousClass17Y r2, C21100yf r3, C20810yC r4, AnonymousClass1EL r5, C28551Tc r6, AnonymousClass1AW r7) {
        C36321k7.A1B(r4, r2, r3, r7, r5);
        C36321k7.A10(r6, r1);
        this.A04 = r4;
        this.A00 = r2;
        this.A01 = r3;
        this.A06 = r7;
        this.A05 = r5;
        this.A02 = r6;
        this.A03 = r1;
    }

    public boolean BBr() {
        return false;
    }

    public String BIN(C88744Tw r3) {
        return C36361kB.A0m(C36341k9.A0C(r3), R.string.f12nameremoved);
    }

    public int getId() {
        return 8;
    }
}
