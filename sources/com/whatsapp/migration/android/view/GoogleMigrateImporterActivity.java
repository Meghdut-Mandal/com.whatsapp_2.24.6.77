package com.whatsapp.migration.android.view;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass03Y;
import X.AnonymousClass155;
import X.AnonymousClass1JZ;
import X.AnonymousClass1MM;
import X.AnonymousClass3FM;
import X.AnonymousClass3L4;
import X.AnonymousClass3TA;
import X.AnonymousClass3TX;
import X.C010804n;
import X.C03570Gk;
import X.C163027pX;
import X.C164757sK;
import X.C165187t1;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C18910u1;
import X.C24801Dv;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36371kC;
import X.C36431kI;
import X.C36441kJ;
import X.C48752hz;
import X.C88774Tz;
import X.C90464aC;
import X.C90484aE;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.components.RoundCornerProgressBar;
import com.whatsapp.migration.android.integration.service.GoogleMigrateService;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.ArrayList;

public class GoogleMigrateImporterActivity extends AnonymousClass155 implements C88774Tz {
    public static final int A0C = 11;
    public static final int A0D = -1;
    public static final String A0E = "GoogleMigrateImporterActivity/";
    public static final String A0F = "com.whatsapp.migration.ACTION_OPENED_VIA_NOTIFICATION";
    public ViewTreeObserver.OnGlobalLayoutListener A00;
    public WaImageView A01;
    public WaTextView A02;
    public WaTextView A03;
    public GoogleMigrateImporterViewModel A04;
    public View A05;
    public WaTextView A06;
    public WaTextView A07;
    public RoundCornerProgressBar A08;
    public WDSButton A09;
    public WDSButton A0A;
    public boolean A0B;

    public void BVh(int i) {
        GoogleMigrateImporterViewModel googleMigrateImporterViewModel;
        boolean z;
        switch (i) {
            case 2:
            case 6:
            case 7:
            case 8:
            case 9:
                this.A04.A0A.A07("google_migrate_recoverable_error", "google_migrate_attempt_to_skip_import");
                A0K(4, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved);
                return;
            case 3:
                googleMigrateImporterViewModel = this.A04;
                z = false;
                break;
            case 4:
                googleMigrateImporterViewModel = this.A04;
                z = true;
                break;
            default:
                return;
        }
        googleMigrateImporterViewModel.A0W(z);
    }

    public void BVi(int i) {
    }

    public void BVj(int i) {
        GoogleMigrateImporterViewModel googleMigrateImporterViewModel;
        String str;
        boolean z = true;
        switch (i) {
            case 1:
                googleMigrateImporterViewModel = this.A04;
                z = false;
                break;
            case 2:
            case 6:
            case 7:
            case 8:
            case 9:
                this.A04.A0W(true);
                return;
            case 3:
            case 4:
                googleMigrateImporterViewModel = this.A04;
                break;
            default:
                return;
        }
        AnonymousClass3TX r2 = googleMigrateImporterViewModel.A0A;
        if (z) {
            str = "google_migrate_cancel_import_dialog";
        } else {
            str = "google_migrate_unrecoverable_error";
        }
        r2.A08(str, "google_migrate_confirm_skip_import");
        Context context = googleMigrateImporterViewModel.A07.A00;
        AnonymousClass1MM r22 = googleMigrateImporterViewModel.A0C;
        Log.i("GoogleMigrateService/cancelImport()");
        r22.A03(context, C36441kJ.A0I("com.whatsapp.migration.android.integration.service.GoogleMigrateService.ACTION_CANCEL_IMPORT"), GoogleMigrateService.class);
    }

    private void A07() {
        C163027pX.A00(this, 38);
    }

    public static void A0L(Context context) {
        C36441kJ.A0H(context, GoogleMigrateImporterActivity.class).addFlags(335544320);
    }

