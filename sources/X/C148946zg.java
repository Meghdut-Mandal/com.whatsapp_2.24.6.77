package X;

import android.graphics.Bitmap;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.6zg  reason: invalid class name and case insensitive filesystem */
public final class C148946zg implements C160527l9 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C135066c4 A01;
    public final /* synthetic */ AnonymousClass1HA A02;
    public final /* synthetic */ StickerView A03;

    public /* synthetic */ void BXv() {
    }

    public C148946zg(C135066c4 r1, AnonymousClass1HA r2, StickerView stickerView, int i) {
        this.A03 = stickerView;
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }

    public void Bte(Bitmap bitmap, View view, AnonymousClass3T1 r11) {
        if (bitmap == null || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            AnonymousClass1HA r0 = this.A02;
            C135066c4 r2 = this.A01;
            StickerView stickerView = this.A03;
            int i = this.A00;
            r0.A09(stickerView, r2, (C88214Rv) null, i, i, false, false);
            return;
        }
        this.A03.setImageBitmap(bitmap);
    }

    public void Btu(View view) {
        this.A03.setImageResource(R.drawable.sticker_error_in_conversation);
    }

    public int BHb() {
        return this.A00;
    }
}
