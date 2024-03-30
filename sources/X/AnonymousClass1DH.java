package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.Objects;

/* renamed from: X.1DH  reason: invalid class name */
public class AnonymousClass1DH {
    public final C19730wQ A00;
    public final AnonymousClass1A6 A01;
    public final C19420v0 A02;
    public final C220412q A03;
    public final C21010yW A04;
    public final AnonymousClass1DI A05;
    public final C19770wU A06;

    private void A01(boolean z) {
        C19420v0.A00(this.A02).putBoolean("notify_new_message_for_archived_chats", z).apply();
        C19770wU r3 = this.A06;
        AnonymousClass1DI r2 = this.A05;
        Objects.requireNonNull(r2);
        r3.Boy(new C35691j6(r2, 5));
    }

    public void A03() {
        if (!this.A00.A0L()) {
            C19420v0.A00(this.A02).putBoolean("archive_v2_enabled", true).apply();
            A01(false);
        }
    }

    public void A04(boolean z) {
        C18740tg.A0F(!this.A00.A0L(), "archiveutil/setArchiveModeAndUpdateCompanion only primary can set this setting");
        A01(z);
        C21010yW r2 = this.A04;
        AnonymousClass2NE r1 = new AnonymousClass2NE();
        r1.A00 = Boolean.valueOf(!z);
        r2.Bly(r1);
    }

    public AnonymousClass1DH(C19730wQ r1, AnonymousClass1A6 r2, AnonymousClass1DI r3, C19420v0 r4, C220412q r5, C21010yW r6, C19770wU r7) {
        this.A00 = r1;
        this.A06 = r7;
        this.A03 = r5;
        this.A04 = r6;
        this.A02 = r4;
        this.A01 = r2;
        this.A05 = r3;
    }

    public static void A00(Context context, View view, AnonymousClass1X4 r6, AnonymousClass11F r7, Integer num) {
        C99304t3 A012 = C99304t3.A01(view, context.getString(R.string.f12nameremoved), 0);
        A012.A0Z(context.getString(R.string.f12nameremoved), new C35111iA(r6, r7, num, 0));
        A012.A0X(AnonymousClass00F.A00(context, C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved)));
        TextView textView = (TextView) A012.A0J.findViewById(R.id.snackbar_text);
        textView.setSingleLine(false);
        A012.A0P();
        textView.requestFocus();
    }

    public static boolean A02(C19420v0 r1, C220412q r2, AnonymousClass11F r3) {
        if (!r1.A2F() || r1.A2G() || !r2.A0N(r3)) {
            return false;
        }
        return true;
    }
}
