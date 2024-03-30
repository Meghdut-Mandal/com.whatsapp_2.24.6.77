package com.whatsapp.calling.spam;

import X.AnonymousClass000;
import X.AnonymousClass141;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass17Y;
import X.AnonymousClass1C6;
import X.AnonymousClass1NG;
import X.AnonymousClass1NJ;
import X.AnonymousClass1Y3;
import X.AnonymousClass3Os;
import X.AnonymousClass3PR;
import X.AnonymousClass4PP;
import X.AnonymousClass4ZB;
import X.C18800tq;
import X.C18830tt;
import X.C19600wD;
import X.C19770wU;
import X.C20310xM;
import X.C28361Si;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36371kC;
import X.C36391kE;
import X.C48812i6;
import X.C585730f;
import X.C605838k;
import X.C89314Wb;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.CheckBox;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

public class CallSpamActivity extends AnonymousClass155 {
    public C585730f A00;
    public AnonymousClass16D A01;
    public AnonymousClass1C6 A02;
    public boolean A03;
    public final AnonymousClass4PP A04;

    public class ReportSpamOrBlockDialogFragment extends Hilt_CallSpamActivity_ReportSpamOrBlockDialogFragment {
        public long A00;
        public CheckBox A01;
        public AnonymousClass17Y A02;
        public AnonymousClass1NG A03;
        public C19600wD A04;
        public AnonymousClass16D A05;
        public AnonymousClass171 A06;
        public AnonymousClass1Y3 A07;
        public C20310xM A08;
        public AnonymousClass141 A09;
        public AnonymousClass3PR A0A;
        public AnonymousClass3Os A0B;
        public UserJid A0C;
        public UserJid A0D;
        public C28361Si A0E;
        public AnonymousClass1NJ A0F;
        public C605838k A0G;
        public C19770wU A0H;
        public String A0I;
        public String A0J;
        public String A0K;
        public boolean A0L;
        public boolean A0M;
        public boolean A0N;

