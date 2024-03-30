package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.AUl  reason: case insensitive filesystem */
public class C21668AUl implements Comparable {
    public int A00;
    public long A01;
    public AnonymousClass16X A02;
    public final C175708av A03;
    public final UserJid A04;
    public final UserJid A05;
    public final boolean A06;

    public C21668AUl(AnonymousClass16X r3, C175708av r4, UserJid userJid, long j) {
        this.A06 = true;
        this.A04 = null;
        this.A05 = userJid;
        this.A00 = 1;
        this.A02 = r3;
        this.A01 = j;
        this.A03 = r4;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C21668AUl aUl = (C21668AUl) obj;
        int compare = Integer.compare(this.A00, aUl.A00);
        if (compare == 0) {
            return Long.compare(this.A01, aUl.A01);
        }
        return -compare;
    }

    public C21668AUl(UserJid userJid, UserJid userJid2, int i, long j) {
        this.A06 = false;
        this.A03 = null;
        this.A05 = userJid;
        this.A04 = userJid2;
        this.A00 = i;
        this.A01 = j;
    }
}
