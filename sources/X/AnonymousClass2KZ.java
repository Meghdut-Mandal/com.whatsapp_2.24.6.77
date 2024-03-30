package X;

import android.view.View;

/* renamed from: X.2KZ  reason: invalid class name */
public class AnonymousClass2KZ extends C65023Qk {
    public static final C61753Dh A02 = new C61753Dh(72, 4.0f, 1.0f);
    public static final C61753Dh A03 = new C61753Dh(72, 1.0f, 1.0f);
    public static final C61753Dh A04 = new C61753Dh(65, 5.0f, 7.0f);
    public final C61753Dh A00;
    public final C61753Dh A01;

    public AnonymousClass2KZ(C61753Dh r1, C61753Dh r2, int i) {
        super(i);
        this.A01 = r1;
        this.A00 = r2;
    }

    public static Float A00(float f, int i) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            f = Math.min(f, (float) View.MeasureSpec.getSize(i));
        } else if (mode != 0) {
            if (mode != 1073741824) {
                C36321k7.A1U("ConversationRowSingleImagePreviewCalculator/getSizeToSpec: Unhandled View.MeasureSpec ", AnonymousClass000.A0u(), mode);
            } else {
                f = (float) View.MeasureSpec.getSize(i);
            }
        }
        return Float.valueOf(f);
    }
}
