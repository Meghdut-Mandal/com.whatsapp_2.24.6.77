package X;

import android.app.Dialog;
import android.os.Bundle;
import android.text.SpannedString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.KeyboardPopupLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.mediacomposer.bottombar.caption.CaptionView;
import com.whatsapp.mediacomposer.bottombar.recipients.DefaultRecipientsView;
import com.whatsapp.mentions.MentionableEntry;
import java.util.List;

/* renamed from: X.4ab  reason: invalid class name and case insensitive filesystem */
public final class C90714ab extends Dialog implements AnonymousClass4UT, AnonymousClass4U9, AnonymousClass4R1 {
    public AnonymousClass3J6 A00;
    public AnonymousClass64H A01;
    public C121735td A02;
    public C160657lN A03;
    public AnonymousClass6BW A04;
    public Integer A05;
    public Integer A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public AnonymousClass22t A0A;
    public final C88314Sf A0B = new C163357q4(this, 2);
    public final C18820ts A0C;
    public final C20810yC A0D;
    public final AnonymousClass6VT A0E;
    public final C51292na A0F;
    public final AnonymousClass3G2 A0G;
    public final C28331Sf A0H;
    public final List A0I;
    public final int A0J;
    public final C19700wN A0K;
    public final C225314u A0L;
    public final C21060yb A0M;
    public final C19420v0 A0N;
    public final C220412q A0O;
    public final C1261362r A0P;
    public final AnonymousClass6O1 A0Q;
    public final AnonymousClass1XN A0R;
    public final AnonymousClass1H2 A0S;
    public final EmojiSearchProvider A0T;
    public final C19890wg A0U;
    public final AnonymousClass1N2 A0V;
    public final CharSequence A0W;
    public final boolean A0X;
    public final boolean A0Y;

    public /* synthetic */ void BQm() {
    }

    public void BT7() {
        this.A08 = true;
        onDismiss();
    }

