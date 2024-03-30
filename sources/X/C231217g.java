package X;

import com.whatsapp.util.Log;

/* renamed from: X.17g  reason: invalid class name and case insensitive filesystem */
public final class C231217g implements C231017e {
    public final C220412q A00;

    public C231217g(C220412q r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public AnonymousClass11F BQG(AnonymousClass11F r4) {
        AnonymousClass11F r2;
        C65073Qp A09 = this.A00.A09(r4, false);
        if (A09 == null || (r2 = A09.A06()) == null) {
            r2 = r4;
        }
        if (!AnonymousClass00C.A0J(r2, r4)) {
            StringBuilder sb = new StringBuilder();
            sb.append("MatChatJidNormalizer/normalizeChatJid originalJid=");
            sb.append(r4);
            sb.append(" normalizedJid=");
            sb.append(r2);
            Log.i(sb.toString());
        }
        return r2;
    }
}
