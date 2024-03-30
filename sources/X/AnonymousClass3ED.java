package X;

import android.database.SQLException;
import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.3ED  reason: invalid class name */
public final class AnonymousClass3ED {
    public final C19730wQ A00;
    public final AnonymousClass1X4 A01;
    public final AnonymousClass196 A02;
    public final C588531h A03;

    public final void A00(String str) {
        Set A0C;
        AnonymousClass1M0 A05;
        String str2 = str;
        AnonymousClass00C.A0D(str, 0);
        AnonymousClass196 r3 = this.A02;
        AnonymousClass2FQ r0 = (AnonymousClass2FQ) r3.A0T.A00("setting_pushName");
        if (r0 == null) {
            A0C = Collections.emptySet();
        } else {
            A0C = r3.A0C(Collections.singletonList(new AnonymousClass2Lh((C201539jo) null, (String) null, str2, C19970wo.A00(r0.A01))));
        }
        AnonymousClass00C.A08(A0C);
        this.A00.A0J(str);
        try {
            A05 = this.A03.A00.A05();
            AnonymousClass14m.A03(A05.A02, "user_push_name", str, C588531h.class.getName());
            A05.close();
        } catch (SQLException e) {
            Log.e("UserSettingsStore/updatePushName/Error updating push name", e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        r3.A0Q(A0C);
        this.A01.A0x.A0J(Message.obtain((Handler) null, 0, 3, 0, str));
        return;
        throw th;
    }

    public AnonymousClass3ED(C19730wQ r1, AnonymousClass1X4 r2, AnonymousClass196 r3, C588531h r4) {
        C36321k7.A11(r1, r3, r2);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
    }
}
