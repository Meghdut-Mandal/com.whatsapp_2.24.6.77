package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.3Nj  reason: invalid class name and case insensitive filesystem */
public final class C64283Nj {
    public final long A00;
    public final Jid A01;
    public final String A02;
    public final String A03;

    public C64283Nj(Jid jid, String str, String str2) {
        this(jid, str, str2, System.currentTimeMillis());
    }

    public C64283Nj(Jid jid, String str, String str2, long j) {
        this.A02 = str2;
        this.A01 = jid;
        this.A03 = str;
        this.A00 = j;
    }
}
