package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6Jh  reason: invalid class name and case insensitive filesystem */
public class C129996Jh {
    public C160377ku A00;
    public List A01;

    public static Pair A00(C160607lH r5) {
        String str;
        Integer BlO = r5.BlO();
        if (BlO != C023109s.A0S) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Expected string while parsing string-encoded component payload, got ");
            if (BlO != null) {
                str = C1898495v.A00(BlO);
            } else {
                str = "null";
            }
            AnonymousClass6RS.A01(AnonymousClass000.A0q(str, A0u), "BloksComponentQueryPayload");
            return null;
        }
        String BvC = r5.BlP().BvC();
        C142116oM r4 = new C142116oM(C90484aE.A0Q(BvC));
        r4.BQE();
        C129996Jh r2 = null;
        C129996Jh r3 = new C129996Jh();
        if (r4.A01 != C023109s.A0C) {
            r4.BuF();
        } else {
            while (r4.BQE() != C023109s.A0G) {
                String str2 = r4.A02;
                boolean A1T = C36371kC.A1T(AnonymousClass5ZE.A00(str2), 32);
                r4.BQE();
                if (!A1T) {
                    if ("components".equals(str2)) {
                        ArrayList arrayList = null;
                        if (r4.A01 == C023109s.A00) {
                            arrayList = AnonymousClass001.A0I();
                            while (r4.BQE() != C023109s.A01) {
                                C118855oq A002 = AnonymousClass5ZG.A00(r4);
                                if (A002 != null) {
                                    arrayList.add(A002);
                                }
                            }
                        }
                        r3.A01 = arrayList;
                    } else if ("prefetch_script".equals(str2)) {
                        r3.A00 = AnonymousClass5ZM.A00(r4.A00);
                    }
                }
                r4.BuF();
            }
            r2 = r3;
        }
        return C36441kJ.A0Q(BvC, r2);
    }
}
