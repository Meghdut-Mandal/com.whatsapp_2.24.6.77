package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass00C;
import X.AnonymousClass09Y;
import X.C012005e;
import X.C36341k9;
import X.C36351kA;
import X.C36391kE;
import X.C36411kG;
import X.C48732hx;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.whatsapp.R;

public final class ConfirmEncryptionKeyFragment extends Hilt_ConfirmEncryptionKeyFragment {
    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        AnonymousClass09Y A0S = C36411kG.A0S(this);
        A0S.A0B(new EncryptionKeyFragment(), R.id.encryption_key_confirm_encryption_key_container);
        A0S.A01();
        this.A00 = (RelativeLayout) C012005e.A02(view, R.id.enc_key_background);
        TextView A0O = C36391kE.A0O(view, R.id.encryption_key_confirm_title);
        C36351kA.A16(C36341k9.A0G(this), A0O, new Object[]{64}, R.plurals.f10nameremoved, 64);
        TextView A0O2 = C36391kE.A0O(view, R.id.encryption_key_confirm_button_confirm);
        C36351kA.A16(A0O2.getResources(), A0O2, new Object[]{64}, R.plurals.f10nameremoved, 64);
        C48732hx.A00(A0O2, this, 7);
        C48732hx.A00(C012005e.A02(view, R.id.encryption_key_confirm_button_cancel), this, 8);
        this.A00.setOnCreateContextMenuListener(this);
    }
}
