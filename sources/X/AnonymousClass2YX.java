package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.settings.chat.wallpaper.WallPaperView;
import java.io.File;
import java.util.List;

/* renamed from: X.2YX  reason: invalid class name */
public final class AnonymousClass2YX extends C38151nn implements C18700tb {
    public AnonymousClass3CP A00;
    public C201709k9 A01;
    public C18820ts A02;
    public C20810yC A03;
    public AnonymousClass1DU A04;
    public C199859g8 A05;
    public C32681e1 A06;
    public AnonymousClass1SV A07;
    public AnonymousClass1QZ A08;
    public boolean A09;
    public final View A0A;
    public final View A0B;
    public final View A0C;
    public final ViewGroup A0D;
    public final FrameLayout A0E;
    public final FrameLayout A0F;
    public final ImageView A0G;
    public final LinearLayout A0H;
    public final TextView A0I;
    public final TextView A0J;
    public final TextView A0K;
    public final TextView A0L;
    public final TextView A0M;
    public final TextView A0N;
    public final CardView A0O;
    public final TextEmojiLabel A0P;
    public final TextEmojiLabel A0Q;
    public final AnonymousClass3SF A0R;
    public final ThumbnailButton A0S;
    public final WallPaperView A0T;
    public final ConstraintLayout A0U;

    public AnonymousClass2YX(Context context) {
        super(context);
        if (!this.A09) {
            this.A09 = true;
            C27861Qc r1 = (C27861Qc) ((C27851Qb) generatedComponent());
            C18800tq r3 = r1.A0M;
            this.A04 = C36351kA.A0a(r3);
            this.A01 = C36361kB.A0V(r3);
            this.A03 = C36351kA.A0U(r3);
            this.A06 = C36351kA.A0m(r3);
            C18830tt r2 = r3.A00;
            this.A05 = (C64633Ov) r2.A2u.get();
            this.A02 = C36361kB.A0W(r3);
            this.A00 = C36361kB.A0S(r3);
            this.A03 = C36341k9.A0V(r3);
            this.A06 = C36351kA.A0p(r2);
            this.A04 = C36391kE.A0j(r3);
            this.A02 = C36341k9.A0T(r3);
            this.A05 = (C199859g8) r2.ABh.get();
            this.A07 = C36401kF.A0g(r3);
            this.A01 = C27111My.A1O(r1.A0L);
            this.A00 = C27861Qc.A0B(r1);
        }
        View inflate = View.inflate(context, R.layout.f9nameremoved, this);
        this.A0O = (CardView) C36361kB.A0F(inflate, R.id.newsletter_status_card);
        this.A0U = (ConstraintLayout) C36361kB.A0F(inflate, R.id.newsletter_status_constraint_layout);
        this.A0G = C36361kB.A0M(inflate, R.id.newsletter_status_thumbnail);
        this.A0R = AnonymousClass3SF.A01(this, getTextEmojiLabelViewControllerFactory(), R.id.newsletter_status_name);
        this.A0I = C36351kA.A0F(inflate, R.id.newsletter_status_followers);
        WallPaperView wallPaperView = (WallPaperView) C36361kB.A0F(inflate, R.id.newsletter_status_wall_paper);
        this.A0T = wallPaperView;
        View A0F2 = C36361kB.A0F(this, R.id.newsletter_status_conversation_row);
        this.A0A = A0F2;
        this.A0D = (ViewGroup) C36361kB.A0F(A0F2, R.id.newsletter_status_conversation_message);
        this.A0J = C36351kA.A0F(inflate, R.id.newsletter_status_forwarded_label);
        this.A0P = C36361kB.A0R(inflate, R.id.newsletter_status_forwarded_name);
        this.A0F = (FrameLayout) C36361kB.A0F(A0F2, R.id.newsletter_quoted_message_container);
        this.A0B = C36371kC.A0J(C36351kA.A0C(this), (ViewGroup) null, R.layout.f9nameremoved, false);
        this.A0S = (ThumbnailButton) C36361kB.A0F(this, R.id.newsletter_status_conversation_media);
        this.A0E = (FrameLayout) C36361kB.A0F(this, R.id.newsletter_status_conversation_media_container);
        this.A0C = C36361kB.A0F(this, R.id.newsletter_status_conversation_media_url_info);
        this.A0N = C36351kA.A0F(this, R.id.newsletter_status_conversation_media_url_title);
        this.A0L = C36351kA.A0F(this, R.id.newsletter_status_conversation_media_url_description);
        this.A0M = C36351kA.A0F(this, R.id.newsletter_status_conversation_media_url_host);
        this.A0Q = C36361kB.A0R(this, R.id.newsletter_status_conversation_text);
        this.A0H = (LinearLayout) C36361kB.A0F(A0F2, R.id.newsletter_status_conversation_reactions);
        this.A0K = C36351kA.A0F(A0F2, R.id.newsletter_status_conversation_reactions_count);
        float radius = this.A0O.getRadius();
        Bitmap A002 = AnonymousClass3U7.A00(context, getResources());
        float[] fArr = new float[8];
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        C36361kB.A1U(fArr, radius);
        wallPaperView.setRadii(fArr);
        wallPaperView.setImageBitmap(A002);
    }

