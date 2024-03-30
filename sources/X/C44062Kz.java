package X;

import com.whatsapp.gallery.GalleryFragmentBase;

/* renamed from: X.2Kz  reason: invalid class name and case insensitive filesystem */
public class C44062Kz implements AnonymousClass00P, C006302t {
    public Object A00;
    public Object A01;
    public final int A02;

    public C44062Kz(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final Object invoke(Object obj) {
        if (this.A02 != 0) {
            C96154ms r4 = (C96154ms) this.A00;
            AnonymousClass11F A0j = C36351kA.A0j((AnonymousClass141) obj);
            r4.A0A.A0N(A0j, ((C134776ba) this.A01).A00);
            r4.A0G.A00.startActivity(r4.A0J.A1Z(r4.A04, A0j, 22));
            return null;
        }
        GalleryFragmentBase galleryFragmentBase = (GalleryFragmentBase) this.A00;
        return galleryFragmentBase.A1Z((C02680Bk) obj, galleryFragmentBase.A0D, ((AnonymousClass2U7) this.A01).A02);
    }
}
