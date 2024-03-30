package X;

import android.graphics.Bitmap;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.1PN  reason: invalid class name */
public class AnonymousClass1PN extends C002000v {
    public C28281Sa A00;
    public final /* synthetic */ AnonymousClass1PM A01;

    public void A09(boolean z, Object obj, Object obj2, Object obj3) {
        C28281Sa r0;
        synchronized (this) {
            r0 = this.A00;
        }
        if (r0 != null) {
            r0.BWW(z, obj, obj2, obj3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1PN(AnonymousClass1PM r1, int i) {
        super(i);
        this.A01 = r1;
    }

    public /* bridge */ /* synthetic */ int A03(Object obj, Object obj2) {
        AnonymousClass1PM r0 = this.A01;
        Object obj3 = ((C594533z) obj2).A01;
        if (r0 instanceof AnonymousClass1SZ) {
            return ((Bitmap) obj3).getByteCount() / EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
        }
        return 1;
    }
}
