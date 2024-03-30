package X;

import android.view.View;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/* renamed from: X.07v  reason: invalid class name and case insensitive filesystem */
public class C018407v implements C018307u {
    public final /* synthetic */ BottomNavigationView A00;

    public C018407v(BottomNavigationView bottomNavigationView) {
        this.A00 = bottomNavigationView;
    }

    public AnonymousClass09H BRF(View view, AnonymousClass09H r8, AnonymousClass07w r9) {
        r9.A00 += r8.A02();
        boolean z = true;
        if (AnonymousClass04F.A01(view) != 1) {
            z = false;
        }
        int A03 = r8.A03();
        int A04 = r8.A04();
        int i = r9.A02;
        int i2 = A03;
        if (z) {
            i2 = A04;
        }
        int i3 = i + i2;
        r9.A02 = i3;
        int i4 = r9.A01;
        if (!z) {
            A03 = A04;
        }
        int i5 = i4 + A03;
        r9.A01 = i5;
        AnonymousClass04F.A06(view, i3, r9.A03, i5, r9.A00);
        return r8;
    }
}
