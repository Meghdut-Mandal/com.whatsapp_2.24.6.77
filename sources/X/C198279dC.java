package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9dC  reason: invalid class name and case insensitive filesystem */
public class C198279dC {
    public final Context A00;
    public final AnonymousClass17Y A01;
    public final C29221Vu A02;
    public final C29121Vk A03;
    public final AnonymousClass9SJ A04;
    public final AnonymousClass9SR A05;
    public final C200049gU A06;
    public final C196039Xk A07;
    public final C198799eD A08;
    public final C29131Vl A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final List A0D;

    public static void A00(C198279dC r18, C194449Pt r19, C194739Ra r20, String str) {
        C198279dC r3 = r18;
        AnonymousClass9SJ r4 = r3.A04;
        List list = r3.A0D;
        C194449Pt r2 = r19;
        C194919Rt r7 = new C194919Rt(new AEN(r3, r2, r20));
        boolean equals = "token".equals(r2.A00.A03);
        String str2 = str;
        if (equals) {
            C19770wU r1 = r4.A05;
            C117705mh r9 = r4.A03;
            C24601Db r5 = r4.A01;
            C111495cN r10 = r4.A04;
            C29121Vk r6 = r4.A02;
            C19600wD r42 = r4.A00;
            C36391kE.A1Q(new AnonymousClass8g1(r42, r5, r6, r7, (B1H) null, r9, r10, list, 0), r1);
            ArrayList A0I = AnonymousClass001.A0I();
            C36341k9.A1H("fbpay_pin", str2, A0I);
            C36391kE.A1Q(new AnonymousClass8g1(r42, r5, r6, r7, (B1H) null, r9, r10, A0I, 1), r1);
            return;
        }
        r7.A00(1, str2);
        C19770wU r32 = r4.A05;
        C117705mh r22 = r4.A03;
        C24601Db r14 = r4.A01;
        C111495cN r12 = r4.A04;
        C29121Vk r15 = r4.A02;
        C36391kE.A1Q(new AnonymousClass8g1(r4.A00, r14, r15, (C194919Rt) null, new C203709ob(r7, r4, 0), r22, r12, list, -1), r32);
    }

    public C198279dC(Context context, AnonymousClass17Y r14, C19730wQ r15, C19970wo r16, C29221Vu r17, C29121Vk r18, AnonymousClass9SJ r19, C200049gU r20, C196039Xk r21, C29131Vl r22, String str, String str2, String str3, List list) {
        String str4 = str2;
        String str5 = str3;
        C18740tg.A0B((TextUtils.isEmpty(str4) ^ true) != C36421kH.A1a(str5) ? false : true);
        this.A00 = context;
        this.A01 = r14;
        this.A04 = r19;
        this.A09 = r22;
        this.A07 = r21;
        C29121Vk r9 = r18;
        this.A03 = r9;
        C29221Vu r8 = r17;
        this.A02 = r8;
        C200049gU r10 = r20;
        this.A06 = r10;
        this.A08 = new C198799eD(r15, r16, r9);
        this.A05 = new AnonymousClass9SR(context, r14, r8, r9, r10, "PIN");
        this.A0A = str;
        this.A0D = list;
        this.A0B = str4;
        this.A0C = str5;
    }
}
