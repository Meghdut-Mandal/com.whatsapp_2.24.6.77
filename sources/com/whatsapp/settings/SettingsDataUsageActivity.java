package com.whatsapp.settings;

import X.AnonymousClass001;
import X.AnonymousClass012;
import X.AnonymousClass15P;
import X.AnonymousClass17Y;
import X.AnonymousClass190;
import X.AnonymousClass199;
import X.AnonymousClass1Ax;
import X.AnonymousClass1BX;
import X.AnonymousClass1GQ;
import X.AnonymousClass1RC;
import X.AnonymousClass1RJ;
import X.AnonymousClass2df;
import X.AnonymousClass3LW;
import X.AnonymousClass3PI;
import X.AnonymousClass3PN;
import X.AnonymousClass3W4;
import X.AnonymousClass3Y7;
import X.AnonymousClass411;
import X.AnonymousClass4WP;
import X.C001700s;
import X.C107215Mz;
import X.C132446Tt;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C19420v0;
import X.C19630wG;
import X.C19770wU;
import X.C19970wo;
import X.C20050ww;
import X.C20800yB;
import X.C20810yC;
import X.C20830yE;
import X.C21000yV;
import X.C21010yW;
import X.C21350z4;
import X.C21390zA;
import X.C27111My;
import X.C29841Ye;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import X.C36441kJ;
import X.C39001qm;
import X.C48762i0;
import X.C49822jk;
import X.C51632o8;
import X.C55582ur;
import X.C65343Rr;
import X.C65963Ud;
import X.C68903ce;
import X.C81163wZ;
import X.C82333yX;
import X.C87264Oc;
import X.C89364Wg;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

public class SettingsDataUsageActivity extends AnonymousClass2df implements AnonymousClass15P, C87264Oc {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public Handler A04;
    public View A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public TextView A0B;
    public TextView A0C;
    public TextView A0D;
    public SwitchCompat A0E;
    public C21390zA A0F;
    public AnonymousClass3PN A0G;
    public C20050ww A0H;
    public C19630wG A0I;
    public C20830yE A0J;
    public C21350z4 A0K;
    public C21010yW A0L;
    public C29841Ye A0M;
    public AnonymousClass1GQ A0N;
    public AnonymousClass1BX A0O;
    public AnonymousClass3PI A0P;
    public C65343Rr A0Q;
    public AnonymousClass199 A0R;
    public String A0S;
    public String[] A0T;
    public String[] A0U;
    public int A0V;
    public int A0W;
    public int A0X;
    public View A0Y;
    public WaTextView A0Z;
    public WaTextView A0a;
    public C49822jk A0b;
    public SettingsDataUsageViewModel A0c;
    public C132446Tt A0d;
    public String A0e;
    public TimerTask A0f;
    public boolean A0g;
    public final Timer A0h;

    public void Bgm(int i, int i2) {
        C51632o8 r2;
        TextView textView;
        int i3;
        if (i == 5) {
            AnonymousClass3PN r0 = this.A0G;
            r2 = C51632o8.VIDEO;
            if (r0.A02(r2, i2)) {
                textView = this.A0C;
            } else {
                return;
            }
        } else if (i == 6) {
            AnonymousClass3PN r02 = this.A0G;
            r2 = C51632o8.PHOTO;
            if (r02.A02(r2, i2)) {
                textView = this.A0B;
            } else {
                return;
            }
        } else if (i == 7) {
            if (i2 == 0) {
                i3 = 1;
            } else if (i2 != 1) {
                i3 = 30;
                if (i2 != 2) {
                    i3 = 0;
                }
            } else {
                i3 = 7;
            }
            C36341k9.A0v(C36421kH.A0A(this), "newsletter_media_cache_purge_after", i3);
            A0F(i3);
            return;
        } else if (i == 8) {
            AnonymousClass3PN r03 = this.A0G;
            r2 = C51632o8.ORIGINAL;
            if (!r03.A02(r2, i2) || (textView = this.A0A) == null) {
                return;
            }
        } else {
            return;
        }
        textView.setText(this.A0G.A01(r2));
    }

    public Dialog onCreateDialog(int i) {
        if (i != 1) {
            return super.onCreateDialog(i);
        }
        C39001qm A002 = AnonymousClass3LW.A00(this);
        A002.A0c(R.string.f12nameremoved);
        A002.A0h(AnonymousClass3W4.A00, R.string.f12nameremoved);
        return A002.create();
    }

