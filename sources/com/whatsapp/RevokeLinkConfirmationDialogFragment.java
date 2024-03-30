package com.whatsapp;

import X.AnonymousClass001;
import X.AnonymousClass147;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass1EM;
import X.AnonymousClass3LW;
import X.AnonymousClass4XL;
import X.C36331k8;
import X.C36361kB;
import X.C36371kC;
import X.C39001qm;
import X.C65533Sl;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public final class RevokeLinkConfirmationDialogFragment extends Hilt_RevokeLinkConfirmationDialogFragment {
    public AnonymousClass16D A00;
    public AnonymousClass171 A01;
    public AnonymousClass1EM A02;

    public Dialog A1a(Bundle bundle) {
        String A0o;
        Bundle A0b = A0b();
        boolean z = A0b.getBoolean("from_qr");
        C39001qm A04 = AnonymousClass3LW.A04(this);
        int i = R.string.f12nameremoved;
        if (z) {
            i = R.string.f12nameremoved;
        }
        A04.A0i(AnonymousClass4XL.A00(this, 3), A0n(i));
        A04.A00.A0Q((DialogInterface.OnClickListener) null, A0n(R.string.f12nameremoved));
        if (z) {
            A04.setTitle(A0n(R.string.f12nameremoved));
            A0o = A0n(R.string.f12nameremoved);
        } else {
            C65533Sl r1 = AnonymousClass147.A01;
            String string = A0b.getString("jid");
            if (string != null) {
                AnonymousClass147 A06 = r1.A06(string);
                AnonymousClass1EM r0 = this.A02;
                if (r0 != null) {
                    boolean A062 = r0.A06(A06);
                    int i2 = R.string.f12nameremoved;
                    if (A062) {
                        i2 = R.string.f12nameremoved;
                    }
                    Object[] A0L = AnonymousClass001.A0L();
                    AnonymousClass171 r12 = this.A01;
                    if (r12 != null) {
                        AnonymousClass16D r02 = this.A00;
                        if (r02 == null) {
                            throw C36331k8.A0Z();
                        } else if (A06 != null) {
                            C36361kB.A1F(r12, r02.A0D(A06), A0L, 0);
                            A0o = A0o(i2, A0L);
                        } else {
                            throw AnonymousClass001.A09("Required value was null.");
                        }
                    } else {
                        throw C36331k8.A0c();
                    }
                } else {
                    throw C36331k8.A0d("groupChatUtils");
                }
            } else {
                throw AnonymousClass001.A09("Required value was null.");
            }
        }
        A04.A0Z(A0o);
        return C36371kC.A0O(A04);
    }
}
