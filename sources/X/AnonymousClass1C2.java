package X;

import com.whatsapp.stickers.avatars.AvatarStickerOnDemandInstaller$installAvatarStickerSync$1;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1C2  reason: invalid class name */
public final class AnonymousClass1C2 {
    public final C24041Av A00;
    public final C24241Br A01;
    public final C23871Ae A02;
    public final C24221Bp A03;
    public final C23991Aq A04;
    public final C005502l A05;

    public AnonymousClass1C2(C24041Av r2, C24241Br r3, C23871Ae r4, C24221Bp r5, C23991Aq r6, C005502l r7) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r6, 2);
        AnonymousClass00C.A0D(r2, 4);
        AnonymousClass00C.A0D(r5, 5);
        AnonymousClass00C.A0D(r7, 6);
        this.A02 = r4;
        this.A04 = r6;
        this.A01 = r3;
        this.A00 = r2;
        this.A03 = r5;
        this.A05 = r7;
    }

    public final C135066c4 A01(C135066c4 r4) {
        AnonymousClass00C.A0D(r4, 0);
        return (C135066c4) C110515an.A00(this.A05, new AvatarStickerOnDemandInstaller$installAvatarStickerSync$1(r4, this, (C023509x) null));
    }

    public static final void A00(C135066c4 r5, AnonymousClass1C2 r6) {
        String str = r5.A06;
        if (str != null) {
            C24221Bp r4 = r6.A03;
            File A002 = r4.A00(new AnonymousClass690(str), r5.A0O);
            if (AnonymousClass00C.A0J(A002.getAbsolutePath(), r5.A0A) && A002.exists()) {
                File file = new File(r5.A0A);
                String str2 = r5.A0E;
                if (str2 != null) {
                    File A042 = r4.A01.A04(str2, r5.A0D);
                    r4.A00.A0f(file, A042);
                    r5.A0A = A042.getAbsolutePath();
                }
                if (!r5.A0K) {
                    C23991Aq r1 = r6.A04;
                    List singletonList = Collections.singletonList(r5);
                    AnonymousClass00C.A08(singletonList);
                    r1.A03(singletonList);
                }
            }
        }
    }
}
