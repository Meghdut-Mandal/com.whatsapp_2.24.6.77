package X;

import java.io.File;

/* renamed from: X.0lR  reason: invalid class name and case insensitive filesystem */
public final class C14320lR extends C14340lT {
    public int A00;
    public boolean A01;
    public File[] A02;
    public final /* synthetic */ C13460ju A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14320lR(File file, C13460ju r2) {
        super(file);
        this.A03 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r2.length != 0) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (r4.A00 < r2.length) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File A00() {
        /*
            r4 = this;
            boolean r0 = r4.A01
            r3 = 0
            if (r0 != 0) goto L_0x000b
            r0 = 1
            r4.A01 = r0
            java.io.File r0 = r4.A00
            return r0
        L_0x000b:
            java.io.File[] r2 = r4.A02
            if (r2 == 0) goto L_0x001d
            int r1 = r4.A00
            int r0 = r2.length
            if (r1 >= r0) goto L_0x002a
        L_0x0014:
            int r1 = r4.A00
            int r0 = r1 + 1
            r4.A00 = r0
            r0 = r2[r1]
            return r0
        L_0x001d:
            java.io.File r0 = r4.A00
            java.io.File[] r2 = r0.listFiles()
            r4.A02 = r2
            if (r2 == 0) goto L_0x002a
            int r0 = r2.length
            if (r0 != 0) goto L_0x0014
        L_0x002a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14320lR.A00():java.io.File");
    }
}
