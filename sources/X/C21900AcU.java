package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.AcU  reason: case insensitive filesystem */
public class C21900AcU extends ArrayList<Object> implements List<Object>, C23123B6e, C23124B6f {
    public static final long serialVersionUID = 9106884089231309568L;

    public String Bvl() {
        C201179j1 r2 = C197039b2.A00;
        StringBuilder A0u = AnonymousClass000.A0u();
        try {
            C201309jJ.A03.Bxd(A0u, this, r2);
        } catch (IOException unused) {
        }
        return A0u.toString();
    }

    public void Bxb(Appendable appendable) {
        C201309jJ.A03.Bxd(appendable, this, C197039b2.A00);
    }

    public void Bxc(Appendable appendable, C201179j1 r3) {
        C201309jJ.A03.Bxd(appendable, this, r3);
    }

    public String Bvm(C201179j1 r3) {
        StringBuilder A0u = AnonymousClass000.A0u();
        try {
            C201309jJ.A03.Bxd(A0u, this, r3);
        } catch (IOException unused) {
        }
        return A0u.toString();
    }

    public String toString() {
        return Bvl();
    }
}
