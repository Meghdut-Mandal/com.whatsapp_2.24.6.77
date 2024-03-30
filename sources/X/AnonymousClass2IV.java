package X;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.widget.EditText;
import android.widget.PopupWindow;
import com.whatsapp.conversation.congratulations.CongratulationsImpl;
import com.whatsapp.conversation.conversationrow.MessageSelectionViewModel;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.reactions.ReactionsTrayViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* renamed from: X.2IV  reason: invalid class name */
public abstract class AnonymousClass2IV extends AnonymousClass27x implements C89004Uw, C88994Uv {
    public C70523fI A00;
    public List A01 = AnonymousClass001.A0I();

    public /* synthetic */ void B1j(AnonymousClass3T1 r1) {
    }

    public Object BAB(Class cls) {
        C70803fk r1 = ((C43472Ht) this).A04;
        if (cls == AnonymousClass4Q4.class) {
            return r1.A72;
        }
        if (cls == CongratulationsImpl.class) {
            return null;
        }
        return r1.A2l.BvG(cls);
    }

    public /* synthetic */ void Bdt() {
    }

    public abstract AnonymousClass155 getActivityNullable();

    public abstract /* synthetic */ C52932qP getPreferredLabel();

    public abstract /* synthetic */ ArrayList getSearchTerms();

    public abstract /* synthetic */ String getSearchText();

    public abstract /* synthetic */ EditText getTextEntryField();

    public abstract /* synthetic */ void setQuotedMessage(AnonymousClass3T1 r1);

    public C87444Ov B4o() {
        return new C68613cB(this.A00);
    }

    public void B5e() {
        C38861qL r0 = this.A00.A0O;
        if (r0 != null) {
            r0.dismiss();
        }
    }

    public void B7Q() {
        this.A00.B7Q();
    }

    public void B7f(AnonymousClass3T1 r2) {
        this.A00.B7f(r2);
    }

    public int BF0(AnonymousClass3T1 r2) {
        return this.A00.BF0(r2);
    }

    public boolean BK6() {
        return this.A00.BK6();
    }

    public boolean BMT(AnonymousClass3T1 r2) {
        return this.A00.BMT(r2);
    }

    public boolean BMu() {
        ReactionsTrayViewModel reactionsTrayViewModel = this.A00.A0u;
        if (reactionsTrayViewModel == null || C36341k9.A07(reactionsTrayViewModel.A0B) != 2) {
            return false;
        }
        return true;
    }

    public void Be8(int i) {
        this.A00.A0B(i);
    }

    public void BiZ() {
        C62503Gk r0 = this.A01;
        r0.A04.removeCallbacks(r0.A05);
    }

    public void BpV(AnonymousClass3T1 r2) {
        this.A00.BpV(r2);
    }

    public void BrT(AnonymousClass3T1 r2, int i) {
        this.A00.BrT(r2, i);
    }

    public void BsB(List list, boolean z) {
        this.A00.BsB(list, z);
    }

    public void Bu3(View view, AnonymousClass3T1 r3, int i, boolean z) {
        this.A00.Bu3(view, r3, i, z);
    }

    public void Bur(AnonymousClass3T1 r2) {
        this.A00.Bur(r2);
    }

    public boolean Bvv(AnonymousClass3T1 r2) {
        return this.A00.Bvv(r2);
    }

    public void Bwy(AnonymousClass3T1 r2) {
        this.A00.Bwy(r2);
    }

    public C32661dz getAddContactLogUtil() {
        return this.A00.A0z;
    }

    public C87284Oe getAsyncLabelUpdater() {
        C19460v5 r1 = this.A00.A03;
        if (!r1.A05()) {
            return null;
        }
        r1.A02();
        throw AnonymousClass001.A0A("getAsyncLabelUpdater");
    }

    public AnonymousClass1KK getBusinessProfileManager() {
        return this.A00.A08;
    }

    public AnonymousClass1LV getCommunityChatManager() {
        return this.A00.A09;
    }

    public C229216m getContactAccessHelper() {
        return this.A00.A0B;
    }

    public AnonymousClass16D getContactManager() {
        return this.A00.A0C;
    }

    public C27731Pn getContactPhotos() {
        return this.A00.A0H;
    }

    public C64853Pr getConversationContextGif() {
        return this.A00.A0K;
    }

    public AnonymousClass3HC getConversationRowCustomizers() {
        return this.A00.A0P;
    }

    public AnonymousClass3QY getConversationRowInflater() {
        return this.A00.A0L;
    }

    public C20310xM getCoreMessageStore() {
        return this.A00.A0W;
    }

