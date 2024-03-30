package X;

import android.app.assist.AssistContent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.conversation.ConversationListView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.picker.search.PickerSearchDialogFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2Ht  reason: invalid class name and case insensitive filesystem */
public class C43472Ht extends AnonymousClass2IV implements AnonymousClass4V6, C87004Nc {
    public AnonymousClass016 A00;
    public AnonymousClass017 A01;
    public C593033k A02;
    public AnonymousClass3C1 A03;
    public C70803fk A04;
    public AnonymousClass2JR A05;
    public C20810yC A06;
    public AnonymousClass1JL A07;
    public boolean A08;
    public final List A09 = AnonymousClass001.A0I();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43472Ht(Context context) {
        super(context);
        A02();
        View.inflate(getContext(), getCurrentLayout(), this);
        C70803fk r1 = this.A04;
        r1.A2l = this;
        this.A05 = this.A03.A00(r1);
        C593033k r5 = this.A02;
        Intent intent = A01(this).getIntent();
        AnonymousClass00C.A0D(intent, 1);
        long longExtra = intent.getLongExtra("perf_start_time_ns", -1);
        String stringExtra = intent.getStringExtra("perf_origin");
        if (r5.A01.A00(this, new C89964Yo(this, 0), stringExtra == null ? "Conversation" : stringExtra, longExtra)) {
            intent.putExtra("key_perf_tracked", true);
        }
    }

    public /* synthetic */ void B1Z(int i) {
    }

    public Intent BnJ(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, boolean z) {
        return C26981Mg.A01(broadcastReceiver, A01(this), intentFilter, true);
    }

    public void overridePendingTransition(int i, int i2) {
        A01(this).overridePendingTransition(0, i2);
    }

    private int getCurrentLayout() {
        if (this.A06.A0E(3792)) {
            return R.layout.f9nameremoved;
        }
        return R.layout.f9nameremoved;
    }

    public void A03(AssistContent assistContent) {
        this.A04.A26(assistContent);
    }

    public void B0m() {
        this.A04.A1l();
    }

    public void B0n(AnonymousClass141 r3, AnonymousClass11F r4) {
        C70803fk.A1F(this.A04, r3, r4, false);
    }

    public void B0z(Drawable drawable, View view) {
        this.A04.A28(drawable, view);
    }

    public void B1Y() {
        this.A04.A2U.A0O = true;
    }

    public void B5Q() {
        ConversationListView conversationListView = this.A04.A2U;
        if (conversationListView.A0K) {
            conversationListView.A0K = false;
            conversationListView.setTranscriptMode(0);
        }
    }

    public void B5S(C64933Qa r2) {
        this.A00.A0K.A03(r2);
    }

    public AnonymousClass22t BBT(Integer num) {
        AnonymousClass2M8 r0 = this.A04.A3r;
        if (r0 == null) {
            return null;
        }
        r0.A0E = num;
        return r0;
    }

    public boolean BJx() {
        return AnonymousClass000.A1R(C70803fk.A0D(this.A04).getCount());
    }

    public boolean BJy() {
        return this.A04.A6F;
    }

    public boolean BK7() {
        return this.A04.A2a();
    }

    public void BKA() {
        this.A04.A1n();
    }

    public void BKc(AnonymousClass3T1 r9, C64933Qa r10, AnonymousClass3DS r11, String str, String str2, Bitmap[] bitmapArr, int i) {
        this.A04.A2M(r9, r10, r11, str, str2, bitmapArr, i);
    }

    public boolean BMF() {
        ConversationListView conversationListView = this.A04.A2U;
        if (conversationListView != null) {
            return conversationListView.A0B(0);
        }
        return false;
    }

    public boolean BMS() {
        return AnonymousClass000.A1V(this.A04.A2x.A0F);
    }

    public boolean BMX() {
        return this.A04.A6N;
    }

    public boolean BMm() {
        AnonymousClass6YP r0 = this.A04.A5Z;
        if (r0 == null || !r0.A0U()) {
            return false;
        }
        return true;
    }

    public boolean BMv() {
        return this.A04.A2t.A0U();
    }

    public boolean BMz() {
        AnonymousClass6YP r0 = this.A04.A5Z;
        if (r0 == null || !r0.A0V()) {
            return false;
        }
        return true;
    }

