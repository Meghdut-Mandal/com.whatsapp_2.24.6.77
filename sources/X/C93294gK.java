package X;

import android.graphics.Bitmap;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.4gK  reason: invalid class name and case insensitive filesystem */
public class C93294gK extends C002000v {
    public final /* synthetic */ C132416Tn A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93294gK(C132416Tn r1, int i) {
        super(i);
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ int A03(Object obj, Object obj2) {
        return ((Bitmap) obj2).getByteCount() / EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
    }

    public /* bridge */ /* synthetic */ void A09(boolean z, Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        Bitmap bitmap = (Bitmap) obj2;
        C132416Tn r1 = this.A00;
        Bitmap bitmap2 = C132416Tn.A07;
        synchronized (r1.A02) {
            if (z) {
                if (r1.A00) {
                    r1.A03.A01(bitmap.getWidth(), bitmap.getHeight(), str);
                }
            }
        }
    }
}