    public AnonymousClass1DW getDeepLinkHelper() {
        return this.A00.A0b;
    }

    public EmojiSearchProvider getEmojiSearchProvider() {
        return this.A00.A0c;
    }

    public AnonymousClass1A1 getFMessageDatabase() {
        return this.A00.A0x;
    }

    public Collection getForwardMessages() {
        return this.A00.A05();
    }

    public C20350xQ getGroupChatManager() {
        return this.A00.A0f;
    }

    public AnonymousClass1EM getGroupChatUtils() {
        return this.A00.A10;
    }

    public AnonymousClass17X getGroupParticipantsManager() {
        return this.A00.A0X;
    }

    public AnonymousClass3QW getKeepInChatManager() {
        return this.A00.A0Y;
    }

    public C32681e1 getLinkifier() {
        return this.A00.A11;
    }

    public AnonymousClass1DU getLinkifyWeb() {
        return this.A00.A0j;
    }

    public AnonymousClass1ST getMediaDownloadManager() {
        return this.A00.A0l;
    }

    public C28371Sj getMentions() {
        return this.A00.A0m;
    }

    public AnonymousClass3HF getMessageAudioPlayerFactory() {
        return this.A00.A0Q;
    }

    public AnonymousClass1V6 getMessageAudioPlayerProvider() {
        return this.A00.A0R;
    }

    public AnonymousClass16J getMessageObservers() {
        return this.A00.A0Z;
    }

    public AnonymousClass3O0 getMessageRevokeWamEventLogger() {
        return this.A00.A0o;
    }

    public PopupWindow.OnDismissListener getOnPopupWindowDismissListener() {
        return this.A00.A16;
    }

    public AnonymousClass1EV getPaymentsGatingManager() {
        return this.A00.A0p;
    }

    public AnonymousClass1EU getPaymentsManager() {
        return this.A00.A0q;
    }

    public ReactionsTrayViewModel getReactionsTrayViewModel() {
        return this.A00.A0u;
    }

    public HashSet getSeenMessages() {
        return this.A00.A17;
    }

    public C62473Gh getSelectedMessages() {
        return this.A00.A04();
    }

    public AnonymousClass0V9 getSelectionActionMode() {
        return this.A00.A00;
    }

    public AnonymousClass1Y4 getSendMediaMessageManager() {
        return this.A00.A0k;
    }

    public C19460v5 getSmbMenus() {
        return this.A00.A04;
    }

    public AnonymousClass1NO getStarredMessageStore() {
        return this.A00.A0a;
    }

    public AnonymousClass1HA getStickerImageFileLoader() {
        return this.A00.A0w;
    }

    public AnonymousClass1CF getSupportGatingUtils() {
        return this.A00.A0i;
    }

    public AnonymousClass1EL getSuspensionManager() {
        return this.A00.A0g;
    }

    public AnonymousClass196 getSyncManager() {
        return this.A00.A0A;
    }

    public AnonymousClass1X4 getUserActions() {
        return this.A00.A07;
    }

    public AnonymousClass171 getWAContactNames() {
        return this.A00.A0F;
    }

    public C19630wG getWaContext() {
        return this.A00.A0T;
    }

    public C20830yE getWaPermissionsHelper() {
        return this.A00.A0U;
    }

    public C21010yW getWamRuntime() {
        return this.A00.A0d;
    }

    public AnonymousClass17V getWamThreadIdManager() {
        return this.A00.A0e;
    }

    public void setSelectedMessages(C62473Gh r2) {
        MessageSelectionViewModel messageSelectionViewModel = this.A00.A0N;
        if (messageSelectionViewModel != null) {
            messageSelectionViewModel.A00.A0D(r2);
        }
    }

    public void setSelectionActionMode(AnonymousClass0V9 r2) {
        this.A00.A00 = r2;
    }

    public AnonymousClass2IV(Context context) {
        super(context);
        this.A00.A0M = this;
    }

    public C20810yC getABProps() {
        AnonymousClass155 waBaseActivity = getWaBaseActivity();
        Objects.requireNonNull(waBaseActivity);
        return waBaseActivity.getAbProps();
    }

    public /* synthetic */ int getContainerType() {
        return 0;
    }

    public C70523fI getConversationRowsDelegate() {
        return this.A00;
    }

    public /* synthetic */ C001600r getHasOutgoingMessagesLiveData() {
        return null;
    }

    public /* synthetic */ C001600r getLastMessageLiveData() {
        return null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A00.A0D(configuration);
    }

    public void setConversationRowsDelegate(C70523fI r1) {
        this.A00 = r1;
    }
}
