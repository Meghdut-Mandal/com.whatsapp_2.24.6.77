package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.viewmodels.StatusesViewModel;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;
import java.util.List;

/* renamed from: X.4fA  reason: invalid class name and case insensitive filesystem */
public final class C92934fA extends FrameLayout implements C18700tb {
    public AnonymousClass17Y A00;
    public AnonymousClass1LI A01;
    public AnonymousClass171 A02;
    public C27731Pn A03;
    public ConversationsSuggestedContactsViewModel A04;
    public C21060yb A05;
    public C19970wo A06;
    public C19420v0 A07;
    public C20810yC A08;
    public C32251dE A09;
    public StatusesViewModel A0A;
    public AnonymousClass1QZ A0B;
    public boolean A0C;
    public boolean A0D;
    public final Context A0E;
    public final AnonymousClass00T A0F;
    public final AnonymousClass00T A0G;
    public final AnonymousClass00T A0H;
    public final AnonymousClass00T A0I;
    public final AnonymousClass00T A0J;
    public final AnonymousClass00T A0K;

    public static final void A01(C92934fA r14, List list) {
        C61953Ed r0;
        C92934fA r11 = r14;
        r14.getSuggestedContactsListView().removeAllViews();
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                throw C36351kA.A0v();
            }
            AnonymousClass3IF r12 = (AnonymousClass3IF) next;
            int i3 = 0;
            View inflate = LayoutInflater.from(r11.A0E).inflate(R.layout.f9nameremoved, r11.getSuggestedContactsListView(), false);
            C222813r r02 = UserJid.Companion;
            UserJid A002 = C222813r.A00(r12.A00.A0H);
            String str = null;
            if (A002 != null) {
                StatusesViewModel statusesViewModel = r11.A0A;
                if (statusesViewModel != null) {
                    r0 = statusesViewModel.A0S(A002);
                } else {
                    r0 = null;
                }
                r12.A01 = r0;
            }
            ImageView A0N = C36391kE.A0N(inflate, R.id.suggested_contacts_list_item_photo);
            r11.getPhotoLoader().A08(A0N, r12.A00);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(C92934fA.class.getName());
            AnonymousClass11F r03 = r12.A00.A0H;
            if (r03 != null) {
                str = r03.getRawString();
            }
            C011004s.A08(A0N, AnonymousClass000.A0q(str, A0u));
            r11.setContactName(AnonymousClass3SF.A01(inflate, r11.getTextEmojiLabelViewControllerFactory(), R.id.suggested_contacts_list_item_name), r12.A00);
            TextEmojiLabel A0P = C36401kF.A0P(inflate, R.id.suggested_contacts_list_item_info);
            String A022 = AnonymousClass3SX.A02(A0P.getContext(), r11.getTime(), r12.A00, r11.getAbProps());
            if (A022 != null) {
                A0P.A0I(A022);
            } else {
                i3 = 8;
            }
            A0P.setVisibility(i3);
            r11.setStatus(r12.A01, inflate);
            View findViewById = inflate.findViewById(R.id.suggested_contacts_list_item_container);
            A0N.setOnClickListener(new C135546cs(r11, r12, findViewById, i, 0));
            findViewById.setOnClickListener(new AnonymousClass3YL(r11, i, 8, r12));
            r11.getSuggestedContactsListView().addView(inflate);
            i = i2;
        }
        r11.getSuggestedContactDismissButton().setOnClickListener(new C66963Xz(r11, 40));
    }

    public final void setAbProps(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A08 = r2;
    }

    public final void setContactPhotos(C27731Pn r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    public final void setGlobalUI(AnonymousClass17Y r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setStatusesViewModelFactory(C32251dE r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A09 = r2;
    }

    public final void setSystemServices(C21060yb r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A05 = r2;
    }

    public final void setTextEmojiLabelViewControllerFactory(AnonymousClass1LI r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setTime(C19970wo r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A06 = r2;
    }

    public final void setWaContactNames(AnonymousClass171 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setWaSharedPreferences(C19420v0 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A07 = r2;
    }

    private final AnonymousClass1RJ getLoadingSpinnerViewStub() {
        return (AnonymousClass1RJ) this.A0F.getValue();
    }

    private final AnonymousClass1RY getPhotoLoader() {
        return (AnonymousClass1RY) this.A0G.getValue();
    }

    private final ImageView getSuggestedContactDismissButton() {
        return (ImageView) C36381kD.A0p(this.A0H);
    }

    private final LinearLayout getSuggestedContactsContainer() {
        return (LinearLayout) C36381kD.A0p(this.A0I);
    }

    private final LinearLayout getSuggestedContactsListView() {
        return (LinearLayout) C36381kD.A0p(this.A0J);
    }

    /* access modifiers changed from: private */
    public final AnonymousClass1RJ getSuggestedContactsViewStub() {
        return (AnonymousClass1RJ) this.A0K.getValue();
    }

    private final void setupObservers(ConversationsSuggestedContactsViewModel conversationsSuggestedContactsViewModel, AnonymousClass012 r5) {
        C28201Rs r2 = conversationsSuggestedContactsViewModel.A08;
        r2.A07(r5);
        C165177t0.A00(r5, r2, AnonymousClass5X0.A02(this, 25), 12);
        C28201Rs r22 = conversationsSuggestedContactsViewModel.A0A;
        r22.A07(r5);
        C165177t0.A00(r5, r22, AnonymousClass5X0.A02(this, 26), 10);
        C28201Rs r23 = conversationsSuggestedContactsViewModel.A0C;
        r23.A07(r5);
        C165177t0.A00(r5, r23, AnonymousClass5X0.A02(this, 27), 11);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0B;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0B = r0;
        }
        return r0.generatedComponent();
    }

    public final C20810yC getAbProps() {
        C20810yC r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A07();
    }

    public final C27731Pn getContactPhotos() {
        C27731Pn r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("contactPhotos");
    }

    public final AnonymousClass17Y getGlobalUI() {
        AnonymousClass17Y r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A06();
    }

    public final C32251dE getStatusesViewModelFactory() {
        C32251dE r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("statusesViewModelFactory");
    }

    public final C21060yb getSystemServices() {
        C21060yb r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0W();
    }

    public final AnonymousClass1LI getTextEmojiLabelViewControllerFactory() {
        AnonymousClass1LI r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("textEmojiLabelViewControllerFactory");
    }

    public final C19970wo getTime() {
        C19970wo r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("time");
    }

    public final AnonymousClass171 getWaContactNames() {
        AnonymousClass171 r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("waContactNames");
    }

    public final C19420v0 getWaSharedPreferences() {
        C19420v0 r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("waSharedPreferences");
    }

    public C92934fA(Context context) {
        super(context);
        if (!this.A0C) {
            this.A0C = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A06 = C36351kA.A0V(A0W);
            this.A08 = C36341k9.A0V(A0W);
            this.A00 = C36351kA.A0M(A0W);
            this.A03 = C36351kA.A0T(A0W);
            this.A05 = C36351kA.A0U(A0W);
            this.A02 = C36341k9.A0S(A0W);
            this.A07 = C36351kA.A0Y(A0W);
            this.A09 = (C32251dE) A0W.A00.A0E.get();
            this.A01 = C36361kB.A0S(A0W);
        }
        this.A0E = context;
        this.A0K = C36431kI.A1I(new AnonymousClass7L9(this));
        this.A0F = C36431kI.A1I(new AnonymousClass7L4(this));
        this.A0J = C36431kI.A1I(new AnonymousClass7L8(this));
        this.A0H = C36431kI.A1I(new AnonymousClass7L6(this));
        this.A0I = C36431kI.A1I(new AnonymousClass7L7(this));
        this.A0G = C36431kI.A1I(new AnonymousClass7L5(this));
        View.inflate(context, R.layout.f9nameremoved, this);
    }

    private final void setContactName(AnonymousClass3SF r3, AnonymousClass141 r4) {
        String A0L = getWaContactNames().A0L(r4);
        if (A0L != null) {
            r3.A09((List) null, A0L);
        }
    }

    /* access modifiers changed from: private */
    public final void setLoadingVisibility(boolean z) {
        getLoadingSpinnerViewStub().A03(C36351kA.A00(z ? 1 : 0));
    }

    private final void setStatus(C61953Ed r4, View view) {
        boolean z;
        WDSProfilePhoto wDSProfilePhoto = (WDSProfilePhoto) view.findViewById(R.id.suggested_contacts_list_item_photo);
        if (r4 == null || r4.A01 <= 0 || !r4.A00()) {
            z = false;
        } else {
            wDSProfilePhoto.setProfileStatus(new AnonymousClass5QJ(AnonymousClass5TU.UNSEEN));
            z = true;
        }
        wDSProfilePhoto.setStatusIndicatorEnabled(z);
    }

    public final ConversationsSuggestedContactsViewModel getViewModel() {
        return this.A04;
    }

    public void onAttachedToWindow() {
        ConversationsSuggestedContactsViewModel conversationsSuggestedContactsViewModel;
        AnonymousClass016 A002;
        StatusesViewModel statusesViewModel;
        C001700s r2;
        super.onAttachedToWindow();
        AnonymousClass016 A003 = AnonymousClass0QE.A00(this);
        if (A003 != null) {
            this.A04 = (ConversationsSuggestedContactsViewModel) C36441kJ.A0b(A003).A00(ConversationsSuggestedContactsViewModel.class);
            AnonymousClass012 A004 = AnonymousClass0QD.A00(this);
            if (A004 != null) {
                ConversationsSuggestedContactsViewModel conversationsSuggestedContactsViewModel2 = this.A04;
                if (conversationsSuggestedContactsViewModel2 != null) {
                    setupObservers(conversationsSuggestedContactsViewModel2, A004);
                } else {
                    return;
                }
            }
        }
        if (this.A0A == null && (A002 = AnonymousClass0QE.A00(this)) != null) {
            this.A0A = C68073bI.A00(A002, getStatusesViewModelFactory(), true);
            AnonymousClass012 A005 = AnonymousClass0QD.A00(this);
            if (!(A005 == null || (statusesViewModel = this.A0A) == null || (r2 = statusesViewModel.A04) == null)) {
                C165177t0.A00(A005, r2, AnonymousClass5X0.A02(this, 28), 9);
            }
        }
        if (this.A0D && (conversationsSuggestedContactsViewModel = this.A04) != null) {
            conversationsSuggestedContactsViewModel.A0T();
        }
    }

    public final void setSuggestionsVisibility(boolean z) {
        getSuggestedContactsContainer().setVisibility(C36351kA.A00(z ? 1 : 0));
    }

    public static final void setupObservers$lambda$2(C006302t r0, Object obj) {
        C90484aE.A1L(r0, obj);
    }

    public static final void setupObservers$lambda$3(C006302t r0, Object obj) {
        C90484aE.A1L(r0, obj);
    }

    public static final void setupObservers$lambda$4(C006302t r0, Object obj) {
        C90484aE.A1L(r0, obj);
    }

    public static final void setupStatusViewModel$lambda$8$lambda$7$lambda$6(C006302t r0, Object obj) {
        C90484aE.A1L(r0, obj);
    }
}
