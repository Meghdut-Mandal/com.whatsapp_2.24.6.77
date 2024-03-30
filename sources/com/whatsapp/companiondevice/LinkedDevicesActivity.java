package com.whatsapp.companiondevice;

import X.AnonymousClass02E;
import X.AnonymousClass155;
import X.AnonymousClass17Y;
import X.AnonymousClass1LU;
import X.AnonymousClass1OD;
import X.AnonymousClass1OG;
import X.AnonymousClass3H6;
import X.AnonymousClass3P9;
import X.AnonymousClass3SB;
import X.AnonymousClass4XM;
import X.C02740Bs;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C19420v0;
import X.C19460v5;
import X.C19470v6;
import X.C19700wN;
import X.C19970wo;
import X.C20380xT;
import X.C20810yC;
import X.C21060yb;
import X.C236419g;
import X.C236919l;
import X.C237119n;
import X.C24801Dv;
import X.C25701Hi;
import X.C27651Pc;
import X.C27661Pe;
import X.C32671e0;
import X.C32791eC;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36381kD;
import X.C36411kG;
import X.C36441kJ;
import X.C41111wd;
import X.C44132Lg;
import X.C53592rZ;
import X.C587330v;
import X.C66213Vc;
import X.C81093wS;
import X.C89114Vh;
import X.C89324Wc;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;

public class LinkedDevicesActivity extends AnonymousClass155 implements DialogInterface.OnDismissListener {
    public int A00;
    public RecyclerView A01;
    public C19460v5 A02;
    public C19460v5 A03;
    public C27651Pc A04;
    public AnonymousClass1OG A05;
    public C41111wd A06;
    public LinkedDevicesDetailDialogFragment A07;
    public LinkedDevicesSharedViewModel A08;
    public AnonymousClass3H6 A09;
    public LinkedDevicesViewModel A0A;
    public C237119n A0B;
    public C27661Pe A0C;
    public C32671e0 A0D;
    public C236419g A0E;
    public AnonymousClass1OD A0F;
    public AnonymousClass1LU A0G;
    public C236919l A0H;
    public C32791eC A0I;
    public C20380xT A0J;
    public boolean A0K;
    public boolean A0L;
    public final C02740Bs A0M;

    public void onDismiss(DialogInterface dialogInterface) {
        this.A07 = null;
    }

    public void A2F() {
        if (!this.A0L) {
            this.A0L = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r3 = A0B2.A00;
            C36321k7.A0X(A0B2, r3, this, C36321k7.A05(A0B2, r3, this));
            C19470v6 r2 = C19470v6.A00;
            this.A02 = r2;
            this.A0J = C36331k8.A0I(A0B2);
            this.A0D = C18830tt.A4I(r3);
            this.A0H = (C236919l) A0B2.A5Q.get();
            this.A0G = C36411kG.A0e(A0B2);
            this.A03 = r2;
            this.A0F = (AnonymousClass1OD) A0B2.A2j.get();
            this.A0E = C36381kD.A0a(A0B2);
            this.A0B = (C237119n) A0B2.A8S.get();
            this.A04 = (C27651Pc) A0B2.A1w.get();
            this.A0I = (C32791eC) r3.A3L.get();
            this.A0C = (C27661Pe) A0B2.A1u.get();
            this.A05 = (AnonymousClass1OG) A0B2.AFk.get();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        boolean A1X = C36341k9.A1X(this);
        setContentView((int) R.layout.f9nameremoved);
        this.A08 = (LinkedDevicesSharedViewModel) C36441kJ.A0b(this).A00(LinkedDevicesSharedViewModel.class);
        this.A0A = (LinkedDevicesViewModel) C36441kJ.A0b(this).A00(LinkedDevicesViewModel.class);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.linked_device_recycler_view);
        this.A01 = recyclerView;
        C36351kA.A1F(recyclerView, A1X ? 1 : 0);
        C587330v r7 = new C587330v(this);
        C19970wo r10 = this.A07;
        C20810yC r14 = this.A0D;
        AnonymousClass17Y r6 = this.A05;
        C24801Dv r5 = this.A01;
        C20380xT r2 = this.A0J;
        C21060yb r9 = this.A08;
        C18820ts r11 = this.A00;
        C236919l r15 = this.A0H;
        AnonymousClass1OD r13 = this.A0F;
        C41111wd r4 = new C41111wd(r5, r6, r7, this.A0B, r9, r10, r11, this.A0E, r13, r14, r15, r2);
        this.A06 = r4;
        this.A01.setAdapter(r4);
        this.A06.BnA(this.A0M);
        this.A00 = getIntent().getIntExtra("entry_point", A1X);
        C20810yC r52 = this.A0D;
        AnonymousClass17Y r102 = this.A05;
        C19700wN r92 = this.A03;
        AnonymousClass3H6 r62 = new AnonymousClass3H6(this.A02, this.A03, r92, r102, this, this.A06, this.A08, this.A0G, r52);
        this.A09 = r62;
        r62.A00();
        C53592rZ.A00(this, this.A08.A0T, 17);
        C53592rZ.A00(this, this.A08.A0S, 19);
        C53592rZ.A00(this, this.A08.A0R, 16);
        C53592rZ.A00(this, this.A0A.A08, 20);
        C53592rZ.A00(this, this.A0A.A07, 21);
        C53592rZ.A00(this, this.A0A.A05, 18);
        C53592rZ.A00(this, this.A0A.A06, 15);
        this.A08.A0S();
        this.A0A.A0T();
        C19420v0 r3 = this.A0H.A01;
        if ((!r3.A2H()) && !C36371kC.A1U(C36341k9.A0E(r3), "md_opt_in_first_time_experience_shown")) {
            C36331k8.A18(this.A09, "md_opt_in_first_time_experience_shown", true);
            AnonymousClass3P9 r32 = new AnonymousClass3P9();
            r32.A02 = R.layout.f9nameremoved;
            AnonymousClass4XM r22 = new AnonymousClass4XM(this, 3);
            r32.A04 = R.string.f12nameremoved;
            r32.A07 = r22;
            C66213Vc r23 = C66213Vc.A00;
            r32.A03 = R.string.f12nameremoved;
            r32.A06 = r23;
            r32.A02().A1f(getSupportFragmentManager(), "first_time_experience_dialog");
        }
        if (this.A0D.A0E(7205)) {
            C81093wS.A01(this.A04, this, 39);
        } else {
            this.A05.A03();
        }
    }

