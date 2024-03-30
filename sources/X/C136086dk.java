package X;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

/* renamed from: X.6dk  reason: invalid class name and case insensitive filesystem */
public class C136086dk implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C100144uX A01;
    public final /* synthetic */ C1271967i A02;
    public final /* synthetic */ C140456lc A03;
    public final /* synthetic */ C160377ku A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public C136086dk(View view, C100144uX r2, C1271967i r3, C140456lc r4, C160377ku r5, boolean z, boolean z2) {
        this.A01 = r2;
        this.A06 = z;
        this.A00 = view;
        this.A05 = z2;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (this.A06) {
            Switch switchR = ((C92784ei) ((C160577lE) this.A00)).A00;
            switchR.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            switchR.setChecked(this.A05);
            switchR.setOnCheckedChangeListener(this);
        }
        C160377ku r4 = this.A04;
        if (r4 != null) {
            C140456lc r3 = this.A03;
            C1273868b A032 = C1273868b.A03(r3);
            A032.A0A(Boolean.valueOf(z), 1);
            C1271967i r0 = this.A02;
            A032.A0A(r0, 2);
            C1273868b.A06(r0, r3, A032, r4);
        }
    }
}
