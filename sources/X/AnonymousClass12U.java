package X;

/* renamed from: X.12U  reason: invalid class name */
public class AnonymousClass12U {
    public final C19900wh A00;

    public int A00() {
        return this.A00.A01.getInt("registration_state", 0);
    }

    public void A01(int i) {
        this.A00.A01.edit().putInt("registration_state", i).apply();
    }

    public AnonymousClass12U(C19900wh r1) {
        this.A00 = r1;
    }

    public boolean A02() {
        if (A00() == 12) {
            return true;
        }
        return false;
    }

    public boolean A03() {
        if (A00() == 3) {
            return true;
        }
        return false;
    }
}
