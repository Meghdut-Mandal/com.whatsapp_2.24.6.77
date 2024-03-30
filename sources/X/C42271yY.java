package X;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaMediaThumbnailView;

/* renamed from: X.1yY  reason: invalid class name and case insensitive filesystem */
public class C42271yY extends AnonymousClass0D3 {
    public final int A00;
    public final int A01;
    public final ColorDrawable A02;
    public final WaMediaThumbnailView A03;
    public final AnonymousClass3K8 A04;

    public C42271yY(View view, AnonymousClass3K8 r4) {
        super(view);
        this.A04 = r4;
        this.A00 = view.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        int A002 = AnonymousClass00F.A00(view.getContext(), R.color.f6nameremoved);
        this.A01 = A002;
        this.A02 = new ColorDrawable(A002);
        this.A03 = (WaMediaThumbnailView) C36361kB.A0F(view, R.id.selected_media_item_thumbnail);
    }
}
