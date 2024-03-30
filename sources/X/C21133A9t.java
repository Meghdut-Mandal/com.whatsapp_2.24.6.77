package X;

import android.view.animation.Interpolator;

/* renamed from: X.A9t  reason: case insensitive filesystem */
public class C21133A9t implements AnonymousClass4UP {
    public final /* synthetic */ AnonymousClass8ZY A00;
    public final /* synthetic */ AnonymousClass3T1 A01;

    public C21133A9t(AnonymousClass8ZY r1, AnonymousClass3T1 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public C34831hi BD0() {
        AnonymousClass8ZY r1 = this.A00;
        Interpolator interpolator = AnonymousClass8ZY.A0b;
        return r1.A0P;
    }

    public C001600r BEL() {
        AnonymousClass8ZY r1 = this.A00;
        Interpolator interpolator = AnonymousClass8ZY.A0b;
        return AnonymousClass0VV.A00(new C207599vT(this.A01), r1.A0M);
    }

    public int getCurrentPosition() {
        AnonymousClass8ZY r1 = this.A00;
        Interpolator interpolator = AnonymousClass8ZY.A0b;
        return r1.A0O.A09.A04();
    }

    public int getDuration() {
        return this.A00.getVideoDuration();
    }
}
