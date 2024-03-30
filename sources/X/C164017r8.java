package X;

import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.view.Display;
import com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.7r8  reason: invalid class name and case insensitive filesystem */
public class C164017r8 implements DisplayManager.DisplayListener {
    public Object A00;
    public final int A01;

    public C164017r8(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onDisplayChanged(int i) {
        C001700s r1;
        Object A04;
        if (this.A01 != 0) {
            C124435yB r4 = (C124435yB) this.A00;
            DisplayManager displayManager = r4.A02;
            if (displayManager != null) {
                Display display = displayManager.getDisplay(0);
                Point point = new Point();
                display.getRealSize(point);
                boolean A1U = C36381kD.A1U(r4.A00, display.getRotation());
                boolean z = !AnonymousClass00C.A0J(r4.A01, point);
                if (A1U || z) {
                    r4.A00 = display.getRotation();
                    if (A1U || r4.A01 != null) {
                        C117965n7 r0 = r4.A03;
                        if (r0 != null) {
                            r0.A00.m16lambda$registerDisplayListener$0$comwhatsappvoipcallingcameraVoipCameraManager();
                        }
                        if (A1U && r4.A06.A0E(4773)) {
                            int i2 = r4.A00;
                            Voip.videoDeviceAndDisplayOrientationChanged(i2, i2, false);
                        }
                    }
                    r4.A01 = point;
                    return;
                }
                return;
            }
            return;
        }
        OrientationViewModel orientationViewModel = (OrientationViewModel) this.A00;
        if (C90474aD.A1X(orientationViewModel.A07)) {
            OrientationViewModel.A01(orientationViewModel, (4 - ((DisplayManager) orientationViewModel.A06.A00.getSystemService("display")).getDisplay(0).getRotation()) % 4);
        } else if (C90474aD.A1X(orientationViewModel.A08) && (A04 = r1.A04()) != null) {
            (r1 = orientationViewModel.A05).A0D(A04);
        }
    }

    public void onDisplayAdded(int i) {
    }

    public void onDisplayRemoved(int i) {
    }
}