    public static void A0O(GoogleMigrateImporterActivity googleMigrateImporterActivity, int i) {
        View view;
        if (i == 100) {
            googleMigrateImporterActivity.A06.setVisibility(8);
            view = googleMigrateImporterActivity.A08;
        } else {
            RoundCornerProgressBar roundCornerProgressBar = googleMigrateImporterActivity.A08;
            if (i == -1) {
                roundCornerProgressBar.setVisibility(0);
                googleMigrateImporterActivity.A08.setProgress(0);
                googleMigrateImporterActivity.A06.setVisibility(0);
                googleMigrateImporterActivity.A06.setText(R.string.f12nameremoved);
                return;
            } else if (i >= 0) {
                roundCornerProgressBar.setVisibility(0);
                googleMigrateImporterActivity.A08.setProgress(i);
                googleMigrateImporterActivity.A06.setVisibility(0);
                WaTextView waTextView = googleMigrateImporterActivity.A06;
                Object[] A0L = AnonymousClass001.A0L();
                C36371kC.A1M(googleMigrateImporterActivity.A00, A0L, i, 0);
                C36341k9.A0s(googleMigrateImporterActivity, waTextView, A0L, R.string.f12nameremoved);
                return;
            } else {
                roundCornerProgressBar.setVisibility(8);
                view = googleMigrateImporterActivity.A06;
            }
        }
        view.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0128, code lost:
        r12 = com.whatsapp.R.string.f12nameremoved;
        r13 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x012e, code lost:
        r3.A0K(r9, r10, r11, r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0138, code lost:
        r12.A0J(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0031, code lost:
        r6 = null;
        r8 = null;
        r9 = null;
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0035, code lost:
        r3.A0o(r4, r5, r6, r7, r8, r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0038, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0i(com.whatsapp.migration.android.view.GoogleMigrateImporterActivity r12, java.lang.Integer r13) {
        /*
            if (r13 != 0) goto L_0x0008
            java.lang.String r0 = "GoogleMigrateImporterActivity/currentScreen is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0008:
            r0 = 2131889987(0x7f120f43, float:1.9414653E38)
            r3 = r12
            java.lang.String r5 = r12.getString(r0)
            r1 = 11
            X.7tD r0 = new X.7tD
            r0.<init>(r12, r1)
            r1 = 0
            X.0u1 r4 = new X.0u1
            r4.<init>(r1, r0)
            com.whatsapp.components.RoundCornerProgressBar r0 = r12.A08
            r2 = 8
            r0.setVisibility(r2)
            com.whatsapp.WaTextView r0 = r12.A06
            r0.setVisibility(r2)
            int r0 = r13.intValue()
            r7 = 0
            switch(r0) {
                case 0: goto L_0x0039;
                case 1: goto L_0x0057;
                case 2: goto L_0x0031;
                case 3: goto L_0x008e;
                case 4: goto L_0x0031;
                case 5: goto L_0x00ae;
                case 6: goto L_0x00dc;
                case 7: goto L_0x00e8;
                case 8: goto L_0x0031;
                case 9: goto L_0x00dc;
                case 10: goto L_0x0100;
                case 11: goto L_0x010e;
                case 12: goto L_0x011b;
                case 13: goto L_0x0120;
                case 14: goto L_0x00d3;
                case 15: goto L_0x0134;
                case 16: goto L_0x0116;
                case 17: goto L_0x013d;
                default: goto L_0x0031;
            }
        L_0x0031:
            r6 = r1
            r8 = r1
            r9 = r1
            r10 = r1
        L_0x0035:
            r3.A0o(r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x0039:
            r0 = 2131889989(0x7f120f45, float:1.9414657E38)
            java.lang.String r6 = r12.getString(r0)
            r0 = 2131889991(0x7f120f47, float:1.9414661E38)
            java.lang.String r7 = r12.getString(r0)
            r0 = 2131890004(0x7f120f54, float:1.9414688E38)
            java.lang.String r8 = r12.getString(r0)
            r0 = 2131886197(0x7f120075, float:1.9406966E38)
            java.lang.String r10 = r12.getString(r0)
            r9 = r1
            goto L_0x0035
        L_0x0057:
            r0 = 2131890000(0x7f120f50, float:1.941468E38)
            java.lang.String r5 = r12.getString(r0)
            r0 = 2131889989(0x7f120f45, float:1.9414657E38)
            java.lang.String r6 = r12.getString(r0)
            r0 = 2131889991(0x7f120f47, float:1.9414661E38)
            java.lang.String r7 = r12.getString(r0)
            r0 = 2131890004(0x7f120f54, float:1.9414688E38)
            java.lang.String r8 = r12.getString(r0)
            r0 = 2131889986(0x7f120f42, float:1.9414651E38)
            java.lang.String r9 = r12.getString(r0)
            r2 = 12
            X.7tD r0 = new X.7tD
            r0.<init>(r12, r2)
            X.0u1 r4 = new X.0u1
            r4.<init>(r1, r0)
            r0 = 2131886196(0x7f120074, float:1.9406964E38)
            java.lang.String r10 = r12.getString(r0)
            goto L_0x0035
        L_0x008e:
            r0 = 2131889988(0x7f120f44, float:1.9414655E38)
            java.lang.String r6 = r12.getString(r0)
            r0 = 2131896389(0x7f122845, float:1.9427638E38)
            java.lang.String r9 = r12.getString(r0)
            com.whatsapp.components.RoundCornerProgressBar r2 = r12.A08
            r0 = 0
            r2.setVisibility(r0)
            r12.Bnv()
            r0 = 2131886195(0x7f120073, float:1.9406962E38)
            java.lang.String r10 = r12.getString(r0)
            r8 = r1
            goto L_0x0035
        L_0x00ae:
            r0 = 2131889990(0x7f120f46, float:1.941466E38)
            java.lang.String r5 = r12.getString(r0)
            r0 = 2131891541(0x7f121555, float:1.9417805E38)
            java.lang.String r8 = r12.getString(r0)
            r2 = 13
            X.7tD r0 = new X.7tD
            r0.<init>(r12, r2)
            X.0u1 r4 = new X.0u1
            r4.<init>(r1, r0)
            r0 = 2131886194(0x7f120072, float:1.940696E38)
            java.lang.String r10 = r12.getString(r0)
            r6 = r1
            r9 = r1
            goto L_0x0035
        L_0x00d3:
            r9 = 9
            r10 = 2131890001(0x7f120f51, float:1.9414681E38)
            r11 = 2131889981(0x7f120f3d, float:1.941464E38)
            goto L_0x0128
        L_0x00dc:
            r9 = 1
            r10 = 2131890006(0x7f120f56, float:1.9414692E38)
            r11 = 2131890005(0x7f120f55, float:1.941469E38)
            r12 = 2131890003(0x7f120f53, float:1.9414686E38)
            r13 = -1
            goto L_0x012e
        L_0x00e8:
            r0 = 2131889988(0x7f120f44, float:1.9414655E38)
            java.lang.String r6 = r12.getString(r0)
            r0 = 2131896389(0x7f122845, float:1.9427638E38)
            java.lang.String r9 = r12.getString(r0)
            r0 = 2131889980(0x7f120f3c, float:1.9414639E38)
            r12.Bu1(r0)
            r8 = r1
            r10 = r1
            goto L_0x0035
        L_0x0100:
            r9 = 3
            r10 = 2131890405(0x7f1210e5, float:1.94155E38)
            r11 = 2131890404(0x7f1210e4, float:1.9415499E38)
            r12 = 2131890403(0x7f1210e3, float:1.9415497E38)
            r13 = 2131890002(0x7f120f52, float:1.9414683E38)
            goto L_0x012e
        L_0x010e:
            com.whatsapp.migration.android.view.GoogleMigrateImporterViewModel r2 = r12.A04
            r0 = 1
            r2.A0W(r0)
            goto L_0x0031
        L_0x0116:
            r2 = 7
            r0 = 2131887861(0x7f1206f5, float:1.9410341E38)
            goto L_0x0138
        L_0x011b:
            r2 = 2
            r0 = 2131896652(0x7f12294c, float:1.9428171E38)
            goto L_0x0138
        L_0x0120:
            r9 = 8
            r10 = 2131889984(0x7f120f40, float:1.9414647E38)
            r11 = 2131889983(0x7f120f3f, float:1.9414645E38)
        L_0x0128:
            r12 = 2131889985(0x7f120f41, float:1.941465E38)
            r13 = 2131890003(0x7f120f53, float:1.9414686E38)
        L_0x012e:
            r8 = r3
            r8.A0K(r9, r10, r11, r12, r13)
            goto L_0x0031
        L_0x0134:
            r2 = 6
            r0 = 2131889982(0x7f120f3e, float:1.9414643E38)
        L_0x0138:
            r12.A0J(r2, r0)
            goto L_0x0031
        L_0x013d:
            r0 = 2131890828(0x7f12128c, float:1.9416359E38)
            r12.Bu1(r0)
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.migration.android.view.GoogleMigrateImporterActivity.A0i(com.whatsapp.migration.android.view.GoogleMigrateImporterActivity, java.lang.Integer):void");
    }

    public static void A0k(GoogleMigrateImporterActivity googleMigrateImporterActivity, boolean z) {
        if (!z) {
            googleMigrateImporterActivity.A0K(5, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, -1);
        }
    }

    public static void A0l(GoogleMigrateImporterActivity googleMigrateImporterActivity, boolean z) {
        int i;
        if (z) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 30) {
                i = R.string.f12nameremoved;
            } else {
                i = R.string.f12nameremoved;
                if (i2 < 33) {
                    i = R.string.f12nameremoved;
                }
            }
            AnonymousClass00C.A0D(googleMigrateImporterActivity, 0);
            if (!googleMigrateImporterActivity.isFinishing()) {
                AnonymousClass3FM r2 = new AnonymousClass3FM(googleMigrateImporterActivity);
                r2.A09 = new int[]{R.drawable.permission_contacts, R.drawable.permission_plus, R.drawable.permission_storage};
                ArrayList A0I = AnonymousClass001.A0I();
                A0I.add("android.permission.GET_ACCOUNTS");
                A0I.add("android.permission.READ_CONTACTS");
                A0I.add("android.permission.WRITE_CONTACTS");
                AnonymousClass03Y.A0D(A0I, AnonymousClass3TA.A04());
                r2.A0C = C36371kC.A1b(A0I, 0);
                r2.A02 = R.string.f12nameremoved;
                r2.A0A = null;
                r2.A03 = i;
                r2.A08 = null;
                r2.A06 = false;
                googleMigrateImporterActivity.startActivityForResult(r2.A02(), 11);
            }
        }
    }

    public void A2F() {
        if (!this.A0B) {
            this.A0B = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C90464aC.A11(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C90464aC.A0y(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
        }
    }

    public GoogleMigrateImporterActivity(int i) {
        this.A0B = false;
        A07();
    }

    public static C010804n A01(GoogleMigrateImporterActivity googleMigrateImporterActivity, int i) {
        C010804n A002 = C010804n.A00((Resources.Theme) null, googleMigrateImporterActivity.getResources(), i);
        C18740tg.A07(A002, AnonymousClass000.A0r("GoogleMigrateImporterActivity/getVectorDrawable/drawableId is invalid/drawableId = ", AnonymousClass000.A0u(), i));
        return A002;
    }

    public static /* synthetic */ void A0F() {
    }

    public static /* synthetic */ void A0G() {
    }

    public static /* synthetic */ void A0H() {
    }

    public static /* synthetic */ void A0I() {
    }

    private void A0J(int i, int i2) {
        A0K(i, R.string.f12nameremoved, i2, R.string.f12nameremoved, R.string.f12nameremoved);
    }

    private void A0K(int i, int i2, int i3, int i4, int i5) {
        String string;
        String string2;
        String num = Integer.toString(i);
        if (getSupportFragmentManager().A0N(num) != null) {
            C36321k7.A1Q("GoogleMigrateImporterActivity/showDialog/dialog is already shown/dialogId = ", num, AnonymousClass000.A0u());
            return;
        }
        AnonymousClass3L4 r5 = new AnonymousClass3L4(i);
        String str = null;
        if (i2 == -1) {
            string = null;
        } else {
            string = getString(i2);
        }
        Bundle bundle = r5.A00;
        bundle.putString("title", string);
        C90484aE.A12(this, r5, i3);
        r5.A02(false);
        if (i4 == -1) {
            string2 = null;
        } else {
            string2 = getString(i4);
        }
        bundle.putString("positive_button", string2);
        if (i5 != -1) {
            str = getString(i5);
        }
        bundle.putString("negative_button", str);
        Btl(r5.A00(), num);
    }

    public static void A0M(GoogleMigrateImporterActivity googleMigrateImporterActivity, int i) {
        String str;
        googleMigrateImporterActivity.setResult(i);
        if (googleMigrateImporterActivity.getIntent() != null && A0F.equals(googleMigrateImporterActivity.getIntent().getAction())) {
            Intent className = C36431kI.A0D().setClassName(googleMigrateImporterActivity.getPackageName(), "com.whatsapp.registration.RegisterName");
            if (i == 2) {
                str = "google_migrate_import_canceled";
            } else {
                if (i == 1) {
                    str = "google_migrate_import_success";
                }
                googleMigrateImporterActivity.startActivity(className);
            }
            className.putExtra(str, true);
            googleMigrateImporterActivity.startActivity(className);
        }
        googleMigrateImporterActivity.finish();
    }

    private void A0o(C18910u1 r8, String str, String str2, String str3, String str4, String str5, String str6) {
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3) || !TextUtils.isEmpty(str4) || !TextUtils.isEmpty(str5)) {
            this.A01.setImageDrawable((Drawable) r8.get());
            if (str6 != null) {
                this.A01.setFocusable(true);
            }
            this.A01.setContentDescription(str6);
            WaTextView waTextView = this.A02;
            int i = 0;
            int i2 = 8;
            if (str2 != null) {
                i2 = 0;
            }
            waTextView.setVisibility(i2);
            WaTextView waTextView2 = this.A07;
            int i3 = 8;
            if (str3 != null) {
                i3 = 0;
            }
            waTextView2.setVisibility(i3);
            WDSButton wDSButton = this.A09;
            int i4 = 8;
            if (str4 != null) {
                i4 = 0;
            }
            wDSButton.setVisibility(i4);
            WDSButton wDSButton2 = this.A0A;
            if (str5 == null) {
                i = 8;
            }
            wDSButton2.setVisibility(i);
            boolean isEmpty = TextUtils.isEmpty(str5);
            Resources resources = getResources();
            int i5 = R.dimen.f7nameremoved;
            if (isEmpty) {
                i5 = R.dimen.f7nameremoved;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i5);
            ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(this.A09);
            AnonymousClass1JZ.A06(this.A09, this.A00, A0a.leftMargin, A0a.topMargin, A0a.rightMargin, dimensionPixelSize);
            this.A03.setText(str);
            this.A02.setText(str2);
            this.A07.setText(str3);
            this.A09.setText(str4);
            this.A0A.setText(str5);
        }
    }

    public /* synthetic */ void A3i() {
        A01(this, R.drawable.vec_ios_to_android_in_progress);
    }

    public /* synthetic */ void A3j() {
        A01(this, R.drawable.vec_ios_to_android_error);
    }

    public /* synthetic */ void A3k() {
        A01(this, R.drawable.vec_ios_to_android_finished);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (i == 11 && i2 == -1) {
            GoogleMigrateImporterViewModel googleMigrateImporterViewModel = this.A04;
            if (googleMigrateImporterViewModel.A09.A0G()) {
                Log.i("GoogleMigrateImporterViewModel/onPermissionGranted/import already successfully finished, skipping import again");
                return;
            }
            googleMigrateImporterViewModel.A0A.A08("google_migrate_permission", "google_migrate_accepted_permission");
            googleMigrateImporterViewModel.A0T();
            return;
        }
        GoogleMigrateImporterViewModel googleMigrateImporterViewModel2 = this.A04;
        boolean A0D2 = googleMigrateImporterViewModel2.A08.A0D();
        boolean A002 = googleMigrateImporterViewModel2.A06.A00();
        if (!A0D2) {
            if (!A002) {
                str = "google_migrate_rejected_contact_and_storage_permission";
            } else {
                str = "google_migrate_rejected_storage_permission";
            }
        } else if (!A002) {
            str = "google_migrate_rejected_contact_permission";
        } else {
            str = "unknown";
        }
        googleMigrateImporterViewModel2.A0A.A08("google_migrate_permission", str);
        googleMigrateImporterViewModel2.A0U(1);
    }

    public void onBackPressed() {
        C24801Dv.A02(this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        this.A03 = (WaTextView) C03570Gk.A0B(this, R.id.google_migrate_title);
        this.A02 = (WaTextView) C03570Gk.A0B(this, R.id.google_migrate_sub_title);
        this.A07 = (WaTextView) C03570Gk.A0B(this, R.id.google_migrate_warning);
        this.A09 = (WDSButton) C03570Gk.A0B(this, R.id.google_migrate_main_action);
        this.A0A = (WDSButton) C03570Gk.A0B(this, R.id.google_migrate_sub_action);
        this.A01 = (WaImageView) C03570Gk.A0B(this, R.id.google_migrate_image_view);
        this.A08 = (RoundCornerProgressBar) C03570Gk.A0B(this, R.id.google_migrate_progress_bar);
        this.A06 = (WaTextView) C03570Gk.A0B(this, R.id.google_migrate_progress_description);
        View findViewById = findViewById(R.id.google_migrate_importer_view_layout);
        this.A05 = findViewById;
        if (findViewById != null) {
            findViewById.getViewTreeObserver().addOnGlobalLayoutListener(this.A00);
        }
        GoogleMigrateImporterViewModel googleMigrateImporterViewModel = (GoogleMigrateImporterViewModel) C36441kJ.A0b(this).A00(GoogleMigrateImporterViewModel.class);
        this.A04 = googleMigrateImporterViewModel;
        C165187t1.A00(this, googleMigrateImporterViewModel.A01, 10);
        C165187t1.A00(this, this.A04.A03, 9);
        C165187t1.A00(this, this.A04.A00, 8);
        C165187t1.A00(this, this.A04.A04, 6);
        C165187t1.A00(this, this.A04.A02, 7);
        C48752hz.A00(this.A09, this, 33);
        C48752hz.A00(this.A0A, this, 34);
    }

    public void onDestroy() {
        super.onDestroy();
        Bnv();
    }

    public GoogleMigrateImporterActivity() {
        this(0);
        this.A00 = new C164757sK(this, 16);
    }
}
