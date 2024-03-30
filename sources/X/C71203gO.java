package X;

import java.io.File;

/* renamed from: X.3gO  reason: invalid class name and case insensitive filesystem */
public class C71203gO implements C30631aW {
    public final C65813To A00;

    public /* synthetic */ void BV2() {
    }

    public void BV3() {
        File[] listFiles;
        C65813To r9 = this.A00;
        File A03 = C65813To.A03(r9);
        if (A03 != null && (listFiles = A03.listFiles()) != null) {
            for (File file : listFiles) {
                if (file.lastModified() + 604800000 <= System.currentTimeMillis()) {
                    AnonymousClass6YY.A0P(file);
                    r9.A00.A00(file);
                    file.getName();
                }
            }
        }
    }

    public C71203gO(C65813To r1) {
        this.A00 = r1;
    }
}