    private void A07() {
        this.A0D.setVisibility(0);
        Log.i("settings-data-usage-activity/loadStorageData");
        AnonymousClass4WP r1 = new AnonymousClass4WP((AnonymousClass012) this, this);
        this.A0d = r1;
        C36391kE.A1Q(r1, this.A04);
        C49822jk r12 = new C49822jk(this);
        this.A0b = r12;
        C36391kE.A1Q(r12, this.A04);
    }

    private void A0F(int i) {
        WaTextView waTextView = this.A0Z;
        int i2 = R.string.f12nameremoved;
        if (i != 1) {
            i2 = R.string.f12nameremoved;
            if (i != 7) {
                i2 = R.string.f12nameremoved;
                if (i != 30) {
                    i2 = R.string.f12nameremoved;
                }
            }
        }
        waTextView.setText(i2);
    }

    public static void A0G(SettingsDataUsageActivity settingsDataUsageActivity, int i) {
        WaTextView waTextView;
        int A012;
        WaTextView waTextView2 = settingsDataUsageActivity.A0a;
        if (waTextView2 != null) {
            waTextView2.setTextColor(settingsDataUsageActivity.A0W);
            if (!settingsDataUsageActivity.A0O.A07()) {
                waTextView = settingsDataUsageActivity.A0a;
                A012 = R.string.f12nameremoved;
            } else {
                if (!(i == 0 || i == 1)) {
                    if (i == 2) {
                        settingsDataUsageActivity.A0a.setTextColor(settingsDataUsageActivity.A0V);
                    } else if (i == 3) {
                        settingsDataUsageActivity.A0a.setText(R.string.f12nameremoved);
                        settingsDataUsageActivity.A0a.setTextColor(settingsDataUsageActivity.A0X);
                        return;
                    } else if (!(i == 4 || i == 5)) {
                        return;
                    }
                }
                waTextView = settingsDataUsageActivity.A0a;
                A012 = SettingsUserProxyViewModel.A01(i);
            }
            waTextView.setText(A012);
        }
    }

    public void A2F() {
        if (!this.A0g) {
            this.A0g = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r5 = A0L2.A5g;
            C36321k7.A0c(r5, this);
            C18830tt r1 = r5.A00;
            C36321k7.A0X(r5, r1, this, C36321k7.A05(r5, r1, this));
            this.A0I = C36351kA.A0W(r5);
            this.A0H = C36381kD.A0U(r5);
            this.A0L = C36351kA.A0g(r5);
            this.A0R = (AnonymousClass199) r5.AQD.get();
            this.A0N = C36371kC.A0f(r5);
            this.A0K = (C21350z4) r5.A2V.get();
            this.A0M = (C29841Ye) r5.AQo.get();
            this.A0J = C36351kA.A0X(r5);
            this.A0O = r5.AJQ();
            this.A0G = new AnonymousClass3PN((C19630wG) r5.A91.get(), (C19420v0) r5.A9G.get(), (C18820ts) r5.A9X.get());
            this.A0F = (C21390zA) r5.A0J.get();
            this.A0P = C27111My.A3F(A0L2);
        }
    }

    public /* synthetic */ void A3i() {
        if (!this.A0J.A0D()) {
            int i = Build.VERSION.SDK_INT;
            int i2 = R.string.f12nameremoved;
            if (i >= 30) {
                i2 = R.string.f12nameremoved;
                if (i < 33) {
                    i2 = R.string.f12nameremoved;
                }
            }
            RequestPermissionActivity.A07(this, R.string.f12nameremoved, i2);
            return;
        }
        startActivityForResult(AnonymousClass190.A1F(this, this.A0e, this.A0S, 1), 1);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        super.onActivityResult(i3, i4, intent2);
        if (i3 == 151) {
            if (i4 == -1) {
                A07();
                startActivity(AnonymousClass190.A1F(this, this.A0e, (String) null, 1));
                return;
            }
        } else if (i3 == 1) {
            A07();
            return;
        } else if (i3 == 2) {
            if (i4 == -1 && intent != null && Build.VERSION.SDK_INT >= 30) {
                Uri data = intent2.getData();
                C19630wG r13 = this.A0I;
                C19970wo r12 = this.A07;
                AnonymousClass17Y r9 = this.A05;
                C19770wU r15 = this.A04;
                C107215Mz r5 = new C107215Mz(this, this.A0F, this.A04, r9, this.A06, this.A08, r12, r13, this.A0K, r15);
                this.A04.Box(r5, data);
                return;
            }
            return;
        }
        Log.i("settings-data-usage-activity/onActivityResult/storage_permission denied/cant open StorageUsageActivity");
    }

