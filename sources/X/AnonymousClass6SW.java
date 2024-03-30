package X;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.whatsapp.R;
import com.whatsapp.components.RoundCornerProgressBarV2;
import java.util.List;

/* renamed from: X.6SW  reason: invalid class name */
public class AnonymousClass6SW {
    public AnonymousClass3PS A00;
    public AnonymousClass2bS A01;
    public final View A02;
    public final CheckBox A03;
    public final TextView A04;
    public final TextView A05;
    public final ConstraintLayout A06;
    public final C19730wQ A07;
    public final AnonymousClass1X4 A08;
    public final RoundCornerProgressBarV2 A09;
    public final AnonymousClass16D A0A;
    public final AnonymousClass1RY A0B;
    public final C21060yb A0C;
    public final C18820ts A0D;
    public final AnonymousClass1H2 A0E;
    public final C20810yC A0F;
    public final C65493Sh A0G;
    public final C19890wg A0H;
    public final AnonymousClass1RJ A0I;
    public final AnonymousClass1RJ A0J;
    public final AnonymousClass1RJ A0K;
    public final AnonymousClass005 A0L;
    public final boolean A0M;
    public final View A0N;
    public final AnonymousClass005 A0O;

    public static boolean A00(AnonymousClass6SW r3, AnonymousClass3T1 r4) {
        AnonymousClass11F r1 = r4.A1J.A00;
        if (!(r1 instanceof C28981Uw)) {
            return false;
        }
        C18740tg.A06(r4);
        C44072La r0 = (C44072La) ((C220412q) r3.A0O.get()).A09(r1, false);
        if (r0 == null || !r0.A0L() || !r3.A0F.A0E(6382)) {
            return true;
        }
        return false;
    }

    public AnonymousClass6SW(View view, C19730wQ r6, AnonymousClass1X4 r7, AnonymousClass16D r8, AnonymousClass1RY r9, C21060yb r10, C18820ts r11, AnonymousClass1H2 r12, C20810yC r13, C65493Sh r14, C19890wg r15, AnonymousClass005 r16, AnonymousClass005 r17, List list, boolean z) {
        this.A0F = r13;
        this.A0D = r11;
        this.A07 = r6;
        this.A0E = r12;
        this.A08 = r7;
        this.A0A = r8;
        this.A0C = r10;
        this.A0O = r16;
        this.A0G = r14;
        this.A0H = r15;
        this.A0B = r9;
        this.A02 = view;
        this.A0L = r17;
        View A022 = C012005e.A02(view, R.id.poll_option_end_wrapper);
        this.A0N = A022;
        this.A04 = C36391kE.A0O(view, R.id.poll_option_name);
        this.A05 = C36391kE.A0O(view, R.id.poll_option_vote_count);
        this.A09 = (RoundCornerProgressBarV2) C012005e.A02(view, R.id.poll_vote_ratio);
        CheckBox checkBox = (CheckBox) C012005e.A02(view, R.id.poll_option_vote_checkbox);
        this.A03 = checkBox;
        this.A0M = z;
        AnonymousClass3Y5.A00(A022, this, 7);
        this.A0I = C36341k9.A0X(view, R.id.poll_option_vote_first_profile_circle_view);
        this.A0J = C36341k9.A0X(view, R.id.poll_option_vote_first_profile_image_view);
        this.A0K = C36341k9.A0X(view, R.id.poll_option_vote_second_profile_image_view);
        AnonymousClass3YH.A00(checkBox, this, list, 12);
        ConstraintLayout constraintLayout = (ConstraintLayout) C012005e.A02(view, R.id.poll_option_main_layout);
        this.A06 = constraintLayout;
        if (!z) {
            constraintLayout.setFocusableInTouchMode(false);
            constraintLayout.setFocusable(false);
            constraintLayout.setImportantForAccessibility(2);
        }
    }
}
