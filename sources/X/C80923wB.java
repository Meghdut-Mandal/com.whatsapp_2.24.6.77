package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.R;
import java.util.Objects;
import java.util.Set;

/* renamed from: X.3wB  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C80923wB implements Runnable {
    public final /* synthetic */ C87444Ov A00;
    public final /* synthetic */ C87454Ow A01;
    public final /* synthetic */ AnonymousClass17Y A02;
    public final /* synthetic */ AnonymousClass1X4 A03;
    public final /* synthetic */ C18820ts A04;
    public final /* synthetic */ AnonymousClass1DW A05;
    public final /* synthetic */ C20810yC A06;
    public final /* synthetic */ C21010yW A07;
    public final /* synthetic */ AnonymousClass17V A08;
    public final /* synthetic */ AnonymousClass1AW A09;
    public final /* synthetic */ AnonymousClass1EO A0A;
    public final /* synthetic */ Set A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    public /* synthetic */ C80923wB(C87444Ov r1, C87454Ow r2, AnonymousClass17Y r3, AnonymousClass1X4 r4, C18820ts r5, AnonymousClass1DW r6, C20810yC r7, C21010yW r8, AnonymousClass17V r9, AnonymousClass1AW r10, AnonymousClass1EO r11, Set set, boolean z, boolean z2) {
        this.A07 = r8;
        this.A05 = r6;
        this.A08 = r9;
        this.A0B = set;
        this.A09 = r10;
        this.A0A = r11;
        this.A0D = z;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A0C = z2;
        this.A06 = r7;
        this.A04 = r5;
        this.A01 = r2;
    }

    public final void run() {
        C21010yW r9 = this.A07;
        AnonymousClass1DW r8 = this.A05;
        AnonymousClass17V r10 = this.A08;
        Set set = this.A0B;
        AnonymousClass1AW r11 = this.A09;
        AnonymousClass1EO r12 = this.A0A;
        boolean z = this.A0D;
        C87444Ov r6 = this.A00;
        AnonymousClass17Y r5 = this.A02;
        AnonymousClass1X4 r2 = this.A03;
        boolean z2 = this.A0C;
        C20810yC r0 = this.A06;
        C18820ts r4 = this.A04;
        C87454Ow r3 = this.A01;
        boolean z3 = false;
        AnonymousClass3SH.A02(r8, r9, r10, r11, r12, set, 0);
        if (z && r6 != null) {
            z3 = true;
            if (set.size() > 999) {
                r5.A07(R.string.f12nameremoved, 1);
                return;
            }
        }
        r2.A0c(set, z2, z3);
        if (z3) {
            r5.A0H(new AnonymousClass74N(r6, set, 29));
        } else {
            AnonymousClass3T1 A0l = C36391kE.A0l(set.iterator());
            boolean A1Z = C36401kF.A1Z(r0);
            boolean A1S = AnonymousClass000.A1S(set.size(), 1);
            if (!A1Z || !A1S || A0l == null || !AnonymousClass000.A1S(A0l.A0A & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING, EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING)) {
                long size = (long) set.size();
                Object[] objArr = new Object[1];
                AnonymousClass000.A1L(objArr, set.size(), 0);
                r5.A0F(r4.A0L(objArr, R.plurals.f10nameremoved, size), 0);
            }
        }
        Objects.requireNonNull(r3);
        r5.A0H(new C1497572q(r3, 49));
    }
}
