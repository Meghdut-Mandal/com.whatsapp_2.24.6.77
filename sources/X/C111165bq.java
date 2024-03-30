package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.5bq  reason: invalid class name and case insensitive filesystem */
public abstract class C111165bq {
    public static final ArrayList A00(List list) {
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C123375wO r4 = (C123375wO) it.next();
            JSONObject A1B = C36441kJ.A1B();
            JSONObject A0x = C90484aE.A0x(r4.A04, "module", A1B);
            String str = r4.A00;
            if (str != null) {
                A0x.put(r4.A01, str);
            }
            String str2 = r4.A02;
            if (str2 != null) {
                A0x.put("ranking_logic_ver", str2);
            }
            String str3 = r4.A03;
            if (str3 != null) {
                A0x.put("source", str3);
            }
            A1B.put("config", A0x);
            A0I.add(A1B);
        }
        return A0I;
    }
}
