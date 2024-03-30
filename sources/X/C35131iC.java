package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;

/* renamed from: X.1iC  reason: invalid class name and case insensitive filesystem */
public class C35131iC implements View.OnClickListener {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C35131iC(View view, C33941gB r2, int i, int i2) {
        this.A03 = i2;
        this.A01 = r2;
        this.A00 = i;
        this.A02 = view;
    }

    public final void onClick(View view) {
        switch (this.A03) {
            case 0:
                C33941gB r4 = (C33941gB) this.A01;
                C33941gB.A00(r4, 3, r4.A02, this.A00);
                ((View) this.A02).setVisibility(8);
                r4.A05.A03(0);
                return;
            case 1:
                C33941gB r3 = (C33941gB) this.A01;
                int i = this.A00;
                View view2 = (View) this.A02;
                int i2 = r3.A02;
                C33941gB.A00(r3, 2, i2, i);
                C33951gC r5 = C33941gB.A0C;
                Context context = r3.A03;
                C24801Dv r7 = r3.A04;
                int i3 = 4;
                if (i == 2) {
                    i3 = 2;
                } else if (i == 3) {
                    i3 = 3;
                } else if (i != 4) {
                    i3 = 1;
                }
                C24461Cn r32 = r3.A05;
                r5.A01(context, r7, Integer.valueOf(((SharedPreferences) r32.A01.getValue()).getInt("backup_last_threshold_crossed", 0)), i3, i2);
                view2.setVisibility(8);
                r32.A03(0);
                return;
            default:
                C225314u r6 = (C225314u) this.A02;
                AnonymousClass1K6.A00(r6, new AnonymousClass4WZ(r6, 4, 0, 3), ((AnonymousClass1K4) this.A01).A04, C51412nm.AGENT, 3);
                return;
        }
    }

    public C35131iC(C225314u r2, AnonymousClass1K4 r3) {
        this.A03 = 2;
        this.A01 = r3;
        this.A02 = r2;
        this.A00 = 4;
    }
}
