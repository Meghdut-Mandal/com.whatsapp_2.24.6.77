package X;

import android.app.Dialog;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.bottombar.BottomBarView;
import com.whatsapp.mediacomposer.bottombar.caption.CaptionView;
import com.whatsapp.mediacomposer.bottombar.filterswipe.FilterSwipeView;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.status.privacy.StatusPrivacyBottomSheetDialogFragment;

/* renamed from: X.6vv  reason: invalid class name and case insensitive filesystem */
public final class C146636vv implements AnonymousClass4UT, AnonymousClass4U9, AnonymousClass4R3, AnonymousClass4R2 {
    public C160137kW A00;
    public C157387cs A01;
    public final BottomBarView A02;
    public final AnonymousClass64H A03;
    public final C119805qU A04;
    public final C160657lN A05;
    public final AnonymousClass6BW A06;
    public final C146656vx A07;
    public final AnonymousClass6VT A08;

    public /* synthetic */ void onDismiss() {
    }

    public static void A00(MediaComposerActivity mediaComposerActivity) {
        mediaComposerActivity.A0u.A07.A09.A06();
    }

    public void A01() {
        FilterSwipeView filterSwipeView = this.A04.A01;
        filterSwipeView.A00.clearAnimation();
        filterSwipeView.setFilterSwipeTextVisibility(8);
    }

    public void A02(CharSequence charSequence, boolean z) {
        CharSequence charSequence2;
        AnonymousClass64H r5 = this.A03;
        if (TextUtils.isEmpty(charSequence)) {
            CaptionView captionView = r5.A03;
            captionView.setCaptionText((CharSequence) null);
            C36331k8.A0q(r5.A00, captionView, R.string.f12nameremoved);
            return;
        }
        if (z) {
            C21060yb r4 = r5.A01;
            C19890wg r3 = r5.A04;
            MentionableEntry mentionableEntry = r5.A03.A0E;
            charSequence2 = AnonymousClass3UG.A03(r5.A00, mentionableEntry.getPaint(), r5.A02, AnonymousClass6YV.A09(r4, r3, charSequence, mentionableEntry.getCurrentTextColor(), true));
        } else {
            charSequence2 = charSequence;
        }
        CaptionView captionView2 = r5.A03;
        captionView2.setCaptionText(charSequence2);
        captionView2.setContentDescription(charSequence);
    }

    public void A03(boolean z) {
        if (z) {
            C146656vx r3 = this.A07;
            r3.A05.animate().alpha(1.0f).withStartAction(new C1503074t((Object) r3, 39));
        }
        BottomBarView bottomBarView = this.A02;
        bottomBarView.animate().alpha(1.0f).withStartAction(new C1503074t((Object) bottomBarView, 34));
    }

    public void A04(boolean z) {
        if (z) {
            C146656vx r3 = this.A07;
            r3.A05.animate().alpha(0.0f).withEndAction(new C1503074t((Object) r3, 38));
        }
        BottomBarView bottomBarView = this.A02;
        bottomBarView.animate().alpha(0.0f).withEndAction(new C1503074t((Object) bottomBarView, 35));
    }

    public void A05(boolean z) {
        this.A06.A01.setClickable(z);
        CaptionView captionView = this.A03.A03;
        captionView.setClickable(z);
        captionView.setAddButtonClickable(z);
        captionView.setViewOnceButtonClickable(z);
    }

    public void A06(boolean z) {
        this.A02.setVisibility(0);
        C146656vx r0 = this.A07;
        r0.A05.setVisibility(C36351kA.A00(z ? 1 : 0));
    }

    public void BQm() {
        this.A00.BQm();
    }

    public void BT7() {
        C160137kW r0 = this.A00;
        if (r0 != null) {
            MediaComposerActivity.A0j((MediaComposerActivity) r0);
        }
    }

    public void Be3(int i) {
        C160137kW r0 = this.A00;
        if (r0 != null) {
            r0.Be3(i);
        }
    }

    public void Be4(int i) {
        C160137kW r0 = this.A00;
        if (r0 != null) {
            r0.Be4(i);
        }
    }

