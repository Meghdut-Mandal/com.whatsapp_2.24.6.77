package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.3ff  reason: invalid class name and case insensitive filesystem */
public final class C70753ff implements C88784Ua {
    public final AnonymousClass17Y A00;
    public final C19730wQ A01;
    public final C25791Hr A02;
    public final AnonymousClass16D A03;
    public final AnonymousClass171 A04;
    public final C21060yb A05;
    public final C18820ts A06;
    public final C28371Sj A07;
    public final C19890wg A08;
    public final AnonymousClass1AW A09;
    public final C19770wU A0A;
    public final C25361Fz A0B;
    public final AnonymousClass1EL A0C;

    public Drawable BCW(Context context, C18820ts r3) {
        AnonymousClass00C.A0D(context, 0);
        return AnonymousClass00E.A00(context, R.drawable.ic_action_copy);
    }

    public boolean BtJ(Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        AnonymousClass11F r1 = C36421kH.A0S(collection).A1J.A00;
        if (AnonymousClass143.A0G(r1) && this.A0C.A02(r1)) {
            return false;
        }
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass3T1 A0l = C36391kE.A0l(it);
            C25361Fz r3 = this.A0B;
            AnonymousClass00C.A0D(A0l, 0);
            for (C88864Ui BLU : (Set) r3.A00.get()) {
                if (C36371kC.A1X(BLU.BLU(A0l), false)) {
                    return false;
                }
            }
            if (!C54322sl.A00(A0l) && !((AnonymousClass4VB) ((AnonymousClass9XG) r3.A01.getValue()).A00(A0l.A1I)).BLV(A0l)) {
                return false;
            }
        }
        return true;
    }

    public C70753ff(AnonymousClass17Y r1, C19730wQ r2, C25791Hr r3, AnonymousClass16D r4, AnonymousClass171 r5, C21060yb r6, C18820ts r7, C25361Fz r8, AnonymousClass1EL r9, C28371Sj r10, C19890wg r11, AnonymousClass1AW r12, C19770wU r13) {
        C36321k7.A1B(r1, r10, r2, r13, r4);
        C36321k7.A1C(r7, r6, r5, r9, r11);
        C36321k7.A15(r3, r12, r8);
        this.A00 = r1;
        this.A07 = r10;
        this.A01 = r2;
        this.A0A = r13;
        this.A03 = r4;
        this.A06 = r7;
        this.A05 = r6;
        this.A04 = r5;
        this.A0C = r9;
        this.A08 = r11;
        this.A02 = r3;
        this.A09 = r12;
        this.A0B = r8;
    }

    public boolean BBr() {
        return true;
    }

    public String BIN(C88744Tw r3) {
        return C36361kB.A0m(C36341k9.A0C(r3), R.string.f12nameremoved);
    }

    public int getId() {
        return 5;
    }
}
