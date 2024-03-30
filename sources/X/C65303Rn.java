package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Rn  reason: invalid class name and case insensitive filesystem */
public final class C65303Rn {
    public UserJid A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final UserJid A04;
    public final Integer A05;
    public final String A06;
    public final List A07;
    public final List A08;
    public final List A09;
    public final Map A0A;
    public final Map A0B = C36431kI.A1G();
    public final C19970wo A0C;
    public final Map A0D;

    public C65303Rn(C19970wo r2, UserJid userJid, Integer num, String str, List list, List list2, List list3, Map map, Map map2, int i, long j, long j2) {
        AnonymousClass00C.A0D(map2, 11);
        this.A04 = userJid;
        this.A0C = r2;
        this.A02 = j;
        this.A03 = j2;
        this.A05 = num;
        this.A01 = i;
        this.A09 = list;
        this.A08 = list2;
        this.A07 = list3;
        this.A0A = map;
        this.A0D = map2;
        this.A06 = str;
    }

    public static final int A00(UserJid userJid, C65303Rn r5) {
        if (userJid == C223613z.A00) {
            return 4;
        }
        Iterator it = r5.A08.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (!userJid.equals(C36441kJ.A0h(it).A09)) {
                i2++;
            } else if (i2 >= 0) {
                return 2;
            }
        }
        Iterator it2 = r5.A07.iterator();
        while (it2.hasNext()) {
            if (!userJid.equals(C36441kJ.A0h(it2).A09)) {
                i++;
            } else if (i < 0) {
                return 1;
            } else {
                return 3;
            }
        }
        return 1;
    }

    public static final boolean A01(AnonymousClass3T1 r9, C65303Rn r10) {
        long A002 = C19970wo.A00(r10.A0C);
        Map map = r10.A0D;
        C64933Qa r5 = r9.A1J;
        Number number = (Number) map.get(r5);
        if (number != null && A002 - number.longValue() <= 60000) {
            return false;
        }
        AnonymousClass00C.A07(r5);
        map.put(r5, Long.valueOf(A002));
        return true;
    }
}
