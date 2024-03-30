package X;

import java.io.ByteArrayInputStream;
import java.io.File;

/* renamed from: X.1BO  reason: invalid class name */
public final class AnonymousClass1BO {
    public final C24041Av A00;

    public AnonymousClass1BO(C24041Av r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public final File A00(AnonymousClass68B r3, byte[] bArr) {
        String str = r3.A0F;
        AnonymousClass00C.A08(str);
        File A01 = A01(str);
        if (A01 == null || !AnonymousClass6YY.A0S(A01, new ByteArrayInputStream(bArr))) {
            return null;
        }
        return A01;
    }

    public final File A01(String str) {
        File A0G = this.A00.A00.A0G();
        if (!A0G.exists() && !A0G.mkdirs()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".png");
        return new File(A0G, sb.toString());
    }

    public final void A02(String str) {
        File A01 = A01(str);
        if (A01 != null) {
            AnonymousClass6YY.A0P(A01);
        }
    }
}
