package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass01z;
import X.AnonymousClass02E;
import X.AnonymousClass09X;
import X.AnonymousClass09Y;
import X.AnonymousClass155;
import X.C001700s;
import X.C03570Gk;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36431kI;
import X.C36441kJ;
import X.C38991ql;
import X.C48732hx;
import X.C55492ui;
import X.C89314Wb;
import android.os.Bundle;
import android.view.Menu;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;
import com.whatsapp.base.WaFragment;
import com.whatsapp.util.Log;

public class EncBackupMainActivity extends AnonymousClass155 {
    public AnonymousClass01z A00;
    public WaImageButton A01;
    public EncBackupViewModel A02;
    public boolean A03;

    public static void A01(EncBackupMainActivity encBackupMainActivity) {
        AnonymousClass01z r3 = encBackupMainActivity.A00;
        if (r3 == null) {
            return;
        }
        if (r3.A0I() <= 1) {
            encBackupMainActivity.setResult(0, C36431kI.A0D());
            encBackupMainActivity.finish();
            return;
        }
        String str = ((AnonymousClass09Y) ((AnonymousClass09X) r3.A0C.get(r3.A0I() - 2))).A0B;
        if (str != null) {
            try {
                int parseInt = Integer.parseInt(str);
                if (encBackupMainActivity.A02.A0a()) {
                    AnonymousClass01z r2 = encBackupMainActivity.A00;
                    if (r2.A0I() > 2 || parseInt == 202 || parseInt == 203) {
                        String str2 = ((AnonymousClass09Y) ((AnonymousClass09X) r2.A0C.get(r2.A0I() - 3))).A0B;
                        if (str2 != null) {
                            parseInt = Integer.parseInt(str2);
                        }
                    }
                }
                C36341k9.A16(encBackupMainActivity.A02.A03, parseInt);
            } catch (NumberFormatException unused) {
                Log.e("encb/EncBackupMainActivity/unable to set fragment request code to proper value after back navigation");
            }
        }
    }

    public static void A07(EncBackupMainActivity encBackupMainActivity, WaFragment waFragment, int i, boolean z) {
        C48732hx r0;
        encBackupMainActivity.A01.setVisibility(C36351kA.A00(z ? 1 : 0));
        WaImageButton waImageButton = encBackupMainActivity.A01;
        if (z) {
            r0 = new C48732hx(encBackupMainActivity, 16);
        } else {
            r0 = null;
        }
        waImageButton.setOnClickListener(r0);
        encBackupMainActivity.A05.A01(new C38991ql(encBackupMainActivity, z), encBackupMainActivity);
        String valueOf = String.valueOf(i);
        AnonymousClass02E A0N = encBackupMainActivity.A00.A0N(valueOf);
        if (encBackupMainActivity.A00 == null) {
            return;
        }
        if (A0N == null || A0N.A15()) {
            AnonymousClass09Y r1 = new AnonymousClass09Y(encBackupMainActivity.A00);
            r1.A0F(waFragment, valueOf, R.id.fragment_container);
            r1.A0J(valueOf);
            r1.A02();
        }
    }

    public void A2F() {
        if (!this.A03) {
            this.A03 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
        }
    }

    public EncBackupMainActivity(int i) {
        this.A03 = false;
        C89314Wb.A00(this, 20);
    }

    public void onContextMenuClosed(Menu menu) {
        super.onContextMenuClosed(menu);
        Object A04 = this.A02.A03.A04();
        if (A04 != null) {
            AnonymousClass02E A0N = this.A00.A0N(A04.toString());
            if (A0N instanceof EncryptionKeyDisplayFragment) {
                ((EncryptionKeyDisplayFragment) A0N).A00.setBackgroundResource(R.drawable.enc_backup_enc_key_bg);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        WaImageButton waImageButton = (WaImageButton) C03570Gk.A0B(this, R.id.enc_backup_toolbar_button);
        this.A01 = waImageButton;
        C36321k7.A0L(this, waImageButton, this.A00, R.drawable.ic_back);
        this.A00 = getSupportFragmentManager();
        EncBackupViewModel encBackupViewModel = (EncBackupViewModel) C36441kJ.A0b(this).A00(EncBackupViewModel.class);
        this.A02 = encBackupViewModel;
        C55492ui.A00(this, encBackupViewModel.A03, 8);
        C55492ui.A00(this, this.A02.A04, 9);
        C55492ui.A00(this, this.A02.A07, 10);
        EncBackupViewModel encBackupViewModel2 = this.A02;
        Bundle A0H = C36371kC.A0H(this);
        C18740tg.A0E(A0H.containsKey("user_action"), "getIntent().getExtras()[USER_ACTION_ARG] is required but is not present");
        int i = A0H.getInt("user_action");
        C001700s r1 = encBackupViewModel2.A09;
        if (r1.A04() == null) {
            C36341k9.A16(r1, i);
        }
        C001700s r2 = encBackupViewModel2.A03;
        if (r2.A04() == null) {
            int i2 = 100;
            if (i != 1) {
                i2 = 103;
                if (i != 2) {
                    i2 = 102;
                    if (i != 3) {
                        if (i == 7 || i == 9) {
                            i2 = 104;
                        } else {
                            return;
                        }
                    }
                }
            }
            C36341k9.A16(r2, i2);
        }
    }

    public EncBackupMainActivity() {
        this(0);
    }
}
