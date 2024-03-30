package X;

import com.whatsapp.stickers.StickerView;

/* renamed from: X.6z2  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C148546z2 implements C88214Rv {
    public final /* synthetic */ C144326s0 A00;
    public final /* synthetic */ C135066c4 A01;
    public final /* synthetic */ Integer A02;

    public /* synthetic */ C148546z2(C144326s0 r1, C135066c4 r2, Integer num) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = num;
    }

    public final void Bhf(boolean z) {
        C144326s0 r3 = this.A00;
        C135066c4 r5 = this.A01;
        Integer num = this.A02;
        if (z) {
            C48762i0.A00(r3.A04, r3, 5);
            r3.A0B.setVisibility(8);
            r3.A06.setVisibility(8);
            r3.A0D = r5;
            r3.A0F = num;
            r3.A0E.setContentDescription(AnonymousClass3RT.A00(r3.A0H, r5));
            StickerView stickerView = r3.A0E;
            stickerView.A02 = true;
            stickerView.A04();
            return;
        }
        r3.A07.setVisibility(8);
        r3.A0B.setVisibility(0);
        r3.A06.setVisibility(0);
    }
}
