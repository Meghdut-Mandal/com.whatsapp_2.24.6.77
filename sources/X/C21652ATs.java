package X;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStream;

/* renamed from: X.ATs  reason: case insensitive filesystem */
public abstract class C21652ATs implements Closeable {
    public void close() {
    }

    public C21650ATq A00() {
        if (this instanceof AnonymousClass892) {
            AnonymousClass892 r4 = (AnonymousClass892) this;
            AnonymousClass894 r3 = r4.A01;
            r3.A02();
            AnonymousClass890[] r2 = r3.A00;
            int i = r4.A00;
            r4.A00 = i + 1;
            AnonymousClass890 r22 = r2[i];
            InputStream inputStream = r3.A03.getInputStream(r22.A01);
            try {
                return new C21650ATq(r22, inputStream);
            } catch (Throwable th) {
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } else {
            AnonymousClass891 r32 = (AnonymousClass891) this;
            C1693888z[] r23 = r32.A01.A00;
            int i2 = r32.A00;
            r32.A00 = i2 + 1;
            C1693888z r24 = r23[i2];
            FileInputStream fileInputStream = new FileInputStream(r24.A00);
            try {
                return new C21650ATq(r24, fileInputStream);
            } catch (Throwable th2) {
                fileInputStream.close();
                throw th2;
            }
        }
    }

    public boolean A01() {
        if (this instanceof AnonymousClass892) {
            AnonymousClass892 r1 = (AnonymousClass892) this;
            AnonymousClass894 r0 = r1.A01;
            r0.A02();
            return AnonymousClass000.A1T(r1.A00, r0.A00.length);
        }
        AnonymousClass891 r02 = (AnonymousClass891) this;
        return AnonymousClass000.A1T(r02.A00, r02.A01.A00.length);
    }
}
