package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.OrientationEventListener;
import com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel;

/* renamed from: X.4d9  reason: invalid class name and case insensitive filesystem */
public class C92114d9 extends OrientationEventListener {
    public int A00 = -1;
    public final Handler A01 = new Handler(Looper.getMainLooper(), new C163797qm(this, 4));
    public final /* synthetic */ OrientationViewModel A02;

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        if (r4 >= (r1 + 270)) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onOrientationChanged(int r7) {
        /*
            r6 = this;
            r5 = -1
            if (r7 == r5) goto L_0x0049
            int r4 = r7 % 360
            com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel r1 = r6.A02
            int r2 = r1.A04
            int r0 = 360 - r2
            r3 = 1
            if (r4 >= r0) goto L_0x005f
            if (r4 < r2) goto L_0x005f
            int r1 = r1.A03
            int r0 = 90 - r1
            if (r4 < r0) goto L_0x004a
            int r0 = r1 + 90
            if (r4 >= r0) goto L_0x004a
            r2 = 1
        L_0x001b:
            int r0 = r6.A00
            if (r2 == r0) goto L_0x0049
            if (r2 == r5) goto L_0x0049
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/OrientationViewModel/VideoOrientationListener/onOrientationChanged Degress =  "
            X.C36321k7.A1T(r0, r1, r4)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/OrientationViewModel/VideoOrientationListener/onOrientationChanged from: "
            r1.append(r0)
            int r0 = r6.A00
            r1.append(r0)
            java.lang.String r0 = " to: "
            X.C36321k7.A1T(r0, r1, r2)
            r6.A00 = r2
            android.os.Handler r2 = r6.A01
            r2.removeMessages(r3)
            r0 = 800(0x320, double:3.953E-321)
            r2.sendEmptyMessageDelayed(r3, r0)
        L_0x0049:
            return
        L_0x004a:
            int r0 = 180 - r2
            if (r4 < r0) goto L_0x0054
            int r0 = r2 + 180
            if (r4 >= r0) goto L_0x0054
            r2 = 2
            goto L_0x001b
        L_0x0054:
            int r0 = 270 - r1
            if (r4 < r0) goto L_0x005d
            int r0 = r1 + 270
            r2 = 3
            if (r4 < r0) goto L_0x001b
        L_0x005d:
            r2 = -1
            goto L_0x001b
        L_0x005f:
            r2 = 0
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92114d9.onOrientationChanged(int):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92114d9(Context context, OrientationViewModel orientationViewModel) {
        super(context);
        this.A02 = orientationViewModel;
    }
}
