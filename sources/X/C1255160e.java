package X;

import com.whatsapp.avatar.init.AvatarStickerPackWorker;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.60e  reason: invalid class name and case insensitive filesystem */
public final class C1255160e {
    public final C21570zS A00;

    public C1255160e(C21570zS r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public final void A00(String str, int i, boolean z) {
        C1271667f r1 = new C1271667f();
        r1.A00 = C023109s.A01;
        C132316Tb A002 = r1.A00();
        AnonymousClass6EH r3 = new AnonymousClass6EH();
        Map map = r3.A00;
        map.put("origin", str);
        r3.A01("origin_type", i);
        map.put("cancel_ongoing", Boolean.valueOf(z));
        AnonymousClass6X2 A003 = r3.A00();
        C97384pE r4 = new C97384pE(AvatarStickerPackWorker.class);
        r4.A03(A002);
        Integer num = C023109s.A00;
        r4.A05(num, TimeUnit.SECONDS, 10);
        r4.A00.A0A = A003;
        C90514aH.A0V(this.A00).A03((C97404pG) r4.A00(), num, "tag.whatsapp.avatar.init.download").A02();
    }
}
