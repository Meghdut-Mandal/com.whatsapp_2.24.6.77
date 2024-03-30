package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1uv  reason: invalid class name and case insensitive filesystem */
public final class C40101uv extends AnonymousClass04R implements B3n {
    public final Bundle A00;
    public final C001700s A01 = C36441kJ.A0Z(true);
    public final C001700s A02;
    public final C001700s A03;
    public final C001700s A04 = C36441kJ.A0Z(true);
    public final C001600r A05;
    public final C001600r A06;
    public final C001600r A07;

    public C40101uv(Bundle bundle) {
        this.A00 = bundle;
        Boolean A0j = C36381kD.A0j();
        this.A02 = C36441kJ.A0Z(A0j);
        this.A03 = C36441kJ.A0Z(A0j);
        this.A05 = C36441kJ.A0Z(A0j);
        this.A06 = C36441kJ.A0Z(true);
        this.A07 = C36441kJ.A0Z(AnonymousClass001.A0I());
        C001700s r1 = this.A02;
        Bundle bundle2 = this.A00;
        C36341k9.A19(r1, bundle2.getBoolean("require_membership_approval", false));
        C36341k9.A19(this.A03, bundle2.getBoolean("add_other_participants", false));
        C36341k9.A19(this.A04, bundle2.getBoolean("send_messages", true));
        C36341k9.A19(this.A01, bundle2.getBoolean("edit_group_info", true));
    }

    public void B6K(C225314u r1, List list) {
    }

    public void BUC() {
    }

    public void BUF() {
    }

    public void BeR() {
    }

    public void BeT() {
    }

    public void Beq(boolean z) {
    }

    public void Bwz(int i, boolean z) {
        Bundle bundle;
        String str;
        if (i == 1) {
            bundle = this.A00;
            str = "edit_group_info";
        } else if (i == 2) {
            bundle = this.A00;
            str = "send_messages";
        } else if (i == 3) {
            bundle = this.A00;
            str = "require_membership_approval";
        } else if (i == 4) {
            bundle = this.A00;
            str = "add_other_participants";
        } else {
            return;
        }
        bundle.putBoolean(str, z);
    }

    public ArrayList B8L() {
        return AnonymousClass001.A0I();
    }

    public C001600r B8M() {
        return this.A07;
    }

    public C001600r BCs() {
        return this.A05;
    }

    public C001700s BCt() {
        return this.A01;
    }

    public C001600r BCu() {
        return this.A06;
    }

    public C001600r BCv() {
        return this.A05;
    }

    public C001600r BCw() {
        return this.A05;
    }

    public C001600r BCx() {
        return this.A06;
    }

    public C001700s BCy() {
        return this.A02;
    }

    public C001700s BCz() {
        return this.A03;
    }

    public C001600r BD1() {
        return this.A05;
    }

    public C001600r BD2() {
        return this.A06;
    }

    public C001700s BD3() {
        return this.A04;
    }

    public C001600r BD4() {
        return this.A06;
    }

    public C001600r BGh() {
        return this.A05;
    }

    public C28201Rs BHW() {
        return C36441kJ.A0t();
    }

    public C001600r BHX() {
        return this.A05;
    }

    public C28201Rs BHY() {
        return C36441kJ.A0t();
    }
}
