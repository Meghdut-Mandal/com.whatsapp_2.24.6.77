package X;

import android.content.Intent;
import com.whatsapp.contact.picker.ContactPickerFragment;

/* renamed from: X.4WZ  reason: invalid class name */
public class AnonymousClass4WZ implements AnonymousClass4PL {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass4WZ(Object obj, int i, int i2, Object obj2) {
        this.A03 = i2;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = i;
    }

    public final void BjC(boolean z) {
        if (this.A03 != 0) {
            Integer.valueOf(this.A00);
            ((ContactPickerFragment) this.A01).A1p((Intent) null, (AnonymousClass141) this.A02);
            return;
        }
        C224914p r5 = (C224914p) this.A01;
        Integer num = (Integer) this.A02;
        int i = this.A00;
        Intent A0D = C36431kI.A0D();
        A0D.setClassName(r5.getPackageName(), "com.whatsapp.bonsai.discovery.BonsaiDiscoveryActivity");
        if (num != null) {
            A0D.putExtra("bonsaiDiscoveryEntryPoint", num);
        }
        r5.startActivityForResult(A0D, i);
    }
}
