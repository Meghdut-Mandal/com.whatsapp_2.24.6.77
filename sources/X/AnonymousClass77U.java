package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.77U  reason: invalid class name */
public class AnonymousClass77U implements AnonymousClass004 {
    public final C118535oG A00;

    public AnonymousClass77U(File file) {
        try {
            String canonicalPath = file.getCanonicalPath();
            AnonymousClass6GT.A00(file);
            this.A00 = new C118535oG(this, canonicalPath);
        } catch (IOException e) {
            throw C90524aI.A0e("Unable to get canonical path", e);
        }
    }

    public /* bridge */ /* synthetic */ Object get() {
        return this.A00;
    }
}