    public void onDestroy() {
        C41111wd r0 = this.A06;
        r0.A01.unregisterObserver(this.A0M);
        LinkedDevicesSharedViewModel linkedDevicesSharedViewModel = this.A08;
        linkedDevicesSharedViewModel.A0D.unregisterObserver(linkedDevicesSharedViewModel.A0C);
        C25701Hi r02 = linkedDevicesSharedViewModel.A0H;
        r02.A00.A02(linkedDevicesSharedViewModel.A0W);
        linkedDevicesSharedViewModel.A0G.unregisterObserver(linkedDevicesSharedViewModel.A0F);
        super.onDestroy();
    }

    public void onSaveInstanceState(Bundle bundle) {
        DialogFragment dialogFragment;
        LinkedDevicesDetailDialogFragment linkedDevicesDetailDialogFragment = this.A07;
        if (linkedDevicesDetailDialogFragment != null) {
            linkedDevicesDetailDialogFragment.A1c();
        }
        DialogFragment dialogFragment2 = (DialogFragment) getSupportFragmentManager().A0N("first_time_experience_dialog");
        if (dialogFragment2 != null) {
            dialogFragment2.A1c();
        }
        AnonymousClass02E A0N = this.A09.A01.getSupportFragmentManager().A0N("wifi_speed_bump_dialog");
        if ((A0N instanceof WifiSpeedBumpDialogFragment) && (dialogFragment = (DialogFragment) A0N) != null) {
            dialogFragment.A1c();
        }
        super.onSaveInstanceState(bundle);
    }

    public LinkedDevicesActivity(int i) {
        this.A0L = false;
        C89324Wc.A00(this, 19);
    }

    public static void A01(LinkedDevicesActivity linkedDevicesActivity, List list) {
        boolean z;
        if (!linkedDevicesActivity.isFinishing() && list != null) {
            C41111wd r5 = linkedDevicesActivity.A06;
            List list2 = r5.A00;
            list2.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass3SB r0 = (AnonymousClass3SB) it.next();
                C44132Lg r2 = new C44132Lg(r0);
                Boolean bool = (Boolean) r5.A03.get(r0.A07);
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    z = true;
                    if (booleanValue) {
                        r2.A00 = z;
                        list2.add(r2);
                    }
                }
                z = false;
                r2.A00 = z;
                list2.add(r2);
            }
            C41111wd.A00(r5);
            r5.A06();
            LinkedDevicesDetailDialogFragment linkedDevicesDetailDialogFragment = linkedDevicesActivity.A07;
            if (linkedDevicesDetailDialogFragment != null && linkedDevicesDetailDialogFragment.A07 != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    AnonymousClass3SB r22 = (AnonymousClass3SB) it2.next();
                    if (r22.A07.equals(linkedDevicesActivity.A07.A07.A07)) {
                        LinkedDevicesDetailDialogFragment linkedDevicesDetailDialogFragment2 = linkedDevicesActivity.A07;
                        linkedDevicesDetailDialogFragment2.A07 = r22;
                        linkedDevicesDetailDialogFragment2.A0A = null;
                        if (linkedDevicesDetailDialogFragment2.A01 != null) {
                            LinkedDevicesDetailDialogFragment.A03(linkedDevicesDetailDialogFragment2);
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            this.A0A.A0T();
        } else if (i != 101) {
            if (i == 12345) {
                this.A09.A01(i2);
            }
        } else if (i2 == -1 && intent != null && intent.getBooleanExtra("has_removed_all_devices", false)) {
            Log.i("LinkedDevicesActivity/onActivityResult removedAllDevices");
            AnonymousClass17Y r2 = this.A05;
            r2.A02.post(new C81093wS((Object) this, 38));
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C81093wS.A00(this.A05, this, 40);
    }

    public void onStart() {
        super.onStart();
        LinkedDevicesSharedViewModel linkedDevicesSharedViewModel = this.A08;
        C81093wS.A01(linkedDevicesSharedViewModel.A0V, linkedDevicesSharedViewModel, 46);
    }

    public void onStop() {
        super.onStop();
        LinkedDevicesSharedViewModel linkedDevicesSharedViewModel = this.A08;
        Runnable runnable = linkedDevicesSharedViewModel.A02;
        if (runnable != null) {
            linkedDevicesSharedViewModel.A0V.Bnx(runnable);
        }
    }

    public LinkedDevicesActivity() {
        this(0);
        this.A0K = false;
        this.A0M = new C89114Vh(this, 2);
    }
}
