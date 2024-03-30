package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass012;
import X.AnonymousClass01P;
import X.AnonymousClass0V9;
import X.AnonymousClass11F;
import X.AnonymousClass13K;
import X.AnonymousClass141;
import X.AnonymousClass159;
import X.AnonymousClass15F;
import X.AnonymousClass15K;
import X.AnonymousClass16J;
import X.AnonymousClass190;
import X.AnonymousClass1Q8;
import X.AnonymousClass1RY;
import X.AnonymousClass1XQ;
import X.AnonymousClass2HH;
import X.AnonymousClass2JR;
import X.AnonymousClass3C1;
import X.AnonymousClass3DS;
import X.AnonymousClass3EY;
import X.AnonymousClass3HT;
import X.AnonymousClass3KV;
import X.AnonymousClass3P8;
import X.AnonymousClass3T1;
import X.AnonymousClass3XU;
import X.AnonymousClass3ZU;
import X.AnonymousClass4Q1;
import X.AnonymousClass4Q5;
import X.AnonymousClass4V6;
import X.AnonymousClass6YP;
import X.C107265Nh;
import X.C161947nj;
import X.C167497y9;
import X.C18740tg;
import X.C18800tq;
import X.C18950u5;
import X.C19430v1;
import X.C19570wA;
import X.C196089Xp;
import X.C19630wG;
import X.C206729ts;
import X.C20690y0;
import X.C207219uk;
import X.C20800yB;
import X.C20810yC;
import X.C21000yV;
import X.C21060yb;
import X.C21710zg;
import X.C26981Mg;
import X.C27101Mx;
import X.C36351kA;
import X.C36371kC;
import X.C39441sH;
import X.C39471sS;
import X.C40061uh;
import X.C43462Hr;
import X.C46812bi;
import X.C52492pW;
import X.C54912tl;
import X.C600336f;
import X.C61413Bt;
import X.C62313Fr;
import X.C64933Qa;
import X.C65103Qt;
import X.C70803fk;
import X.C71873hT;
import X.C80233v4;
import X.C81103wT;
import X.C87124No;
import X.C88684Tq;
import X.C88814Ud;
import X.C88974Ut;
import X.C89014Ux;
import android.app.Dialog;
import android.app.assist.AssistContent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.conversation.ConversationListView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.picker.search.PickerSearchDialogFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Conversation extends C43462Hr implements AnonymousClass4V6, AnonymousClass15K, AnonymousClass159, AnonymousClass15F, C161947nj, C87124No {
    public List A00 = AnonymousClass001.A0I();
    public C61413Bt A01;
    public AnonymousClass3C1 A02;
    public C70803fk A03;
    public AnonymousClass2JR A04;
    public AnonymousClass16J A05;
    public C71873hT A06;
    public C18800tq A07;

    public /* synthetic */ void B1Z(int i) {
    }

    public String BCV() {
        return "conversation_activity";
    }

    public boolean BL8() {
        return true;
    }

    public void Bal(ArrayList arrayList) {
    }

    public Intent BnJ(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, boolean z) {
        return C26981Mg.A01(broadcastReceiver, this, intentFilter, true);
    }

    public void onCreate(Bundle bundle) {
        this.A05 = false;
        if (this.A03 == null) {
            C70803fk ADe = ((C27101Mx) C19570wA.A00(C27101Mx.class, this)).ADe();
            this.A03 = ADe;
            ADe.A2l = this;
            List list = this.A00;
            if (list != null && 0 < list.size()) {
                list.get(0);
                throw AnonymousClass001.A0A("onCreate");
            }
        }
        this.A03.A29(bundle);
        this.A04 = this.A02.A00(this.A03);
        AnonymousClass16J r1 = this.A05;
        C71873hT r0 = this.A06;
        if (r0 == null) {
            r0 = this.A01.A00(this, this);
            this.A06 = r0;
        }
        r1.registerObserver(r0);
    }

    public C21710zg A2K() {
        C18800tq r0 = this.A07;
        if (!(r0 == null || r0.Azp() == null)) {
            this.A07.Azp().A0E(5233);
        }
        C21710zg A2K = super.A2K();
        A2K.A02 = true;
        A2K.A04 = true;
        return A2K;
    }

    public void A2L() {
        this.A03.A1v();
    }

    public void A2W() {
        this.A03.A1r();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2X() {
        /*
            r5 = this;
            X.3fk r4 = r5.A03
            X.11F r1 = r4.A45
            boolean r0 = r1 instanceof X.C177538dx
            if (r0 == 0) goto L_0x0046
            java.lang.String r3 = "ConversationBroadcastList"
        L_0x000a:
            X.17Y r2 = r4.A1U
            r1 = 44
            X.751 r0 = new X.751
            r0.<init>(r1, r3, r4)
            r2.A0H(r0)
        L_0x0016:
            X.11F r3 = r4.A45
            boolean r2 = r3 instanceof X.C28981Uw
            X.1N6 r1 = r4.A56
            r0 = 4
            if (r2 == 0) goto L_0x0021
            r0 = 26
        L_0x0021:
            r1.A03(r3, r0)
            X.28d r1 = r4.A2P
            boolean r0 = r1 instanceof X.C43322Gx
            if (r0 == 0) goto L_0x0031
            X.2Gx r1 = (X.C43322Gx) r1
            if (r1 == 0) goto L_0x0031
            X.C43322Gx.A04(r1)
        L_0x0031:
            boolean r0 = X.C70803fk.A1f(r4)
            if (r0 == 0) goto L_0x0042
            X.3B6 r0 = X.C70803fk.A0F(r4)
            X.3F0 r1 = r0.A04
            X.11F r0 = r4.A45
            r1.A00(r0)
        L_0x0042:
            super.A2X()
            return
        L_0x0046:
            boolean r0 = X.AnonymousClass143.A0G(r1)
            if (r0 == 0) goto L_0x004f
            java.lang.String r3 = "ConversationGroupChat"
            goto L_0x000a
        L_0x004f:
            boolean r0 = r1 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x0016
            java.lang.String r3 = "ConversationNewsletter"
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Conversation.A2X():void");
    }

    public void A2Y() {
        C70803fk r0 = this.A03;
        getTheme();
        r0.A5o.get();
        super.A2Y();
    }

    public void A2x(int i) {
        C70803fk r1 = this.A03;
        C39441sH r0 = r1.A1k;
        if (r0 != null) {
            r0.A00.A00();
        }
        C167497y9 r02 = r1.A1r;
        if (r02 != null) {
            r02.A0T();
        }
    }

    public void B0m() {
        this.A03.A1l();
    }

    public void B0n(AnonymousClass141 r3, AnonymousClass11F r4) {
        C70803fk.A1F(this.A03, r3, r4, false);
    }

    public void B1Y() {
        this.A03.A2U.A0O = true;
    }

    public boolean B2l(C46812bi r4, boolean z) {
        C70803fk r2 = this.A03;
        AnonymousClass3T1 A0J = C70803fk.A0J(C70803fk.A0D(r2), r4);
        if (A0J == null || !C54912tl.A00(C70803fk.A0H(r2), A0J, r4, z)) {
            return false;
        }
        return true;
    }

    public boolean B3a(C46812bi r2, int i, boolean z, boolean z2) {
        return this.A03.A2h(r2, i, z, z2);
    }

    public void B5Q() {
        ConversationListView conversationListView = this.A03.A2U;
        if (conversationListView.A0K) {
            conversationListView.A0K = false;
            conversationListView.setTranscriptMode(0);
        }
    }

    public void B5S(C64933Qa r2) {
        this.A00.A0K.A03(r2);
    }

    public AnonymousClass01P BAc() {
        return this.A06.A02;
    }

    public AnonymousClass3ZU BHi(int i, int i2, boolean z) {
        C70803fk r1 = this.A03;
        String string = getString(i);
        View contentView = r1.A2l.getContentView();
        List emptyList = Collections.emptyList();
        return new AnonymousClass3ZU(contentView, C70803fk.A07(r1), r1.A31, string, emptyList, i2, z);
    }

    public boolean BJx() {
        return AnonymousClass000.A1R(C70803fk.A0D(this.A03).getCount());
    }

    public boolean BJy() {
        return this.A03.A6F;
    }

    public boolean BK7() {
        return this.A03.A2a();
    }

    public void BKc(AnonymousClass3T1 r9, C64933Qa r10, AnonymousClass3DS r11, String str, String str2, Bitmap[] bitmapArr, int i) {
        this.A03.A2M(r9, r10, r11, str, str2, bitmapArr, i);
    }

    public boolean BMF() {
        ConversationListView conversationListView = this.A03.A2U;
        if (conversationListView != null) {
            return conversationListView.A0B(0);
        }
        return false;
    }

    public boolean BMX() {
        return this.A03.A6N;
    }

    public boolean BMv() {
        return this.A03.A2t.A0U();
    }

    public boolean BMz() {
        AnonymousClass6YP r0 = this.A03.A5Z;
        if (r0 == null || !r0.A0V()) {
            return false;
        }
        return true;
    }

    public boolean BNE() {
        AccessibilityManager A0M;
        C70803fk r2 = this.A03;
        if (r2.A6R || (A0M = r2.A2l.getSystemServices().A0M()) == null || !A0M.isTouchExplorationEnabled()) {
            return true;
        }
        return false;
    }

    public boolean BNM() {
        return this.A03.A3Y.A0i;
    }

    public void BNq(C107265Nh r2, int i) {
        this.A03.A2T(r2);
    }

    public /* bridge */ /* synthetic */ void BNx(Object obj) {
        this.A04.B73((AnonymousClass4Q1) null, Collections.singleton(obj), 1);
    }

    public void BPZ() {
        this.A03.A1q();
    }

    public void BPa() {
        this.A03.A2Z.A00.A00(AnonymousClass2HH.class);
    }

    public void BQs(long j, boolean z) {
        C70803fk.A1C(this.A03, j, false, z);
    }

    public void BRT() {
        C70803fk r2 = this.A03;
        r2.A2G(r2.A3Y, false, false);
    }

    public boolean BUQ(AnonymousClass11F r2, int i) {
        return this.A03.A2f(r2, i);
    }

    public void BUk(C600336f r2, AnonymousClass3T1 r3, int i, long j) {
        this.A03.A2D(r2, r3, i);
    }

    public void BUl(boolean z) {
        this.A03.A2X(z);
    }

    public void BUu(long j, boolean z) {
        C70803fk.A1C(this.A03, j, true, z);
    }

    public void BVD() {
        this.A03.A1t();
    }

    public void BWO(AnonymousClass1XQ r3) {
        this.A03.A71.BWN(r3.A00);
    }

    public void BXb(UserJid userJid, int i) {
        C39471sS r2 = this.A03.A2z;
        C39471sS.A01(r2.A01, r2, C52492pW.LOADING_FAILED);
    }

    public void BXc(UserJid userJid, boolean z, boolean z2) {
        this.A03.A2I(userJid);
    }

    public void BYa() {
        C70803fk r3 = this.A03;
        C70803fk.A0K(r3).Boy(new C81103wT(r3, 8));
    }

    public void BYd(AnonymousClass3XU r2) {
        this.A03.A2H(r2);
    }

    public void Bch(PickerSearchDialogFragment pickerSearchDialogFragment) {
        C70803fk r1 = this.A03;
        r1.A4c.A02(pickerSearchDialogFragment);
        if (r1.A2a()) {
            AnonymousClass6YP r0 = r1.A5Z;
            C18740tg.A06(r0);
            r0.A0K();
        }
    }

    public void BeM() {
        this.A03.A2Q.A0B();
    }

    public boolean BgA() {
        C70803fk r3 = this.A03;
        return r3.A2e.A0T(C36371kC.A00(C20800yB.A01(C21000yV.A01, ((AnonymousClass13K) r3.A5I).A02, 2889) ? 1 : 0));
    }

    public void Bix() {
        this.A03.A2Q.A0A();
    }

    public void BkD() {
        C70803fk r3 = this.A03;
        r3.A2G(r3.A3Y, true, false);
    }

    public void Bl8(AnonymousClass4Q5 r2, C207219uk r3) {
        this.A03.A2C(r2, r3);
    }

    public void Bln(String str) {
        if (str.equals(String.valueOf(14))) {
            C70803fk r2 = this.A03;
            r2.A5S.Boy(C80233v4.A00(r2, 45));
        }
    }

    public void BmB(AnonymousClass141 r2, boolean z, boolean z2) {
        this.A03.A2G(r2, z, z2);
    }

    public void Bn8() {
        C70803fk.A11(this.A03);
    }

    public void BoF() {
        C40061uh r0 = this.A03.A2x;
        C40061uh.A09(r0);
        C40061uh.A07(r0);
    }

    public void BoW() {
        C70803fk r2 = this.A03;
        r2.A2x.A0a((AnonymousClass3T1) null);
        C70803fk.A0f(r2);
    }

    public void Bob(C46812bi r7, long j) {
        C70803fk r5 = this.A03;
        if (r5.A07 == r7.A1N) {
            r5.A2U.removeCallbacks(r5.A62);
            r5.A2U.postDelayed(r5.A62, j);
        }
    }

    public void BpS(AnonymousClass3T1 r2) {
        this.A03.A2K(r2);
    }

    public void BpT(ViewGroup viewGroup, AnonymousClass3T1 r3) {
        this.A03.A2B(viewGroup, r3);
    }

    public void Bpj(AnonymousClass3T1 r2, AnonymousClass3EY r3) {
        this.A03.A2N(r2, r3);
    }

    public void Bpt(AnonymousClass11F r2, String str, String str2, String str3, String str4, long j) {
        this.A03.A25(j, str, str3);
    }

    public void Bpu(AnonymousClass3T1 r2, String str, String str2, String str3) {
        this.A03.A2Q(r2, str2, str3);
    }

    public void Bpv(AnonymousClass3T1 r2, AnonymousClass3P8 r3) {
        this.A03.A2P(r2, r3);
    }

    public void Bpw(AnonymousClass3T1 r2, C206729ts r3) {
        this.A03.A2O(r2, r3);
    }

    public void Btk(DialogFragment dialogFragment) {
        this.A03.A2l.Btm(dialogFragment);
    }

    public void Bu7(AnonymousClass3KV r2) {
        this.A03.A2E(r2);
    }

    public void BuQ(AnonymousClass141 r2) {
        this.A03.A2F(r2);
    }

    public void Buh(AnonymousClass3KV r4, int i) {
        C70803fk r0 = this.A03;
        r0.A25.Bug(C70803fk.A0C(r0), r4, 9);
    }

    public void Bv3(AnonymousClass11F r3) {
        C70803fk r1 = this.A03;
        if (r1.A2l.getScreenLockStateProvider().A01()) {
            r1.A6Z = true;
            if (!r3.equals(r1.A45)) {
                r1.A6S = false;
            }
        }
    }

    public Object BvG(Class cls) {
        return this.A00.BAB(cls);
    }

    public void Bwj(C107265Nh r2) {
        this.A03.A2U(r2);
    }

    public void Bx8(C46812bi r2, long j, boolean z) {
        this.A03.A2S(r2, j, z);
    }

    public void attachBaseContext(Context context) {
        if (context != null) {
            this.A07 = C36371kC.A0P(context);
        }
        super.attachBaseContext(context);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.A03.A2e(motionEvent);
    }

    public void finish() {
        C70803fk r3 = this.A03;
        if (r3.A01 == 21 && C70803fk.A1a(r3)) {
            C20810yC r1 = r3.A3n;
            C21000yV r2 = C21000yV.A01;
            if (C20800yB.A01(r2, r1, 7067)) {
                if (C36351kA.A1W(r3.A2x.A0S)) {
                    Intent A032 = AnonymousClass190.A03(C70803fk.A0C(r3));
                    A032.addFlags(67108864);
                    r3.A2l.startActivity(A032);
                } else if (C20800yB.A01(r2, r3.A3n, 7068)) {
                    r3.A5S.Bp1(new C81103wT(r3, 7));
                }
            }
        }
        super.finish();
    }

    public C196089Xp getCatalogLoadSession() {
        return (C196089Xp) this.A03.A1k().get();
    }

    public AnonymousClass11F getChatJid() {
        return this.A03.A45;
    }

    public AnonymousClass141 getContact() {
        return this.A03.A3Y;
    }

    public AnonymousClass1RY getContactPhotosLoader() {
        AnonymousClass4V6 r0 = this.A03.A2l;
        return r0.getConversationRowInflater().A02(r0.getActivityNullable());
    }

    public C62313Fr getConversationBanners() {
        return this.A03.A2Z;
    }

    public C89014Ux getConversationRowCustomizer() {
        return (C89014Ux) this.A03.A79.get();
    }

    public C88974Ut getInlineVideoPlaybackHandler() {
        return this.A03.A5U;
    }

    public AnonymousClass3T1 getQuotedMessage() {
        return this.A03.A2x.A0F;
    }

    public Long getSimilarChannelsSessionId() {
        return this.A03.A61;
    }

    public C19630wG getWAContext() {
        return this.A00.A0T;
    }

    public void onBackPressed() {
        this.A03.A1s();
    }

    public Dialog onCreateDialog(int i) {
        return this.A03.A1j(i);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C70803fk r2 = this.A03;
        for (C88684Tq BUv : r2.A7C) {
            BUv.BUv(menu);
        }
        return r2.A2l.BiY(menu);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.A03.A2c(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.A03.A2d(i, keyEvent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        for (C88684Tq Bbx : this.A03.A7C) {
            if (Bbx.Bbx(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        C70803fk r2 = this.A03;
        for (C88684Tq BdM : r2.A7C) {
            BdM.BdM(menu);
        }
        return r2.A2l.Bic(menu);
    }

    public void onResume() {
        this.A03.A1y();
    }

    public boolean onSearchRequested() {
        return this.A03.A2b();
    }

    public void onStart() {
        this.A03.A1z();
    }

    public void onWindowFocusChanged(boolean z) {
        this.A03.A2Y(z);
    }

    public void scrollBy(int i, int i2) {
        C40061uh r0 = this.A03.A2x;
        r0.A14.A0D(new AnonymousClass3HT(i));
    }

    public void setFollowPlayingVoiceMemo(boolean z) {
        this.A03.A6E = true;
    }

    public void setOneConversationRowPressed(boolean z) {
        this.A03.A6N = z;
    }

    public int A2I() {
        return 703926750;
    }

    public boolean A2f() {
        return true;
    }

    public boolean A2g() {
        return true;
    }

    public boolean A3e() {
        return true;
    }

    public Point BAC() {
        return C65103Qt.A02(C21060yb.A01(this));
    }

    public C18950u5 BGv() {
        return C19430v1.A01;
    }

    public void BJO() {
        finish();
    }

    public void BYZ() {
    }

    public void Be8(int i) {
        super.Be8(i);
        this.A03.A22(i);
    }

    public void BiV() {
        super.onBackPressed();
    }

    public boolean BiY(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    public boolean Bia(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public boolean Bib(int i, KeyEvent keyEvent) {
        return super.onKeyUp(i, keyEvent);
    }

    public boolean Bic(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    public void Bie() {
        super.onResume();
    }

    public void Bif() {
        super.onStart();
    }

    public void Bih(AnonymousClass0V9 r3) {
        super.Bih(r3);
        AnonymousClass1Q8 r0 = (AnonymousClass1Q8) this.A03.A2F;
        r0.A02 = false;
        C88814Ud r02 = r0.A00;
        if (r02 != null) {
            r02.setShouldHideBanner(false);
        }
    }

    public void Bii(AnonymousClass0V9 r3) {
        super.Bii(r3);
        AnonymousClass1Q8 r0 = (AnonymousClass1Q8) this.A03.A2F;
        r0.A02 = true;
        C88814Ud r02 = r0.A00;
        if (r02 != null) {
            r02.setShouldHideBanner(true);
        }
    }

    public boolean BvF(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public C20810yC getAbProps() {
        return this.A0D;
    }

    public C20690y0 getFMessageIO() {
        return this.A04;
    }

    public AnonymousClass012 getLifecycleOwner() {
        return this;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.A03.A24(i, i2, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A03.A27(configuration);
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass16J r1 = this.A05;
        C71873hT r0 = this.A06;
        if (r0 == null) {
            r0 = this.A01.A00(this, this);
            this.A06 = r0;
        }
        r1.unregisterObserver(r0);
        this.A03.A1u();
        this.A00.clear();
    }

    public void onPause() {
        super.onPause();
        this.A03.A1w();
    }

    public void onProvideAssistContent(AssistContent assistContent) {
        super.onProvideAssistContent(assistContent);
        this.A03.A26(assistContent);
    }

    public void onRestart() {
        super.onRestart();
        this.A03.A1x();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.A03.A2A(bundle);
    }

    public void onStop() {
        super.onStop();
        this.A03.A20();
    }

    public void BiW(Bundle bundle) {
        super.onCreate(bundle);
    }
}
