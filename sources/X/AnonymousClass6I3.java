package X;

import android.database.Cursor;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* renamed from: X.6I3  reason: invalid class name */
public abstract class AnonymousClass6I3 {
    public static final String A00;

    static {
        String A01 = AnonymousClass6VD.A01("DiagnosticsWrkr");
        AnonymousClass00C.A08(A01);
        A00 = A01;
    }

    /* JADX INFO: finally extract failed */
    public static final String A00(C158967iX r11, C157157bv r12, C158977iY r13, List list) {
        String str;
        Integer num;
        String str2;
        StringBuilder A0u = AnonymousClass000.A0u();
        if (Build.VERSION.SDK_INT >= 23) {
            str = "Job Id";
        } else {
            str = "Alarm Id";
        }
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("\n Id \t Class Name\t ");
        A0u2.append(str);
        A0u2.append("\t State\t Unique Name\t Tags\t");
        C36351kA.A1K(A0u2, A0u);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass6QA r7 = (AnonymousClass6QA) it.next();
            C128086Au BI6 = r11.BI6(C109445Xp.A00(r7));
            if (BI6 != null) {
                num = Integer.valueOf(BI6.A01);
            } else {
                num = null;
            }
            String str3 = r7.A0J;
            TreeMap treeMap = C138686iW.A08;
            C138686iW A002 = C109355Xg.A00("SELECT name FROM workname WHERE work_spec_id=?", 1);
            A002.B1q(1, str3);
            AnonymousClass6Q8 r0 = ((C138916iu) r12).A01;
            r0.A05();
            Cursor A003 = C109365Xh.A00(r0, A002, false);
            try {
                ArrayList A0n = C90474aD.A0n(A003);
                while (A003.moveToNext()) {
                    if (A003.isNull(0)) {
                        str2 = null;
                    } else {
                        str2 = A003.getString(0);
                    }
                    A0n.add(str2);
                }
                A003.close();
                A002.A00();
                String A0Q = C007103b.A0Q(",", "", "", A0n, (C006302t) null);
                String A0Q2 = C007103b.A0Q(",", "", "", r13.BIC(str3), (C006302t) null);
                StringBuilder A0u3 = AnonymousClass000.A0u();
                A0u3.append(10);
                A0u3.append(str3);
                A0u3.append("\t ");
                A0u3.append(r7.A0G);
                A0u3.append("\t ");
                A0u3.append(num);
                A0u3.append("\t ");
                AnonymousClass000.A1D(AnonymousClass6GL.A00(r7.A0E), "\t ", A0Q, A0u3);
                A0u3.append("\t ");
                A0u3.append(A0Q2);
                A0u3.append(9);
                C36351kA.A1K(A0u3, A0u);
            } catch (Throwable th) {
                A003.close();
                A002.A00();
                throw th;
            }
        }
        return C36381kD.A0y(A0u);
    }
}
