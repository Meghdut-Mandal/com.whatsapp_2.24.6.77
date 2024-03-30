package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6Sv  reason: invalid class name and case insensitive filesystem */
public final class C132256Sv {
    public C130546Lm A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final long A06;
    public final ArrayList A07;
    public final boolean A08;

    public static final C94674ib A00(C130546Lm r11) {
        return new C94674ib(r11.A07, r11.A09, r11.A08, r11.A02, r11.A00, r11.A01, r11.A03, r11.A04, r11.A05, r11.A06);
    }

    public final void A01() {
        ArrayList arrayList = this.A07;
        ((C130546Lm) arrayList.get(C90504aG.A0C(arrayList))).A08.add(A00((C130546Lm) arrayList.remove(C90504aG.A0C(arrayList))));
    }

    public C132256Sv(float f, float f2, float f3, float f4, int i, long j, boolean z) {
        this.A02 = f;
        this.A01 = f2;
        this.A04 = f3;
        this.A03 = f4;
        this.A06 = j;
        this.A05 = i;
        this.A08 = z;
        ArrayList A0I = AnonymousClass001.A0I();
        this.A07 = A0I;
        C130546Lm r1 = new C130546Lm((String) null, (List) null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1023);
        this.A00 = r1;
        A0I.add(r1);
    }
}
