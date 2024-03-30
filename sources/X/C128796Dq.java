package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.6Dq  reason: invalid class name and case insensitive filesystem */
public final class C128796Dq {
    public final int A00;
    public final int A01;
    public final long A02;
    public final AnonymousClass72L A03;
    public final AnonymousClass6V8 A04;
    public final C157027bi A05;
    public final C161937ni A06;
    public final AnonymousClass5RW A07;
    public final List A08;
    public final boolean A09;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128796Dq) {
                C128796Dq r8 = (C128796Dq) obj;
                if (!AnonymousClass00C.A0J(this.A03, r8.A03) || !AnonymousClass00C.A0J(this.A04, r8.A04) || !AnonymousClass00C.A0J(this.A08, r8.A08) || this.A00 != r8.A00 || this.A09 != r8.A09 || this.A01 != r8.A01 || !AnonymousClass00C.A0J(this.A06, r8.A06) || this.A07 != r8.A07 || !AnonymousClass00C.A0J(this.A05, r8.A05) || this.A02 != r8.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A052 = C36351kA.A05(this.A04, C36391kE.A0A(this.A03));
        return C36341k9.A02(this.A02, C36351kA.A05(this.A05, C36351kA.A05(this.A07, C36351kA.A05(this.A06, (((((C36351kA.A05(this.A08, A052) + this.A00) * 31) + C36341k9.A01(this.A09 ? 1 : 0)) * 31) + this.A01) * 31))));
    }

    public C128796Dq(AnonymousClass72L r1, AnonymousClass6V8 r2, C157027bi r3, C161937ni r4, AnonymousClass5RW r5, List list, int i, int i2, long j, boolean z) {
        this.A03 = r1;
        this.A04 = r2;
        this.A08 = list;
        this.A00 = i;
        this.A09 = z;
        this.A01 = i2;
        this.A06 = r4;
        this.A07 = r5;
        this.A05 = r3;
        this.A02 = j;
    }

    public String toString() {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("TextLayoutInput(text=");
        A0u.append(this.A03);
        A0u.append(", style=");
        A0u.append(this.A04);
        A0u.append(", placeholders=");
        A0u.append(this.A08);
        A0u.append(", maxLines=");
        A0u.append(this.A00);
        A0u.append(", softWrap=");
        A0u.append(this.A09);
        A0u.append(", overflow=");
        int i = this.A01;
        if (i == 1) {
            str = "Clip";
        } else if (i == 2) {
            str = "Ellipsis";
        } else if (i == 3) {
            str = "Visible";
        } else {
            str = "Invalid";
        }
        A0u.append(str);
        A0u.append(", density=");
        A0u.append(this.A06);
        A0u.append(", layoutDirection=");
        A0u.append(this.A07);
        A0u.append(", fontFamilyResolver=");
        A0u.append(this.A05);
        A0u.append(", constraints=");
        return AnonymousClass000.A0m(Constraints.A08(this.A02), A0u);
    }
}
