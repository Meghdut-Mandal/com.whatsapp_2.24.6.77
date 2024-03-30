package X;

import android.animation.ValueAnimator;
import android.content.Context;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.camera.mode.CameraModeTabLayout;

/* renamed from: X.6ne  reason: invalid class name and case insensitive filesystem */
public final class C141686ne implements C17690rq {
    public final /* synthetic */ CameraModeTabLayout A00;

    public void Biv(AnonymousClass6DR r11) {
        AnonymousClass00C.A0D(r11, 0);
        CameraModeTabLayout cameraModeTabLayout = this.A00;
        if (!AnonymousClass00C.A0J(cameraModeTabLayout.A00, r11)) {
            int i = 1;
            boolean A0J = AnonymousClass00C.A0J(r11.A06, 1);
            C1270866x mediaSharingUserJourneyLogger = cameraModeTabLayout.getMediaSharingUserJourneyLogger();
            if (cameraModeTabLayout.A06) {
                i = 6;
            }
            int i2 = 17;
            int i3 = 36;
            if (A0J) {
                i2 = 18;
                i3 = 35;
            }
            C1270866x.A00(mediaSharingUserJourneyLogger, i3, i, i2);
        }
        C157287ci r2 = cameraModeTabLayout.A01;
        if (r2 != null) {
            int A0C = C90484aE.A0C(r11.A06, "null cannot be cast to non-null type kotlin.Int");
            AnonymousClass6YT r7 = ((C144256rt) r2).A00;
            C128886Dz r3 = r7.A0g;
            r3.A00 = A0C;
            r7.A0I.A01(AnonymousClass000.A1S(A0C, 2), false, false);
            AnonymousClass6WU r8 = r7.A0E;
            boolean A1S = AnonymousClass000.A1S(r3.A00, 2);
            r8.A07 = A1S;
            int i4 = R.drawable.shutter_button_background;
            if (A1S) {
                i4 = R.drawable.recording_button_background;
            }
            WaImageView waImageView = r8.A0H;
            Context context = r8.A09;
            C36391kE.A18(context, waImageView, i4);
            float f = 1.0f;
            float f2 = 0.6f;
            if (A1S) {
                f2 = 1.0f;
                f = 0.6f;
            }
            waImageView.setActivated(false);
            float[] A0v = C90524aI.A0v();
            C90484aE.A1O(A0v, f2, f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(A0v);
            ofFloat.setDuration(220);
            ofFloat.setInterpolator(AnonymousClass6WU.A0M);
            C111565cU.A00(ofFloat, r8, 18);
            ofFloat.start();
            boolean z = r8.A07;
            int i5 = R.string.f12nameremoved;
            if (z) {
                i5 = R.string.f12nameremoved;
            }
            C36331k8.A0q(context, waImageView, i5);
            AnonymousClass6YT.A06(r7);
        }
        AnonymousClass3T3.A01(cameraModeTabLayout, cameraModeTabLayout.getSystemServices());
        cameraModeTabLayout.A06 = false;
        cameraModeTabLayout.A00 = r11;
    }

    public C141686ne(CameraModeTabLayout cameraModeTabLayout) {
        this.A00 = cameraModeTabLayout;
    }

    public void Biu(AnonymousClass6DR r3) {
        CameraModeTabLayout cameraModeTabLayout = this.A00;
        AnonymousClass3T3.A01(cameraModeTabLayout, cameraModeTabLayout.getSystemServices());
    }
}
