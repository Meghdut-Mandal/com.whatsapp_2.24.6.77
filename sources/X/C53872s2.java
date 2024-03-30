package X;

import com.whatsapp.R;
import java.io.File;

/* renamed from: X.2s2  reason: invalid class name and case insensitive filesystem */
public abstract class C53872s2 {
    public static int A00(C24801Dv r5, C19700wN r6, C225314u r7, AnonymousClass17Y r8, C20830yE r9, AnonymousClass1TA r10, C46972by r11, AnonymousClass1X7 r12, AnonymousClass13J r13, C19770wU r14) {
        int i;
        C225314u r4 = r7;
        C36331k8.A1I(r7, r9);
        if (C19550w8.A07() || r9.A0D()) {
            C46972by r72 = r11;
            C65013Qj A00 = AnonymousClass2bU.A00(r11);
            if (!r11.A1J.A02 && !A00.A0V) {
                return 1;
            }
            File file = A00.A0I;
            if ((file == null || !file.exists()) && A00.A09 == 1) {
                return 4;
            }
            File file2 = A00.A0I;
            if (file2 == null || !file2.exists()) {
                return 2;
            }
            C25561Gu.A02(r5, r6, r4, r8, r10, r72, r12, r13, r14);
            return 3;
        }
        if (!C19550w8.A07()) {
            i = R.string.f12nameremoved;
        } else {
            boolean A09 = C19550w8.A09();
            i = R.string.f12nameremoved;
            if (!A09) {
                i = R.string.f12nameremoved;
            }
        }
        r7.startActivity(AnonymousClass3US.A03(r7, R.string.f12nameremoved, i, false));
        return 0;
    }
}
