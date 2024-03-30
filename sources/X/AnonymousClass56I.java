package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.stickers.StickerView;
import java.io.File;

/* renamed from: X.56I  reason: invalid class name */
public final class AnonymousClass56I extends C96524nT {
    public boolean A00;
    public boolean A01;
    public final int A02;
    public final AnonymousClass1HA A03;
    public final C88234Rx A04;
    public final StickerView A05;
    public final C009003v A06;
    public final C24041Av A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass56I(View view, C24041Av r3, AnonymousClass1HA r4, C88234Rx r5, C009003v r6, int i) {
        super(view);
        AnonymousClass00C.A0D(view, 1);
        C36321k7.A1A(r4, r5, r6, r3, 3);
        this.A02 = i;
        this.A03 = r4;
        this.A04 = r5;
        this.A06 = r6;
        this.A07 = r3;
        this.A05 = (StickerView) C36361kB.A0F(view, R.id.sticker);
    }

    public static final C135066c4 A00(AnonymousClass56I r2, C135066c4 r3) {
        if (r3.A0L || r3.A0A != null) {
            return r3;
        }
        C24041Av r22 = r2.A07;
        String str = r3.A0E;
        if (str == null) {
            str = "";
        }
        File A042 = r22.A04(str, r3.A0D);
        C135066c4 A002 = r3.A00();
        A002.A0A = A042.getAbsolutePath();
        return A002;
    }

    public final void A0B(boolean z) {
        if (this.A00 != z) {
            this.A00 = z;
            if (!z || !this.A01) {
                StickerView stickerView = this.A05;
                stickerView.A03 = false;
                stickerView.A05();
                return;
            }
            StickerView stickerView2 = this.A05;
            stickerView2.A03 = true;
            stickerView2.A04();
        }
    }

    public final void A0C(boolean z) {
        if (z != this.A01) {
            this.A01 = z;
            if (!z) {
                StickerView stickerView = this.A05;
                stickerView.A03 = false;
                stickerView.A05();
            } else if (this.A00) {
                StickerView stickerView2 = this.A05;
                stickerView2.A03 = true;
                stickerView2.A04();
            }
        }
    }
}
