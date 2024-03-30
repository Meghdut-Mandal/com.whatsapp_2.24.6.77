package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.zip.ZipOutputStream;

/* renamed from: X.6pS  reason: invalid class name and case insensitive filesystem */
public class C142776pS implements C162157o7 {
    public boolean A00;
    public final OutputStream A01;
    public final ZipOutputStream A02;
    public final /* synthetic */ C101484xd A03;

    public C142776pS(C101484xd r8) {
        byte[] bArr;
        byte[] bArr2;
        this.A03 = r8;
        C18740tg.A0F(AnonymousClass000.A1V(r8.A00), "prefix has not been initialized");
        FileOutputStream A0W = C90524aI.A0W(r8.A03);
        this.A01 = A0W;
        r8.A00.A01(A0W);
        AnonymousClass1CS r5 = r8.A02;
        AnonymousClass5U6 A0C = r8.A0C();
        AnonymousClass6FN r3 = r8.A00;
        boolean z = r3 instanceof C102114yo;
        if (z) {
            bArr = ((C102114yo) r3).A02;
        } else {
            bArr = ((C102134yq) r3).A03;
        }
        if (bArr != null) {
            if (z) {
                bArr2 = ((C102114yo) r3).A01;
            } else {
                bArr2 = ((C102134yq) r3).A02;
            }
            this.A02 = r5.A05(A0C, A0W, bArr, bArr2);
            return;
        }
        throw AnonymousClass001.A09("backup-prefix/get-key/key is null");
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
