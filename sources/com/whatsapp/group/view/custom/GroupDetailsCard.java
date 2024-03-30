package com.whatsapp.group.view.custom;

import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass00N;
import X.AnonymousClass00T;
import X.AnonymousClass05R;
import X.AnonymousClass13J;
import X.AnonymousClass141;
import X.AnonymousClass147;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass17X;
import X.AnonymousClass190;
import X.AnonymousClass1EL;
import X.AnonymousClass1EM;
import X.AnonymousClass1H2;
import X.AnonymousClass1LI;
import X.AnonymousClass1ND;
import X.AnonymousClass1QZ;
import X.AnonymousClass3SF;
import X.AnonymousClass3TV;
import X.AnonymousClass3UG;
import X.AnonymousClass3Y2;
import X.AnonymousClass3Y3;
import X.AnonymousClass4C1;
import X.AnonymousClass4PT;
import X.C012005e;
import X.C023109s;
import X.C18700tb;
import X.C18800tq;
import X.C18820ts;
import X.C18840tu;
import X.C19420v0;
import X.C19630wG;
import X.C19730wQ;
import X.C20350xQ;
import X.C20570xm;
import X.C20810yC;
import X.C225314u;
import X.C232317r;
import X.C24801Dv;
import X.C27851Qb;
import X.C27861Qc;
import X.C34681hT;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36431kI;
import X.C36441kJ;
import X.C45632Sc;
import X.C48752hz;
import X.C49202ij;
import X.C49212ik;
import X.C53402rG;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.OnLifecycleEvent;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.callconfirmationsheet.ui.LGCCallConfirmationSheet;
import com.whatsapp.calling.fragment.CallConfirmationFragment;
import com.whatsapp.group.GroupCallButtonController;
import com.whatsapp.jid.Jid;

public final class GroupDetailsCard extends LinearLayout implements C18700tb, AnonymousClass00N {
    public C24801Dv A00;
    public C19730wQ A01;
    public AnonymousClass1LI A02;
    public AnonymousClass1ND A03;
    public AnonymousClass4PT A04;
    public AnonymousClass16D A05;
    public AnonymousClass171 A06;
    public C19630wG A07;
    public C19420v0 A08;
    public C18820ts A09;
    public AnonymousClass17X A0A;
    public C232317r A0B;
    public AnonymousClass141 A0C;
    public AnonymousClass1H2 A0D;
    public C20810yC A0E;
    public C45632Sc A0F;
    public GroupCallButtonController A0G;
    public C20350xQ A0H;
    public AnonymousClass1EL A0I;
    public AnonymousClass147 A0J;
    public AnonymousClass1EM A0K;
    public AnonymousClass13J A0L;
    public AnonymousClass005 A0M;
    public AnonymousClass1QZ A0N;
    public Integer A0O;
    public View A0P;
    public View A0Q;
    public View A0R;
    public View A0S;
    public View A0T;
    public TextView A0U;
    public TextEmojiLabel A0V;
    public AnonymousClass3SF A0W;
    public WaTextView A0X;
    public AnonymousClass3TV A0Y;
    public boolean A0Z;
    public final AnonymousClass00T A0a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupDetailsCard(Context context) {
        super(context);
        AnonymousClass00C.A0D(context, 1);
        A04();
        this.A0a = C36431kI.A1I(new AnonymousClass4C1(this));
        LayoutInflater.from(getContext()).inflate(R.layout.f9nameremoved, this, true);
        View A022 = C012005e.A02(this, R.id.action_message);
        AnonymousClass00C.A08(A022);
        this.A0S = A022;
        View A023 = C012005e.A02(this, R.id.action_add_person);
        AnonymousClass00C.A08(A023);
        this.A0P = A023;
        View A024 = C012005e.A02(this, R.id.action_search_chat);
        AnonymousClass00C.A08(A024);
        this.A0R = A024;
        View A025 = C012005e.A02(this, R.id.action_call);
        AnonymousClass00C.A08(A025);
        this.A0Q = A025;
        View A026 = C012005e.A02(this, R.id.action_videocall);
        AnonymousClass00C.A08(A026);
        this.A0T = A026;
        View A027 = C012005e.A02(this, R.id.group_details_card_subtitle);
        AnonymousClass00C.A08(A027);
        this.A0V = (TextEmojiLabel) A027;
        View A028 = C012005e.A02(this, R.id.announcements_subtitle_number_of_participants);
        AnonymousClass00C.A08(A028);
        this.A0U = (TextView) A028;
        View A029 = C012005e.A02(this, R.id.group_second_subtitle);
        AnonymousClass00C.A08(A029);
        this.A0X = (WaTextView) A029;
        this.A0W = AnonymousClass3SF.A01(this, getTextEmojiLabelViewControllerFactory(), R.id.group_title);
        A01();
    }

    public static /* synthetic */ void getGroupCallButton$annotations() {
    }

    public static /* synthetic */ void getGroupCallButtonController$annotations() {
    }

    public static /* synthetic */ void getSearchChatButton$annotations() {
    }

    public static /* synthetic */ void getVideoCallButton$annotations() {
    }

