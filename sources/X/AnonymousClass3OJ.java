package X;

import android.view.ViewGroup;
import android.widget.ScrollView;
import com.whatsapp.status.widget.StatusEditText;
import com.whatsapp.util.Log;

/* renamed from: X.3OJ  reason: invalid class name */
public class AnonymousClass3OJ {
    public int A00;
    public AnonymousClass2g6 A01 = null;
    public AnonymousClass005 A02;
    public String A03;
    public boolean A04 = false;
    public boolean A05;
    public final ViewGroup A06;
    public final ScrollView A07;
    public final C001700s A08;
    public final C195119So A09;
    public final C39471sS A0A;
    public final C21060yb A0B;
    public final AnonymousClass1N0 A0C;
    public final AnonymousClass1H2 A0D;
    public final AnonymousClass11F A0E;
    public final AnonymousClass1DU A0F;
    public final AnonymousClass1XS A0G;
    public final C19890wg A0H;
    public final AnonymousClass9R1 A0I;
    public final C29561Xc A0J;
    public final C29731Xt A0K;
    public final StatusEditText A0L;
    public final C61643Cw A0M;
    public final C146646vw A0N;

    public static int A00(CharSequence charSequence, int i, int i2) {
        int i3 = 0;
        if (charSequence == null) {
            Log.e("textstatus/linecount/str-null");
        } else {
            int length = charSequence.length();
            if (i < 0 || i2 > length || i > i2) {
                throw new IndexOutOfBoundsException();
            }
            while (i < i2) {
                if (charSequence.charAt(i) == 10) {
                    i3++;
                }
                i++;
            }
        }
        return i3;
    }

    public AnonymousClass3OJ(ViewGroup viewGroup, ScrollView scrollView, C001700s r4, C195119So r5, C39471sS r6, C21060yb r7, AnonymousClass1N0 r8, AnonymousClass1H2 r9, AnonymousClass11F r10, AnonymousClass1DU r11, AnonymousClass1XS r12, C19890wg r13, AnonymousClass9R1 r14, C29561Xc r15, C29731Xt r16, StatusEditText statusEditText, C61643Cw r18, C146646vw r19) {
        this.A0F = r11;
        this.A0D = r9;
        this.A0G = r12;
        this.A0B = r7;
        this.A09 = r5;
        this.A0J = r15;
        this.A0E = r10;
        this.A06 = viewGroup;
        this.A0I = r14;
        this.A0C = r8;
        this.A0L = statusEditText;
        this.A0M = r18;
        this.A0A = r6;
        this.A08 = r4;
        this.A0H = r13;
        this.A07 = scrollView;
        this.A0N = r19;
        this.A0K = r16;
    }
}
