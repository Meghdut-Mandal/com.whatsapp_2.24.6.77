package X;

import com.whatsapp.status.playback.MessageReplyActivity;
import com.whatsapp.stickers.StickerView;
import java.util.HashMap;

/* renamed from: X.4Zh  reason: invalid class name and case insensitive filesystem */
public class C90154Zh implements C88214Rv {
    public Object A00;
    public final int A01;

    public C90154Zh(StickerView stickerView, int i) {
        this.A01 = i;
        this.A00 = stickerView;
    }

    public final void Bhf(boolean z) {
        StickerView stickerView;
        switch (this.A01) {
            case 0:
                StickerView stickerView2 = (StickerView) this.A00;
                HashMap hashMap = MessageReplyActivity.A1g;
                if (z) {
                    stickerView2.A02 = true;
                    stickerView2.A04();
                    return;
                }
                return;
            case 1:
                stickerView = (StickerView) this.A00;
                break;
            default:
                stickerView = (StickerView) this.A00;
                if (!z) {
                    return;
                }
                break;
        }
        stickerView.A04();
    }
}
