package X;

import android.os.Bundle;
import com.whatsapp.RevokeLinkConfirmationDialogFragment;

/* renamed from: X.2qo  reason: invalid class name and case insensitive filesystem */
public abstract class C53122qo {
    public static final RevokeLinkConfirmationDialogFragment A00(AnonymousClass147 r3, boolean z) {
        AnonymousClass00C.A0D(r3, 0);
        RevokeLinkConfirmationDialogFragment revokeLinkConfirmationDialogFragment = new RevokeLinkConfirmationDialogFragment();
        Bundle A07 = C36331k8.A07(r3);
        A07.putBoolean("from_qr", z);
        revokeLinkConfirmationDialogFragment.A17(A07);
        return revokeLinkConfirmationDialogFragment;
    }
}
