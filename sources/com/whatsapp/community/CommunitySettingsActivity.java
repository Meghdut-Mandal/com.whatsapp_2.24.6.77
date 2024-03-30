package com.whatsapp.community;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass147;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass17X;
import X.AnonymousClass19A;
import X.AnonymousClass1EM;
import X.AnonymousClass1LV;
import X.AnonymousClass1PF;
import X.AnonymousClass1RJ;
import X.AnonymousClass2xY;
import X.AnonymousClass3QK;
import X.AnonymousClass49L;
import X.AnonymousClass49M;
import X.AnonymousClass4FM;
import X.AnonymousClass4JK;
import X.C000800j;
import X.C001400p;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C20350xQ;
import X.C20510xg;
import X.C21010yW;
import X.C220412q;
import X.C24381Cf;
import X.C27111My;
import X.C27541Op;
import X.C27561Or;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36421kH;
import X.C36431kI;
import X.C40111uw;
import X.C53102qm;
import X.C53592rZ;
import X.C53822rw;
import X.C55712v4;
import X.C65533Sl;
import X.C66933Xw;
import X.C80263v7;
import X.C87134Np;
import X.C89324Wc;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.reporttoadmin.xmpp.RtaXmppClient;
import com.whatsapp.settings.SettingsRowIconText;

public final class CommunitySettingsActivity extends AnonymousClass155 implements C87134Np {
    public AnonymousClass2xY A00;
    public AnonymousClass1LV A01;
    public AnonymousClass16D A02;
    public AnonymousClass171 A03;
    public C220412q A04;
    public C24381Cf A05;
    public AnonymousClass1PF A06;
    public AnonymousClass17X A07;
    public C21010yW A08;
    public C20350xQ A09;
    public C27541Op A0A;
    public C20510xg A0B;
    public AnonymousClass147 A0C;
    public AnonymousClass19A A0D;
    public C27561Or A0E;
    public RtaXmppClient A0F;
    public SettingsRowIconText A0G;
    public AnonymousClass1EM A0H;
    public AnonymousClass1RJ A0I;
    public boolean A0J;
    public final AnonymousClass00T A0K;
    public final AnonymousClass00T A0L;
    public final AnonymousClass00T A0M;

    public void A2F() {
        if (!this.A0J) {
            this.A0J = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r1 = A0L2.A5g;
            C36321k7.A0c(r1, this);
            C18830tt r3 = r1.A00;
            C36321k7.A0X(r1, r3, this, C36321k7.A05(r1, r3, this));
            this.A04 = C36351kA.A0a(r1);
            this.A08 = C36351kA.A0g(r1);
            this.A0F = C27111My.A3D(A0L2);
            this.A0D = C36361kB.A0c(r1);
            this.A02 = C36341k9.A0R(r1);
            this.A03 = C36341k9.A0S(r1);
            this.A09 = C36361kB.A0a(r1);
            this.A0H = C36371kC.A0l(r1);
            this.A0B = C36431kI.A0e(r1);
            this.A0E = r1.AKA();
            this.A05 = C36371kC.A0Y(r1);
            this.A0A = C36381kD.A0c(r1);
            this.A07 = C36351kA.A0b(r1);
            this.A06 = (AnonymousClass1PF) r1.A3s.get();
            this.A00 = (AnonymousClass2xY) A0L2.A0j.get();
            this.A01 = C36361kB.A0U(r1);
        }
    }

    public CommunitySettingsActivity(int i) {
        this.A0J = false;
        C89324Wc.A00(this, 8);
    }

