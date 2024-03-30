package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.9iW  reason: invalid class name and case insensitive filesystem */
public class C200949iW {
    public final long A00;
    public final AnonymousClass00I A01;
    public final C20070wy A02;
    public final C20070wy A03;
    public final C20070wy A04;
    public final C20070wy A05;
    public final UserJid A06;
    public final String A07;
    public final String A08;
    public final byte[] A09;

    public static AnonymousClass00I A00(C20070wy r7) {
        C20090x0 r6 = new C20090x0();
        C20090x0 r5 = new C20090x0();
        C225614x it = r7.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(it);
            AnonymousClass9WJ r3 = (AnonymousClass9WJ) A11.getValue();
            Object key = A11.getKey();
            Long valueOf = Long.valueOf(r3.A00);
            r6.put(key, valueOf);
            DeviceJid deviceJid = r3.A01;
            if (deviceJid != null) {
                r5.put(deviceJid, valueOf);
            }
        }
        return new AnonymousClass00I(r6.build(), r5.build());
    }

    public C200949iW(String str) {
        this.A06 = null;
        this.A07 = null;
        this.A08 = str;
        C20070wy of = C20070wy.of();
        this.A02 = of;
        this.A03 = of;
        this.A04 = of;
        this.A05 = of;
        this.A09 = null;
        this.A00 = 0;
        this.A01 = null;
    }

    public C200949iW(AnonymousClass00I r4, C20070wy r5, C20070wy r6, UserJid userJid, String str, byte[] bArr, long j) {
        this.A06 = userJid;
        this.A07 = str;
        this.A08 = null;
        AnonymousClass00I A002 = A00(r5);
        AnonymousClass00I A003 = A00(r6);
        this.A02 = (C20070wy) A002.A00;
        this.A03 = (C20070wy) A003.A00;
        this.A04 = (C20070wy) A002.A01;
        this.A05 = (C20070wy) A003.A01;
        this.A09 = bArr;
        this.A00 = j;
        this.A01 = r4;
    }
}
