package X;

import com.whatsapp.stickers.StickerView;

/* renamed from: X.7sM  reason: invalid class name and case insensitive filesystem */
public class C164777sM implements C88214Rv {
    public Object A00;
    public final int A01;

    public C164777sM(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Bhf(boolean z) {
        if (this.A01 != 0) {
            ((C96144mr) this.A00).A0D.A04();
            return;
        }
        C96884o3 r1 = (C96884o3) this.A00;
        if (r1.A03 && r1.A02) {
            StickerView stickerView = r1.A07;
            stickerView.A03 = true;
            stickerView.A04();
        }
    }
}
