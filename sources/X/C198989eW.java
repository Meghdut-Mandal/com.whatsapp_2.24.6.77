package X;

import java.nio.ByteBuffer;
import java.util.Objects;

/* renamed from: X.9eW  reason: invalid class name and case insensitive filesystem */
public class C198989eW {
    public static final int[] A0A = {2, 3, 4, 6, 8};
    public ByteBuffer A00;
    public final C157737eb A01;
    public final C193359Ld A02 = new C193359Ld();
    public final C195409Ue A03;
    public final C121505tF A04 = new C121505tF();
    public final Object A05 = C36441kJ.A11();
    public final AnonymousClass7gK A06;
    public volatile boolean A07;
    public volatile boolean A08;
    public volatile boolean A09;

    public void A00() {
        if (this.A08) {
            this.A08 = false;
            this.A03.A00();
        }
    }

    public C198989eW(AnonymousClass9EM r5) {
        C21125A9l a9l = new C21125A9l(this);
        this.A06 = a9l;
        this.A01 = new B9D(this, 0);
        Objects.requireNonNull(r5);
        this.A03 = new C195409Ue(new C21124A9k(r5), a9l, 3);
    }
}
