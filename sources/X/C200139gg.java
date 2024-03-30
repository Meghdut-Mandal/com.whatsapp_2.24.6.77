package X;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.9gg  reason: invalid class name and case insensitive filesystem */
public class C200139gg {
    public static final AnonymousClass1AL[] A0D = new AnonymousClass1AL[0];
    public int A00;
    public long A01;
    public long A02;
    public Map A03;
    public final C19630wG A04;
    public final C19420v0 A05;
    public final C199709fp A06;
    public final AnonymousClass6S6 A07;
    public final C203299nk A08;
    public final C19700wN A09;
    public final C21100yf A0A;
    public final C20810yC A0B;
    public final AnonymousClass19L A0C;

    public static String A00(C200139gg r1, int i) {
        int i2 = i + 1;
        r1.A00 = i2;
        return Integer.toHexString(i2);
    }

    public static void A01(C203399nx r2, C200139gg r3, AnonymousClass1AL[] r4) {
        r3.A08.A06(new C203399nx(r2, "iq", r4));
    }

    public void A02() {
        this.A08.A06(C165607th.A0h("available"));
    }

    public void A03() {
        String A002 = A00(this, this.A00);
        C107545Pj r3 = new C107545Pj(A002);
        this.A03.put(A002, new B7S(this, r3, 2));
        this.A08.A06(r3.A00);
    }

    public void A04(C203399nx r9, long j) {
        C201579ju A012 = this.A0C.A01(j);
        if (A012 != null) {
            synchronized (A012) {
                int i = A012.A00;
                if (i == 0) {
                    C19700wN r3 = A012.A05;
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("tag=");
                    r3.A0E("loggable_stanza_already_acked", AnonymousClass000.A0q(A012.A03(), A0u), true);
                } else {
                    C201579ju.A01(A012, 0, i, SystemClock.uptimeMillis() - A012.A01);
                    A012.A00 = 0;
                    C201579ju.A01(A012, (Integer) null, 0, SystemClock.uptimeMillis() - A012.A04);
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("LoggableStanza/onStanzaAcked/stanzaId=");
                    C36321k7.A1a(A0u2, A012.A09);
                    AnonymousClass19L r32 = A012.A06;
                    synchronized (r32) {
                        r32.A02(A012.A02).remove(Long.valueOf(A012.A03));
                        Iterator A0s = C36361kB.A0s(r32.A01);
                        while (A0s.hasNext()) {
                            ((AnonymousClass19N) A0s.next()).Bh4(A012);
                        }
                    }
                }
            }
        }
        this.A08.A06(r9);
    }

    public void A05(boolean z) {
        String A002 = A00(this, this.A00);
        B7R.A00(this, A002, this.A03, 2);
        String A0t = C36371kC.A0t(this.A0A.A00, "server_props:config_hash");
        if (A0t == null || z) {
            A0t = "";
        }
        AnonymousClass1AL[] r2 = new AnonymousClass1AL[2];
        boolean A1Y = C36371kC.A1Y("protocol", "2", r2);
        C36341k9.A1L("hash", A0t, r2, 1);
        C203399nx A042 = C203399nx.A04("props", r2);
        AnonymousClass1AL[] r1 = new AnonymousClass1AL[4];
        C36331k8.A1R(A002, r1, A1Y ? 1 : 0);
        C165567td.A1S("w", r1, 1, 2);
        C36341k9.A1V(r1, 3);
        A01(A042, this, r1);
    }

    public boolean A06() {
        byte[] decode;
        String A0t = C36371kC.A0t(C36341k9.A0E(this.A05), "pref_client_auth_token");
        if (TextUtils.isEmpty(A0t) || (decode = Base64.decode(A0t, 3)) == null) {
            return false;
        }
        AnonymousClass6QB A0q = C36441kJ.A0q("ib");
        AnonymousClass6QB A0q2 = C36441kJ.A0q("cat");
        C203539oF.A0I(decode, 1, 1024);
        A0q2.A01 = decode;
        this.A08.A06(C165567td.A0I(A0q2, A0q));
        return true;
    }

    public C200139gg(C19700wN r2, C21100yf r3, C19630wG r4, C19420v0 r5, C20810yC r6, C117495mM r7, C199709fp r8, AnonymousClass19L r9, C203299nk r10, C19770wU r11, Map map) {
        this.A0B = r6;
        this.A09 = r2;
        this.A04 = r4;
        this.A0A = r3;
        this.A0C = r9;
        this.A05 = r5;
        this.A06 = r8;
        this.A03 = map;
        this.A07 = new AnonymousClass6S6(r2, r7, r11);
        this.A08 = r10;
    }
}
