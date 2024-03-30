package X;

import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.6kL  reason: invalid class name and case insensitive filesystem */
public final class C139686kL implements C162197oC {
    public final AnonymousClass5TP A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Bitmap.Config A04 = Bitmap.Config.ARGB_8888;
    public final C159027if A05;
    public final C1263563p A06;
    public final AnonymousClass6NZ A07;

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C162197oC r3 = (C162197oC) obj;
        AnonymousClass00C.A0D(r3, 1);
        return r3.BGF().compareTo(this.A00);
    }

    public C139686kL(C159027if r2, AnonymousClass5TP r3, C1263563p r4, AnonymousClass6NZ r5, int i, int i2, int i3) {
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A00 = r3;
        this.A05 = r2;
        this.A07 = r5;
        this.A06 = r4;
    }

    public AnonymousClass5TP BGF() {
        return this.A00;
    }

    public void run() {
        LinkedHashMap A1G = C36431kI.A1G();
        AnonymousClass6NZ r5 = this.A07;
        AU0 A012 = r5.A01(this.A04, this.A03, this.A01);
        Iterator it = C15040mb.A05(0, this.A02).iterator();
        while (it.hasNext()) {
            int A002 = ((C12260hl) it).A00();
            if (A012.A02()) {
                Bitmap bitmap = (Bitmap) A012.A01();
                boolean A003 = this.A06.A00(bitmap, A002);
                if (bitmap != null && A003) {
                    AU0 A022 = r5.A02(bitmap);
                    AnonymousClass00C.A08(A022);
                    C36331k8.A1Q(A022, A1G, A002);
                }
            }
            A012.close();
            Iterator A0z = AnonymousClass000.A0z(A1G);
            while (A0z.hasNext()) {
                AU0 au0 = (AU0) A0z.next();
                if (au0 != null) {
                    au0.close();
                }
            }
            this.A05.BXF();
        }
        A012.close();
        this.A05.BiH(A1G);
    }
}
