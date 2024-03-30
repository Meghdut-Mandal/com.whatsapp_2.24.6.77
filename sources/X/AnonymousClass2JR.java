package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.conversation.CommentsBottomSheet;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2JR  reason: invalid class name */
public final class AnonymousClass2JR extends C70813fl {
    public final C70803fk A00;
    public final C43642Jg A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2JR(X.AnonymousClass3C3 r4, X.C70803fk r5, X.C43642Jg r6) {
        /*
            r3 = this;
            r0 = 1
            X.C36321k7.A16(r4, r5, r6, r0)
            X.4Q2[] r2 = new X.AnonymousClass4Q2[r0]
            X.155 r0 = X.C70803fk.A0B(r5)
            X.AnonymousClass00C.A08(r0)
            X.2JQ r1 = r4.A00(r0)
            r0 = 0
            r2[r0] = r1
            r3.<init>(r2)
            r3.A00 = r5
            r3.A01 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2JR.<init>(X.3C3, X.3fk, X.2Jg):void");
    }

    public boolean B73(AnonymousClass4Q1 r24, Collection collection, int i) {
        C44072La r1;
        String str;
        Object obj;
        Collection collection2 = collection;
        AnonymousClass00C.A0D(collection2, 1);
        int i2 = i;
        if (i2 == 1) {
            C43732Jp r2 = this.A01.A05;
            AnonymousClass3T1 A0S = C36421kH.A0S(collection2);
            C70803fk r12 = this.A00;
            AnonymousClass00C.A0D(A0S, 0);
            if (r2.A00.A00(A0S)) {
                AnonymousClass11F r3 = r12.A45;
                AnonymousClass155 A0B = C70803fk.A0B(r12);
                AnonymousClass00C.A08(A0B);
                if (r3 == null) {
                    Log.i("Unable to launch bottom sheet due to null chatJid");
                    return true;
                }
                Bundle A07 = AnonymousClass001.A07();
                AnonymousClass3UJ.A08(A07, A0S.A1J);
                C36371kC.A1B(A07, r3);
                CommentsBottomSheet commentsBottomSheet = new CommentsBottomSheet();
                commentsBottomSheet.A17(A07);
                A0B.Btm(commentsBottomSheet);
                return true;
            } else if (r12.A2t.A0U()) {
                AnonymousClass155 A0B2 = C70803fk.A0B(r12);
                AnonymousClass00C.A08(A0B2);
                r2.A02(A0B2, A0S);
                return true;
            } else {
                r12.A2x.A0a(A0S);
                return true;
            }
        } else if (i2 == 9) {
            return this.A01.A03.A02(this.A00, C36421kH.A0S(collection2));
        } else if (i2 == 12) {
            C43742Jq r22 = this.A01.A04;
            AnonymousClass3T1 A0S2 = C36421kH.A0S(collection2);
            AnonymousClass155 A0B3 = C70803fk.A0B(this.A00);
            AnonymousClass00C.A08(A0B3);
            return r22.A02(A0B3, A0S2);
        } else if (i2 == 15) {
            C43812Jx r5 = this.A01.A06;
            AnonymousClass3T1 A0S3 = C36421kH.A0S(collection2);
            C70803fk r13 = this.A00;
            AnonymousClass00C.A0D(A0S3, 0);
            AnonymousClass155 A0B4 = C70803fk.A0B(r13);
            AnonymousClass00C.A08(A0B4);
            C83814Av r9 = new C83814Av(r13);
            AnonymousClass11F r6 = A0S3.A1J.A00;
            if (r6 == null) {
                return false;
            }
            r5.A01.A07().A0A(new C79553tu(A0B4, r5, r6, A0S3, "message_menu", r9));
            return true;
        } else if (i2 == 26) {
            C43792Jv r14 = this.A01.A08;
            AnonymousClass3T1 A0S4 = C36421kH.A0S(collection2);
            AnonymousClass00C.A0D(A0S4, 0);
            if (!(A0S4 instanceof C46812bi)) {
                C36321k7.A1J(A0S4, "TranscribeSelectionAction called on non-audio message ", AnonymousClass000.A0u());
                return false;
            }
            r14.A01.A0A((C46812bi) A0S4);
            return true;
        } else if (i2 == 28) {
            AnonymousClass2K2 r92 = this.A01.A02;
            AnonymousClass3T1 A0S5 = C36421kH.A0S(collection2);
            C70803fk r8 = this.A00;
            AnonymousClass00C.A0D(A0S5, 0);
            AnonymousClass11F r15 = A0S5.A1J.A00;
            if (!(r15 instanceof AnonymousClass147)) {
                return false;
            }
            AnonymousClass155 A0B5 = C70803fk.A0B(r8);
            AnonymousClass00C.A08(A0B5);
            AnonymousClass147 A02 = r92.A03.A02((AnonymousClass147) r15);
            String A0D = r92.A05.A0D(A02);
            A0B5.A3G(A0B5.getString(R.string.f12nameremoved));
            String A0x = C36351kA.A0x(A0B5, A0D, new Object[1], 0, R.string.f12nameremoved);
            String valueOf = String.valueOf(A0S5.A0b());
            List emptyList = Collections.emptyList();
            AnonymousClass00C.A08(emptyList);
            C20350xQ r132 = r92.A09;
            AnonymousClass146 A0P = r132.A0P();
            r132.A15.add(A0P);
            AnonymousClass3FK r0 = new AnonymousClass3FK(A0P);
            r0.A03 = A0x;
            r0.A02 = valueOf;
            r0.A04 = emptyList;
            r0.A01 = A02;
            r0.A08 = true;
            AnonymousClass3B9 A002 = r0.A00();
            C19970wo r10 = r92.A04;
            C46202Vl r7 = new C46202Vl(r8, r92, r10, r92.A06, r92.A07, r132, A002, r92.A0B);
            C20810yC r32 = r92.A08;
            new C76873pa(r92.A00, r92.A02, r10, r32, r132, r7, r7.A00, r92.A0A).A01();
            return true;
        } else if (i2 == 31) {
            AnonymousClass2K4 r52 = this.A01.A07;
            AnonymousClass3T1 A0S6 = C36421kH.A0S(collection2);
            AnonymousClass155 A0B6 = C70803fk.A0B(this.A00);
            AnonymousClass00C.A08(A0B6);
            AnonymousClass00C.A0D(A0S6, 0);
            AnonymousClass11F r02 = A0S6.A1J.A00;
            if (r02 == null) {
                return false;
            }
            r52.A04.A00(1, r02.getRawString());
            A0B6.Btm(r52.A03.A00(A0S6));
            return true;
        } else if (i2 == 34) {
            C43832Jz r53 = this.A01.A00;
            AnonymousClass3T1 A0S7 = C36421kH.A0S(collection2);
            AnonymousClass00C.A0D(A0S7, 0);
            ClipboardManager A09 = r53.A01.A09();
            if (A09 != null) {
                C65073Qp A092 = r53.A03.A09(A0S7.A1J.A00, false);
                if (!(A092 instanceof C44072La) || (r1 = (C44072La) A092) == null || (str = r1.A0J) == null) {
                    return true;
                }
                long j = A0S7.A1O;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("https://whatsapp.com/channel/");
                A0u.append(str);
                A0u.append('/');
                String A11 = C36411kG.A11(A0u, j);
                try {
                    A09.setPrimaryClip(ClipData.newPlainText(A11, A11));
                    r53.A00.A06(R.string.f12nameremoved, 0);
                    obj = AnonymousClass0AJ.A00;
                } catch (Throwable th) {
                    obj = new AnonymousClass03N(th);
                }
                if (AnonymousClass0AK.A00(obj) == null) {
                    return true;
                }
            }
            r53.A00.A06(R.string.f12nameremoved, 0);
            return true;
        } else if (i2 != 35) {
            return super.B73(r24, collection2, i2);
        } else {
            AnonymousClass155 A0B7 = C70803fk.A0B(this.A00);
            AnonymousClass00C.A08(A0B7);
            AnonymousClass3T1 A0S8 = C36421kH.A0S(collection2);
            AnonymousClass00C.A0D(A0S8, 1);
            A0B7.startActivity(AnonymousClass190.A0u(A0B7, A0S8.A0L()));
            return true;
        }
    }
}
