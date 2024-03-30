package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.events.EventResponseUserView$bind$1;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.1q8  reason: invalid class name and case insensitive filesystem */
public final class C38811q8 extends LinearLayout implements C18700tb {
    public C19730wQ A00;
    public AnonymousClass1Pp A01;
    public AnonymousClass16D A02;
    public AnonymousClass171 A03;
    public C19970wo A04;
    public C18820ts A05;
    public AnonymousClass17X A06;
    public C20480xd A07;
    public AnonymousClass1QZ A08;
    public C005502l A09;
    public C005502l A0A;
    public boolean A0B;
    public final AnonymousClass1RJ A0C;
    public final WDSProfilePhoto A0D;
    public final AnonymousClass040 A0E;
    public final LinearLayout A0F;
    public final TextEmojiLabel A0G;
    public final TextEmojiLabel A0H;
    public final WaTextView A0I;

    public C38811q8(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A0B) {
            this.A0B = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A04 = C36351kA.A0V(A0W);
            this.A00 = C36351kA.A0N(A0W);
            this.A02 = C36341k9.A0R(A0W);
            this.A01 = C36361kB.A0V(A0W);
            this.A03 = C36341k9.A0S(A0W);
            this.A05 = C36341k9.A0T(A0W);
            this.A06 = C36351kA.A0b(A0W);
            this.A07 = A0W.A00.A5L();
            this.A09 = C25141Fd.A00();
            this.A0A = C24291Bw.A00();
        }
        this.A0E = C009403z.A02(getIoDispatcher());
        View.inflate(context, R.layout.f9nameremoved, this);
        C36321k7.A0N(this);
        this.A0D = (WDSProfilePhoto) C36361kB.A0G(this, R.id.event_response_user_picture);
        this.A0G = C36351kA.A0O(this, R.id.event_response_user_name);
        this.A0H = C36351kA.A0O(this, R.id.event_response_secondary_name);
        this.A0I = C36341k9.A0Q(this, R.id.event_response_timestamp);
        this.A0F = (LinearLayout) C36361kB.A0G(this, R.id.event_response_subtitle_row);
        this.A0C = C36341k9.A0X(this, R.id.event_response_user_label);
    }

    public static final void A01(C38811q8 r6, Long l, boolean z) {
        if (!z) {
            WaTextView waTextView = r6.A0I;
            waTextView.setVisibility(0);
            waTextView.setText(R.string.f12nameremoved);
        } else if (l == null) {
            r6.A0I.setVisibility(8);
        } else {
            WaTextView waTextView2 = r6.A0I;
            r6.getTime();
            AnonymousClass3UY.A0H(waTextView2, r6.getTime(), r6.getWhatsAppLocale(), l.longValue());
            waTextView2.setVisibility(0);
        }
    }

    public static /* synthetic */ void getIoDispatcher$annotations() {
    }

    public static /* synthetic */ void getMainDispatcher$annotations() {
    }

    private final void setSecondaryName(String str) {
        if (str == null || str.length() == 0) {
            this.A0H.setVisibility(8);
            return;
        }
        TextEmojiLabel textEmojiLabel = this.A0H;
        textEmojiLabel.setText(str);
        textEmojiLabel.setVisibility(0);
    }

    public static final void setUpContextMenu$lambda$2$lambda$1(C38811q8 r1, View view) {
        AnonymousClass00C.A0D(r1, 0);
        r1.showContextMenu();
    }

    public final void setContactAvatars(AnonymousClass1Pp r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setContactManager(AnonymousClass16D r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setEventResponseContextMenuHelper(C20480xd r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A07 = r2;
    }

    public final void setGroupParticipantsManager(AnonymousClass17X r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A06 = r2;
    }

    public final void setIoDispatcher(C005502l r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A09 = r2;
    }

    public final void setMainDispatcher(C005502l r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0A = r2;
    }

    public final void setMeManager(C19730wQ r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setTime(C19970wo r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A04 = r2;
    }

    public final void setWaContactNames(AnonymousClass171 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    public final void setWhatsAppLocale(C18820ts r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A05 = r2;
    }

    public static final void A00(AnonymousClass3IO r2, C38811q8 r3, Long l) {
        r3.A0G.setText(r2.A00);
        String str = r2.A01;
        if ((str == null || str.length() == 0) && l == null) {
            r3.A0F.setVisibility(8);
            return;
        }
        r3.A0F.setVisibility(0);
        r3.setSecondaryName(str);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A08;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A08 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1Pp getContactAvatars() {
        AnonymousClass1Pp r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("contactAvatars");
    }

    public final AnonymousClass16D getContactManager() {
        AnonymousClass16D r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0Z();
    }

    public final C20480xd getEventResponseContextMenuHelper() {
        C20480xd r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("eventResponseContextMenuHelper");
    }

    public final AnonymousClass17X getGroupParticipantsManager() {
        AnonymousClass17X r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("groupParticipantsManager");
    }

    public final C005502l getIoDispatcher() {
        C005502l r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("ioDispatcher");
    }

    public final C005502l getMainDispatcher() {
        C005502l r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("mainDispatcher");
    }

    public final C19730wQ getMeManager() {
        C19730wQ r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("meManager");
    }

    public final C19970wo getTime() {
        C19970wo r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("time");
    }

    public final AnonymousClass171 getWaContactNames() {
        AnonymousClass171 r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0c();
    }

    public final C18820ts getWhatsAppLocale() {
        C18820ts r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A09();
    }

    private final void setUpContextMenu(AnonymousClass2MU r3) {
        int i;
        boolean z = !((C74283lM) getEventResponseContextMenuHelper()).A01.A0M(r3.A02);
        setClickable(z);
        if (z) {
            setOnCreateContextMenuListener(new C90354a1(r3, this, 1));
            setOnClickListener(new AnonymousClass3Y1(this, 6));
            i = R.drawable.selector_orange_gradient;
        } else {
            i = R.color.f6nameremoved;
        }
        setBackgroundResource(i);
    }

    public static final void setUpContextMenu$lambda$2$lambda$0(C38811q8 r5, AnonymousClass2MU r6, ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C36321k7.A0w(r5, r6);
        if (contextMenu != null) {
            C20480xd eventResponseContextMenuHelper = r5.getEventResponseContextMenuHelper();
            UserJid userJid = r6.A02;
            AnonymousClass155 r2 = (AnonymousClass155) C36391kE.A0E(r5);
            C74283lM r4 = (C74283lM) eventResponseContextMenuHelper;
            AnonymousClass00C.A0D(r2, 2);
            r4.A00.A01(contextMenu, r2, r4.A02.A0D(userJid));
            C65363Rt.A00(contextMenu, r2, userJid);
        }
    }

    public final void A02(AnonymousClass1RY r5, AnonymousClass2MU r6) {
        getContactAvatars().A06(this.A0D, R.drawable.avatar_contact);
        A01(this, r6.A03, true);
        if (r6.A00.ordinal() != 1) {
            this.A0C.A03(8);
        } else {
            AnonymousClass1RJ r2 = this.A0C;
            C36441kJ.A0V(r2).setText(R.string.f12nameremoved);
            r2.A03(0);
        }
        setUpContextMenu(r6);
        C36331k8.A1T(new EventResponseUserView$bind$1(r5, this, r6, (C023509x) null), this.A0E);
    }
}
