package X;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.3Qb  reason: invalid class name and case insensitive filesystem */
public class C64943Qb {
    public final C20050ww A00;
    public final C19630wG A01;
    public final C24051Aw A02;

    private List A00(String str) {
        File[] listFiles;
        File A0w = C36441kJ.A0w(this.A01.A00.getFilesDir(), "downloadable/wallpaper");
        if (A0w.exists()) {
            File A0w2 = C36441kJ.A0w(A0w, "thumbnails");
            if (A0w2.exists()) {
                File A0w3 = C36441kJ.A0w(A0w2, str);
                if (A0w3.exists() && (listFiles = A0w3.listFiles()) != null) {
                    Arrays.sort(listFiles, C81733xU.A00);
                    return Arrays.asList(listFiles);
                }
            }
        }
        return AnonymousClass001.A0I();
    }

    public AnonymousClass35Z A01() {
        File A0w = C36441kJ.A0w(this.A01.A00.getFilesDir(), "downloadable/wallpaper");
        if (!A0w.exists() || !C36441kJ.A0w(A0w, "thumbnails").exists()) {
            return null;
        }
        return new AnonymousClass35Z(A00("dark"), A00("light"));
    }

    public File A02(String str) {
        File A0w = C36441kJ.A0w(this.A01.A00.getFilesDir(), "downloadable/wallpaper");
        if (A0w.exists()) {
            File A0w2 = C36441kJ.A0w(A0w, AnonymousClass000.A0q(".jpg", AnonymousClass000.A0v(str)));
            if (A0w2.exists()) {
                return A0w2;
            }
        }
        return null;
    }

    public C64943Qb(C20050ww r1, C19630wG r2, C24051Aw r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
