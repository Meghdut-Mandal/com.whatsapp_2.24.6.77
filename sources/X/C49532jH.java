package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* renamed from: X.2jH  reason: invalid class name and case insensitive filesystem */
public class C49532jH extends C132446Tt {
    public final int A00;
    public final int A01;
    public final Uri A02;
    public final AnonymousClass1GX A03;
    public final WeakReference A04;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        int max = Math.max(this.A01, this.A00);
        try {
            return this.A03.A0e(this.A02, max, max);
        } catch (AnonymousClass1X5 | IOException e) {
            Log.e("BaseQrActivity/loadImageRunnable Failed to load image", e);
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C47072cl r5 = (C47072cl) this.A04.get();
        if (r5 != null && !r5.BLh()) {
            r5.A01.setVisibility(C36411kG.A08(bitmap));
            r5.A01.setImageBitmap(bitmap);
            if (bitmap == null) {
                r5.A05.A06(R.string.f12nameremoved, 0);
                r5.A0X = false;
                r5.Bnv();
                return;
            }
            C19770wU r4 = r5.A04;
            AnonymousClass1GX r3 = r5.A0U;
            C36391kE.A1Q(new C50232kQ(r5.A00, r5.A0b, r3), r4);
        }
    }

    public C49532jH(Uri uri, C47072cl r3, AnonymousClass1GX r4, int i, int i2) {
        this.A03 = r4;
        this.A02 = uri;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = AnonymousClass001.A0F(r3);
    }
}
