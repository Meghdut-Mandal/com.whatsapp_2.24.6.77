package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3Oj  reason: invalid class name and case insensitive filesystem */
public class C64533Oj {
    public final int A00;
    public final UserJid A01;
    public final String A02;

    public C64533Oj(UserJid userJid, String str) {
        this.A02 = str;
        this.A01 = userJid;
        this.A00 = 0;
    }

    public String toString() {
        return this.A02;
    }

    public C64533Oj(String str, int i) {
        this.A02 = str;
        this.A01 = null;
        this.A00 = i;
    }
}
