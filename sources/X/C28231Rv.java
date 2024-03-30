package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1Rv  reason: invalid class name and case insensitive filesystem */
public class C28231Rv {
    public UserJid A00;
    public C134826bf A01;
    public C134786bb A02;
    public final int A03;
    public final Integer A04;
    public final String A05;

    public C28231Rv(C134826bf r2, Integer num, String str) {
        this.A03 = 5;
        this.A05 = str;
        this.A04 = num;
        this.A01 = r2;
    }

    public C28231Rv(C134786bb r2, String str) {
        this.A03 = 4;
        this.A04 = 0;
        this.A02 = r2;
        this.A05 = str;
    }

    public C28231Rv(UserJid userJid, Integer num, String str, int i) {
        this.A03 = i;
        this.A04 = num;
        this.A00 = userJid;
        this.A05 = str;
    }
}
