package X;

import com.whatsapp.stickers.StickerView;

/* renamed from: X.3rP  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C78003rP implements C88214Rv {
    public final /* synthetic */ C65013Qj A00;
    public final /* synthetic */ C65633Sw A01;
    public final /* synthetic */ C46962bx A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C78003rP(C65013Qj r1, C65633Sw r2, C46962bx r3, boolean z) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = z;
    }

    public final void Bhf(boolean z) {
        StickerView stickerView;
        C65633Sw r4 = this.A01;
        C65013Qj r3 = this.A00;
        C46962bx r2 = this.A02;
        boolean z2 = this.A03;
        if (!z) {
            r3.A0c = true;
            C65633Sw.A01(r4, r2, z2);
            r4.A02();
            return;
        }
        if (r4.A02 || AnonymousClass3RT.A00) {
            stickerView = r4.A0G;
            stickerView.A00 = C65633Sw.A0S;
            stickerView.A04();
        } else {
            stickerView = r4.A0G;
            if (stickerView.A02) {
                stickerView.A04();
            }
            stickerView.A00 = C65633Sw.A0R;
        }
        stickerView.setOnClickListener(r4.A07);
    }
}
