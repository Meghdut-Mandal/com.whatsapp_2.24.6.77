package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.4VM  reason: invalid class name */
public class AnonymousClass4VM extends BroadcastReceiver {
    public Object A00;
    public final int A01;

    public AnonymousClass4VM(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onReceive(Context context, Intent intent) {
        Locale locale;
        switch (this.A01) {
            case 0:
                AnonymousClass16D r1 = (AnonymousClass16D) this.A00;
                Locale A0x = C36401kF.A0x(r1.A0C);
                Map map = r1.A04.A01;
                synchronized (map) {
                    HashSet hashSet = null;
                    Iterator A0y = AnonymousClass000.A0y(map);
                    while (A0y.hasNext()) {
                        Map.Entry A11 = AnonymousClass000.A11(A0y);
                        AnonymousClass11F r12 = (AnonymousClass11F) A11.getKey();
                        AnonymousClass141 r0 = (AnonymousClass141) A11.getValue();
                        if (!(r12 == null || r0 == null || (locale = r0.A0b) == null || A0x.equals(locale))) {
                            if (hashSet == null) {
                                hashSet = C36441kJ.A16();
                            }
                            hashSet.add(r12);
                        }
                    }
                    if (hashSet != null) {
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            map.remove(C36401kF.A0a(it));
                        }
                        hashSet.size();
                    }
                }
                return;
            case 1:
                AnonymousClass3BJ r2 = (AnonymousClass3BJ) this.A00;
                C21360z5 r13 = r2.A02;
                r13.A00 = null;
                if (!r13.A03()) {
                    r2.A09.A03(8, "Roadblocks");
                    return;
                }
                return;
            case 2:
                C20040wv.A00 = null;
                C20040wv.A01 = null;
                C20040wv.A02 = null;
                return;
            default:
                C20040wv.A00 = null;
                C20040wv.A01 = null;
                C20040wv.A02 = null;
                AnonymousClass3BJ r5 = (AnonymousClass3BJ) this.A00;
                C29341Wg r4 = r5.A0B;
                C65613Su A012 = r4.A03.A01();
                if (A012 != null) {
                    int i = A012.A01;
                    C36321k7.A1T("UserNoticeManager/handleLocaleChange/notice id:", AnonymousClass000.A0u(), i);
                    C29351Wh r14 = r4.A02;
                    r14.A07(i);
                    if (r4.A04.A03() && !AnonymousClass3RI.A01(r4.A01, A012)) {
                        r14.A08(i);
                    }
                }
                AnonymousClass171 r15 = r5.A07;
                r15.A07.clear();
                r15.A08.clear();
                return;
        }
    }
}
