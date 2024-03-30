package X;

import android.content.Intent;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.3tO  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C79233tO implements AnonymousClass4SG {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Intent A01;
    public final /* synthetic */ AnonymousClass28e A02;

    public /* synthetic */ C79233tO(Intent intent, AnonymousClass28e r2, int i) {
        this.A02 = r2;
        this.A01 = intent;
        this.A00 = i;
    }

    public final void BXw(File file) {
        C25471Gl r7;
        AnonymousClass28e r2 = this.A02;
        Intent intent = this.A01;
        int i = this.A00;
        try {
            AnonymousClass1XY r4 = r2.A0A;
            AnonymousClass11F r5 = r2.A0K;
            if (r5 instanceof C28981Uw) {
                r7 = C25471Gl.A0Q;
            } else {
                r7 = C25471Gl.A05;
            }
            boolean booleanExtra = intent.getBooleanExtra("has_preview", true);
            AnonymousClass4UO r1 = r2.A0F;
            r4.A0F.Boy(new C80783vx(r4, r5, r1.getQuotedMessage(), r7, file, i, booleanExtra, r2.A0Q));
            r1.B1Z(6);
        } catch (IOException e) {
            r2.A07.A06(R.string.f12nameremoved, 0);
            Log.e((Throwable) e);
        }
    }
}
