package X;

import android.widget.ImageView;
import com.whatsapp.R;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.A8i  reason: case insensitive filesystem */
public final class C21097A8i implements C160797lb {
    public List A00;
    public boolean A01;
    public int A02;
    public int A03;
    public final int A04;
    public final C206759tv A05;
    public final C22914AyQ A06;
    public final C22915AyR A07;
    public final C22916AyS A08;
    public final WeakReference A09;

    public boolean B7A() {
        return AnonymousClass000.A1O(this.A04);
    }

    public ImageView BCZ() {
        return (ImageView) this.A09.get();
    }

    public String BIk() {
        String str;
        if (this.A04 != 2 || (str = this.A05.A01) == null) {
            return this.A05.A00;
        }
        return str;
    }

    public String getId() {
        String str = this.A05.A04;
        int i = this.A04;
        StringBuilder A0v = AnonymousClass000.A0v(str);
        A0v.append('_');
        if (i == 1) {
            i = 3;
        }
        return C36381kD.A10(A0v, i);
    }

    public C21097A8i(ImageView imageView, C206759tv r3, C22914AyQ ayQ, C22915AyR ayR, C22916AyS ayS, int i, int i2, int i3) {
        this.A05 = r3;
        this.A04 = i;
        this.A08 = ayS;
        this.A06 = ayQ;
        this.A07 = ayR;
        this.A03 = i2;
        this.A02 = i3;
        this.A09 = AnonymousClass001.A0F(imageView);
    }

    public boolean A00() {
        ImageView BCZ = BCZ();
        if (BCZ == null) {
            return !this.A01;
        }
        String str = (String) BCZ.getTag(R.id.image_id);
        int A0I = AnonymousClass000.A0I(BCZ.getTag(R.id.image_quality));
        if (this.A01 || !str.equals(this.A05.A04)) {
            return false;
        }
        if (A0I == this.A04 || A0I == 1) {
            return true;
        }
        return false;
    }

    public int BDs() {
        return this.A02;
    }

    public int BDv() {
        return this.A03;
    }

    public Integer BEi() {
        return C36371kC.A0p();
    }
}
