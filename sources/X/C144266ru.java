package X;

import android.animation.AnimatorSet;
import com.whatsapp.R;
import com.whatsapp.camera.CameraBottomSheetBehavior;
import com.whatsapp.camera.overlays.ZoomOverlay;

/* renamed from: X.6ru  reason: invalid class name and case insensitive filesystem */
public class C144266ru implements C160857lh {
    public final /* synthetic */ AnonymousClass6YT A00;

    public C144266ru(AnonymousClass6YT r1) {
        this.A00 = r1;
    }

    public void BW3(float f, float f2) {
        AnonymousClass6YT r4 = this.A00;
        r4.A0u.A02((Integer) null, 12, AnonymousClass6YT.A01(r4));
        AnonymousClass6YT.A08(r4);
        AnonymousClass6YT.A06(r4);
    }

    public void BY6() {
        AnonymousClass6YT r1 = this.A00;
        if (!r1.A0C.BMx()) {
            AnonymousClass6YT.A06(r1);
        }
    }

    public void BY7() {
        AnonymousClass6YT r4 = this.A00;
        if (!r4.A0h.A00 && !r4.A0C.BMx()) {
            AnonymousClass6F9 r3 = r4.A0F;
            if (r3 == null || r4.A0g.A01 != 1) {
                C128886Dz r2 = r4.A0g;
                if (r2.A01 != 1 && r3 != null) {
                    AnimatorSet animatorSet = r3.A00;
                    if (animatorSet == null || !animatorSet.isStarted()) {
                        r2.A01 = 1;
                        AnonymousClass6YT.A0C(r4);
                        r4.A0F.A02(true);
                        return;
                    }
                    return;
                }
                return;
            }
            CameraBottomSheetBehavior cameraBottomSheetBehavior = r3.A0B;
            cameraBottomSheetBehavior.A0W(3);
            cameraBottomSheetBehavior.A00 = true;
            r3.A08.setVisibility(0);
            r3.A00();
        }
    }

    public void BYx(float f) {
        AnonymousClass6YT r1 = this.A00;
        if (!r1.A0C.BMx()) {
            AnonymousClass64G r0 = r1.A0H;
            if (r0 == null || r0.A05.getVisibility() != 0) {
                r1.A0G.A00(f);
            }
        }
    }

    public void Bgn(float f, float f2) {
        AnonymousClass6YT r1 = this.A00;
        r1.A0C.B7U(f, f2);
        r1.A0C.B2r();
        AnonymousClass6YT.A06(r1);
    }

    public void Bkp(float f) {
        AnonymousClass64G r6 = this.A00.A0H;
        ZoomOverlay zoomOverlay = r6.A05;
        float maxScale = zoomOverlay.getMaxScale();
        if (maxScale >= 1.0f) {
            if (f > maxScale) {
                f = maxScale;
            }
            C161087m8 r2 = r6.A02;
            int Bso = r2.Bso(Math.round((((float) r2.getMaxZoom()) * (f - 1.0f)) / (maxScale - 1.0f)));
            if (!r2.BMx() || r6.A00) {
                zoomOverlay.A00 = f;
                zoomOverlay.A02 = C36381kD.A0r(zoomOverlay.getContext(), Float.valueOf(((float) Bso) / 100.0f), AnonymousClass001.A0L(), R.string.f12nameremoved);
                zoomOverlay.invalidate();
            }
        }
    }

    public void Bkq(float f) {
        AnonymousClass6YT r1 = this.A00;
        if (!C90514aH.A1a(r1.A0g.A09)) {
            AnonymousClass6YT.A0J(r1, false);
        }
        AnonymousClass64G r12 = r1.A0H;
        if (!r12.A02.BMx() || r12.A00) {
            ZoomOverlay zoomOverlay = r12.A05;
            zoomOverlay.setVisibility(0);
            zoomOverlay.A00 = f;
            zoomOverlay.invalidate();
            zoomOverlay.removeCallbacks(zoomOverlay.A04);
            return;
        }
        r12.A05.setVisibility(4);
    }

    public void Bkr(float f) {
        AnonymousClass6YT r1 = this.A00;
        if (!r1.A0C.BMx()) {
            AnonymousClass6YT.A0J(r1, true);
        }
        ZoomOverlay zoomOverlay = r1.A0H.A05;
        zoomOverlay.invalidate();
        zoomOverlay.postDelayed(zoomOverlay.A04, 300);
    }
}
