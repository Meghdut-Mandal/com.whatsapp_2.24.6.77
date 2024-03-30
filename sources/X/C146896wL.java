package X;

import java.io.File;

/* renamed from: X.6wL  reason: invalid class name and case insensitive filesystem */
public class C146896wL implements AnonymousClass7h3 {
    public C1275868w A00;

    public File getFile(String str) {
        File A01 = this.A00.A01(str);
        if (A01.exists()) {
            return A01;
        }
        C36321k7.A1P("MessagesImporter/Can't find file in unpacked archive: ", str, AnonymousClass000.A0u());
        throw C90524aI.A0V(AnonymousClass000.A0p("Can't find file: ", str, AnonymousClass000.A0u()));
    }

    public C146896wL(C1275868w r1) {
        this.A00 = r1;
    }
}
