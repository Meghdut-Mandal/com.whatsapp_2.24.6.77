package X;

import java.io.File;

/* renamed from: X.1Bx  reason: invalid class name and case insensitive filesystem */
public final class C24301Bx {
    public final C19630wG A00;
    public final C20810yC A01;
    public final C24311By A02;
    public final C24121Be A03;
    public final C24321Bz A04;
    public final C24041Av A05;

    public C24301Bx(C24041Av r2, C19630wG r3, C20810yC r4, C24311By r5, C24121Be r6, C24321Bz r7) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r7, 3);
        AnonymousClass00C.A0D(r6, 4);
        AnonymousClass00C.A0D(r2, 5);
        AnonymousClass00C.A0D(r4, 6);
        this.A00 = r3;
        this.A02 = r5;
        this.A04 = r7;
        this.A03 = r6;
        this.A05 = r2;
        this.A01 = r4;
    }

    public final File A00(String str) {
        File A0G = this.A05.A00.A0G();
        if (!A0G.exists() && !A0G.mkdirs()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".png");
        return new File(A0G, sb.toString());
    }
}
