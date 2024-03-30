package X;

import android.os.Bundle;
import com.whatsapp.SuspiciousLinkWarningDialogFragment;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2qr  reason: invalid class name and case insensitive filesystem */
public abstract class C53152qr {
    public static final SuspiciousLinkWarningDialogFragment A00(String str, String str2, Set set) {
        AnonymousClass00C.A0D(str, 0);
        C36321k7.A0x(set, str2);
        SuspiciousLinkWarningDialogFragment suspiciousLinkWarningDialogFragment = new SuspiciousLinkWarningDialogFragment();
        Bundle A0I = C36431kI.A0I("url", str);
        A0I.putSerializable("message_key_id", str2);
        A0I.putSerializable("phishingChars", new HashSet(set));
        suspiciousLinkWarningDialogFragment.A17(A0I);
        return suspiciousLinkWarningDialogFragment;
    }
}
