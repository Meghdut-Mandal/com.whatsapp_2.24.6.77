package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.mentions.MentionableEntry;
import java.util.Collections;
import java.util.List;

public class A8W implements AnonymousClass4P8 {
    public C176358bz A00;
    public List A01;
    public final Activity A02;
    public final AnonymousClass17Y A03;
    public final AnonymousClass16D A04;
    public final AnonymousClass171 A05;
    public final C20830yE A06;
    public final AnonymousClass1H2 A07;
    public final C21010yW A08;
    public final AnonymousClass11F A09;
    public final C25491Gn A0A;
    public final MentionableEntry A0B;
    public final AnonymousClass1XY A0C;

    public static void A00(A8W a8w, List list) {
        String str;
        C176358bz r1;
        List list2 = list;
        if (list == null || list.isEmpty()) {
            a8w.A03.A06(R.string.f12nameremoved, 0);
            str = "drag_drop_uri_null_or_empty";
        } else if (!a8w.A06.A0D()) {
            Activity activity = a8w.A02;
            int i = Build.VERSION.SDK_INT;
            int i2 = R.string.f12nameremoved;
            if (i >= 30) {
                i2 = R.string.f12nameremoved;
                if (i < 33) {
                    i2 = R.string.f12nameremoved;
                }
            }
            RequestPermissionActivity.A0F(activity, R.string.f12nameremoved, i2, 29);
            a8w.A01 = list;
            str = "missing_storage_permission";
        } else {
            AnonymousClass1XY r12 = a8w.A0C;
            List singletonList = Collections.singletonList(a8w.A09);
            Activity activity2 = a8w.A02;
            r12.A03(activity2, (C225014r) activity2, new A8U(a8w), (AnonymousClass3XT) null, "", singletonList, list2, 9, 17, false, false);
            r1 = a8w.A00;
            r1.A00 = C36371kC.A0m();
            a8w.A08.Bly(r1);
        }
        r1 = a8w.A00;
        r1.A00 = C36381kD.A0j();
        r1.A02 = str;
        a8w.A08.Bly(r1);
    }

    public boolean BQk(Intent intent, int i, int i2) {
        if (i != 29 || i2 != -1) {
            return false;
        }
        A00(this, this.A01);
        return true;
    }

    public A8W(Context context, AnonymousClass17Y r3, AnonymousClass1XY r4, AnonymousClass16D r5, AnonymousClass171 r6, C20830yE r7, AnonymousClass1H2 r8, C21010yW r9, AnonymousClass11F r10, C25491Gn r11, MentionableEntry mentionableEntry) {
        this.A02 = C24801Dv.A00(context);
        this.A0C = r4;
        this.A03 = r3;
        this.A0B = mentionableEntry;
        this.A09 = r10;
        this.A06 = r7;
        this.A0A = r11;
        this.A04 = r5;
        this.A05 = r6;
        this.A07 = r8;
        this.A08 = r9;
    }
}
