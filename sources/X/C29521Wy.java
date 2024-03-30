package X;

import android.os.Message;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.1Wy  reason: invalid class name and case insensitive filesystem */
public final class C29521Wy implements C236319f {
    public final AnonymousClass19A A00;
    public final C29531Wz A01;

    public C29521Wy(C29531Wz r2, AnonymousClass19A r3) {
        AnonymousClass00C.A0D(r3, 1);
        this.A00 = r3;
        this.A01 = r2;
    }

    public int[] BCF() {
        return new int[]{254};
    }

    public boolean BJl(Message message, int i) {
        AnonymousClass00C.A0D(message, 1);
        if (i != 254) {
            return false;
        }
        Object obj = message.obj;
        AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type kotlin.String");
        C29531Wz r2 = this.A01;
        AnonymousClass00C.A0D(obj, 0);
        r2.A01.A00("GPIA_DURATION");
        JniBridge.jvidispatchIOOOO(2, obj, r2.A00.A00, new C20969A1f(r2, this), ((JniBridge) r2.A02).wajContext.get());
        return true;
    }
}