    public void BeL(boolean z) {
        C160137kW r4 = this.A00;
        if (r4 != null) {
            MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) r4;
            C160657lN r0 = mediaComposerActivity.A0w;
            if (r0 == null || r0.isEnabled()) {
                mediaComposerActivity.A1O.A02(C36371kC.A0o(), 1, mediaComposerActivity.A0s.A06());
                mediaComposerActivity.A1Y = true;
                if (!MediaComposerActivity.A0u(mediaComposerActivity) || !mediaComposerActivity.A0D.A0E(6132)) {
                    MediaComposerActivity.A0r(mediaComposerActivity, z);
                    return;
                }
                mediaComposerActivity.A1Y = z;
                StatusPrivacyBottomSheetDialogFragment A002 = C55512uk.A00(AnonymousClass000.A1P(mediaComposerActivity.A1Q.A00() ? 1 : 0));
                mediaComposerActivity.A1F.A03(A002.A0b(), AnonymousClass6VT.A01(mediaComposerActivity));
                mediaComposerActivity.Btm(A002);
                Dialog dialog = A002.A02;
                if (dialog != null) {
                    C18740tg.A06(dialog);
                    dialog.setOnDismissListener(new C163977r4(mediaComposerActivity, 5));
                }
            }
        }
    }

    public void BgE() {
        MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) this.A00;
        mediaComposerActivity.A1O.A02(46, 1, mediaComposerActivity.A0s.A06());
        if (!mediaComposerActivity.A1G.A00() || mediaComposerActivity.A1t.get() != C51292na.QUICK_SHARE) {
            mediaComposerActivity.A3j();
        } else {
            MediaComposerActivity.A0i(mediaComposerActivity);
        }
    }

    public void Bj6(int i) {
        Uri A082;
        MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) this.A01;
        AnonymousClass6VT r1 = mediaComposerActivity.A0s;
        if (C111075bh.A00(r1.A01)) {
            C1270866x.A00(mediaComposerActivity.A1O, 67, 1, r1.A06());
            mediaComposerActivity.A0i.setCurrentItem(C1031053t.A00(mediaComposerActivity.A0t, i));
        } else if (mediaComposerActivity.A1Z || C36341k9.A07(r1.A03) != i) {
            C1270866x.A00(mediaComposerActivity.A1O, 32, 1, mediaComposerActivity.A0s.A06());
            mediaComposerActivity.A1Z = false;
            mediaComposerActivity.A0i.setCurrentItem(C1031053t.A00(mediaComposerActivity.A0t, i));
            C96024mf r12 = mediaComposerActivity.A0u.A07.A09;
            r12.A00 = false;
            r12.A06();
            Handler handler = mediaComposerActivity.A1q;
            handler.removeCallbacksAndMessages((Object) null);
            C1503074t r2 = new C1503074t(mediaComposerActivity, 29);
            mediaComposerActivity.A1U = r2;
            handler.postDelayed(r2, 500);
        } else {
            C1270866x.A00(mediaComposerActivity.A1O, 40, 1, mediaComposerActivity.A0s.A06());
            if (mediaComposerActivity.A1U == null && (A082 = mediaComposerActivity.A0s.A08()) != null) {
                MediaComposerActivity.A0L(A082, mediaComposerActivity);
            }
        }
    }

    public void BkR() {
        AnonymousClass6VT r3 = this.A08;
        int A072 = C36341k9.A07(r3.A07);
        if (A072 == 2) {
            AnonymousClass6VT.A05(r3, 3);
        } else if (A072 == 3) {
            AnonymousClass6VT.A05(r3, 2);
        }
    }

    public C146636vv(AnonymousClass6VT r6, BottomBarView bottomBarView, AnonymousClass64H r8, C119805qU r9, C160657lN r10, AnonymousClass6BW r11, C146656vx r12) {
        this.A02 = bottomBarView;
        this.A08 = r6;
        this.A03 = r8;
        this.A05 = r10;
        this.A04 = r9;
        this.A07 = r12;
        this.A06 = r11;
        C001700s r3 = r6.A02;
        r10.Brt((AnonymousClass3XT) r6.A05.A04(), C36401kF.A0w(r3), true);
        CaptionView captionView = r8.A03;
        MentionableEntry mentionableEntry = captionView.A0E;
        mentionableEntry.setScrollBarStyle(33554432);
        mentionableEntry.setClickable(false);
        mentionableEntry.setCursorVisible(false);
        mentionableEntry.setFocusable(false);
        mentionableEntry.setFocusableInTouchMode(false);
        mentionableEntry.setImportantForAccessibility(2);
        captionView.A0C.setVisibility(0);
        int A072 = r6.A07();
        bottomBarView.getAbProps();
        if (A072 != 0) {
            WaImageButton waImageButton = r11.A01;
            waImageButton.setImageResource(R.drawable.ic_done);
            C36331k8.A0q(waImageButton.getContext(), waImageButton, R.string.f12nameremoved);
        } else {
            r11.A00();
        }
        RecyclerView recyclerView = r12.A05;
        recyclerView.A0t(new C41201wp(r12.A06));
        LinearLayoutManager A0T = C36431kI.A0T();
        A0T.A1f(0);
        recyclerView.setLayoutManager(A0T);
        boolean A1a = C36401kF.A1a(C36401kF.A0w(r3));
        CaptionView captionView2 = this.A03.A03;
        C18820ts r0 = captionView2.A00;
        if (A1a) {
            AnonymousClass6H8.A00(captionView2, r0);
        } else {
            AnonymousClass6H8.A01(captionView2, r0);
        }
        AnonymousClass6BW r1 = this.A06;
        this.A02.getAbProps();
        r1.A01(A1a);
    }
}
