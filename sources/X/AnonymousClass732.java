package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import com.whatsapp.R;
import com.whatsapp.camera.overlays.AutofocusOverlay;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: X.732  reason: invalid class name */
public class AnonymousClass732 implements Runnable {
    public float A00;
    public float A01;
    public Object A02;
    public final int A03;

    public AnonymousClass732(Object obj, float f, float f2, int i) {
        this.A03 = i;
        this.A02 = obj;
        this.A00 = f;
        this.A01 = f2;
    }

    public final void run() {
        float f;
        AnonymousClass64G r3;
        float left;
        View view;
        switch (this.A03) {
            case 0:
                float f2 = this.A00;
                f = this.A01;
                AnonymousClass6YT r1 = ((C144246rs) this.A02).A00;
                r3 = r1.A0H;
                left = ((float) r1.A08.getLeft()) + f2;
                view = r1.A08;
                break;
            case 1:
                C1030553k r32 = (C1030553k) this.A02;
                float f3 = this.A00;
                float f4 = this.A01;
                synchronized (r32) {
                    Camera camera = r32.A07;
                    if (camera != null && r32.A0K) {
                        camera.cancelAutoFocus();
                        Camera.Parameters parameters = r32.A07.getParameters();
                        if (parameters.getMaxNumFocusAreas() > 0) {
                            float dimension = C36341k9.A0F(r32).getDimension(R.dimen.f7nameremoved) / 2.0f;
                            RectF rectF = new RectF(f3 - dimension, f4 - dimension, f3 + dimension, dimension + f4);
                            Matrix A0B = C90524aI.A0B();
                            float f5 = 1.0f;
                            if (r32.A0L) {
                                f5 = -1.0f;
                            }
                            A0B.setScale(f5, 1.0f);
                            A0B.postRotate((float) r32.A01);
                            float width = (float) r32.getWidth();
                            float height = (float) r32.getHeight();
                            A0B.postScale(width / 2000.0f, height / 2000.0f);
                            A0B.postTranslate(width / 2.0f, height / 2.0f);
                            A0B.invert(A0B);
                            A0B.mapRect(rectF);
                            Rect A06 = AnonymousClass001.A06();
                            int A002 = C1030553k.A00(rectF.left);
                            A06.left = A002;
                            int A003 = C1030553k.A00(rectF.top);
                            A06.top = A003;
                            int A004 = C1030553k.A00(rectF.right);
                            A06.right = A004;
                            int A005 = C1030553k.A00(rectF.bottom);
                            A06.bottom = A005;
                            if (AnonymousClass000.A05(A003, A005) < 10) {
                                A06.top = A003 - 5;
                                A06.bottom = A005 + 5;
                            }
                            if (AnonymousClass000.A05(A002, A004) < 10) {
                                A06.left = A002 - 5;
                                A06.right = A004 + 5;
                            }
                            ArrayList A0I = AnonymousClass001.A0I();
                            A0I.add(new Camera.Area(A06, 1000));
                            parameters.setFocusAreas(A0I);
                            List<String> supportedFocusModes = parameters.getSupportedFocusModes();
                            if (supportedFocusModes != null && supportedFocusModes.contains("auto")) {
                                parameters.setFocusMode("auto");
                            }
                            r32.A07.setParameters(parameters);
                            C160747lW r0 = r32.A0E;
                            Objects.requireNonNull(r0);
                            r0.BRd(f3, f4);
                        }
                        r32.A07.autoFocus(new AnonymousClass6ZQ(r32));
                    }
                }
                return;
            default:
                float f6 = this.A00;
                f = this.A01;
                AnonymousClass3UB r12 = (AnonymousClass3UB) ((AnonymousClass4X4) this.A02).A00;
                r3 = r12.A05;
                left = ((float) r12.A08.A01.getLeft()) + f6;
                view = r12.A08.A01;
                break;
        }
        float top = ((float) view.getTop()) + f;
        AutofocusOverlay autofocusOverlay = r3.A03;
        float f7 = autofocusOverlay.A00 / 2.0f;
        autofocusOverlay.A01 = new RectF(left - f7, top - f7, f7 + left, f7 + top);
        autofocusOverlay.A03 = null;
        autofocusOverlay.setVisibility(0);
        if (autofocusOverlay.A04) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.5f, 1.0f, 1.5f, 1.0f, 0, left, 0, top);
            scaleAnimation.setDuration(400);
            scaleAnimation.setInterpolator(new OvershootInterpolator());
            scaleAnimation.setFillAfter(true);
            autofocusOverlay.startAnimation(scaleAnimation);
        }
        autofocusOverlay.invalidate();
        autofocusOverlay.removeCallbacks(autofocusOverlay.A07);
    }
}
