package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: X.1lG  reason: invalid class name and case insensitive filesystem */
public final class C36761lG extends BitmapDrawable {
    public final AnonymousClass2bU A00;

    public int getIntrinsicHeight() {
        int i;
        C65013Qj r0 = this.A00.A01;
        if (r0 == null || (i = r0.A06) <= 0) {
            return super.getIntrinsicHeight();
        }
        return i;
    }

    public int getIntrinsicWidth() {
        int i;
        C65013Qj r0 = this.A00.A01;
        if (r0 == null || (i = r0.A0A) <= 0) {
            return super.getIntrinsicWidth();
        }
        return i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36761lG(Resources resources, Bitmap bitmap, AnonymousClass2bU r3) {
        super(resources, bitmap);
        C36321k7.A0x(r3, resources);
        this.A00 = r3;
    }
}