    public void onCreate(Bundle bundle) {
        ViewStub viewStub;
        super.onCreate(bundle);
        this.A0Q = new C65343Rr(this.A07, this.A0R);
        if (C36401kF.A0M(this) == null) {
            C36351kA.A12(this);
            return;
        }
        this.A0c = (SettingsDataUsageViewModel) C36441kJ.A0b(this).A00(SettingsDataUsageViewModel.class);
        setTitle(R.string.f12nameremoved);
        setContentView((int) R.layout.f9nameremoved);
        int A1X = C36341k9.A1X(this);
        this.A04 = new Handler(Looper.myLooper());
        this.A0T = getResources().getStringArray(R.array.f3nameremoved);
        this.A0U = getResources().getStringArray(R.array.f3nameremoved);
        this.A00 = this.A09.A05();
        this.A02 = C36331k8.A06(this).getInt("autodownload_wifi_mask", 15);
        this.A01 = C36331k8.A06(this).getInt("autodownload_roaming_mask", 0);
        View findViewById = findViewById(R.id.setting_network_usage);
        this.A06 = C36391kE.A0Q(this, R.id.setting_network_usage_details);
        View findViewById2 = findViewById(R.id.setting_storage_usage);
        this.A0D = C36391kE.A0Q(this, R.id.setting_storage_usage_details);
        View findViewById3 = findViewById(R.id.setting_autodownload_cellular);
        this.A07 = C36391kE.A0Q(this, R.id.setting_selected_autodownload_cellular);
        View findViewById4 = findViewById(R.id.setting_autodownload_wifi);
        this.A09 = C36391kE.A0Q(this, R.id.setting_selected_autodownload_wifi);
        View findViewById5 = findViewById(R.id.setting_autodownload_roaming);
        this.A08 = C36391kE.A0Q(this, R.id.setting_selected_autodownload_roaming);
        View findViewById6 = findViewById(R.id.settings_calls_low_data);
        this.A0E = (SwitchCompat) findViewById(R.id.low_data_calls_switch);
        AnonymousClass3Y7.A00(findViewById, this, 30);
        this.A0e = C55582ur.A00(this.A0L, A1X);
        AnonymousClass3Y7.A00(findViewById2, this, 31);
        this.A07.setText(A01(this, this.A00));
        AnonymousClass3Y7.A00(findViewById3, this, 33);
        this.A09.setText(A01(this, this.A02));
        AnonymousClass3Y7.A00(findViewById4, this, 34);
        this.A08.setText(A01(this, this.A01));
        AnonymousClass3Y7.A00(findViewById5, this, 35);
        AnonymousClass1RJ A0r = C36351kA.A0r(this, R.id.setting_video_quality);
        AnonymousClass1RJ A0r2 = C36351kA.A0r(this, R.id.setting_photo_quality);
        View findViewById7 = findViewById(R.id.media_quality_section);
        AnonymousClass1RJ A0r3 = C36351kA.A0r(this, R.id.setting_original_quality);
        if (this.A0D.A0E(662) && !AnonymousClass1Ax.A03(this.A0D, 7589)) {
            findViewById7.setVisibility(0);
            AnonymousClass3Y7.A00(A0r.A01(), this, 36);
            TextView A0P2 = C36391kE.A0P(A0r.A01(), R.id.setting_selected_video_quality);
            this.A0C = A0P2;
            A0P2.setText(this.A0G.A01(C51632o8.VIDEO));
        }
        if (this.A0D.A0E(702) && !this.A0D.A0E(2653) && !AnonymousClass1Ax.A03(this.A0D, 7589)) {
            findViewById7.setVisibility(0);
            AnonymousClass3Y7.A00(A0r2.A01(), this, 37);
            TextView A0P3 = C36391kE.A0P(A0r2.A01(), R.id.setting_selected_photo_quality);
            this.A0B = A0P3;
            A0P3.setText(this.A0G.A01(C51632o8.PHOTO));
        }
        if (AnonymousClass1Ax.A03(this.A0D, 7589)) {
            findViewById7.setVisibility(8);
            A0r3.A03(0);
            C36351kA.A0r(this, R.id.setting_original_quality_divider).A03(0);
            this.A0A = C36391kE.A0P(A0r3.A01(), R.id.setting_selected_original_quality);
        }
        A0r3.A05(new AnonymousClass3Y7(this, 38));
        TextView textView = this.A0A;
        if (textView != null) {
            textView.setText(this.A0G.A01(C51632o8.ORIGINAL));
        }
        this.A0V = AnonymousClass1RC.A00(this, R.attr.f4nameremoved, R.color.f6nameremoved);
        this.A0X = AnonymousClass1RC.A00(this, R.attr.f4nameremoved, R.color.f6nameremoved);
        this.A0W = AnonymousClass1RC.A00(this, R.attr.f4nameremoved, R.color.f6nameremoved);
        C20810yC r1 = this.A0c.A03;
        C21000yV r4 = C21000yV.A01;
        boolean A012 = C20800yB.A01(r4, r1, 3641);
        View view = this.A00;
        int i = R.id.user_proxy_section;
        if (A012) {
            i = R.id.user_proxy_section_v2;
        }
        ViewStub A0S2 = C36441kJ.A0S(view, i);
        View inflate = A0S2.inflate();
        this.A0a = C36401kF.A0Q(this.A00, R.id.proxy_connection_status);
        AnonymousClass3Y7.A00(inflate, this, 28);
        if (this.A0D.A0E(2784) || C20800yB.A01(r4, this.A0c.A03, 3641)) {
            A0S2.setVisibility(0);
        } else {
            A0S2.setVisibility(8);
        }
        if (C36421kH.A1V(this)) {
            findViewById6.setVisibility(8);
        } else {
            this.A0E.setChecked(C36331k8.A06(this).getBoolean("voip_low_data_usage", false));
            AnonymousClass3Y7.A00(findViewById6, this, 29);
        }
        if (this.A0J.A0D()) {
            A07();
        } else {
            this.A0D.setVisibility(8);
        }
        this.A05 = findViewById(R.id.external_dir_migration_section);
        View findViewById8 = findViewById(R.id.manual_external_dir_migration);
        if (Build.VERSION.SDK_INT >= 30) {
            C48762i0.A00(findViewById8, this, 44);
        }
        C001700s r0 = this.A0c.A00;
        C65963Ud.A00(this, r0, 2);
        Object A042 = r0.A04();
        View view2 = this.A05;
        if (view2 != null) {
            int i2 = 0;
            if (Boolean.TRUE != A042) {
                i2 = 8;
            }
            view2.setVisibility(i2);
        }
        C65963Ud.A00(this, this.A0c.A01, 3);
        String A0q = C36381kD.A0q(this);
        this.A0S = A0q;
        this.A0P.A02(this.A00, "storage_and_data", A0q);
        this.A0S = null;
        if (this.A0N.A00.A0E(5625) && (viewStub = (ViewStub) findViewById(R.id.newsletter_media_cache_viewstub)) != null) {
            viewStub.inflate();
            this.A0Y = findViewById(R.id.settings_newsletters_media_cache_row);
            this.A0Z = (WaTextView) findViewById(R.id.settings_newsletters_media_cache);
            A0F(C36331k8.A06(this).getInt("newsletter_media_cache_purge_after", 0));
            AnonymousClass3Y7.A00(this.A0Y, this, 32);
        }
        if (C36411kG.A1W(this.A0D)) {
            C36411kG.A0Q(this, R.id.ic_setting_storage_usage).setImageResource(R.drawable.ic_settings_storage_data_unfilled_folder);
            C36411kG.A0Q(this, R.id.ic_setting_network_usage).setImageResource(R.drawable.ic_settings_storage_data_unfilled_network_usage);
            View[] viewArr = new View[7];
            viewArr[0] = findViewById2;
            viewArr[A1X] = findViewById6;
            viewArr[2] = inflate;
            viewArr[3] = findViewById3;
            C36381kD.A1L(findViewById4, findViewById5, viewArr);
            viewArr[6] = findViewById(R.id.manual_external_dir_migration_layout);
            A0H(viewArr);
            if (A0r2.A00() == 0) {
                View[] viewArr2 = new View[A1X];
                viewArr2[0] = A0r2.A01();
                A0H(viewArr2);
            }
            if (A0r.A00() == 0) {
                View[] viewArr3 = new View[A1X];
                viewArr3[0] = A0r.A01();
                A0H(viewArr3);
            }
        }
    }

