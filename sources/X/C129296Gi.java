package X;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.6Gi  reason: invalid class name and case insensitive filesystem */
public abstract class C129296Gi {
    public static Object A00(C160607lH r3) {
        String str;
        Integer BlO = r3.BlO();
        if (BlO == C023109s.A0C) {
            return A01(r3);
        }
        if (BlO == C023109s.A00) {
            ArrayList A0I = AnonymousClass001.A0I();
            while (r3.BQE() != C023109s.A01) {
                A0I.add(A00(r3));
            }
            return A0I;
        } else if (BlO == C023109s.A0Y) {
            return null;
        } else {
            if (BlO == C023109s.A0X) {
                return Boolean.valueOf(r3.BlP().B1v());
            }
            if (BlO == C023109s.A0W) {
                Number BQP = r3.BlP().BQP();
                if (BQP instanceof Long) {
                    return C90514aH.A0m(BQP);
                }
                return Double.valueOf(BQP.doubleValue());
            } else if (BlO == C023109s.A0S) {
                return r3.BlP().BvC();
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("unsupported token type ");
                if (BlO != null) {
                    str = C1898495v.A00(BlO);
                } else {
                    str = "null";
                }
                throw AnonymousClass000.A0g(str, A0u);
            }
        }
    }

    public static HashMap A01(C160607lH r3) {
        if (r3.BlO() != C023109s.A0C) {
            return null;
        }
        HashMap A0J = AnonymousClass001.A0J();
        while (r3.BQE() != C023109s.A0G) {
            String BlN = r3.BlN();
            r3.BQE();
            A0J.put(BlN, A00(r3));
        }
        return A0J;
    }
}
