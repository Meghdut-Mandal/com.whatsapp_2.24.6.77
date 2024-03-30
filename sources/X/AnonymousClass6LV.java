package X;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;

/* renamed from: X.6LV  reason: invalid class name */
public final class AnonymousClass6LV {
    public final AnonymousClass17Y A00;
    public final C19970wo A01;
    public final C20810yC A02;
    public final AnonymousClass1D0 A03;
    public final C25541Gs A04;
    public final C19770wU A05;
    public final AnonymousClass190 A06;

    public static final void A00(C009804d r8, AnonymousClass6LV r9, String str, C006302t r11) {
        Object[] objArr;
        C006302t r7 = r11;
        AnonymousClass00C.A0D(r11, 2);
        if (r8 != null) {
            Intent intent = r8.A01;
            if (r8.A00 == -1 && intent != null) {
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                if (parcelableArrayListExtra == null || (objArr = parcelableArrayListExtra.toArray(new Uri[0])) == null) {
                    objArr = new Uri[]{intent.getData()};
                }
                objArr.toString();
                r9.A05.Boy(new C1503574y(objArr, r9, r7, str, 14));
            }
        }
    }

    public AnonymousClass6LV(AnonymousClass17Y r1, C19970wo r2, C20810yC r3, AnonymousClass190 r4, AnonymousClass1D0 r5, C25541Gs r6, C19770wU r7) {
        C36321k7.A1B(r4, r7, r2, r6, r5);
        C36321k7.A10(r1, r3);
        this.A06 = r4;
        this.A05 = r7;
        this.A01 = r2;
        this.A04 = r6;
        this.A03 = r5;
        this.A00 = r1;
        this.A02 = r3;
    }
}
