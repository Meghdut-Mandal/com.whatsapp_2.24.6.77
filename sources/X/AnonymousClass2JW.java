package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.2JW  reason: invalid class name */
public final class AnonymousClass2JW extends C70713fb {
    public final AnonymousClass1X4 A00;
    public final AnonymousClass196 A01;
    public final AnonymousClass3CU A02;
    public final AnonymousClass1DW A03;
    public final C21010yW A04;
    public final AnonymousClass1AW A05;
    public final AnonymousClass1EO A06;
    public final C19770wU A07;
    public final AnonymousClass3QW A08;

    public Drawable BCW(Context context, C18820ts r3) {
        AnonymousClass00C.A0D(context, 0);
        return AnonymousClass00E.A00(context, R.drawable.ic_action_star);
    }

    public boolean BtJ(Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        if (collection.size() == 1) {
            AnonymousClass3T1 A0S = C36421kH.A0S(collection);
            AnonymousClass3QW r1 = this.A08;
            if (r1.A02(A0S) || r1.A03(A0S)) {
                return false;
            }
        }
        if (collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!C36391kE.A0l(it).A15) {
                if (!A00(collection)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2JW(AnonymousClass1X4 r2, AnonymousClass196 r3, AnonymousClass3CU r4, AnonymousClass3QW r5, AnonymousClass1DW r6, C20810yC r7, C21010yW r8, C25361Fz r9, AnonymousClass1AW r10, AnonymousClass1EO r11, C19770wU r12) {
        super(r7, r9);
        C36321k7.A1B(r7, r9, r12, r8, r3);
        C36321k7.A1C(r2, r6, r5, r4, r10);
        AnonymousClass00C.A0D(r11, 11);
        this.A07 = r12;
        this.A04 = r8;
        this.A01 = r3;
        this.A00 = r2;
        this.A03 = r6;
        this.A08 = r5;
        this.A02 = r4;
        this.A05 = r10;
        this.A06 = r11;
    }

    public String BIN(C88744Tw r3) {
        return C36361kB.A0m(C36341k9.A0C(r3), R.string.f12nameremoved);
    }

    public int getId() {
        return 2;
    }
}