        /* JADX WARNING: type inference failed for: r4v3 */
        /* JADX WARNING: type inference failed for: r4v4 */
        /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r4v1, types: [boolean, int] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.app.Dialog A1a(android.os.Bundle r10) {
            /*
                r9 = this;
                java.lang.String r0 = "callspamactivity/createdialog"
                com.whatsapp.util.Log.i((java.lang.String) r0)
                android.os.Bundle r3 = r9.A0b()
                java.lang.String r0 = "caller_jid"
                java.lang.String r0 = r3.getString(r0)
                X.13r r1 = com.whatsapp.jid.UserJid.Companion
                com.whatsapp.jid.UserJid r0 = r1.A02(r0)
                X.C18740tg.A06(r0)
                r9.A0D = r0
                java.lang.String r0 = "call_creator_jid"
                java.lang.String r0 = r3.getString(r0)
                com.whatsapp.jid.UserJid r0 = r1.A02(r0)
                r9.A0C = r0
                X.16D r1 = r9.A05
                com.whatsapp.jid.UserJid r0 = r9.A0D
                X.141 r0 = r1.A08(r0)
                X.C18740tg.A06(r0)
                r9.A09 = r0
                java.lang.String r0 = "call_id"
                java.lang.String r0 = X.C36431kI.A17(r3, r0)
                r9.A0I = r0
                java.lang.String r2 = "call_duration"
                r0 = -1
                long r0 = r3.getLong(r2, r0)
                r9.A00 = r0
                java.lang.String r0 = "call_terminator"
                r1 = 0
                boolean r0 = r3.getBoolean(r0, r1)
                r9.A0L = r0
                java.lang.String r0 = "call_termination_reason"
                java.lang.String r0 = r3.getString(r0)
                r9.A0J = r0
                java.lang.String r0 = "call_video"
                boolean r0 = r3.getBoolean(r0, r1)
                r9.A0N = r0
                boolean r0 = r9.A0M
                if (r0 == 0) goto L_0x00d7
                X.3Os r2 = r9.A0B
                java.lang.String r1 = r9.A0K
                com.whatsapp.jid.UserJid r0 = r9.A0D
                r8 = 0
                boolean r4 = X.C36341k9.A1a(r1, r0)
                X.AnonymousClass3Os.A00(r2, r0, r1, r8)
            L_0x0070:
                r0 = 22
                X.7py r7 = new X.7py
                r7.<init>(r9, r0)
                X.01I r6 = r9.A0i()
                X.1qm r5 = X.AnonymousClass3LW.A00(r6)
                boolean r0 = r9.A0M
                if (r0 == 0) goto L_0x00c0
                r0 = 2131893578(0x7f121d4a, float:1.9421936E38)
                java.lang.String r0 = r9.A0n(r0)
            L_0x008a:
                r5.A0p(r0)
                r0 = 2131891806(0x7f12165e, float:1.9418342E38)
                r5.A0h(r7, r0)
                r1 = 2131896389(0x7f122845, float:1.9427638E38)
                r0 = 23
                X.C163297py.A00(r5, r9, r0, r1)
                boolean r0 = r9.A0M
                if (r0 == 0) goto L_0x00bb
                android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r6)
                r0 = 2131626030(0x7f0e082e, float:1.8879285E38)
                android.view.View r1 = X.C36381kD.A0K(r1, r0)
                r0 = 2131428050(0x7f0b02d2, float:1.8477734E38)
                android.view.View r0 = r1.findViewById(r0)
                android.widget.CheckBox r0 = (android.widget.CheckBox) r0
                r9.A01 = r0
                r0.setChecked(r4)
                r5.setView(r1)
            L_0x00bb:
                X.0FM r0 = r5.create()
                return r0
            L_0x00c0:
                r3 = 2131886886(0x7f120326, float:1.9408364E38)
                java.lang.Object[] r2 = new java.lang.Object[r4]
                X.141 r1 = r9.A09
                if (r1 == 0) goto L_0x00d4
                X.171 r0 = r9.A06
                java.lang.String r0 = r0.A0H(r1)
            L_0x00cf:
                java.lang.String r0 = X.C36401kF.A0q(r9, r0, r2, r8, r3)
                goto L_0x008a
            L_0x00d4:
                java.lang.String r0 = ""
                goto L_0x00cf
            L_0x00d7:
                X.3PR r2 = r9.A0A
                java.lang.String r1 = r9.A0K
                com.whatsapp.jid.UserJid r0 = r9.A0D
                r8 = 0
                boolean r4 = X.C36341k9.A1a(r1, r0)
                X.AnonymousClass3PR.A00(r2, r0, r1, r8)
                goto L_0x0070
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.spam.CallSpamActivity.ReportSpamOrBlockDialogFragment.A1a(android.os.Bundle):android.app.Dialog");
        }

        public void onCancel(DialogInterface dialogInterface) {
            super.onCancel(dialogInterface);
            if (this.A0M) {
                AnonymousClass3Os r3 = this.A0B;
                String str = this.A0K;
                UserJid userJid = this.A0D;
                C36321k7.A0w(str, userJid);
                AnonymousClass3Os.A00(r3, userJid, str, 2);
                return;
            }
            AnonymousClass3PR r32 = this.A0A;
            String str2 = this.A0K;
            UserJid userJid2 = this.A0D;
            C36321k7.A0w(str2, userJid2);
            AnonymousClass3PR.A00(r32, userJid2, str2, 2);
        }
    }

    public void A2F() {
        if (!this.A03) {
            this.A03 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A02 = (AnonymousClass1C6) A0B.A7s.get();
            this.A01 = C36341k9.A0R(A0B);
            this.A00 = (C585730f) r1.A5s.get();
        }
    }

    public CallSpamActivity(int i) {
        this.A03 = false;
        C89314Wb.A00(this, 44);
    }

    public void onCreate(Bundle bundle) {
        String str;
        UserJid A0h;
        super.onCreate(bundle);
        Bundle A0H = C36371kC.A0H(this);
        String str2 = null;
        if (A0H == null || (A0h = C36391kE.A0h(A0H, "caller_jid")) == null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("callspamactivity/create/not-creating/bad-jid: ");
            if (A0H != null) {
                str2 = A0H.getString("caller_jid");
            }
            str = AnonymousClass000.A0q(str2, A0u);
        } else {
            AnonymousClass141 A08 = this.A01.A08(A0h);
            String string = A0H.getString("call_id");
            if (A08 == null || string == null) {
                str = "callspamactivity/create/not-creating/null-args";
            } else {
                C36341k9.A0r(this, getWindow(), R.color.f6nameremoved);
                getWindow().addFlags(2621440);
                setContentView((int) R.layout.f9nameremoved);
                C48812i6.A00(findViewById(R.id.call_spam_report), A0H, this, 24);
                C48812i6.A00(findViewById(R.id.call_spam_not_spam), A0h, this, 25);
                C48812i6.A00(findViewById(R.id.call_spam_block), A0H, this, 26);
                C585730f r0 = this.A00;
                r0.A00.add(this.A04);
                return;
            }
        }
        Log.e(str);
        finish();
    }

    public void onDestroy() {
        super.onDestroy();
        C585730f r0 = this.A00;
        r0.A00.remove(this.A04);
    }

    public void onStop() {
        super.onStop();
        finish();
    }

    public CallSpamActivity() {
        this(0);
        this.A04 = new AnonymousClass4ZB(this, 1);
    }
}