    private final void setSubtitleNumberOfParticipantsText(String str) {
        if (!(str == null || str.length() == 0)) {
            AnonymousClass1EL suspensionManager = getSuspensionManager();
            AnonymousClass141 r0 = this.A0C;
            if (r0 == null) {
                throw C36331k8.A0d("groupChat");
            } else if (!suspensionManager.A01(r0)) {
                AnonymousClass1EL suspensionManager2 = getSuspensionManager();
                AnonymousClass141 r02 = this.A0C;
                if (r02 == null) {
                    throw C36331k8.A0d("groupChat");
                } else if (!suspensionManager2.A00(r02)) {
                    TextView textView = this.A0U;
                    textView.setVisibility(0);
                    textView.setText(str);
                    return;
                }
            }
        }
        this.A0U.setVisibility(8);
    }

    public static final void setupClickListeners$lambda$1(GroupDetailsCard groupDetailsCard, View view) {
        AnonymousClass00C.A0D(groupDetailsCard, 0);
        C45632Sc r1 = groupDetailsCard.A0F;
        if (r1 == null) {
            throw C36331k8.A0d("wamGroupInfo");
        }
        r1.A08 = true;
        C24801Dv activityUtils = groupDetailsCard.getActivityUtils();
        Context context = groupDetailsCard.getContext();
        AnonymousClass190 A0j = C36441kJ.A0j();
        Context context2 = groupDetailsCard.getContext();
        AnonymousClass141 r0 = groupDetailsCard.A0C;
        if (r0 == null) {
            throw C36331k8.A0d("groupChat");
        }
        activityUtils.A08(context, C36391kE.A0F(context2, A0j, C36351kA.A0j(r0)).putExtra("args_conversation_screen_entry_point", 1).putExtra("extra_show_search_on_create", true), "GroupChatInfoActivity");
    }

