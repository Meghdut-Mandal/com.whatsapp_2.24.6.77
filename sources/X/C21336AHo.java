package X;

import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.AHo  reason: case insensitive filesystem */
public class C21336AHo implements C23084B3s {
    public Jid A00;
    public AnonymousClass630 A01;
    public AnonymousClass630 A02;
    public boolean A03;
    public UserJid A04;
    public boolean A05;
    public final long A06;
    public final Jid A07;
    public final C64933Qa A08;
    public final String A09;
    public final String A0A;

    public C21336AHo(Jid jid, UserJid userJid, String str, String str2, long j) {
        this.A06 = j;
        this.A09 = str;
        this.A07 = jid;
        this.A04 = userJid;
        this.A0A = str2;
        this.A08 = C165617ti.A0R(AnonymousClass143.A00(jid), str, false);
    }

    public int BBO() {
        return 0;
    }

    public AnonymousClass3T1 BBj() {
        return null;
    }

    public String BE8() {
        return null;
    }

    public boolean BK0(int i) {
        return false;
    }

    public boolean BLE() {
        return false;
    }

    public boolean BMO() {
        return false;
    }

    public boolean BMd() {
        return false;
    }

    public void BoV() {
    }

    public void BsC(boolean z) {
        this.A05 = true;
    }

    public boolean BvI() {
        return false;
    }

    public boolean BvK() {
        return false;
    }

    public boolean BvM() {
        return false;
    }

    public /* synthetic */ AnonymousClass11F B9Y() {
        return AnonymousClass143.A00(this.A07);
    }

    public int B9h() {
        AnonymousClass630 r0 = this.A02;
        if (r0 == null && (r0 = this.A01) == null) {
            return 0;
        }
        return r0.A00;
    }

    public int B9i() {
        AnonymousClass630 r0 = this.A02;
        if (r0 == null && (r0 = this.A01) == null) {
            return 0;
        }
        return r0.A01;
    }

    public AnonymousClass11F BFC() {
        return AnonymousClass143.A00(this.A00);
    }

    public AnonymousClass11F BGb() {
        return AnonymousClass143.A00(this.A07);
    }

    public Jid BHI() {
        Jid jid = this.A07;
        if (AnonymousClass143.A0G(jid) || (jid instanceof C177618e5)) {
            return this.A00;
        }
        return jid;
    }

    public C207209uj BHp(String str) {
        Jid jid;
        Jid jid2;
        AnonymousClass9YT r2 = new AnonymousClass9YT();
        r2.A05 = "appdata";
        r2.A07 = this.A09;
        r2.A00 = 0;
        boolean z = this.A03;
        if (z) {
            jid = this.A00;
        } else {
            jid = this.A07;
        }
        r2.A02 = jid;
        if (z) {
            jid2 = this.A07;
        } else {
            jid2 = this.A00;
        }
        r2.A01 = jid2;
        if (!TextUtils.isEmpty(str)) {
            r2.A08("error", str);
        }
        return r2.A01();
    }

    public void Brb(int i) {
        throw AnonymousClass001.A0E("Setting placeholder is not supported in appdata");
    }

    public String B9T() {
        return this.A0A;
    }

    public byte[] BB4() {
        return null;
    }

    public String BB5() {
        return null;
    }

    public AnonymousClass630 BCe() {
        return this.A01;
    }

    public long BDf() {
        return 0;
    }

    public C64933Qa BE4() {
        return this.A08;
    }

    public Jid BFE() {
        return this.A00;
    }

    public UserJid BGZ() {
        return this.A04;
    }

    public byte[] BGa() {
        return null;
    }

    public Jid BGc() {
        return this.A07;
    }

    public int BGp() {
        return 0;
    }

    public AnonymousClass630 BHJ() {
        return this.A02;
    }

    public UserJid BHK() {
        return C36401kF.A0b(AnonymousClass143.A00(BHI()));
    }

    public long BIM() {
        return this.A06;
    }

    public boolean BMW() {
        return false;
    }

    public boolean BNC() {
        return this.A05;
    }

    public String getId() {
        return this.A09;
    }
}
