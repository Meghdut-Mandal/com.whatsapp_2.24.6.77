package com.whatsapp.payments.ui;

import X.AE0;
import X.AED;
import X.AF7;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass02E;
import X.AnonymousClass04F;
import X.AnonymousClass07B;
import X.AnonymousClass11F;
import X.AnonymousClass1EU;
import X.AnonymousClass1EZ;
import X.AnonymousClass1GX;
import X.AnonymousClass1RC;
import X.AnonymousClass35O;
import X.AnonymousClass3FM;
import X.AnonymousClass4RW;
import X.AnonymousClass5MN;
import X.B1D;
import X.C101014wV;
import X.C135086c7;
import X.C147356x5;
import X.C163977r4;
import X.C18740tg;
import X.C199799fz;
import X.C202699mR;
import X.C20830yE;
import X.C21100yf;
import X.C21616ASi;
import X.C224314h;
import X.C36351kA;
import X.C36381kD;
import X.C36391kE;
import X.C62233Fh;
import X.C95294kW;
import X.C97294om;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.viewpager.widget.ViewPager;
import com.whatsapp.PagerSlidingTabStrip;
import com.whatsapp.R;

public final class IndiaUpiQrTabActivity extends C101014wV {
    public static String A0H;
    public PagerSlidingTabStrip A00;
    public C20830yE A01;
    public AED A02;
    public AE0 A03;
    public AnonymousClass1EZ A04;
    public AnonymousClass1EU A05;
    public AF7 A06;
    public C199799fz A07;
    public C95294kW A08;
    public IndiaUpiScanQrCodeFragment A09;
    public C202699mR A0A;
    public AnonymousClass1GX A0B;
    public boolean A0C = false;
    public ViewPager A0D;
    public IndiaUpiMyQrFragment A0E;
    public C62233Fh A0F;
    public final AnonymousClass4RW A0G = new C21616ASi(this);

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            if (i2 != 0) {
                this.A09.A1b();
            } else if (this.A08.A00 == 2) {
                this.A0D.A0J(C36351kA.A1Y(this.A00) ? 1 : 0, true);
            } else {
                finish();
            }
        } else if (i == 203) {
            if (i2 == -1 && intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    Bu1(R.string.f12nameremoved);
                    C36391kE.A1Q(new AnonymousClass5MN(data, this, this.A0B, this.A09.A06.getWidth(), this.A09.A06.getHeight()), this.A04);
                    return;
                }
                this.A05.A06(R.string.f12nameremoved, 0);
            }
        } else if (i == 1019) {
            if (i2 == -1 && intent != null) {
                String stringExtra = intent.getStringExtra("INTERNATIONAL_QR_SOURCE");
                C135086c7 r0 = (C135086c7) intent.getParcelableExtra("INTERNATIONAL_QR_PAYLOAD");
                AED aed = this.A02;
                C18740tg.A06(r0);
                Object obj = r0.A00;
                C18740tg.A06(obj);
                aed.A00(this, (AnonymousClass11F) null, (B1D) null, (String) obj, stringExtra, A01(this, false), 0, false);
            }
        } else if (i == 1025) {
            if (i2 == -1 && intent != null && intent.getBooleanExtra("extra_open_transaction_confirmation_fragment", false)) {
                this.A09.A09 = false;
                PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
                Bundle A072 = AnonymousClass001.A07();
                IndiaUpiPaymentTransactionConfirmationFragment indiaUpiPaymentTransactionConfirmationFragment = new IndiaUpiPaymentTransactionConfirmationFragment();
                indiaUpiPaymentTransactionConfirmationFragment.A17(A072);
                indiaUpiPaymentTransactionConfirmationFragment.A17(intent.getExtras());
                indiaUpiPaymentTransactionConfirmationFragment.A0A = new C147356x5(this);
                paymentBottomSheet.A02 = indiaUpiPaymentTransactionConfirmationFragment;
                Btl(paymentBottomSheet, "IndiaUpiPaymentTransactionConfirmationFragment");
                paymentBottomSheet.A01 = new C163977r4(this, 8);
            }
            if (this.A04.A0D()) {
                C95294kW r2 = this.A08;
                if (r2.A00 == 1) {
                    r2.A00 = 2;
                    r2.A09();
                }
                this.A00.setVisibility(0);
                this.A00.A03();
            }
            this.A09.A1c();
        }
    }

    public void A3i() {
        int A022 = this.A01.A02("android.permission.CAMERA");
        IndiaUpiScanQrCodeFragment indiaUpiScanQrCodeFragment = this.A09;
        if (A022 != 0) {
            indiaUpiScanQrCodeFragment.A1a();
            AnonymousClass3FM r5 = new AnonymousClass3FM(this);
            r5.A01 = R.drawable.permission_cam;
            int[] iArr = {R.string.f12nameremoved};
            r5.A02 = R.string.f12nameremoved;
            r5.A0A = iArr;
            int[] iArr2 = {R.string.f12nameremoved};
            r5.A03 = R.string.f12nameremoved;
            r5.A08 = iArr2;
            r5.A0C = new String[]{"android.permission.CAMERA"};
            r5.A06 = true;
            BuO(r5.A02(), 1);
            return;
        }
        indiaUpiScanQrCodeFragment.A1b();
    }

    public void onBackPressed() {
        this.A09.A1Z();
        super.onBackPressed();
    }

    public void onStop() {
        this.A0F.A00(getWindow());
        super.onStop();
    }

    public static String A01(IndiaUpiQrTabActivity indiaUpiQrTabActivity, boolean z) {
        if (indiaUpiQrTabActivity.getIntent().getIntExtra("extra_payments_entry_type", 0) == 14) {
            if (z) {
                return "main_qr_code_gallery";
            }
            return "main_qr_code_camera";
        } else if (z) {
            return "payments_camera_gallery";
        } else {
            return "payments_camera";
        }
    }

    public void A22(AnonymousClass02E r2) {
        super.A22(r2);
        if (r2 instanceof IndiaUpiMyQrFragment) {
            this.A0E = (IndiaUpiMyQrFragment) r2;
        } else if (r2 instanceof IndiaUpiScanQrCodeFragment) {
            this.A09 = (IndiaUpiScanQrCodeFragment) r2;
        }
    }

    public void onCreate(Bundle bundle) {
        C95294kW r1;
        AnonymousClass1RC.A05(this, C224314h.A01(this, R.attr.f4nameremoved));
        super.onCreate(bundle);
        getWindow().addFlags(128);
        setContentView((int) R.layout.f9nameremoved);
        this.A0F = new C62233Fh();
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0I(R.string.f12nameremoved);
            supportActionBar.A0U(true);
        }
        A0H = getIntent().getStringExtra("extra_account_holder_name");
        C36381kD.A0O(this).A0U(true);
        this.A0D = (ViewPager) findViewById(R.id.payment_qr_pager);
        this.A00 = (PagerSlidingTabStrip) findViewById(R.id.payment_qr_tab_strip);
        if (this.A04.A0D()) {
            this.A00.setVisibility(0);
            if (supportActionBar != null) {
                supportActionBar.A0I(R.string.f12nameremoved);
            }
            r1 = new C95294kW(getSupportFragmentManager(), this, 2);
        } else {
            this.A00.setVisibility(8);
            r1 = new C95294kW(getSupportFragmentManager(), this, 1);
        }
        this.A08 = r1;
        this.A0D.setAdapter(r1);
        this.A0D.A0K(new C97294om(this));
        AnonymousClass04F.A05(this.A00, 0);
        this.A00.setViewPager(this.A0D);
        this.A0D.A0J(0, false);
        C95294kW r4 = this.A08;
        for (int i = 0; i < r4.A00; i++) {
            ((AnonymousClass35O) r4.A01.get(i)).A00.setSelected(AnonymousClass000.A1S(i, 0));
        }
        AE0 ae0 = this.A03;
        C21100yf r42 = this.A06;
        AF7 af7 = this.A06;
        this.A02 = new AED(r42, this.A0D, ae0, af7, this.A0A);
        af7.BOm(0, (Integer) null, "scan_qr_code", getIntent().getStringExtra("referral_screen"));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.A09.A1Z();
        finish();
        return true;
    }

    public void onStart() {
        super.onStart();
        this.A0F.A01(getWindow(), this.A08);
    }
}
