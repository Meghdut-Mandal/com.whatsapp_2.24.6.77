package X;

import android.content.Context;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.ArrayList;

/* renamed from: X.2Kd  reason: invalid class name and case insensitive filesystem */
public final class C43872Kd extends C43892Kf {
    public C18820ts A00;
    public C25071Ew A01;
    public C62423Gc A02;
    public boolean A03;

    public void A01(AnonymousClass01L r10, AnonymousClass11F r11, ArrayList arrayList, boolean z) {
        this.A02.setVisibility(C36351kA.A00(z ? 1 : 0));
        if (z) {
            C48902iF.A00(this.A00, this, r11, 1);
            C48932iI.A00(this.A01, r10, this, r11, 18);
            TextView textView = this.A03;
            C18820ts r5 = this.A00;
            long size = (long) arrayList.size();
            Object[] objArr = new Object[1];
            AnonymousClass000.A1L(objArr, arrayList.size(), 0);
            textView.setText(r5.A0L(objArr, R.plurals.f10nameremoved, size));
        }
    }

    public void setup(C25071Ew r1, C62423Gc r2) {
        this.A01 = r1;
        this.A02 = r2;
    }

    public C43872Kd(Context context) {
        super(context);
        A00();
    }

    public int getNegativeButtonTextResId() {
        return R.string.f12nameremoved;
    }

    public int getPositiveButtonIconResId() {
        return R.drawable.ic_settings_contacts;
    }

    public int getPositiveButtonTextResId() {
        return R.string.f12nameremoved;
    }
}
