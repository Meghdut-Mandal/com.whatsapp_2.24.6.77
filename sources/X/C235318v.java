package X;

import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.18v  reason: invalid class name and case insensitive filesystem */
public class C235318v {
    public final C21100yf A00;
    public final C234618o A01;
    public final C19970wo A02;
    public final C20810yC A03;
    public final C000100b A04;

    public static ArrayList A00(C235318v r5, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C000100b r0 = r5.A04;
            Object jvidispatchOOO = JniBridge.jvidispatchOOO(1, ((JniBridge) r0).wajContext.get(), ((AnonymousClass3IG) it.next()).A01);
            if (jvidispatchOOO == null) {
                Log.e("wamsys/convertToNativePublicKeyList/public-key-conversion-failed");
                return null;
            }
            arrayList.add(jvidispatchOOO);
        }
        return arrayList;
    }

    public C235318v(C21100yf r1, C234618o r2, C19970wo r3, C20810yC r4, C000100b r5) {
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A00 = r1;
        this.A01 = r2;
    }
}
