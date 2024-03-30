package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.zip.ZipOutputStream;

/* renamed from: X.6pT  reason: invalid class name and case insensitive filesystem */
public class C142786pT implements C162157o7 {
    public boolean A00;
    public final OutputStream A01;
    public final ZipOutputStream A02;
    public final /* synthetic */ C101434xY A03;

    public C142786pT(C101434xY r5) {
        this.A03 = r5;
        FileOutputStream A0W = C90524aI.A0W(r5.A03);
        this.A01 = A0W;
        this.A02 = r5.A02.A05(AnonymousClass5U6.UNENCRYPTED, A0W, (byte[]) null, (byte[]) null);
    }

    public void BxY(File file) {
        if (file != null && file.isFile() && file.exists()) {
            FileInputStream A0U = C90524aI.A0U(file);
            try {
                AnonymousClass6YY.A0F(file, A0U, this.A02);
                A0U.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
    }

    public void close() {
        if (!this.A00) {
            this.A02.close();
            this.A01.close();
            this.A00 = true;
        }
    }
}
