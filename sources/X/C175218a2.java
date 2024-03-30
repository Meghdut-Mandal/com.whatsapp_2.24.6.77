package X;

import android.content.Context;
import android.widget.ImageView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.8a2  reason: invalid class name and case insensitive filesystem */
public class C175218a2 extends C201679k6 implements AnonymousClass4Q8 {
    public C61953Ed A00;
    public final Context A01;
    public final AnonymousClass1RY A02;
    public final C28251Rx A03;
    public final C18820ts A04;
    public final AnonymousClass1CR A05;
    public final boolean A06;

    public void Bx0(UserJid userJid, C61953Ed r5) {
        AnonymousClass5TU r1;
        this.A00 = r5;
        ImageView imageView = this.A06.A07;
        if (imageView instanceof WDSProfilePhoto) {
            WDSProfilePhoto wDSProfilePhoto = (WDSProfilePhoto) imageView;
            boolean A032 = AnonymousClass3TM.A03(r5, false);
            wDSProfilePhoto.setStatusIndicatorEnabled(A032);
            if (A032) {
                if (r5.A01 > 0) {
                    r1 = AnonymousClass5TU.UNSEEN;
                } else {
                    r1 = AnonymousClass5TU.SEEN;
                }
                wDSProfilePhoto.setProfileStatus(new AnonymousClass5QJ(r1));
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C175218a2(android.content.Context r28, X.C19730wQ r29, X.AnonymousClass1T1 r30, X.AnonymousClass1NG r31, X.AnonymousClass16D r32, X.AnonymousClass171 r33, X.AnonymousClass1RY r34, X.C28251Rx r35, com.whatsapp.conversationslist.ViewHolder r36, X.C21060yb r37, X.C19970wo r38, X.C19630wG r39, X.C18820ts r40, X.C220412q r41, X.AnonymousClass165 r42, X.C20810yC r43, X.C20500xf r44, X.AnonymousClass1EL r45, X.C28371Sj r46, X.AnonymousClass1EV r47, X.AnonymousClass1EU r48, X.AnonymousClass1FR r49, X.AnonymousClass1AW r50, X.AnonymousClass1CR r51, X.C61953Ed r52, X.AnonymousClass1EM r53, X.C65783Tl r54, X.AnonymousClass005 r55, boolean r56) {
        /*
            r27 = this;
            r26 = r55
            r2 = r28
            r3 = r29
            r5 = r31
            r6 = r32
            r7 = r33
            r8 = r35
            r9 = r36
            r10 = r37
            r11 = r38
            r12 = r39
            r4 = r30
            r1 = r27
            r13 = r40
            r14 = r41
            r15 = r42
            r16 = r43
            r17 = r44
            r18 = r45
            r19 = r46
            r20 = r47
            r21 = r48
            r22 = r49
            r23 = r50
            r24 = r53
            r25 = r54
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r1.A01 = r2
            r0 = r52
            r1.A00 = r0
            r0 = r56
            r1.A06 = r0
            r1.A04 = r13
            r0 = r51
            r1.A05 = r0
            r0 = r34
            r1.A02 = r0
            r1.A03 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175218a2.<init>(android.content.Context, X.0wQ, X.1T1, X.1NG, X.16D, X.171, X.1RY, X.1Rx, com.whatsapp.conversationslist.ViewHolder, X.0yb, X.0wo, X.0wG, X.0ts, X.12q, X.165, X.0yC, X.0xf, X.1EL, X.1Sj, X.1EV, X.1EU, X.1FR, X.1AW, X.1CR, X.3Ed, X.1EM, X.3Tl, X.005, boolean):void");
    }
}
