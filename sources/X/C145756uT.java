package X;

import com.whatsapp.gifvideopreview.GifVideoPreviewActivity;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.6uT  reason: invalid class name and case insensitive filesystem */
public class C145756uT implements C25371Ga {
    public final WeakReference A00;

    public void onFailure(Exception exc) {
        throw null;
    }

    public void BXx(File file, String str, byte[] bArr) {
        C100794vk r1 = (C100794vk) this.A00.get();
        if (file == null) {
            if (r1 != null) {
                r1.A00.setVisibility(8);
            }
        } else if (r1 != null) {
            r1.A02.postDelayed(new C81193wc(r1, file, 44), 50);
        }
    }

    public C145756uT(GifVideoPreviewActivity gifVideoPreviewActivity) {
        this.A00 = AnonymousClass001.A0F(gifVideoPreviewActivity);
    }
}
