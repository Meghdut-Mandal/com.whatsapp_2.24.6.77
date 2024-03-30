package X;

import android.content.Context;
import android.content.res.Resources;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.3Of  reason: invalid class name and case insensitive filesystem */
public final class C64493Of {
    public final Context A00;
    public final AnonymousClass16D A01;

    public C64493Of(Context context, AnonymousClass16D r3) {
        AnonymousClass00C.A0D(r3, 2);
        this.A00 = context;
        this.A01 = r3;
    }

    public static final String A00(C64493Of r9, List list) {
        Resources resources;
        int i;
        Object[] objArr;
        String str;
        String str2;
        int size = list.size();
        String str3 = null;
        if (size != 1) {
            resources = r9.A00.getResources();
            if (size != 2) {
                i = R.string.f12nameremoved;
                objArr = C36441kJ.A1Q();
                AnonymousClass16D r1 = r9.A01;
                AnonymousClass141 A0Z = C36381kD.A0Z(r1, list, 0);
                if (A0Z != null) {
                    str2 = A0Z.A0J();
                } else {
                    str2 = null;
                }
                objArr[0] = str2;
                AnonymousClass141 A0Z2 = C36381kD.A0Z(r1, list, 1);
                if (A0Z2 != null) {
                    str3 = A0Z2.A0J();
                }
                objArr[1] = str3;
                AnonymousClass000.A1L(objArr, C36421kH.A06(list, 2), 2);
            } else {
                i = R.string.f12nameremoved;
                objArr = new Object[2];
                AnonymousClass16D r12 = r9.A01;
                AnonymousClass141 A0Z3 = C36381kD.A0Z(r12, list, 0);
                if (A0Z3 != null) {
                    str = A0Z3.A0J();
                } else {
                    str = null;
                }
                objArr[0] = str;
                AnonymousClass141 A0Z4 = C36381kD.A0Z(r12, list, 1);
                if (A0Z4 != null) {
                    str3 = A0Z4.A0J();
                }
                objArr[1] = str3;
            }
        } else {
            resources = r9.A00.getResources();
            i = R.string.f12nameremoved;
            objArr = new Object[1];
            AnonymousClass141 A0Z5 = C36381kD.A0Z(r9.A01, list, 0);
            if (A0Z5 != null) {
                str3 = A0Z5.A0J();
            }
            objArr[0] = str3;
        }
        String string = resources.getString(i, objArr);
        AnonymousClass00C.A08(string);
        return string;
    }

    public final String A01(Context context, List list) {
        if (list.isEmpty()) {
            String string = context.getResources().getString(R.string.f12nameremoved);
            AnonymousClass00C.A0B(string);
            return string;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(context.getResources().getString(R.string.f12nameremoved));
        return AnonymousClass000.A0q(A00(this, list), A0u);
    }
}
