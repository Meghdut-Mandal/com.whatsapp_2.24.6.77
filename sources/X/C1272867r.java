package X;

import android.view.View;

/* renamed from: X.67r  reason: invalid class name and case insensitive filesystem */
public class C1272867r {
    public final View A00;
    public final AnonymousClass3T1 A01;
    public final C123495wb A02;
    public final C160527l9 A03;
    public final Object A04;
    public final boolean A05;
    public final /* synthetic */ AnonymousClass1SX A06;

    public C1272867r(View view, AnonymousClass3T1 r2, C123495wb r3, C160527l9 r4, AnonymousClass1SX r5, Object obj, boolean z) {
        this.A06 = r5;
        this.A01 = r2;
        this.A00 = view;
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = obj;
        this.A05 = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A01.A1J.equals(((C1272867r) obj).A01.A1J);
    }

    public int hashCode() {
        return this.A01.A1J.hashCode();
    }
}