    public void onCreate(Bundle bundle) {
        GroupJid groupJid;
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        C18820ts r1 = this.A00;
        AnonymousClass00C.A07(r1);
        C55712v4.A00(this, (Toolbar) C36361kB.A0D(this, R.id.toolbar), r1, C36361kB.A0m(this, R.string.f12nameremoved));
        this.A0I = C36351kA.A0r(this, R.id.community_settings_permissions_add_members);
        AnonymousClass1LV r12 = this.A01;
        if (r12 != null) {
            AnonymousClass00T r3 = this.A0L;
            AnonymousClass3QK A0L2 = C36421kH.A0L(r12, C36431kI.A0k(r3));
            C65533Sl r0 = AnonymousClass147.A01;
            if (A0L2 != null) {
                groupJid = A0L2.A02;
            } else {
                groupJid = null;
            }
            this.A0C = C65533Sl.A03(groupJid);
            if (bundle == null) {
                CommunitySettingsViewModel communitySettingsViewModel = (CommunitySettingsViewModel) this.A0M.getValue();
                AnonymousClass147 A0k = C36431kI.A0k(r3);
                AnonymousClass147 r4 = this.A0C;
                C40111uw r32 = (C40111uw) this.A0K.getValue();
                C36321k7.A0v(A0k, 0, r32);
                communitySettingsViewModel.A03 = A0k;
                communitySettingsViewModel.A02 = r4;
                C80263v7.A00(communitySettingsViewModel.A0C, communitySettingsViewModel, A0k, 21);
                if (r4 != null) {
                    communitySettingsViewModel.A01 = r32;
                    communitySettingsViewModel.A04.A0F(r32.A0C, new C53592rZ(new AnonymousClass4JK(communitySettingsViewModel), 1));
                }
            }
            SettingsRowIconText settingsRowIconText = (SettingsRowIconText) C36361kB.A0H(this, R.id.community_settings_permissions_add_groups);
            this.A0G = settingsRowIconText;
            if (settingsRowIconText == null) {
                throw C36331k8.A0d("allowNonAdminSubgroupCreation");
            }
            settingsRowIconText.setIcon((Drawable) null);
            SettingsRowIconText settingsRowIconText2 = this.A0G;
            if (settingsRowIconText2 == null) {
                throw C36331k8.A0d("allowNonAdminSubgroupCreation");
            }
            C66933Xw.A00(settingsRowIconText2, this, 40);
            AnonymousClass00T r42 = this.A0M;
            C53822rw.A01(this, ((CommunitySettingsViewModel) r42.getValue()).A0A, C53102qm.A02(this, 9), 10);
            if (this.A0C != null) {
                AnonymousClass1RJ r02 = this.A0I;
                if (r02 == null) {
                    throw C36331k8.A0d("membersAddSettingRow");
                }
                r02.A03(0);
                AnonymousClass1RJ r03 = this.A0I;
                if (r03 == null) {
                    throw C36331k8.A0d("membersAddSettingRow");
                }
                ((SettingsRowIconText) r03.A01()).setIcon((Drawable) null);
                AnonymousClass1RJ r04 = this.A0I;
                if (r04 == null) {
                    throw C36331k8.A0d("membersAddSettingRow");
                }
                SettingsRowIconText settingsRowIconText3 = (SettingsRowIconText) r04.A01();
                boolean A0E2 = this.A0D.A0E(7608);
                int i = R.string.f12nameremoved;
                if (A0E2) {
                    i = R.string.f12nameremoved;
                }
                settingsRowIconText3.setText((CharSequence) getString(i));
                AnonymousClass1RJ r05 = this.A0I;
                if (r05 == null) {
                    throw C36331k8.A0d("membersAddSettingRow");
                }
                C66933Xw.A00(r05.A01(), this, 39);
                C53822rw.A01(this, ((CommunitySettingsViewModel) r42.getValue()).A04, C53102qm.A02(this, 10), 9);
            }
            C53822rw.A01(this, ((CommunitySettingsViewModel) r42.getValue()).A0B, C53102qm.A02(this, 11), 8);
            return;
        }
        throw C36331k8.A0d("communityChatManager");
    }

    public CommunitySettingsActivity() {
        this(0);
        this.A0L = C001400p.A00(C000800j.PUBLICATION, new AnonymousClass4FM(this));
        this.A0M = C36431kI.A1I(new AnonymousClass49M(this));
        this.A0K = C36431kI.A1I(new AnonymousClass49L(this));
    }
}
