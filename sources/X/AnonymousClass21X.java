package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.inappsupportbloks.components.BloksSupportVideoView;

/* renamed from: X.21X  reason: invalid class name */
public final class AnonymousClass21X extends C98174r0 {
    public final /* synthetic */ C132376Ti A00;

    public Object A0F(View view, C1271967i r11, C140456lc r12, Object obj) {
        C36321k7.A0v(view, 0, r12);
        String A0Z = r12.A0Z(36);
        String A0Z2 = r12.A0Z(35);
        String A0Z3 = r12.A0Z(38);
        int A0T = r12.A0T(40, 0);
        r12.A0Z(41);
        String A0Z4 = r12.A0Z(43);
        String A0Z5 = r12.A0Z(42);
        String A0Z6 = r12.A0Z(44);
        String A0Z7 = r12.A0Z(45);
        ((BloksSupportVideoView) C012005e.A02(view, R.id.support_video_view)).A07(Integer.valueOf(A0T), A0Z, A0Z3, A0Z2, A0Z5, A0Z6, A0Z4, A0Z7);
        return null;
    }

    public void A0H(View view, C1271967i r6, C140456lc r7, Object obj, Object obj2) {
        AnonymousClass00C.A0D(view, 0);
        BloksSupportVideoView bloksSupportVideoView = (BloksSupportVideoView) C012005e.A02(view, R.id.support_video_view);
        WaImageView waImageView = bloksSupportVideoView.A03;
        if (waImageView == null) {
            throw C36331k8.A0d("videoThumbnail");
        }
        waImageView.setImageBitmap((Bitmap) null);
        WaImageView waImageView2 = bloksSupportVideoView.A02;
        if (waImageView2 == null) {
            throw C36331k8.A0d("playButton");
        }
        waImageView2.setOnClickListener((View.OnClickListener) null);
        ((AnonymousClass155) C36361kB.A06(bloksSupportVideoView)).A3a(bloksSupportVideoView.A05);
        bloksSupportVideoView.A05 = null;
        bloksSupportVideoView.getSupportVideoLogger().A01 = null;
    }

    public /* bridge */ /* synthetic */ Object B4O(Context context) {
        AnonymousClass00C.A0D(context, 0);
        View A0D = C36421kH.A0D(context, R.layout.f9nameremoved);
        AnonymousClass00C.A08(A0D);
        return A0D;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass21X(C1271967i r1, C140456lc r2, C132376Ti r3) {
        super(r1, r2);
        this.A00 = r3;
    }
}
