package com.whatsapp.insufficientstoragespace;

import X.AnonymousClass001;
import X.AnonymousClass155;
import X.AnonymousClass3GU;
import X.AnonymousClass3TF;
import X.AnonymousClass3Y3;
import X.AnonymousClass9v1;
import X.C18800tq;
import X.C18830tt;
import X.C21010yW;
import X.C24801Dv;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36401kF;
import X.C36411kG;
import X.C44842Pb;
import X.C55582ur;
import X.C89344We;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Locale;

public class InsufficientStorageSpaceActivity extends AnonymousClass155 {
    public long A00;
    public C21010yW A01;
    public ScrollView A02;
    public AnonymousClass3GU A03;
    public boolean A04;

    public void A3U() {
    }

    public void A2F() {
        if (!this.A04) {
            this.A04 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A01 = C36351kA.A0g(A0B);
        }
    }

    public InsufficientStorageSpaceActivity(int i) {
        this.A04 = false;
        C89344We.A00(this, 2);
    }

    public void onBackPressed() {
        C24801Dv.A02(this);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A03.A01();
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        int i;
        int i2;
        String A0w;
        View.OnClickListener r1;
        super.onCreate(bundle);
        String A002 = C55582ur.A00(this.A01, 6);
        setContentView((int) R.layout.f9nameremoved);
        this.A02 = (ScrollView) findViewById(R.id.insufficient_storage_scroll_view);
        TextView A0H = C36401kF.A0H(this, R.id.btn_storage_settings);
        TextView A0H2 = C36401kF.A0H(this, R.id.insufficient_storage_title_textview);
        TextView A0H3 = C36401kF.A0H(this, R.id.insufficient_storage_description_textview);
        long longExtra = getIntent().getLongExtra("spaceNeededInBytes", -1);
        this.A00 = longExtra;
        long A022 = (longExtra - this.A08.A02()) + SearchActionVerificationClientService.MS_TO_NS;
        if (getIntent() == null || !getIntent().getBooleanExtra("allowSkipKey", false)) {
            z = false;
            i = R.string.f12nameremoved;
            i2 = R.string.f12nameremoved;
            A0w = C36411kG.A0w(getResources(), AnonymousClass3TF.A02(this.A00, A022), new Object[1], 0, R.string.f12nameremoved);
        } else {
            z = true;
            i = R.string.f12nameremoved;
            i2 = R.string.f12nameremoved;
            A0w = getResources().getString(R.string.f12nameremoved);
        }
        A0H2.setText(i2);
        A0H3.setText(A0w);
        A0H.setText(i);
        if (z) {
            r1 = new AnonymousClass9v1(13, A002, this);
        } else {
            r1 = new AnonymousClass3Y3(this, 33);
        }
        A0H.setOnClickListener(r1);
        if (z) {
            View findViewById = findViewById(R.id.btn_skip_storage_settings);
            findViewById.setVisibility(0);
            AnonymousClass3Y3.A00(findViewById, this, 34);
        }
        AnonymousClass3GU A003 = AnonymousClass3GU.A00(this, this.A02, findViewById(R.id.bottom_button_container));
        this.A03 = A003;
        A003.A01();
    }

    public void onResume() {
        super.onResume();
        long A022 = this.A08.A02();
        Locale locale = Locale.ENGLISH;
        Object[] A0M = AnonymousClass001.A0M();
        boolean z = false;
        A0M[0] = Long.valueOf(A022);
        A0M[1] = Long.valueOf(this.A00);
        Log.i(String.format(locale, "insufficient-storage-activity/internal-storage available: %,d required: %,d", A0M));
        if (A022 > this.A00) {
            Log.i("insufficient-storage-activity/space-available/finishing-the-activity");
            if (this.A00 > 0) {
                C44842Pb r2 = new C44842Pb();
                r2.A02 = Long.valueOf(this.A00);
                if (findViewById(R.id.btn_skip_storage_settings).getVisibility() == 0) {
                    z = true;
                }
                r2.A00 = Boolean.valueOf(z);
                r2.A01 = 1;
                this.A01.Blw(r2);
            }
            finish();
        }
    }

    public InsufficientStorageSpaceActivity() {
        this(0);
    }
}
