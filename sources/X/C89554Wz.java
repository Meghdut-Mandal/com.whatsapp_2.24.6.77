package X;

import android.graphics.Bitmap;
import android.view.View;
import com.whatsapp.gallerypicker.GalleryPickerFragment;

/* renamed from: X.4Wz  reason: invalid class name and case insensitive filesystem */
public class C89554Wz implements AnonymousClass4TB {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C89554Wz(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A02 = obj2;
        this.A00 = obj3;
        this.A01 = obj;
        this.A03 = obj4;
    }

    public String BIB() {
        if (this.A04 == 0) {
            return AnonymousClass000.A0q("-gallery_thumb", C36381kD.A11(((AnonymousClass4V2) this.A01).B7k()));
        }
        C62613Gv r3 = (C62613Gv) this.A00;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(r3.A02);
        A0u.append('-');
        A0u.append(r3.A04);
        A0u.append('-');
        A0u.append(r3.A01);
        A0u.append('-');
        return C36421kH.A0d(A0u, r3.A06);
    }

    public Bitmap BOD() {
        AnonymousClass4V2 r1;
        int i;
        int i2 = this.A04;
        Object obj = this.A02;
        if (i2 != 0) {
            if (((C42701zF) obj).A02.getTag() != this) {
                return null;
            }
            r1 = (AnonymousClass4V2) this.A01;
            if (r1 != null) {
                i = ((GalleryPickerFragment) this.A03).A02;
            }
            return C56382wC.A00;
        } else if (((View) obj).getTag() != this) {
            return null;
        } else {
            AnonymousClass0D3 r2 = (AnonymousClass0D3) this.A00;
            int i3 = r2.A05;
            if (i3 == -1) {
                i3 = r2.A04;
            }
            if (i3 == -1) {
                return null;
            }
            r1 = (AnonymousClass4V2) this.A01;
            i = ((C41101wc) this.A03).A01.A04;
        }
        Bitmap Bvb = r1.Bvb(i);
        if (Bvb != null) {
            return Bvb;
        }
        return C56382wC.A00;
    }
}
