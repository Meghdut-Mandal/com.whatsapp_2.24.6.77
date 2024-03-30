package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;

/* renamed from: X.9d5  reason: invalid class name and case insensitive filesystem */
public class C198209d5 {
    public final C19730wQ A00;
    public final C29911Yl A01;
    public final C193379Lf A02;
    public final C20810yC A03;
    public final C25181Fh A04;
    public final C201449jc A05;
    public final C26191Jf A06;
    public final AnonymousClass005 A07;
    public final AnonymousClass005 A08;
    public final C30681ab A09;

    public C198209d5(C19730wQ r1, C29911Yl r2, C193379Lf r3, C20810yC r4, C25181Fh r5, C201449jc r6, C30681ab r7, C26191Jf r8, AnonymousClass005 r9, AnonymousClass005 r10) {
        this.A03 = r4;
        this.A00 = r1;
        this.A06 = r8;
        this.A07 = r9;
        this.A01 = r2;
        this.A04 = r5;
        this.A09 = r7;
        this.A08 = r10;
        this.A05 = r6;
        this.A02 = r3;
    }

    public static boolean A00(AnonymousClass3T1 r5) {
        String str;
        C63663Kx A0P = r5.A0P();
        if (!r5.A1T(EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) || A0P == null) {
            str = "CommentProtobufHelper/commentMessageInfo is null";
        } else {
            Long A042 = A0P.A04();
            if (A042 != null && A042.longValue() > 0) {
                return true;
            }
            str = "CommentProtobufHelper/commentMessageInfo does not have row id populated";
        }
        Log.e(str);
        return false;
    }
}
