package com.whatsapp.backup.google;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1C4;
import X.AnonymousClass6FS;
import X.C100744vb;
import X.C101704y9;
import X.C136046dg;
import X.C163027pX;
import X.C164757sK;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C18840tu;
import X.C19460v5;
import X.C19470v6;
import X.C21060yb;
import X.C21570zS;
import X.C224514j;
import X.C24431Ck;
import X.C24801Dv;
import X.C33101ei;
import X.C33161ep;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C67153Ys;
import X.C90464aC;
import X.C90484aE;
import X.C90524aI;
import android.content.ActivityNotFoundException;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSpinner;
import com.whatsapp.R;
import com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel;
import com.whatsapp.util.Log;
import java.util.List;

public final class GoogleDriveNewUserSetupActivity extends C101704y9 {
    public int A00;
    public RadioGroup A01;
    public AppCompatSpinner A02;
    public C19460v5 A03;
    public AnonymousClass1C4 A04;
    public List A05;
    public View A06;
    public Button A07;
    public boolean A08;
    public RadioButton[] A09;
    public final ViewTreeObserver.OnGlobalLayoutListener A0A;

    public static void A0F(RadioButton radioButton, GoogleDriveNewUserSetupActivity googleDriveNewUserSetupActivity, String str) {
        int i = 2;
        Object[] A1Z = C36431kI.A1Z(str, 2);
        A1Z[1] = radioButton;
        String.format("gdrive-new-user-setup/freq-option-changed item:%s radioBtn:%s", A1Z);
        if (googleDriveNewUserSetupActivity.getString(R.string.f12nameremoved).equals(str)) {
            i = 1;
        } else if (!googleDriveNewUserSetupActivity.getString(R.string.f12nameremoved).equals(str)) {
            if (googleDriveNewUserSetupActivity.getString(R.string.f12nameremoved).equals(str)) {
                i = 3;
            } else if (googleDriveNewUserSetupActivity.getString(R.string.f12nameremoved).equals(str)) {
                i = 0;
            } else {
                C36321k7.A1Q("gdrive-new-user-setup/create/unexpected-backup-frequency/", str, AnonymousClass000.A0u());
                i = -1;
            }
        }
        int i2 = googleDriveNewUserSetupActivity.A00;
        googleDriveNewUserSetupActivity.A00 = i;
        if (radioButton != null) {
            googleDriveNewUserSetupActivity.A07();
            radioButton.toggle();
            radioButton.getText();
            googleDriveNewUserSetupActivity.A02.setSelection(googleDriveNewUserSetupActivity.A05.indexOf(C36371kC.A0u(radioButton)));
        }
        googleDriveNewUserSetupActivity.A0G(true);
        if ((i2 == -1 || i2 == 0 || C90524aI.A0f(googleDriveNewUserSetupActivity) == null) && i != 0 && i != -1) {
            googleDriveNewUserSetupActivity.A06.performClick();
        }
    }

    private void A01() {
        Point point = new Point();
        C36321k7.A0K(this, point);
        int dimensionPixelSize = point.x - getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        for (RadioButton width : this.A09) {
            width.setWidth(dimensionPixelSize);
        }
    }

    private void A07() {
        this.A01.clearCheck();
        this.A02.setSelection(this.A05.size() - 1, true);
    }

