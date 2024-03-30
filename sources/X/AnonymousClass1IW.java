package X;

import com.whatsapp.util.Log;

/* renamed from: X.1IW  reason: invalid class name */
public class AnonymousClass1IW {
    public final AnonymousClass1AB A00;
    public final C237119n A01;

    public AnonymousClass1IW(AnonymousClass1AB r1, C237119n r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static int A00(String str) {
        switch (str.hashCode()) {
            case -849492943:
                if (str.equals("regular_low")) {
                    return 5;
                }
                break;
            case -564602779:
                if (str.equals("regular_high")) {
                    return 4;
                }
                break;
            case -498584183:
                if (str.equals("critical_unblock_low")) {
                    return 2;
                }
                break;
            case 207170541:
                if (str.equals("critical_block")) {
                    return 1;
                }
                break;
            case 1086463900:
                if (str.equals("regular")) {
                    return 3;
                }
                break;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SyncdAntiTamperingLoggingHelper/getShiftBit unknown collection name: ");
        sb.append(str);
        Log.w(sb.toString());
        return 0;
    }
}
