package X;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import com.whatsapp.Conversation;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.product.newsletterenforcements.enforcedmessages.EnforcedMessagesActivity;
import com.whatsapp.reactions.ReactionsTrayViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.2IU  reason: invalid class name */
public abstract class AnonymousClass2IU extends AnonymousClass27p implements C89004Uw, C88994Uv, C87704Pv {
    public C70523fI A00;
    public final List A01 = AnonymousClass001.A0I();

    public AnonymousClass155 BoP() {
        return this;
    }

    public AnonymousClass155 getActivityNullable() {
        return this;
    }

    public /* synthetic */ void B0z(Drawable drawable, View view) {
        if (this instanceof Conversation) {
            ((Conversation) this).A03.A28(drawable, view);
        }
    }

    public /* synthetic */ void B1j(AnonymousClass3T1 r4) {
        if (this instanceof Conversation) {
            C70803fk r2 = ((Conversation) this).A03;
            C70803fk.A17(r2, 1);
            C70803fk.A0n(r2);
            r2.A4l.A08();
            r2.A4l.A09(false);
            r2.A4l.A06 = r4;
        }
    }

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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.2JG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object BAB(java.lang.Class r3) {
        /*
            r2 = this;
            boolean r0 = r2 instanceof X.AnonymousClass2JG
            if (r0 == 0) goto L_0x000e
            r1 = r2
            X.2JG r1 = (X.AnonymousClass2JG) r1
            java.lang.Class<X.4Q4> r0 = X.AnonymousClass4Q4.class
            if (r3 != r0) goto L_0x001c
            X.4Q4 r0 = r1.A0K
            return r0
        L_0x000e:
            boolean r0 = r2 instanceof com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity
            if (r0 == 0) goto L_0x0023
            r1 = r2
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r1 = (com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity) r1
            java.lang.Class<X.4Q4> r0 = X.AnonymousClass4Q4.class
            if (r3 != r0) goto L_0x001c
            X.4Q4 r0 = r1.A0X
            return r0
        L_0x001c:
            X.3fI r0 = r1.A00
            java.lang.Object r0 = r0.BAB(r3)
            return r0
        L_0x0023:
            r0 = r2
            com.whatsapp.Conversation r0 = (com.whatsapp.Conversation) r0
            X.3fk r1 = r0.A03
            java.lang.Class<X.4Q4> r0 = X.AnonymousClass4Q4.class
            if (r3 != r0) goto L_0x002f
            X.4Q4 r0 = r1.A72
            return r0
        L_0x002f:
            java.lang.Class<com.whatsapp.conversation.congratulations.CongratulationsImpl> r0 = com.whatsapp.conversation.congratulations.CongratulationsImpl.class
            if (r3 != r0) goto L_0x0035
            r0 = 0
            return r0
        L_0x0035:
            X.4V6 r0 = r1.A2l
            java.lang.Object r0 = r0.BvG(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2IU.BAB(java.lang.Class):java.lang.Object");
    }

    public AnonymousClass22t BBT(Integer num) {
        AnonymousClass2M8 r0;
        Integer num2 = num;
        if (this instanceof MediaAlbumActivity) {
            MediaAlbumActivity mediaAlbumActivity = (MediaAlbumActivity) this;
            AnonymousClass22t r3 = mediaAlbumActivity.A0G;
            if (r3 != null) {
                return r3;
            }
            C20810yC r12 = mediaAlbumActivity.A0D;
            AnonymousClass1N2 r11 = mediaAlbumActivity.A0C;
            C19700wN r10 = mediaAlbumActivity.A03;
            AnonymousClass1H2 r9 = mediaAlbumActivity.A0C;
            AnonymousClass1XN r8 = mediaAlbumActivity.A0J;
            C21060yb r7 = mediaAlbumActivity.A08;
            C18820ts r6 = mediaAlbumActivity.A00;
            C1261362r r5 = mediaAlbumActivity.A0H;
            EmojiSearchProvider emojiSearchProvider = mediaAlbumActivity.A00.A0c;
            C19420v0 r32 = mediaAlbumActivity.A09;
            C19890wg r2 = mediaAlbumActivity.A0T;
            Integer A0r = C36391kE.A0r();
            C1261362r r23 = r5;
            AnonymousClass6O1 r24 = mediaAlbumActivity.A0I;
            C19420v0 r21 = r32;
            C18820ts r22 = r6;
            C21060yb r20 = r7;
            KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) mediaAlbumActivity.A00;
            C19700wN r17 = r10;
            AnonymousClass22t r14 = new AnonymousClass22t(mediaAlbumActivity, (ImageButton) null, r17, keyboardPopupLayout, (WaEditText) null, r20, r21, r22, r23, r24, r8, r9, emojiSearchProvider, r12, r2, r11, A0r, num2);
            mediaAlbumActivity.A0G = r14;
            r14.setOnDismissListener(mediaAlbumActivity.A00.A16);
            AnonymousClass3J6 r25 = new AnonymousClass3J6(mediaAlbumActivity, mediaAlbumActivity.A0G, (EmojiSearchContainer) C03570Gk.A0B(mediaAlbumActivity, R.id.emoji_search_container));
            mediaAlbumActivity.A0K = r25;
            AnonymousClass22t r33 = mediaAlbumActivity.A0G;
            r33.A0F = C80233v4.A00(mediaAlbumActivity, 26);
            r33.A0C = r25;
            r33.A0H(new C89604Xe(mediaAlbumActivity, 2));
            AnonymousClass3J6.A00(r25, mediaAlbumActivity, 2);
            return r33;
        } else if (!(this instanceof Conversation) || (r0 = ((Conversation) this).A03.A3r) == null) {
            return null;
        } else {
            r0.A0E = num2;
            return r0;
        }
    }

    public int BF0(AnonymousClass3T1 r2) {
        return this.A00.BF0(r2);
    }

    public boolean BK6() {
        return this.A00.BK6();
    }

    public void BKA() {
        if (this instanceof Conversation) {
            ((Conversation) this).A03.A1n();
        }
    }

    public /* synthetic */ boolean BMS() {
        if (this instanceof Conversation) {
            return AnonymousClass000.A1V(((Conversation) this).A03.A2x.A0F);
        }
        return false;
    }

    public boolean BMT(AnonymousClass3T1 r2) {
        return this.A00.BMT(r2);
    }

    public /* synthetic */ boolean BMm() {
        AnonymousClass6YP r0;
        if (!(this instanceof Conversation) || (r0 = ((Conversation) this).A03.A5Z) == null || !r0.A0U()) {
            return false;
        }
        return true;
    }

    public boolean BMu() {
        ReactionsTrayViewModel reactionsTrayViewModel = this.A00.A0u;
        if (reactionsTrayViewModel == null || C36341k9.A07(reactionsTrayViewModel.A0B) != 2) {
            return false;
        }
        return true;
    }

    public /* synthetic */ boolean BNW(AnonymousClass3T1 r2) {
        if (this instanceof Conversation) {
            return ((Conversation) this).A03.A2g(r2);
        }
        return false;
    }

    public /* synthetic */ boolean BPt() {
        boolean z;
        Number number;
        if (this instanceof MediaAlbumActivity) {
            number = C36441kJ.A0z(((MediaAlbumActivity) this).A0A.A01);
            z = true;
            if (number == null) {
                return false;
            }
        } else if (!(this instanceof Conversation)) {
            return true;
        } else {
            number = C36441kJ.A0z(((Conversation) this).A03.A2e.A01);
            z = true;
            if (number == null) {
                return false;
            }
        }
        if (number.intValue() == z) {
            return z;
        }
        return false;
    }

    public /* synthetic */ void Bdt() {
        if (this instanceof Conversation) {
            C70803fk r3 = ((Conversation) this).A03;
            r3.A5S.Boy(new C81103wT(r3, 10));
        }
    }

    public void Be8(int i) {
        this.A00.A0B(i);
    }

    public /* synthetic */ void Bel(AnonymousClass3T1 r2, boolean z) {
        if (this instanceof Conversation) {
            ((Conversation) this).A03.A2R(r2, z);
        }
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

    public /* synthetic */ boolean BtT() {
        if (this instanceof Conversation) {
            return true;
        }
        return false;
    }

    public void Btg(Bitmap bitmap, C65643Sx r3) {
        this.A00.Btg(bitmap, r3);
    }

    public /* synthetic */ void Bth(AnonymousClass3T1 r2) {
        if (this instanceof Conversation) {
            ((Conversation) this).A03.A2x.A0Z(r2);
        }
    }

    public /* synthetic */ boolean Btp() {
        if (this instanceof Conversation) {
            return true;
        }
        return false;
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

    public /* synthetic */ int getContainerType() {
        if (this instanceof AnonymousClass2JG) {
            AnonymousClass2JG r1 = (AnonymousClass2JG) this;
            if (r1 instanceof EnforcedMessagesActivity) {
                return 7;
            }
            if (r1 instanceof StarredMessagesActivity) {
                return 1;
            }
            return 4;
        } else if (this instanceof MediaAlbumActivity) {
            return 2;
        } else {
            return 0;
        }
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

    public /* synthetic */ C001600r getHasOutgoingMessagesLiveData() {
        if (this instanceof Conversation) {
            return ((Conversation) this).A03.A2x.A0S;
        }
        return null;
    }

    public /* synthetic */ C001600r getLastMessageLiveData() {
        if (this instanceof Conversation) {
            return ((Conversation) this).A03.A2x.A0T;
        }
        return null;
    }

    public C32681e1 getLinkifier() {
        return this.A00.A11;
    }

    public AnonymousClass1DU getLinkifyWeb() {
        return this.A00.A0j;
    }

    public AnonymousClass3HF getMessageAudioPlayerFactory() {
        return this.A00.A0Q;
    }

    public AnonymousClass1V6 getMessageAudioPlayerProvider() {
        return this.A00.A0R;
    }

    public PopupWindow.OnDismissListener getOnPopupWindowDismissListener() {
        return this.A00.A16;
    }

    public ReactionsTrayViewModel getReactionsTrayViewModel() {
        return this.A00.A0u;
    }

    public /* synthetic */ ArrayList getSearchTerms() {
        if (this instanceof AnonymousClass2JG) {
            return ((AnonymousClass2JG) this).A0I;
        }
        if (this instanceof Conversation) {
            return ((Conversation) this).A03.A2x.A0I;
        }
        return null;
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

    public AnonymousClass1CF getSupportGatingUtils() {
        return this.A00.A0i;
    }

    public AnonymousClass1EL getSuspensionManager() {
        return this.A00.A0g;
    }

    public /* synthetic */ EditText getTextEntryField() {
        if (this instanceof Conversation) {
            return ((Conversation) this).A03.A4B;
        }
        return null;
    }

    public AnonymousClass1X4 getUserActions() {
        return this.A00.A07;
    }

    public AnonymousClass171 getWAContactNames() {
        return this.A00.A0F;
    }

    public C20830yE getWaPermissionsHelper() {
        return this.A00.A0U;
    }

    public C21010yW getWamRuntime() {
        return this.A00.A0d;
    }

    public void onCreate(Bundle bundle) {
        if (this.A00 == null) {
            C70523fI ADd = ((C27101Mx) C19570wA.A00(C27101Mx.class, this)).ADd();
            this.A00 = ADd;
            ADd.A0M = this;
            List list = this.A01;
            if (list != null && 0 < list.size()) {
                list.get(0);
                throw AnonymousClass001.A0A("onCreate");
            }
        }
        super.onCreate(bundle);
        this.A00.A06();
    }

    public Dialog onCreateDialog(int i) {
        return this.A00.A03(i);
    }

    public void onDestroy() {
        this.A00.A07();
        this.A01.clear();
    }

    public /* synthetic */ void setQuotedMessage(AnonymousClass3T1 r2) {
        if (this instanceof Conversation) {
            ((Conversation) this).A03.A2x.A0a(r2);
        }
    }

    public void setSelectionActionMode(AnonymousClass0V9 r2) {
        this.A00.A00 = r2;
    }

    public Dialog BiX(int i) {
        return super.onCreateDialog(i);
    }

    public void BiZ() {
        super.onDestroy();
    }

    public void Bih(AnonymousClass0V9 r2) {
        super.Bih(r2);
        this.A00.A09();
    }

    public void Bii(AnonymousClass0V9 r2) {
        super.Bii(r2);
        this.A00.A0A();
    }

    public C20810yC getABProps() {
        return this.A0D;
    }

    public AnonymousClass017 getSavedStateRegistryOwner() {
        return this;
    }

    public AnonymousClass016 getViewModelStoreOwner() {
        return this;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.A00.A0C(i, i2, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A00.A0D(configuration);
    }

    public void onPause() {
        super.onPause();
        this.A00.A08();
    }

    public void onRestoreInstanceState(Bundle bundle) {
        C64933Qa A03;
        super.onRestoreInstanceState(bundle);
        C70523fI r2 = this.A00;
        C70523fI.A02(r2);
        if (bundle != null && (A03 = AnonymousClass3UJ.A03(bundle, "")) != null) {
            r2.A0r = r2.A0x.A03(A03);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AnonymousClass3T1 r0 = this.A00.A0r;
        if (r0 != null) {
            AnonymousClass3UJ.A08(bundle, r0.A1J);
        }
    }
}
