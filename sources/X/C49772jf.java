package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2jf  reason: invalid class name and case insensitive filesystem */
public class C49772jf extends C132446Tt {
    public int A00;
    public int A01;
    public final int A02;
    public final AnonymousClass17Y A03;
    public final AnonymousClass4O5 A04;
    public final C589331p A05;
    public final C87774Qc A06;
    public final List A07;
    public final boolean A08;

    public C49772jf(AnonymousClass012 r2, AnonymousClass17Y r3, AnonymousClass4O5 r4, C589331p r5, C87774Qc r6, List list, int i, boolean z) {
        super(r2, true);
        this.A05 = r5;
        this.A03 = r3;
        this.A08 = z;
        this.A07 = list;
        this.A06 = r6;
        this.A04 = r4;
        this.A02 = i;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass4V2 BDy;
        C88924Uo B4h = this.A06.B4h(!this.A08);
        this.A01 = B4h.getCount();
        long uptimeMillis = SystemClock.uptimeMillis();
        ArrayList A0I = AnonymousClass001.A0I();
        C1512778x r6 = null;
        int i = 0;
        while (i < this.A01 && !C36431kI.A1Y(this) && (BDy = B4h.BDy(i)) != null) {
            if (i == this.A02 - 1 && r6 != null) {
                ArrayList A15 = C36441kJ.A15(A0I);
                C1512778x A002 = r6.A00();
                A002.bucketCount = this.A01;
                A15.add(A002);
                uptimeMillis = SystemClock.uptimeMillis();
                this.A03.A0H(new AnonymousClass752(this, A15, 22, true));
            }
            C1512778x A003 = ((C145646uI) this.A04).A00(BDy.BAn());
            if (r6 != null) {
                if (!r6.equals(A003)) {
                    A0I.add(r6);
                }
                r6.bucketCount++;
                if (!A0I.isEmpty() && 1000 + uptimeMillis < SystemClock.uptimeMillis()) {
                    uptimeMillis = SystemClock.uptimeMillis();
                    ArrayList A152 = C36441kJ.A15(A0I);
                    A0I.clear();
                    this.A03.A0H(new AnonymousClass752(this, A152, 22, false));
                }
                i++;
            }
            A003.bucketCount = 0;
            r6 = A003;
            r6.bucketCount++;
            uptimeMillis = SystemClock.uptimeMillis();
            ArrayList A1522 = C36441kJ.A15(A0I);
            A0I.clear();
            this.A03.A0H(new AnonymousClass752(this, A1522, 22, false));
            i++;
        }
        if (r6 != null && !C36431kI.A1Y(this)) {
            A0I.add(r6);
        }
        if (!A0I.isEmpty()) {
            this.A03.A0H(new AnonymousClass752(this, A0I, 22, false));
        }
        this.A01 = B4h.getCount();
        B4h.close();
        return null;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        this.A05.A00.A1h(false);
    }
}