    public boolean BNE() {
        AccessibilityManager A0M;
        C70803fk r2 = this.A04;
        if (r2.A6R || (A0M = r2.A2l.getSystemServices().A0M()) == null || !A0M.isTouchExplorationEnabled()) {
            return true;
        }
        return false;
    }

    public boolean BNM() {
        return this.A04.A3Y.A0i;
    }

    public boolean BNW(AnonymousClass3T1 r2) {
        return this.A04.A2g(r2);
    }

    public void BNq(C107265Nh r2, int i) {
        this.A04.A2T(r2);
    }

    public /* bridge */ /* synthetic */ void BNx(Object obj) {
        this.A05.B73((AnonymousClass4Q1) null, Collections.singleton(obj), 1);
    }

    public void BPG(short s) {
        this.A02.A01.A01.A0C(3);
    }

    public void BPK(String str) {
        this.A02.A01.A01.A08(str);
    }

    public void BPZ() {
        this.A04.A1q();
    }

    public void BPa() {
        this.A04.A2Z.A00.A00(AnonymousClass2HH.class);
    }

    public boolean BPt() {
        Number A0z = C36441kJ.A0z(this.A04.A2e.A01);
        if (A0z == null || A0z.intValue() != 1) {
            return false;
        }
        return true;
    }

    public void BQs(long j, boolean z) {
        C70803fk.A1C(this.A04, j, false, z);
    }

    public void BRT() {
        C70803fk r2 = this.A04;
        r2.A2G(r2.A3Y, false, false);
    }

    public void BS7() {
        this.A02.A01.A01.A07("data_load");
    }

    public void BUk(C600336f r2, AnonymousClass3T1 r3, int i, long j) {
        this.A04.A2D(r2, r3, i);
    }

    public void BUl(boolean z) {
        this.A04.A2X(z);
    }

    public void BUu(long j, boolean z) {
        C70803fk.A1C(this.A04, j, true, z);
    }

    public void BV5() {
        this.A02.A01.A01.A06("data_load");
    }

    public void BVD() {
        this.A04.A1t();
    }

    public void BWO(AnonymousClass1XQ r3) {
        this.A04.A71.BWN(r3.A00);
    }

    public void BXb(UserJid userJid, int i) {
        C39471sS r2 = this.A04.A2z;
        C39471sS.A01(r2.A01, r2, C52492pW.LOADING_FAILED);
    }

    public void BXc(UserJid userJid, boolean z, boolean z2) {
        this.A04.A2I(userJid);
    }

    public void BYa() {
        C70803fk r3 = this.A04;
        C70803fk.A0K(r3).Boy(new C81103wT(r3, 8));
    }

    public void BYd(AnonymousClass3XU r2) {
        this.A04.A2H(r2);
    }

    public void Bch(PickerSearchDialogFragment pickerSearchDialogFragment) {
        C70803fk r1 = this.A04;
        r1.A4c.A02(pickerSearchDialogFragment);
        if (r1.A2a()) {
            AnonymousClass6YP r0 = r1.A5Z;
            C18740tg.A06(r0);
            r0.A0K();
        }
    }

    public void BeM() {
        this.A04.A2Q.A0B();
    }

    public void Beg() {
        this.A02.A01.A01.A0C(230);
    }

    public void Bel(AnonymousClass3T1 r2, boolean z) {
        this.A04.A2R(r2, z);
    }

    public boolean BgA() {
        C70803fk r3 = this.A04;
        return r3.A2e.A0T(C36371kC.A00(C20800yB.A01(C21000yV.A01, ((AnonymousClass13K) r3.A5I).A02, 2889) ? 1 : 0));
    }

    public void BiW(Bundle bundle) {
        C70523fI r0 = this.A00;
        if (r0 != null) {
            r0.A0M = this;
            List list = this.A01;
            if (list == null || 0 >= list.size()) {
                AnonymousClass22h.A00(this);
                this.A00.A06();
                return;
            }
            list.get(0);
            throw AnonymousClass001.A0A("onCreate");
        }
    }

    public void Bix() {
        this.A04.A2Q.A0A();
    }

    public void BkD() {
        C70803fk r3 = this.A04;
        r3.A2G(r3.A3Y, true, false);
    }

    public void Bl8(AnonymousClass4Q5 r2, C207219uk r3) {
        this.A04.A2C(r2, r3);
    }

    public void BmB(AnonymousClass141 r2, boolean z, boolean z2) {
        this.A04.A2G(r2, z, z2);
    }

