package com.whatsapp.account.remove;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass07B;
import X.AnonymousClass0FM;
import X.AnonymousClass142;
import X.AnonymousClass155;
import X.AnonymousClass1RU;
import X.AnonymousClass1RV;
import X.AnonymousClass3LW;
import X.AnonymousClass3U8;
import X.AnonymousClass6TO;
import X.AnonymousClass6Z0;
import X.C154897Tz;
import X.C163027pX;
import X.C163297py;
import X.C165147sx;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C19650wI;
import X.C19730wQ;
import X.C31081bF;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36441kJ;
import X.C39001qm;
import X.C66923Xv;
import X.C90464aC;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.BulletSpan;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.companiondevice.LinkedDevicesViewModel;
import com.whatsapp.wds.components.button.WDSButton;

public final class RemoveAccountActivity extends AnonymousClass155 {
    public AnonymousClass1RV A00;
    public AnonymousClass1RU A01;
    public AnonymousClass6TO A02;
    public C31081bF A03;
    public C19650wI A04;
    public WDSButton A05;
    public WDSButton A06;
    public WaTextView A07;
    public WaTextView A08;
    public LinkedDevicesViewModel A09;
    public boolean A0A;

    public Dialog onCreateDialog(int i) {
        C39001qm r3;
        int i2;
        DialogInterface.OnClickListener onClickListener;
        if (i != 0) {
            if (i == 1) {
                C19730wQ r0 = this.A02;
                r0.A0G();
                AnonymousClass142 r02 = r0.A0E;
                if (r02 != null) {
                    AnonymousClass3U8.A03(r02);
                    r3 = AnonymousClass3LW.A00(this);
                    r3.A0d(R.string.f12nameremoved);
                    C19730wQ r03 = this.A02;
                    r03.A0G();
                    AnonymousClass142 r04 = r03.A0E;
                    if (r04 != null) {
                        r3.A0p(AnonymousClass3U8.A03(r04));
                        C163297py.A00(r3, this, 10, R.string.f12nameremoved);
                        i2 = R.string.f12nameremoved;
                        onClickListener = new C163297py(this, 11);
                    } else {
                        throw AnonymousClass001.A09("Required value was null.");
                    }
                } else {
                    throw AnonymousClass001.A09("Required value was null.");
                }
            } else if (i != 2) {
                Dialog onCreateDialog = super.onCreateDialog(i);
                AnonymousClass00C.A08(onCreateDialog);
                return onCreateDialog;
            } else {
                AnonymousClass6TO r32 = this.A02;
                if (r32 != null) {
                    r32.A02((Boolean) null, 14, 11);
                    r3 = AnonymousClass3LW.A00(this);
                    r3.A0d(R.string.f12nameremoved);
                    r3.A0c(R.string.f12nameremoved);
                    r3.A0r(true);
                    i2 = R.string.f12nameremoved;
                    onClickListener = AnonymousClass6Z0.A00;
                } else {
                    throw C36331k8.A0d("accountSwitchingLogger");
                }
            }
            r3.A0h(onClickListener, i2);
            AnonymousClass0FM create = r3.create();
            AnonymousClass00C.A08(create);
            return create;
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        C36391kE.A17(progressDialog, this, R.string.f12nameremoved);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        return progressDialog;
    }

    public void A2F() {
        if (!this.A0A) {
            this.A0A = true;
            C18800tq A0B = C36331k8.A0B(this);
            C90464aC.A11(A0B, this);
            C18830tt r1 = A0B.A00;
            C90464aC.A0y(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A01 = (AnonymousClass1RU) A0B.A08.get();
            this.A03 = (C31081bF) A0B.AY0.get();
            this.A04 = (C19650wI) A0B.A4f.get();
            this.A00 = A0B.A18();
            this.A02 = (AnonymousClass6TO) A0B.AAB.get();
        }
    }

    public RemoveAccountActivity(int i) {
        this.A0A = false;
        C163027pX.A00(this, 4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01() {
        /*
            r9 = this;
            java.lang.String r6 = X.C90524aI.A0f(r9)
            X.0v0 r0 = r9.A09
            long r3 = r0.A0T(r6)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0030
            r0 = 2131891269(0x7f121445, float:1.9417253E38)
        L_0x0013:
            java.lang.String r5 = r9.getString(r0)
        L_0x0017:
            X.AnonymousClass00C.A0B(r5)
            if (r6 == 0) goto L_0x002d
            X.0v0 r0 = r9.A09
            long r3 = r0.A0U(r6)
        L_0x0022:
            com.whatsapp.WaTextView r2 = r9.A08
            if (r2 != 0) goto L_0x0050
            java.lang.String r0 = "googleBackupTimeView"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x002d:
            r3 = -1
            goto L_0x0022
        L_0x0030:
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x003a
            r0 = 2131895200(0x7f1223a0, float:1.9425226E38)
            goto L_0x0013
        L_0x003a:
            X.0ts r2 = r9.A00
            long r0 = java.lang.System.currentTimeMillis()
            int r0 = X.AnonymousClass6XI.A00(r0, r3)
            if (r0 != 0) goto L_0x004b
            java.lang.String r5 = X.AnonymousClass3UM.A00(r2, r3)
            goto L_0x0017
        L_0x004b:
            java.lang.String r5 = X.AnonymousClass3UY.A0B(r2, r3)
            goto L_0x0017
        L_0x0050:
            r1 = 2131890683(0x7f1211fb, float:1.9416065E38)
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r7 = 0
            r0[r7] = r5
            X.C36341k9.A0s(r9, r2, r0, r1)
            r5 = 0
            java.lang.String r2 = "googleBackupSizeView"
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            com.whatsapp.WaTextView r1 = r9.A07
            if (r0 <= 0) goto L_0x008a
            if (r1 != 0) goto L_0x006d
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x006d:
            r1.setVisibility(r7)
            com.whatsapp.WaTextView r5 = r9.A07
            if (r5 != 0) goto L_0x0079
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x0079:
            r2 = 2131889962(0x7f120f2a, float:1.9414602E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            X.0ts r0 = r9.A00
            java.lang.String r0 = X.AnonymousClass3TF.A03(r0, r3)
            r1[r7] = r0
            X.C36341k9.A0s(r9, r5, r1, r2)
            return
        L_0x008a:
            if (r1 != 0) goto L_0x0091
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r2)
            throw r0
        L_0x0091:
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.account.remove.RemoveAccountActivity.A01():void");
    }

    public static final void A07(TextView textView, RemoveAccountActivity removeAccountActivity, CharSequence charSequence) {
        SpannableStringBuilder A0P = C36441kJ.A0P(charSequence);
        A0P.setSpan(new BulletSpan((int) removeAccountActivity.getResources().getDimension(R.dimen.f7nameremoved)), 0, A0P.length(), 0);
        textView.setText(A0P);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        setTitle(R.string.f12nameremoved);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0U(true);
        }
        this.A09 = (LinkedDevicesViewModel) C36441kJ.A0b(this).A00(LinkedDevicesViewModel.class);
        this.A05 = (WDSButton) C36361kB.A0G(this.A00, R.id.remove_account_backup_submit);
        this.A06 = (WDSButton) C36361kB.A0G(this.A00, R.id.remove_account_submit);
        this.A08 = C36341k9.A0Q(this.A00, R.id.gdrive_backup_time);
        this.A07 = C36341k9.A0Q(this.A00, R.id.gdrive_backup_size);
        TextView A0M = C36341k9.A0M(this.A00, R.id.remove_whatsapp_account_group_text);
        TextView A0M2 = C36341k9.A0M(this.A00, R.id.remove_whatsapp_account_backup_text);
        TextView A0M3 = C36341k9.A0M(this.A00, R.id.remove_whatsapp_account_device_text);
        WaTextView A0Q = C36341k9.A0Q(this.A00, R.id.remove_whatsapp_account_linked_devices_text);
        TextView A0M4 = C36341k9.A0M(this.A00, R.id.remove_account_number_confirmation_text);
        A07(A0M3, this, C36361kB.A0m(this, R.string.f12nameremoved));
        A07(A0M, this, C36361kB.A0m(this, R.string.f12nameremoved));
        A07(A0M2, this, C36361kB.A0m(this, R.string.f12nameremoved));
        LinkedDevicesViewModel linkedDevicesViewModel = this.A09;
        if (linkedDevicesViewModel == null) {
            throw C36331k8.A0d("linkedDevicesViewModel");
        }
        linkedDevicesViewModel.A0T();
        LinkedDevicesViewModel linkedDevicesViewModel2 = this.A09;
        if (linkedDevicesViewModel2 == null) {
            throw C36331k8.A0d("linkedDevicesViewModel");
        }
        C165147sx.A02(this, linkedDevicesViewModel2.A08, new C154897Tz(A0Q, this), 1);
        C18820ts r1 = this.A00;
        C19730wQ r0 = this.A02;
        r0.A0G();
        AnonymousClass142 r02 = r0.A0E;
        if (r02 != null) {
            A0M4.setText(r1.A0H(AnonymousClass3U8.A03(r02)));
            WDSButton wDSButton = this.A05;
            if (wDSButton == null) {
                throw C36331k8.A0d("backupChatsButton");
            }
            C66923Xv.A01(wDSButton, this, 26);
            WDSButton wDSButton2 = this.A06;
            if (wDSButton2 == null) {
                throw C36331k8.A0d("removeAccountButton");
            }
            C66923Xv.A01(wDSButton2, this, 25);
            A01();
            return;
        }
        throw C36381kD.A0l();
    }

    public void onResume() {
        super.onResume();
        A01();
    }

    public RemoveAccountActivity() {
        this(0);
    }
}
