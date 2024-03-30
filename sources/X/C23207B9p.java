package X;

import android.text.TextUtils;
import com.whatsapp.payments.ui.PaymentMethodsListPickerFragment;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.B9p  reason: case insensitive filesystem */
public class C23207B9p implements C25711Hj {
    public Object A00;
    public final int A01;

    public C23207B9p(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void accept(Object obj) {
        switch (this.A01) {
            case 1:
                C79593ty r3 = (C79593ty) this.A00;
                List list = (List) obj;
                boolean A1a = C36331k8.A1a(r3, list);
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
                r3.A0C(Boolean.valueOf(A1a));
                return;
            case 3:
                ((C174928Yz) this.A00).A2E((C607139b) obj);
                return;
            case 4:
                C201009id r32 = (C201009id) this.A00;
                C207249un r11 = (C207249un) obj;
                AnonymousClass8b7 r2 = (AnonymousClass8b7) r11.A08;
                if (r2 != null && "VISA".equals(r2.A02) && TextUtils.isEmpty(r2.A05)) {
                    new AnonymousClass9SK(r32.A00, r32.A01, r32.A0B, r32.A0C, new C21249AEf(r11, r32, r2)).A00(r32.A0R);
                    return;
                }
                return;
            case 5:
                C36411kG.A1N(this.A00);
                return;
            case 6:
                C178888i4 r22 = (C178888i4) this.A00;
                if (AnonymousClass000.A1X(obj)) {
                    AVX.A00(r22.A0D, r22, 16);
                    return;
                }
                return;
            case 7:
                C178848hw r1 = (C178848hw) this.A00;
                r1.A0O.A0I = (Boolean) obj;
                r1.A4Y((C202059ky) null);
                return;
            case 8:
                ((C178888i4) this.A00).A3j((C207249un) obj, true);
                return;
            case 9:
                C166337vZ r0 = ((PaymentMethodsListPickerFragment) ((B7G) this.A00).A00).A06;
                r0.A00 = (List) obj;
                r0.notifyDataSetChanged();
                return;
            default:
                ((C79593ty) this.A00).A0C(obj);
                return;
        }
    }
}
