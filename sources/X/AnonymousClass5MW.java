package X;

import com.whatsapp.bloks.BloksCameraOverlay;
import com.whatsapp.util.Log;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.5MW  reason: invalid class name */
public class AnonymousClass5MW extends C132446Tt {
    public final int A00;
    public final int A01;
    public final C16680pu A02;
    public final C1255560i A03;
    public final File A04;
    public final String A05;
    public final WeakReference A06;
    public final boolean A07;
    public final byte[] A08;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Log.i("BloksStorePictureTask/onPostExecute start");
        C119125pH r2 = (C119125pH) this.A02.get();
        if (r2 != null) {
            C16190ol r1 = (C16190ol) C133266Xn.A04(r2.A00, r2.A01);
            C18740tg.A06(r1);
            C143246qE r12 = (C143246qE) r1;
            r12.A0A = true;
            C132536Ue.A01(r2, r12, this.A03);
        }
        Log.i("BloksStorePictureTask/onPostExecute end");
    }

    public AnonymousClass5MW(C16680pu r2, BloksCameraOverlay bloksCameraOverlay, C1255560i r4, File file, String str, byte[] bArr, int i, int i2, boolean z) {
        this.A02 = r2;
        this.A08 = bArr;
        this.A07 = z;
        this.A04 = file;
        this.A05 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A06 = AnonymousClass001.A0F(bloksCameraOverlay);
        this.A03 = r4;
    }
}
