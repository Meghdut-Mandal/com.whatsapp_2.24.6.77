package X;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import java.util.Locale;

/* renamed from: X.2ML  reason: invalid class name */
public class AnonymousClass2ML extends C38771pt {
    public AnonymousClass17Y A00;
    public C19970wo A01;
    public C18820ts A02;
    public AnonymousClass1H2 A03;
    public C29541Xa A04;
    public C29581Xe A05;
    public final LinearLayout A06 = ((LinearLayout) C36361kB.A0F(this, R.id.chat_info_event_container));
    public final AnonymousClass1RJ A07 = C36341k9.A0Y(this, R.id.chat_info_event_response_status);
    public final TextEmojiLabel A08 = C36361kB.A0R(this, R.id.chat_info_event_name);
    public final WaTextView A09 = C36351kA.A0Q(this, R.id.chat_info_event_date);
    public final WaTextView A0A = C36351kA.A0Q(this, R.id.chat_info_event_day);
    public final WaTextView A0B = C36351kA.A0Q(this, R.id.chat_info_event_location);
    public final WaTextView A0C = C36351kA.A0Q(this, R.id.chat_info_event_month);

    public final void A00(AnonymousClass2bT r4, boolean z) {
        AnonymousClass00C.A0D(r4, 0);
        String A022 = getEventMessageManager().A02(r4);
        if (A022 != null) {
            WaTextView waTextView = this.A0B;
            waTextView.setText(A022);
            waTextView.setVisibility(0);
            return;
        }
        WaTextView waTextView2 = this.A0B;
        int i = 8;
        if (z) {
            i = 4;
        }
        waTextView2.setVisibility(i);
    }

    public final void setEmojiLoader(AnonymousClass1H2 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    public final void setEventMessageManager(C29541Xa r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A04 = r2;
    }

    public final void setEventName(AnonymousClass2bT r6) {
        AnonymousClass00C.A0D(r6, 0);
        TextEmojiLabel textEmojiLabel = this.A08;
        textEmojiLabel.setText(AnonymousClass3UG.A03(textEmojiLabel.getContext(), textEmojiLabel.getPaint(), getEmojiLoader(), C36441kJ.A0P(r6.A05)));
    }

    public final void setEventType(C51522nx r5) {
        WaTextView waTextView;
        int A052;
        int A062 = C36431kI.A06(r5, 0);
        if (A062 == 0 || A062 == 2) {
            C36331k8.A0r(getContext(), this.A0C, R.color.f6nameremoved);
            waTextView = this.A0A;
            A052 = C36381kD.A05(this, R.color.f6nameremoved);
        } else if (A062 == 1) {
            C36321k7.A0M(C36371kC.A0B(this), this.A0C, R.attr.f4nameremoved, R.color.f6nameremoved);
            waTextView = this.A0A;
            A052 = C36351kA.A01(C36371kC.A0B(this), R.attr.f4nameremoved, R.color.f6nameremoved);
        } else {
            return;
        }
        waTextView.setTextColor(A052);
    }

    public final void setEventUtils(C29581Xe r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A05 = r2;
    }

    public final void setGlobalUI(AnonymousClass17Y r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setResponseStatus(AnonymousClass2bT r4) {
        AnonymousClass00C.A0D(r4, 0);
        getEventUtils().A00(r4, "ChatInfoEventLayout", C53102qm.A02(this, 26));
    }

    public final void setTime(C19970wo r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setWhatsAppLocale(C18820ts r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public static /* synthetic */ void setEventLocation$default(AnonymousClass2ML r1, AnonymousClass2bT r2, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            r1.A00(r2, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setEventLocation");
    }

    public static /* synthetic */ void setOnClickListener$default(AnonymousClass2ML r1, AnonymousClass2bT r2, C51282nZ r3, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                r3 = C51282nZ.NONE;
            }
            r1.setOnClickListener(r2, r3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOnClickListener");
    }

    public final AnonymousClass1H2 getEmojiLoader() {
        AnonymousClass1H2 r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("emojiLoader");
    }

    public final C29541Xa getEventMessageManager() {
        C29541Xa r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("eventMessageManager");
    }

    public final C29581Xe getEventUtils() {
        C29581Xe r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("eventUtils");
    }

    public final AnonymousClass17Y getGlobalUI() {
        AnonymousClass17Y r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A06();
    }

    public final C19970wo getTime() {
        C19970wo r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("time");
    }

    public final C18820ts getWhatsAppLocale() {
        C18820ts r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A09();
    }

    public AnonymousClass2ML(Context context) {
        super(context);
        View.inflate(context, R.layout.f9nameremoved, this);
        C36321k7.A0N(this);
    }

    public final LinearLayout getEventContainer() {
        return this.A06;
    }

    public final void setAbbreviatedDate(long j) {
        Locale A0x = C36401kF.A0x(getWhatsAppLocale());
        String A0o = C36361kB.A0o(DateFormat.getBestDateTimePattern(A0x, "MMM"), A0x, j);
        AnonymousClass00C.A08(A0o);
        C18820ts whatsAppLocale = getWhatsAppLocale();
        String A0o2 = C36361kB.A0o(whatsAppLocale.A0A(167), C36401kF.A0x(whatsAppLocale), j);
        AnonymousClass00C.A08(A0o2);
        WaTextView waTextView = this.A0C;
        String upperCase = A0o.toUpperCase(Locale.ROOT);
        AnonymousClass00C.A08(upperCase);
        waTextView.setText(upperCase);
        this.A0A.setText(A0o2);
    }

    public final void setEventDate(long j) {
        String A022 = AnonymousClass3UY.A02(getTime(), getWhatsAppLocale(), j);
        AnonymousClass00C.A08(A022);
        String A002 = AnonymousClass3UM.A00(getWhatsAppLocale(), j);
        WaTextView waTextView = this.A09;
        C18820ts whatsAppLocale = getWhatsAppLocale();
        Context context = getContext();
        Object[] A0M = AnonymousClass001.A0M();
        C36331k8.A1N(A022, A002, A0M);
        String string = context.getString(R.string.f12nameremoved, A0M);
        AnonymousClass00C.A08(string);
        waTextView.setText(AnonymousClass3UM.A01(whatsAppLocale, string, j));
    }

    public final void setOnClickListener(AnonymousClass2bT r3, C51282nZ r4) {
        C36321k7.A0w(r3, r4);
        C48932iI.A00(this.A06, r4, r3, this, 19);
    }
}
