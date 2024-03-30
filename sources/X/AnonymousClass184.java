package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.184  reason: invalid class name */
public class AnonymousClass184 {
    public final C19730wQ A00;
    public final AnonymousClass185 A01;
    public final C235518x A02;
    public final C21100yf A03;
    public final AnonymousClass16D A04;
    public final AnonymousClass17Z A05;
    public final C220412q A06;
    public final C20810yC A07;

    public boolean A02(int i) {
        String A072;
        ArrayList arrayList;
        if (i < 0) {
            return false;
        }
        if (i != 0) {
            C21100yf r1 = this.A03;
            synchronized (C21100yf.class) {
                A072 = r1.A07(C21100yf.A23);
            }
            String str = C19430v1.A06;
            if (A072 == null) {
                A072 = str;
            }
            try {
                arrayList = new ArrayList();
                for (String valueOf : A072.split(",")) {
                    arrayList.add(Integer.valueOf(valueOf));
                }
            } catch (Exception unused) {
                arrayList = new ArrayList();
                for (String valueOf2 : str.split(",")) {
                    arrayList.add(Integer.valueOf(valueOf2));
                }
            }
            if (!arrayList.contains(Integer.valueOf(i))) {
                AnonymousClass17Z r0 = AnonymousClass17Z.$redex_init_class;
                return false;
            }
        }
        return true;
    }

    public static boolean A00(AnonymousClass184 r6, AnonymousClass11F r7, C80103un r8, Long l, int i, long j) {
        if (!(r7 instanceof UserJid)) {
            return false;
        }
        if (r8 == null) {
            return true;
        }
        if (i == r8.expiration || l == null) {
            return false;
        }
        long longValue = l.longValue();
        if (longValue > j) {
            return false;
        }
        long j2 = r8.ephemeralSettingTimestamp;
        if (longValue == j2) {
            C222813r r0 = UserJid.Companion;
            UserJid A002 = C222813r.A00(r7);
            C18740tg.A06(A002);
            C19730wQ r02 = r6.A00;
            r02.A0G();
            PhoneUserJid phoneUserJid = r02.A03;
            if (phoneUserJid == null || A002.compareTo((Jid) phoneUserJid) >= 0) {
                return false;
            }
            return true;
        } else if (longValue > j2) {
            return true;
        } else {
            return false;
        }
    }

    public int A01(AnonymousClass3T1 r8) {
        C207219uk r4;
        C207089uX r0;
        C220412q r2 = this.A06;
        AnonymousClass16D r1 = this.A04;
        AnonymousClass11F r02 = r8.A1J.A00;
        C18740tg.A06(r02);
        int A002 = AnonymousClass3TD.A00(r1, r2, r02);
        boolean z = false;
        if (A002 > 0) {
            z = true;
        }
        if (z) {
            Long l = r8.A0f;
            if (!r8.A1G() && ((l == null || l.longValue() <= 0) && (r8 instanceof AnonymousClass2bZ) && (r4 = ((AnonymousClass2bZ) r8).A00) != null)) {
                if (C20800yB.A01(C21000yV.A02, this.A07, 3240) && (r0 = r4.A04) != null && r0.A03.size() == 1) {
                    String str = ((C206569tc) r4.A04.A03.get(0)).A01.A00;
                    if ("review_and_pay".equals(str) || "review_order".equals(str) || "payment_method".equals(str) || "payment_status".equals(str)) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }

    public AnonymousClass184(C19730wQ r1, C21100yf r2, AnonymousClass16D r3, AnonymousClass185 r4, AnonymousClass17Z r5, C220412q r6, C235518x r7, C20810yC r8) {
        this.A07 = r8;
        this.A00 = r1;
        this.A06 = r6;
        this.A05 = r5;
        this.A03 = r2;
        this.A04 = r3;
        this.A01 = r4;
        this.A02 = r7;
    }
}
