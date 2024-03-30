package com.whatsapp.calling;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass01L;
import X.AnonymousClass04G;
import X.AnonymousClass13J;
import X.AnonymousClass16D;
import X.AnonymousClass17Y;
import X.AnonymousClass1HJ;
import X.AnonymousClass1ND;
import X.AnonymousClass3FM;
import X.AnonymousClass3US;
import X.C107265Nh;
import X.C135006by;
import X.C18700tb;
import X.C18740tg;
import X.C19740wR;
import X.C20810yC;
import X.C20830yE;
import X.C21010yW;
import X.C222813r;
import X.C27011Mj;
import X.C28721Tt;
import X.C36321k7;
import X.C36401kF;
import X.C36411kG;
import X.C36441kJ;
import X.C89314Wb;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

public class VoipPermissionsActivity extends AnonymousClass01L implements C18700tb {
    public AnonymousClass17Y A00;
    public AnonymousClass1ND A01;
    public AnonymousClass16D A02;
    public C20830yE A03;
    public AnonymousClass1HJ A04;
    public C20810yC A05;
    public C21010yW A06;
    public AnonymousClass13J A07;
    public boolean A08;
    public int A09;
    public int A0A;
    public GroupJid A0B;
    public C107265Nh A0C;
    public String A0D;
    public String A0E;
    public List A0F;
    public boolean A0G;
    public boolean A0H;
    public final Object A0I;
    public volatile C27011Mj A0J;

    public final Object generatedComponent() {
        if (this.A0J == null) {
            synchronized (this.A0I) {
                if (this.A0J == null) {
                    this.A0J = new C27011Mj(this);
                }
            }
        }
        return this.A0J.generatedComponent();
    }

    public void onCreate(Bundle bundle) {
        Log.i("voip/VoipPermissionsActivity/onCreate");
        super.onCreate(bundle);
        Intent intent = getIntent();
        boolean booleanExtra = intent.getBooleanExtra("join_call_log", false);
        this.A0A = intent.getIntExtra("lobby_entry_point", 0);
        if (booleanExtra) {
            int intExtra = intent.getIntExtra("call_log_transaction_id", -1);
            String stringExtra = intent.getStringExtra("call_log_call_id");
            boolean booleanExtra2 = intent.getBooleanExtra("call_log_from_me", false);
            String stringExtra2 = intent.getStringExtra("call_log_user_jid");
            try {
                C222813r r0 = UserJid.Companion;
                this.A0C = AnonymousClass1HJ.A00(this.A04, new C135006by(intExtra, C222813r.A01(stringExtra2), stringExtra, booleanExtra2));
            } catch (C19740wR unused) {
                Log.e("voip/VoipPermissionsActivity/onCreate invalid jid");
                return;
            }
        } else {
            this.A0D = intent.getStringExtra("call_link_lobby_token");
            ArrayList A0u = C36401kF.A0u(intent, UserJid.class, "jids");
            this.A0F = A0u;
            if (this.A0D == null) {
                C18740tg.A0D(C36411kG.A1a(A0u), "There must be at least one jid");
            }
            this.A09 = intent.getIntExtra("call_from", -1);
            if (intent.hasExtra("group_jid")) {
                this.A0B = GroupJid.Companion.A02(intent.getStringExtra("group_jid"));
            }
        }
        this.A0G = intent.getBooleanExtra("video_call", false);
        this.A0H = intent.getBooleanExtra("voice_chat", false);
        int intExtra2 = intent.getIntExtra("permission_type", -1);
        this.A0E = intent.getStringExtra("scheduled_id");
        if (intExtra2 == 0) {
            AnonymousClass3US.A05(this, this.A00, this.A03, this.A07, this.A0G);
        } else if (intExtra2 != 1) {
            C36321k7.A1T("voip/VoipPermissionsActivity/onCreate unhandled permissionType: ", AnonymousClass000.A0u(), intExtra2);
        } else {
            Log.i("request/permission/checkPhonePermissionForVoipCall");
            AnonymousClass3FM r1 = new AnonymousClass3FM(this);
            r1.A01 = R.drawable.permission_call;
            r1.A02 = R.string.f12nameremoved;
            r1.A03 = R.string.f12nameremoved;
            AnonymousClass3FM.A01(r1, "android.permission.READ_PHONE_STATE");
            r1.A06 = true;
            startActivityForResult(r1.A02(), 156);
        }
    }

    public VoipPermissionsActivity(int i) {
        this.A0I = C36441kJ.A11();
        this.A08 = false;
        C89314Wb.A00(this, 34);
    }

