package X;

import android.content.ContentResolver;
import android.util.Log;
import java.util.HashMap;

public final /* synthetic */ class A3O implements C22886Axh {
    public final String A00;

    public A3O(String str) {
        this.A00 = str;
    }

    public final Object Byy() {
        Object obj;
        String str = this.A00;
        ContentResolver contentResolver = C202919mw.A05.getContentResolver();
        boolean z = false;
        Class<C201949kl> cls = C201949kl.class;
        synchronized (cls) {
            C201949kl.A01(contentResolver);
            obj = C201949kl.A00;
        }
        HashMap hashMap = C201949kl.A02;
        Object obj2 = false;
        synchronized (cls) {
            if (hashMap.containsKey(str)) {
                Object obj3 = hashMap.get(str);
                if (obj3 != null) {
                    obj2 = obj3;
                }
            } else {
                obj2 = null;
            }
        }
        Boolean bool = (Boolean) obj2;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            String A002 = C201949kl.A00(contentResolver, str);
            if (A002 != null && !A002.equals("")) {
                if (C36361kB.A1Z(A002, C201949kl.A05)) {
                    bool = true;
                    z = true;
                } else if (C36361kB.A1Z(A002, C201949kl.A06)) {
                    bool = false;
                } else {
                    StringBuilder A0i = C90524aI.A0i("attempt to read gservices key ");
                    A0i.append(str);
                    A0i.append(" (value \"");
                    A0i.append(A002);
                    Log.w("Gservices", AnonymousClass000.A0q("\") as boolean", A0i));
                }
            }
            synchronized (cls) {
                if (obj == C201949kl.A00) {
                    hashMap.put(str, bool);
                    C201949kl.A01.remove(str);
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
