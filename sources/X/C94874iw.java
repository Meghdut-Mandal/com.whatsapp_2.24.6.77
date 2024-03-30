package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.4iw  reason: invalid class name and case insensitive filesystem */
public final class C94874iw extends C137626gS {
    public final /* synthetic */ C136906fE A00;
    public final /* synthetic */ C009003v A01;

    public C94874iw(C136906fE r1, C009003v r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public C160287kl BPh(C161717nM r9, List list, long j) {
        C160287kl r4;
        int i;
        int i2;
        C136906fE r3 = this.A00;
        C137816gm r2 = r3.A08;
        r2.A02 = r9.getLayoutDirection();
        r2.A00 = r9.BAy();
        r2.A01 = r9.BC0();
        if (r9.BMI() || r3.A09.A07 == null) {
            r3.A00 = 0;
            r4 = (C160287kl) this.A01.invoke(r2, new Constraints(j));
            i = r3.A00;
            i2 = 1;
        } else {
            r3.A01 = 0;
            r4 = (C160287kl) this.A01.invoke(r3.A07, new Constraints(j));
            i = r3.A01;
            i2 = 0;
        }
        return new C164917sa(r3, r4, r4, i, i2);
    }
}
