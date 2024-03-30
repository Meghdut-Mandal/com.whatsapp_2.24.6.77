package X;

import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.AHp  reason: case insensitive filesystem */
public class C21337AHp implements C23084B3s {
    public int A00;
    public int A01 = 0;
    public int A02;
    public int A03;
    public int A04 = 0;
    public int A05 = 3;
    public int A06 = 0;
    public long A07;
    public AnonymousClass9VY A08;
    public AnonymousClass9VC A09;
    public AnonymousClass9X8 A0A;
    public AnonymousClass9VZ A0B;
    public C202319lY A0C;
    public AnonymousClass11F A0D;
    public Jid A0E;
    public C223313w A0F;
    public C223313w A0G;
    public PhoneUserJid A0H;
    public PhoneUserJid A0I;
    public PhoneUserJid A0J;
    public UserJid A0K;
    public AnonymousClass8SX A0L;
    public AnonymousClass8SX A0M;
    public AnonymousClass630 A0N;
    public AnonymousClass630 A0O;
    public AnonymousClass3T1 A0P;
    public C64933Qa A0Q;
    public C64933Qa A0R;
    public C80113ur A0S;
    public Boolean A0T;
    public Integer A0U;
    public Integer A0V;
    public Integer A0W;
    public Integer A0X;
    public Integer A0Y;
    public Long A0Z;
    public Long A0a;
    public Long A0b;
    public Long A0c;
    public Long A0d;
    public Long A0e;
    public Long A0f;
    public String A0g;
    public String A0h;
    public String A0i;
    public String A0j;
    public String A0k;
    public String A0l;
    public String A0m;
    public String A0n;
    public String A0o;
    public String A0p;
    public String A0q;
    public String A0r;
    public String A0s;
    public String A0t;
    public String A0u;
    public String A0v;
    public String A0w;
    public Set A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;
    public boolean A11;
    public boolean A12;
    public byte[] A13;
    public byte[] A14;
    public byte[] A15;
    public boolean A16;
    public boolean A17;
    public final long A18;
    public final Jid A19;
    public final UserJid A1A;
    public final String A1B;
    public final String A1C;
    public final C52152oy A1D;

    public void BoV() {
        this.A0P = null;
    }

    public void BsC(boolean z) {
        this.A12 = true;
    }

    public boolean BvI() {
        return true;
    }

    public boolean BvM() {
        return true;
    }

    public static C64933Qa A00(C21337AHp aHp) {
        C64933Qa r0 = aHp.A0R;
        if (r0 == null) {
            return aHp.A0Q;
        }
        return r0;
    }

    public AnonymousClass3T1 A01(B6E b6e) {
        AnonymousClass3T1 r0 = this.A0P;
        if (r0 == null) {
            r0 = b6e.B4a(A00(this), this.A18);
            this.A0P = r0;
        }
        A02(r0);
        return r0;
    }

    public void A02(AnonymousClass3T1 r5) {
        int i;
        this.A0P = r5;
        r5.A1T = DeviceJid.of(BHI());
        if (A00(this).A02) {
            this.A0P.A0n(4);
            this.A0P.A1Y = true;
        } else {
            Jid jid = this.A0E;
            if (jid != null) {
                this.A0P.A0q(AnonymousClass143.A00(jid));
            }
        }
        Integer num = this.A0Y;
        if (num != null) {
            this.A0P.A0C = num.intValue();
        }
        Integer num2 = this.A0X;
        if (num2 != null) {
            this.A0P.A0B = num2.intValue();
        }
        AnonymousClass3T1 r1 = this.A0P;
        r1.A0I = this.A18;
        Long l = this.A0b;
        if (l != null) {
            r1.A0G = l.longValue();
        }
        r1.A1Q = this.A07;
        Integer num3 = this.A0W;
        if (num3 != null) {
            r1.A0e = num3;
        }
        String str = this.A0o;
        if (str != null) {
            r1.A0r = str;
        }
        String str2 = this.A0m;
        if (str2 != null) {
            r1.A0n = str2;
        }
        PhoneUserJid phoneUserJid = this.A0J;
        if (phoneUserJid != null) {
            r1.A0S = phoneUserJid;
        }
        String str3 = this.A0v;
        if (str3 != null) {
            r1.A0v = str3;
        }
        PhoneUserJid phoneUserJid2 = this.A0H;
        if (phoneUserJid2 != null) {
            r1.A0Q = phoneUserJid2;
        }
        C223313w r0 = this.A0F;
        if (r0 != null) {
            r1.A0O = r0;
        }
        C223313w r02 = this.A0G;
        if (r02 != null) {
            r1.A0P = r02;
        }
        PhoneUserJid phoneUserJid3 = this.A0I;
        if (phoneUserJid3 != null) {
            r1.A0R = phoneUserJid3;
        }
        String str4 = this.A0u;
        if (str4 != null) {
            r1.A0u = str4;
        }
        C52152oy r03 = this.A1D;
        if (r03 != null) {
            r1.A0L = r03;
        }
        r1.A12 = this.A16;
        r1.A10 = this.A0y;
        Long l2 = this.A0f;
        if (l2 != null) {
            r1.A0l = l2;
        }
        r1.A0E = this.A06;
        r1.A0b = this.A0S;
        r1.A0k = this.A0e;
        r1.A0j = this.A0d;
        r1.A0i = this.A0c;
        int i2 = this.A01;
        if (i2 != 0) {
            r1.A01 = i2;
        }
        int i3 = this.A03;
        if (i3 != 0) {
            r1.A0j(i3);
        }
        C202319lY r04 = this.A0C;
        if (r04 != null) {
            AnonymousClass3T1 r12 = this.A0P;
            r12.A0M = r04;
            String str5 = r04.A0K;
            if (str5 == null) {
                str5 = "UNSET";
            }
            r12.A0t = str5;
        }
        AnonymousClass3T1 r2 = this.A0P;
        r2.A14 = this.A12;
        if (r2.A10 && r2.A0C == 0) {
            r2.A0m(0);
            this.A0P.A15((Long) null);
        } else if (!AnonymousClass000.A1R(r2.A05) && (i = this.A02) != 0 && AnonymousClass143.A0G(r2.A1J.A00)) {
            r2.A0m(i);
        }
        String str6 = this.A0h;
        if (str6 != null) {
            this.A0P.A1L.A01(str6);
        }
        AnonymousClass3T1 r13 = this.A0P;
        int i4 = this.A05;
        AnonymousClass3GP r14 = r13.A0c;
        r14.A00 = i4;
        r14.A02 = this.A10;
    }

