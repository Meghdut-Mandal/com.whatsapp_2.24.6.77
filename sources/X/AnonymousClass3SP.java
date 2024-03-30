package X;

import android.content.res.Resources;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.3SP  reason: invalid class name */
public abstract class AnonymousClass3SP {
    public static final String A00(C19730wQ r5, AnonymousClass16D r6, AnonymousClass171 r7, C19630wG r8, AnonymousClass17X r9, AnonymousClass144 r10) {
        AnonymousClass00C.A0D(r8, 0);
        C19730wQ r0 = r5;
        AnonymousClass16D r1 = r6;
        C36321k7.A0x(r5, r6);
        C36331k8.A1H(r9, r10);
        return A01(r0, r1, r7, r8, r9, r10, 10);
    }

    public static final String A02(C19630wG r6, List list, int i) {
        String string;
        AnonymousClass00C.A0D(r6, 0);
        int size = list.size();
        if (size == i) {
            return A03(r6, list, 3);
        }
        Resources A0B = C36421kH.A0B(r6);
        if (size > 0) {
            int i2 = i - 1;
            Object[] A0M = AnonymousClass001.A0M();
            A0M[0] = list.get(0);
            AnonymousClass000.A1L(A0M, i2, 1);
            string = A0B.getQuantityString(R.plurals.f10nameremoved, i2, A0M);
        } else {
            string = A0B.getString(R.string.f12nameremoved);
        }
        AnonymousClass00C.A0B(string);
        return string;
    }

    public static final String A01(C19730wQ r6, AnonymousClass16D r7, AnonymousClass171 r8, C19630wG r9, AnonymousClass17X r10, AnonymousClass144 r11, int i) {
        HashSet A16 = C36441kJ.A16();
        C225614x it = C36381kD.A0R(r10, r11).iterator();
        boolean z = false;
        while (it.hasNext()) {
            UserJid userJid = ((AnonymousClass6PM) it.next()).A03;
            if (r6.A0M(userJid)) {
                z = true;
            } else {
                C36381kD.A1H(r7, userJid, A16);
            }
        }
        if (!z || !A16.isEmpty()) {
            return A03(r9, r8.A0b(A16, r8.A09(r11), false), i);
        }
        return C36361kB.A0m(r9.A00, R.string.f12nameremoved);
    }

    public static final String A03(C19630wG r8, List list, int i) {
        Resources A0B;
        int i2;
        Object[] objArr;
        Object obj;
        String quantityString;
        if (list.isEmpty()) {
            quantityString = C36421kH.A0B(r8).getString(R.string.f12nameremoved);
        } else if (list.size() == 1) {
            return C36401kF.A0s(list, 0);
        } else {
            if (list.size() == 2) {
                A0B = C36421kH.A0B(r8);
                i2 = R.string.f12nameremoved;
                objArr = new Object[2];
                objArr[0] = list.get(0);
                obj = list.get(1);
            } else if (list.size() == 3) {
                Resources A0B2 = C36421kH.A0B(r8);
                Object[] objArr2 = new Object[3];
                C36341k9.A1Q(list, objArr2);
                quantityString = C36411kG.A0w(A0B2, list.get(2), objArr2, 2, R.string.f12nameremoved);
            } else if (list.size() > i) {
                Resources A0B3 = C36421kH.A0B(r8);
                int A06 = C36421kH.A06(list, 1);
                Object[] objArr3 = new Object[2];
                objArr3[0] = list.get(0);
                AnonymousClass000.A1L(objArr3, C36421kH.A06(list, 1), 1);
                quantityString = A0B3.getQuantityString(R.plurals.f10nameremoved, A06, objArr3);
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                int A062 = C36421kH.A06(list, 2);
                for (int i3 = 0; i3 < A062; i3++) {
                    A0u.append(C36401kF.A0s(list, i3));
                    A0u.append(", ");
                }
                A0u.append(C36401kF.A0s(list, C36421kH.A06(list, 2)));
                A0B = C36421kH.A0B(r8);
                i2 = R.string.f12nameremoved;
                objArr = new Object[2];
                objArr[0] = A0u.toString();
                obj = list.get(C36421kH.A06(list, 1));
            }
            quantityString = C36411kG.A0w(A0B, obj, objArr, 1, i2);
        }
        AnonymousClass00C.A0B(quantityString);
        return quantityString;
    }
}
