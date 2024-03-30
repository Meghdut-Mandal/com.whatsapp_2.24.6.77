package com.whatsapp.extensions.phoenix.view;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass099;
import X.AnonymousClass0FL;
import X.AnonymousClass3T1;
import X.AnonymousClass3Y2;
import X.AnonymousClass4GC;
import X.C000800j;
import X.C001400p;
import X.C131376Ou;
import X.C20380xT;
import X.C20810yC;
import X.C24801Dv;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36371kC;
import X.C36391kE;
import android.app.Dialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

public final class PhoenixFlowsBottomSheetContainer extends Hilt_PhoenixFlowsBottomSheetContainer {
    public C24801Dv A00;
    public FlowsInitialLoadingView A01;
    public C20810yC A02;
    public C20380xT A03;
    public ViewGroup A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public final AnonymousClass00T A08 = C001400p.A00(C000800j.NONE, new AnonymousClass4GC(this));

    public void A1S(Bundle bundle, View view) {
        KeyEvent.Callback callback;
        FlowsInitialLoadingView flowsInitialLoadingView;
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        Dialog dialog = this.A02;
        ViewGroup viewGroup = null;
        if (!(dialog instanceof AnonymousClass0FL) || dialog == null) {
            callback = null;
        } else {
            callback = dialog.findViewById(R.id.design_bottom_sheet);
        }
        if (callback instanceof ViewGroup) {
            viewGroup = (ViewGroup) callback;
        }
        this.A04 = viewGroup;
        UserJid userJid = (UserJid) this.A08.getValue();
        String str = this.A05;
        if (!(userJid == null || str == null || (flowsInitialLoadingView = this.A01) == null)) {
            flowsInitialLoadingView.A02(userJid, str, true);
        }
        Toolbar toolbar = this.A03;
        if (toolbar != null) {
            toolbar.setNavigationOnClickListener(new AnonymousClass3Y2(this, 2));
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass00C.A0D(dialogInterface, 0);
        A0i().finish();
        String string = A0b().getString("fds_observer_id");
        if (string != null) {
            C131376Ou r2 = this.A0C;
            if (r2 != null) {
                synchronized (r2) {
                    C131376Ou.A01.put(string, C36371kC.A0m());
                }
            } else {
                throw C36331k8.A0d("uiObserversFactory");
            }
        }
        super.onDismiss(dialogInterface);
    }

    public void A1J() {
        super.A1J();
        this.A01 = null;
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        C20810yC r1 = this.A02;
        if (r1 != null) {
            this.A05 = r1.A09(2069);
            C20810yC r12 = this.A02;
            if (r12 != null) {
                boolean z = false;
                if (r12.A0E(4393)) {
                    C20810yC r13 = this.A02;
                    if (r13 != null) {
                        String A09 = r13.A09(3063);
                        if (A09 != null && AnonymousClass099.A0O(A09, "extensions_help", false)) {
                            z = true;
                        }
                    } else {
                        throw C36321k7.A07();
                    }
                }
                this.A06 = z;
                return;
            }
            throw C36321k7.A07();
        }
        throw C36321k7.A07();
    }

    public void A1U(Menu menu, MenuInflater menuInflater) {
        boolean A1a = C36341k9.A1a(menu, menuInflater);
        super.A1U(menu, menuInflater);
        if (!this.A07) {
            boolean z = this.A06;
            int i = R.string.f12nameremoved;
            if (z) {
                i = R.string.f12nameremoved;
            }
            C36391kE.A1F(menu, -1, i);
            this.A07 = A1a;
        }
    }

    public boolean A1X(MenuItem menuItem) {
        Uri A022;
        if (C36341k9.A06(menuItem) != -1) {
            return super.A1X(menuItem);
        }
        String str = this.A05;
        if (str == null) {
            return true;
        }
        if (this.A06) {
            A022 = Uri.parse("whatsapp://help/extensions_help");
        } else {
            C20380xT r0 = this.A03;
            if (r0 != null) {
                A022 = r0.A02(str);
            } else {
                throw C36331k8.A0d("faqLinkFactory");
            }
        }
        C24801Dv r2 = this.A00;
        if (r2 != null) {
            r2.Bp7(A0a(), A022, (AnonymousClass3T1) null);
            return true;
        }
        throw C36331k8.A0d("activityUtils");
    }
}
