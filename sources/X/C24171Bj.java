package X;

import com.whatsapp.stickers.WebpUtils;
import java.io.File;

/* renamed from: X.1Bj  reason: invalid class name and case insensitive filesystem */
public final class C24171Bj {
    public final C24141Bg A00;

    public C24171Bj(C24141Bg r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public final File A00(C135066c4 r27, File file, boolean z) {
        C159697jm r9;
        C24141Bg r1 = this.A00;
        C135066c4 r3 = r27;
        File file2 = file;
        if (r3.A0L) {
            C18800tq r8 = r1.A01.A00.A00;
            C20050ww r14 = (C20050ww) r8.A7v.get();
            r8.A7f.get();
            AnonymousClass1BV AzY = r8.AzY();
            AnonymousClass17Y r12 = (AnonymousClass17Y) r8.A3e.get();
            C23981Ap r22 = (C23981Ap) r8.A83.get();
            WebpUtils webpUtils = (WebpUtils) r8.A9T.get();
            C20060wx r16 = (C20060wx) r8.A8B.get();
            r9 = new AnonymousClass5C1((C19700wN) r8.A2U.get(), (C20690y0) r8.A6r.get(), r12, (C24041Av) r8.A7I.get(), r14, (C19970wo) r8.A8b.get(), r16, (C20810yC) r8.A02.get(), AzY, (AnonymousClass1ST) r8.A4i.get(), (AnonymousClass1BS) r8.A7Q.get(), r3, r22, webpUtils, file2, z);
        } else {
            C18800tq r92 = r1.A00.A00.A00;
            r92.A7f.get();
            r9 = new AnonymousClass5Bs((AnonymousClass17Y) r92.A3e.get(), (C24041Av) r92.A7I.get(), (C20050ww) r92.A7v.get(), (C19970wo) r92.A8b.get(), (C20060wx) r92.A8B.get(), (C20810yC) r92.A02.get(), r92.AzY(), (AnonymousClass1ST) r92.A4i.get(), (AnonymousClass1BS) r92.A7Q.get(), r3, file2);
        }
        if (r9.B5v().A03()) {
            return r9.BB2();
        }
        return null;
    }
}
