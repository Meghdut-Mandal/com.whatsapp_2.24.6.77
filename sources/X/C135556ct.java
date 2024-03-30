package X;

import android.hardware.Camera;
import android.view.View;

/* renamed from: X.6ct  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C135556ct implements View.OnClickListener {
    public final /* synthetic */ Camera.PictureCallback A00;
    public final /* synthetic */ C119125pH A01;
    public final /* synthetic */ C143246qE A02;
    public final /* synthetic */ C132536Ue A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ C135556ct(Camera.PictureCallback pictureCallback, C119125pH r2, C143246qE r3, C132536Ue r4, String str) {
        this.A03 = r4;
        this.A04 = str;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = pictureCallback;
    }

    public final void onClick(View view) {
        C132536Ue r6 = this.A03;
        String str = this.A04;
        C119125pH r4 = this.A01;
        C143246qE r3 = this.A02;
        Camera.PictureCallback pictureCallback = this.A00;
        if (!r6.A00) {
            r6.A00 = true;
            int hashCode = str.hashCode();
            if (hashCode == 100313435 || hashCode != 112202875 || !str.equals("video")) {
                r3.A03.takePicture((Camera.ShutterCallback) null, (Camera.PictureCallback) null, pictureCallback);
                return;
            }
            C1030453i r1 = r3.A06;
            C18740tg.A04(r1);
            C132536Ue.A00(r1, r4, r3, r6.A03);
        }
    }
}
