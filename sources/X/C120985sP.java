package X;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* renamed from: X.5sP  reason: invalid class name and case insensitive filesystem */
public class C120985sP {
    public int A00;
    public long A01;
    public C141366n7 A02;

    public C120985sP(Context context, AnonymousClass7ez r19, C131456Pc r20, C159097io r21, C118675oY r22, C125085zI r23, String str, ExecutorService executorService) {
        String str2;
        AnonymousClass60J r0;
        int i;
        C141366n7 r8 = new C141366n7(context, r19, r20, r21, r22, r23, str, executorService);
        this.A02 = r8;
        r8.A0B = new AnonymousClass60L();
        C118715oc r2 = r8.A05.A08;
        if (r2.A01 == null) {
            Integer[] A002 = C023109s.A00(4);
            int length = A002.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                Integer num = A002[i2];
                if (num == C023109s.A00) {
                    i2++;
                } else {
                    switch (num.intValue()) {
                        case 1:
                            str2 = "LC";
                            break;
                        case 2:
                            str2 = "Main";
                            break;
                        case 3:
                            str2 = "SSR";
                            break;
                        default:
                            str2 = "HE";
                            break;
                    }
                    if ("lc".equalsIgnoreCase(str2)) {
                        i = 2;
                    } else if ("main".equalsIgnoreCase(str2)) {
                        i = 1;
                    } else if ("ssr".equalsIgnoreCase(str2)) {
                        i = 3;
                    } else if ("he".equalsIgnoreCase(str2)) {
                        i = 5;
                    } else {
                        r0 = null;
                        r2.A01 = r0;
                        r8.A0B.A00(r2);
                    }
                    r0 = new AnonymousClass60J(i);
                    r2.A01 = r0;
                    r8.A0B.A00(r2);
                }
            }
        } else {
            r8.A0B.A00(r2);
        }
        C131456Pc r24 = r8.A03;
        String str3 = null;
        try {
            str3 = r8.A0B.A00.A04.getName();
        } catch (IllegalStateException unused) {
        }
        r24.A0E = str3;
        this.A02.BuN((C132186So) null, 5);
        this.A00 = 4;
        this.A01 = 0;
    }
}
