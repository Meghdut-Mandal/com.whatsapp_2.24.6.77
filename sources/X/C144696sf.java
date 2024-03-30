package X;

import java.util.Objects;
import java.util.Random;

/* renamed from: X.6sf  reason: invalid class name and case insensitive filesystem */
public final class C144696sf implements C30631aW {
    public final C20810yC A00;
    public final C21010yW A01;
    public final C19700wN A02;
    public final C19630wG A03;

    public /* synthetic */ void BV3() {
    }

    public void BV2() {
        C19720wP r3 = (C19720wP) this.A02;
        r3.A0C.Boy(new C35691j6(r3, 26));
        int A07 = this.A00.A07(1211);
        if (A07 > 0 && new Random().nextInt(A07) < 1) {
            AnonymousClass58Y r1 = new AnonymousClass58Y();
            r1.A01 = C36381kD.A0m();
            r1.A02 = C90474aD.A0Y();
            r1.A07 = "Dummy";
            r1.A06 = "Dummy";
            Objects.requireNonNull("2.24.6.77");
            r1.A04 = "2.24.6.77";
            this.A01.Blv(r1);
        }
        this.A03.A00.getDir("minidumps", 0).delete();
    }

    public C144696sf(C19700wN r1, C19630wG r2, C20810yC r3, C21010yW r4) {
        C36321k7.A18(r3, r1, r2, r4);
        this.A00 = r3;
        this.A02 = r1;
        this.A03 = r2;
        this.A01 = r4;
    }
}
