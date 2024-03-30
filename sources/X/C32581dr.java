package X;

import android.content.Context;
import com.whatsapp.LabelChangeListener;
import com.whatsapp.PushnameEmojiBlacklistDialogFragment;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.bonsai.discovery.BonsaiDiscoveryFragment;
import com.whatsapp.businessapisearch.view.fragment.BusinessApiBrowseFragment;
import com.whatsapp.businessapisearch.view.fragment.BusinessApiHomeFragment;
import com.whatsapp.businessdirectory.util.LocationUpdateListener;
import com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryConsumerHomeFragment;
import com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment;
import com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment;
import com.whatsapp.emoji.EmojiEditTextBottomSheetDialogFragment;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.extensions.webview.view.FlowsWebViewFragment;
import com.whatsapp.group.AddMembersRouter;
import com.whatsapp.group.GroupMembershipApprovalRequestsFragment;
import com.whatsapp.group.GroupPendingInvitesFragment;
import com.whatsapp.inappsupport.ui.ContextualHelpBkScreenFragment;
import com.whatsapp.inappsupport.ui.SupportBkScreenFragment;
import com.whatsapp.instrumentation.ui.ConfirmFragment;
import com.whatsapp.instrumentation.ui.PermissionsFragment;
import com.whatsapp.interopui.setting.InteropSettingsOptinFragment;
import com.whatsapp.reportinfra.repo.SpamReportRepo;
import com.whatsapp.shops.ShopsProductPreviewFragment;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;
import com.whatsapp.wabloks.base.BkScreenFragmentWithCustomPreloadScreens;
import com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContentFragment;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1dr  reason: invalid class name and case insensitive filesystem */
public final class C32581dr extends C32571dq {
    public AnonymousClass004 A00;
    public AnonymousClass004 A01;
    public AnonymousClass004 A02;
    public AnonymousClass004 A03;
    public AnonymousClass004 A04;
    public AnonymousClass004 A05;
    public AnonymousClass004 A06;
    public AnonymousClass004 A07;
    public AnonymousClass004 A08;
    public AnonymousClass004 A09;
    public AnonymousClass004 A0A;
    public AnonymousClass004 A0B;
    public AnonymousClass004 A0C;
    public AnonymousClass004 A0D;
    public AnonymousClass004 A0E;
    public AnonymousClass004 A0F;
    public AnonymousClass004 A0G;
    public AnonymousClass004 A0H;
    public AnonymousClass004 A0I;
    public AnonymousClass004 A0J;
    public AnonymousClass004 A0K;
    public AnonymousClass004 A0L;
    public AnonymousClass004 A0M;
    public AnonymousClass004 A0N;
    public AnonymousClass004 A0O;
    public AnonymousClass004 A0P;
    public AnonymousClass004 A0Q;
    public AnonymousClass004 A0R;
    public AnonymousClass004 A0S;
    public AnonymousClass004 A0T;
    public AnonymousClass004 A0U;
    public AnonymousClass004 A0V;
    public AnonymousClass004 A0W;
    public AnonymousClass004 A0X;
    public AnonymousClass004 A0Y;
    public AnonymousClass004 A0Z;
    public AnonymousClass004 A0a;
    public AnonymousClass004 A0b;
    public AnonymousClass004 A0c;
    public AnonymousClass004 A0d;
    public AnonymousClass004 A0e;
    public AnonymousClass004 A0f;
    public AnonymousClass004 A0g;
    public AnonymousClass004 A0h;
    public AnonymousClass004 A0i;
    public AnonymousClass004 A0j;
    public AnonymousClass004 A0k;
    public AnonymousClass004 A0l;
    public AnonymousClass004 A0m;
    public AnonymousClass004 A0n;
    public AnonymousClass004 A0o;
    public AnonymousClass004 A0p;
    public AnonymousClass004 A0q;
    public AnonymousClass004 A0r;
    public AnonymousClass004 A0s;
    public AnonymousClass004 A0t;
    public AnonymousClass004 A0u;
    public AnonymousClass004 A0v;
    public AnonymousClass004 A0w;
    public AnonymousClass004 A0x;
    public AnonymousClass004 A0y;
    public AnonymousClass004 A0z;
    public AnonymousClass004 A10;
    public AnonymousClass004 A11;
    public AnonymousClass004 A12;
    public AnonymousClass004 A13;
    public AnonymousClass004 A14;
    public AnonymousClass004 A15;
    public AnonymousClass004 A16;
    public AnonymousClass004 A17;
    public AnonymousClass004 A18;
    public AnonymousClass004 A19;
    public AnonymousClass004 A1A;
    public AnonymousClass004 A1B;
    public AnonymousClass004 A1C;
    public AnonymousClass004 A1D;
    public AnonymousClass004 A1E;
    public AnonymousClass004 A1F;
    public AnonymousClass004 A1G;
    public AnonymousClass004 A1H;
    public final C27111My A1I;
    public final C27071Mp A1J;
    public final C18800tq A1K;
    public final C32581dr A1L = this;

    public static LabelChangeListener A01(C32581dr r2) {
        return new LabelChangeListener((C32911eP) r2.A1K.A00.A9N.get());
    }

    private C193029Jo A02() {
        AnonymousClass9P0 r2 = new AnonymousClass9P0();
        return new C193029Jo(new AnonymousClass965(), C18800tq.A2x(this.A1K), r2);
    }

    public static AnonymousClass8V9 A03(C32581dr r10) {
        AnonymousClass17Y r2 = (AnonymousClass17Y) r10.A1K.A3e.get();
        AnonymousClass19A r7 = (AnonymousClass19A) r10.A1K.A4x.get();
        C193029Jo A022 = r10.A02();
        C199349fA r6 = (C199349fA) r10.A1K.A3c.get();
        return new AnonymousClass8V9(r2, (AnonymousClass1KK) r10.A1K.A19.get(), A022, (C20810yC) r10.A1K.A02.get(), r6, r7, (AnonymousClass3L6) r10.A1K.A0t.get(), (C63273Jk) r10.A1K.ADQ.get());
    }

    public static C128866Dx A04(C32581dr r5) {
        C115945jh r2 = (C115945jh) r5.A1E.get();
        C115965jj r1 = (C115965jj) r5.A1F.get();
        return new C128866Dx((C115755jO) r5.A0z.get(), r2, r1, (C18820ts) r5.A1K.A9X.get());
    }

    private AnonymousClass9EH A05() {
        return new AnonymousClass9EH((C20810yC) this.A1K.A02.get());
    }

    public static AnonymousClass9HL A06() {
        return new AnonymousClass9HL(new C125325zj(), new C31841cT());
    }

    public static AnonymousClass9EI A07() {
        return new AnonymousClass9EI(new AnonymousClass9P0());
    }

    private AnonymousClass9HM A08() {
        return new AnonymousClass9HM(A06(), new AnonymousClass9P0());
    }

    public static AnonymousClass8VB A09(C32581dr r10) {
        AnonymousClass19A r8 = (AnonymousClass19A) r10.A1K.A4x.get();
        AnonymousClass1KK r3 = (AnonymousClass1KK) r10.A1K.A19.get();
        AnonymousClass9EI A072 = A07();
        C199349fA r7 = (C199349fA) r10.A1K.A3c.get();
        C19420v0 r6 = (C19420v0) r10.A1K.A9G.get();
        return new AnonymousClass8VB((AnonymousClass17Y) r10.A1K.A3e.get(), r3, C27111My.A0E(r10.A1I), A072, r6, r7, r8, (AnonymousClass3L6) r10.A1K.A0t.get(), (C63273Jk) r10.A1K.ADQ.get());
    }

    public static AnonymousClass9OT A0A(C32581dr r12) {
        C116635ku r3 = (C116635ku) r12.A1K.A00.AAP.get();
        AnonymousClass3L6 r10 = (AnonymousClass3L6) r12.A1K.A0t.get();
        AnonymousClass19A r9 = (AnonymousClass19A) r12.A1K.A4x.get();
        AnonymousClass9HK r4 = (AnonymousClass9HK) r12.A1K.A00.AAQ.get();
        AnonymousClass1KK r2 = (AnonymousClass1KK) r12.A1K.A19.get();
        C199349fA r8 = (C199349fA) r12.A1K.A3c.get();
        AnonymousClass9HM A082 = r12.A08();
        return new AnonymousClass9OT(r2, r3, r4, r12.A05(), A082, (C19630wG) r12.A1K.A91.get(), r8, r9, r10, (C19770wU) r12.A1K.A9Y.get());
    }

    public static C143076pw A0B(C32581dr r4) {
        return new C143076pw((C20690y0) r4.A1K.A6r.get(), (AnonymousClass1GX) r4.A1K.A4k.get(), (C19770wU) r4.A1K.A9Y.get());
    }

