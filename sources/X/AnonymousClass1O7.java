package X;

import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.1O7  reason: invalid class name */
public class AnonymousClass1O7 {
    public final AnonymousClass17Y A00;
    public final AnonymousClass16D A01;
    public final AnonymousClass16I A02;
    public final AnonymousClass16K A03;
    public final C20310xM A04;
    public final C24541Cv A05;
    public final AnonymousClass1AQ A06;
    public final C19460v5 A07;
    public final C26861Lu A08;
    public final C19730wQ A09;
    public final C19900wh A0A;

    public void A00(AnonymousClass141 r3, int i, int i2) {
        boolean A0M = this.A09.A0M(r3.A0H);
        r3.A05 = i;
        r3.A06 = i2;
        if (A0M) {
            this.A0A.A01.edit().putInt("profile_photo_full_id", i).putInt("profile_photo_thumb_id", i2).apply();
            return;
        }
        r3.A0C = System.currentTimeMillis();
        this.A01.A0T(r3);
    }

    public void A01(AnonymousClass141 r3, byte[] bArr, byte[] bArr2) {
        try {
            AnonymousClass16K r1 = this.A03;
            r1.A05(r3, bArr, true);
            r1.A05(r3, bArr2, false);
        } catch (IOException e) {
            Log.e("ContactPhotoUpdater/updatePhotoFiles", e);
        }
    }

    public void A02(AnonymousClass11F r4) {
        this.A08.A01(new C35681j5(this, r4, 0));
    }

    public void A03(C124245xp r4) {
        this.A08.A01(new C35681j5(this, r4, 1));
    }

    public AnonymousClass1O7(C19460v5 r1, C26861Lu r2, AnonymousClass17Y r3, C19730wQ r4, AnonymousClass16D r5, AnonymousClass16I r6, AnonymousClass16K r7, C19900wh r8, C20310xM r9, C24541Cv r10, AnonymousClass1AQ r11) {
        this.A00 = r3;
        this.A09 = r4;
        this.A01 = r5;
        this.A08 = r2;
        this.A02 = r6;
        this.A06 = r11;
        this.A05 = r10;
        this.A07 = r1;
        this.A03 = r7;
        this.A04 = r9;
        this.A0A = r8;
    }
}