    public AnonymousClass04G BAw() {
        return C28721Tt.A00(this, super.BAw());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f5, code lost:
        if (X.C34681hT.A0N(r2) != false) goto L_0x00f7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r17, int r18, android.content.Intent r19) {
        /*
            r16 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VoipPermissionsActivity onActivityResult got result: "
            r1.append(r0)
            r3 = r18
            r1.append(r3)
            java.lang.String r0 = " for request: "
            r1.append(r0)
            r4 = r17
            r1.append(r4)
            java.lang.String r0 = " data: "
            r2 = r19
            X.C36321k7.A1K(r2, r0, r1)
            r0 = 152(0x98, float:2.13E-43)
            r1 = 156(0x9c, float:2.19E-43)
            r6 = r16
            if (r4 == r0) goto L_0x0041
            if (r4 == r1) goto L_0x0041
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VoipPermissionsActivity onActivityResult unhandled request: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " result: "
            X.C36321k7.A1T(r0, r1, r3)
            super.onActivityResult(r4, r3, r2)
        L_0x003d:
            r6.finish()
            return
        L_0x0041:
            r0 = -1
            if (r3 != r0) goto L_0x00fd
            X.5Nh r0 = r6.A0C
            r11 = 1
            if (r0 != 0) goto L_0x00d9
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            java.util.List r0 = r6.A0F
            java.util.Iterator r2 = r0.iterator()
        L_0x0053:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0069
            X.11F r1 = X.C36401kF.A0a(r2)
            X.16D r0 = r6.A02
            X.141 r0 = r0.A08(r1)
            if (r0 == 0) goto L_0x0053
            r8.add(r0)
            goto L_0x0053
        L_0x0069:
            java.lang.String r0 = r6.A0D
            if (r0 == 0) goto L_0x0088
            java.lang.String r0 = "VoipPermissionsActivity onActivityResult starting call link lobby"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r0 = r6.A0A
            if (r0 != 0) goto L_0x0077
            r11 = 0
        L_0x0077:
            java.lang.String r0 = "Valid call link lobby entry point required"
            X.C18740tg.A0D(r11, r0)
            X.1ND r3 = r6.A01
            java.lang.String r2 = r6.A0D
            boolean r1 = r6.A0G
            int r0 = r6.A0A
            r3.BmF(r6, r2, r0, r1)
            goto L_0x003d
        L_0x0088:
            java.lang.String r0 = r6.A0E
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00af
            X.0yC r0 = r6.A05
            boolean r0 = X.C34681hT.A0M(r0)
            if (r0 == 0) goto L_0x00af
            java.lang.String r0 = "VoipPermissionsActivity onActivityResult start precall lobby"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1ND r9 = r6.A01
            boolean r1 = r6.A0G
            com.whatsapp.jid.GroupJid r11 = r6.A0B
            java.lang.String r12 = r6.A0E
            int r0 = r6.A0A
            r10 = r6
            r13 = r8
            r14 = r0
            r15 = r1
            r9.Bui(r10, r11, r12, r13, r14, r15)
            goto L_0x003d
        L_0x00af:
            boolean r0 = r6.A0H
            if (r0 == 0) goto L_0x00c7
            java.lang.String r0 = "VoipPermissionsActivity onActivityResult starting voice chat"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1ND r5 = r6.A01
            int r9 = r6.A09
            com.whatsapp.jid.GroupJid r7 = r6.A0B
            X.1NE r5 = (X.AnonymousClass1NE) r5
            r10 = 0
            r12 = 0
            r5.BPc(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x003d
        L_0x00c7:
            java.lang.String r0 = "VoipPermissionsActivity onActivityResult starting call"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1ND r5 = r6.A01
            int r9 = r6.A09
            boolean r10 = r6.A0G
            com.whatsapp.jid.GroupJid r7 = r6.A0B
            r5.Buc(r6, r7, r8, r9, r10)
            goto L_0x003d
        L_0x00d9:
            int r0 = r6.A0A
            if (r0 != 0) goto L_0x00de
            r11 = 0
        L_0x00de:
            java.lang.String r0 = "Valid re-join lobby entry point required"
            X.C18740tg.A0D(r11, r0)
            X.1ND r5 = r6.A01
            X.5Nh r4 = r6.A0C
            int r3 = r6.A0A
            X.0yC r2 = r6.A05
            int r1 = r4.A08
            r0 = 2
            if (r1 != r0) goto L_0x00f7
            boolean r1 = X.C34681hT.A0N(r2)
            r0 = 1
            if (r1 == 0) goto L_0x00f8
        L_0x00f7:
            r0 = 0
        L_0x00f8:
            r5.BNr(r6, r4, r3, r0)
            goto L_0x003d
        L_0x00fd:
            if (r4 != r1) goto L_0x003d
            if (r18 != 0) goto L_0x003d
            X.2OC r1 = new X.2OC
            r1.<init>()
            java.lang.String r0 = "voip_call_fail_phone_perm_denied"
            r1.A00 = r0
            X.0yW r0 = r6.A06
            r0.Bly(r1)
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.VoipPermissionsActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    public VoipPermissionsActivity() {
        this(0);
        this.A0F = AnonymousClass001.A0I();
        this.A0D = null;
    }
}
