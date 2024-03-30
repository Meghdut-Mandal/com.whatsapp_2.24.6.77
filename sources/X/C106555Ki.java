package X;

import com.whatsapp.stickers.WebpInfo;
import com.whatsapp.stickers.WebpUtils;
import java.io.File;

/* renamed from: X.5Ki  reason: invalid class name and case insensitive filesystem */
public final class C106555Ki extends AnonymousClass6FM {
    public final AnonymousClass1HB A00;
    public final WebpInfo A01;
    public final WebpUtils A02;
    public final File A03;
    public final AnonymousClass00T A04 = C36431kI.A1I(new C153027Mt(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106555Ki(AnonymousClass1HB r2, WebpUtils webpUtils, File file) {
        super(file);
        C36321k7.A0x(r2, webpUtils);
        this.A00 = r2;
        this.A02 = webpUtils;
        this.A03 = file;
        this.A01 = webpUtils.A01(file.getAbsolutePath());
    }
}
