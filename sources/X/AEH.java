package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;

public class AEH implements C22958AzA {
    public ArrayList BlE(AnonymousClass16T r5, C203399nx r6) {
        String str;
        ArrayList A0I = AnonymousClass001.A0I();
        String str2 = r6.A00;
        if (str2.equals("card-update")) {
            try {
                C203399nx A0d = r6.A0d("card");
                AnonymousClass8b7 r0 = new AnonymousClass8b7();
                r0.A04(r5, A0d, 0);
                A0I.add(r0);
                return A0I;
            } catch (C235919b unused) {
                str = "PAY: BrazilProtoParser/parse: no card node for card-update notification";
                Log.w(str);
                return A0I;
            }
        } else {
            if (str2.equals("merchant-update")) {
                try {
                    C203399nx A0d2 = r6.A0d("merchant");
                    C175868bC r02 = new C175868bC();
                    r02.A04(r5, A0d2, 0);
                    A0I.add(r02);
                    return A0I;
                } catch (C235919b unused2) {
                    str = "PAY: BrazilProtoParser/parse: no merchant node for merchant-update notification";
                    Log.w(str);
                    return A0I;
                }
            }
            return A0I;
        }
    }
}
