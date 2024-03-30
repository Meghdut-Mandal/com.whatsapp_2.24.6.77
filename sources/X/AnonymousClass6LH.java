package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.6LH  reason: invalid class name */
public class AnonymousClass6LH {
    public C24801Dv A00;
    public AnonymousClass17Y A01;
    public C21060yb A02;
    public C20810yC A03;
    public C19700wN A04;
    public C20380xT A05;

    public static void A00(Context context, TextEmojiLabel textEmojiLabel, AnonymousClass6LH r11, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            C19700wN r3 = r11.A04;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("groupname=");
            A0u.append(str2);
            r3.A0E("BusinessDirectoryFaqLinkHelper/addDirectoryGeneralFaqLink/group name or article name are null or empty", AnonymousClass000.A0p(", articleName=", str3, A0u), true);
            return;
        }
        Uri A042 = r11.A05.A04(str2, str3);
        C20810yC r6 = r11.A03;
        Context context2 = context;
        AnonymousClass6YV.A0E(context2, A042, r11.A00, r11.A01, textEmojiLabel, r11.A02, r6, str, "learn-more");
    }

    public AnonymousClass6LH(C24801Dv r1, C19700wN r2, AnonymousClass17Y r3, C21060yb r4, C20810yC r5, C20380xT r6) {
        this.A03 = r5;
        this.A01 = r3;
        this.A04 = r2;
        this.A05 = r6;
        this.A00 = r1;
        this.A02 = r4;
    }
}
