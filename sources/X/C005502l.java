package X;

/* renamed from: X.02l  reason: invalid class name and case insensitive filesystem */
public abstract class C005502l extends C005302j implements C005402k {
    public static final C006102r A00 = new C006102r();

    public abstract void A03(Runnable runnable, C005102h r2);

    public boolean A04(C005102h r2) {
        return true;
    }

    public C005202i get(C005902p r4) {
        C005202i r0;
        AnonymousClass00C.A0D(r4, 1);
        if (r4 instanceof C006002q) {
            C006002q r42 = (C006002q) r4;
            C005902p r1 = this.key;
            AnonymousClass00C.A0D(r1, 0);
            if ((r1 == r42 || r42.A00 == r1) && (r0 = (C005202i) r42.A01.invoke(this)) != null) {
                return r0;
            }
        } else if (C005402k.A00 == r4) {
            return this;
        }
        return null;
    }

    public C005102h minusKey(C005902p r4) {
        C005102h r2 = this;
        AnonymousClass00C.A0D(r4, 1);
        if (r4 instanceof C006002q) {
            C006002q r42 = (C006002q) r4;
            C005902p r1 = this.key;
            AnonymousClass00C.A0D(r1, 0);
            if ((r1 == r42 || r42.A00 == r1) && r42.A01.invoke(this) != null) {
                r2 = C008903u.A00;
            }
            return r2;
        }
        if (C005402k.A00 == r4) {
            r2 = C008903u.A00;
        }
        return r2;
    }

    public C005502l() {
        super(C005402k.A00);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }

    public C005502l A01(int i) {
        AnonymousClass03D.A00(i);
        return new AnonymousClass03E(this, i);
    }

    public void A02(Runnable runnable, C005102h r2) {
        A03(runnable, r2);
    }
}
