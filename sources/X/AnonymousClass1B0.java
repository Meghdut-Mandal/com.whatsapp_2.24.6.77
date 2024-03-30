package X;

import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Map;

/* renamed from: X.1B0  reason: invalid class name */
public final class AnonymousClass1B0 {
    public final AnonymousClass1B1 A00;
    public final AnonymousClass1B2 A01;

    public AnonymousClass1B0(AnonymousClass1B1 r2, AnonymousClass1B2 r3) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final AnonymousClass6FM A00(File file, String str) {
        File file2 = file;
        if (file == null) {
            return null;
        }
        if (AnonymousClass00C.A0J(str, "application/was")) {
            C18800tq r3 = this.A00.A00.A00;
            Map map = AnonymousClass6KV.A03;
            return new AnonymousClass5Kh((C20810yC) r3.A02.get(), (C21010yW) r3.A79.get(), (C23971Ao) r3.A4d.get(), new AnonymousClass6KV(new AnonymousClass6H2(), (C20810yC) r3.A02.get(), C18840tu.A00(r3.A4c)), file2);
        }
        if (!AnonymousClass00C.A0J(str, "image/webp")) {
            if (str == null) {
                Log.w("StickerHandlerFactory/getHandler null mimetype, defaulting to webp handler");
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("StickerHandlerFactory/getHandler Unable to create handler for ");
                sb.append(str);
                Log.w(sb.toString());
                return null;
            }
        }
        C18800tq r2 = this.A01.A00.A00;
        return new C106555Ki((AnonymousClass1HB) r2.A9S.get(), (WebpUtils) r2.A9T.get(), file);
    }
}
