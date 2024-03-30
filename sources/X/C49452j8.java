package X;

import java.io.File;
import java.util.ArrayList;

/* renamed from: X.2j8  reason: invalid class name and case insensitive filesystem */
public final class C49452j8 extends C132446Tt {
    public final AnonymousClass1X4 A00;
    public final C146506vi A01;
    public final C46812bi A02;
    public final File A03;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C46812bi r4 = this.A02;
        File file = this.A03;
        if (!file.exists()) {
            return null;
        }
        ArrayList A022 = AnonymousClass6Qz.A02(file, 64);
        file.delete();
        int size = A022.size();
        if (size != 64) {
            return null;
        }
        byte[] bArr = new byte[size];
        int i = 0;
        do {
            bArr[i] = ((Number) A022.get(i)).byteValue();
            i++;
        } while (i < size);
        r4.A1j(new AnonymousClass3QP(bArr, 0, 0, 0, 0));
        return null;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        this.A00.A0S(this.A01, this.A02);
    }

    public C49452j8(AnonymousClass1X4 r1, C146506vi r2, C46812bi r3, File file) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = file;
    }
}
