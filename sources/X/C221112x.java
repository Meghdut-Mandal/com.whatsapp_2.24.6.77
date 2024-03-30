package X;

import com.whatsapp.util.Log;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.12x  reason: invalid class name and case insensitive filesystem */
public class C221112x implements C19680wL {
    public final C19970wo A00;
    public final HashMap A01 = new HashMap();

    public AnonymousClass6L6 A02(String str, boolean z, boolean z2) {
        boolean z3;
        AnonymousClass6L6 r8;
        InetAddress[] inetAddressArr;
        StringBuilder sb = new StringBuilder();
        sb.append("resolving ");
        String str2 = str;
        sb.append(str2);
        Log.i(sb.toString());
        synchronized (this) {
            HashMap hashMap = this.A01;
            List<AnonymousClass6DF> list = (List) hashMap.get(str2);
            z3 = z2;
            if (list == null) {
                r8 = null;
            } else {
                ArrayList arrayList = new ArrayList();
                HashSet hashSet = new HashSet();
                int i = 0;
                for (AnonymousClass6DF r3 : list) {
                    C19970wo r1 = this.A00;
                    Long l = r3.A01;
                    if (l == null || C19970wo.A00(r1) < l.longValue()) {
                        arrayList.add(r3.A03);
                        i = r3.A00;
                    } else {
                        hashSet.add(r3);
                    }
                }
                list.removeAll(hashSet);
                if (list.isEmpty()) {
                    hashMap.remove(str2);
                }
                r8 = new AnonymousClass6L6(new C119555q3(i, true), (InetAddress[]) arrayList.toArray(new InetAddress[0]), z3);
            }
        }
        if (r8 != null && (inetAddressArr = r8.A04) != null && inetAddressArr.length > 0) {
            return r8;
        }
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str2);
            A01(Arrays.asList(allByName), str2, 0);
            return new AnonymousClass6L6(new C119555q3(0, false), allByName, z3);
        } catch (UnknownHostException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("primary dns resolution failed for ");
            sb2.append(str2);
            Log.w(sb2.toString(), e);
            try {
                ArrayList A012 = C201889kc.A01(str2, 0);
                ArrayList arrayList2 = new ArrayList(A012.size());
                Iterator it = A012.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((C194569Qg) it.next()).A01);
                }
                A01(arrayList2, str2, 1);
                return new AnonymousClass6L6(new C119555q3(1, false), (InetAddress[]) arrayList2.toArray(new InetAddress[0]), z3);
            } catch (C221212y | UnknownHostException e2) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("secondary dns resolution failed for ");
                sb3.append(str2);
                Log.w(sb3.toString(), e2);
                if (z) {
                    try {
                        return A00(this, str2, true, z3);
                    } catch (UnknownHostException e3) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("hardcoded ip resolution failed for ");
                        sb4.append(str2);
                        Log.w(sb4.toString(), e3);
                        throw e;
                    }
                } else {
                    throw e;
                }
            }
        }
    }

    public void BUP(AnonymousClass3K7 r2) {
        synchronized (this) {
            this.A01.clear();
        }
    }

    public static AnonymousClass6L6 A00(C221112x r4, String str, boolean z, boolean z2) {
        List list = (List) C113215fB.A00.get(str);
        if (list == null || list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("no hardcoded ips found for ");
            sb.append(str);
            throw new UnknownHostException(sb.toString());
        }
        if (z) {
            r4.A01(list, str, 2);
        }
        return new AnonymousClass6L6(new C119555q3(2, false), (InetAddress[]) list.toArray(new InetAddress[0]), z2);
    }

    public C221112x(C19970wo r2) {
        this.A00 = r2;
    }

    private void A01(Iterable iterable, String str, int i) {
        long currentTimeMillis = System.currentTimeMillis() + 3600000;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(new AnonymousClass6DF(Long.valueOf(currentTimeMillis), (Short) null, (InetAddress) it.next(), i, false, false));
        }
        synchronized (this) {
            this.A01.put(str, arrayList);
        }
    }
}
