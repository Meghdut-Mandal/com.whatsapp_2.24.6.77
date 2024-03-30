package X;

import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: X.3dA  reason: invalid class name and case insensitive filesystem */
public final class C69213dA implements C160797lb {
    public final AnonymousClass30U A00;
    public final AnonymousClass3XP A01;
    public final int A02;
    public final int A03;
    public final WeakReference A04 = AnonymousClass001.A0F((Object) null);

    public C69213dA(AnonymousClass30U r2, AnonymousClass3XP r3, int i, int i2) {
        this.A01 = r3;
        this.A00 = r2;
        this.A03 = i;
        this.A02 = i2;
    }

    public ImageView BCZ() {
        return (ImageView) this.A04.get();
    }

    public String BIk() {
        String str = this.A01.A03;
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getId() {
        return this.A01.A00;
    }

    public boolean B7A() {
        return AnonymousClass000.A1Q(BIk().length());
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
