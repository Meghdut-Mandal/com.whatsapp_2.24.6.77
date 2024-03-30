package X;

import android.graphics.drawable.Drawable;
import com.whatsapp.authentication.FingerprintView;
import com.whatsapp.storage.StorageUsageDeleteCompleteDialogFragment;

/* renamed from: X.4Vm  reason: invalid class name and case insensitive filesystem */
public class C89164Vm extends C06590Ue {
    public Object A00;
    public final int A01;

    public C89164Vm(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A02(Drawable drawable) {
        switch (this.A01) {
            case 0:
                return;
            case 1:
                AnonymousClass3BV r0 = ((FingerprintView) this.A00).A00;
                if (r0 != null) {
                    r0.A00();
                    return;
                }
                return;
            default:
                ((StorageUsageDeleteCompleteDialogFragment) this.A00).A00.A0I(C81183wb.A00(this, 13), 500);
                return;
        }
    }
}
