package com.whatsapp.dialogs;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass17Y;
import X.AnonymousClass1N3;
import X.AnonymousClass3LW;
import X.AnonymousClass3Y0;
import X.AnonymousClass6YV;
import X.C20810yC;
import X.C21060yb;
import X.C24801Dv;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C39001qm;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.HashMap;

public final class UnrecoverableErrorDialogFragment extends Hilt_UnrecoverableErrorDialogFragment {
    public static final String A04;
    public C24801Dv A00;
    public AnonymousClass17Y A01;
    public AnonymousClass1N3 A02;
    public C21060yb A03;

    public Dialog A1a(Bundle bundle) {
        View A0E = C36361kB.A0E(LayoutInflater.from(A0a()), (ViewGroup) null, R.layout.f9nameremoved);
        HashMap A0J = AnonymousClass001.A0J();
        AnonymousClass1N3 r3 = this.A02;
        if (r3 != null) {
            Uri A002 = r3.A00("https://faq.whatsapp.com/807139050546238/");
            AnonymousClass00C.A08(A002);
            A0J.put("uninstall-whatsapp", A002);
            TextEmojiLabel A0O = C36351kA.A0O(A0E, R.id.dialog_message_uninstall_wa);
            TextEmojiLabel A0O2 = C36351kA.A0O(A0E, R.id.dialog_message_install_wa);
            AnonymousClass1N3 r0 = this.A02;
            if (r0 != null) {
                String str = A04;
                Uri A003 = r0.A00(str);
                AnonymousClass00C.A08(A003);
                A0J.put("install-whatsapp-playstore", A003);
                AnonymousClass1N3 r4 = this.A02;
                if (r4 != null) {
                    Uri A004 = r4.A00("https://whatsapp.com/android/");
                    AnonymousClass00C.A08(A004);
                    A0J.put("install-whatsapp-website", A004);
                    Context context = A0E.getContext();
                    C20810yC r10 = this.A02;
                    AnonymousClass17Y r7 = this.A01;
                    if (r7 != null) {
                        C24801Dv r6 = this.A00;
                        if (r6 != null) {
                            C21060yb r9 = this.A03;
                            if (r9 != null) {
                                AnonymousClass6YV.A0G(context, r6, r7, A0O, r9, r10, A0E.getContext().getString(R.string.f12nameremoved), A0J);
                                Context context2 = A0E.getContext();
                                C20810yC r5 = this.A02;
                                AnonymousClass17Y r15 = this.A01;
                                if (r15 != null) {
                                    C24801Dv r14 = this.A00;
                                    if (r14 != null) {
                                        C21060yb r42 = this.A03;
                                        if (r42 != null) {
                                            boolean z = false;
                                            try {
                                                PackageManager packageManager = A0a().getPackageManager();
                                                packageManager.getPackageInfo("com.android.vending", 0);
                                                if (C36331k8.A04(str).resolveActivity(packageManager) != null) {
                                                    z = true;
                                                }
                                            } catch (PackageManager.NameNotFoundException unused) {
                                            }
                                            Context context3 = A0E.getContext();
                                            int i = R.string.f12nameremoved;
                                            if (z) {
                                                i = R.string.f12nameremoved;
                                            }
                                            AnonymousClass6YV.A0G(context2, r14, r15, A0O2, r42, r5, context3.getString(i), A0J);
                                            AnonymousClass3Y0.A01(C36361kB.A0G(A0E, R.id.ok_button), this, 16);
                                            C39001qm A05 = AnonymousClass3LW.A05(this);
                                            A05.A0j(A0E);
                                            return C36371kC.A0O(A05);
                                        }
                                        throw C36331k8.A0W();
                                    }
                                    throw C36331k8.A0d("activityUtils");
                                }
                                throw C36321k7.A06();
                            }
                            throw C36331k8.A0W();
                        }
                        throw C36331k8.A0d("activityUtils");
                    }
                    throw C36321k7.A06();
                }
                throw C36331k8.A0d("waLinkFactory");
            }
            throw C36331k8.A0d("waLinkFactory");
        }
        throw C36331k8.A0d("waLinkFactory");
    }

    static {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("market://details?id=");
        A04 = AnonymousClass000.A0q("com.whatsapp", A0u);
    }
}
