package X;

import android.text.Editable;
import com.whatsapp.components.PhoneNumberEntry;
import com.whatsapp.registration.phonenumberentry.RegisterPhone;

/* renamed from: X.4WI  reason: invalid class name */
public class AnonymousClass4WI extends C66833Xm {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4WI(int i, String str, Object obj) {
        super(str);
        this.A01 = i;
        this.A00 = obj;
    }

    public synchronized void afterTextChanged(Editable editable) {
        if (this.A01 != 0) {
            super.afterTextChanged(editable);
            return;
        }
        synchronized (this) {
            super.afterTextChanged(editable);
            AnonymousClass3FT r1 = ((PhoneNumberEntry) this.A00).A03;
            if (r1 != null && (r1 instanceof AnonymousClass4W2)) {
                AnonymousClass4W2 r12 = (AnonymousClass4W2) r1;
                if (3 - r12.A01 == 0) {
                    ((RegisterPhone) r12.A00).A3o();
                }
            }
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (1 - this.A01 != 0) {
            super.onTextChanged(charSequence, i, i2, i3);
            return;
        }
        super.onTextChanged(charSequence, i, i2, i3);
        AnonymousClass2Fm r3 = (AnonymousClass2Fm) this.A00;
        r3.A02.setVisibility(8);
        r3.A03.setError((CharSequence) null);
        C70283eu r4 = r3.A05;
        r4.A00();
        r3.A06.A00();
        if (!r3.A09(charSequence) && AnonymousClass3U2.A00(r3.A07, r3.A01(), C65043Qm.A00(r3)) == 1) {
            String A02 = r3.A02();
            r4.A02 = A02;
            r4.A07.A00();
            C49472jB r1 = new C49472jB(r4.A04, r4.A06, r4, A02);
            r4.A00 = r1;
            C36331k8.A1F(r1, r4.A0A);
        }
    }
}
