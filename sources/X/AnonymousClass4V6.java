package X;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.reactions.ReactionsTrayViewModel;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.4V6  reason: invalid class name */
public interface AnonymousClass4V6 extends C89004Uw, AnonymousClass4V7, AnonymousClass4UO, B3D, C87694Pu, C87434Ou, C31751cK, C88364Sk, AnonymousClass4T1, AnonymousClass4T2, AnonymousClass15A, AnonymousClass15C, AnonymousClass4QW, C87784Qd, AnonymousClass15D, AnonymousClass4PK, AnonymousClass15E {
    C87444Ov B4o();

    void B5S(C64933Qa r1);

    boolean BL8();

    boolean BMu();

    void BPG(short s);

    void BPK(String str);

    void BS7();

    void BV5();

    void Beg();

    void BiV();

    void BiW(Bundle bundle);

    Dialog BiX(int i);

    boolean BiY(Menu menu);

    boolean Bia(int i, KeyEvent keyEvent);

    boolean Bib(int i, KeyEvent keyEvent);

    boolean Bic(Menu menu);

    void Bie();

    void Bif();

    Intent BnJ(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, boolean z);

    void Bnv();

    AnonymousClass155 BoP();

    void Btm(DialogFragment dialogFragment);

    void Bu1(int i);

    void BuO(Intent intent, int i);

    AnonymousClass0V9 But(C021809f r1);

    boolean BvF(MotionEvent motionEvent);

    Object BvG(Class cls);

    void Bvu(List list);

    View findViewById(int i);

    void finish();

    void finishAndRemoveTask();

    C20810yC getAbProps();

    AnonymousClass155 getActivityNullable();

    C24801Dv getActivityUtils();

    C32661dz getAddContactLogUtil();

    AnonymousClass1KK getBusinessProfileManager();

    AnonymousClass1LV getCommunityChatManager();

    C229216m getContactAccessHelper();

    AnonymousClass16D getContactManager();

    C27731Pn getContactPhotos();

    View getContentView();

    AnonymousClass3HC getConversationRowCustomizers();

    AnonymousClass3QY getConversationRowInflater();

    C20310xM getCoreMessageStore();

    C19700wN getCrashLogs();

    AnonymousClass1H2 getEmojiLoader();

    EmojiSearchProvider getEmojiSearchProvider();

    AnonymousClass1A1 getFMessageDatabase();

    C20690y0 getFMessageIO();

    C605338f getFirstDrawMonitor();

    Collection getForwardMessages();

    AnonymousClass17Y getGlobalUI();

    C20350xQ getGroupChatManager();

    AnonymousClass1EM getGroupChatUtils();

    AnonymousClass17X getGroupParticipantsManager();

    AnonymousClass1N2 getImeUtils();

    Intent getIntent();

    AnonymousClass174 getInteractionPerfTracker();

    LayoutInflater getLayoutInflater();

    AnonymousClass01M getLifecycle();

    AnonymousClass012 getLifecycleOwner();

    C32681e1 getLinkifier();

    AnonymousClass1DU getLinkifyWeb();

    ListView getListView();

    C19730wQ getMeManager();

    AnonymousClass3HF getMessageAudioPlayerFactory();

    AnonymousClass1V6 getMessageAudioPlayerProvider();

    PopupWindow.OnDismissListener getOnPopupWindowDismissListener();

    C21430zE getQuickPerformanceLogger();

    ReactionsTrayViewModel getReactionsTrayViewModel();

    AnonymousClass12U getRegistrationStateManager();

    Resources getResources();

    AnonymousClass017 getSavedStateRegistryOwner();

    AnonymousClass1G4 getScreenLockStateProvider();

    HashSet getSeenMessages();

    C62473Gh getSelectedMessages();

    AnonymousClass0V9 getSelectionActionMode();

    C21100yf getServerProps();

    AnonymousClass11e getStartupTracker();

    C20060wx getStorageUtils();

    String getString(int i);

    String getString(int i, Object... objArr);

    AnonymousClass07B getSupportActionBar();

    AnonymousClass01z getSupportFragmentManager();

    AnonymousClass1CF getSupportGatingUtils();

    AnonymousClass1EL getSuspensionManager();

    C21060yb getSystemServices();

    C19970wo getTime();

    AnonymousClass1X4 getUserActions();

    AnonymousClass016 getViewModelStoreOwner();

    AnonymousClass171 getWAContactNames();

    C19630wG getWAContext();

    C20830yE getWaPermissionsHelper();

    C19420v0 getWaSharedPreferences();

    C19770wU getWaWorkers();

    C21010yW getWamRuntime();

    Window getWindow();

    WindowManager getWindowManager();

    boolean hasWindowFocus();

    void invalidateOptionsMenu();

    boolean isFinishing();

    boolean isInMultiWindowMode();

    boolean isTaskRoot();

    void overridePendingTransition(int i, int i2);

    void setContentView(int i);

    void setSelectionActionMode(AnonymousClass0V9 r1);

    void setSupportActionBar(Toolbar toolbar);

    void startActivity(Intent intent);

    void startActivityForResult(Intent intent, int i);

    void unregisterReceiver(BroadcastReceiver broadcastReceiver);
}