    public static C202099l2 A0C(C32581dr r4) {
        return new C202099l2(AnonymousClass1JT.A00(r4.A1K.AfJ), (C19730wQ) r4.A1K.A4g.get(), (C18820ts) r4.A1K.A9X.get());
    }

    public static C92084d6 A0E() {
        return new C92084d6();
    }

    private AnonymousClass5DU A0G() {
        C115725jL r4 = (C115725jL) this.A1I.A53.get();
        C115715jK r3 = (C115715jK) this.A1I.A52.get();
        return new AnonymousClass5DU(C19460v5.A00(), r3, r4, (C115775jQ) this.A11.get(), (C115785jR) this.A12.get(), (C115795jS) this.A13.get(), (C115805jT) this.A14.get(), (C115815jU) this.A15.get(), (C115825jV) this.A16.get());
    }

    public static C121355t0 A0H(C32581dr r2) {
        return new C121355t0(C27111My.A0U(r2.A1I));
    }

    private LocationUpdateListener A0I() {
        C18820ts r5 = (C18820ts) this.A1K.A9X.get();
        return new LocationUpdateListener((C237019m) this.A1K.AOD.get(), (AnonymousClass17Y) this.A1K.A3e.get(), (C19630wG) this.A1K.A91.get(), r5, (C19770wU) this.A1K.A9Y.get());
    }

    public static AnonymousClass36B A0J(C32581dr r3) {
        return new AnonymousClass36B((AnonymousClass2ZG) r3.A1K.A00.A0r.get(), (AnonymousClass1PW) r3.A1K.A74.get());
    }

    public static C95894mS A0K(Context context, AnonymousClass1Pp r2, C27731Pn r3) {
        return new C95894mS(context, r2, r3);
    }

    public static C95894mS A0L(C32581dr r3) {
        C95894mS A0K2 = A0K(C19610wE.A00(r3.A1K.AfJ), (AnonymousClass1Pp) r3.A1K.A28.get(), (C27731Pn) r3.A1K.A2E.get());
        r3.A2Z(A0K2);
        return A0K2;
    }

    public static C40831wB A0M(C32581dr r3) {
        return new C40831wB(C19610wE.A00(r3.A1K.AfJ), (C27731Pn) r3.A1K.A2E.get());
    }

    public static C604737z A0N(C32581dr r5) {
        return new C604737z((C20810yC) r5.A1K.A02.get(), r5.A1K.AzV(), (AnonymousClass1CF) r5.A1K.A8K.get(), (C32681e1) r5.A1K.A00.A2Y.get());
    }

    /* access modifiers changed from: private */
    public AnonymousClass2Md A0O() {
        AnonymousClass1XN r3 = (AnonymousClass1XN) this.A1K.A7G.get();
        EmojiSearchProvider emojiSearchProvider = (EmojiSearchProvider) this.A1K.A00.A7B.get();
        return new AnonymousClass2Md((C19420v0) this.A1K.A9G.get(), r3, emojiSearchProvider, (C125375zo) this.A1I.A06.get(), (AnonymousClass1N2) this.A1K.A43.get());
    }

    public static AnonymousClass3DC A0Q(C32581dr r3) {
        return new AnonymousClass3DC((C20810yC) r3.A1K.A02.get(), C18840tu.A00(r3.A1I.A07));
    }

    public static AnonymousClass6LV A0R(C32581dr r9) {
        C19970wo r3 = (C19970wo) r9.A1K.A8b.get();
        C25541Gs r7 = (C25541Gs) r9.A1K.Acl.get();
        AnonymousClass1D0 r6 = (AnonymousClass1D0) r9.A1K.A4l.get();
        return new AnonymousClass6LV((AnonymousClass17Y) r9.A1K.A3e.get(), r3, (C20810yC) r9.A1K.A02.get(), (AnonymousClass190) r9.A1K.A97.get(), r6, r7, (C19770wU) r9.A1K.A9Y.get());
    }

    public static AnonymousClass39D A0S(C32581dr r7) {
        AnonymousClass19A r4 = (AnonymousClass19A) r7.A1K.A4x.get();
        AnonymousClass1PF r2 = (AnonymousClass1PF) r7.A1K.A3s.get();
        AnonymousClass1PE r5 = (AnonymousClass1PE) r7.A1K.A6k.get();
        return new AnonymousClass39D(r2, (AnonymousClass1PG) r7.A1K.AOd.get(), r4, r5, (C19770wU) r7.A1K.A9Y.get());
    }

    private C168097zh A0T() {
        C19970wo r7 = (C19970wo) this.A1K.A8b.get();
        C24801Dv r3 = (C24801Dv) this.A1K.A0D.get();
        C21060yb r6 = (C21060yb) this.A1K.A8W.get();
        C27731Pn r5 = (C27731Pn) this.A1K.A2E.get();
        C18820ts r8 = (C18820ts) this.A1K.A9X.get();
        return new C168097zh(C19610wE.A00(this.A1K.AfJ), r3, (AnonymousClass171) this.A1K.A90.get(), r5, r6, r7, r8, (C20810yC) this.A1K.A02.get(), (C32681e1) this.A1K.A00.A2Y.get());
    }

    public static C177128dF A0U(C32581dr r11) {
        Context A002 = C19610wE.A00(r11.A1K.AfJ);
        C24801Dv r3 = (C24801Dv) r11.A1K.A0D.get();
        C27731Pn r5 = (C27731Pn) r11.A1K.A2E.get();
        C21060yb r6 = (C21060yb) r11.A1K.A8W.get();
        return new C177128dF(A002, r3, (AnonymousClass171) r11.A1K.A90.get(), r5, r6, (C19970wo) r11.A1K.A8b.get(), (C18820ts) r11.A1K.A9X.get(), (C20810yC) r11.A1K.A02.get(), (C32681e1) r11.A1K.A00.A2Y.get());
    }

    public static C61793Dl A0V(C32581dr r4) {
        return new C61793Dl((AnonymousClass3DY) r4.A1K.A7b.get(), (C33751fs) r4.A1K.A00.A17.get(), (AnonymousClass1CF) r4.A1K.A8K.get());
    }

    public static AnonymousClass3Os A0W(C32581dr r5) {
        return new AnonymousClass3Os((C19730wQ) r5.A1K.A4g.get(), (C20810yC) r5.A1K.A02.get(), (C21010yW) r5.A1K.A79.get(), (C19770wU) r5.A1K.A9Y.get());
    }

    private AnonymousClass625 A0X() {
        return new AnonymousClass625((C33771fu) this.A1K.A8f.get(), (C33751fs) this.A1K.A00.A17.get());
    }

    public static C95884mR A0Y(C19460v5 r1, C115715jK r2, C115725jL r3) {
        return new C95884mR(r1, r2, r3);
    }

    public static C95884mR A0Z(C32581dr r3) {
        return A0Y(C19460v5.A00(), (C115715jK) r3.A1I.A52.get(), (C115725jL) r3.A1I.A53.get());
    }

    public static SpamReportRepo A0a(C32581dr r14) {
        C220412q r7 = (C220412q) r14.A1K.A1l.get();
        AnonymousClass16D r4 = (AnonymousClass16D) r14.A1K.A2A.get();
        C26151Jb A7C = r14.A1K.A7B();
        C24541Cv r8 = (C24541Cv) r14.A1K.A4O.get();
        AnonymousClass196 r3 = (AnonymousClass196) r14.A1K.A8N.get();
        AnonymousClass1NJ r10 = (AnonymousClass1NJ) r14.A1K.ABs.get();
        C64433Ny A0b2 = r14.A0b();
        C25791Hr r2 = (C25791Hr) r14.A1K.A0s.get();
        C005602m A002 = C25141Fd.A00();
        return new SpamReportRepo(r2, r3, r4, (AnonymousClass1NM) r14.A1K.A1c.get(), A7C, r7, r8, (C20810yC) r14.A1K.A02.get(), r10, A0b2, (AnonymousClass1CR) r14.A1K.A1i.get(), A002);
    }

    private C64433Ny A0b() {
        C61613Ct AK9 = this.A1K.AK8();
        return new C64433Ny((AnonymousClass19A) this.A1K.A4x.get(), this.A1K.AJz(), this.A1K.AK1(), this.A1K.AK3(), this.A1K.AK5(), AK9);
    }

    public static AnonymousClass3EF A0c(C32581dr r5) {
        AnonymousClass17Y r2 = (AnonymousClass17Y) r5.A1K.A3e.get();
        return new AnonymousClass3EF((C24801Dv) r5.A1K.A0D.get(), r2, (C21060yb) r5.A1K.A8W.get(), (C20810yC) r5.A1K.A02.get());
    }

    public static C120215r9 A0d(C32581dr r3) {
        return new C120215r9((C19420v0) r3.A1K.A9G.get(), (C20810yC) r3.A1K.A02.get());
    }