    private void A0G(boolean z) {
        int i;
        if (this.A07 == null) {
            Log.e("gdrive-new-user-setup/update-setup-btn/setup-btn-is-null");
            return;
        }
        C100744vb r3 = new C100744vb(getResources().getDrawable(R.drawable.chevron), this.A00);
        if (z) {
            C36351kA.A15(getResources(), this.A07, C224514j.A00(this, R.attr.f4nameremoved, R.color.f6nameremoved));
            C90484aE.A15(getResources(), r3, C224514j.A00(this, R.attr.f4nameremoved, R.color.f6nameremoved));
            i = 255;
        } else {
            int color = getResources().getColor(R.color.f6nameremoved);
            this.A07.setTextColor(color);
            r3.setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
            i = color >>> 24;
        }
        r3.setAlpha(i);
        boolean A1Y = C36351kA.A1Y(this.A00);
        Button button = this.A07;
        if (A1Y) {
            button.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, r3, (Drawable) null);
        } else {
            button.setCompoundDrawablesWithIntrinsicBounds(r3, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public void A2F() {
        if (!this.A08) {
            this.A08 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C90464aC.A11(A0B, this);
            C18830tt r2 = A0B.A00;
            C90464aC.A0y(A0B, r2, this, C36321k7.A05(A0B, r2, this));
            this.A0I = C36351kA.A0W(A0B);
            this.A0K = (C21570zS) A0B.A9Z.get();
            this.A0C = (C24431Ck) A0B.A2z.get();
            this.A0H = C36381kD.A0X(A0B);
            this.A0E = (AnonymousClass6FS) A0B.A3g.get();
            this.A0J = C36351kA.A0X(A0B);
            this.A0L = C18840tu.A00(A0B.A08);
            this.A0D = (C33101ei) A0B.A3f.get();
            this.A0F = (C33161ep) A0B.A3j.get();
            this.A03 = C19470v6.A00;
            this.A04 = (AnonymousClass1C4) A0B.A7e.get();
        }
    }

    public void BVj(int i) {
        if (i == 14) {
            this.A00 = 0;
            this.A07.performClick();
            return;
        }
        super.BVj(i);
    }

    public GoogleDriveNewUserSetupActivity(int i) {
        this.A08 = false;
        C163027pX.A00(this, 13);
    }

    public void A3j() {
        super.A3j();
        if (this.A00 != 0) {
            A0G(false);
            A07();
            this.A00 = -1;
        }
    }

    public void onBackPressed() {
        try {
            C24801Dv.A02(this);
        } catch (ActivityNotFoundException e) {
            Log.e("gdrive-new-user-setup/back-pressed", e);
            this.A05.A06(R.string.f12nameremoved, 1);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        List list;
        int i;
        super.onConfigurationChanged(configuration);
        A01();
        int i2 = this.A00;
        if (i2 == 0) {
            list = this.A05;
            i = R.string.f12nameremoved;
        } else if (i2 == 1) {
            list = this.A05;
            i = R.string.f12nameremoved;
        } else if (i2 != 2) {
            if (i2 == 3) {
                list = this.A05;
                i = R.string.f12nameremoved;
            }
            A07();
            this.A01.getViewTreeObserver().addOnGlobalLayoutListener(this.A0A);
        } else {
            list = this.A05;
            i = R.string.f12nameremoved;
        }
        int indexOf = list.indexOf(getString(i));
        if (indexOf >= 0) {
            RadioButton radioButton = this.A09[indexOf];
            radioButton.toggle();
            radioButton.getText();
            this.A02.setSelection(this.A05.indexOf(C36371kC.A0u(radioButton)));
            this.A02.setSelection(indexOf);
            this.A01.getViewTreeObserver().addOnGlobalLayoutListener(this.A0A);
        }
        A07();
        this.A01.getViewTreeObserver().addOnGlobalLayoutListener(this.A0A);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!this.A0D.A0C()) {
            Log.i("gdrive-new-user-setup/create no need to display GoogleDriveNewUserSetupActivity, exiting.");
            setResult(-1);
            finish();
            return;
        }
        setTitle(R.string.f12nameremoved);
        getSupportActionBar().A0U(false);
        findViewById(R.id.settings_gdrive_backup_info_box).setVisibility(8);
        C36341k9.A13(this, R.id.settings_gdrive_change_frequency_view, 8);
        C36341k9.A13(this, R.id.include_video_settings_summary, 8);
        C36341k9.A13(this, R.id.gdrive_new_user_setup_select_frequency_message, 0);
        TextView A0Q = C36391kE.A0Q(this, R.id.gdrive_new_user_setup_footer_info);
        Object[] A1Q = C36441kJ.A1Q();
        C36421kH.A0k(this, R.string.f12nameremoved, 0, A1Q);
        A1Q[1] = getString(R.string.f12nameremoved);
        C36421kH.A0k(this, R.string.f12nameremoved, 2, A1Q);
        C36341k9.A0s(this, A0Q, A1Q, R.string.f12nameremoved);
        A0Q.setVisibility(0);
        C36341k9.A13(this, R.id.gdrive_new_user_setup_footer_settings_divider, 0);
        TextView A0Q2 = C36391kE.A0Q(this, R.id.settings_gdrive_backup_now_category_title);
        A0Q2.setVisibility(0);
        A0Q2.setText(R.string.f12nameremoved);
        C36391kE.A0Q(this, R.id.settings_gdrive_change_account_title).setText(R.string.f12nameremoved);
        this.A06 = findViewById(R.id.settings_gdrive_change_account_view);
        this.A01 = (RadioGroup) findViewById(R.id.gdrive_new_user_setup_freq_options);
        this.A05 = AnonymousClass001.A0I();
        int[] iArr = SettingsGoogleDriveViewModel.A0e;
        int i = 0;
        do {
            int i2 = iArr[i];
            if (!(i2 == R.string.f12nameremoved || i2 == R.string.f12nameremoved)) {
                this.A05.add(getString(i2));
            }
            i++;
        } while (i < 5);
        this.A05.add(getString(R.string.f12nameremoved));
        this.A05.add(getString(R.string.f12nameremoved));
        this.A01.setVisibility(0);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, 17367048, this.A05);
        arrayAdapter.setDropDownViewResource(17367049);
        AppCompatSpinner appCompatSpinner = (AppCompatSpinner) findViewById(R.id.gdrive_new_user_setup_freq_options_spinner);
        this.A02 = appCompatSpinner;
        appCompatSpinner.setAdapter(arrayAdapter);
        this.A02.setSelection(C36421kH.A06(this.A05, 1));
        this.A02.setOnItemSelectedListener(new C136046dg(this));
        LayoutInflater layoutInflater = (LayoutInflater) C21060yb.A02(this, "layout_inflater");
        C18740tg.A06(layoutInflater);
        this.A09 = new RadioButton[C36421kH.A06(this.A05, 1)];
        this.A01.addView(layoutInflater.inflate(R.layout.f9nameremoved, (ViewGroup) null));
        for (int i3 = 0; i3 < this.A09.length; i3++) {
            String A0s = C36401kF.A0s(this.A05, i3);
            TextView textView = (TextView) layoutInflater.inflate(R.layout.f9nameremoved, (ViewGroup) null);
            textView.setText(A0s);
            this.A01.addView(textView);
            this.A01.addView(layoutInflater.inflate(R.layout.f9nameremoved, (ViewGroup) null));
            this.A09[i3] = textView;
            textView.setOnClickListener(new C67153Ys(this, textView, A0s, 0));
        }
        A01();
        Button button = (Button) findViewById(R.id.gdrive_new_user_setup_btn);
        this.A07 = button;
        button.setVisibility(0);
        A0G(false);
        C36421kH.A10(this.A07, this, 5);
        this.A01.getViewTreeObserver().addOnGlobalLayoutListener(this.A0A);
    }

    public GoogleDriveNewUserSetupActivity() {
        this(0);
        this.A00 = -1;
        this.A0A = new C164757sK(this, 2);
    }
}
