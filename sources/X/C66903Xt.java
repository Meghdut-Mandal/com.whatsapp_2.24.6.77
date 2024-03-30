package X;

import android.view.SurfaceHolder;
import com.whatsapp.util.Log;

/* renamed from: X.3Xt  reason: invalid class name and case insensitive filesystem */
public class C66903Xt implements SurfaceHolder.Callback {
    public final /* synthetic */ C37461mP A00;

    public C66903Xt(C37461mP r1) {
        this.A00 = r1;
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        String str;
        C37461mP r3 = this.A00;
        if (r3.A03 != null) {
            SurfaceHolder surfaceHolder2 = r3.A0L;
            if (surfaceHolder2.getSurface() == null) {
                str = "qrview/surfacechanged: no surface";
            } else {
                r3.A04.post(C80313vC.A00(r3, surfaceHolder2, 10));
                return;
            }
        } else if (r3.A04 == null) {
            str = "qrview/surfacechanged: no camera";
        } else {
            return;
        }
        Log.e(str);
        C37461mP.A00(r3, 1);
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        Log.i("qrview/surfaceCreated");
        C37461mP r2 = this.A00;
        C81133wW.A00(r2.A04, r2, 39);
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Log.i("qrview/surfacedestroyed");
        C37461mP r2 = this.A00;
        C81133wW.A00(r2.A04, r2, 41);
    }
}
