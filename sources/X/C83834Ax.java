package X;

import android.widget.ImageButton;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.conversation.selection.SingleSelectedMessageActivity;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;

/* renamed from: X.4Ax  reason: invalid class name and case insensitive filesystem */
public final class C83834Ax extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ SingleSelectedMessageActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83834Ax(SingleSelectedMessageActivity singleSelectedMessageActivity) {
        super(0);
        this.this$0 = singleSelectedMessageActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass11F r0;
        C64933Qa r02;
        SingleSelectedMessageActivity singleSelectedMessageActivity = this.this$0;
        C39701tL r03 = singleSelectedMessageActivity.A07;
        if (r03 == null) {
            throw C36331k8.A0d("singleSelectedMessageViewModel");
        }
        AnonymousClass3T1 A0r = C36431kI.A0r(r03.A00);
        C20810yC r13 = singleSelectedMessageActivity.A0D;
        AnonymousClass1N2 r12 = singleSelectedMessageActivity.A0C;
        C19700wN r11 = singleSelectedMessageActivity.A03;
        AnonymousClass1H2 r10 = singleSelectedMessageActivity.A0C;
        AnonymousClass1XN r9 = singleSelectedMessageActivity.A0A;
        if (r9 != null) {
            C21060yb r8 = singleSelectedMessageActivity.A08;
            C18820ts r7 = singleSelectedMessageActivity.A00;
            C1261362r r6 = singleSelectedMessageActivity.A08;
            if (r6 != null) {
                EmojiSearchProvider emojiSearchProvider = singleSelectedMessageActivity.A0B;
                if (emojiSearchProvider != null) {
                    C19420v0 r4 = singleSelectedMessageActivity.A09;
                    C19890wg r3 = singleSelectedMessageActivity.A0C;
                    if (r3 != null) {
                        KeyboardPopupLayout keyboardPopupLayout = singleSelectedMessageActivity.A02;
                        if (keyboardPopupLayout != null) {
                            WaEditText waEditText = new WaEditText(singleSelectedMessageActivity);
                            Integer A13 = C36431kI.A13();
                            if (A0r == null || (r02 = A0r.A1J) == null) {
                                r0 = null;
                            } else {
                                r0 = r02.A00;
                            }
                            Integer A00 = C54212sa.A00(r0);
                            AnonymousClass6O1 r04 = singleSelectedMessageActivity.A09;
                            if (r04 != null) {
                                C1261362r r23 = r6;
                                AnonymousClass6O1 r24 = r04;
                                C18820ts r22 = r7;
                                C19420v0 r21 = r4;
                                C21060yb r20 = r8;
                                WaEditText waEditText2 = waEditText;
                                KeyboardPopupLayout keyboardPopupLayout2 = keyboardPopupLayout;
                                C19700wN r17 = r11;
                                AnonymousClass22t r14 = new AnonymousClass22t(singleSelectedMessageActivity, (ImageButton) null, r17, keyboardPopupLayout2, waEditText2, r20, r21, r22, r23, r24, r9, r10, emojiSearchProvider, r13, r3, r12, A13, A00);
                                r14.A0H(new C89604Xe(singleSelectedMessageActivity, 4));
                                AnonymousClass3J6 r2 = new AnonymousClass3J6(singleSelectedMessageActivity, r14, (EmojiSearchContainer) C03570Gk.A0B(singleSelectedMessageActivity, R.id.selected_message_emoji_search_container));
                                r14.A0F = new C81103wT((Object) r2, 47);
                                r2.A00 = new AnonymousClass4Z1(singleSelectedMessageActivity, r2, 0);
                                r14.A0C = r2;
                                return r14;
                            }
                            throw C36331k8.A0d("expressionUserJourneyLogger");
                        }
                        throw C36331k8.A0d("keyboardPopupLayout");
                    }
                    throw C36331k8.A0d("sharedPreferencesFactory");
                }
                throw C36331k8.A0d("emojiSearchProvider");
            }
            throw C36331k8.A0d("emojiTrayLogger");
        }
        throw C36331k8.A0d("recentEmojis");
    }
}
