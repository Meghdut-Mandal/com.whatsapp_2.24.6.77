package com.whatsapp.biz.compliance.view;

import X.AnonymousClass07B;
import X.AnonymousClass155;
import X.BA7;
import X.C001700s;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36391kE;
import X.C36431kI;
import X.C36441kJ;
import X.C48732hx;
import X.C55492ui;
import X.C89314Wb;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.biz.compliance.viewmodel.BusinessComplianceViewModel;

public class BusinessComplianceDetailActivity extends AnonymousClass155 {
    public LinearLayout A00;
    public ProgressBar A01;
    public CardView A02;
    public RecyclerView A03;
    public BusinessComplianceViewModel A04;
    public boolean A05;

    public void A2F() {
        if (!this.A05) {
            this.A05 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
        }
    }

    public BusinessComplianceDetailActivity(int i) {
        this.A05 = false;
        C89314Wb.A00(this, 22);
    }

    public static void A01(BusinessComplianceDetailActivity businessComplianceDetailActivity) {
        if (C36431kI.A1R(businessComplianceDetailActivity)) {
            BusinessComplianceViewModel businessComplianceViewModel = businessComplianceDetailActivity.A04;
            Parcelable parcelableExtra = businessComplianceDetailActivity.getIntent().getParcelableExtra("EXTRA_CACHE_JID");
            C001700s r1 = businessComplianceViewModel.A01;
            C36341k9.A16(r1, 0);
            if (businessComplianceViewModel.A00.A04() != null) {
                C36341k9.A16(r1, 1);
            } else {
                C36391kE.A1R(businessComplianceViewModel.A03, businessComplianceViewModel, parcelableExtra, 40);
            }
        } else {
            businessComplianceDetailActivity.A01.setVisibility(8);
            businessComplianceDetailActivity.A00.setVisibility(0);
            businessComplianceDetailActivity.A02.setVisibility(8);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0U(true);
            supportActionBar.A0I(R.string.f12nameremoved);
        }
        this.A04 = (BusinessComplianceViewModel) C36441kJ.A0b(this).A00(BusinessComplianceViewModel.class);
        this.A01 = (ProgressBar) findViewById(R.id.business_compliance_progress);
        this.A00 = (LinearLayout) findViewById(R.id.business_compliance_network_error_layout);
        this.A02 = (CardView) findViewById(R.id.business_compliance_wrapper_card);
        this.A03 = (RecyclerView) findViewById(R.id.business_compliance_recyclerview);
        C48732hx.A00(findViewById(R.id.business_compliance_network_error_retry), this, 41);
        A01(this);
        this.A04.A00.A08(this, new BA7(this, 1));
        C55492ui.A00(this, this.A04.A01, 17);
    }

    public BusinessComplianceDetailActivity() {
        this(0);
    }
}
