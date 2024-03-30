package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.stickers.stickerpack.StickerPackDownloader;

/* renamed from: X.5Kq  reason: invalid class name and case insensitive filesystem */
public class C106635Kq extends C106675Ku {
    public View A00;
    public View A01;
    public boolean A02;

    public void A03(View view) {
        super.A03(view);
        this.A00 = view.findViewById(R.id.empty);
        this.A01 = view.findViewById(R.id.more_info_button);
        C36341k9.A0y(this.A00);
    }

    public C106635Kq(Context context, LayoutInflater layoutInflater, C20810yC r3, AnonymousClass1HA r4, AnonymousClass68B r5, AnonymousClass1AP r6, C88234Rx r7, StickerPackDownloader stickerPackDownloader, int i, int i2) {
        super(context, layoutInflater, r3, r4, r5, r6, r7, stickerPackDownloader, i, i2);
    }
}
