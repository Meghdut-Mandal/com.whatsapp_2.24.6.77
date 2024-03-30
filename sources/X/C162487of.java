package X;

import android.text.TextUtils;
import com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity;
import java.util.List;

/* renamed from: X.7of  reason: invalid class name and case insensitive filesystem */
public class C162487of extends AnonymousClass0UK {
    public Object A00;
    public final int A01;

    public C162487of(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public int A00(int i) {
        if (this.A01 != 0) {
            C96034mg r4 = (C96034mg) this.A00;
            C1270666u r3 = (C1270666u) r4.A03.get(i);
            int i2 = r3.A01;
            if (i2 == 3 || i2 == 1) {
                C175818b6 r2 = r3.A02;
                IndiaUpiBankPickerActivity indiaUpiBankPickerActivity = (IndiaUpiBankPickerActivity) r4.A01;
                if (!TextUtils.isEmpty((CharSequence) C36441kJ.A0Q(indiaUpiBankPickerActivity.A09, indiaUpiBankPickerActivity.A0A).first) || r2 == null || !r2.A0J) {
                    return 4;
                }
                return 1;
            }
            return 4;
        }
        Number number = (Number) C007103b.A0P((List) this.A00, i);
        if (number != null) {
            return number.intValue();
        }
        return 1;
    }
}
