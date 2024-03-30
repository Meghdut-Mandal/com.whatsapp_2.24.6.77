package X;

import java.io.File;
import java.util.Map;

/* renamed from: X.6Kf  reason: invalid class name and case insensitive filesystem */
public class C130226Kf {
    public final C19630wG A00;
    public final C21860zv A01;
    public final AnonymousClass6Sj A02;
    public final C21010yW A03;

    public C130226Kf(C19630wG r1, C21860zv r2, AnonymousClass6Sj r3, C21010yW r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }

    public static void A00(C130226Kf r5, File file, Map map) {
        int indexOf;
        String substring;
        String A0z;
        String name = file.getName();
        AnonymousClass58Y r2 = new AnonymousClass58Y();
        r2.A01 = C36381kD.A0m();
        r2.A02 = C90474aD.A0Y();
        r2.A07 = "native";
        int indexOf2 = name.indexOf("_");
        if (indexOf2 > 0 && (A0z = C90514aH.A0z(name, indexOf2)) != null) {
            r2.A04 = A0z;
        }
        int i = indexOf2 + 1;
        if (i > 1 && (indexOf = name.indexOf("_", i)) >= 0 && (substring = name.substring(i, indexOf)) != null && map.containsKey(substring)) {
            C121535tI A002 = C21860zv.A00((File) map.get(substring));
            r2.A03 = A002.A02;
            r2.A08 = A002.A01;
            r2.A00 = A002.A00;
        }
        r5.A03.Blv(r2);
    }
}
