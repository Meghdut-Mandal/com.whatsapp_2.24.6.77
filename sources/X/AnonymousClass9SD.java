package X;

import android.os.Message;
import android.text.TextUtils;
import java.util.Calendar;

/* renamed from: X.9SD  reason: invalid class name */
public class AnonymousClass9SD {
    public int A00;
    public long A01 = System.currentTimeMillis();
    public C195999Xe A02;
    public C195999Xe A03;
    public C195999Xe A04;
    public AnonymousClass9TM A05;

    public AnonymousClass9SD(Message message, C195999Xe r4, C195999Xe r5, C195999Xe r6, AnonymousClass9TM r7) {
        int i;
        this.A05 = r7;
        if (message != null) {
            i = message.what;
        } else {
            i = 0;
        }
        this.A00 = i;
        this.A04 = r4;
        this.A03 = r5;
        this.A02 = r6;
    }

    public String toString() {
        String A002;
        String A003;
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("time=");
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(this.A01);
        Object[] A1Z = C36431kI.A1Z(instance, 6);
        A1Z[1] = instance;
        A1Z[2] = instance;
        A1Z[3] = instance;
        A1Z[4] = instance;
        A1Z[5] = instance;
        A0u.append(String.format("%tm-%td %tH:%tM:%tS.%tL", A1Z));
        A0u.append(" processed=");
        C195999Xe r0 = this.A04;
        String str2 = "<null>";
        if (r0 == null) {
            A002 = str2;
        } else {
            A002 = r0.A00();
        }
        A0u.append(A002);
        A0u.append(" org=");
        C195999Xe r02 = this.A03;
        if (r02 == null) {
            A003 = str2;
        } else {
            A003 = r02.A00();
        }
        A0u.append(A003);
        A0u.append(" dest=");
        C195999Xe r03 = this.A02;
        if (r03 != null) {
            str2 = r03.A00();
        }
        A0u.append(str2);
        A0u.append(" what=");
        if (this.A05 != null) {
            str = null;
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            int i = this.A00;
            A0u.append(i);
            A0u.append("(0x");
            C90504aG.A0z(i, A0u);
            str = ")";
        }
        A0u.append(str);
        if (!TextUtils.isEmpty("")) {
            C36421kH.A1N(A0u);
            A0u.append("");
        }
        return A0u.toString();
    }
}
