package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilFbPayHubActivity;
import java.util.List;

/* renamed from: X.8hb  reason: invalid class name and case insensitive filesystem */
public abstract class C178808hb extends C173868Tl implements View.OnClickListener, C23037B1i, C23032B1d, C22988Aze, C22829Awe {
    public View A00;
    public View A01;
    public SwitchCompat A02;
    public C25251Fo A03;
    public AnonymousClass1EZ A04;
    public C29231Vv A05;
    public AnonymousClass1YK A06;
    public C24601Db A07;
    public AnonymousClass1DR A08;
    public C29121Vk A09;
    public AnonymousClass1EU A0A;
    public AnonymousClass1XC A0B;
    public C166337vZ A0C;
    public C195069Sj A0D;
    public C199109ei A0E;
    public ListView A0F;
    public View A0G;
    public View A0H;
    public C21243ADz A0I;

    public Dialog onCreateDialog(int i, Bundle bundle) {
        return ((BrazilFbPayHubActivity) this).A09.A01(bundle, this, i);
    }

    public void Bwm(List list) {
        C166337vZ r0 = this.A0C;
        r0.A00 = list;
        r0.notifyDataSetChanged();
        C54972tr.A00(this.A0F);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        int A002 = AnonymousClass00F.A00(this, R.color.f6nameremoved);
        AnonymousClass07B A0Q = C36431kI.A0Q(this, (Toolbar) findViewById(R.id.pay_service_toolbar));
        if (A0Q != null) {
            C165577te.A10(A0Q, R.string.f12nameremoved);
            C165607th.A17(this, A0Q, A002);
        }
        this.A0G = findViewById(R.id.payment_methods_container);
        this.A0H = findViewById(R.id.p2p_onboarding_nudge_container);
        findViewById(R.id.p2p_onboarding_nudge_button).setOnClickListener(this);
        BrazilFbPayHubActivity brazilFbPayHubActivity = (BrazilFbPayHubActivity) this;
        this.A0C = new C166337vZ(brazilFbPayHubActivity, brazilFbPayHubActivity.A08, brazilFbPayHubActivity);
        ListView listView = (ListView) findViewById(R.id.methods_list);
        this.A0F = listView;
        listView.setAdapter(this.A0C);
        C19770wU r9 = this.A04;
        AnonymousClass1EU r8 = this.A0A;
        C193889Nh r21 = new C193889Nh();
        C24601Db r7 = this.A07;
        AnonymousClass1EZ r13 = this.A04;
        C29121Vk r6 = this.A09;
        AnonymousClass1XC r3 = this.A0B;
        C29231Vv r14 = this.A05;
        C24601Db r16 = r7;
        AnonymousClass1DR r17 = this.A08;
        C29121Vk r18 = r6;
        AnonymousClass1EU r19 = r8;
        AnonymousClass1XC r20 = r3;
        C21243ADz aDz = new C21243ADz(this, this.A03, r13, r14, this.A06, r16, r17, r18, r19, r20, r21, this, this, new C21315AGt(), r9, (String) null, false);
        this.A0I = aDz;
        aDz.A01(false, false);
        this.A0F.setOnItemClickListener(new B89(this, 2));
        findViewById(R.id.add_new_account).setOnClickListener(this);
        AnonymousClass3UF.A0E(C36411kG.A0Q(this, R.id.change_pin_icon), A002);
        AnonymousClass3UF.A0E(C36411kG.A0Q(this, R.id.add_new_account_icon), A002);
        AnonymousClass3UF.A0E(C36411kG.A0Q(this, R.id.fingerprint_setting_icon), A002);
        AnonymousClass3UF.A0E(C36411kG.A0Q(this, R.id.delete_payments_account_icon), A002);
        AnonymousClass3UF.A0E(C36411kG.A0Q(this, R.id.request_payment_account_info_icon), A002);
        this.A01 = findViewById(R.id.pin_container);
        this.A00 = findViewById(R.id.fingerprint_container);
        this.A02 = (SwitchCompat) findViewById(R.id.toggle_fingerprint);
        C19770wU r10 = brazilFbPayHubActivity.A04;
        AnonymousClass1EU r92 = brazilFbPayHubActivity.A0A;
        C200959iX r82 = brazilFbPayHubActivity.A04;
        C147166wm r62 = brazilFbPayHubActivity.A00;
        C196039Xk r5 = brazilFbPayHubActivity.A05;
        C195069Sj r12 = new C195069Sj(brazilFbPayHubActivity, r62, brazilFbPayHubActivity.A01, r92, brazilFbPayHubActivity.A03, r82, r5, r10);
        this.A0D = r12;
        AnonymousClass6VG r63 = r12.A04;
        boolean A062 = r63.A00.A06();
        boolean z = false;
        C178808hb r32 = (C178808hb) r12.A07;
        if (A062) {
            r32.A00.setVisibility(0);
            if (r63.A02() == 1) {
                z = true;
            }
            r32.A02.setChecked(z);
            r12.A00 = true;
        } else {
            r32.A00.setVisibility(8);
        }
        C36391kE.A1I(findViewById(R.id.change_pin), this, 27);
        C36391kE.A1I(this.A00, this, 28);
        this.A0E = brazilFbPayHubActivity.A09;
        findViewById(R.id.delete_payments_account_action).setOnClickListener(new C48762i0(this, 0));
        findViewById(R.id.request_dyi_report_action).setOnClickListener(new C48762i0(this, 1));
    }

    public void onClick(View view) {
        if (view.getId() == R.id.add_new_account || view.getId() == R.id.p2p_onboarding_nudge_button) {
            BQr(AnonymousClass000.A1Q(this.A0C.getCount()));
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C21243ADz aDz = this.A0I;
        C36331k8.A1E(aDz.A02);
        aDz.A02 = null;
        B2Z b2z = aDz.A00;
        if (b2z != null) {
            aDz.A06.unregisterObserver(b2z);
        }
    }

    public void onResume() {
        super.onResume();
        this.A0I.A00(true);
        C195069Sj r4 = this.A0D;
        boolean A032 = r4.A06.A03();
        boolean z = false;
        C178808hb r2 = (C178808hb) r4.A07;
        if (A032) {
            r2.A01.setVisibility(0);
            AnonymousClass6VG r1 = r4.A04;
            if (r1.A00.A06()) {
                r4.A00 = false;
                if (r1.A02() == 1) {
                    z = true;
                }
                r2.A02.setChecked(z);
                r4.A00 = true;
                return;
            }
            return;
        }
        r2.A01.setVisibility(8);
    }

    public /* synthetic */ String BED(C207249un r2) {
        return null;
    }

    public Dialog onCreateDialog(int i) {
        return ((BrazilFbPayHubActivity) this).A09.A01((Bundle) null, this, i);
    }
}
