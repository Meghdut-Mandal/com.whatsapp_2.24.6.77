package X;

import java.util.Objects;

/* renamed from: X.83Y  reason: invalid class name */
public final class AnonymousClass83Y extends C20970A1g {
    public static final C1691688a A08 = new C1691688a();
    public C20984A1y A00;
    public final AnonymousClass9P9 A01;
    public final AnonymousClass9LG A02;
    public final C114735hk A03;
    public final C111595cX A04;
    public final AnonymousClass00T A05;
    public final AnonymousClass00T A06;
    public final C160697lR[] A07 = new C160697lR[1];

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass83Y(AnonymousClass9P9 r3, AnonymousClass9LG r4, C114735hk r5, B3B b3b, C111595cX r7) {
        super(b3b);
        C36341k9.A1F(r5, r4);
        this.A01 = r3;
        this.A04 = r7;
        this.A03 = r5;
        this.A02 = r4;
        AnonymousClass94Q r1 = B49.A00;
        B3B b3b2 = this.A00;
        Objects.requireNonNull(b3b2);
        this.A00 = (C20984A1y) b3b2.BA0(r1);
        C000800j r12 = C000800j.NONE;
        this.A05 = C001400p.A00(r12, new C22040Afn(this));
        this.A06 = C001400p.A00(r12, new C22041Afo(this));
    }

    public C1691688a BDJ() {
        return A08;
    }
}
