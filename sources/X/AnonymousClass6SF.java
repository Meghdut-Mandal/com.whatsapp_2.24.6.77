package X;

import android.graphics.Bitmap;
import java.io.File;

/* renamed from: X.6SF  reason: invalid class name */
public final class AnonymousClass6SF {
    public final AnonymousClass1BI A00;
    public final C24041Av A01;
    public final C19630wG A02;
    public final C20810yC A03;
    public final AnonymousClass1BC A04;

    public static final Bitmap A00(AnonymousClass6SF r3, File file, String str) {
        if (file == null || !file.exists()) {
            return null;
        }
        int A022 = (int) C90464aC.A02(r3.A02.A00, 28.0f, 1);
        Bitmap bitmap = AnonymousClass6Y8.A09(new C130396Kx(A022, A022), file).A02;
        boolean A0E = r3.A03.A0E(575);
        if (bitmap != null && A0E) {
            r3.A04.A00(bitmap, str);
        }
        return bitmap;
    }

    public static final File A01(AnonymousClass6SF r2, String str) {
        File A0G = r2.A01.A00.A0G();
        if (A0G.exists() || A0G.mkdirs()) {
            return C90464aC.A0K(A0G, ".png", AnonymousClass000.A0v(str));
        }
        return null;
    }

    public AnonymousClass6SF(C24041Av r1, C19630wG r2, C20810yC r3, AnonymousClass1BC r4, AnonymousClass1BI r5) {
        C36321k7.A1B(r3, r2, r4, r5, r1);
        this.A03 = r3;
        this.A02 = r2;
        this.A04 = r4;
        this.A00 = r5;
        this.A01 = r1;
    }
}
