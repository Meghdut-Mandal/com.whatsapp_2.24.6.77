package X;

import java.io.File;

/* renamed from: X.3DH  reason: invalid class name */
public class AnonymousClass3DH {
    public final C19630wG A00;
    public final C177848eT A01;

    public File A00() {
        File A0w = C36441kJ.A0w(this.A00.A00.getFilesDir(), "biz_directory");
        if (!A0w.exists()) {
            A0w.mkdirs();
        }
        return C36441kJ.A0w(A0w, "directory_recent_search_history");
    }

    public AnonymousClass3DH(C19630wG r1, C177848eT r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
