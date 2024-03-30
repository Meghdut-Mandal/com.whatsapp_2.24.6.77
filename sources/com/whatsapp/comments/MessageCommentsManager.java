package com.whatsapp.comments;

import X.AnonymousClass00C;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AO;
import X.AnonymousClass16J;
import X.AnonymousClass1A1;
import X.AnonymousClass1FZ;
import X.AnonymousClass2bB;
import X.AnonymousClass2bC;
import X.AnonymousClass2bK;
import X.AnonymousClass3T1;
import X.AnonymousClass8N8;
import X.AnonymousClass8NL;
import X.AnonymousClass8SU;
import X.AnonymousClass8SX;
import X.AnonymousClass9XS;
import X.C005502l;
import X.C007103b;
import X.C023509x;
import X.C173348Ri;
import X.C195759Vv;
import X.C19700wN;
import X.C19730wQ;
import X.C19770wU;
import X.C20310xM;
import X.C20800yB;
import X.C20810yC;
import X.C21000yV;
import X.C24561Cx;
import X.C25111Fa;
import X.C25121Fb;
import X.C25301Ft;
import X.C25311Fu;
import X.C26191Jf;
import X.C29911Yl;
import X.C63663Kx;
import X.C64933Qa;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Set;

public final class MessageCommentsManager implements C29911Yl {
    public static final Set A0D;
    public final C19730wQ A00;
    public final AnonymousClass16J A01;
    public final C26191Jf A02;
    public final AnonymousClass1A1 A03;
    public final C19770wU A04;
    public final C19700wN A05;
    public final C20310xM A06;
    public final AnonymousClass1FZ A07;
    public final C24561Cx A08;
    public final C25301Ft A09;
    public final C20810yC A0A;
    public final C25121Fb A0B;
    public final C005502l A0C;

    public MessageCommentsManager(C19700wN r2, C19730wQ r3, C20310xM r4, AnonymousClass1FZ r5, C24561Cx r6, AnonymousClass16J r7, C25301Ft r8, C20810yC r9, C25121Fb r10, C26191Jf r11, AnonymousClass1A1 r12, C19770wU r13, C005502l r14) {
        AnonymousClass00C.A0D(r9, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r3, 3);
        AnonymousClass00C.A0D(r13, 4);
        AnonymousClass00C.A0D(r12, 5);
        AnonymousClass00C.A0D(r7, 6);
        AnonymousClass00C.A0D(r8, 7);
        AnonymousClass00C.A0D(r6, 9);
        AnonymousClass00C.A0D(r4, 10);
        AnonymousClass00C.A0D(r10, 11);
        AnonymousClass00C.A0D(r5, 12);
        AnonymousClass00C.A0D(r14, 13);
        this.A0A = r9;
        this.A05 = r2;
        this.A00 = r3;
        this.A04 = r13;
        this.A03 = r12;
        this.A01 = r7;
        this.A09 = r8;
        this.A02 = r11;
        this.A08 = r6;
        this.A06 = r4;
        this.A0B = r10;
        this.A07 = r5;
        this.A0C = r14;
    }

    public void Bll(AnonymousClass3T1 r7, byte[] bArr) {
        C195759Vv A012;
        if (r7.A1T(EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING)) {
            boolean A013 = C20800yB.A01(C21000yV.A01, this.A0A, 5141);
            C63663Kx A0P = r7.A0P();
            if (A0P == null || (A012 = A0P.A01()) == null) {
                throw new C25311Fu(0, (String) null);
            }
            AnonymousClass3T1 A032 = this.A03.A03(A012.A01);
            if (A032 == null) {
                BJX(r7, bArr);
                return;
            }
            if (!A032.A1R(16)) {
                A032.A0h(16);
                this.A06.A0k(A032);
            }
            if (!(r7 instanceof AnonymousClass2bK) || A013) {
                r7.A0u(new AnonymousClass2bB(new C195759Vv(A032.A0L(), A032.A1J), A032.A1N));
                return;
            }
            r7.A0u((C63663Kx) null);
        }
    }

