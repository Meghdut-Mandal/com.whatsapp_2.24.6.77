package X;

import android.os.Message;

/* renamed from: X.1Wv  reason: invalid class name and case insensitive filesystem */
public class C29491Wv implements C236319f {
    public final C29481Wu A00;
    public final AnonymousClass1C4 A01;
    public final AnonymousClass19L A02;
    public final C19770wU A03;

    public int[] BCF() {
        return new int[]{221};
    }

    public boolean BJl(Message message, int i) {
        if (i != 221) {
            return false;
        }
        Object obj = message.obj;
        C18740tg.A06(obj);
        C207209uj r4 = (C207209uj) obj;
        C201579ju A002 = AnonymousClass19L.A00(this.A02, 1, r4.A00);
        if (A002 != null) {
            A002.A04(3);
        }
        this.A03.Boy(new C35741jB(this, r4, 19));
        return true;
    }

    public C29491Wv(C29481Wu r1, AnonymousClass1C4 r2, AnonymousClass19L r3, C19770wU r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
