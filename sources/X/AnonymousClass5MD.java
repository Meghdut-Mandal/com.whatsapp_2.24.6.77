package X;

import android.graphics.Bitmap;
import com.whatsapp.util.Log;

/* renamed from: X.5MD  reason: invalid class name */
public final class AnonymousClass5MD extends C132446Tt {
    public final C002000v A00;
    public final C1258261k A01;
    public final C19630wG A02;
    public final String A03;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            this.A00.A08(this.A03, AnonymousClass001.A0F(bitmap));
            this.A01.A00(bitmap);
            return;
        }
        Log.e("ImageComponentBinder/bindView/bitmap read failed");
    }

    public AnonymousClass5MD(C002000v r1, C1258261k r2, C19630wG r3, String str) {
        this.A02 = r3;
        this.A03 = str;
        this.A00 = r1;
        this.A01 = r2;
    }
}
