package X;

import android.os.SystemClock;
import android.view.Window;
import android.view.WindowManager;
import com.whatsapp.R;
import com.whatsapp.camera.overlays.ShutterOverlay;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Objects;

/* renamed from: X.65s  reason: invalid class name and case insensitive filesystem */
public class C1268165s {
    public final /* synthetic */ AnonymousClass6YT A00;

    public C1268165s(AnonymousClass6YT r1) {
        this.A00 = r1;
    }

    public void A00() {
        AnonymousClass6YT r3 = this.A00;
        C133106Wu r1 = r3.A0j;
        if (r1.A0A) {
            r1.A08.markerPoint(554240366, "on_shutter");
        }
        r3.A0a.A0H(new C81323wp((Object) this, 2));
    }

    public void A01(byte[] bArr, boolean z) {
        int i;
        AnonymousClass6YT r0 = this.A00;
        if (r0.A0A != null) {
            ShutterOverlay shutterOverlay = r0.A0H.A04;
            shutterOverlay.A01 = true;
            shutterOverlay.invalidate();
            shutterOverlay.postDelayed(new C81323wp((Object) shutterOverlay, 9), 50);
            Log.i("cameraui/picturetaken");
            byte[] bArr2 = bArr;
            boolean A1W = AnonymousClass000.A1W(bArr2);
            C133106Wu r11 = r0.A0j;
            Integer valueOf = Integer.valueOf(r0.A0C.getCameraApi());
            C161087m8 r2 = r0.A0C;
            int cameraType = r2.getCameraType();
            boolean z2 = !r2.BLt();
            C161087m8 r22 = r0.A0C;
            String flashMode = r22.getFlashMode();
            String l = Long.toString(r22.getPictureResolution());
            if (!flashMode.equals("on")) {
                i = 2;
                if (!flashMode.equals("auto")) {
                    i = 0;
                }
            } else {
                i = 1;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - r11.A00;
            AnonymousClass586 r4 = new AnonymousClass586();
            r4.A02 = Integer.valueOf(cameraType);
            r4.A00 = valueOf;
            r4.A01 = Integer.valueOf(z2 ? 1 : 0);
            r4.A03 = Integer.valueOf(i);
            r4.A05 = l;
            r4.A04 = Long.valueOf(elapsedRealtime);
            if (r11.A09) {
                r11.A07.Bly(r4);
            }
            if (r11.A0A) {
                C133106Wu.A01(r11, valueOf, 554240366, cameraType);
                C133106Wu.A00(r11, 554240366, z2);
                C21430zE r42 = r11.A08;
                r42.markerAnnotate(554240366, "flash_mode", flashMode);
                r42.markerAnnotate(554240366, "requested_photo_resolution", l);
                short s = 2;
                if (A1W) {
                    s = 87;
                }
                r42.markerEnd(554240366, s);
            }
            C132726Uz.A01(r0.A0i, r0.A0C.getFlashMode(), r0.A0C.getZoomLevel(), 1, 0, r0.A0C.BLt(), AnonymousClass6YT.A0M(r0));
            AnonymousClass6WU r5 = r0.A0E;
            C225314u r23 = r0.A0A;
            Objects.requireNonNull(r23, "Host activity is NULL");
            Window window = r23.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            r5.A0B.setVisibility(4);
            attributes.screenBrightness = -1.0f;
            window.setAttributes(attributes);
            if (A1W) {
                r0.A0a.A06(R.string.f12nameremoved, 1);
                r0.A12.BSr();
                return;
            }
            if (r0.A0A != null) {
                if (AnonymousClass1K2.A01(r0.A0l, r0.A0s) < 2013) {
                    C36351kA.A1A(r0.A09, R.id.save_progress, 0);
                }
            }
            C20690y0 r52 = r0.A0Z;
            C19890wg r6 = r0.A0s;
            C25471Gl r7 = C25471Gl.A0D;
            int i2 = 1;
            if (r0.A0q.A0E(401)) {
                i2 = 4;
            }
            File A0G = AnonymousClass1GW.A0G(r52, r6, r7, ".jpeg", 0, i2);
            C19770wU r24 = r0.A0v;
            C225314u r13 = r0.A0A;
            Objects.requireNonNull(r13, "Host activity is NULL");
            r24.Bp0(new AnonymousClass5MJ(r13, new C117035lb(r0), A0G, bArr2, AnonymousClass6YT.A00(r0), z), new Void[0]);
        }
    }
}
