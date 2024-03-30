package X;

import com.whatsapp.gallery.MediaGalleryActivity;

/* renamed from: X.4Yn  reason: invalid class name and case insensitive filesystem */
public class C89954Yn implements C87454Ow {
    public Object A00;
    public final int A01;

    public C89954Yn(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BVJ() {
        switch (this.A01) {
            case 0:
                C36431kI.A1N(this.A00);
                return;
            case 1:
                ((C88994Uv) this.A00).B7Q();
                return;
            case 2:
                ((C70803fk) this.A00).A2l.B7Q();
                return;
            case 3:
                MediaGalleryActivity mediaGalleryActivity = (MediaGalleryActivity) this.A00;
                C62473Gh r0 = mediaGalleryActivity.A0H;
                if (r0 != null) {
                    r0.A03.clear();
                }
                AnonymousClass0V9 r02 = mediaGalleryActivity.A05;
                if (r02 != null) {
                    r02.A05();
                    return;
                }
                return;
            default:
                AnonymousClass02E r1 = ((AnonymousClass02E) this.A00).A0I;
                if (r1 instanceof C87454Ow) {
                    ((C87454Ow) r1).BVJ();
                    return;
                }
                return;
        }
    }
}
