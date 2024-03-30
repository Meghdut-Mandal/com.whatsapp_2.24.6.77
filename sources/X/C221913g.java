package X;

/* renamed from: X.13g  reason: invalid class name and case insensitive filesystem */
public class C221913g {
    public final C19990wq A00;
    public final AnonymousClass12U A01;

    public int A00() {
        return this.A00.A01.A01.getInt("companion_registration_state", 0);
    }

    public void A01(int i) {
        this.A00.A01.A01.edit().putInt("companion_registration_state", i).commit();
        if (i == 8) {
            this.A01.A01(3);
        }
    }

    public C221913g(C19990wq r1, AnonymousClass12U r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public boolean A02() {
        int A002 = A00();
        if (A002 < 2) {
            return false;
        }
        if (A002 <= 6) {
            return true;
        }
        if (A002 < 10 || A002 > 14) {
            return false;
        }
        return true;
    }
}
