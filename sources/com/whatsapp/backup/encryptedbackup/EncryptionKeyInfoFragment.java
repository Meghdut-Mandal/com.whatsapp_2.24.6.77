package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass00C;
import X.AnonymousClass09Y;
import X.C012005e;
import X.C36341k9;
import X.C36351kA;
import X.C36391kE;
import X.C36411kG;
import X.C36441kJ;
import X.C48732hx;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.whatsapp.R;

public final class EncryptionKeyInfoFragment extends Hilt_EncryptionKeyInfoFragment {
    public Button A00;
    public Button A01;
    public FrameLayout A02;
    public TextView A03;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        AnonymousClass09Y A0S = C36411kG.A0S(this);
        A0S.A0B(new EncryptionKeyFragment(), R.id.encryption_key_info_encryption_key_container);
        A0S.A01();
        this.A00 = (RelativeLayout) C012005e.A02(view, R.id.enc_key_background);
        FrameLayout A0T = C36441kJ.A0T(view, R.id.encryption_key_info_encryption_key_container);
        A0T.setVisibility(4);
        this.A02 = A0T;
        Button button = (Button) C012005e.A02(view, R.id.encryption_key_info_middle_button);
        C36351kA.A16(C36341k9.A0G(this), button, new Object[]{64}, R.plurals.f10nameremoved, 64);
        C48732hx.A00(button, this, 17);
        this.A01 = button;
        Button button2 = (Button) C012005e.A02(view, R.id.encryption_key_info_bottom_button);
        C36351kA.A16(C36341k9.A0G(this), button2, new Object[]{64}, R.plurals.f10nameremoved, 64);
        C48732hx.A00(button2, this, 18);
        this.A00 = button2;
        this.A03 = C36391kE.A0O(view, R.id.encryption_key_info_info);
    }
}
