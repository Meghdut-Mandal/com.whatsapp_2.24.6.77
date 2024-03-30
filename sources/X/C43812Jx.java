package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import java.util.Collection;

/* renamed from: X.2Jx  reason: invalid class name and case insensitive filesystem */
public final class C43812Jx extends C70693fZ {
    public final C220412q A00;
    public final C236419g A01;
    public final C20810yC A02;
    public final C25361Fz A03;

    public Drawable BCW(Context context, C18820ts r3) {
        AnonymousClass00C.A0D(context, 0);
        return AnonymousClass00E.A00(context, R.drawable.ic_spam_report);
    }

    public String BIN(C88744Tw r5) {
        AnonymousClass3T1 r0;
        String string;
        C64933Qa r02;
        AnonymousClass00C.A0D(r5, 0);
        String BBB = r5.BBB();
        Collection BHB = r5.BHB();
        AnonymousClass11F r1 = null;
        if (BHB != null) {
            r0 = C36421kH.A0S(BHB);
        } else {
            r0 = null;
        }
        if (BBB != null) {
            if (!(r0 == null || (r02 = r0.A1J) == null)) {
                r1 = r02.A00;
            }
            if (AnonymousClass143.A0G(r1)) {
                string = C36351kA.A0w(r5.getContext(), BBB, 1, R.string.f12nameremoved);
                AnonymousClass00C.A08(string);
                return string;
            }
        }
        string = r5.getContext().getString(R.string.f12nameremoved);
        AnonymousClass00C.A08(string);
        return string;
    }

    public C43812Jx(C220412q r1, C236419g r2, C20810yC r3, C25361Fz r4) {
        C36321k7.A18(r3, r1, r2, r4);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
    }

    public boolean BBr() {
        return true;
    }

    public int getId() {
        return 15;
    }
}
