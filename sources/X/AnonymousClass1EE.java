package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1EE  reason: invalid class name */
public class AnonymousClass1EE {
    public final C20810yC A00;
    public final AnonymousClass1EF A01;
    public final C21700zf A02;

    public static String A00(int i) {
        switch (i) {
            case 1:
                return "client_rendered";
            case 2:
                return "client_saved";
            case 3:
                return "client_written_wire";
            case 4:
                return "client_queued";
            case 5:
                return "client_waiting_to_encrypt";
            case 6:
                return "client_ready_to_send";
            case 7:
                return "client_encrypt";
            case 8:
                return "client_prekeys_fetch";
            default:
                return "unknown";
        }
    }

    public AnonymousClass1EE(C19970wo r16, C19630wG r17, C20810yC r18, C21010yW r19, AnonymousClass1EF r20, C21670zc r21, C21690ze r22, C21430zE r23, C19770wU r24) {
        C21700zf r5 = new C21700zf(r16, r17, r19, r21, r22, r23, r24, "MessageSendPerfQplTracker", 154474694);
        C21710zg r3 = r5.A04;
        C20810yC r4 = r18;
        char c = !C20800yB.A01(C21000yV.A02, r4, 1191) ? (char) 1 : 3;
        boolean z = r3.A04;
        if (c != 1) {
            z = false;
            if (c != 2) {
                z = true;
            }
        }
        r3.A04 = z;
        this.A00 = r4;
        this.A02 = r5;
        this.A01 = r20;
    }

    public String A01(String str, int i, int i2, int i3) {
        Integer num;
        if (i3 == 0) {
            AnonymousClass1EF r2 = this.A01;
            synchronized (r2) {
                Map map = (Map) r2.A00.get(Integer.valueOf(i));
                if (map == null || (num = (Integer) map.get(Integer.valueOf(i2))) == null) {
                    i3 = 0;
                } else {
                    i3 = num.intValue();
                }
            }
        }
        if (i3 <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(i3);
        return sb.toString();
    }

    public void A03(int i, int i2) {
        if (i2 != 8 && i2 != 7) {
            AnonymousClass1EF r2 = this.A01;
            if (r2.A03(i, i2)) {
                this.A02.A01(i, A01(A00(i2), i, i2, 0));
                r2.A00(i, i2);
            }
            int i3 = 2;
            switch (i2) {
                case 1:
                    break;
                case 2:
                    i3 = 5;
                    break;
                case 3:
                    A05(i, 2);
                    return;
                case 4:
                    i3 = 1;
                    break;
                case 5:
                    i3 = 6;
                    break;
                case 6:
                    i3 = 3;
                    break;
                default:
                    return;
            }
            A02(i, i3);
        }
    }

    public void A04(int i, int i2, int i3, int i4) {
        AnonymousClass1EF r4 = this.A01;
        int i5 = i;
        if (r4.A02(i)) {
            A02(i, i2);
        } else if (i4 != 7 && i4 != 10 && i4 != 11 && i4 != 12) {
            C21700zf r3 = this.A02;
            r3.A09("message_send", i, false);
            synchronized (r4) {
                r4.A00.put(Integer.valueOf(i), new HashMap());
            }
            if (i3 >= 0) {
                int i6 = i3 + 1;
                r3.A02(i, A01(A00(i2), i, i2, i6));
                r4.A01(i, i2, i6);
            } else {
                A02(i, i2);
            }
            r3.A05.markerAnnotate(r3.A04.A06, i5, "wa_type", (long) i4);
        }
    }

    public void A05(int i, short s) {
        this.A02.A04(i, s);
        AnonymousClass1EF r2 = this.A01;
        synchronized (r2) {
            r2.A00.remove(Integer.valueOf(i));
        }
    }

    public void A02(int i, int i2) {
        this.A02.A02(i, A01(A00(i2), i, i2, 0));
        AnonymousClass1EF r1 = this.A01;
        synchronized (r1) {
            r1.A01(i, i2, 0);
        }
    }
}
