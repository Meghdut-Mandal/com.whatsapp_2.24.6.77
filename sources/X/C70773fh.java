package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.3fh  reason: invalid class name and case insensitive filesystem */
public final class C70773fh implements C88784Ua {
    public final AnonymousClass3E2 A00;
    public final AnonymousClass1D1 A01;
    public final C20810yC A02;
    public final AnonymousClass1E2 A03;

    public Drawable BCW(Context context, C18820ts r3) {
        AnonymousClass00C.A0D(context, 0);
        return AnonymousClass00E.A00(context, R.drawable.ic_hd_label);
    }

    public String BIN(C88744Tw r6) {
        int i;
        AnonymousClass00C.A0D(r6, 0);
        Collection BHB = r6.BHB();
        if (BHB != null) {
            ArrayList A0I = AnonymousClass001.A0I();
            for (Object next : BHB) {
                if (A00((AnonymousClass3T1) next)) {
                    A0I.add(next);
                }
            }
            i = A0I.size();
        } else {
            i = 0;
        }
        Context context = r6.getContext();
        Object[] A0L = AnonymousClass001.A0L();
        AnonymousClass000.A1L(A0L, i, 0);
        String string = context.getString(R.string.f12nameremoved, A0L);
        AnonymousClass00C.A08(string);
        return string;
    }

    public boolean BtJ(Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        if (collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (A00(C36391kE.A0l(it))) {
                if (this.A02.A0E(4048)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    private final boolean A00(AnonymousClass3T1 r4) {
        AnonymousClass2bU r0;
        C65013Qj r1;
        boolean A002;
        if (r4 instanceof AnonymousClass2bU) {
            r0 = (AnonymousClass2bU) r4;
        } else {
            r0 = null;
        }
        if (r0 == null || (r1 = r0.A01) == null || r1.A0f || r1.A0V) {
            return false;
        }
        if (r4 instanceof C46882bp) {
            A002 = this.A01.A02(r1, false);
        } else {
            A002 = AnonymousClass3T2.A00(this.A02, this.A03, r4);
        }
        if (A002) {
            return true;
        }
        return false;
    }

    public C70773fh(AnonymousClass3E2 r1, C20810yC r2, AnonymousClass1D1 r3, AnonymousClass1E2 r4) {
        C36321k7.A18(r2, r3, r4, r1);
        this.A02 = r2;
        this.A01 = r3;
        this.A03 = r4;
        this.A00 = r1;
    }

    public boolean BBr() {
        return true;
    }

    public int getId() {
        return 30;
    }
}
