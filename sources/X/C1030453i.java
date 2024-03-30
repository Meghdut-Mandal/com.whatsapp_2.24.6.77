package X;

import android.content.Context;
import android.hardware.Camera;
import android.view.Display;
import android.view.SurfaceHolder;

/* renamed from: X.53i  reason: invalid class name and case insensitive filesystem */
public class C1030453i extends C1030553k implements SurfaceHolder.Callback {
    public int A00;
    public int A01;
    public Camera A02;
    public boolean A03;
    public final SurfaceHolder A04;

    public C1030453i(Context context) {
        super(context);
        A0A();
        SurfaceHolder holder = getHolder();
        this.A04 = holder;
        holder.addCallback(this);
    }

    public int getDisplayOrientation() {
        Display defaultDisplay = C21060yb.A01(getContext()).getDefaultDisplay();
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(this.A00, cameraInfo);
        int rotation = defaultDisplay.getRotation();
        int i = 0;
        boolean A1S = AnonymousClass000.A1S(cameraInfo.facing, 1);
        int i2 = cameraInfo.orientation;
        if (rotation != 0) {
            if (rotation == 1) {
                i = 90;
            } else if (rotation == 2) {
                i = 180;
            } else if (rotation == 3) {
                i = 270;
            }
        }
        int i3 = (i2 - i) + 360;
        if (A1S) {
            i3 = 360 - ((i2 + i) % 360);
        }
        int i4 = i3 % 360;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("bloks_camera/startpreview display:");
        A0u.append(i);
        A0u.append(" camera:");
        A0u.append(i2);
        A0u.append(" preview:");
        A0u.append(i4);
        C36321k7.A1X(" front:", A0u, A1S);
        return i4;
    }
}
