package X;

import android.content.Context;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8lZ  reason: invalid class name and case insensitive filesystem */
public final class C180318lZ extends C167797yq {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C180318lZ(Bundle bundle, AnonymousClass17Y r4, C19730wQ r5, AnonymousClass1KK r6, AnonymousClass1NG r7, AnonymousClass16D r8, C21060yb r9, C19970wo r10, C19630wG r11, C18820ts r12, C20310xM r13, AnonymousClass1FF r14, AnonymousClass1VZ r15, C24881Ed r16, AnonymousClass16T r17, AnonymousClass16S r18, C25251Fo r19, AnonymousClass1EZ r20, C24601Db r21, AnonymousClass1DR r22, AnonymousClass1EV r23, AnonymousClass1EU r24, AnonymousClass1XC r25, AnonymousClass6PS r26, C23075B3f b3f, AnonymousClass1YQ r28, AnonymousClass39O r29, C199849g7 r30, C200899iR r31, AnonymousClass1FR r32, C19770wU r33) {
        super(bundle, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, b3f, r28, r29, r30, r31, r32, r33);
        AnonymousClass00C.A0D(r29, 14);
    }

    public void A0g(List list) {
        C202319lY r0;
        UserJid userJid;
        C202319lY r11;
        C202319lY r4;
        A0f(list);
        ArrayList A0I = AnonymousClass001.A0I();
        C180118lE A0U = A0U();
        if (A0U != null) {
            A0I.add(A0U);
        }
        C193689Ml r02 = this.A06;
        if (!(r02 == null || (r4 = r02.A01) == null)) {
            C180118lE r2 = new C180118lE();
            Context context = this.A0P.A00;
            C167797yq.A01(context, r2, R.string.f12nameremoved);
            r2.A03 = context.getString(this.A0g.A0C(r4));
            A0I.add(r2);
        }
        C193689Ml r03 = this.A06;
        if (!(r03 == null || (r11 = r03.A01) == null)) {
            C180118lE r6 = new C180118lE();
            Context context2 = this.A0P.A00;
            C167797yq.A01(context2, r6, R.string.f12nameremoved);
            Object[] A0L = AnonymousClass001.A0L();
            C18820ts r8 = this.A0Q;
            C19970wo r9 = this.A0O;
            String A05 = C20040wv.A05(r8, r9.A08(r11.A06));
            AnonymousClass00C.A07(r8);
            r6.A03 = C36391kE.A0v(context2, AnonymousClass6XI.A03(r8, A05, C165607th.A0q(r9, r8, r11.A06)), A0L, 0, R.string.f12nameremoved);
            A0I.add(r6);
        }
        if (C36411kG.A1a(A0I)) {
            C167797yq.A05(list);
            Iterator it = A0I.iterator();
            while (it.hasNext()) {
                list.add(it.next());
                C167797yq.A04(list);
            }
        }
        AnonymousClass1EV r3 = this.A0X;
        if (r3.A0C()) {
            C180098lC r1 = new C180098lC();
            r1.A02 = "";
            list.add(r1);
            C167797yq.A04(list);
            C180068l9 r22 = new C180068l9();
            r22.A01 = true;
            r22.A00 = new AnonymousClass9v0(this, 34);
            list.add(r22);
        }
        C167797yq.A04(list);
        C180098lC r62 = new C180098lC();
        if (r3.A0C()) {
            r62.A00 = "756694756131577";
            r62.A01 = "p2m-lite-learn-more-link";
        } else {
            C19630wG r7 = this.A0P;
            Context context3 = r7.A00;
            Object[] A0L2 = AnonymousClass001.A0L();
            C193689Ml r04 = this.A06;
            String str = null;
            if (!(r04 == null || (r0 = r04.A01) == null || (userJid = r0.A0D) == null)) {
                AnonymousClass141 A0D = this.A0M.A0D(userJid);
                String A0J = A0D.A0J();
                if (A0J == null || !(!AnonymousClass098.A06(A0J))) {
                    String A0K = A0D.A0K();
                    str = (A0K == null || !(AnonymousClass098.A06(A0K) ^ true)) ? r7.A01(R.string.f12nameremoved) : A0D.A0K();
                } else {
                    str = A0D.A0J();
                }
            }
            r62.A02 = C36391kE.A0v(context3, str, A0L2, 0, R.string.f12nameremoved);
        }
        list.add(r62);
    }
}
