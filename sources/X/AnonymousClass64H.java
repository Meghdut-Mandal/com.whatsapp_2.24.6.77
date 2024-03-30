package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.mediacomposer.bottombar.caption.CaptionView;

/* renamed from: X.64H  reason: invalid class name */
public class AnonymousClass64H {
    public final Context A00;
    public final C21060yb A01;
    public final AnonymousClass1H2 A02;
    public final CaptionView A03;
    public final C19890wg A04;
    public final C220412q A05;

    public void A00(Integer num) {
        int intValue;
        View view;
        int i;
        CaptionView captionView;
        WaImageView waImageView;
        Context context;
        int i2;
        if (num != null && (intValue = num.intValue()) != -1) {
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue == 2) {
                        captionView = this.A03;
                        captionView.A0C.setEnabled(true);
                        waImageView = captionView.A0D;
                        waImageView.setVisibility(0);
                        waImageView.setActivated(false);
                        waImageView.setEnabled(true);
                        context = captionView.A06;
                        i2 = R.string.f12nameremoved;
                    } else if (intValue == 3) {
                        captionView = this.A03;
                        captionView.A0C.setEnabled(false);
                        waImageView = captionView.A0D;
                        waImageView.setVisibility(0);
                        waImageView.setActivated(true);
                        waImageView.setEnabled(true);
                        context = captionView.A06;
                        i2 = R.string.f12nameremoved;
                    } else {
                        throw AnonymousClass000.A0f(num, "Unexpected value: ", AnonymousClass000.A0u());
                    }
                    C36331k8.A0q(context, waImageView, i2);
                    view = captionView.A09;
                } else {
                    CaptionView captionView2 = this.A03;
                    captionView2.A0C.setEnabled(true);
                    WaImageView waImageView2 = captionView2.A0D;
                    waImageView2.setVisibility(0);
                    waImageView2.setActivated(false);
                    waImageView2.setEnabled(false);
                    view = captionView2.A09;
                }
                i = 8;
            } else {
                CaptionView captionView3 = this.A03;
                captionView3.A0C.setEnabled(true);
                captionView3.A0D.setVisibility(8);
                view = captionView3.A09;
                i = 0;
            }
            view.setVisibility(i);
        }
    }

    public AnonymousClass64H(C21060yb r2, C220412q r3, AnonymousClass1H2 r4, CaptionView captionView, C19890wg r6) {
        this.A03 = captionView;
        this.A00 = captionView.getContext();
        this.A05 = r3;
        this.A02 = r4;
        this.A01 = r2;
        this.A04 = r6;
        C33521fV.A03(captionView, R.string.f12nameremoved);
        captionView.setLayoutTransition(new C36531kS());
    }
}
