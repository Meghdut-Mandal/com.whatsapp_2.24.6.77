package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.7pq  reason: invalid class name and case insensitive filesystem */
public class C163217pq implements C158597hl {
    public Object A00;
    public Object A01;
    public String A02;
    public String A03;
    public String A04;
    public final int A05;

    public C163217pq(AnonymousClass54F r1, UserJid userJid, String str, String str2, String str3, int i) {
        this.A05 = i;
        this.A00 = r1;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = userJid;
    }

    public final void BX5(Object obj) {
        AnonymousClass1KT r3;
        String str;
        String str2;
        if (this.A05 != 0) {
            String str3 = this.A02;
            String str4 = this.A03;
            String str5 = this.A04;
            ((AnonymousClass54F) this.A00).A04.A0D((Jid) this.A01, str3, str4, str5, "back", (String) null);
            return;
        }
        AnonymousClass54F r2 = (AnonymousClass54F) this.A00;
        String str6 = this.A02;
        String str7 = this.A03;
        String str8 = this.A04;
        Jid jid = (Jid) this.A01;
        AnonymousClass70D r11 = (AnonymousClass70D) obj;
        AnonymousClass00C.A0D(r11, 5);
        String str9 = r11.A03;
        if (AnonymousClass00C.A0J(str9, "open_bloks_screen")) {
            C108215Sq r1 = r11.A00;
            if (r1 == C108215Sq.ON_COMPLETION) {
                r3 = r2.A04;
                str = null;
                str2 = "bloks_screen_cta";
            } else if (r1 == C108215Sq.ON_RESUME && !r2.A06.A0E(4510)) {
                r2.A04.A0C(str6.hashCode(), 2);
                return;
            } else {
                return;
            }
        } else if (AnonymousClass00C.A0J(str9, "wae_action_dispatcher") && r11.A00 == C108215Sq.ON_START) {
            r3 = r2.A04;
            str = null;
            str2 = "back";
        } else {
            return;
        }
        r3.A0D(jid, str6, str7, str8, str2, str);
    }
}
