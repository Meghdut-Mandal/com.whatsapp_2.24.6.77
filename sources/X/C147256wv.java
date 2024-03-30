package X;

import android.widget.ImageView;
import java.io.File;
import java.util.Set;

/* renamed from: X.6wv  reason: invalid class name and case insensitive filesystem */
public class C147256wv implements C162057nx {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ImageView A02;
    public final /* synthetic */ C135106c9 A03;
    public final /* synthetic */ C29931Yo A04;

    public void BRH(C135106c9 r1, File file) {
    }

    public void BWY() {
    }

    public void Bj9() {
        throw null;
    }

    public C147256wv(ImageView imageView, C135106c9 r2, C29931Yo r3, int i, int i2) {
        this.A04 = r3;
        this.A03 = r2;
        this.A02 = imageView;
        this.A01 = i;
        this.A00 = i2;
    }

    public /* bridge */ /* synthetic */ void BbA(Object obj) {
        C135106c9 r4 = this.A03;
        if (((Set) obj).contains(r4.A0F)) {
            this.A04.A09.A00(this.A02, r4, this.A01, this.A00);
        }
    }
}
