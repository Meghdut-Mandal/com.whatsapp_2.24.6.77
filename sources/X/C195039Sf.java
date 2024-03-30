package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.9Sf  reason: invalid class name and case insensitive filesystem */
public class C195039Sf {
    public C52152oy A00;
    public AnonymousClass11F A01;
    public Jid A02;
    public UserJid A03;
    public Boolean A04;
    public Long A05;
    public String A06 = "pn";
    public String A07;
    public boolean A08;

    public C21337AHp A00() {
        boolean z = true;
        C18740tg.A0E(AnonymousClass000.A1V(this.A02), "remoteJid must be provided");
        C18740tg.A0E(AnonymousClass000.A1V(this.A07), "id must be provided");
        C18740tg.A0E(AnonymousClass000.A1V(this.A05), "timestampMillis must be provided");
        if (this.A04 == null) {
            z = false;
        }
        C18740tg.A0E(z, "fromMe must be provided");
        return new C21337AHp(this);
    }
}
