package X;

import android.content.Intent;
import com.whatsapp.wabloks.ui.WaBloksActivity;
import java.util.ArrayList;

/* renamed from: X.3cj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C68953cj implements AnonymousClass4P8 {
    public final /* synthetic */ AnonymousClass6VK A00;
    public final /* synthetic */ WaBloksActivity A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ C68953cj(AnonymousClass6VK r1, WaBloksActivity waBloksActivity, String str) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = waBloksActivity;
    }

    public final boolean BQk(Intent intent, int i, int i2) {
        AnonymousClass6VK r5 = this.A00;
        String str = this.A02;
        WaBloksActivity waBloksActivity = this.A01;
        if (i2 != -1 || i != 1) {
            return false;
        }
        ArrayList A0k = C36341k9.A0k(intent);
        if (A0k.isEmpty()) {
            return true;
        }
        ((C89034Uz) r5.A0V.get()).BoO(new C77903rF(r5, waBloksActivity, str, A0k), str);
        return true;
    }
}
