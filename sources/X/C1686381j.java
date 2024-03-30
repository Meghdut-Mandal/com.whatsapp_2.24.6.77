package X;

import android.graphics.Matrix;
import java.util.List;

/* renamed from: X.81j  reason: invalid class name and case insensitive filesystem */
public abstract class C1686381j extends AnonymousClass825 implements B0V {
    public Matrix A00;
    public Boolean A01;
    public Integer A02;
    public String A03;
    public List A04 = AnonymousClass001.A0I();

    public void B0L(AnonymousClass9QD r3) {
        if (r3 instanceof C1686581l) {
            this.A04.add(r3);
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Gradient elements cannot contain ");
        A0u.append(r3);
        throw C22735Auz.A00(AnonymousClass000.A0q(" elements.", A0u));
    }

    public List B9f() {
        return this.A04;
    }
}
