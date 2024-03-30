package X;

import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;

/* renamed from: X.2kH  reason: invalid class name and case insensitive filesystem */
public class C50142kH extends C132446Tt {
    public final int A00;
    public final AnonymousClass68B A01;
    public final /* synthetic */ StickerStorePackPreviewActivity A02;

    public C50142kH(AnonymousClass68B r1, StickerStorePackPreviewActivity stickerStorePackPreviewActivity, int i) {
        this.A02 = stickerStorePackPreviewActivity;
        this.A00 = i;
        this.A01 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x006c, code lost:
        if (r1 != null) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r9) {
        /*
            r8 = this;
            X.6c4[] r9 = (X.C135066c4[]) r9
            int r0 = r9.length
            r1 = 0
            r5 = 1
            boolean r0 = X.AnonymousClass000.A1S(r0, r5)
            X.C18740tg.A0C(r0)
            r4 = r9[r1]
            X.C18740tg.A06(r4)
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r6 = r8.A02
            java.util.Map r1 = r6.A0P
            java.lang.String r0 = r4.A0E
            java.lang.String r1 = X.C36431kI.A1A(r0, r1)
            if (r1 != 0) goto L_0x006e
            X.1Cb r0 = r6.A05
            X.0yG r0 = r0.A00()
            X.C20850yG.A00(r0)
            java.io.File r1 = r0.A03
            java.lang.String r0 = "sticker"
            java.io.File r7 = X.C36441kJ.A0w(r1, r0)
            boolean r0 = r7.exists()
            if (r0 != 0) goto L_0x003a
            boolean r0 = r7.mkdirs()
            if (r0 == 0) goto L_0x0072
        L_0x003a:
            java.lang.String r3 = r4.A0E
            java.lang.StringBuilder r2 = X.C36421kH.A0f(r3)
            r1 = 47
            r0 = 45
            java.lang.String r0 = r3.replace(r1, r0)
            r2.append(r0)
            java.lang.String r0 = ".webp"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r2)
            java.io.File r3 = X.C36441kJ.A0w(r7, r0)
            java.util.Map r2 = r6.A0P
            java.lang.String r1 = r4.A0E
            java.lang.String r0 = r3.getAbsolutePath()
            r2.put(r1, r0)
            X.1Bj r0 = r6.A0J
            java.io.File r0 = r0.A00(r4, r3, r5)
            if (r0 == 0) goto L_0x0072
            java.lang.String r1 = r0.getAbsolutePath()
            if (r1 == 0) goto L_0x0072
        L_0x006e:
            r0 = 2
            r4.A02(r1, r0)
        L_0x0072:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50142kH.A08(java.lang.Object[]):java.lang.Object");
    }

    public void A09() {
        C96144mr r2 = this.A02.A0L;
        if (r2 != null) {
            r2.A0M(this.A00, false);
        }
    }

    public void A0A() {
        this.A02.A0L.A0M(this.A00, true);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        StickerStorePackPreviewActivity stickerStorePackPreviewActivity = this.A02;
        C96144mr r1 = stickerStorePackPreviewActivity.A0L;
        int i = this.A00;
        r1.A0M(i, false);
        stickerStorePackPreviewActivity.A0L.A0N((C135066c4) obj, this.A01, i);
    }
}
