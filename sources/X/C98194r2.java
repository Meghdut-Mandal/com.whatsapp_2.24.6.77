package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.4r2  reason: invalid class name and case insensitive filesystem */
public class C98194r2 extends C132456Tu implements C161287mV {
    public static final C160347kr A0A = new C140476le();
    public static final C160347kr A0B = new C140486lf();
    public static final C160347kr A0C = new C140496lg();
    public static final C160347kr A0D = new C140506lh();
    public int A00;
    public int A01;
    public Drawable A02;
    public Drawable A03;
    public View.OnClickListener A04;
    public C140456lc A05;
    public C118885ot A06;
    public boolean A07 = true;
    public final long A08;
    public final C1271967i A09;

    public C98194r2(C1271967i r5, long j, boolean z) {
        super(C023109s.A01);
        this.A08 = j;
        C1257261a[] r3 = {new C1257261a(A0A, this), new C1257261a(A0B, this), new C1257261a(A0D, this), new C1257261a(A0C, this)};
        int i = 0;
        do {
            A0E(r3[i]);
            i++;
        } while (i < 4);
        this.A01 = 0;
        this.A06 = new C118885ot();
        this.A09 = r5;
        C1257261a[] r32 = {new C1257261a(new C140786mA(), this), new C1257261a(new C140656lw(), this)};
        int i2 = 0;
        do {
            A0E(r32[i2]);
            i2++;
        } while (i2 < 2);
        if (!z) {
            C1257261a.A00(new C140706m2(this), this);
        }
    }

    public /* bridge */ /* synthetic */ Object B4O(Context context) {
        return new C98114qt(context);
    }

    public /* synthetic */ Class BG1() {
        return getClass();
    }
}
