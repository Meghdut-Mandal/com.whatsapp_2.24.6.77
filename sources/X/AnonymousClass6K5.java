package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.6K5  reason: invalid class name */
public final class AnonymousClass6K5 {
    public static final List A02 = C90494aF.A0j(new String[]{"com.facebook.wakizashi", "com.facebook.katana", "com.facebook.lite", "com.facebook.orca", "com.instagram.android"});
    public static final List A03 = C90494aF.A0j(new String[]{"facebook", "fb", "fblite", "fb-messenger", "instagram"});
    public static final Map A04;
    public final C19930wk A00;
    public final C21030yY A01;

    static {
        AnonymousClass011[] r3 = new AnonymousClass011[10];
        C108175Sl r0 = C108175Sl.FACEBOOK;
        C90464aC.A1E("facebook", r0, r3);
        C90464aC.A1F("fb", r0, r3);
        C90474aD.A1F("com.facebook.wakizashi", r0, r3);
        C90474aD.A1G("com.facebook.katana", r0, r3);
        C108175Sl r02 = C108175Sl.FBLITE;
        C90484aE.A1H("fblite", r02, r3);
        r3[5] = C36441kJ.A19("com.facebook.lite", r02);
        C108175Sl r2 = C108175Sl.MESSENGER;
        r3[6] = C36441kJ.A19("fb-messenger", r2);
        r3[7] = C36441kJ.A19("com.facebook.orca", r2);
        C108175Sl r22 = C108175Sl.INSTAGRAM;
        r3[8] = C36441kJ.A19("instagram", r22);
        r3[9] = C36441kJ.A19("com.instagram.android", r22);
        A04 = C000400e.A07(r3);
    }

    public AnonymousClass6K5(C19770wU r2, C21030yY r3) {
        C36321k7.A0x(r2, r3);
        this.A01 = r3;
        this.A00 = C36411kG.A0r(r2);
    }
}