    public static final void setupClickListeners$lambda$2(GroupDetailsCard groupDetailsCard, View view) {
        AnonymousClass00C.A0D(groupDetailsCard, 0);
        C45632Sc r2 = groupDetailsCard.A0F;
        if (r2 == null) {
            throw C36331k8.A0d("wamGroupInfo");
        }
        r2.A0A = true;
        A02(groupDetailsCard.A0T, groupDetailsCard, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0099, code lost:
        if (r3.A00.A05(r7) != 2) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c9, code lost:
        if (getGroupChatManager().A0M(r10) != 1) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0195, code lost:
        if (r0 != false) goto L_0x0197;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.AnonymousClass141 r10, com.whatsapp.group.GroupCallButtonController r11, X.AnonymousClass147 r12, int r13, boolean r14) {
        /*
            r9 = this;
            r0 = 1
            X.C36321k7.A0v(r10, r0, r11)
            r9.A0C = r10
            r9.A0G = r11
            java.lang.Class<X.147> r1 = X.AnonymousClass147.class
            com.whatsapp.jid.Jid r7 = X.C36381kD.A0e(r10, r1)
            X.AnonymousClass00C.A08(r7)
            X.147 r7 = (X.AnonymousClass147) r7
            r9.A0J = r7
            if (r7 != 0) goto L_0x001e
            java.lang.String r0 = "gid"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x001e:
            android.content.Context r2 = r9.getContext()
            boolean r2 = r2 instanceof X.AnonymousClass01L
            if (r2 == 0) goto L_0x0055
            X.0yC r2 = r9.getAbProps()
            boolean r2 = X.C34681hT.A0L(r2)
            if (r2 == 0) goto L_0x0055
            X.17r r2 = r9.getParticipantUserStore()
            boolean r2 = r2.A0M(r7)
            if (r2 == 0) goto L_0x0055
            android.content.Context r3 = r9.getContext()
            java.lang.Class<X.01L> r2 = X.AnonymousClass01L.class
            android.app.Activity r4 = X.C24801Dv.A01(r3, r2)
            X.01L r4 = (X.AnonymousClass01L) r4
            X.4PT r3 = r9.getGroupCallMenuHelperFactory()
            X.3e7 r2 = new X.3e7
            r2.<init>(r10, r9, r7)
            X.3TV r2 = r3.B47(r4, r2, r7, r0)
            r9.A0Y = r2
        L_0x0055:
            X.0yC r2 = r9.getAbProps()
            boolean r2 = X.AnonymousClass3M0.A00(r10, r2)
            if (r2 == 0) goto L_0x0150
            X.0wG r5 = r9.getWaContext()
            X.0wQ r2 = r9.getMeManager()
            X.16D r3 = r9.getContactManager()
            X.171 r4 = r9.getWaContactNames()
            X.17X r6 = r9.getGroupParticipantsManager()
            r8 = 3
            java.lang.String r3 = X.AnonymousClass3SP.A01(r2, r3, r4, r5, r6, r7, r8)
        L_0x0078:
            boolean r2 = r10.A0O()
            r9.A06(r3, r2)
            X.1EM r2 = r9.getGroupChatUtils()
            boolean r6 = r2.A05(r7)
            X.1EM r3 = r9.getGroupChatUtils()
            boolean r2 = r3.A01()
            if (r2 == 0) goto L_0x009b
            X.12q r2 = r3.A00
            int r3 = r2.A05(r7)
            r2 = 2
            r5 = 1
            if (r3 == r2) goto L_0x009c
        L_0x009b:
            r5 = 0
        L_0x009c:
            X.1EM r3 = r9.getGroupChatUtils()
            X.12q r2 = r3.A00
            int r2 = r2.A05(r7)
            boolean r2 = r3.A02(r2)
            boolean r2 = X.AnonymousClass000.A1P(r2)
            r3 = 8
            r4 = 0
            if (r6 == 0) goto L_0x00f8
            r5 = 2131888046(0x7f1207ae, float:1.9410716E38)
            android.content.res.Resources r2 = r9.getResources()
            java.lang.String r2 = r2.getString(r5)
            r9.setSubtitleText(r2)
            X.0xQ r2 = r9.getGroupChatManager()
            int r2 = r2.A0M(r10)
            if (r2 == r0) goto L_0x00d9
        L_0x00cb:
            android.content.res.Resources r2 = r9.getResources()
            r0 = 2131755135(0x7f10007f, float:1.914114E38)
            java.lang.String r0 = X.C36321k7.A0B(r2, r13, r4, r0)
            r9.setSubtitleNumberOfParticipantsText(r0)
        L_0x00d9:
            X.0yC r2 = r9.getAbProps()
            r0 = 5525(0x1595, float:7.742E-42)
            boolean r0 = r2.A0E(r0)
            java.lang.String r6 = "groupChat"
            X.17X r5 = r9.getGroupParticipantsManager()
            if (r0 == 0) goto L_0x015f
            X.1EL r2 = r9.getSuspensionManager()
            X.141 r0 = r9.A0C
            if (r0 != 0) goto L_0x015a
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r6)
            throw r0
        L_0x00f8:
            if (r5 != 0) goto L_0x00fc
            if (r2 == 0) goto L_0x0131
        L_0x00fc:
            X.17X r2 = r9.getGroupParticipantsManager()
            boolean r2 = r2.A0C(r7)
            if (r2 == 0) goto L_0x0131
            X.171 r2 = r9.getWaContactNames()
            java.lang.String r6 = r2.A0U(r12)
            boolean r2 = X.AnonymousClass14B.A0F(r6)
            if (r2 != 0) goto L_0x0125
            android.content.res.Resources r5 = r9.getResources()
            r2 = 2131894707(0x7f1221b3, float:1.9424226E38)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r0 = X.C36411kG.A0w(r5, r6, r0, r4, r2)
        L_0x0121:
            r9.setSubtitleText(r0)
            goto L_0x00cb
        L_0x0125:
            android.content.res.Resources r2 = r9.getResources()
            r0 = 2131894708(0x7f1221b4, float:1.9424228E38)
            java.lang.String r0 = r2.getString(r0)
            goto L_0x0121
        L_0x0131:
            X.1EL r0 = r9.getSuspensionManager()
            boolean r0 = r0.A01(r10)
            if (r0 == 0) goto L_0x0141
            com.whatsapp.TextEmojiLabel r0 = r9.A0V
            r0.setVisibility(r3)
            goto L_0x00d9
        L_0x0141:
            android.content.res.Resources r2 = r9.getResources()
            r0 = 2131755144(0x7f100088, float:1.9141159E38)
            java.lang.String r0 = X.C36321k7.A0B(r2, r13, r4, r0)
            r9.setSubtitleText(r0)
            goto L_0x00d9
        L_0x0150:
            X.171 r2 = r9.getWaContactNames()
            java.lang.String r3 = r2.A0H(r10)
            goto L_0x0078
        L_0x015a:
            boolean r2 = X.AnonymousClass3RA.A01(r5, r0, r2)
            goto L_0x0198
        L_0x015f:
            X.147 r0 = r9.A0J
            if (r0 != 0) goto L_0x016a
            java.lang.String r0 = "gid"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x016a:
            boolean r0 = r5.A0D(r0)
            if (r0 == 0) goto L_0x0197
            X.1EL r2 = r9.getSuspensionManager()
            X.141 r0 = r9.A0C
            if (r0 != 0) goto L_0x017d
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r6)
            throw r0
        L_0x017d:
            boolean r0 = r2.A01(r0)
            if (r0 != 0) goto L_0x0197
            X.1EL r2 = r9.getSuspensionManager()
            X.141 r0 = r9.A0C
            if (r0 != 0) goto L_0x0190
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r6)
            throw r0
        L_0x0190:
            boolean r0 = r2.A00(r0)
            r2 = 1
            if (r0 == 0) goto L_0x0198
        L_0x0197:
            r2 = 0
        L_0x0198:
            android.view.View r0 = r9.A0P
            X.C36421kH.A0v(r0, r2, r4, r3)
            android.view.View r2 = r9.A0S
            int r0 = X.C36351kA.A00(r14)
            r2.setVisibility(r0)
            android.view.View r0 = r9.A0R
            if (r14 != 0) goto L_0x01ab
            r3 = 0
        L_0x01ab:
            r0.setVisibility(r3)
            android.view.View r2 = r9.A0R
            X.1EL r0 = r9.getSuspensionManager()
            boolean r0 = r0.A02(r7)
            r0 = r0 ^ 1
            r2.setEnabled(r0)
            X.141 r0 = r11.A03
            if (r0 == r10) goto L_0x01ed
            X.2ik r0 = r11.A01
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L_0x01cc
            r0.A0D(r2)
            r11.A01 = r3
        L_0x01cc:
            X.2ij r0 = r11.A00
            if (r0 == 0) goto L_0x01d5
            r0.A0D(r2)
            r11.A00 = r3
        L_0x01d5:
            r11.A03 = r3
            r11.A05 = r3
            java.lang.Integer r0 = X.C023109s.A00
            r11.A08 = r0
            r11.A06 = r3
            r11.A04 = r3
            r11.A02 = r3
            r11.A03 = r10
            com.whatsapp.jid.Jid r0 = X.C36381kD.A0e(r10, r1)
            X.147 r0 = (X.AnonymousClass147) r0
            r11.A05 = r0
        L_0x01ed:
            X.31u r0 = new X.31u
            r0.<init>(r9)
            r11.A04 = r0
            A03(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.view.custom.GroupDetailsCard.A05(X.141, com.whatsapp.group.GroupCallButtonController, X.147, int, boolean):void");
    }

    public final void setAbProps(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0E = r2;
    }

    public final void setActivityUtils(C24801Dv r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setCallsManager(AnonymousClass1ND r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    public final void setContactManager(AnonymousClass16D r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A05 = r2;
    }

    public final void setDependencyBridgeRegistryLazy(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0M = r2;
    }

    public final void setEmojiLoader(AnonymousClass1H2 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0D = r2;
    }

    public final void setGroupCallButton(View view) {
        AnonymousClass00C.A0D(view, 0);
        this.A0Q = view;
    }

    public final void setGroupCallMenuHelperFactory(AnonymousClass4PT r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A04 = r2;
    }

    public final void setGroupChatManager(C20350xQ r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0H = r2;
    }

    public final void setGroupChatUtils(AnonymousClass1EM r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0K = r2;
    }

    public final void setGroupInfoLoggingEvent(C45632Sc r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0F = r2;
    }

    public final void setGroupParticipantsManager(AnonymousClass17X r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0A = r2;
    }

    public final void setMeManager(C19730wQ r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setParticipantUserStore(C232317r r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0B = r2;
    }

    public final void setSearchChatButton(View view) {
        AnonymousClass00C.A0D(view, 0);
        this.A0R = view;
    }

    public final void setSecondSubtitleText(String str) {
        if (str == null || str.length() == 0) {
            this.A0X.setVisibility(8);
            return;
        }
        WaTextView waTextView = this.A0X;
        waTextView.setVisibility(0);
        waTextView.setText(str);
    }

    public final void setSuspensionManager(AnonymousClass1EL r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0I = r2;
    }

    public final void setSystemFeatures(AnonymousClass13J r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0L = r2;
    }

    public final void setTextEmojiLabelViewControllerFactory(AnonymousClass1LI r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setVideoCallButton(View view) {
        AnonymousClass00C.A0D(view, 0);
        this.A0T = view;
    }

    public final void setWaContactNames(AnonymousClass171 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A06 = r2;
    }

    public final void setWaContext(C19630wG r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A07 = r2;
    }

    public final void setWaSharedPreferences(C19420v0 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A08 = r2;
    }

    public final void setWhatsAppLocale(C18820ts r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A09 = r2;
    }

    private final void A00() {
        float f;
        View view = this.A0Q;
        C20810yC abProps = getAbProps();
        C19730wQ meManager = getMeManager();
        AnonymousClass17X groupParticipantsManager = getGroupParticipantsManager();
        AnonymousClass147 r1 = this.A0J;
        if (r1 == null) {
            throw C36331k8.A0d("gid");
        }
        int A0B2 = groupParticipantsManager.A07.A0B(r1);
        if (!C34681hT.A0D(meManager, abProps, A0B2) || C34681hT.A0C(meManager, abProps, A0B2)) {
            f = 1.0f;
        } else {
            f = 0.4f;
        }
        view.setAlpha(f);
    }

    private final void A01() {
        C48752hz.A00(this.A0S, this, 13);
        AnonymousClass3Y2.A00(this.A0R, this, 49);
        AnonymousClass3Y3.A00(this.A0Q, this, 0);
        AnonymousClass3Y2.A00(this.A0T, this, 48);
    }

    public static final void A02(View view, GroupDetailsCard groupDetailsCard, boolean z) {
        AnonymousClass3TV r0 = groupDetailsCard.A0Y;
        if (r0 != null) {
            r0.A04(view, z ? 1 : 0);
        } else if (groupDetailsCard.getContext() instanceof C225314u) {
            C225314u A0S2 = C36381kD.A0S(groupDetailsCard.getContext());
            if (C34681hT.A0R(groupDetailsCard.getAbProps(), false)) {
                groupDetailsCard.getLgcCallConfirmationSheetBridge();
                AnonymousClass141 r1 = groupDetailsCard.A0C;
                if (r1 == null) {
                    throw C36331k8.A0d("groupChat");
                }
                Jid A062 = r1.A06(AnonymousClass147.class);
                if (A062 != null) {
                    AnonymousClass147 r12 = (AnonymousClass147) A062;
                    AnonymousClass00C.A0D(r12, 1);
                    LGCCallConfirmationSheet A002 = C53402rG.A00(r12, 10, z);
                    groupDetailsCard.getLgcCallConfirmationSheetBridge();
                    A0S2.Btl(A002, "LGCCallConfirmationSheet");
                    return;
                }
                throw C36381kD.A0l();
            }
            C19420v0 waSharedPreferences = groupDetailsCard.getWaSharedPreferences();
            AnonymousClass141 r13 = groupDetailsCard.A0C;
            if (r13 == null) {
                throw C36331k8.A0d("groupChat");
            }
            CallConfirmationFragment.A07(A0S2, waSharedPreferences, r13, 10, z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        if (r3 == X.C023109s.A0C) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        r14.getSystemFeatures();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007f, code lost:
        r2 = r14.A0Q;
        r1 = com.whatsapp.R.drawable.vec_ic_action_voicechat;
        r0 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b0, code lost:
        if (r1 == false) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e7, code lost:
        if (r1 != 2) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00fd, code lost:
        X.C36401kF.A1O(r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(com.whatsapp.group.view.custom.GroupDetailsCard r14) {
        /*
            com.whatsapp.group.GroupCallButtonController r2 = r14.A0G
            if (r2 == 0) goto L_0x0055
            X.141 r0 = r2.A03
            if (r0 != 0) goto L_0x0108
            java.lang.Integer r0 = X.C023109s.A00
        L_0x000a:
            r2.A08 = r0
        L_0x000c:
            java.lang.Integer r3 = r2.A08
            r14.A0O = r3
            X.141 r9 = r2.A03
            r1 = 0
            if (r9 == 0) goto L_0x0033
            X.0yC r10 = r2.A0I
            X.147 r11 = r2.A05
            X.1MK r6 = r2.A0D
            X.1EM r12 = r2.A0M
            X.17X r8 = r2.A0G
            X.0wQ r4 = r2.A0A
            X.0yf r5 = r2.A0B
            X.16D r7 = r2.A0E
            java.lang.Integer r0 = X.C023109s.A0S
            if (r3 == r0) goto L_0x002e
            java.lang.Integer r0 = X.C023109s.A0C
            r13 = 0
            if (r3 != r0) goto L_0x002f
        L_0x002e:
            r13 = 1
        L_0x002f:
            boolean r1 = X.AnonymousClass3UL.A07(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x0033:
            android.view.View r0 = r14.A0Q
            r0.setEnabled(r1)
            android.view.View r0 = r14.A0T
            r0.setEnabled(r1)
            java.lang.Integer r0 = r14.A0O
            if (r0 != 0) goto L_0x0102
            r4 = -1
        L_0x0042:
            r3 = 0
            r1 = 8
            android.view.View r0 = r14.A0Q
            switch(r4) {
                case 1: goto L_0x0062;
                case 2: goto L_0x0074;
                case 3: goto L_0x0088;
                case 4: goto L_0x00ed;
                case 5: goto L_0x0056;
                default: goto L_0x004a;
            }
        L_0x004a:
            r0.setVisibility(r1)
            android.view.View r0 = r14.A0T
            r0.setVisibility(r1)
        L_0x0052:
            r14.getSystemFeatures()
        L_0x0055:
            return
        L_0x0056:
            r0.setVisibility(r3)
            r14.A00()
            android.view.View r0 = r14.A0T
            r0.setVisibility(r1)
            goto L_0x007f
        L_0x0062:
            r0.setVisibility(r3)
            android.view.View r0 = r14.A0T
            r0.setVisibility(r3)
            android.view.View r2 = r14.A0Q
            r1 = 2131231779(0x7f080423, float:1.8079649E38)
            r0 = 2131888263(0x7f120887, float:1.9411156E38)
            goto L_0x00fd
        L_0x0074:
            r0.setVisibility(r3)
            r14.A00()
            android.view.View r0 = r14.A0T
            r0.setVisibility(r3)
        L_0x007f:
            android.view.View r2 = r14.A0Q
            r1 = 2131233966(0x7f080cae, float:1.8084084E38)
            r0 = 2131895804(0x7f1225fc, float:1.9426451E38)
            goto L_0x00fd
        L_0x0088:
            r0.setVisibility(r3)
            android.view.View r0 = r14.A0T
            r0.setVisibility(r1)
            android.view.View r4 = r14.A0Q
            X.5Ng r0 = r2.A07
            if (r0 == 0) goto L_0x00dd
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x00dd
            r3 = 2131231867(0x7f08047b, float:1.8079827E38)
        L_0x009d:
            com.whatsapp.voipcalling.CallInfo r0 = com.whatsapp.voipcalling.Voip.getCallInfo()
            X.147 r1 = r2.A05
            if (r1 == 0) goto L_0x00b2
            if (r0 == 0) goto L_0x00b2
            com.whatsapp.jid.GroupJid r0 = r0.groupJid
            boolean r1 = r1.equals(r0)
            r0 = 2131896047(0x7f1226ef, float:1.9426944E38)
            if (r1 != 0) goto L_0x00b5
        L_0x00b2:
            r0 = 2131897132(0x7f122b2c, float:1.9429145E38)
        L_0x00b5:
            X.C36401kF.A1O(r4, r3, r0)
            android.view.View r4 = r14.A0Q
            X.141 r0 = r2.A03
            if (r0 != 0) goto L_0x00c3
            r2 = 0
        L_0x00bf:
            r4.setEnabled(r2)
            goto L_0x0052
        L_0x00c3:
            X.147 r3 = r2.A05
            X.1MK r0 = r2.A0D
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.Voip.getCallInfo()
            r2 = 0
            if (r3 == 0) goto L_0x00bf
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x00db
            boolean r0 = X.C34681hT.A0S(r3, r1)
            if (r0 != 0) goto L_0x00db
            goto L_0x00bf
        L_0x00db:
            r2 = 1
            goto L_0x00bf
        L_0x00dd:
            X.5Nh r0 = r2.A06
            if (r0 == 0) goto L_0x00e9
            int r1 = r0.A08
            r0 = 2
            r3 = 2131233966(0x7f080cae, float:1.8084084E38)
            if (r1 == r0) goto L_0x009d
        L_0x00e9:
            r3 = 2131231779(0x7f080423, float:1.8079649E38)
            goto L_0x009d
        L_0x00ed:
            r0.setVisibility(r3)
            android.view.View r0 = r14.A0T
            r0.setVisibility(r1)
            android.view.View r2 = r14.A0Q
            r1 = 2131231818(0x7f08044a, float:1.8079728E38)
            r0 = 2131890064(0x7f120f90, float:1.941481E38)
        L_0x00fd:
            X.C36401kF.A1O(r2, r1, r0)
            goto L_0x0052
        L_0x0102:
            int r4 = r0.intValue()
            goto L_0x0042
        L_0x0108:
            X.147 r1 = r2.A05
            X.12q r4 = r2.A0F
            if (r1 == 0) goto L_0x000c
            boolean r0 = r0.A0i
            if (r0 != 0) goto L_0x000c
            int r1 = r4.A05(r1)
            r0 = 3
            if (r1 == r0) goto L_0x000c
            X.1HO r5 = r2.A0H
            X.147 r0 = r2.A05
            boolean r0 = r5.A07(r0)
            if (r0 == 0) goto L_0x0179
            X.147 r0 = r2.A05
            X.5Ng r0 = r5.A02(r0)
            r2.A07 = r0
            if (r0 == 0) goto L_0x0134
            long r0 = r0.A02()
            com.whatsapp.group.GroupCallButtonController.A00(r2, r0)
        L_0x0134:
            X.3KV r0 = r2.A02
            if (r0 != 0) goto L_0x014d
            X.0yC r0 = r2.A0I
            boolean r0 = X.C34681hT.A0M(r0)
            if (r0 == 0) goto L_0x014d
            X.1b9 r5 = r2.A0J
            X.147 r3 = r2.A05
            r1 = 1
            X.4YU r0 = new X.4YU
            r0.<init>(r2, r1)
            r5.A03(r3, r0)
        L_0x014d:
            X.5Ng r0 = r2.A07
            if (r0 != 0) goto L_0x01b0
            X.3KV r0 = r2.A02
            if (r0 != 0) goto L_0x01b0
            X.147 r3 = r2.A05
            X.0yf r1 = r2.A0B
            X.17X r5 = r2.A0G
            X.141 r0 = r2.A03
            boolean r0 = X.AnonymousClass3UL.A08(r1, r4, r5, r0, r3)
            if (r0 == 0) goto L_0x018e
            X.0yC r4 = r2.A0I
            X.0wQ r3 = r2.A0A
            X.147 r1 = r2.A05
            X.17r r0 = r5.A07
            int r0 = r0.A0B(r1)
            boolean r0 = X.C34681hT.A0D(r3, r4, r0)
            if (r0 == 0) goto L_0x018a
            java.lang.Integer r0 = X.C023109s.A0C
            goto L_0x000a
        L_0x0179:
            X.4PR r3 = r2.A0C
            X.147 r0 = r2.A05
            X.2ik r1 = new X.2ik
            r1.<init>(r3, r5, r0)
            r2.A01 = r1
            X.0wU r0 = r2.A0N
            X.C36371kC.A1P(r1, r0)
            goto L_0x0134
        L_0x018a:
            java.lang.Integer r0 = X.C023109s.A01
            goto L_0x000a
        L_0x018e:
            X.147 r0 = r2.A05
            boolean r0 = r5.A0C(r0)
            if (r0 == 0) goto L_0x000c
            X.0yC r4 = r2.A0I
            X.0wQ r3 = r2.A0A
            X.147 r1 = r2.A05
            X.17r r0 = r5.A07
            int r0 = r0.A0B(r1)
            boolean r0 = X.C34681hT.A0D(r3, r4, r0)
            if (r0 == 0) goto L_0x01ac
            java.lang.Integer r0 = X.C023109s.A0S
            goto L_0x000a
        L_0x01ac:
            java.lang.Integer r0 = X.C023109s.A0R
            goto L_0x000a
        L_0x01b0:
            java.lang.Integer r0 = X.C023109s.A0G
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.view.custom.GroupDetailsCard.A03(com.whatsapp.group.view.custom.GroupDetailsCard):void");
    }

    private final C20570xm getLgcCallConfirmationSheetBridge() {
        return (C20570xm) this.A0a.getValue();
    }

    public void A04() {
        if (!this.A0Z) {
            this.A0Z = true;
            C27861Qc r2 = (C27861Qc) ((C27851Qb) generatedComponent());
            C18800tq r1 = r2.A0M;
            this.A0E = C36341k9.A0V(r1);
            this.A01 = C36351kA.A0N(r1);
            this.A07 = C36351kA.A0W(r1);
            this.A0D = C36351kA.A0e(r1);
            this.A03 = C36391kE.A0Y(r1);
            this.A00 = C36351kA.A0J(r1);
            this.A05 = C36341k9.A0R(r1);
            this.A0L = C36351kA.A0q(r1);
            this.A06 = C36341k9.A0S(r1);
            this.A09 = C36341k9.A0T(r1);
            this.A0K = C36371kC.A0l(r1);
            this.A0H = C36361kB.A0a(r1);
            this.A0I = C36381kD.A0d(r1);
            this.A08 = C36351kA.A0Y(r1);
            this.A0B = (C232317r) r1.A61.get();
            this.A0A = C36351kA.A0b(r1);
            this.A04 = (AnonymousClass4PT) r2.A0L.A1K.get();
            this.A0M = C18840tu.A00(r1.A2i);
            this.A02 = C36361kB.A0S(r1);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0N;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0N = r0;
        }
        return r0.generatedComponent();
    }

    public final C20810yC getAbProps() {
        C20810yC r0 = this.A0E;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A07();
    }

    public final C24801Dv getActivityUtils() {
        C24801Dv r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("activityUtils");
    }

    public final AnonymousClass1ND getCallsManager() {
        AnonymousClass1ND r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("callsManager");
    }

    public final AnonymousClass16D getContactManager() {
        AnonymousClass16D r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0Z();
    }

    public final AnonymousClass005 getDependencyBridgeRegistryLazy() {
        AnonymousClass005 r0 = this.A0M;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("dependencyBridgeRegistryLazy");
    }

    public final AnonymousClass1H2 getEmojiLoader() {
        AnonymousClass1H2 r0 = this.A0D;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("emojiLoader");
    }

    public final AnonymousClass4PT getGroupCallMenuHelperFactory() {
        AnonymousClass4PT r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("groupCallMenuHelperFactory");
    }

    public final C20350xQ getGroupChatManager() {
        C20350xQ r0 = this.A0H;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("groupChatManager");
    }

    public final AnonymousClass1EM getGroupChatUtils() {
        AnonymousClass1EM r0 = this.A0K;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("groupChatUtils");
    }

    public final AnonymousClass17X getGroupParticipantsManager() {
        AnonymousClass17X r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("groupParticipantsManager");
    }

    public final C19730wQ getMeManager() {
        C19730wQ r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("meManager");
    }

    public final C232317r getParticipantUserStore() {
        C232317r r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("participantUserStore");
    }

    public final AnonymousClass1EL getSuspensionManager() {
        AnonymousClass1EL r0 = this.A0I;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("suspensionManager");
    }

    public final AnonymousClass13J getSystemFeatures() {
        AnonymousClass13J r0 = this.A0L;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("systemFeatures");
    }

    public final AnonymousClass1LI getTextEmojiLabelViewControllerFactory() {
        AnonymousClass1LI r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("textEmojiLabelViewControllerFactory");
    }

    public final AnonymousClass171 getWaContactNames() {
        AnonymousClass171 r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0c();
    }

    public final C19630wG getWaContext() {
        C19630wG r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("waContext");
    }

    public final C19420v0 getWaSharedPreferences() {
        C19420v0 r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("waSharedPreferences");
    }

    public final C18820ts getWhatsAppLocale() {
        C18820ts r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A09();
    }

    @OnLifecycleEvent(AnonymousClass05R.ON_CREATE)
    public final void onActivityCreated() {
        GroupCallButtonController groupCallButtonController = this.A0G;
        if (groupCallButtonController != null) {
            groupCallButtonController.A0P.registerObserver(groupCallButtonController.A0O);
            groupCallButtonController.A0R.registerObserver(groupCallButtonController.A0Q);
            groupCallButtonController.A0L.registerObserver(groupCallButtonController.A0K);
        }
    }

    @OnLifecycleEvent(AnonymousClass05R.ON_DESTROY)
    public final void onActivityDestroyed() {
        GroupCallButtonController groupCallButtonController = this.A0G;
        if (groupCallButtonController != null) {
            groupCallButtonController.A0P.unregisterObserver(groupCallButtonController.A0O);
            groupCallButtonController.A0R.unregisterObserver(groupCallButtonController.A0Q);
            groupCallButtonController.A0L.unregisterObserver(groupCallButtonController.A0K);
            C49212ik r0 = groupCallButtonController.A01;
            if (r0 != null) {
                r0.A0D(true);
                groupCallButtonController.A01 = null;
            }
            C49202ij r02 = groupCallButtonController.A00;
            if (r02 != null) {
                r02.A0D(true);
                groupCallButtonController.A00 = null;
            }
            groupCallButtonController.A03 = null;
            groupCallButtonController.A05 = null;
            groupCallButtonController.A08 = C023109s.A00;
            groupCallButtonController.A06 = null;
            groupCallButtonController.A04 = null;
            groupCallButtonController.A02 = null;
        }
    }

    public final void setAddPersonOnClickListener(View.OnClickListener onClickListener) {
        this.A0P.setOnClickListener(onClickListener);
    }

    public final void setSubtitleText(String str) {
        this.A0V.A0I(str);
    }

    public final void setTitleColor(int i) {
        this.A0W.A01.setTextColor(i);
    }

    public final void A06(String str, boolean z) {
        Context context = getContext();
        AnonymousClass3SF r4 = this.A0W;
        TextEmojiLabel textEmojiLabel = r4.A01;
        textEmojiLabel.setText(AnonymousClass3UG.A04(context, textEmojiLabel.getPaint(), getEmojiLoader(), str, 0.9f));
        int i = 0;
        if (z) {
            i = 2;
        }
        r4.A03(i);
    }

    public final View getGroupCallButton() {
        return this.A0Q;
    }

    public final GroupCallButtonController getGroupCallButtonController() {
        return this.A0G;
    }

    public final View getSearchChatButton() {
        return this.A0R;
    }

    public final View getVideoCallButton() {
        return this.A0T;
    }

    public final void setGroupCallButtonController(GroupCallButtonController groupCallButtonController) {
        this.A0G = groupCallButtonController;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupDetailsCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        A04();
        this.A0a = C36431kI.A1I(new AnonymousClass4C1(this));
        LayoutInflater.from(getContext()).inflate(R.layout.f9nameremoved, this, true);
        View A022 = C012005e.A02(this, R.id.action_message);
        AnonymousClass00C.A08(A022);
        this.A0S = A022;
        View A023 = C012005e.A02(this, R.id.action_add_person);
        AnonymousClass00C.A08(A023);
        this.A0P = A023;
        View A024 = C012005e.A02(this, R.id.action_search_chat);
        AnonymousClass00C.A08(A024);
        this.A0R = A024;
        View A025 = C012005e.A02(this, R.id.action_call);
        AnonymousClass00C.A08(A025);
        this.A0Q = A025;
        View A026 = C012005e.A02(this, R.id.action_videocall);
        AnonymousClass00C.A08(A026);
        this.A0T = A026;
        View A027 = C012005e.A02(this, R.id.group_details_card_subtitle);
        AnonymousClass00C.A08(A027);
        this.A0V = (TextEmojiLabel) A027;
        View A028 = C012005e.A02(this, R.id.announcements_subtitle_number_of_participants);
        AnonymousClass00C.A08(A028);
        this.A0U = (TextView) A028;
        View A029 = C012005e.A02(this, R.id.group_second_subtitle);
        AnonymousClass00C.A08(A029);
        this.A0X = (WaTextView) A029;
        this.A0W = AnonymousClass3SF.A01(this, getTextEmojiLabelViewControllerFactory(), R.id.group_title);
        A01();
    }

    public GroupDetailsCard(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A04();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupDetailsCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        A04();
        this.A0a = C36431kI.A1I(new AnonymousClass4C1(this));
        LayoutInflater.from(getContext()).inflate(R.layout.f9nameremoved, this, true);
        View A022 = C012005e.A02(this, R.id.action_message);
        AnonymousClass00C.A08(A022);
        this.A0S = A022;
        View A023 = C012005e.A02(this, R.id.action_add_person);
        AnonymousClass00C.A08(A023);
        this.A0P = A023;
        View A024 = C012005e.A02(this, R.id.action_search_chat);
        AnonymousClass00C.A08(A024);
        this.A0R = A024;
        View A025 = C012005e.A02(this, R.id.action_call);
        AnonymousClass00C.A08(A025);
        this.A0Q = A025;
        View A026 = C012005e.A02(this, R.id.action_videocall);
        AnonymousClass00C.A08(A026);
        this.A0T = A026;
        View A027 = C012005e.A02(this, R.id.group_details_card_subtitle);
        AnonymousClass00C.A08(A027);
        this.A0V = (TextEmojiLabel) A027;
        View A028 = C012005e.A02(this, R.id.announcements_subtitle_number_of_participants);
        AnonymousClass00C.A08(A028);
        this.A0U = (TextView) A028;
        View A029 = C012005e.A02(this, R.id.group_second_subtitle);
        AnonymousClass00C.A08(A029);
        this.A0X = (WaTextView) A029;
        this.A0W = AnonymousClass3SF.A01(this, getTextEmojiLabelViewControllerFactory(), R.id.group_title);
        A01();
    }
}
