package com.whatsapp.xfamily.groups.ui;

import X.AnonymousClass000;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass141;
import X.AnonymousClass144;
import X.AnonymousClass147;
import X.AnonymousClass171;
import X.AnonymousClass17Y;
import X.AnonymousClass19A;
import X.AnonymousClass1EM;
import X.AnonymousClass1L0;
import X.AnonymousClass1UN;
import X.AnonymousClass22g;
import X.AnonymousClass27v;
import X.AnonymousClass3T1;
import X.AnonymousClass4P3;
import X.C1501674f;
import X.C18800tq;
import X.C18830tt;
import X.C18840tu;
import X.C20350xQ;
import X.C20810yC;
import X.C24801Dv;
import X.C27111My;
import X.C27591Ow;
import X.C33511fU;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36421kH;
import X.C36431kI;
import X.C46332Wm;
import X.C55862vJ;
import X.C599535x;
import X.C62463Gg;
import X.C81293wm;
import X.C87884Qn;
import X.C89374Wh;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.net.URLEncoder;
import java.util.Map;

public final class LinkExistingGroupActivity extends AnonymousClass27v implements AnonymousClass4P3, C87884Qn {
    public AnonymousClass147 A00;
    public C599535x A01;
    public AnonymousClass1UN A02;
    public AnonymousClass005 A03;
    public AnonymousClass005 A04;
    public AnonymousClass005 A05;
    public AnonymousClass005 A06;
    public AnonymousClass005 A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public Map A0D;
    public boolean A0E;

    public void A3w(C62463Gg r5, AnonymousClass141 r6) {
        TextEmojiLabel textEmojiLabel = r5.A02;
        textEmojiLabel.setSingleLine(false);
        textEmojiLabel.setMaxLines(2);
        if (r6.A0G()) {
            textEmojiLabel.setVisibility(0);
            AnonymousClass171 r2 = this.A0B;
            Jid A062 = r6.A06(AnonymousClass144.class);
            AnonymousClass00C.A0E(A062, "null cannot be cast to non-null type com.whatsapp.jid.MultipleParticipantJid");
            textEmojiLabel.A0I((String) r2.A08.get(A062));
            r5.A01(r6.A0x);
            return;
        }
        super.A3w(r5, r6);
    }

    public void B2c(AnonymousClass141 r3) {
        AnonymousClass00C.A0D(r3, 0);
        AnonymousClass1UN r1 = this.A02;
        if (r1 == null) {
            throw C36331k8.A0d("xFamilyUserFlowLogger");
        }
        r1.A04("TAP_EXISTING_GROUP");
        super.B2c(r3);
    }

    public void Bop() {
        A0z(this, true);
    }

    private final void A0w() {
        AnonymousClass1UN r1 = this.A02;
        if (r1 == null) {
            throw C36331k8.A0d("xFamilyUserFlowLogger");
        }
        r1.A04("REDIRECT_TO_FB");
        if (AnonymousClass1L0.A00(this, "com.facebook.katana") == -1 && AnonymousClass1L0.A00(this, "com.facebook.wakizashi") == -1) {
            Log.w("LinkExistingGroupActivity/redirectToFB FB app not found");
            AnonymousClass1UN r12 = this.A02;
            if (r12 == null) {
                throw C36331k8.A0d("xFamilyUserFlowLogger");
            }
            r12.A02("EXIT_GROUP_SELECTION");
            this.A05.A06(R.string.f12nameremoved, 0);
        } else {
            C24801Dv r3 = this.A01;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("fb://event/");
            String str = this.A08;
            if (str == null) {
                throw C36331k8.A0d("eventId");
            }
            A0u.append(URLEncoder.encode(str, DefaultCrypto.UTF_8));
            A0u.append("?wa_invite_uri=");
            A0u.append(URLEncoder.encode(this.A0B, DefaultCrypto.UTF_8));
            A0u.append("&wa_group_name=");
            String A0q = AnonymousClass000.A0q(URLEncoder.encode(this.A0C, DefaultCrypto.UTF_8), A0u);
            AnonymousClass00C.A08(A0q);
            C36321k7.A1Q("LinkExistingGroupActivity/generateFBDeeplink generated: ", A0q, AnonymousClass000.A0u());
            r3.Bp7(this, Uri.parse(A0q), (AnonymousClass3T1) null);
            AnonymousClass1UN r0 = this.A02;
            if (r0 == null) {
                throw C36331k8.A0d("xFamilyUserFlowLogger");
            }
            r0.A00();
        }
        finishAndRemoveTask();
    }