    public void Bn8() {
        C70803fk.A11(this.A04);
    }

    public void BoF() {
        C40061uh r0 = this.A04.A2x;
        C40061uh.A09(r0);
        C40061uh.A07(r0);
    }

    public void BoW() {
        C70803fk r2 = this.A04;
        r2.A2x.A0a((AnonymousClass3T1) null);
        C70803fk.A0f(r2);
    }

    public void Bob(C46812bi r7, long j) {
        C70803fk r5 = this.A04;
        if (r5.A07 == r7.A1N) {
            r5.A2U.removeCallbacks(r5.A62);
            r5.A2U.postDelayed(r5.A62, j);
        }
    }

    public void BpS(AnonymousClass3T1 r2) {
        this.A04.A2K(r2);
    }

    public void BpT(ViewGroup viewGroup, AnonymousClass3T1 r3) {
        this.A04.A2B(viewGroup, r3);
    }

    public void Bpj(AnonymousClass3T1 r2, AnonymousClass3EY r3) {
        this.A04.A2N(r2, r3);
    }

    public void Bpt(AnonymousClass11F r2, String str, String str2, String str3, String str4, long j) {
        this.A04.A25(j, str, str3);
    }

    public void Bpu(AnonymousClass3T1 r2, String str, String str2, String str3) {
        this.A04.A2Q(r2, str2, str3);
    }

    public void Bpv(AnonymousClass3T1 r2, AnonymousClass3P8 r3) {
        this.A04.A2P(r2, r3);
    }

    public void Bpw(AnonymousClass3T1 r2, C206729ts r3) {
        this.A04.A2O(r2, r3);
    }

    public void Bth(AnonymousClass3T1 r2) {
        this.A04.A2x.A0Z(r2);
    }

    public void Btk(DialogFragment dialogFragment) {
        this.A04.A2l.Btm(dialogFragment);
    }

    public void Btn(DialogFragment dialogFragment, String str) {
        A01(this).Btn(dialogFragment, "BrazilPaymentIncomeCollectionBottomSheet");
    }

    public void Bu7(AnonymousClass3KV r2) {
        this.A04.A2E(r2);
    }

    public void BuQ(AnonymousClass141 r2) {
        this.A04.A2F(r2);
    }

    public void Buh(AnonymousClass3KV r4, int i) {
        C70803fk r0 = this.A04;
        r0.A25.Bug(C70803fk.A0C(r0), r4, 9);
    }

    public void Bv3(AnonymousClass11F r3) {
        C70803fk r1 = this.A04;
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
        this.A04.A2U(r2);
    }

    public void Bx8(C46812bi r2, long j, boolean z) {
        this.A04.A2S(r2, j, z);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.A04.A2e(motionEvent);
    }

    public C196089Xp getCatalogLoadSession() {
        return (C196089Xp) this.A04.A1k().get();
    }

    public AnonymousClass11F getChatJid() {
        return this.A04.A45;
    }

    public AnonymousClass141 getContact() {
        return this.A04.A3Y;
    }

    public AnonymousClass1RY getContactPhotosLoader() {
        AnonymousClass4V6 r0 = this.A04.A2l;
        return r0.getConversationRowInflater().A02(r0.getActivityNullable());
    }

    public C62313Fr getConversationBanners() {
        return this.A04.A2Z;
    }

    public C89014Ux getConversationRowCustomizer() {
        return (C89014Ux) this.A04.A79.get();
    }

    public C605338f getFirstDrawMonitor() {
        return this.A02.A01.A00;
    }

    public C88974Ut getInlineVideoPlaybackHandler() {
        return this.A04.A5U;
    }

    public AnonymousClass174 getInteractionPerfTracker() {
        return this.A02.A01;
    }

    public AnonymousClass11F getJid() {
        return this.A04.A45;
    }

    public AnonymousClass01M getLifecycle() {
        AnonymousClass02E r0 = this.A00;
        C18740tg.A06(r0);
        return r0.A0P;
    }

    public AnonymousClass012 getLifecycleOwner() {
        AnonymousClass02E r0 = this.A00;
        C18740tg.A06(r0);
        return r0;
    }

    public C21430zE getQuickPerformanceLogger() {
        return this.A02.A01.A01.A06;
    }

    public AnonymousClass3T1 getQuotedMessage() {
        return this.A04.A2x.A0F;
    }

