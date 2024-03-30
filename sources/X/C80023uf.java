package X;

import android.view.View;
import java.util.List;

/* renamed from: X.3uf  reason: invalid class name and case insensitive filesystem */
public class C80023uf implements C88664To {
    public final /* synthetic */ C42491yu A00;
    public final /* synthetic */ C35011i0 A01;
    public final /* synthetic */ C28781Ua A02;

    public C80023uf(C42491yu r1, C35011i0 r2, C28781Ua r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void BgY(C63023Il r6) {
        C35011i0 r4;
        View view;
        boolean z;
        int i;
        C20810yC r2 = this.A02.A01;
        C21000yV r1 = C21000yV.A01;
        if (C20800yB.A01(r1, r2, 6759)) {
            r4 = this.A01;
            C42491yu r12 = this.A00;
            List list = AnonymousClass0D3.A0I;
            view = r12.A03;
            z = r6.A00;
            i = 5;
        } else {
            boolean A012 = C20800yB.A01(r1, r2, 6456);
            r4 = this.A01;
            C42491yu r13 = this.A00;
            List list2 = AnonymousClass0D3.A0I;
            if (A012) {
                view = r13.A04;
                z = r6.A00;
                i = 4;
            } else {
                view = r13.A02;
                z = r6.A00;
                i = 0;
            }
        }
        r4.A03(view, i, z, true);
    }

    public void Bjz(C63023Il r6) {
        C20810yC r2 = this.A02.A01;
        C21000yV r1 = C21000yV.A01;
        if (!C20800yB.A01(r1, r2, 6456) && !C20800yB.A01(r1, r2, 6759)) {
            C35011i0 r4 = this.A01;
            C42491yu r12 = this.A00;
            List list = AnonymousClass0D3.A0I;
            r4.A04(r12.A05, 0, r6.A00, r6.A01);
        }
    }
}