    public AnonymousClass11F B9Y() {
        AnonymousClass11F r0 = this.A0D;
        if (r0 == null) {
            return AnonymousClass143.A00(this.A19);
        }
        return r0;
    }

    public int B9h() {
        AnonymousClass630 r0 = this.A0O;
        if (r0 == null && (r0 = this.A0N) == null) {
            return 0;
        }
        return r0.A00;
    }

    public int B9i() {
        AnonymousClass630 r0 = this.A0O;
        if (r0 == null && (r0 = this.A0N) == null) {
            return 0;
        }
        return r0.A01;
    }

    public C64933Qa BE4() {
        C64933Qa r0 = this.A0R;
        if (r0 == null) {
            return this.A0Q;
        }
        return r0;
    }

    public AnonymousClass11F BFC() {
        return AnonymousClass143.A00(this.A0E);
    }

    public AnonymousClass11F BGb() {
        return AnonymousClass143.A00(this.A19);
    }

    public int BGp() {
        Integer num = this.A0Y;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public Jid BHI() {
        Jid jid = this.A19;
        Jid jid2 = this.A0E;
        if (AnonymousClass143.A0G(jid) || (jid instanceof C177618e5)) {
            return jid2;
        }
        return jid;
    }

    public UserJid BHK() {
        Jid jid = this.A19;
        Jid jid2 = this.A0E;
        if (AnonymousClass143.A0G(jid) || (jid instanceof C177618e5)) {
            jid = jid2;
        }
        return C36401kF.A0b(AnonymousClass143.A00(jid));
    }

    public C207209uj BHp(String str) {
        Jid jid;
        Jid jid2;
        AnonymousClass9YT r2 = new AnonymousClass9YT();
        r2.A05 = "message";
        r2.A07 = this.A1C;
        r2.A00 = this.A07;
        boolean z = this.A0y;
        if (z) {
            jid = this.A0E;
        } else {
            jid = this.A19;
        }
        r2.A02 = jid;
        if (z) {
            jid2 = this.A19;
        } else {
            jid2 = this.A0E;
        }
        r2.A01 = jid2;
        r2.A08 = this.A0w;
        if (!TextUtils.isEmpty(str)) {
            r2.A08("error", str);
        }
        return r2.A01();
    }

    public boolean BK0(int i) {
        return AnonymousClass000.A1S(this.A03 & 16, 16);
    }

    public boolean BMW() {
        return AnonymousClass000.A1V(this.A0W);
    }

    public boolean BMd() {
        return AnonymousClass000.A1V(this.A0C);
    }

    public boolean BvK() {
        if (this.A00 == 1) {
            return false;
        }
        return true;
    }

    public C21337AHp(C195039Sf r7) {
        Jid jid = r7.A02;
        this.A19 = jid;
        UserJid userJid = r7.A03;
        this.A1A = userJid;
        String str = r7.A07;
        this.A1C = str;
        this.A18 = r7.A05.longValue();
        this.A1B = r7.A06;
        this.A1D = r7.A00;
        this.A16 = r7.A08;
        AnonymousClass11F A002 = AnonymousClass143.A00(jid);
        this.A0Q = C165617ti.A0R(A002, str, r7.A04.booleanValue());
        if (userJid != null) {
            this.A0R = C165617ti.A0R(userJid, str, true);
            return;
        }
        AnonymousClass11F r0 = r7.A01;
        if (r0 != null && !r0.equals(A002)) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("IncomingMessageStanza/IncomingMessageStanza remoteChatJid=");
            A0u2.append(A002);
            A0u2.append("; normalizedChatJid=");
            C36321k7.A1N(r7.A01, A0u2);
            this.A0R = C165617ti.A0R(r7.A01, str, r7.A04.booleanValue());
            this.A17 = true;
        }
    }

    public String B9T() {
        return this.A0i;
    }

    public byte[] BB4() {
        return this.A13;
    }

    public String BB5() {
        return this.A0l;
    }

    public int BBO() {
        return this.A01;
    }

    public /* bridge */ /* synthetic */ AnonymousClass3T1 BBj() {
        return this.A0P;
    }

    public AnonymousClass630 BCe() {
        return this.A0N;
    }

    public long BDf() {
        return this.A07;
    }

    public String BE8() {
        return this.A0w;
    }

    public Jid BFE() {
        return this.A0E;
    }

    public UserJid BGZ() {
        return this.A1A;
    }

    public byte[] BGa() {
        return this.A14;
    }

    public Jid BGc() {
        return this.A19;
    }

    public AnonymousClass630 BHJ() {
        return this.A0O;
    }

    public long BIM() {
        return this.A18;
    }

    public boolean BLE() {
        return this.A0y;
    }

    public boolean BMO() {
        return this.A17;
    }

    public boolean BNC() {
        return this.A12;
    }

    public String getId() {
        return this.A1C;
    }

    public void Brb(int i) {
        this.A04 = i;
    }
}