    public AnonymousClass017 getSavedStateRegistryOwner() {
        AnonymousClass017 r0 = this.A01;
        if (r0 == null) {
            return A01(this);
        }
        return r0;
    }

    public ArrayList getSearchTerms() {
        return this.A04.A2x.A0I;
    }

    public String getSearchText() {
        return this.A04.A2x.A0G;
    }

    public Long getSimilarChannelsSessionId() {
        return this.A04.A61;
    }

    public EditText getTextEntryField() {
        return this.A04.A4B;
    }

    public Toolbar getToolbar() {
        return this.A04.A0j;
    }

    public AnonymousClass016 getViewModelStoreOwner() {
        AnonymousClass016 r0 = this.A00;
        if (r0 == null) {
            return A01(this);
        }
        return r0;
    }

    public C19630wG getWAContext() {
        return this.A00.A0T;
    }

    public boolean isFinishing() {
        AnonymousClass02E r0 = this.A00;
        C18740tg.A06(r0);
        return r0.A0i;
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.A04.A2c(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.A04.A2d(i, keyEvent);
    }

    public void onWindowFocusChanged(boolean z) {
        this.A04.A2Y(z);
    }

    public void setCustomActionBarEnabled(boolean z) {
        this.A04.A6B = z;
    }

    public void setFollowPlayingVoiceMemo(boolean z) {
        this.A04.A6E = z;
    }

    public void setInputLayoutBackground(int i) {
        this.A04.A23(i);
    }

    public void setOneConversationRowPressed(boolean z) {
        this.A04.A6N = z;
    }

    public void setQuotedMessage(AnonymousClass3T1 r2) {
        this.A04.A2x.A0a(r2);
    }

    public static AnonymousClass155 A01(AnonymousClass22h r0) {
        AnonymousClass155 waBaseActivity = r0.getWaBaseActivity();
        C18740tg.A06(waBaseActivity);
        return waBaseActivity;
    }

    public boolean B2l(C46812bi r4, boolean z) {
        if (getWaBaseActivity() != null) {
            C70803fk r2 = this.A04;
            AnonymousClass3T1 A0J = C70803fk.A0J(C70803fk.A0D(r2), r4);
            if (A0J == null || !C54912tl.A00(C70803fk.A0H(r2), A0J, r4, z)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean B3a(C46812bi r2, int i, boolean z, boolean z2) {
        if (getWaBaseActivity() == null) {
            return false;
        }
        return this.A04.A2h(r2, i, z, z2);
    }

    public void BJO() {
        A01(this).runOnUiThread(new C1497572q(this, 48));
    }

    public boolean BL8() {
        return AnonymousClass000.A1V(getWaBaseActivity());
    }

    public boolean BLh() {
        return A01(this).BLh();
    }

    public void BO5(int i) {
        A01(this).BO5(i);
    }

    public void BO6(String str) {
        A01(this).BO6(str);
    }

    public void BO7(String str, String str2) {
        A01(this).BO7(str, str2);
    }

    public void BO8(C22908AyK ayK, Object[] objArr, int i, int i2, int i3) {
        A01(this).BO8(ayK, objArr, i, i2, R.string.f12nameremoved);
    }

    public void BO9(Object[] objArr, int i, int i2) {
        A01(this).BO9(objArr, i, i2);
    }

    public void BYZ() {
    }

    public void Be8(int i) {
        super.Be8(i);
        this.A04.A22(i);
    }

    public void Bnv() {
        A01(this).Bnv();
    }

    public AnonymousClass155 BoP() {
        return A01(this);
    }

    public boolean BtT() {
        return true;
    }

    public void Btl(DialogFragment dialogFragment, String str) {
        A01(this).Btl(dialogFragment, str);
    }

    public void Btm(DialogFragment dialogFragment) {
        A01(this).Btm(dialogFragment);
    }

    public boolean Btp() {
        return true;
    }

    public void Bu1(int i) {
        A01(this).Bu1(i);
    }

    public void Bu2(int i, int i2) {
        A01(this).Bu2(i, i2);
    }

    public void BuO(Intent intent, int i) {
        A01(this).BuO(intent, i);
    }

    public AnonymousClass0V9 But(C021809f r2) {
        return A01(this).But(r2);
    }

    public boolean BvF(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public void Bvu(List list) {
        A01(this).Bvu(list);
    }

    public void Bwu(String str) {
        A01(this).Bwu(str);
    }

    public void finish() {
        A01(this).finish();
    }

    public void finishAndRemoveTask() {
        A01(this).finishAndRemoveTask();
    }

    public C20810yC getAbProps() {
        return A01(this).getAbProps();
    }

    public AnonymousClass155 getActivityNullable() {
        return getWaBaseActivity();
    }

    public C24801Dv getActivityUtils() {
        return A01(this).A01;
    }

    public View getContentView() {
        return A01(this).A00;
    }

    public C19700wN getCrashLogs() {
        return A01(this).A03;
    }

    public AnonymousClass1H2 getEmojiLoader() {
        return A01(this).A0C;
    }

    public C20690y0 getFMessageIO() {
        return A01(this).A04;
    }

    public AnonymousClass17Y getGlobalUI() {
        return A01(this).A05;
    }

    public AnonymousClass1N2 getImeUtils() {
        return A01(this).A0C;
    }

    public Intent getIntent() {
        return A01(this).getIntent();
    }

    public LayoutInflater getLayoutInflater() {
        return A01(this).getLayoutInflater();
    }

    public String getLocalClassName() {
        return A01(this).getLocalClassName();
    }

    public int getMarkerId() {
        return 703926750;
    }

    public C19730wQ getMeManager() {
        return A01(this).A02;
    }

    public C52932qP getPreferredLabel() {
        return null;
    }

    public AnonymousClass12U getRegistrationStateManager() {
        return A01(this).A0A;
    }

    public AnonymousClass1G4 getScreenLockStateProvider() {
        return A01(this).A0B;
    }

    public C21100yf getServerProps() {
        return A01(this).A06;
    }

    public AnonymousClass11e getStartupTracker() {
        if (getWaBaseActivity() == null) {
            return null;
        }
        return getWaBaseActivity().A02;
    }

    public C20060wx getStorageUtils() {
        return A01(this).A08;
    }

    public String getString(int i) {
        return A01(this).getString(i);
    }

    public AnonymousClass07B getSupportActionBar() {
        return A01(this).getSupportActionBar();
    }

    public AnonymousClass01z getSupportFragmentManager() {
        return A01(this).getSupportFragmentManager();
    }

    public C21060yb getSystemServices() {
        return A01(this).A08;
    }

    public C19970wo getTime() {
        return A01(this).A07;
    }

    public C19420v0 getWaSharedPreferences() {
        return A01(this).A09;
    }

    public C19770wU getWaWorkers() {
        return A01(this).A04;
    }

    public C18820ts getWhatsAppLocale() {
        return A01(this).A00;
    }

    public Window getWindow() {
        return A01(this).getWindow();
    }

    public WindowManager getWindowManager() {
        return A01(this).getWindowManager();
    }

    public void invalidateOptionsMenu() {
        A01(this).invalidateOptionsMenu();
    }

    public boolean isInMultiWindowMode() {
        return A01(this).isInMultiWindowMode();
    }

    public boolean isTaskRoot() {
        return A01(this).isTaskRoot();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A04.A27(configuration);
    }

    public void setContentView(int i) {
        if (i != getCurrentLayout() && this.A07.A09()) {
            A01(this).setContentView(i);
        }
    }

    public void setSupportActionBar(Toolbar toolbar) {
        A01(this).setSupportActionBar(toolbar);
    }

    public void startActivity(Intent intent) {
        A01(this).startActivity(intent);
    }

    public void startActivityForResult(Intent intent, int i) {
        A01(this).startActivityForResult(intent, i);
    }

    public void unregisterReceiver(BroadcastReceiver broadcastReceiver) {
        A01(this).unregisterReceiver(broadcastReceiver);
    }

    public void setActivityPerfAsserts(boolean z) {
        A01(this);
    }

    public void setConversationDelegate(C70803fk r1) {
        this.A04 = r1;
    }

    public void setSavedStateRegistryOwner(AnonymousClass017 r1) {
        this.A01 = r1;
    }

    public void setSelectedMessages(C62473Gh r1) {
        super.setSelectedMessages(r1);
    }

    public void setSelectionActionMode(AnonymousClass0V9 r1) {
        super.setSelectionActionMode(r1);
    }

    public void setViewModelStoreOwner(AnonymousClass016 r1) {
        this.A00 = r1;
    }

    public String getString(int i, Object... objArr) {
        return A01(this).getString(i, objArr);
    }
}
