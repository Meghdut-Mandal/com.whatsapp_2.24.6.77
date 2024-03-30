package X;

/* renamed from: X.2bi  reason: invalid class name and case insensitive filesystem */
public class C46812bi extends C46942bv implements AnonymousClass4RU {
    public /* bridge */ /* synthetic */ AnonymousClass3T1 B32(C64933Qa r8) {
        C64933Qa r2 = r8;
        if (this instanceof C46802bh) {
            C46802bh r3 = (C46802bh) this;
            return new C46802bh(r3.A01, r2, r3, r3.A0I);
        }
        return new C46812bi(this.A01, r2, this, this.A0I, true);
    }

    public C46812bi(C64933Qa r2, int i, long j) {
        super(r2, 82, j);
    }

    public boolean A1k() {
        if (this.A09 == 1 || !"audio/ogg; codecs=opus".equals(this.A05) || !C66013Ui.A0t(this)) {
            return false;
        }
        return true;
    }

    public boolean A1l() {
        int i = this.A09;
        if (i == 1 || ((i != 1 && "audio/ogg; codecs=opus".equals(this.A05) && !C66013Ui.A0t(this)) || A1k())) {
            return true;
        }
        return false;
    }

    public C46812bi(C65013Qj r1, C64933Qa r2, C46812bi r3, long j, boolean z) {
        super(r1, r2, r3, j, z);
    }

    public C46812bi(C64933Qa r2, long j) {
        super(r2, 2, j);
    }
}