    private final void setForwardedAttributionPadding(AnonymousClass3T1 r4) {
        if (AnonymousClass000.A1S(r4.A0A & 1, 1)) {
            int dimensionPixelSize = C36341k9.A0F(this).getDimensionPixelSize(R.dimen.f7nameremoved);
            if (r4 instanceof AnonymousClass2bU) {
                if (r4.A0W() != null) {
                    this.A0P.setPadding(0, 0, 0, dimensionPixelSize);
                    dimensionPixelSize = 0;
                }
                this.A0J.setPadding(0, 0, 0, dimensionPixelSize);
            }
        }
    }

    public final void setAbProps(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    public final void setConversationTopAttributeTextModelFactory(AnonymousClass3CP r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setLinkifier(C32681e1 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A06 = r2;
    }

    public final void setLinkifyWeb(AnonymousClass1DU r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A04 = r2;
    }

    public final void setMessageReplyHelper(C201709k9 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setMessageThumbCache(AnonymousClass1SV r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A07 = r2;
    }

    public final void setReplySubsystem(C199859g8 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A05 = r2;
    }

    public final void setWhatsAppLocale(C18820ts r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A08;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A08 = r0;
        }
        return r0.generatedComponent();
    }

    public final C20810yC getAbProps() {
        C20810yC r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A07();
    }

    public final AnonymousClass3CP getConversationTopAttributeTextModelFactory() {
        AnonymousClass3CP r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("conversationTopAttributeTextModelFactory");
    }

    public final C32681e1 getLinkifier() {
        C32681e1 r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0b();
    }

    public final AnonymousClass1DU getLinkifyWeb() {
        AnonymousClass1DU r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("linkifyWeb");
    }

    public final C201709k9 getMessageReplyHelper() {
        C201709k9 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("messageReplyHelper");
    }

    public final AnonymousClass1SV getMessageThumbCache() {
        AnonymousClass1SV r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("messageThumbCache");
    }

    public final C199859g8 getReplySubsystem() {
        C199859g8 r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("replySubsystem");
    }

    public final C18820ts getWhatsAppLocale() {
        C18820ts r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A09();
    }

    public final void A00(AnonymousClass141 r12, AnonymousClass3T1 r13) {
        File file;
        String path;
        String str;
        ColorStateList colorStateList;
        ThumbnailButton thumbnailButton;
        List list;
        int i;
        View view;
        AnonymousClass2bU r0;
        C65013Qj r1;
        File file2;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        float f = ((float) dimensionPixelSize) / 2.0f;
        Bitmap A052 = getContactPhotosBitmapManager().A05(getContext(), r12, f, dimensionPixelSize);
        Bitmap bitmap = A052;
        if (r13 instanceof C47002cZ) {
            C65013Qj r02 = ((AnonymousClass2bU) r13).A01;
            if (!(r02 == null || (file2 = r02.A0I) == null)) {
                bitmap = C25541Gs.A01(file2);
            }
            bitmap = null;
        } else if (r13 instanceof C46882bp) {
            C65013Qj r03 = ((AnonymousClass2bU) r13).A01;
            if (!(r03 == null || (file = r03.A0I) == null || (path = file.getPath()) == null)) {
                bitmap = BitmapFactory.decodeFile(path);
            }
            bitmap = null;
        } else {
            if (r13 instanceof AnonymousClass2bV) {
                Bitmap A0A2 = getMessageThumbCache().A0A(r13);
                if (A0A2 != null) {
                    bitmap = A0A2;
                }
            }
            bitmap = null;
        }
        setBackground(C55382uX.A00(C36371kC.A0B(this), bitmap));
        ImageView imageView = this.A0G;
        if (A052 == null) {
            A052 = AnonymousClass1Pp.A01(getContext(), getContactAvatars(), f, getContactAvatars().A02(r12), dimensionPixelSize);
            AnonymousClass00C.A08(A052);
        }
        imageView.setImageBitmap(A052);
        this.A0R.A05(r12);
        C220412q chatsCache = getChatsCache();
        C64933Qa r5 = r13.A1J;
        AnonymousClass11F r4 = r5.A00;
        C65073Qp A0W = C36371kC.A0W(chatsCache, r4);
        AnonymousClass00C.A0E(A0W, "null cannot be cast to non-null type com.whatsapp.data.NewsletterInfo");
        int i2 = (int) ((C44072La) A0W).A07;
        C64633Ov newsletterNumberFormatter = getNewsletterNumberFormatter();
        int A002 = C64633Ov.A00(newsletterNumberFormatter, i2);
        String A012 = newsletterNumberFormatter.A01(A002);
        AnonymousClass00C.A0D(A012, 1);
        C36351kA.A16(getResources(), this.A0I, C36431kI.A1Z(A012, 1), R.plurals.f10nameremoved, A002);
        boolean z = r13 instanceof AnonymousClass2bU;
        if (z) {
            str = ((AnonymousClass2bU) r13).A02;
        } else if (r13 instanceof AnonymousClass2bV) {
            str = ((AnonymousClass2bV) r13).A1Y();
        } else {
            str = null;
        }
        if (!AnonymousClass000.A1S(r13.A0A & 1, 1)) {
            this.A0J.setVisibility(8);
            this.A0P.setVisibility(8);
        } else {
            AnonymousClass36Q A003 = getConversationTopAttributeTextModelFactory().A00(r13, false);
            if (A003 != null) {
                StringBuilder A0u = AnonymousClass000.A0u();
                String str2 = C19430v1.A09;
                A0u.append(str2);
                String A0p = AnonymousClass000.A0p(getContext().getString(A003.A02), str2, A0u);
                TextView textView = this.A0J;
                textView.setVisibility(0);
                textView.setText(A0p);
                boolean A1X = C36401kF.A1X(getWhatsAppLocale());
                int i3 = A003.A01;
                if (A1X) {
                    textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, i3, 0);
                } else {
                    textView.setCompoundDrawablesWithIntrinsicBounds(i3, 0, 0, 0);
                }
                int A004 = AnonymousClass00F.A00(getContext(), R.color.f6nameremoved);
                if (A004 != 0) {
                    colorStateList = ColorStateList.valueOf(A004);
                } else {
                    colorStateList = null;
                }
                AnonymousClass088.A01(colorStateList, textView);
                textView.setTypeface(Typeface.create(textView.getTypeface(), 2));
                C63393Jw A0W2 = r13.A0W();
                if (A0W2 != null) {
                    TextEmojiLabel textEmojiLabel = this.A0P;
                    textEmojiLabel.setVisibility(0);
                    textEmojiLabel.setText(A0W2.A04);
                    getContext();
                    textEmojiLabel.setTypeface(C33511fU.A02());
                }
                setForwardedAttributionPadding(r13);
            }
        }
        if (r13.A0S() == null || !getAbProps().A0E(7237)) {
            FrameLayout frameLayout = this.A0F;
            frameLayout.setVisibility(8);
            frameLayout.removeView(this.A0B);
        } else {
            View view2 = this.A0B;
            View findViewById = view2.findViewById(R.id.quoted_message_frame);
            AnonymousClass3T1 A0S2 = r13.A0S();
            AnonymousClass3JO r10 = new AnonymousClass3JO(r4, r5.A02, false);
            if (A0S2 != null) {
                if (getReplySubsystem().A03(A0S2)) {
                    C199859g8 replySubsystem = getReplySubsystem();
                    AnonymousClass00C.A0B(findViewById);
                    replySubsystem.A01(findViewById, getMessageReplyHelper(), A0S2, r10);
                } else {
                    C201709k9 messageReplyHelper = getMessageReplyHelper();
                    AnonymousClass00C.A0B(findViewById);
                    messageReplyHelper.A06(findViewById, (AnonymousClass1RY) null, A0S2, r10);
                }
            }
            FrameLayout frameLayout2 = this.A0F;
            frameLayout2.addView(view2);
            frameLayout2.setVisibility(0);
        }
        AnonymousClass000.A16(this, getResources().getDimensionPixelSize(R.dimen.f7nameremoved), 1073741824, View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(R.dimen.f7nameremoved), 1073741824));
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
        if (!(!z || (r0 = (AnonymousClass2bU) r13) == null || (r1 = r0.A01) == null)) {
            float A013 = C15040mb.A01(((float) r1.A0A) / ((float) r1.A06), 0.98630136f, 3.0f);
            ThumbnailButton thumbnailButton2 = this.A0S;
            thumbnailButton2.getLayoutParams().height = (int) (C36441kJ.A01(thumbnailButton2) / A013);
        }
        if (bitmap != null) {
            Drawable A005 = AnonymousClass00E.A00(getContext(), R.drawable.balloon_incoming_frame);
            thumbnailButton = this.A0S;
            thumbnailButton.setImageBitmap(bitmap);
            this.A0E.setForeground(A005);
        } else {
            thumbnailButton = this.A0S;
            thumbnailButton.setVisibility(8);
        }
        if (r13 instanceof AnonymousClass2bV) {
            AnonymousClass2bV r3 = (AnonymousClass2bV) r13;
            String str3 = r3.A06;
            if (str3 != null) {
                thumbnailButton.A01 = 1.0f;
                thumbnailButton.A05 = new C68433bt(this);
                getMessageThumbCache().A0C(thumbnailButton, r3, new C53702rk(this, 13));
                this.A0C.setVisibility(0);
                this.A0N.setText(r3.A05);
                this.A0L.setText(r3.A04);
                String A006 = C63783Lk.A00(getLinkifyWeb(), str3);
                if (A006 != null) {
                    TextView textView2 = this.A0M;
                    if (A006.length() > 150) {
                        A006 = A006.substring(0, 150);
                    }
                    textView2.setText(A006);
                }
            } else {
                this.A0E.setVisibility(8);
            }
        }
        if (str == null || AnonymousClass098.A06(str)) {
            this.A0Q.setVisibility(8);
        } else {
            if (this.A0E.getVisibility() == 0) {
                C36371kC.A0K(this.A0Q).topMargin = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            }
            SpannableStringBuilder A0P2 = C36441kJ.A0P(str);
            int A007 = AnonymousClass00F.A00(getContext(), R.color.f6nameremoved);
            int A008 = AnonymousClass00F.A00(getContext(), R.color.f6nameremoved);
            C21060yb systemServices = getSystemServices();
            C19890wg sharedPreferencesFactory = getSharedPreferencesFactory();
            TextEmojiLabel textEmojiLabel2 = this.A0Q;
            AnonymousClass6YV.A05(textEmojiLabel2.getPaint(), systemServices, sharedPreferencesFactory, A0P2, A007, A008, false);
            getLinkifier().A04(getContext(), A0P2);
            textEmojiLabel2.A0I(A0P2);
        }
        C88944Uq r2 = r13.A0J;
        if (r2 != null) {
            C20810yC abProps = getAbProps();
            String[] strArr = C65753Ti.A03;
            int i4 = 3;
            if (abProps.A0E(2378)) {
                i4 = 4;
            }
            list = C65753Ti.A04(r2, i4, false);
            i = r2.BGT();
        } else {
            list = C023409w.A00;
            i = 0;
        }
        if (list.isEmpty()) {
            view = this.A0H;
        } else {
            C36371kC.A0K(this.A0D).bottomMargin = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            float A009 = C36441kJ.A00(getResources(), R.dimen.f7nameremoved);
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                View inflate = View.inflate(getContext(), R.layout.f9nameremoved, (ViewGroup) null);
                AnonymousClass00C.A0E(inflate, "null cannot be cast to non-null type com.whatsapp.TextEmojiLabel");
                TextEmojiLabel textEmojiLabel3 = (TextEmojiLabel) inflate;
                textEmojiLabel3.setSingleLine(false);
                textEmojiLabel3.setTextSize(0, A009);
                textEmojiLabel3.A0I((CharSequence) list.get(i5));
                this.A0H.addView(textEmojiLabel3, i5);
            }
            if (i <= 1) {
                view = this.A0K;
            } else {
                this.A0K.setText(getNewsletterNumberFormatter().A01(i));
                return;
            }
        }
        view.setVisibility(8);
    }

    public CardView getCardView() {
        return this.A0O;
    }

    public TextView getFollowersView() {
        return this.A0I;
    }

    public final ThumbnailButton getMediaView() {
        return this.A0S;
    }

    public AnonymousClass3SF getNameViewController() {
        return this.A0R;
    }

    public ImageView getThumbnailView() {
        return this.A0G;
    }
}
