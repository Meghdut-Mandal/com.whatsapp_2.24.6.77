package com.whatsapp.softenforcementsmb;

import X.AnonymousClass001;
import X.AnonymousClass2S0;
import X.C012005e;
import X.C16550pQ;
import X.C19970wo;
import X.C31871cW;
import X.C36361kB;
import X.C36371kC;
import X.C53212qx;
import X.C90124Ze;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.RoundedBottomSheetDialogFragment;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class SMBSoftEnforcementEducationFragment extends RoundedBottomSheetDialogFragment implements C16550pQ {
    public static final Map A06 = new C53212qx(2);
    public View A00;
    public ScrollView A01;
    public Integer A02 = C36371kC.A0n();
    public final Context A03;
    public final C31871cW A04;
    public final C19970wo A05;

    public void onDismiss(DialogInterface dialogInterface) {
        TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - 0);
        new AnonymousClass2S0();
        throw AnonymousClass001.A0A("source");
    }

    public SMBSoftEnforcementEducationFragment(Context context, C19970wo r3, C31871cW r4) {
        this.A03 = context;
        this.A04 = r4;
        this.A05 = r3;
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0E = C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
        A0E.findViewById(R.id.smb_soft_enforcement_education_intro);
        this.A01 = (ScrollView) C012005e.A02(A0E, R.id.smb_soft_enforcement_warning_scroller);
        this.A00 = C012005e.A02(A0E, R.id.smb_soft_enforcement_accept_button_container);
        throw AnonymousClass001.A0A(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ScrollView scrollView = this.A01;
        scrollView.getViewTreeObserver().addOnGlobalLayoutListener(new C90124Ze(this.A00, scrollView, this, 5));
    }
}
