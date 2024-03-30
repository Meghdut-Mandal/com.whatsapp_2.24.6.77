package X;

import android.view.View;
import com.whatsapp.stickers.StickerView;
import java.util.List;

/* renamed from: X.6yz  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C148516yz implements C88214Rv {
    public final /* synthetic */ AnonymousClass56I A00;
    public final /* synthetic */ C135066c4 A01;

    public /* synthetic */ C148516yz(AnonymousClass56I r1, C135066c4 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void Bhf(boolean z) {
        AnonymousClass56I r1 = this.A00;
        C135066c4 r3 = this.A01;
        List list = AnonymousClass0D3.A0I;
        if (z) {
            boolean z2 = true;
            if (r1.A01 && r1.A00) {
                StickerView stickerView = r1.A05;
                stickerView.A03 = true;
                stickerView.A04();
            }
            r1.A05.requestLayout();
            View view = r1.A0H;
            if (r3.A0E == null) {
                z2 = false;
            }
            view.setEnabled(z2);
        }
    }
}
