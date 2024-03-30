package X;

import java.io.File;

/* renamed from: X.0yF  reason: invalid class name and case insensitive filesystem */
public class C20840yF {
    public final C20850yG A00;

    public File A00(String str) {
        C20850yG r0 = this.A00;
        C20850yG.A00(r0);
        return new File(r0.A03, str);
    }

    public C20840yF(C19630wG r4, C20830yE r5, C20060wx r6) {
        this.A00 = new C20850yG(r5, r6, new File(r4.A00.getFilesDir(), ".trash"));
    }
}