    public SettingsDataUsageActivity(int i) {
        this.A0g = false;
        C89364Wg.A00(this, 23);
    }

    public static String A01(SettingsDataUsageActivity settingsDataUsageActivity, int i) {
        String str;
        String str2;
        int i2;
        ArrayList A0I2 = AnonymousClass001.A0I();
        int i3 = 0;
        int i4 = 0;
        while (i != 0) {
            if ((i & 1) != 0) {
                A0I2.add(Integer.toString(i4));
            }
            i >>= 1;
            i4++;
        }
        CharSequence[] charSequenceArr = (CharSequence[]) A0I2.toArray(new CharSequence[0]);
        int length = charSequenceArr.length;
        String[] strArr = settingsDataUsageActivity.A0U;
        if (length == strArr.length) {
            i2 = R.string.f12nameremoved;
        } else if (length == 0) {
            i2 = R.string.f12nameremoved;
        } else {
            CharSequence charSequence = charSequenceArr[0];
            while (true) {
                if (i3 >= strArr.length) {
                    str = "";
                    break;
                }
                String charSequence2 = charSequence.toString();
                strArr = settingsDataUsageActivity.A0U;
                if (charSequence2.equals(strArr[i3])) {
                    str = settingsDataUsageActivity.A0T[i3];
                    break;
                }
                i3++;
            }
            StringBuilder sb = new StringBuilder(str);
            for (int i5 = 1; i5 < length; i5++) {
                sb.append(", ");
                CharSequence charSequence3 = charSequenceArr[i5];
                int i6 = 0;
                while (true) {
                    if (i6 >= strArr.length) {
                        str2 = "";
                        break;
                    }
                    String charSequence4 = charSequence3.toString();
                    strArr = settingsDataUsageActivity.A0U;
                    if (charSequence4.equals(strArr[i6])) {
                        str2 = settingsDataUsageActivity.A0T[i6];
                        break;
                    }
                    i6++;
                }
                sb.append(str2);
            }
            return sb.toString();
        }
        return settingsDataUsageActivity.getString(i2);
    }

