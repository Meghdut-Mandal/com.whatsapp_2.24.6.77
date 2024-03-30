package X;

import android.os.Handler;
import android.view.View;
import android.widget.RelativeLayout;
import com.whatsapp.mediacomposer.doodle.ColorPickerComponent;
import com.whatsapp.mediacomposer.doodle.ColorPickerView;
import com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;

/* renamed from: X.6w2  reason: invalid class name and case insensitive filesystem */
public class C146706w2 implements C162047nw {
    public final Runnable A00;
    public final /* synthetic */ C146806wC A01;

    public C146706w2(C146806wC r1, Runnable runnable) {
        this.A01 = r1;
        this.A00 = runnable;
    }

    public void BW1() {
        C146806wC r2 = this.A01;
        r2.A0V.A0B = true;
        if (r2.A0P.A02 || r2.A0Q.A00 != null) {
            Handler handler = r2.A09;
            Runnable runnable = this.A00;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, 400);
        }
    }

    public void BW2() {
        C146806wC r4 = this.A01;
        C129126Fh r2 = r4.A0V;
        int i = 0;
        r2.A0B = false;
        C1265564m r7 = r4.A0P;
        if (r7.A02 || r4.A0Q.A00 != null) {
            AnonymousClass6FV r5 = r4.A0T;
            C129196Ft r6 = r5.A01;
            r4.A09.removeCallbacks(this.A00);
            if (!C146806wC.A06(r4)) {
                if (r6 == null) {
                    r4.A0K.A04(true);
                    r4.A0I.A00();
                } else if (r7.A02) {
                    ColorPickerComponent colorPickerComponent = r4.A0K;
                    if (colorPickerComponent.A03.getVisibility() != 0) {
                        colorPickerComponent.A02();
                    }
                }
                if (C36341k9.A07(r2.A0G.A06) == 2) {
                    r2.A0I.A01(r2.A0F);
                    r4.A0K.A02();
                } else {
                    r2.A04();
                }
                r4.A0N.setSystemUiVisibility(VoipLiteCamera.DEFAULT_SUPERNOVA_WIDTH);
                if (!C36401kF.A1a(r5.A03.A00)) {
                    i = 4;
                }
                TitleBarView titleBarView = r2.A0I;
                titleBarView.setUndoButtonVisibility(i);
                boolean A1X = C36401kF.A1X(r4.A0F);
                RelativeLayout toolbarExtra = titleBarView.getToolbarExtra();
                View startingViewFromToolbarExtra = titleBarView.getStartingViewFromToolbarExtra();
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) toolbarExtra.getLayoutParams();
                layoutParams.addRule(A1X ^ true ? 1 : 0, startingViewFromToolbarExtra.getId());
                toolbarExtra.setLayoutParams(layoutParams);
                r4.A0I.A02();
            }
        }
    }

    public void BgT(C129196Ft r6) {
        C146806wC r3 = this.A01;
        C001700s r4 = r3.A0V.A0G.A06;
        if (C36341k9.A07(r4) != 2) {
            boolean A0O = r6.A0O();
            if (A0O || r6.A0N()) {
                if (C36341k9.A07(r4) == 5) {
                    r3.A0K.A02();
                }
                if (r6.A0N()) {
                    int color = r6.A01.getColor();
                    if (color != 0) {
                        r3.A0K.setColorAndInvalidate(color);
                    }
                    ColorPickerView colorPickerView = r3.A0K.A03;
                    ColorPickerView.A01(colorPickerView);
                    colorPickerView.invalidate();
                }
                if (A0O) {
                    r3.A0K.setSizeAndInvalidate(r6.A08() * r3.A0N.A00);
                }
            } else {
                r3.A0K.A04(true);
                r3.A0I.A00();
            }
            C146806wC.A03(r3);
        }
    }
}
