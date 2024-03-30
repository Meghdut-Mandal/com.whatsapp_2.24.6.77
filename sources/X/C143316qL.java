package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/* renamed from: X.6qL  reason: invalid class name and case insensitive filesystem */
public final class C143316qL implements C158067fk {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass63O A02;
    public final /* synthetic */ AnonymousClass6VK A03;

    public C143316qL(Activity activity, Context context, AnonymousClass63O r3, AnonymousClass6VK r4) {
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = context;
        this.A00 = activity;
    }

    public final void BfK(boolean z) {
        if (!z) {
            this.A02.A00(C023109s.A01);
            return;
        }
        AnonymousClass6VK r7 = this.A03;
        StringBuilder A0u = AnonymousClass000.A0u();
        C36351kA.A1K(UUID.randomUUID(), A0u);
        File A0X = ((C20690y0) r7.A0P.get()).A0X(AnonymousClass000.A0q(".jpg", A0u));
        Context context = this.A01;
        AnonymousClass63O r5 = this.A02;
        Activity activity = this.A00;
        try {
            Uri A012 = AnonymousClass6YY.A01(context, A0X);
            Intent A0I = C36441kJ.A0I("android.media.action.IMAGE_CAPTURE");
            A0I.putExtra("output", A012);
            C119145pJ r3 = new C119145pJ(r5, A0X);
            if (!(activity instanceof AnonymousClass155)) {
                AnonymousClass63O r2 = r3.A00;
                File file = r3.A01;
                r2.A00(C023109s.A0G);
                file.delete();
                return;
            }
            AnonymousClass155 r4 = (AnonymousClass155) activity;
            r4.A3Z(new C164147rL(r4, r3, r7, 1));
            r4.startActivityForResult(A0I, 1);
        } catch (IOException unused) {
            r5.A00(C023109s.A0G);
            A0X.delete();
        }
    }
}