    public void Blm(AnonymousClass8SU r4, AnonymousClass3T1 r5) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass8SX r0 = r4.message_;
        if (r0 == null) {
            r0 = AnonymousClass8SX.DEFAULT_INSTANCE;
        }
        AnonymousClass8NL r2 = (AnonymousClass8NL) r0.A0q();
        AnonymousClass8N8 r1 = (AnonymousClass8N8) C173348Ri.DEFAULT_INSTANCE.A0p();
        r1.A0U(r4.messageSecret_);
        r2.A0j((C173348Ri) r1.A0R());
        Bll(r5, r2.A0R().A0o());
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A00(X.AnonymousClass3T1 r11, X.C023509x r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X.C82763zE
            if (r0 == 0) goto L_0x0083
            r6 = r12
            X.3zE r6 = (X.C82763zE) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0083
            int r2 = r2 - r1
            r6.label = r2
        L_0x0012:
            java.lang.Object r2 = r6.result
            X.0AO r5 = X.AnonymousClass0AO.COROUTINE_SUSPENDED
            int r0 = r6.label
            r7 = 1
            r4 = 0
            if (r0 == 0) goto L_0x003a
            if (r0 != r7) goto L_0x0089
            java.lang.Object r9 = r6.L$1
            X.3Kx r9 = (X.C63663Kx) r9
            java.lang.Object r1 = r6.L$0
            com.whatsapp.comments.MessageCommentsManager r1 = (com.whatsapp.comments.MessageCommentsManager) r1
            X.AnonymousClass0AN.A00(r2)
        L_0x0029:
            X.1A1 r1 = r1.A03
            if (r9 == 0) goto L_0x0035
            X.9Vv r0 = r9.A01()
            if (r0 == 0) goto L_0x0035
            X.3Qa r4 = r0.A01
        L_0x0035:
            X.3T1 r0 = r1.A03(r4)
            return r0
        L_0x003a:
            X.AnonymousClass0AN.A00(r2)
            X.3Kx r8 = r11.A0P()
            X.1Fb r3 = r10.A0B
            java.util.Set r2 = A0D
            r1 = 0
            X.3IP r0 = new X.3IP
            r0.<init>(r2, r1)
            r3.A00(r0, r11)
            X.3Kx r9 = r11.A0P()
            if (r8 != 0) goto L_0x0077
            if (r9 == 0) goto L_0x0077
            r0 = 40
        L_0x0058:
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r0)
            int r2 = r3.intValue()
            X.02l r1 = r10.A0C
            com.whatsapp.comments.MessageCommentsManager$ensureMessageCommentInfoLoadedForComment$2$1 r0 = new com.whatsapp.comments.MessageCommentsManager$ensureMessageCommentInfoLoadedForComment$2$1
            r0.<init>(r10, r11, r4, r2)
            r6.L$0 = r10
            r6.L$1 = r9
            r6.L$2 = r3
            r6.label = r7
            java.lang.Object r0 = X.AnonymousClass0A2.A00(r6, r1, r0)
            if (r0 != r5) goto L_0x0081
            return r5
        L_0x0077:
            boolean r0 = X.AnonymousClass00C.A0J(r8, r9)
            r1 = r10
            if (r0 != 0) goto L_0x0029
            r0 = 39
            goto L_0x0058
        L_0x0081:
            r1 = r10
            goto L_0x0029
        L_0x0083:
            X.3zE r6 = new X.3zE
            r6.<init>(r10, r12)
            goto L_0x0012
        L_0x0089:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.comments.MessageCommentsManager.A00(X.3T1, X.09x):java.lang.Object");
    }

    static {
        C25111Fa[] values = C25111Fa.values();
        ArrayList arrayList = new ArrayList();
        for (C25111Fa r1 : values) {
            if (r1 != C25111Fa.SKIP_COMMENT_INFO) {
                arrayList.add(r1);
            }
        }
        A0D = C007103b.A0f(arrayList);
    }

    public Object B6f(AnonymousClass3T1 r5, C023509x r6) {
        int A002;
        Object A003;
        C63663Kx A0P = r5.A0P();
        if (A0P == null) {
            this.A07.A01(r5);
        }
        C63663Kx A0P2 = r5.A0P();
        if (A0P2 != null) {
            A002 = A0P2.A00();
        } else {
            A002 = this.A08.A00(r5);
        }
        if (A002 > 0 && r5.A0P() == null) {
            r5.A0u(new AnonymousClass2bC((Long) null, (Long) null, A002));
        }
        if (AnonymousClass00C.A0J(A0P, r5.A0P()) || (A003 = AnonymousClass0A2.A00(r6, this.A0C, new MessageCommentsManager$ensureMessageCommentInfoLoadedForParentMessage$2(this, r5, (C023509x) null))) != AnonymousClass0AO.COROUTINE_SUSPENDED) {
            return AnonymousClass0AJ.A00;
        }
        return A003;
    }

    public void BJX(AnonymousClass3T1 r14, byte[] bArr) {
        C63663Kx A0P = r14.A0P();
        if (!r14.A1T(EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) || A0P == null) {
            Log.e("MessageCommentsManager/handleCommentOrphan/comment message info is null");
            this.A05.A0E("MessageCommentsManager/handleCommentOrphan/comment message info is null", (String) null, true);
            return;
        }
        C195759Vv A012 = A0P.A01();
        if (A012 != null) {
            C64933Qa r4 = r14.A1J;
            AnonymousClass00C.A07(r4);
            if (this.A09.A01(new AnonymousClass9XS(r14.A0J(), A012.A00, r4, A012.A01, (Long) null, bArr, (byte[]) null, 3, 1, r14.A0I)) != 4) {
                Log.e("MessageCommentsManager/handleCommentOrphan/Failed to store orphan message");
                this.A05.A0E("MessageCommentsManager/handleCommentOrphan/Failed to store orphan message", (String) null, true);
                return;
            }
            return;
        }
        Log.e("MessageCommentsManager/handleCommentOrphan/comment message info's parent key is null");
        this.A05.A0E("MessageCommentsManager/handleCommentOrphan/comment message info's parent key is null", (String) null, true);
    }
}
