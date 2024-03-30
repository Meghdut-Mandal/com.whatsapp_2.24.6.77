package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.calling.callgrid.view.CallGrid;
import com.whatsapp.stickers.StickerView;
import java.lang.ref.WeakReference;

/* renamed from: X.7on  reason: invalid class name and case insensitive filesystem */
public class C162567on extends C06590Ue {
    public Object A00;
    public final int A01;

    public C162567on(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A01(Drawable drawable) {
        if (2 - this.A01 != 0) {
            super.A01(drawable);
            return;
        }
        AnonymousClass00C.A0D(drawable, 0);
        C06590Ue r0 = ((StickerView) this.A00).A01;
        if (r0 != null) {
            r0.A01(drawable);
        }
    }

    public void A02(Drawable drawable) {
        View A0Y;
        switch (this.A01) {
            case 0:
                AnonymousClass6C3 r1 = (AnonymousClass6C3) this.A00;
                AnonymousClass0BQ r0 = r1.A00;
                if (r0 != null) {
                    r0.start();
                }
                WeakReference weakReference = r1.A02;
                if (weakReference != null && (A0Y = AnonymousClass000.A0Y(weakReference)) != null) {
                    A0Y.invalidate();
                    return;
                }
                return;
            case 1:
                AnonymousClass0BQ r02 = ((CallGrid) this.A00).A00;
                if (r02 != null) {
                    r02.start();
                    return;
                }
                return;
            default:
                AnonymousClass00C.A0D(drawable, 0);
                C06590Ue r03 = ((StickerView) this.A00).A01;
                if (r03 != null) {
                    r03.A02(drawable);
                    return;
                }
                return;
        }
    }
}
