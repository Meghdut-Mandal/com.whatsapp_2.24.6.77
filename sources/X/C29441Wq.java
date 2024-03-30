package X;

import android.os.Message;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;

/* renamed from: X.1Wq  reason: invalid class name and case insensitive filesystem */
public class C29441Wq implements C236319f {
    public final AnonymousClass1C3 A00;
    public final AnonymousClass19L A01;

    public int[] BCF() {
        return new int[]{212};
    }

    public boolean BJl(Message message, int i) {
        if (i != 212) {
            return false;
        }
        Object obj = message.obj;
        C18740tg.A06(obj);
        C207209uj r4 = (C207209uj) obj;
        C201579ju A002 = AnonymousClass19L.A00(this.A01, 1, r4.A00);
        if (A002 != null) {
            A002.A04(3);
        }
        AnonymousClass1C3 r2 = this.A00;
        DeviceJid of = DeviceJid.of(r4.A02);
        String str = r4.A07;
        if (of == null || TextUtils.isEmpty(str)) {
            return true;
        }
        r2.A0J.Boy(new C35521ip(r2, of, r4, str, 3));
        return true;
    }

    public C29441Wq(AnonymousClass1C3 r1, AnonymousClass19L r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
