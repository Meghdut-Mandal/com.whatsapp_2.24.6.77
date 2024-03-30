package X;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: X.1v1  reason: invalid class name and case insensitive filesystem */
public class C40141v1 extends C03760Hp {
    public final AnonymousClass1A1 A00;
    public final long[] A01;

    public /* bridge */ /* synthetic */ Object A06() {
        ArrayList A0I = AnonymousClass001.A0I();
        for (long j : this.A01) {
            synchronized (this) {
                if (AnonymousClass000.A1V(this.A01)) {
                    throw new AnonymousClass02S();
                }
            }
            AnonymousClass3T1 A0R = C36421kH.A0R(this.A00, j);
            if (A0R instanceof AnonymousClass2bU) {
                A0I.add(A0R);
            }
        }
        return A0I;
    }

    public void A03() {
        boolean z = this.A03;
        this.A03 = false;
        this.A04 |= z;
        A09();
    }

    public /* bridge */ /* synthetic */ void A04(Object obj) {
        if (!this.A05 && this.A06) {
            super.A04(obj);
        }
    }

    public C40141v1(Context context, AnonymousClass1A1 r2, long[] jArr) {
        super(context);
        this.A01 = jArr;
        this.A00 = r2;
    }

    public void A01() {
        A00();
    }

    public void A02() {
        A00();
    }
}
