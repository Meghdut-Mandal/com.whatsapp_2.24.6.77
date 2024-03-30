package X;

import android.os.Bundle;
import com.whatsapp.biz.education.VerifiedBusinessEducationBottomSheet;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2r8  reason: invalid class name and case insensitive filesystem */
public abstract class C53322r8 {
    public static final VerifiedBusinessEducationBottomSheet A00(UserJid userJid) {
        AnonymousClass00C.A0D(userJid, 0);
        VerifiedBusinessEducationBottomSheet verifiedBusinessEducationBottomSheet = new VerifiedBusinessEducationBottomSheet();
        Bundle A07 = AnonymousClass001.A07();
        A07.putString("biz_owner_jid", userJid.getRawString());
        verifiedBusinessEducationBottomSheet.A17(A07);
        return verifiedBusinessEducationBottomSheet;
    }
}
