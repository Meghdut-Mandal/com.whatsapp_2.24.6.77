package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.9YT  reason: invalid class name */
public class AnonymousClass9YT {
    public long A00;
    public Jid A01;
    public Jid A02;
    public UserJid A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public final Map A09 = AnonymousClass001.A0J();

    public void A03() {
        this.A01 = null;
    }

    public static AnonymousClass9YT A00(Jid jid) {
        AnonymousClass9YT r0 = new AnonymousClass9YT();
        r0.A02 = jid;
        return r0;
    }

    public C207209uj A01() {
        ArrayList A15;
        Map map = this.A09;
        if (map.isEmpty()) {
            A15 = null;
        } else {
            A15 = C36441kJ.A15(map.values());
        }
        Jid jid = this.A02;
        String str = this.A05;
        String str2 = this.A07;
        C18740tg.A06(str2);
        return new C207209uj(jid, this.A01, this.A03, str, str2, this.A08, this.A04, this.A06, A15, this.A00);
    }

    public void A02() {
        this.A05 = "notification";
    }

    public void A04() {
        this.A08 = "picture";
    }

    public void A08(String str, String str2) {
        this.A09.put(str, new AnonymousClass1AL(str, str2));
    }

    public void A05(long j) {
        this.A00 = j;
    }

    public void A06(Jid jid) {
        this.A02 = jid;
    }

    public void A07(String str) {
        this.A07 = str;
    }
}