    public static C61123Aq A0e(C32581dr r8) {
        AnonymousClass040 A002 = C26581Ks.A00();
        C005602m A003 = C25141Fd.A00();
        AnonymousClass16D r2 = (AnonymousClass16D) r8.A1K.A2A.get();
        AnonymousClass12O r4 = (AnonymousClass12O) r8.A1K.A98.get();
        return new C61123Aq(r2, (C21159AAt) r8.A1K.A2F.get(), r4, (C20810yC) r8.A1K.A02.get(), A003, A002);
    }

    public static Set A0f() {
        HashSet hashSet = new HashSet();
        C19620wF.A00(hashSet);
        return hashSet;
    }

    private void A0g() {
        C18800tq r4 = this.A1K;
        this.A1H = new C32591ds(this.A1I, this.A1J, this.A1L, r4, 1);
        C18800tq r42 = this.A1K;
        this.A00 = new C32591ds(this.A1I, this.A1J, this.A1L, r42, 0);
        C18800tq r43 = this.A1K;
        this.A03 = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r43, 2));
        C18800tq r44 = this.A1K;
        this.A07 = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r44, 3));
        C18800tq r45 = this.A1K;
        this.A0D = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r45, 4));
        C18800tq r46 = this.A1K;
        this.A0O = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r46, 5));
        C18800tq r47 = this.A1K;
        this.A0Z = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r47, 6));
        C18800tq r48 = this.A1K;
        this.A0h = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r48, 7));
        C18800tq r49 = this.A1K;
        this.A0s = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r49, 9));
        C18800tq r410 = this.A1K;
        this.A1E = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r410, 8));
        C18800tq r411 = this.A1K;
        this.A1F = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r411, 10));
        C18800tq r412 = this.A1K;
        this.A0z = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r412, 11));
        C18800tq r413 = this.A1K;
        this.A04 = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r413, 12));
        C18800tq r414 = this.A1K;
        this.A05 = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r414, 13));
        C18800tq r415 = this.A1K;
        this.A06 = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r415, 14));
        C18800tq r416 = this.A1K;
        this.A10 = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r416, 15));
        C18800tq r417 = this.A1K;
        this.A11 = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r417, 16));
        C18800tq r418 = this.A1K;
        this.A12 = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r418, 17));
        C18800tq r419 = this.A1K;
        this.A13 = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r419, 18));
        C18800tq r420 = this.A1K;
        this.A14 = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r420, 19));
        C18800tq r421 = this.A1K;
        this.A15 = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r421, 20));
        C18800tq r422 = this.A1K;
        this.A16 = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r422, 21));
        C18800tq r423 = this.A1K;
        this.A08 = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r423, 23));
        C18800tq r424 = this.A1K;
        this.A17 = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r424, 22));
        C18800tq r425 = this.A1K;
        this.A09 = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r425, 24));
        C18800tq r426 = this.A1K;
        this.A18 = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r426, 25));
        C18800tq r427 = this.A1K;
        this.A19 = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r427, 26));
        C18800tq r428 = this.A1K;
        this.A0A = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r428, 28));
        C18800tq r429 = this.A1K;
        this.A0B = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r429, 29));
        C18800tq r430 = this.A1K;
        this.A1A = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r430, 27));
        C18800tq r431 = this.A1K;
        this.A0C = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r431, 30));
        C18800tq r432 = this.A1K;
        this.A0E = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r432, 31));
        C18800tq r433 = this.A1K;
        this.A0F = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r433, 32));
        C18800tq r434 = this.A1K;
        this.A0G = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r434, 33));
        C18800tq r435 = this.A1K;
        this.A0H = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r435, 34));
        C18800tq r436 = this.A1K;
        this.A0I = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r436, 35));
        C18800tq r437 = this.A1K;
        this.A0J = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r437, 36));
        C18800tq r438 = this.A1K;
        this.A0K = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r438, 37));
        C18800tq r439 = this.A1K;
        this.A0L = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r439, 38));
        C18800tq r440 = this.A1K;
        this.A0M = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r440, 39));
        C18800tq r441 = this.A1K;
        this.A0N = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r441, 40));
        C18800tq r442 = this.A1K;
        this.A0P = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r442, 41));
        C18800tq r443 = this.A1K;
        this.A0Q = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r443, 42));
        C18800tq r444 = this.A1K;
        this.A0R = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r444, 43));
        C18800tq r445 = this.A1K;
        this.A0S = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r445, 44));
        C18800tq r446 = this.A1K;
        this.A0T = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r446, 45));
        C18800tq r447 = this.A1K;
        this.A0U = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r447, 46));
        C18800tq r448 = this.A1K;
        this.A0V = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r448, 47));
        C18800tq r449 = this.A1K;
        this.A0W = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r449, 48));
        C18800tq r450 = this.A1K;
        this.A0X = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r450, 49));
        C18800tq r451 = this.A1K;
        this.A0Y = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r451, 51));
        C18800tq r452 = this.A1K;
        this.A0a = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r452, 50));
        C18800tq r453 = this.A1K;
        this.A0b = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r453, 52));
        C18800tq r454 = this.A1K;
        this.A0x = new C32591ds(this.A1I, this.A1J, this.A1L, r454, 53);
        C18800tq r455 = this.A1K;
        this.A0c = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r455, 54));
        C18800tq r456 = this.A1K;
        this.A0d = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r456, 55));
        C18800tq r457 = this.A1K;
        this.A0w = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r457, 56));
        C18800tq r458 = this.A1K;
        this.A0e = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r458, 57));
        C18800tq r459 = this.A1K;
        this.A0v = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r459, 58));
        C18800tq r460 = this.A1K;
        this.A0y = new C32591ds(this.A1I, this.A1J, this.A1L, r460, 59);
        C18800tq r461 = this.A1K;
        this.A1B = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r461, 60));
        C18800tq r462 = this.A1K;
        this.A1C = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r462, 61));
        C18800tq r463 = this.A1K;
        this.A1D = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r463, 62));
        C18800tq r464 = this.A1K;
        this.A0f = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r464, 63));
        C18800tq r465 = this.A1K;
        this.A0g = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r465, 64));
        C18800tq r466 = this.A1K;
        this.A0i = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r466, 65));
        C18800tq r467 = this.A1K;
        this.A1G = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r467, 66));
        C18800tq r468 = this.A1K;
        this.A01 = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r468, 67));
        C18800tq r469 = this.A1K;
        this.A02 = new C32591ds(this.A1I, this.A1J, this.A1L, r469, 68);
        C18800tq r470 = this.A1K;
        this.A0u = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r470, 69));
        C18800tq r471 = this.A1K;
        this.A0t = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r471, 71));
        C18800tq r472 = this.A1K;
        this.A0j = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r472, 70));
        C18800tq r473 = this.A1K;
        this.A0k = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r473, 72));
        C18800tq r474 = this.A1K;
        this.A0l = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r474, 73));
        C18800tq r475 = this.A1K;
        this.A0m = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r475, 74));
        C18800tq r476 = this.A1K;
        this.A0n = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r476, 75));
        C18800tq r477 = this.A1K;
        this.A0o = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r477, 76));
        C18800tq r478 = this.A1K;
        this.A0p = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r478, 77));
        C18800tq r479 = this.A1K;
        this.A0q = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r479, 78));
        C18800tq r480 = this.A1K;
        this.A0r = C19530w6.A00(new C32591ds(this.A1I, this.A1J, this.A1L, r480, 79));
    }

    public static void A0x(C32581dr r1, PushnameEmojiBlacklistDialogFragment pushnameEmojiBlacklistDialogFragment) {
        A1U(pushnameEmojiBlacklistDialogFragment, (AnonymousClass1H2) r1.A1K.A2x.get());
        A1V(pushnameEmojiBlacklistDialogFragment, (C20380xT) r1.A1K.ANA.get());
        A1T(pushnameEmojiBlacklistDialogFragment, (C18820ts) r1.A1K.A9X.get());
    }

    public static void A0z(C32581dr r1, FingerprintBottomSheet fingerprintBottomSheet) {
        A1l(fingerprintBottomSheet, (C19970wo) r1.A1K.A8b.get());
        A1m(fingerprintBottomSheet, (C18820ts) r1.A1K.A9X.get());
    }

    public static void A10(C32581dr r1, BonsaiDiscoveryFragment bonsaiDiscoveryFragment) {
        A1z(bonsaiDiscoveryFragment, (C19630wG) r1.A1K.A91.get());
        A1y(bonsaiDiscoveryFragment, (C27731Pn) r1.A1K.A2E.get());
        A1x(bonsaiDiscoveryFragment, (AnonymousClass171) r1.A1K.A90.get());
        A1w((AnonymousClass1K7) r1.A1K.ACC.get(), bonsaiDiscoveryFragment);
        A0h(C19460v5.A00(), bonsaiDiscoveryFragment);
    }

    public static void A12(C32581dr r1, BusinessApiHomeFragment businessApiHomeFragment) {
        A25(businessApiHomeFragment, (C20810yC) r1.A1K.A02.get());
        A27(businessApiHomeFragment, (AnonymousClass1N2) r1.A1K.A43.get());
        A22(r1.A0G(), businessApiHomeFragment);
        A26(businessApiHomeFragment, r1.A0X());
        A0m((C115835jW) r1.A17.get(), businessApiHomeFragment);
    }

    public static void A13(C32581dr r1, BusinessDirectoryConsumerHomeFragment businessDirectoryConsumerHomeFragment) {
        A1Z((C33771fu) r1.A1K.A8f.get(), businessDirectoryConsumerHomeFragment);
        A2Q(businessDirectoryConsumerHomeFragment, (AnonymousClass1N2) r1.A1K.A43.get());
        A0i((C24801Dv) r1.A1K.A0D.get(), businessDirectoryConsumerHomeFragment);
        A2H(C27111My.A0b(r1.A1I), businessDirectoryConsumerHomeFragment);
        A2I(r1.A0I(), businessDirectoryConsumerHomeFragment);
        A0n((AnonymousClass60Q) r1.A18.get(), businessDirectoryConsumerHomeFragment);
        A28((C142646pD) r1.A1K.A00.A1S.get(), businessDirectoryConsumerHomeFragment);
        A2P(businessDirectoryConsumerHomeFragment, (AnonymousClass1QW) r1.A1K.A00.A0Z.get());
        A2G(C27111My.A0Z(r1.A1I), businessDirectoryConsumerHomeFragment);
        A2L(C27111My.A0d(r1.A1I), businessDirectoryConsumerHomeFragment);
        A2D((AnonymousClass66G) r1.A1K.A00.A59.get(), businessDirectoryConsumerHomeFragment);
        A2O(businessDirectoryConsumerHomeFragment, (C33751fs) r1.A1K.A00.A17.get());
        A0q((AnonymousClass60R) r1.A19.get(), businessDirectoryConsumerHomeFragment);
    }

    public static void A14(C32581dr r1, BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment) {
        A1a((C33771fu) r1.A1K.A8f.get(), businessDirectoryContextualSearchFragment);
        A2T(businessDirectoryContextualSearchFragment, (AnonymousClass1N2) r1.A1K.A43.get());
        A2R(businessDirectoryContextualSearchFragment, (C33751fs) r1.A1K.A00.A17.get());
        A2J(r1.A0I(), businessDirectoryContextualSearchFragment);
        A0o((AnonymousClass60Q) r1.A18.get(), businessDirectoryContextualSearchFragment);
        A29((C142646pD) r1.A1K.A00.A1S.get(), businessDirectoryContextualSearchFragment);
        A2S(businessDirectoryContextualSearchFragment, (AnonymousClass1QW) r1.A1K.A00.A0Z.get());
        A2M(C27111My.A0d(r1.A1I), businessDirectoryContextualSearchFragment);
        A2E((AnonymousClass66G) r1.A1K.A00.A59.get(), businessDirectoryContextualSearchFragment);
        A0r((AnonymousClass60R) r1.A19.get(), businessDirectoryContextualSearchFragment);
    }

    public static void A15(C32581dr r1, BusinessDirectorySearchFragment businessDirectorySearchFragment) {
        A1b((C33771fu) r1.A1K.A8f.get(), businessDirectorySearchFragment);
        A2W(businessDirectorySearchFragment, (C18820ts) r1.A1K.A9X.get());
        A2V(businessDirectorySearchFragment, (C20830yE) r1.A1K.A9E.get());
        A2U(businessDirectorySearchFragment, (C33751fs) r1.A1K.A00.A17.get());
        A2K(r1.A0I(), businessDirectorySearchFragment);
        A0p((AnonymousClass60Q) r1.A18.get(), businessDirectorySearchFragment);
        A2A((C142646pD) r1.A1K.A00.A1S.get(), businessDirectorySearchFragment);
        A2X(businessDirectorySearchFragment, (AnonymousClass1QW) r1.A1K.A00.A0Z.get());
        A2F((AnonymousClass66G) r1.A1K.A00.A59.get(), businessDirectorySearchFragment);
        A2C((AnonymousClass5DR) r1.A1K.A00.A0c.get(), businessDirectorySearchFragment);
        A0t((C115855jY) r1.A1A.get(), businessDirectorySearchFragment);
        A2N(C27111My.A0d(r1.A1I), businessDirectorySearchFragment);
        A0s((AnonymousClass60R) r1.A19.get(), businessDirectorySearchFragment);
    }

    public static void A16(C32581dr r1, EmojiEditTextBottomSheetDialogFragment emojiEditTextBottomSheetDialogFragment) {
        A39(emojiEditTextBottomSheetDialogFragment, (C20810yC) r1.A1K.A02.get());
        A1M((AnonymousClass17Y) r1.A1K.A3e.get(), emojiEditTextBottomSheetDialogFragment);
        A3B(emojiEditTextBottomSheetDialogFragment, (AnonymousClass1N2) r1.A1K.A43.get());
        A0j((C19700wN) r1.A1K.A2U.get(), emojiEditTextBottomSheetDialogFragment);
        A37(emojiEditTextBottomSheetDialogFragment, (AnonymousClass1H2) r1.A1K.A2x.get());
        A36(emojiEditTextBottomSheetDialogFragment, (AnonymousClass1XN) r1.A1K.A7G.get());
        A34(emojiEditTextBottomSheetDialogFragment, (C1261362r) r1.A1K.A00.A7C.get());
        A2q((C21060yb) r1.A1K.A8W.get(), emojiEditTextBottomSheetDialogFragment);
        A2z((C18820ts) r1.A1K.A9X.get(), emojiEditTextBottomSheetDialogFragment);
        A38(emojiEditTextBottomSheetDialogFragment, (EmojiSearchProvider) r1.A1K.A00.A7B.get());
        A2y((C19420v0) r1.A1K.A9G.get(), emojiEditTextBottomSheetDialogFragment);
        A3A(emojiEditTextBottomSheetDialogFragment, (C19890wg) r1.A1K.A7i.get());
        A35(emojiEditTextBottomSheetDialogFragment, (AnonymousClass6O1) r1.A1K.A00.A7K.get());
        A33(emojiEditTextBottomSheetDialogFragment, (AnonymousClass1N0) r1.A1K.A00.A3P.get());
    }

    public static void A17(C32581dr r1, FlowsWebViewFragment flowsWebViewFragment) {
        A3F(flowsWebViewFragment, (C20810yC) r1.A1K.A02.get());
        A1N((AnonymousClass17Y) r1.A1K.A3e.get(), flowsWebViewFragment);
        A3D((AnonymousClass6PZ) r1.A1K.AeT.get(), flowsWebViewFragment);
        A3G(flowsWebViewFragment, (C21080yd) r1.A1K.A7U.get());
        A3H(flowsWebViewFragment, (AnonymousClass1N2) r1.A1K.A43.get());
        A3E(r1.A1K.A9t(), flowsWebViewFragment);
        A2u((C19970wo) r1.A1K.A8b.get(), flowsWebViewFragment);
        A2v((AnonymousClass1KW) r1.A1K.A92.get(), flowsWebViewFragment);
        A30((C18820ts) r1.A1K.A9X.get(), flowsWebViewFragment);
        A3C((C609439y) r1.A1K.A00.A8L.get(), flowsWebViewFragment);
    }

    public static void A18(C32581dr r1, AddMembersRouter addMembersRouter) {
        A32((C220412q) r1.A1K.A1l.get(), addMembersRouter);
        A0u((C58252zZ) r1.A1B.get(), addMembersRouter);
    }

    public static void A19(C32581dr r1, GroupMembershipApprovalRequestsFragment groupMembershipApprovalRequestsFragment) {
        A3I((C20810yC) r1.A1K.A02.get(), groupMembershipApprovalRequestsFragment);
        A1O((AnonymousClass17Y) r1.A1K.A3e.get(), groupMembershipApprovalRequestsFragment);
        A3N(groupMembershipApprovalRequestsFragment, (C32681e1) r1.A1K.A00.A2Y.get());
        A2r((C21060yb) r1.A1K.A8W.get(), groupMembershipApprovalRequestsFragment);
        A2m((AnonymousClass171) r1.A1K.A90.get(), groupMembershipApprovalRequestsFragment);
        A3M(r1.A0T(), groupMembershipApprovalRequestsFragment);
        A0v((C191609Dq) r1.A1C.get(), groupMembershipApprovalRequestsFragment);
    }

    public static void A1A(C32581dr r1, GroupPendingInvitesFragment groupPendingInvitesFragment) {
        A2o((C27731Pn) r1.A1K.A2E.get(), groupPendingInvitesFragment);
        A2n((AnonymousClass171) r1.A1K.A90.get(), groupPendingInvitesFragment);
        A31((C18820ts) r1.A1K.A9X.get(), groupPendingInvitesFragment);
        A0w((C58262za) r1.A1D.get(), groupPendingInvitesFragment);
        A1Y((AnonymousClass1LI) r1.A1K.A3Q.get(), groupPendingInvitesFragment);
    }

    public static void A1B(C32581dr r1, ContextualHelpBkScreenFragment contextualHelpBkScreenFragment) {
        AnonymousClass6HQ.A02(contextualHelpBkScreenFragment, C18840tu.A00(r1.A1K.AXc));
        AnonymousClass6HQ.A01((C1258461m) r1.A1K.Ae8.get(), contextualHelpBkScreenFragment);
        A1Q((C32691e2) r1.A1K.A4R.get(), contextualHelpBkScreenFragment);
        A2p((C33751fs) r1.A1K.A00.A17.get(), contextualHelpBkScreenFragment);
    }

    public static void A1C(C32581dr r1, SupportBkScreenFragment supportBkScreenFragment) {
        AnonymousClass6HQ.A02(supportBkScreenFragment, C18840tu.A00(r1.A1K.AXc));
        AnonymousClass6HQ.A01((C1258461m) r1.A1K.Ae8.get(), supportBkScreenFragment);
        A1r((C130996Nh) r1.A1K.AC7.get(), supportBkScreenFragment);
        A3Q(supportBkScreenFragment, (C19770wU) r1.A1K.A9Y.get());
        A1W((AnonymousClass3DY) r1.A1K.A7b.get(), supportBkScreenFragment);
        A2s((C21060yb) r1.A1K.A8W.get(), supportBkScreenFragment);
        A3O((AnonymousClass1CF) r1.A1K.A8K.get(), supportBkScreenFragment);
        A2x((C20830yE) r1.A1K.A9E.get(), supportBkScreenFragment);
        A3P(supportBkScreenFragment, (AnonymousClass3UV) r1.A1K.A7J.get());
        A2k((C19600wD) r1.A1K.A24.get(), supportBkScreenFragment);
        A1R((C32691e2) r1.A1K.A4R.get(), supportBkScreenFragment);
    }

    public static void A1D(C32581dr r1, ConfirmFragment confirmFragment) {
        A3J((C20810yC) r1.A1K.A02.get(), confirmFragment);
        A1c((AnonymousClass1N3) r1.A1K.A9B.get(), confirmFragment);
    }

    public static void A1E(C32581dr r1, PermissionsFragment permissionsFragment) {
        A3K((C20810yC) r1.A1K.A02.get(), permissionsFragment);
        A1d((AnonymousClass1N3) r1.A1K.A9B.get(), permissionsFragment);
        A3R((AnonymousClass1VC) r1.A1K.A4B.get(), permissionsFragment);
    }

    public static void A1F(C32581dr r1, InteropSettingsOptinFragment interopSettingsOptinFragment) {
        A3S((AnonymousClass3E7) r1.A1G.get(), interopSettingsOptinFragment);
        A3T(interopSettingsOptinFragment, (C20380xT) r1.A1K.ANA.get());
    }

    public static void A1G(C32581dr r0, C92714eU r1) {
        A2B((AnonymousClass1T7) r0.A1K.A16.get(), r1);
    }

    public static void A1H(C32581dr r1, ShopsProductPreviewFragment shopsProductPreviewFragment) {
        AnonymousClass6HQ.A02(shopsProductPreviewFragment, C18840tu.A00(r1.A1K.AXc));
        AnonymousClass6HQ.A01((C1258461m) r1.A1K.Ae8.get(), shopsProductPreviewFragment);
        A3U(shopsProductPreviewFragment, (C122875vZ) r1.A1K.Aam.get());
        A1S((C32691e2) r1.A1K.A4R.get(), shopsProductPreviewFragment);
        A1o((C603337l) r1.A1K.Aad.get(), shopsProductPreviewFragment);
    }

    public static void A1I(C32581dr r1, VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        A3L((C20810yC) r1.A1K.A02.get(), voipCallControlBottomSheetV2);
        A1n((AnonymousClass1KK) r1.A1K.A19.get(), voipCallControlBottomSheetV2);
        A1P((AnonymousClass17Y) r1.A1K.A3e.get(), voipCallControlBottomSheetV2);
        A2j((AnonymousClass1NF) r1.A1K.A8y.get(), voipCallControlBottomSheetV2);
        A3V((AnonymousClass13J) r1.A1K.A6z.get(), voipCallControlBottomSheetV2);
        A2t((C21060yb) r1.A1K.A8W.get(), voipCallControlBottomSheetV2);
        A2w((C25271Fq) r1.A1K.A9D.get(), voipCallControlBottomSheetV2);
        A2g(A0L(r1), voipCallControlBottomSheetV2);
        A2l((AnonymousClass185) r1.A1K.A8u.get(), voipCallControlBottomSheetV2);
        A2h(C27111My.A11(r1.A1I), voipCallControlBottomSheetV2);
        A2Y(C18800tq.A4U(r1.A1K), voipCallControlBottomSheetV2);
        A3W((C19770wU) r1.A1K.A9Y.get(), voipCallControlBottomSheetV2);
        A2i((AnonymousClass1PZ) r1.A1K.A1L.get(), voipCallControlBottomSheetV2);
    }

    public static void A1J(C32581dr r1, BkScreenFragmentWithCustomPreloadScreens bkScreenFragmentWithCustomPreloadScreens) {
        AnonymousClass6HQ.A02(bkScreenFragmentWithCustomPreloadScreens, C18840tu.A00(r1.A1K.AXc));
        AnonymousClass6HQ.A01((C1258461m) r1.A1K.Ae8.get(), bkScreenFragmentWithCustomPreloadScreens);
        A1s((C130996Nh) r1.A1K.AC7.get(), bkScreenFragmentWithCustomPreloadScreens);
        A1t(r1.A1K.A3f(), bkScreenFragmentWithCustomPreloadScreens);
        A0k((AnonymousClass60P) r1.A1I.A3V.get(), bkScreenFragmentWithCustomPreloadScreens);
        A1q((AnonymousClass66C) r1.A1K.Ae4.get(), bkScreenFragmentWithCustomPreloadScreens);
        A3X(bkScreenFragmentWithCustomPreloadScreens, C27111My.A02(r1.A1I));
        A3Y(bkScreenFragmentWithCustomPreloadScreens, C20070wy.of());
    }

    public static void A1K(C32581dr r1, BkBottomSheetContentFragment bkBottomSheetContentFragment) {
        AnonymousClass6HQ.A02(bkBottomSheetContentFragment, C18840tu.A00(r1.A1K.AXc));
        AnonymousClass6HQ.A01((C1258461m) r1.A1K.Ae8.get(), bkBottomSheetContentFragment);
        A3Z(bkBottomSheetContentFragment, C18840tu.A00(r1.A1K.ABk));
    }

    /* access modifiers changed from: private */
    public void A1f(AnonymousClass6PU r2) {
        A1L((AnonymousClass17Y) this.A1K.A3e.get(), r2);
        A1k(r2, (C19770wU) this.A1K.A9Y.get());
        A1e((AnonymousClass1RU) this.A1K.A08.get(), r2);
        A1j(r2, (C31081bF) this.A1K.AY0.get());
        A1g(r2, (C19420v0) this.A1K.A9G.get());
        A1i(r2, (AnonymousClass6OJ) this.A1K.A00.ABX.get());
        A1h(r2, (AnonymousClass3DK) this.A1H.get());
    }

    private void A1u(C92084d6 r2) {
        A1p((C122285ub) this.A1K.A00.A5D.get(), r2);
        A1v(r2, C27111My.A02(this.A1I));
    }

    private void A2Z(C95894mS r2) {
        A2f(r2, (AnonymousClass1C6) this.A1K.A7s.get());
        A2a(r2, (AnonymousClass16D) this.A1K.A2A.get());
        A2c(r2, (C21060yb) this.A1K.A8W.get());
        A2b(r2, (AnonymousClass171) this.A1K.A90.get());
        A2d(r2, (C18820ts) this.A1K.A9X.get());
        A2e(r2, (C20350xQ) this.A1K.A3k.get());
        A1X((AnonymousClass1LI) this.A1K.A3Q.get(), r2);
    }

    public C32581dr(C27111My r1, C27071Mp r2, C18800tq r3) {
        this.A1K = r3;
        this.A1J = r2;
        this.A1I = r1;
        A0g();
    }

    public static C20760y7 A00() {
        return C20760y7.copyOf((Collection) A0f());
    }

    public static C92084d6 A0F(C32581dr r1) {
        C92084d6 A0E2 = A0E();
        r1.A1u(A0E2);
        return A0E2;
    }

    public static void A11(C32581dr r1, BusinessApiBrowseFragment businessApiBrowseFragment) {
        A24(businessApiBrowseFragment, r1.A0X());
        A0l((C115765jP) r1.A10.get(), businessApiBrowseFragment);
        A23(businessApiBrowseFragment, (AnonymousClass6OF) r1.A1K.A00.A0V.get());
        A20((C1255760k) r1.A1K.A00.A0W.get(), businessApiBrowseFragment);
        A21(r1.A0G(), businessApiBrowseFragment);
    }

    public static void A0h(C19460v5 r0, BonsaiDiscoveryFragment bonsaiDiscoveryFragment) {
        bonsaiDiscoveryFragment.A00 = r0;
    }

    public static void A0i(C24801Dv r0, BusinessDirectoryConsumerHomeFragment businessDirectoryConsumerHomeFragment) {
        businessDirectoryConsumerHomeFragment.A00 = r0;
    }

    public static void A0j(C19700wN r0, EmojiEditTextBottomSheetDialogFragment emojiEditTextBottomSheetDialogFragment) {
        emojiEditTextBottomSheetDialogFragment.A03 = r0;
    }

    public static void A0k(AnonymousClass60P r0, BkScreenFragmentWithCustomPreloadScreens bkScreenFragmentWithCustomPreloadScreens) {
        bkScreenFragmentWithCustomPreloadScreens.A02 = r0;
    }

    public static void A0l(C115765jP r0, BusinessApiBrowseFragment businessApiBrowseFragment) {
        businessApiBrowseFragment.A00 = r0;
    }

    public static void A0m(C115835jW r0, BusinessApiHomeFragment businessApiHomeFragment) {
        businessApiHomeFragment.A01 = r0;
    }

    public static void A0n(AnonymousClass60Q r0, BusinessDirectoryConsumerHomeFragment businessDirectoryConsumerHomeFragment) {
        businessDirectoryConsumerHomeFragment.A01 = r0;
    }

    public static void A0o(AnonymousClass60Q r0, BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment) {
        businessDirectoryContextualSearchFragment.A00 = r0;
    }

    public static void A0p(AnonymousClass60Q r0, BusinessDirectorySearchFragment businessDirectorySearchFragment) {
        businessDirectorySearchFragment.A01 = r0;
    }

    public static void A0q(AnonymousClass60R r0, BusinessDirectoryConsumerHomeFragment businessDirectoryConsumerHomeFragment) {
        businessDirectoryConsumerHomeFragment.A02 = r0;
    }

    public static void A0r(AnonymousClass60R r0, BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment) {
        businessDirectoryContextualSearchFragment.A01 = r0;
    }

    public static void A0s(AnonymousClass60R r0, BusinessDirectorySearchFragment businessDirectorySearchFragment) {
        businessDirectorySearchFragment.A02 = r0;
    }

    public static void A0t(C115855jY r0, BusinessDirectorySearchFragment businessDirectorySearchFragment) {
        businessDirectorySearchFragment.A03 = r0;
    }

    public static void A0u(C58252zZ r0, AddMembersRouter addMembersRouter) {
        addMembersRouter.A00 = r0;
    }

    public static void A0v(C191609Dq r0, GroupMembershipApprovalRequestsFragment groupMembershipApprovalRequestsFragment) {
        groupMembershipApprovalRequestsFragment.A00 = r0;
    }

    public static void A0w(C58262za r0, GroupPendingInvitesFragment groupPendingInvitesFragment) {
        groupPendingInvitesFragment.A00 = r0;
    }

    public static void A1L(AnonymousClass17Y r0, AnonymousClass6PU r1) {
        r1.A00 = r0;
    }

    public static void A1M(AnonymousClass17Y r0, EmojiEditTextBottomSheetDialogFragment emojiEditTextBottomSheetDialogFragment) {
        emojiEditTextBottomSheetDialogFragment.A04 = r0;
    }

    public static void A1N(AnonymousClass17Y r0, FlowsWebViewFragment flowsWebViewFragment) {
        flowsWebViewFragment.A01 = r0;
    }

    public static void A1O(AnonymousClass17Y r0, GroupMembershipApprovalRequestsFragment groupMembershipApprovalRequestsFragment) {
        groupMembershipApprovalRequestsFragment.A01 = r0;
    }

    public static void A1P(AnonymousClass17Y r0, VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        voipCallControlBottomSheetV2.A0I = r0;
    }

    public static void A1Q(C32691e2 r0, ContextualHelpBkScreenFragment contextualHelpBkScreenFragment) {
        contextualHelpBkScreenFragment.A02 = r0;
    }

    public static void A1R(C32691e2 r0, SupportBkScreenFragment supportBkScreenFragment) {
        supportBkScreenFragment.A02 = r0;
    }

    public static void A1S(C32691e2 r0, ShopsProductPreviewFragment shopsProductPreviewFragment) {
        shopsProductPreviewFragment.A02 = r0;
    }

    public static void A1T(PushnameEmojiBlacklistDialogFragment pushnameEmojiBlacklistDialogFragment, C18820ts r1) {
        pushnameEmojiBlacklistDialogFragment.A00 = r1;
    }

    public static void A1U(PushnameEmojiBlacklistDialogFragment pushnameEmojiBlacklistDialogFragment, AnonymousClass1H2 r1) {
        pushnameEmojiBlacklistDialogFragment.A01 = r1;
    }

    public static void A1V(PushnameEmojiBlacklistDialogFragment pushnameEmojiBlacklistDialogFragment, C20380xT r1) {
        pushnameEmojiBlacklistDialogFragment.A02 = r1;
    }

    public static void A1W(AnonymousClass3DY r0, SupportBkScreenFragment supportBkScreenFragment) {
        supportBkScreenFragment.A03 = r0;
    }

    public static void A1X(AnonymousClass1LI r0, C95894mS r1) {
        r1.A00 = r0;
    }

    public static void A1Y(AnonymousClass1LI r0, GroupPendingInvitesFragment groupPendingInvitesFragment) {
        groupPendingInvitesFragment.A01 = r0;
    }

    public static void A1Z(C33771fu r0, BusinessDirectoryConsumerHomeFragment businessDirectoryConsumerHomeFragment) {
        businessDirectoryConsumerHomeFragment.A03 = r0;
    }

    public static void A1a(C33771fu r0, BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment) {
        businessDirectoryContextualSearchFragment.A02 = r0;
    }

    public static void A1b(C33771fu r0, BusinessDirectorySearchFragment businessDirectorySearchFragment) {
        businessDirectorySearchFragment.A04 = r0;
    }

    public static void A1c(AnonymousClass1N3 r0, ConfirmFragment confirmFragment) {
        confirmFragment.A00 = r0;
    }

    public static void A1d(AnonymousClass1N3 r0, PermissionsFragment permissionsFragment) {
        permissionsFragment.A00 = r0;
    }

    public static void A1e(AnonymousClass1RU r0, AnonymousClass6PU r1) {
        r1.A01 = r0;
    }

    public static void A1g(AnonymousClass6PU r0, C19420v0 r1) {
        r0.A02 = r1;
    }

    public static void A1h(AnonymousClass6PU r0, AnonymousClass3DK r1) {
        r0.A03 = r1;
    }

    public static void A1i(AnonymousClass6PU r0, AnonymousClass6OJ r1) {
        r0.A04 = r1;
    }

    public static void A1j(AnonymousClass6PU r0, C31081bF r1) {
        r0.A05 = r1;
    }

    public static void A1k(AnonymousClass6PU r0, C19770wU r1) {
        r0.A06 = r1;
    }

    public static void A1l(FingerprintBottomSheet fingerprintBottomSheet, C19970wo r1) {
        fingerprintBottomSheet.A04 = r1;
    }

    public static void A1m(FingerprintBottomSheet fingerprintBottomSheet, C18820ts r1) {
        fingerprintBottomSheet.A05 = r1;
    }

    public static void A1n(AnonymousClass1KK r0, VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        voipCallControlBottomSheetV2.A0J = r0;
    }

    public static void A1o(C603337l r0, ShopsProductPreviewFragment shopsProductPreviewFragment) {
        shopsProductPreviewFragment.A03 = r0;
    }

    public static void A1p(C122285ub r0, C92084d6 r1) {
        r1.A03 = r0;
    }

    public static void A1q(AnonymousClass66C r0, BkScreenFragmentWithCustomPreloadScreens bkScreenFragmentWithCustomPreloadScreens) {
        bkScreenFragmentWithCustomPreloadScreens.A03 = r0;
    }

    public static void A1r(C130996Nh r0, SupportBkScreenFragment supportBkScreenFragment) {
        supportBkScreenFragment.A04 = r0;
    }

    public static void A1s(C130996Nh r0, BkScreenFragmentWithCustomPreloadScreens bkScreenFragmentWithCustomPreloadScreens) {
        bkScreenFragmentWithCustomPreloadScreens.A04 = r0;
    }

    public static void A1t(C1265064h r0, BkScreenFragmentWithCustomPreloadScreens bkScreenFragmentWithCustomPreloadScreens) {
        bkScreenFragmentWithCustomPreloadScreens.A05 = r0;
    }

    public static void A1v(C92084d6 r0, Map map) {
        r0.A07 = map;
    }

    public static void A1w(AnonymousClass1K7 r0, BonsaiDiscoveryFragment bonsaiDiscoveryFragment) {
        bonsaiDiscoveryFragment.A01 = r0;
    }

    public static void A1x(BonsaiDiscoveryFragment bonsaiDiscoveryFragment, AnonymousClass171 r1) {
        bonsaiDiscoveryFragment.A02 = r1;
    }

    public static void A1y(BonsaiDiscoveryFragment bonsaiDiscoveryFragment, C27731Pn r1) {
        bonsaiDiscoveryFragment.A04 = r1;
    }

    public static void A1z(BonsaiDiscoveryFragment bonsaiDiscoveryFragment, C19630wG r1) {
        bonsaiDiscoveryFragment.A05 = r1;
    }

    public static void A20(C1255760k r0, BusinessApiBrowseFragment businessApiBrowseFragment) {
        businessApiBrowseFragment.A01 = r0;
    }

    public static void A21(AnonymousClass5DU r0, BusinessApiBrowseFragment businessApiBrowseFragment) {
        businessApiBrowseFragment.A02 = r0;
    }

    public static void A22(AnonymousClass5DU r0, BusinessApiHomeFragment businessApiHomeFragment) {
        businessApiHomeFragment.A02 = r0;
    }

    public static void A23(BusinessApiBrowseFragment businessApiBrowseFragment, AnonymousClass6OF r1) {
        businessApiBrowseFragment.A03 = r1;
    }

    public static void A24(BusinessApiBrowseFragment businessApiBrowseFragment, AnonymousClass625 r1) {
        businessApiBrowseFragment.A04 = r1;
    }

    public static void A25(BusinessApiHomeFragment businessApiHomeFragment, C20810yC r1) {
        businessApiHomeFragment.A04 = r1;
    }

    public static void A26(BusinessApiHomeFragment businessApiHomeFragment, AnonymousClass625 r1) {
        businessApiHomeFragment.A05 = r1;
    }

    public static void A27(BusinessApiHomeFragment businessApiHomeFragment, AnonymousClass1N2 r1) {
        businessApiHomeFragment.A06 = r1;
    }

    public static void A28(C142646pD r0, BusinessDirectoryConsumerHomeFragment businessDirectoryConsumerHomeFragment) {
        businessDirectoryConsumerHomeFragment.A04 = r0;
    }

    public static void A29(C142646pD r0, BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment) {
        businessDirectoryContextualSearchFragment.A03 = r0;
    }

    public static void A2A(C142646pD r0, BusinessDirectorySearchFragment businessDirectorySearchFragment) {
        businessDirectorySearchFragment.A05 = r0;
    }

    public static void A2B(AnonymousClass1T7 r0, C92714eU r1) {
        r1.A00 = r0;
    }

    public static void A2C(AnonymousClass5DR r0, BusinessDirectorySearchFragment businessDirectorySearchFragment) {
        businessDirectorySearchFragment.A06 = r0;
    }

    public static void A2D(AnonymousClass66G r0, BusinessDirectoryConsumerHomeFragment businessDirectoryConsumerHomeFragment) {
        businessDirectoryConsumerHomeFragment.A05 = r0;
    }

    public static void A2E(AnonymousClass66G r0, BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment) {
        businessDirectoryContextualSearchFragment.A04 = r0;
    }

    public static void A2F(AnonymousClass66G r0, BusinessDirectorySearchFragment businessDirectorySearchFragment) {
        businessDirectorySearchFragment.A07 = r0;
    }

    public static void A2G(AnonymousClass6V2 r0, BusinessDirectoryConsumerHomeFragment businessDirectoryConsumerHomeFragment) {
        businessDirectoryConsumerHomeFragment.A06 = r0;
    }

    public static void A2H(AnonymousClass67X r0, BusinessDirectoryConsumerHomeFragment businessDirectoryConsumerHomeFragment) {
        businessDirectoryConsumerHomeFragment.A07 = r0;
    }

    public static void A2I(LocationUpdateListener locationUpdateListener, BusinessDirectoryConsumerHomeFragment businessDirectoryConsumerHomeFragment) {
        businessDirectoryConsumerHomeFragment.A08 = locationUpdateListener;
    }

    public static void A2J(LocationUpdateListener locationUpdateListener, BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment) {
        businessDirectoryContextualSearchFragment.A05 = locationUpdateListener;
    }

    public static void A2K(LocationUpdateListener locationUpdateListener, BusinessDirectorySearchFragment businessDirectorySearchFragment) {
        businessDirectorySearchFragment.A08 = locationUpdateListener;
    }

    public static void A2L(AnonymousClass5DV r0, BusinessDirectoryConsumerHomeFragment businessDirectoryConsumerHomeFragment) {
        businessDirectoryConsumerHomeFragment.A09 = r0;
    }

    public static void A2M(AnonymousClass5DV r0, BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment) {
        businessDirectoryContextualSearchFragment.A06 = r0;
    }

    public static void A2N(AnonymousClass5DV r0, BusinessDirectorySearchFragment businessDirectorySearchFragment) {
        businessDirectorySearchFragment.A09 = r0;
    }

    public static void A2O(BusinessDirectoryConsumerHomeFragment businessDirectoryConsumerHomeFragment, C33751fs r1) {
        businessDirectoryConsumerHomeFragment.A0C = r1;
    }

    public static void A2P(BusinessDirectoryConsumerHomeFragment businessDirectoryConsumerHomeFragment, AnonymousClass1QW r1) {
        businessDirectoryConsumerHomeFragment.A0D = r1;
    }

    public static void A2Q(BusinessDirectoryConsumerHomeFragment businessDirectoryConsumerHomeFragment, AnonymousClass1N2 r1) {
        businessDirectoryConsumerHomeFragment.A0E = r1;
    }

    public static void A2R(BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment, C33751fs r1) {
        businessDirectoryContextualSearchFragment.A09 = r1;
    }

    public static void A2S(BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment, AnonymousClass1QW r1) {
        businessDirectoryContextualSearchFragment.A0A = r1;
    }

    public static void A2T(BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment, AnonymousClass1N2 r1) {
        businessDirectoryContextualSearchFragment.A0C = r1;
    }

    public static void A2U(BusinessDirectorySearchFragment businessDirectorySearchFragment, C33751fs r1) {
        businessDirectorySearchFragment.A0C = r1;
    }

    public static void A2V(BusinessDirectorySearchFragment businessDirectorySearchFragment, C20830yE r1) {
        businessDirectorySearchFragment.A0D = r1;
    }

    public static void A2W(BusinessDirectorySearchFragment businessDirectorySearchFragment, C18820ts r1) {
        businessDirectorySearchFragment.A0E = r1;
    }

    public static void A2X(BusinessDirectorySearchFragment businessDirectorySearchFragment, AnonymousClass1QW r1) {
        businessDirectorySearchFragment.A0F = r1;
    }

    public static void A2Y(C30531aM r0, VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        voipCallControlBottomSheetV2.A0K = r0;
    }

    public static void A2a(C95894mS r0, AnonymousClass16D r1) {
        r0.A02 = r1;
    }

    public static void A2b(C95894mS r0, AnonymousClass171 r1) {
        r0.A03 = r1;
    }

    public static void A2c(C95894mS r0, C21060yb r1) {
        r0.A04 = r1;
    }

    public static void A2d(C95894mS r0, C18820ts r1) {
        r0.A05 = r1;
    }

    public static void A2e(C95894mS r0, C20350xQ r1) {
        r0.A06 = r1;
    }

    public static void A2f(C95894mS r0, AnonymousClass1C6 r1) {
        r0.A08 = r1;
    }

    public static void A2g(C95894mS r0, VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        voipCallControlBottomSheetV2.A0M = r0;
    }

    public static void A2h(C160927lo r0, VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        voipCallControlBottomSheetV2.A0Q = r0;
    }

    public static void A2i(AnonymousClass1PZ r0, VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        voipCallControlBottomSheetV2.A0R = r0;
    }

    public static void A2j(AnonymousClass1NF r0, VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        voipCallControlBottomSheetV2.A0S = r0;
    }

    public static void A2k(C19600wD r0, SupportBkScreenFragment supportBkScreenFragment) {
        supportBkScreenFragment.A05 = r0;
    }

    public static void A2l(AnonymousClass185 r0, VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        voipCallControlBottomSheetV2.A0V = r0;
    }

    public static void A2m(AnonymousClass171 r0, GroupMembershipApprovalRequestsFragment groupMembershipApprovalRequestsFragment) {
        groupMembershipApprovalRequestsFragment.A02 = r0;
    }

    public static void A2n(AnonymousClass171 r0, GroupPendingInvitesFragment groupPendingInvitesFragment) {
        groupPendingInvitesFragment.A02 = r0;
    }

    public static void A2o(C27731Pn r0, GroupPendingInvitesFragment groupPendingInvitesFragment) {
        groupPendingInvitesFragment.A03 = r0;
    }

    public static void A2p(C33751fs r0, ContextualHelpBkScreenFragment contextualHelpBkScreenFragment) {
        contextualHelpBkScreenFragment.A03 = r0;
    }

    public static void A2q(C21060yb r0, EmojiEditTextBottomSheetDialogFragment emojiEditTextBottomSheetDialogFragment) {
        emojiEditTextBottomSheetDialogFragment.A06 = r0;
    }

    public static void A2r(C21060yb r0, GroupMembershipApprovalRequestsFragment groupMembershipApprovalRequestsFragment) {
        groupMembershipApprovalRequestsFragment.A03 = r0;
    }

    public static void A2s(C21060yb r0, SupportBkScreenFragment supportBkScreenFragment) {
        supportBkScreenFragment.A06 = r0;
    }

    public static void A2t(C21060yb r0, VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        voipCallControlBottomSheetV2.A0W = r0;
    }

    public static void A2u(C19970wo r0, FlowsWebViewFragment flowsWebViewFragment) {
        flowsWebViewFragment.A02 = r0;
    }

    public static void A2v(AnonymousClass1KW r0, FlowsWebViewFragment flowsWebViewFragment) {
        flowsWebViewFragment.A03 = r0;
    }

    public static void A2w(C25271Fq r0, VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        voipCallControlBottomSheetV2.A0X = r0;
    }

    public static void A2x(C20830yE r0, SupportBkScreenFragment supportBkScreenFragment) {
        supportBkScreenFragment.A07 = r0;
    }

    public static void A2y(C19420v0 r0, EmojiEditTextBottomSheetDialogFragment emojiEditTextBottomSheetDialogFragment) {
        emojiEditTextBottomSheetDialogFragment.A07 = r0;
    }

    public static void A2z(C18820ts r0, EmojiEditTextBottomSheetDialogFragment emojiEditTextBottomSheetDialogFragment) {
        emojiEditTextBottomSheetDialogFragment.A08 = r0;
    }

    public static void A30(C18820ts r0, FlowsWebViewFragment flowsWebViewFragment) {
        flowsWebViewFragment.A04 = r0;
    }

    public static void A31(C18820ts r0, GroupPendingInvitesFragment groupPendingInvitesFragment) {
        groupPendingInvitesFragment.A04 = r0;
    }

    public static void A32(C220412q r0, AddMembersRouter addMembersRouter) {
        addMembersRouter.A01 = r0;
    }

    public static void A33(EmojiEditTextBottomSheetDialogFragment emojiEditTextBottomSheetDialogFragment, AnonymousClass1N0 r1) {
        emojiEditTextBottomSheetDialogFragment.A0A = r1;
    }

    public static void A34(EmojiEditTextBottomSheetDialogFragment emojiEditTextBottomSheetDialogFragment, C1261362r r1) {
        emojiEditTextBottomSheetDialogFragment.A0B = r1;
    }

    public static void A35(EmojiEditTextBottomSheetDialogFragment emojiEditTextBottomSheetDialogFragment, AnonymousClass6O1 r1) {
        emojiEditTextBottomSheetDialogFragment.A0C = r1;
    }

    public static void A36(EmojiEditTextBottomSheetDialogFragment emojiEditTextBottomSheetDialogFragment, AnonymousClass1XN r1) {
        emojiEditTextBottomSheetDialogFragment.A0D = r1;
    }

    public static void A37(EmojiEditTextBottomSheetDialogFragment emojiEditTextBottomSheetDialogFragment, AnonymousClass1H2 r1) {
        emojiEditTextBottomSheetDialogFragment.A0E = r1;
    }

    public static void A38(EmojiEditTextBottomSheetDialogFragment emojiEditTextBottomSheetDialogFragment, EmojiSearchProvider emojiSearchProvider) {
        emojiEditTextBottomSheetDialogFragment.A0F = emojiSearchProvider;
    }

    public static void A39(EmojiEditTextBottomSheetDialogFragment emojiEditTextBottomSheetDialogFragment, C20810yC r1) {
        emojiEditTextBottomSheetDialogFragment.A0G = r1;
    }

    public static void A3A(EmojiEditTextBottomSheetDialogFragment emojiEditTextBottomSheetDialogFragment, C19890wg r1) {
        emojiEditTextBottomSheetDialogFragment.A0H = r1;
    }

    public static void A3B(EmojiEditTextBottomSheetDialogFragment emojiEditTextBottomSheetDialogFragment, AnonymousClass1N2 r1) {
        emojiEditTextBottomSheetDialogFragment.A0I = r1;
    }

    public static void A3C(C609439y r0, FlowsWebViewFragment flowsWebViewFragment) {
        flowsWebViewFragment.A05 = r0;
    }

    public static void A3D(AnonymousClass6PZ r0, FlowsWebViewFragment flowsWebViewFragment) {
        flowsWebViewFragment.A06 = r0;
    }

    public static void A3E(AnonymousClass1KT r0, FlowsWebViewFragment flowsWebViewFragment) {
        flowsWebViewFragment.A07 = r0;
    }

    public static void A3F(FlowsWebViewFragment flowsWebViewFragment, C20810yC r1) {
        flowsWebViewFragment.A09 = r1;
    }

    public static void A3G(FlowsWebViewFragment flowsWebViewFragment, C21080yd r1) {
        flowsWebViewFragment.A0A = r1;
    }

    public static void A3H(FlowsWebViewFragment flowsWebViewFragment, AnonymousClass1N2 r1) {
        flowsWebViewFragment.A0B = r1;
    }

    public static void A3I(C20810yC r0, GroupMembershipApprovalRequestsFragment groupMembershipApprovalRequestsFragment) {
        groupMembershipApprovalRequestsFragment.A04 = r0;
    }

    public static void A3J(C20810yC r0, ConfirmFragment confirmFragment) {
        confirmFragment.A01 = r0;
    }

    public static void A3K(C20810yC r0, PermissionsFragment permissionsFragment) {
        permissionsFragment.A01 = r0;
    }

    public static void A3L(C20810yC r0, VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        voipCallControlBottomSheetV2.A0Y = r0;
    }

    public static void A3M(C168097zh r0, GroupMembershipApprovalRequestsFragment groupMembershipApprovalRequestsFragment) {
        groupMembershipApprovalRequestsFragment.A05 = r0;
    }

    public static void A3N(GroupMembershipApprovalRequestsFragment groupMembershipApprovalRequestsFragment, C32681e1 r1) {
        groupMembershipApprovalRequestsFragment.A08 = r1;
    }

    public static void A3O(AnonymousClass1CF r0, SupportBkScreenFragment supportBkScreenFragment) {
        supportBkScreenFragment.A08 = r0;
    }

    public static void A3P(SupportBkScreenFragment supportBkScreenFragment, AnonymousClass3UV r1) {
        supportBkScreenFragment.A09 = r1;
    }

    public static void A3Q(SupportBkScreenFragment supportBkScreenFragment, C19770wU r1) {
        supportBkScreenFragment.A0A = r1;
    }

    public static void A3R(AnonymousClass1VC r0, PermissionsFragment permissionsFragment) {
        permissionsFragment.A02 = r0;
    }

    public static void A3S(AnonymousClass3E7 r0, InteropSettingsOptinFragment interopSettingsOptinFragment) {
        interopSettingsOptinFragment.A00 = r0;
    }

    public static void A3T(InteropSettingsOptinFragment interopSettingsOptinFragment, C20380xT r1) {
        interopSettingsOptinFragment.A01 = r1;
    }

    public static void A3U(ShopsProductPreviewFragment shopsProductPreviewFragment, C122875vZ r1) {
        shopsProductPreviewFragment.A05 = r1;
    }

    public static void A3V(AnonymousClass13J r0, VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        voipCallControlBottomSheetV2.A0Z = r0;
    }

    public static void A3W(C19770wU r0, VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        voipCallControlBottomSheetV2.A0c = r0;
    }

    public static void A3X(BkScreenFragmentWithCustomPreloadScreens bkScreenFragmentWithCustomPreloadScreens, Map map) {
        bkScreenFragmentWithCustomPreloadScreens.A06 = map;
    }

    public static void A3Y(BkScreenFragmentWithCustomPreloadScreens bkScreenFragmentWithCustomPreloadScreens, Map map) {
        bkScreenFragmentWithCustomPreloadScreens.A07 = map;
    }

    public static void A3Z(BkBottomSheetContentFragment bkBottomSheetContentFragment, AnonymousClass005 r1) {
        bkBottomSheetContentFragment.A03 = r1;
    }
}
