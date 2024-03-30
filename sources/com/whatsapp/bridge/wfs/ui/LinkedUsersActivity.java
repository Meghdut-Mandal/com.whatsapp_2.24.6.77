package com.whatsapp.bridge.wfs.ui;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass011;
import X.AnonymousClass13E;
import X.AnonymousClass17Y;
import X.AnonymousClass190;
import X.AnonymousClass1UN;
import X.AnonymousClass24S;
import X.AnonymousClass3D0;
import X.AnonymousClass3KW;
import X.AnonymousClass3OD;
import X.AnonymousClass3TX;
import X.AnonymousClass658;
import X.AnonymousClass6OK;
import X.AnonymousClass6YV;
import X.C023509x;
import X.C03570Gk;
import X.C1274268g;
import X.C1502474n;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C19420v0;
import X.C20050ww;
import X.C20810yC;
import X.C24801Dv;
import X.C27111My;
import X.C29501Ww;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C36441kJ;
import X.C61003Ae;
import X.C64333No;
import X.C65983Uf;
import X.C67003Yd;
import X.C88424Sq;
import X.C89314Wb;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewStub;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.bridge.wfs.WfsManager$startWfs$1;
import com.whatsapp.registration.phonenumberentry.RegisterPhone;
import java.util.HashMap;
import java.util.Map;

public final class LinkedUsersActivity extends RegisterPhone implements C88424Sq {
    public C20050ww A00;
    public AnonymousClass3D0 A01;
    public AnonymousClass3OD A02;
    public Map A03;
    public boolean A04;

    public void Bkg(Integer num, String str, String str2, String str3, String str4, String str5, AnonymousClass011 r31, int i) {
        String str6;
        AnonymousClass011 r14 = r31;
        AnonymousClass00C.A0D(r14, 3);
        Map map = this.A03;
        if (map != null) {
            Object A0r = C36371kC.A0r(map, 551495536);
            if (A0r != null) {
                AnonymousClass1UN r3 = (AnonymousClass1UN) A0r;
                if (this.A0B.A0E(4972)) {
                    this.A09.A1l((String) r14.first, (String) r14.second);
                    r3.A04("PRECHAT_TEST");
                    AnonymousClass3TX r1 = this.A0N;
                    int i2 = i;
                    if (i2 == 2) {
                        str6 = "wfs_ig";
                    } else {
                        str6 = "wfs_fb";
                    }
                    r1.A07("wfs", str6);
                    getIntent().putExtra("should_show_notif", true);
                    super.A3p();
                    getIntent().removeExtra("should_show_notif");
                    Bnv();
                    ((ViewStub) C03570Gk.A0B(this, R.id.wfs_view_stub)).inflate();
                    TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C36361kB.A0D(this, R.id.tos_view);
                    HashMap A0J = AnonymousClass001.A0J();
                    Uri A012 = this.A04.A01("https://www.whatsapp.com/legal/privacy-policy", false, false, false);
                    AnonymousClass00C.A08(A012);
                    A0J.put("privacy-policy", A012);
                    Uri A013 = this.A04.A01("https://www.whatsapp.com/legal/terms-of-service", false, false, false);
                    AnonymousClass00C.A08(A013);
                    A0J.put("terms-and-privacy-policy", A013);
                    C20810yC r4 = this.A0D;
                    AnonymousClass17Y r32 = this.A05;
                    C24801Dv r2 = this.A01;
                    TextEmojiLabel textEmojiLabel2 = textEmojiLabel;
                    AnonymousClass17Y r18 = r32;
                    C24801Dv r17 = r2;
                    AnonymousClass6YV.A0G(this, r17, r18, textEmojiLabel2, this.A08, r4, getString(R.string.f12nameremoved), A0J);
                    textEmojiLabel.setHighlightColor(0);
                    C19420v0 r0 = this.A09;
                    C36341k9.A0w(C19420v0.A00(r0), "eula_accepted_time", System.currentTimeMillis());
                    String str7 = str4;
                    if (!(str4 == null || str7.length() == 0)) {
                        ImageView A0P = C36431kI.A0P(this, R.id.linked_user_logo);
                        AnonymousClass17Y r42 = this.A05;
                        C20050ww r33 = this.A00;
                        if (r33 != null) {
                            C20050ww r182 = r33;
                            AnonymousClass17Y r172 = r42;
                            new AnonymousClass658(r172, r182, this.A0J, C36441kJ.A0w(A0P.getContext().getCacheDir(), "linked_user_cache"), "linked_user_image").A01().A01(A0P, str7);
                        } else {
                            throw C36331k8.A0d("statistics");
                        }
                    }
                    C36401kF.A0H(this, R.id.number_view).setText(C65983Uf.A0E((String) r14.first, (String) r14.second));
                    C03570Gk.A0B(this, R.id.linked_user_login).setOnClickListener(new C67003Yd(this, num, str, str2, str3, str5, r14, i2));
                    C36361kB.A18(C03570Gk.A0B(this, R.id.linked_user_different), this, 22);
                    return;
                }
                r3.A04("PRECHAT_CONTROL");
                r3.A00();
                A0Q(this);
                return;
            }
            throw C36381kD.A0l();
        }
        throw C36331k8.A0d("xFamilyUserFlowLoggers");
    }

