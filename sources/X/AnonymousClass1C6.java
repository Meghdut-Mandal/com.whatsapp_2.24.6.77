package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1C6  reason: invalid class name */
public class AnonymousClass1C6 {
    public final C219612i A00;
    public final C21010yW A01;
    public final C19730wQ A02;
    public final AnonymousClass1CL A03;
    public final AnonymousClass16D A04;
    public final C19970wo A05;
    public final C220412q A06;
    public final AnonymousClass1C8 A07;
    public final C20810yC A08;
    public final C20500xf A09;
    public final AnonymousClass1CH A0A;
    public final AnonymousClass1CF A0B;

    public static int A00(AnonymousClass11F r4, AnonymousClass1C6 r5) {
        int i;
        C65073Qp A092 = r5.A06.A09(r4, false);
        int i2 = 0;
        if (r4 == null) {
            Log.e("spamManager/isCallNotSpamProp/null jid");
        } else {
            ArrayList A012 = A01(r5);
            if (A012 != null && A012.contains(r4)) {
                i2 = 1;
            }
        }
        int i3 = i2 ^ 1;
        if (A092 == null) {
            return i3 ^ 1;
        }
        if (i3 == 0) {
            return 1;
        }
        synchronized (A092) {
            i = A092.A04;
        }
        return i;
    }

    public static ArrayList A01(AnonymousClass1C6 r2) {
        String A012 = r2.A00.A01("call_not_spam_jids");
        if (A012 == null || A012.length() <= 0) {
            return null;
        }
        return AnonymousClass143.A06(AnonymousClass11F.class, Arrays.asList(A012.split(",")));
    }

    public void A02(AnonymousClass11F r6, Integer num, boolean z) {
        AnonymousClass1CL r4 = this.A03;
        long A002 = C19970wo.A00(this.A05);
        try {
            JSONObject A012 = AnonymousClass1CL.A01(r4, r6);
            if (A012 == null) {
                A012 = new JSONObject();
            }
            A012.put("tb_last_action_ts", A002);
            AnonymousClass1CL.A02(r4, r6, A012);
        } catch (JSONException unused) {
        }
        if (z) {
            C44992Pq r1 = new C44992Pq();
            r1.A00 = num;
            r1.A01 = 1;
            r1.A02 = r6.getRawString();
            C21010yW r0 = this.A01;
            r0.Bly(r1);
            r0.BP7();
        }
    }

    public void A03(AnonymousClass11F r10, boolean z) {
        boolean z2;
        AnonymousClass1CL r8 = this.A03;
        long A002 = C19970wo.A00(this.A05);
        try {
            JSONObject A012 = AnonymousClass1CL.A01(r8, r10);
            if (A012 == null) {
                A012 = new JSONObject();
            } else if (A012.has("tb_last_shown_ts") && (!A012.has("tb_last_action_ts") || A012.getLong("tb_last_shown_ts") >= A012.getLong("tb_last_action_ts"))) {
                z2 = false;
                if (z && z2) {
                    C44992Pq r1 = new C44992Pq();
                    r1.A00 = 1;
                    r1.A01 = 1;
                    r1.A02 = r10.getRawString();
                    C21010yW r0 = this.A01;
                    r0.Bly(r1);
                    r0.BP7();
                    return;
                }
            }
            A012.put("tb_last_shown_ts", A002);
            AnonymousClass1CL.A02(r8, r10, A012);
            z2 = true;
        } catch (JSONException unused) {
            z2 = false;
        }
        if (z) {
        }
    }

    public void A05(GroupJid groupJid, UserJid userJid, boolean z) {
        if (z) {
            AnonymousClass1CH r2 = this.A0A;
            Set set = r2.A0B;
            synchronized (set) {
                AnonymousClass1CH.A00(r2);
                if (set.remove(groupJid.getRawString())) {
                    AnonymousClass1CH.A01(r2);
                }
            }
        } else if (userJid == null || this.A04.A0A(userJid) == null) {
            A04(groupJid);
        }
    }

