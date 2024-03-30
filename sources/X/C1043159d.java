package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

/* renamed from: X.59d  reason: invalid class name and case insensitive filesystem */
public final class C1043159d extends C1043259e {
    public WaImageView A00;
    public AnonymousClass3XU A01;
    public C122535v0 A02;
    public C132446Tt A03;
    public final ViewGroup A04;
    public final ImageView A05;
    public final C21010yW A06;
    public final AnonymousClass1GZ A07;
    public final C87794Qe A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1043159d(ViewGroup viewGroup, C21060yb r6, C21010yW r7, AnonymousClass1GZ r8, C87794Qe r9, C19890wg r10) {
        super(viewGroup);
        AnonymousClass00C.A0D(r9, 6);
        this.A07 = r8;
        this.A06 = r7;
        this.A08 = r9;
        View view = this.A0H;
        this.A05 = C36361kB.A0M(view, R.id.thumb_view);
        ViewGroup viewGroup2 = (ViewGroup) C36361kB.A0F(view, R.id.video_preview_container);
        this.A04 = viewGroup2;
        if (AnonymousClass1K2.A01(r6, r10) >= 2012) {
            C122535v0 r0 = new C122535v0(C36371kC.A0B(view));
            this.A02 = r0;
            viewGroup2.addView(r0.A02, new FrameLayout.LayoutParams(-1, -1));
            this.A00 = C36431kI.A0X(viewGroup2, R.id.gif);
            viewGroup2.setVisibility(0);
        }
    }
}