    public void Bkh(C64333No r5, String str, String str2) {
        boolean A1a = C36341k9.A1a(str, str2);
        AnonymousClass00C.A0D(r5, 2);
        A0h(this, r5, str, str2);
        C29501Ww.A02(this.A0J, 2, A1a);
        this.A0G.A00(false);
        this.A0J.A04();
        super.A3l(str, str2, r5.A02);
    }

    public void onCreate(Bundle bundle) {
        getIntent().putExtra("should_show_notif", false);
        super.onCreate(bundle);
        getIntent().removeExtra("should_show_notif");
        setContentView((int) R.layout.f9nameremoved);
        Bu2(0, R.string.f12nameremoved);
        AnonymousClass3D0 r0 = this.A01;
        if (r0 != null) {
            C61003Ae A012 = r0.A01();
            C18740tg.A06(A012);
            if (A012.A01) {
                AnonymousClass3OD r4 = this.A02;
                if (r4 != null) {
                    C1274268g r3 = A012.A00;
                    if (r3 != null) {
                        r4.A0B.Bp1(new C1502474n(r4, r3, this, 18));
                        return;
                    }
                    throw C36381kD.A0l();
                }
                throw C36331k8.A0d("wfsManager");
            }
            AnonymousClass3OD r7 = this.A02;
            if (r7 != null) {
                AnonymousClass6OK r8 = this.A0E;
                AnonymousClass00C.A07(r8);
                C36381kD.A1R(r7.A0D, new WfsManager$startWfs$1(this, this, r7, r8, (C023509x) null), r7.A0E);
                return;
            }
            throw C36331k8.A0d("wfsManager");
        }
        throw C36331k8.A0d("wfsBridgeFactory");
    }

    public static final void A0Q(LinkedUsersActivity linkedUsersActivity) {
        AnonymousClass3D0 r0 = linkedUsersActivity.A01;
        if (r0 != null) {
            C61003Ae A012 = r0.A01();
            C18740tg.A06(A012);
            A012.A02 = false;
            C29501Ww.A02(linkedUsersActivity.A0J, 0, true);
            linkedUsersActivity.startActivity(AnonymousClass190.A02(linkedUsersActivity));
            linkedUsersActivity.finish();
            return;
        }
        throw C36331k8.A0d("wfsBridgeFactory");
    }

    public static final void A0h(LinkedUsersActivity linkedUsersActivity, C64333No r3, String str, String str2) {
        linkedUsersActivity.A09.A1l(str, str2);
        linkedUsersActivity.A09.A1w(r3.A03);
        linkedUsersActivity.A09.A1v(false);
        linkedUsersActivity.A09.A1r(false);
        linkedUsersActivity.A0J.A0D(str, str2, r3.A02);
    }

    public void A2F() {
        if (!this.A04) {
            this.A04 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A05 = C36351kA.A0P(r2);
            AnonymousClass24S.A0L(r2, r1, this, r2.A91.get());
            AnonymousClass24S.A0K(A0L, r2, r1, this, r2.A9t.get());
            this.A0J = (AnonymousClass13E) r2.A96.get();
            this.A0B = C36391kE.A0S(r2);
            this.A0W = (AnonymousClass3KW) r2.ABK.get();
            AnonymousClass24S.A0I(A0L, r2, r1, C36401kF.A0c(r2), this);
            AnonymousClass24S.A0J(A0L, r2, r1, C36351kA.A0m(r2), this);
            this.A02 = C27111My.A0L(A0L);
            this.A00 = C36381kD.A0U(r2);
            this.A01 = (AnonymousClass3D0) r1.A4M.get();
            this.A03 = r1.A0A();
        }
    }

    public LinkedUsersActivity(int i) {
        this.A04 = false;
        C89314Wb.A00(this, 29);
    }

    public LinkedUsersActivity() {
        this(0);
    }
}