    public static final void A0x(LinkExistingGroupActivity linkExistingGroupActivity) {
        C599535x r3 = linkExistingGroupActivity.A01;
        if (r3 != null) {
            r3.A00.set(true);
            r3.A01.Bp3(new C1501674f(r3, 22));
        }
        Intent A0D2 = C36431kI.A0D();
        A0D2.putExtra("is_success", true);
        A0D2.putExtra("selected_group_name", linkExistingGroupActivity.A0C);
        A0D2.putExtra("selected_group_link", linkExistingGroupActivity.A0B);
        String str = linkExistingGroupActivity.A08;
        if (str == null) {
            throw C36331k8.A0d("eventId");
        }
        A0D2.putExtra("event_id", str);
        linkExistingGroupActivity.setResult(-1, A0D2);
        linkExistingGroupActivity.A0w();
    }

    public void A2F() {
        if (!this.A0E) {
            this.A0E = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            AnonymousClass22g.A0l(this);
            AnonymousClass22g.A0h(r2, r1, this);
            AnonymousClass22g.A0L(A0L, r2, this);
            this.A03 = C18840tu.A00(r2.A1l);
            this.A06 = C18840tu.A00(r2.A4x);
            this.A05 = C18840tu.A00(r2.A3l);
            this.A04 = C18840tu.A00(r2.A3k);
            this.A07 = C18840tu.A00(r2.A5M);
            this.A0D = r1.A0A();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 11) {
            if (i != 150) {
                super.onActivityResult(i, i2, intent);
            } else if (i2 != -1) {
                Log.i("LinkExistingGroupActivity/contact access permissions denied");
                AnonymousClass1UN r1 = this.A02;
                if (r1 == null) {
                    throw C36331k8.A0d("xFamilyUserFlowLogger");
                }
                r1.A04("SEE_NO_CONTACT_ACCESS");
                finish();
            }
        } else if (i2 == -1 && intent != null) {
            AnonymousClass147 A062 = AnonymousClass147.A01.A06(intent.getStringExtra("group_jid"));
            C36321k7.A1K(A062, "LinkExistingGroupActivity/group created ", C36421kH.A0f(A062));
            AnonymousClass141 A0D2 = this.A09.A0D(A062);
            this.A0c.clear();
            super.B2c(A0D2);
        }
    }

    public LinkExistingGroupActivity(int i) {
        this.A0E = false;
        C89374Wh.A00(this, 27);
    }

    public static final void A0z(LinkExistingGroupActivity linkExistingGroupActivity, boolean z) {
        C599535x r0;
        C36321k7.A1X("LinkExistingGroupActivity/sendGetLink/recreate:", AnonymousClass000.A0u(), z);
        LinkExistingGroupActivity linkExistingGroupActivity2 = linkExistingGroupActivity;
        AnonymousClass147 r4 = linkExistingGroupActivity.A00;
        if (r4 != null) {
            if (z && (r0 = linkExistingGroupActivity.A01) != null) {
                r0.A01.A0I(new C81293wm(r0), 500);
            }
            C20810yC r7 = linkExistingGroupActivity.A0D;
            AnonymousClass17Y r6 = linkExistingGroupActivity.A05;
            AnonymousClass005 r02 = linkExistingGroupActivity.A06;
            if (r02 != null) {
                AnonymousClass19A r10 = (AnonymousClass19A) r02.get();
                AnonymousClass005 r03 = linkExistingGroupActivity2.A07;
                if (r03 != null) {
                    new C46332Wm(r6, r7, linkExistingGroupActivity2, (C27591Ow) r03.get(), r10, z).A07(r4);
                    return;
                }
                throw C36331k8.A0d("mexGraphqlClient");
            }
            throw C36331k8.A0d("messageClient");
        }
        Log.e("LinkExistingGroupActivity/sendGetLink/inviteCode empty");
    }

    public void A3t(View view, View view2, View view3, View view4) {
        ViewParent viewParent;
        super.A3t(view, view2, view3, view4);
        C36331k8.A0y(view3);
        View A0J = C36371kC.A0J(getLayoutInflater(), this.A02, R.layout.f9nameremoved, false);
        TextView A0M = C36341k9.A0M(A0J, R.id.link_existing_group_picker_title);
        C33511fU.A03(A0M);
        A0M.setText(R.string.f12nameremoved);
        View A0G = C36361kB.A0G(A0J, R.id.add_groups_new_group);
        C36351kA.A1E(A0G, this, 44);
        C33511fU.A03(C36341k9.A0M(A0G, R.id.create_new_group_text));
        if (view4 != null) {
            viewParent = view4.getParent();
        } else {
            viewParent = null;
        }
        ViewGroup viewGroup = (ViewGroup) viewParent;
        if (viewGroup != null) {
            viewGroup.addView(A0J, 0);
        }
    }

