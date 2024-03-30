package X;

import java.io.File;

/* renamed from: X.1Bm  reason: invalid class name and case insensitive filesystem */
public final class C24191Bm {
    public final C24041Av A00;
    public final C23981Ap A01;
    public final C24171Bj A02;

    public C24191Bm(C24041Av r2, C23981Ap r3, C24171Bj r4) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r4, 3);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    public final C111665ce A00(C135066c4 r5) {
        String str;
        AnonymousClass00C.A0D(r5, 0);
        String str2 = r5.A0E;
        if (str2 == null || str2.length() == 0) {
            str = "StickerDownloader/error: plain file hash is null or empty";
        } else {
            String str3 = r5.A0D;
            C24041Av r1 = this.A00;
            File A03 = r1.A03(str2, str3);
            if (A03 == null) {
                File A002 = this.A02.A00(r5, r1.A04(str2, r5.A0D), false);
                if (A002 != null) {
                    r5.A02(A002.getAbsolutePath(), 1);
                    C23981Ap r2 = this.A01;
                    String absolutePath = A002.getAbsolutePath();
                    AnonymousClass00C.A08(absolutePath);
                    r5.A04 = r2.A01(r5.A01(), absolutePath);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("StickerDownloader/error: sticker download failed, could not save file (hash=");
                    sb.append(r5.A0E);
                    sb.append(')');
                    str = sb.toString();
                }
            } else {
                r5.A02(A03.getAbsolutePath(), 1);
            }
            return new AnonymousClass5L5(r5);
        }
        return new AnonymousClass5L4(str);
    }
}
