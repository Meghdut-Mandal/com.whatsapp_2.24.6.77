package X;

import android.graphics.Bitmap;
import java.util.List;

/* renamed from: X.3mM  reason: invalid class name and case insensitive filesystem */
public class C74903mM implements AnonymousClass4TB {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass4V2 A01;
    public final /* synthetic */ C47252eB A02;

    public String BIB() {
        return "MY_PHOTOS_VIEW_HOLDER_TAG";
    }

    public C74903mM(AnonymousClass4V2 r1, C47252eB r2, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }

    public Bitmap BOD() {
        C47252eB r1 = this.A02;
        List list = AnonymousClass0D3.A0I;
        if (r1.A05.getTag() != this) {
            return null;
        }
        Bitmap Bvb = this.A01.Bvb(this.A00);
        if (Bvb == null) {
            return C56382wC.A00;
        }
        return Bvb;
    }
}