    public boolean A07(AnonymousClass11F r9) {
        AnonymousClass1CL r2 = this.A03;
        long A002 = C19970wo.A00(this.A05);
        try {
            JSONObject A012 = AnonymousClass1CL.A01(r2, r9);
            if (A012 == null || !A012.has("tb_expired_ts") || !A012.has("tb_cooldown") || A012.getLong("tb_expired_ts") < A002) {
                return false;
            }
            if (!A012.has("tb_last_action_ts") || A012.getLong("tb_last_action_ts") + A012.getLong("tb_cooldown") <= A002) {
                return true;
            }
            return false;
        } catch (JSONException unused) {
            return false;
        }
    }

    public boolean A08(AnonymousClass11F r7, int i) {
        int intValue;
        boolean add;
        AnonymousClass1C8 r5 = this.A07;
        C65073Qp A092 = r5.A02.A09(r7, false);
        if (A092 == null) {
            return false;
        }
        int i2 = A092.A04;
        if (i2 != i) {
            A092.A04 = i;
            r5.A00.A01(new C35701j7(r5, A092, 24), 34);
        }
        Integer valueOf = Integer.valueOf(i2);
        if (valueOf == null || (intValue = valueOf.intValue()) == i) {
            return false;
        }
        if (i == 1 && (r7 instanceof GroupJid)) {
            AnonymousClass1CH r4 = this.A0A;
            C595434i r3 = new C595434i(intValue);
            Set set = r4.A0A;
            synchronized (set) {
                add = set.add(r7.getRawString());
            }
            Set set2 = r4.A0B;
            synchronized (set2) {
                AnonymousClass1CH.A00(r4);
                if (set2.add(r7.getRawString())) {
                    AnonymousClass1CH.A01(r4);
                }
            }
            if (add) {
                r4.A09.Boy(new C35631j0(r4, r7, r3, 19));
            }
        }
        return true;
    }

    public boolean A09(AnonymousClass147 r5, Boolean bool) {
        AnonymousClass141 r3;
        AnonymousClass16D r1 = this.A04;
        UserJid A0G = r1.A0G(r5);
        if (A0G != null) {
            r3 = r1.A0D(A0G);
        } else {
            r3 = null;
        }
        if ((r3 == null || (!this.A02.A0M(r3.A0H) && r3.A0F == null)) && !this.A0B.A02(r5) && !bool.booleanValue() && A00(r5, this) == -1) {
            return true;
        }
        return false;
    }

    public boolean A0A(UserJid userJid) {
        if (!AnonymousClass3M3.A01(this.A09, userJid) && !AnonymousClass3RR.A00(this.A08, userJid) && !this.A02.A0L()) {
            if (A07(userJid)) {
                return false;
            }
            if (A00(userJid, this) == -1 && this.A04.A0D(userJid).A0F == null) {
                return false;
            }
            return true;
        }
        return true;
    }

    public AnonymousClass1C6(C19730wQ r1, AnonymousClass1CL r2, AnonymousClass16D r3, C19970wo r4, C220412q r5, C219612i r6, AnonymousClass1C8 r7, C20810yC r8, C20500xf r9, C21010yW r10, AnonymousClass1CH r11, AnonymousClass1CF r12) {
        this.A05 = r4;
        this.A08 = r8;
        this.A02 = r1;
        this.A07 = r7;
        this.A06 = r5;
        this.A01 = r10;
        this.A09 = r9;
        this.A04 = r3;
        this.A00 = r6;
        this.A0B = r12;
        this.A0A = r11;
        this.A03 = r2;
    }

    public void A04(GroupJid groupJid) {
        int A002 = A00(groupJid, this);
        if (A002 != 1 && A002 != -2 && A002 != -1) {
            AnonymousClass1C8 r4 = this.A07;
            C65073Qp A092 = r4.A02.A09(groupJid, false);
            if (A092 != null && A092.A04 != -1) {
                A092.A04 = -1;
                r4.A00.A01(new C35701j7(r4, A092, 25), 34);
            }
        }
    }

    public boolean A06(AnonymousClass11F r3) {
        int A002 = A00(r3, this);
        if (A002 == -1 || A002 == -2 || A002 == 0) {
            return true;
        }
        return false;
    }
}
