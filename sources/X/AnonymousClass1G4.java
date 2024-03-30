package X;

/* renamed from: X.1G4  reason: invalid class name */
public class AnonymousClass1G4 extends C19590wC {
    public final C21060yb A00;
    public volatile Boolean A01;

    public void A00(boolean z) {
        if (this.A01 == null || z != this.A01.booleanValue()) {
            this.A01 = Boolean.valueOf(z);
            for (C88074Rh Bfm : getObservers()) {
                Bfm.Bfm(A01());
            }
        }
    }

    public boolean A01() {
        if (this.A01 == null) {
            this.A01 = Boolean.valueOf(C28901Un.A00(this.A00));
        }
        return this.A01.booleanValue();
    }

    public AnonymousClass1G4(C21060yb r1) {
        this.A00 = r1;
    }
}