    private void A0H(View... viewArr) {
        int A052 = C36441kJ.A05(getResources(), R.dimen.f7nameremoved);
        for (View view : viewArr) {
            C36341k9.A0z(view, A052, view.getPaddingTop());
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0h.cancel();
        C36331k8.A1E(this.A0d);
        C49822jk r2 = this.A0b;
        if (r2 != null) {
            r2.A00.set(true);
            r2.A0D(true);
        }
        this.A03 = -1;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public void onPause() {
        super.onPause();
        this.A0f.cancel();
    }

    public void onResume() {
        super.onResume();
        SettingsDataUsageViewModel settingsDataUsageViewModel = this.A0c;
        C20810yC r1 = settingsDataUsageViewModel.A03;
        C21000yV r3 = C21000yV.A01;
        if (C20800yB.A01(r3, r1, 3641)) {
            C68903ce r4 = settingsDataUsageViewModel.A04;
            C001700s r12 = settingsDataUsageViewModel.A01;
            Objects.requireNonNull(r12);
            r4.A03.A03(new AnonymousClass411(r12, 18), settingsDataUsageViewModel.A02.A04);
        }
        C82333yX r5 = new C82333yX(this);
        this.A0f = r5;
        this.A0h.scheduleAtFixedRate(r5, 0, 1000);
        SettingsDataUsageViewModel settingsDataUsageViewModel2 = this.A0c;
        C81163wZ.A00(settingsDataUsageViewModel2.A05, settingsDataUsageViewModel2, 26);
        if (this.A0a == null) {
            return;
        }
        if (C20800yB.A01(r3, this.A0c.A03, 3641)) {
            A0G(this, C36371kC.A01(this.A0O.A01.A00("user_proxy_setting_pref"), "proxy_connection_status"));
        } else if (this.A0D.A0E(2784)) {
            WaTextView waTextView = this.A0a;
            boolean A072 = this.A0O.A07();
            int i = R.string.f12nameremoved;
            if (A072) {
                i = R.string.f12nameremoved;
            }
            waTextView.setText(i);
        }
    }

    public SettingsDataUsageActivity() {
        this(0);
        this.A0h = new Timer("refresh-network-usage");
        this.A03 = -1;
        this.A0S = null;
    }
}
