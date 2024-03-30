package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* renamed from: X.6vr  reason: invalid class name and case insensitive filesystem */
public class C146596vr implements C160127kV {
    public long A00 = 0;
    public final C20060wx A01;
    public final C20810yC A02;
    public final File A03;

    public OutputStream Bl9(C162167o8 r6) {
        if (((long) ((C146096v1) r6).A01.getContentLength()) <= this.A01.A01()) {
            try {
                if (C20800yB.A01(C21000yV.A01, this.A02, 1539)) {
                    Bwp();
                    return new FileOutputStream(this.A03, true);
                }
                File file = this.A03;
                AnonymousClass6YY.A0P(file);
                return new FileOutputStream(file, false);
            } catch (FileNotFoundException e) {
                Log.e("plainfiledownload/FileNotFoundException", e);
                throw new AnonymousClass5V9(9);
            }
        } else {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("plainfiledownload/not enough space to store the file: ");
            C36351kA.A1L(this.A03, A0u);
            throw new AnonymousClass5V9(4);
        }
    }

    public void Bwp() {
        long j;
        if (C20800yB.A01(C21000yV.A01, this.A02, 1539)) {
            j = this.A03.length();
        } else {
            j = 0;
        }
        this.A00 = j;
    }

    public C146596vr(C20060wx r3, C20810yC r4, File file) {
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = file;
    }

    public long BEc() {
        return this.A00;
    }
}