    public void BZi(String str, int i, boolean z) {
        String A0p;
        StringBuilder A0u = AnonymousClass000.A0u();
        if (str != null) {
            A0u.append("LinkExistingGroupActivity/onLinkReceived/gotcode/");
            A0u.append(str);
            C36321k7.A1X(" recreate:", A0u, z);
            AnonymousClass147 r1 = this.A00;
            if (r1 != null) {
                AnonymousClass005 r0 = this.A04;
                if (r0 != null) {
                    ((C20350xQ) r0.get()).A14.put(r1, str);
                } else {
                    throw C36331k8.A0d("groupChatManager");
                }
            }
            this.A0A = str;
            if (str.length() == 0) {
                A0p = null;
            } else {
                A0p = AnonymousClass000.A0p("https://chat.whatsapp.com/", str, AnonymousClass000.A0u());
            }
            this.A0B = A0p;
            A0x(this);
            return;
        }
        C36321k7.A1T("LinkExistingGroupActivity/onLinkReceived/failed/", A0u, i);
        if (i == 436) {
            AnonymousClass147 r12 = this.A00;
            if (r12 != null) {
                AnonymousClass005 r02 = this.A04;
                if (r02 != null) {
                    ((C20350xQ) r02.get()).A14.remove(r12);
                    return;
                }
                throw C36331k8.A0d("groupChatManager");
            }
            return;
        }
        C599535x r3 = this.A01;
        if (r3 != null) {
            r3.A00.set(true);
            r3.A01.Bp3(new C1501674f(r3, 22));
        }
        AnonymousClass005 r03 = this.A05;
        if (r03 != null) {
            this.A05.A06(C55862vJ.A00(i, ((AnonymousClass1EM) r03.get()).A06(this.A00)), 0);
            String str2 = this.A0A;
            if (str2 == null || str2.length() == 0) {
                A0w();
                return;
            }
            return;
        }
        throw C36331k8.A0d("groupChatUtils");
    }

    public void onBackPressed() {
        A3p();
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        Map map = this.A0D;
        if (map != null) {
            Object A0r = C36371kC.A0r(map, 1004342578);
            if (A0r != null) {
                AnonymousClass1UN r1 = (AnonymousClass1UN) A0r;
                this.A02 = r1;
                if (r1 == null) {
                    throw C36331k8.A0d("xFamilyUserFlowLogger");
                }
                r1.A05("INIT_GROUP_SELECTION", 1004342578);
                boolean z = true;
                if (getIntent() == null || (stringExtra = getIntent().getStringExtra("event_id")) == null || stringExtra.length() == 0 || !this.A0D.A0E(3989)) {
                    z = false;
                }
                if (!z) {
                    setResult(-1, C36431kI.A0D().putExtra("is_success", false));
                    Log.w("LinkExistingGroupActivity/onCreate invalid request");
                    AnonymousClass1UN r0 = this.A02;
                    if (r0 == null) {
                        throw C36331k8.A0d("xFamilyUserFlowLogger");
                    }
                    r0.A02("EXIT_GROUP_SELECTION");
                    finish();
                }
                if (!this.A0A.A03()) {
                    Log.w("LinkExistingGroupActivity/onCreate registration");
                    AnonymousClass1UN r02 = this.A02;
                    if (r02 == null) {
                        throw C36331k8.A0d("xFamilyUserFlowLogger");
                    }
                    r02.A02("EXIT_GROUP_SELECTION");
                    C36351kA.A12(this);
                }
                if (C36331k8.A06(this).contains("tos_2016_opt_out_state") && this.A09.A2M()) {
                    Log.w("LinkExistingGroupActivity/onCreate opt out");
                    AnonymousClass1UN r03 = this.A02;
                    if (r03 == null) {
                        throw C36331k8.A0d("xFamilyUserFlowLogger");
                    }
                    r03.A02("EXIT_GROUP_SELECTION");
                    finish();
                }
                this.A08 = String.valueOf(getIntent().getStringExtra("event_id"));
                this.A09 = getIntent().getStringExtra("event_name");
                AnonymousClass17Y r12 = this.A05;
                AnonymousClass00C.A07(r12);
                this.A01 = new C599535x(r12);
                AnonymousClass1UN r13 = this.A02;
                if (r13 == null) {
                    throw C36331k8.A0d("xFamilyUserFlowLogger");
                }
                r13.A04("SEE_GROUP_SELECTION");
                return;
            }
            throw C36381kD.A0l();
        }
        throw C36331k8.A0d("xFamilyUserFlowLoggers");
    }

    public LinkExistingGroupActivity() {
        this(0);
    }
}
