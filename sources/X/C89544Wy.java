package X;

import android.graphics.Bitmap;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4Wy  reason: invalid class name and case insensitive filesystem */
public class C89544Wy implements AnonymousClass4TB {
    public Object A00;
    public Object A01;
    public final int A02;

    public C89544Wy(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public String BIB() {
        if (this.A02 != 0) {
            return AnonymousClass000.A0q("-gallery_thumb", C36381kD.A11(((AnonymousClass4V2) this.A00).B7k()));
        }
        return AnonymousClass000.A0q("-gallery_thumb", C36381kD.A11(((AnonymousClass4V2) this.A01).B7k()));
    }

    public Bitmap BOD() {
        Bitmap Bvb;
        if (this.A02 != 0) {
            C42271yY r2 = (C42271yY) this.A01;
            if (!AnonymousClass00C.A0J(r2.A03.getTag(), this)) {
                return null;
            }
            Bvb = ((AnonymousClass4V2) this.A00).Bvb(r2.A00);
        } else {
            List list = AnonymousClass0D3.A0I;
            AnonymousClass2UM r1 = ((C42711zG) this.A00).A03;
            if (r1.getTag() != this) {
                return null;
            }
            Bvb = ((AnonymousClass4V2) this.A01).Bvb(r1.getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
        }
        if (Bvb == null) {
            return C56382wC.A00;
        }
        return Bvb;
    }
}
