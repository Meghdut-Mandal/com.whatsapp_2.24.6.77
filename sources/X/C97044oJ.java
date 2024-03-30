package X;

import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.util.Log;

/* renamed from: X.4oJ  reason: invalid class name and case insensitive filesystem */
public class C97044oJ extends AnonymousClass0D3 {
    public AnonymousClass3KV A00;
    public AnonymousClass141 A01;
    public final PopupMenu A02;
    public final AnonymousClass17Y A03;
    public final C19730wQ A04;
    public final WaImageView A05;
    public final AnonymousClass1ND A06;
    public final C19970wo A07;
    public final AnonymousClass1HJ A08;
    public final C20310xM A09;
    public final AnonymousClass1SR A0A;
    public final AnonymousClass1HO A0B;
    public final C26211Jh A0C;
    public final AnonymousClass1YE A0D;
    public final C20810yC A0E;
    public final C237919w A0F;
    public final AnonymousClass1A1 A0G;
    public final C19770wU A0H;
    public final AnonymousClass005 A0I;
    public final AnonymousClass3SF A0J;
    public final WaImageView A0K;
    public final WaTextView A0L;
    public final WaTextView A0M;
    public final ThumbnailButton A0N;
    public final AnonymousClass1RY A0O;

    public static void A00(Context context, C97044oJ r5) {
        String str;
        AnonymousClass3KV r0 = r5.A00;
        if (r0 == null) {
            str = "UpcomingActivityCallViewHolder/openPrecallLobby schedule call null";
        } else {
            AnonymousClass11F r1 = r0.A04;
            C65533Sl r02 = AnonymousClass147.A01;
            AnonymousClass147 A032 = C65533Sl.A03(r1);
            if (A032 == null) {
                str = "UpcomingActivityCallViewHolder/openPrecallLobby group jid is null";
            } else {
                r5.A0H.Bp1(new C1502474n(r5, context, A032, 26));
                return;
            }
        }
        Log.w(str);
    }

    public void A0B(C144176rl r8) {
        C1269866m r3 = r8.A00;
        AnonymousClass141 r2 = r8.A02;
        this.A01 = r2;
        this.A00 = r8.A01;
        this.A0O.A08(this.A0N, r2);
        this.A0M.setText(this.A00.A00());
        this.A0J.A05(r2);
        this.A0L.setText(r3.A01);
        WaImageView waImageView = this.A0K;
        View view = this.A0H;
        C36391kE.A18(view.getContext(), waImageView, r3.A00);
        boolean z = r3.A02;
        PopupMenu popupMenu = this.A02;
        popupMenu.getMenu().clear();
        popupMenu.getMenu().add(0, 0, 1, R.string.f12nameremoved);
        if (z) {
            SpannableString A0O2 = C36441kJ.A0O(view.getContext().getString(R.string.f12nameremoved));
            A0O2.setSpan(new ForegroundColorSpan(-65536), 0, A0O2.length(), 0);
            popupMenu.getMenu().add(0, 1, 2, A0O2);
        }
        popupMenu.setOnMenuItemClickListener(new C136096dl(this));
        C135456cj.A01(this.A05, this, 32);
        C135456cj.A01(view, this, 33);
    }

    public C97044oJ(View view, AnonymousClass17Y r5, C19730wQ r6, AnonymousClass1LI r7, AnonymousClass1ND r8, AnonymousClass1RY r9, C19970wo r10, AnonymousClass1HJ r11, C20310xM r12, AnonymousClass1SR r13, AnonymousClass1HO r14, C26211Jh r15, AnonymousClass1YE r16, C20810yC r17, C237919w r18, AnonymousClass1A1 r19, C19770wU r20, AnonymousClass005 r21) {
        super(view);
        this.A0O = r9;
        this.A07 = r10;
        this.A0E = r17;
        this.A03 = r5;
        this.A04 = r6;
        this.A0H = r20;
        this.A06 = r8;
        this.A0A = r13;
        this.A0G = r19;
        this.A08 = r11;
        this.A0F = r18;
        this.A09 = r12;
        this.A0C = r15;
        this.A0B = r14;
        this.A0D = r16;
        this.A0I = r21;
        this.A0M = C36401kF.A0Q(view, R.id.schedule_call_title);
        this.A0L = C36401kF.A0Q(view, R.id.schedule_call_time_text);
        this.A0K = C36431kI.A0X(view, R.id.call_type_icon);
        this.A0N = (ThumbnailButton) C012005e.A02(view, R.id.contact_photo);
        WaImageView A0X = C36431kI.A0X(view, R.id.context_menu);
        this.A05 = A0X;
        this.A0J = AnonymousClass3SF.A01(view, r7, R.id.schedule_call_group);
        this.A02 = new PopupMenu(view.getContext(), A0X);
    }

    public static boolean A01(MenuItem menuItem, C97044oJ r9) {
        String str;
        Context A0F2 = C36441kJ.A0F(r9);
        if (A0F2 == null) {
            str = "UpcomingActivityCallViewHolder/onPopupMenuItemClickListener context null";
        } else if (r9.A01 == null || r9.A00 == null) {
            str = "UpcomingActivityCallViewHolder/onPopupMenuItemClickListener contact and/or schedule call null";
        } else if (menuItem.getItemId() == 0) {
            A00(A0F2, r9);
            return true;
        } else {
            SpannableString A0O2 = C36441kJ.A0O(A0F2.getString(R.string.f12nameremoved));
            A0O2.setSpan(new ForegroundColorSpan(-65536), 0, A0O2.length(), 0);
            C39001qm A002 = AnonymousClass3LW.A00(A0F2);
            A002.A0q(C36391kE.A0v(A0F2, r9.A00.A00(), new Object[1], 0, R.string.f12nameremoved));
            A002.A0p(C36391kE.A0v(A0F2, r9.A01.A0J(), new Object[1], 0, R.string.f12nameremoved));
            A002.A0r(true);
            A002.A0f((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
            A002.A0i(new C163297py(r9, 21), A0O2);
            C36341k9.A11(A002);
            return true;
        }
        Log.w(str);
        return false;
    }
}
