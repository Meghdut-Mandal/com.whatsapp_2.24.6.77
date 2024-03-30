package X;

import android.hardware.Camera;
import android.text.TextUtils;
import com.whatsapp.bloks.BloksCameraOverlay;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: X.6ZU  reason: invalid class name */
public final /* synthetic */ class AnonymousClass6ZU implements Camera.PictureCallback {
    public final /* synthetic */ C16680pu A00;
    public final /* synthetic */ C143246qE A01;
    public final /* synthetic */ C132536Ue A02;

    public /* synthetic */ AnonymousClass6ZU(C16680pu r1, C143246qE r2, C132536Ue r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onPictureTaken(byte[] bArr, Camera camera) {
        C132536Ue r5 = this.A02;
        C143246qE r4 = this.A01;
        C16680pu r6 = this.A00;
        byte[] bArr2 = bArr;
        if (bArr == null) {
            r5.A01.A0H(new AVW(r5, 42));
            return;
        }
        C1255560i r8 = r5.A03;
        String str = r4.A07;
        if (TextUtils.isEmpty(str)) {
            String format = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("IMG_");
            A0u.append(format);
            str = AnonymousClass000.A0q(".png", A0u);
        }
        File A002 = r8.A00(str);
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(r4.A00, cameraInfo);
        C19770wU r1 = r5.A04;
        boolean A1S = AnonymousClass000.A1S(cameraInfo.facing, 1);
        String str2 = r4.A07;
        int i = r4.A01;
        int i2 = r4.A02;
        BloksCameraOverlay bloksCameraOverlay = r4.A05;
        C18740tg.A04(bloksCameraOverlay);
        r1.Bp0(new AnonymousClass5MW(r6, bloksCameraOverlay, r8, A002, str2, bArr2, i, i2, A1S), new Void[0]);
    }
}
