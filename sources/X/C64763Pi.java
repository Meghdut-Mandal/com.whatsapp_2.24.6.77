package X;

import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.3Pi  reason: invalid class name and case insensitive filesystem */
public class C64763Pi {
    public AnonymousClass38r A00;
    public Runnable A01;
    public Runnable A02;
    public boolean A03 = false;
    public final View A04;
    public final FrameLayout A05;
    public final FrameLayout A06;
    public final ImageView A07;
    public final TextView A08;
    public final AnonymousClass17Y A09;
    public final AnonymousClass2IQ A0A;
    public final ConversationRowVideo$RowVideoView A0B;
    public final C18820ts A0C;
    public final C181798o3 A0D;
    public final C62683Hc A0E;

    public void A01() {
        C181798o3 r0 = this.A0D;
        C64933Qa r1 = r0.A1J;
        hashCode();
        File A012 = AnonymousClass2bU.A01(r0);
        if (A012 == null || !C36381kD.A1V(Uri.fromFile(A012))) {
            Log.w("conversation/row/video/autoplay/alertVideoFileNotFound/ no file");
            AnonymousClass2IQ.A0R(this.A0A, r1);
            return;
        }
        this.A05.setVisibility(4);
        this.A07.setVisibility(4);
        if (this.A02 == null && this.A01 == null) {
            C80233v4 A002 = C80233v4.A00(this, 21);
            this.A02 = A002;
            this.A09.A0H(A002);
        }
    }

    public C64763Pi(View view, FrameLayout frameLayout, FrameLayout frameLayout2, ImageView imageView, TextView textView, AnonymousClass17Y r7, AnonymousClass2IQ r8, ConversationRowVideo$RowVideoView conversationRowVideo$RowVideoView, C18820ts r10, C181798o3 r11, C62683Hc r12) {
        this.A09 = r7;
        this.A0E = r12;
        this.A04 = view;
        this.A08 = textView;
        this.A07 = imageView;
        this.A05 = frameLayout;
        this.A06 = frameLayout2;
        this.A0D = r11;
        this.A0B = conversationRowVideo$RowVideoView;
        this.A0A = r8;
        this.A0C = r10;
    }

    public static void A00(View view, C64763Pi r1, int i) {
        view.setVisibility(i);
        r1.A08.setVisibility(i);
        r1.A07.setVisibility(i);
        r1.A05.setVisibility(i);
    }

    public void A02(boolean z) {
        hashCode();
        Runnable runnable = this.A02;
        if (runnable != null) {
            this.A09.A0G(runnable);
        }
        Runnable runnable2 = this.A01;
        if (runnable2 != null) {
            this.A09.A0G(runnable2);
        }
        this.A02 = null;
        this.A01 = null;
        AnonymousClass38r r0 = this.A00;
        if (r0 != null) {
            r0.hashCode();
            AnonymousClass38r r1 = this.A00;
            r1.A03.A0R((AnonymousClass4SO) null);
            r1.A01 = null;
            if (z) {
                this.A0E.A02(r1);
                this.A00 = null;
            }
        }
        this.A0B.setVisibility(0);
        A00(this.A04, this, 0);
    }
}
