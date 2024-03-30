package X;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.3Tg  reason: invalid class name and case insensitive filesystem */
public abstract class C65733Tg {
    public static final List A00;

    static {
        Integer[] numArr = new Integer[5];
        AnonymousClass000.A1J(numArr, 56);
        AnonymousClass000.A1K(numArr, 68);
        C36331k8.A1V(numArr, 67);
        C36341k9.A1T(numArr, 93);
        C36341k9.A1U(numArr, 74);
        List asList = Arrays.asList(numArr);
        AnonymousClass00C.A08(asList);
        A00 = asList;
    }

    public static final HashMap A01(Cursor cursor, int i) {
        String[] strArr;
        AnonymousClass00C.A0D(cursor, 0);
        HashMap A0J = AnonymousClass001.A0J();
        C224014d.A02(cursor, A0J, C73973kr.A00);
        if (i != 56) {
            if (i != 74) {
                if (i == 79) {
                    strArr = C73933kn.A00;
                } else if (i == 86) {
                    strArr = C73963kq.A00;
                } else if (i == 93) {
                    strArr = C56302w4.A00;
                } else if (i == 67) {
                    strArr = C73943ko.A00;
                } else if (i == 68) {
                    strArr = C73913kl.A00;
                } else {
                    throw AnonymousClass001.A08("MessageAddOnUtils/getColIndexesForMessageAddOnStatements messageAddOnType not supported");
                }
            }
            return A0J;
        }
        strArr = C73953kp.A00;
        C224014d.A02(cursor, A0J, strArr);
        return A0J;
    }

    public static final boolean A02(int i) {
        return i == 1 || i == 2 || i == 3 || i == 4 || i == 8 || i == 9;
    }

    public static final boolean A03(AnonymousClass2bM r2) {
        int i;
        if (r2 instanceof C180868mY) {
            String str = ((C180868mY) r2).A01;
            if (str != null) {
                i = str.length();
            }
            return true;
        } else if (r2 instanceof C46752bc) {
            i = ((C46752bc) r2).A01;
        } else if (r2 instanceof C180858mX) {
            return ((C180858mX) r2).A06.isEmpty();
        } else {
            return false;
        }
        if (i == 0) {
            return true;
        }
        return false;
    }

    public static final AnonymousClass3T1 A00(AnonymousClass2bM r1, AnonymousClass1A1 r2) {
        C36321k7.A0w(r1, r2);
        C64933Qa A1Z = r1.A1Z();
        if (A1Z != null) {
            return r2.A03(A1Z);
        }
        return C36421kH.A0R(r2, r1.A01);
    }

    public static final String[] A04(Set set) {
        ArrayList A0J = C36321k7.A0J(set);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            A0J.add(String.valueOf(C36391kE.A0D(it)));
        }
        return C36431kI.A1b(A0J);
    }
}
