package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass04R;
import X.C012005e;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C48812i6;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.base.WaFragment;

public class EnableEducationFragment extends WaFragment {
    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    public void A1S(Bundle bundle, View view) {
        super.A1Q(bundle);
        AnonymousClass04R A0A = C36331k8.A0A(this);
        TextView A0O = C36391kE.A0O(view, R.id.enable_education_use_encryption_key_button);
        Resources A0G = C36341k9.A0G(this);
        Object[] A0L = AnonymousClass001.A0L();
        AnonymousClass000.A1J(A0L, 64);
        C36351kA.A16(A0G, A0O, A0L, R.plurals.f10nameremoved, 64);
        C48812i6.A00(A0O, A0A, this, 3);
        C48812i6.A00(C012005e.A02(view, R.id.enable_education_create_password_button), A0A, this, 4);
    }
}
