package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.4o3  reason: invalid class name and case insensitive filesystem */
public class C96884o3 extends AnonymousClass0D3 {
    public View.OnLongClickListener A00;
    public C135066c4 A01;
    public boolean A02;
    public boolean A03;
    public final View.OnLongClickListener A04 = new C163337q2(this, 5);
    public final AnonymousClass1HA A05;
    public final C88234Rx A06;
    public final StickerView A07;
    public final Integer A08;

    public C96884o3(LayoutInflater layoutInflater, ViewGroup viewGroup, AnonymousClass1HA r5, C88234Rx r6, Integer num) {
        super(C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved));
        this.A05 = r5;
        this.A06 = r6;
        this.A08 = num;
        StickerView stickerView = (StickerView) this.A0H.findViewById(R.id.sticker_view);
        this.A07 = stickerView;
        stickerView.A02 = true;
    }
}