    public void BeL(boolean z) {
        this.A07 = true;
        this.A09 = z;
        onDismiss();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C90714ab(X.C19700wN r22, X.C225314u r23, X.C21060yb r24, X.C19420v0 r25, X.C18820ts r26, X.C220412q r27, X.C1261362r r28, X.AnonymousClass6O1 r29, X.AnonymousClass1XN r30, X.AnonymousClass1H2 r31, com.whatsapp.emoji.search.EmojiSearchProvider r32, X.C20810yC r33, X.AnonymousClass6VT r34, X.C51292na r35, X.AnonymousClass3G2 r36, X.C19890wg r37, X.C28331Sf r38, X.AnonymousClass1N2 r39, java.lang.CharSequence r40, java.util.List r41, int r42, boolean r43, boolean r44) {
        /*
            r21 = this;
            r3 = r39
            r14 = r33
            r20 = r22
            r16 = r27
            r1 = r20
            r0 = r16
            X.C36321k7.A19(r14, r3, r1, r0)
            r4 = r38
            r13 = r30
            r12 = r31
            r19 = r24
            r17 = r26
            r1 = r19
            r0 = r17
            X.C36321k7.A1C(r12, r13, r4, r1, r0)
            r0 = 11
            r11 = r28
            X.AnonymousClass00C.A0D(r11, r0)
            r8 = r34
            r5 = r37
            r10 = r29
            r9 = r32
            r18 = r25
            r0 = r18
            X.C36321k7.A1D(r9, r0, r8, r5, r10)
            r0 = 17
            r2 = r41
            X.AnonymousClass00C.A0D(r2, r0)
            r0 = 21
            r7 = r35
            X.AnonymousClass00C.A0D(r7, r0)
            r0 = 22
            r6 = r36
            X.AnonymousClass00C.A0D(r6, r0)
            r15 = 2132083178(0x7f1501ea, float:1.980649E38)
            r1 = r21
            r0 = r23
            r1.<init>(r0, r15)
            r1.A0L = r0
            r1.A0D = r14
            r1.A0V = r3
            r0 = r20
            r1.A0K = r0
            r0 = r16
            r1.A0O = r0
            r1.A0S = r12
            r1.A0R = r13
            r1.A0H = r4
            r0 = r19
            r1.A0M = r0
            r0 = r17
            r1.A0C = r0
            r1.A0P = r11
            r1.A0T = r9
            r0 = r18
            r1.A0N = r0
            r1.A0E = r8
            r1.A0U = r5
            r1.A0Q = r10
            r1.A0I = r2
            r0 = r40
            r1.A0W = r0
            r0 = r42
            r1.A0J = r0
            r0 = r43
            r1.A0Y = r0
            r1.A0F = r7
            r1.A0G = r6
            r0 = r44
            r1.A0X = r0
            r2 = 2
            X.7q4 r0 = new X.7q4
            r0.<init>(r1, r2)
            r1.A0B = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90714ab.<init>(X.0wN, X.14u, X.0yb, X.0v0, X.0ts, X.12q, X.62r, X.6O1, X.1XN, X.1H2, com.whatsapp.emoji.search.EmojiSearchProvider, X.0yC, X.6VT, X.2na, X.3G2, X.0wg, X.1Sf, X.1N2, java.lang.CharSequence, java.util.List, int, boolean, boolean):void");
    }

    public void BkR() {
        AnonymousClass6VT r3 = this.A0E;
        int A072 = C36341k9.A07(r3.A07);
        if (A072 == 2) {
            AnonymousClass6VT.A05(r3, 3);
        } else if (A072 == 3) {
            AnonymousClass6VT.A05(r3, 2);
        }
    }

    public void onCreate(Bundle bundle) {
        C160657lN A002;
        ImageButton imageButton;
        MentionableEntry mentionableEntry;
        Integer A0h;
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            AnonymousClass1JZ.A08(window, this.A0C);
        }
        C28331Sf r28 = this.A0H;
        boolean A003 = r28.A00();
        int i = R.layout.f9nameremoved;
        if (A003) {
            i = R.layout.f9nameremoved;
        }
        C225314u r7 = this.A0L;
        AnonymousClass11F r1 = null;
        setContentView(LayoutInflater.from(r7).inflate(i, (ViewGroup) null));
        View A004 = AnonymousClass0PN.A00(this, R.id.main);
        AnonymousClass00C.A08(A004);
        C220412q r2 = this.A0O;
        AnonymousClass1H2 r33 = this.A0S;
        C21060yb r32 = this.A0M;
        C19890wg r0 = this.A0U;
        C19890wg r27 = r0;
        AnonymousClass64H r13 = new AnonymousClass64H(r32, r2, r33, (CaptionView) C012005e.A02(A004, R.id.input_container_inner), r0);
        boolean z = this.A0X;
        CaptionView captionView = r13.A03;
        captionView.A04 = z;
        CharSequence charSequence = this.A0W;
        List list = this.A0I;
        if (list.size() == 1) {
            r1 = (AnonymousClass11F) C36391kE.A0t(list);
        }
        ViewGroup A0O2 = C36411kG.A0O(A004, R.id.mention_attach);
        AnonymousClass6VT r3 = this.A0E;
        MentionableEntry mentionableEntry2 = captionView.A0E;
        mentionableEntry2.setScrollBarStyle(EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING);
        mentionableEntry2.setImeOptions(6);
        mentionableEntry2.setInputType(147457);
        captionView.A0A.setVisibility(0);
        captionView.setCaptionEditTextView(charSequence);
        C165177t0 r11 = new C165177t0(r13, 41);
        C001700s r02 = r3.A07;
        r02.A08(r7, r11);
        r13.A00((Integer) r02.A04());
        captionView.setupMentions(r1, A0O2, A004);
        captionView.setNewLineEnabledForNewsletter(r1);
        LinearLayout linearLayout = captionView.A0B;
        linearLayout.setVisibility(0);
        captionView.A08.setVisibility(8);
        AlphaAnimation A0D2 = C36351kA.A0D();
        A0D2.setDuration(220);
        A0D2.setInterpolator(new DecelerateInterpolator());
        linearLayout.startAnimation(A0D2);
        mentionableEntry2.startAnimation(A0D2);
        captionView.setCaptionButtonsListener(this);
        AnonymousClass1H2 r20 = r13.A02;
        C19890wg r15 = r13.A04;
        C18820ts r14 = captionView.A00;
        AnonymousClass1N0 r132 = captionView.A01;
        TextView A0O3 = C36391kE.A0O(captionView, R.id.counter);
        boolean z2 = captionView.A0F;
        mentionableEntry2.addTextChangedListener(new AnonymousClass2gA(mentionableEntry2, A0O3, r13.A01, r14, r132, r20, r15, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, 30, true, true, z2));
        if (z2) {
            mentionableEntry2.addTextChangedListener(new AnonymousClass2g8(mentionableEntry2, captionView.A00));
        }
        mentionableEntry2.setOnEditorActionListener(new C89384Wi(this, 5));
        mentionableEntry2.A01 = new C70353f1(captionView, this);
        this.A01 = r13;
        C18820ts r9 = this.A0C;
        AnonymousClass6BW r10 = new AnonymousClass6BW((WaImageButton) C36361kB.A0G(A004, R.id.send), r9);
        int i2 = this.A0J;
        C20810yC r26 = this.A0D;
        if (i2 != 0) {
            WaImageButton waImageButton = r10.A01;
            waImageButton.setImageResource(R.drawable.ic_done);
            C36331k8.A0q(waImageButton.getContext(), waImageButton, R.string.f12nameremoved);
        } else {
            r10.A00();
        }
        C48752hz.A00(r10.A01, this, 31);
        this.A04 = r10;
        if (r28.A00()) {
            A002 = this.A0G.A01((ViewStub) C36361kB.A0G(A004, R.id.media_recipients_stub), this.A0F);
        } else {
            A002 = this.A0G.A00((DefaultRecipientsView) C36361kB.A0G(A004, R.id.media_recipients));
        }
        this.A03 = A002;
        View A0G2 = C36361kB.A0G(A004, R.id.input_container);
        boolean z3 = this.A0Y;
        C160657lN r03 = this.A03;
        if (z3) {
            if (r03 == null) {
                throw C36331k8.A0d("recipientsController");
            }
            r03.Bru(this);
        } else if (r03 == null) {
            throw C36331k8.A0d("recipientsController");
        } else {
            r03.B5T();
        }
        C160657lN r22 = this.A03;
        if (r22 == null) {
            throw C36331k8.A0d("recipientsController");
        }
        AnonymousClass3XT r04 = (AnonymousClass3XT) r3.A05.A04();
        AnonymousClass00C.A08(r04);
        r22.Brt(r04, list, true);
        boolean A1a = C36401kF.A1a(C36401kF.A0w(r3.A02));
        if (A1a) {
            AnonymousClass6H8.A00(A0G2, r9);
        } else {
            AnonymousClass6H8.A01(A0G2, r9);
        }
        AnonymousClass6BW r05 = this.A04;
        if (r05 == null) {
            throw C36331k8.A0d("sendButtonController");
        }
        r05.A01(A1a);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        if ((r7.getWindow().getAttributes().flags & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
            Window window3 = getWindow();
            if (window3 != null) {
                window3.setFlags(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
            }
            Window window4 = getWindow();
            if (window4 != null) {
                window4.clearFlags(256);
            }
        }
        KeyboardPopupLayout keyboardPopupLayout = (KeyboardPopupLayout) A004.findViewById(R.id.main);
        C48752hz.A00(keyboardPopupLayout, this, 29);
        AnonymousClass1N2 r282 = this.A0V;
        C19700wN r31 = this.A0K;
        AnonymousClass1XN r152 = this.A0R;
        C1261362r r12 = this.A0P;
        EmojiSearchProvider emojiSearchProvider = this.A0T;
        C19420v0 r34 = this.A0N;
        AnonymousClass64H r06 = this.A01;
        if (r06 != null) {
            CaptionView captionView2 = r06.A03;
            imageButton = captionView2.A0A;
            mentionableEntry = captionView2.A0E;
        } else {
            imageButton = null;
            mentionableEntry = null;
        }
        Integer A0i = C36401kF.A0i();
        if (list.isEmpty()) {
            A0h = null;
        } else if (list.size() == 1) {
            A0h = C54212sa.A00((AnonymousClass11F) list.get(0));
        } else {
            A0h = C36401kF.A0h();
        }
        AnonymousClass22t r122 = new AnonymousClass22t(r7, imageButton, r31, keyboardPopupLayout, mentionableEntry, r32, r34, r9, r12, this.A0Q, r152, r33, emojiSearchProvider, r26, r27, r282, A0i, A0h);
        AnonymousClass3J6 r35 = new AnonymousClass3J6(r7, r122, (EmojiSearchContainer) A004.findViewById(R.id.emoji_search_container));
        this.A00 = r35;
        r122.A0F = new C1503074t((Object) this, 36);
        this.A0A = r122;
        r35.A00 = new C164097rG(this, 2);
        r122.A0H(this.A0B);
        r122.A00 = R.drawable.ib_emoji;
        r122.A03 = R.drawable.ib_keyboard;
        Window window5 = getWindow();
        if (window5 != null) {
            window5.setSoftInputMode(5);
        }
        AnonymousClass64H r07 = this.A01;
        if (r07 != null) {
            r07.A03.A0E.A0C(true);
        }
    }

    public void Be3(int i) {
        this.A05 = Integer.valueOf(i);
        onDismiss();
    }

    public void Be4(int i) {
        this.A06 = Integer.valueOf(i);
        onDismiss();
    }

    public void onDismiss() {
        super.dismiss();
        AnonymousClass22t r0 = this.A0A;
        C121735td r1 = null;
        if (r0 == null) {
            throw C36331k8.A0d("emojiPopup");
        }
        if (r0.isShowing()) {
            AnonymousClass22t r02 = this.A0A;
            if (r02 == null) {
                throw C36331k8.A0d("emojiPopup");
            }
            r02.dismiss();
        }
        AnonymousClass64H r03 = this.A01;
        if (r03 != null) {
            CaptionView captionView = r03.A03;
            r1 = new C121735td(new SpannedString(captionView.getCaptionText()), captionView.A0E.getStringText(), captionView.A0E.getMentions());
        }
        this.A02 = r1;
        AnonymousClass64H r04 = this.A01;
        if (r04 != null) {
            r04.A03.A0E.A0F();
        }
    }
}
