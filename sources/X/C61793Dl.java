package X;

import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: X.3Dl  reason: invalid class name and case insensitive filesystem */
public class C61793Dl {
    public final C33751fs A00;
    public final AnonymousClass3DY A01;
    public final AnonymousClass1CF A02;

    public C61793Dl(AnonymousClass3DY r1, C33751fs r2, AnonymousClass1CF r3) {
        this.A01 = r1;
        this.A02 = r3;
        this.A00 = r2;
    }

    public void A00(C225314u r12, AnonymousClass147 r13) {
        Bundle A07 = AnonymousClass001.A07();
        A07.putParcelable("com.whatsapp.support.DescribeProblemActivity.suspendedEntityJid", r13);
        r12.startActivity(this.A01.A01(r12, A07, (AnonymousClass3XH) null, (Integer) null, "group-suspend-appeal", (String) null, (ArrayList) null, (ArrayList) null, this.A02.A00()));
    }
}
