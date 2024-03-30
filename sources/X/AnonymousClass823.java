package X;

import java.util.List;
import java.util.Set;

/* renamed from: X.823  reason: invalid class name */
public abstract class AnonymousClass823 extends AnonymousClass824 implements B0V, B3X {
    public String A00 = null;
    public Set A01 = null;
    public Set A02 = null;
    public Set A03 = null;
    public Set A04 = null;
    public List A05 = AnonymousClass001.A0I();

    public Set BI7() {
        return null;
    }

    public void B0L(AnonymousClass9QD r3) {
        if (!(this instanceof AnonymousClass822) || (r3 instanceof Ax9)) {
            this.A05.add(r3);
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Text content elements cannot contain ");
        A0u.append(r3);
        throw C22735Auz.A00(AnonymousClass000.A0q(" elements.", A0u));
    }

    public List B9f() {
        return this.A05;
    }

    public String BGi() {
        return this.A00;
    }

    public Set BGj() {
        return this.A01;
    }

    public Set BGk() {
        return this.A02;
    }

    public Set BGl() {
        return this.A03;
    }

    public void Bry(String str) {
        this.A00 = str;
    }

    public void Brz(Set set) {
        this.A01 = set;
    }

    public void Bs0(Set set) {
        this.A02 = set;
    }

    public void Bs1(Set set) {
        this.A03 = set;
    }

    public void BsR(Set set) {
        this.A04 = set;
    }
}
