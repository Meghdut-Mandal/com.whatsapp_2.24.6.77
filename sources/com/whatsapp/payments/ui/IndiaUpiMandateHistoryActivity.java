package com.whatsapp.payments.ui;

import X.AF7;
import X.AVY;
import X.AnonymousClass07B;
import X.AnonymousClass0D3;
import X.AnonymousClass1DR;
import X.AnonymousClass5Gv;
import X.B2Z;
import X.B7Z;
import X.BA9;
import X.C105795Gm;
import X.C165567td;
import X.C165587tf;
import X.C165607th;
import X.C178878i2;
import X.C179728kb;
import X.C18800tq;
import X.C18830tt;
import X.C203349np;
import X.C24611Dc;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36381kD;
import X.C36411kG;
import X.C36441kJ;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiMandateHistoryViewModel;

public class IndiaUpiMandateHistoryActivity extends C178878i2 {
    public AnonymousClass1DR A00;
    public AF7 A01;
    public IndiaUpiMandateHistoryViewModel A02;
    public B2Z A03;
    public boolean A04;
    public final C24611Dc A05;

    public void A2F() {
        if (!this.A04) {
            this.A04 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C165567td.A11(A0B, this);
            C18830tt r1 = A0B.A00;
            C165567td.A0v(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A01 = C165587tf.A0V(A0B);
            this.A00 = (AnonymousClass1DR) A0B.A6G.get();
        }
    }

    public AnonymousClass0D3 A3i(ViewGroup viewGroup, int i) {
        if (i == 1002) {
            View A0E = C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved);
            A0E.setBackgroundColor(C36341k9.A0F(A0E).getColor(C36411kG.A01(A0E.getContext())));
            return new C105795Gm(A0E);
        } else if (i == 1003) {
            return new AnonymousClass5Gv(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved));
        } else {
            if (i != 1007) {
                return super.A3i(viewGroup, i);
            }
            return new C179728kb(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved));
        }
    }

    public void onDestroy() {
        this.A00.unregisterObserver(this.A03);
        super.onDestroy();
    }

    public IndiaUpiMandateHistoryActivity(int i) {
        this.A04 = false;
        B7Z.A00(this, 17);
    }

    public void onBackPressed() {
        super.onBackPressed();
        this.A02.A05.BOn(1, 1, "mandate_payment_screen", "payment_home", true);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            C165607th.A16(this, supportActionBar, R.string.f12nameremoved);
        }
        this.A05.A06("onCreate");
        IndiaUpiMandateHistoryViewModel indiaUpiMandateHistoryViewModel = (IndiaUpiMandateHistoryViewModel) C36441kJ.A0b(this).A00(IndiaUpiMandateHistoryViewModel.class);
        this.A02 = indiaUpiMandateHistoryViewModel;
        AVY.A00(indiaUpiMandateHistoryViewModel.A06, indiaUpiMandateHistoryViewModel, 48);
        indiaUpiMandateHistoryViewModel.A05.BOn(C36381kD.A0m(), (Integer) null, "mandate_payment_screen", "payment_home", true);
        IndiaUpiMandateHistoryViewModel indiaUpiMandateHistoryViewModel2 = this.A02;
        indiaUpiMandateHistoryViewModel2.A00.A08(this, new BA9(this, 23));
        IndiaUpiMandateHistoryViewModel indiaUpiMandateHistoryViewModel3 = this.A02;
        indiaUpiMandateHistoryViewModel3.A02.A08(this, new BA9(this, 22));
        C203349np r1 = new C203349np(this, 2);
        this.A03 = r1;
        this.A00.registerObserver(r1);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            this.A02.A05.BOn(1, 1, "mandate_payment_screen", "payment_home", true);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public IndiaUpiMandateHistoryActivity() {
        this(0);
        this.A05 = C24611Dc.A00("IndiaUpiMandateHistoryActivity", "mandates", "IN");
    }
}
