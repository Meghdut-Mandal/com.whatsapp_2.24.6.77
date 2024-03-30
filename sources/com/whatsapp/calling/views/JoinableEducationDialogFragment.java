package com.whatsapp.calling.views;

import X.AnonymousClass001;
import X.AnonymousClass01I;
import X.AnonymousClass3LW;
import X.C010804n;
import X.C18740tg;
import X.C36341k9;
import X.C36391kE;
import X.C36421kH;
import X.C39001qm;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;

public class JoinableEducationDialogFragment extends Hilt_JoinableEducationDialogFragment {
    public boolean A00;

    public static JoinableEducationDialogFragment A03() {
        Bundle A07 = AnonymousClass001.A07();
        A07.putBoolean("bundle_param_voice_call", false);
        JoinableEducationDialogFragment joinableEducationDialogFragment = new JoinableEducationDialogFragment();
        joinableEducationDialogFragment.A17(A07);
        return joinableEducationDialogFragment;
    }

    public Dialog A1a(Bundle bundle) {
        if (!(bundle == null && (bundle = this.A0A) == null)) {
            this.A00 = bundle.getBoolean("bundle_param_voice_call", false);
        }
        AnonymousClass01I A0h = A0h();
        C18740tg.A06(A0h);
        C39001qm A002 = AnonymousClass3LW.A00(A0h);
        View inflate = LayoutInflater.from(A0h).inflate(R.layout.f9nameremoved, (ViewGroup) null, false);
        ImageView A0N = C36391kE.A0N(inflate, R.id.voip_call_joinable_education_dialog_icon);
        if (this.A00) {
            C010804n A003 = C010804n.A00((Resources.Theme) null, C36341k9.A0G(this), R.drawable.vec_ic_voip_joinable_calls_education_stars_voice);
            C18740tg.A06(A003);
            A0N.setImageDrawable(A003);
            C36421kH.A0z(A0N, this, R.string.f12nameremoved);
        }
        A002.setView(inflate);
        A002.setPositiveButton(R.string.f12nameremoved, (DialogInterface.OnClickListener) null);
        return A002.create();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }
}
