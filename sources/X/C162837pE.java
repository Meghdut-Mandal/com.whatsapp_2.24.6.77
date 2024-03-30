package X;

import android.location.Location;
import com.whatsapp.location.LocationPicker;
import com.whatsapp.location.LocationPicker2;

/* renamed from: X.7pE  reason: invalid class name and case insensitive filesystem */
public class C162837pE extends C133586Zc {
    public Object A00;
    public Object A01;
    public final int A02 = 1;

    public void onLocationChanged(Location location) {
        C139266jV r2;
        C129186Fs r1;
        if (this.A02 != 0) {
            if (location != null) {
                LocationPicker2 locationPicker2 = (LocationPicker2) this.A01;
                if (locationPicker2.A0W.A05 == null && (r1 = locationPicker2.A02) != null) {
                    r1.A0A(AnonymousClass6UP.A01(C90474aD.A0N(location)));
                }
                if (locationPicker2.A0W.A0i && locationPicker2.A02 != null) {
                    if (locationPicker2.A05 == null) {
                        A0M();
                    }
                    LocationPicker2.A01(C90474aD.A0N(location), locationPicker2);
                }
                if (locationPicker2.A0W.A0h && locationPicker2.A02 != null) {
                    locationPicker2.A02.A09(AnonymousClass6UP.A01(C90474aD.A0N(location)));
                }
                locationPicker2.A0V.A06 = location;
            } else {
                return;
            }
        } else if (location != null) {
            LocationPicker locationPicker = (LocationPicker) this.A01;
            if (locationPicker.A0P.A05 == null && (r2 = locationPicker.A03) != null) {
                C134976bv A012 = C134976bv.A01(location);
                C1264964g r0 = new C1264964g();
                r0.A06 = A012;
                r2.A09(r0);
            }
            if (locationPicker.A0P.A0i && locationPicker.A03 != null) {
                if (locationPicker.A06 == null) {
                    A0M();
                }
                LocationPicker.A01(C134976bv.A01(location), locationPicker);
            }
            if (locationPicker.A0P.A0h && locationPicker.A03 != null) {
                C134976bv A013 = C134976bv.A01(location);
                C139266jV r12 = locationPicker.A03;
                C1264964g r02 = new C1264964g();
                r02.A06 = A013;
                r12.A08(r02);
            }
        } else {
            return;
        }
        super.onLocationChanged(location);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C162837pE(X.C24801Dv r40, X.C19700wN r41, X.C237019m r42, X.AnonymousClass17Y r43, X.C19730wQ r44, X.C20050ww r45, X.AnonymousClass1X4 r46, X.AnonymousClass1Pp r47, X.AnonymousClass185 r48, X.C235618y r49, X.C27761Ps r50, X.C64953Qc r51, X.C21060yb r52, X.C19970wo r53, X.C19630wG r54, X.C20830yE r55, X.C19420v0 r56, X.C18820ts r57, X.C220412q r58, X.AnonymousClass1N0 r59, X.C1261362r r60, X.AnonymousClass6O1 r61, X.AnonymousClass1XN r62, X.AnonymousClass1H2 r63, com.whatsapp.emoji.search.EmojiSearchProvider r64, X.C20810yC r65, X.AnonymousClass13E r66, com.whatsapp.location.LocationPicker2 r67, X.AnonymousClass1P5 r68, X.AnonymousClass2XH r69, X.AnonymousClass6LW r70, com.whatsapp.nativelibloader.WhatsAppLibLoader r71, X.C19890wg r72, X.AnonymousClass1A1 r73, X.C20380xT r74, X.AnonymousClass1N2 r75, X.C19770wU r76) {
        /*
            r39 = this;
            r0 = 1
            r2 = r39
            r2.A02 = r0
            r0 = r67
            r2.A01 = r0
            r29 = r66
            r28 = r65
            r27 = r64
            r26 = r63
            r25 = r62
            r24 = r61
            r23 = r60
            r22 = r59
            r14 = r51
            r30 = r68
            r31 = r69
            r3 = r40
            r32 = r70
            r4 = r41
            r33 = r71
            r5 = r42
            r34 = r72
            r6 = r43
            r35 = r73
            r7 = r44
            r11 = r48
            r36 = r74
            r8 = r45
            r12 = r49
            r37 = r75
            r9 = r46
            r13 = r50
            r38 = r76
            r10 = r47
            r15 = r52
            r16 = r53
            r17 = r54
            r18 = r55
            r19 = r56
            r20 = r57
            r21 = r58
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r1 = 2
            X.7pp r0 = new X.7pp
            r0.<init>(r2, r1)
            r2.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162837pE.<init>(X.1Dv, X.0wN, X.19m, X.17Y, X.0wQ, X.0ww, X.1X4, X.1Pp, X.185, X.18y, X.1Ps, X.3Qc, X.0yb, X.0wo, X.0wG, X.0yE, X.0v0, X.0ts, X.12q, X.1N0, X.62r, X.6O1, X.1XN, X.1H2, com.whatsapp.emoji.search.EmojiSearchProvider, X.0yC, X.13E, com.whatsapp.location.LocationPicker2, X.1P5, X.2XH, X.6LW, com.whatsapp.nativelibloader.WhatsAppLibLoader, X.0wg, X.1A1, X.0xT, X.1N2, X.0wU):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C162837pE(X.C24801Dv r40, X.C19700wN r41, X.C237019m r42, X.AnonymousClass17Y r43, X.C19730wQ r44, X.C20050ww r45, X.AnonymousClass1X4 r46, X.AnonymousClass1Pp r47, X.AnonymousClass185 r48, X.C235618y r49, X.C27761Ps r50, X.C64953Qc r51, X.C21060yb r52, X.C19970wo r53, X.C19630wG r54, X.C20830yE r55, X.C19420v0 r56, X.C18820ts r57, X.C220412q r58, X.AnonymousClass1N0 r59, X.C1261362r r60, X.AnonymousClass6O1 r61, X.AnonymousClass1XN r62, X.AnonymousClass1H2 r63, com.whatsapp.emoji.search.EmojiSearchProvider r64, X.C20810yC r65, X.AnonymousClass13E r66, com.whatsapp.location.LocationPicker r67, X.AnonymousClass1P5 r68, X.AnonymousClass2XH r69, X.AnonymousClass6LW r70, com.whatsapp.nativelibloader.WhatsAppLibLoader r71, X.C19890wg r72, X.AnonymousClass1A1 r73, X.C20380xT r74, X.AnonymousClass1N2 r75, X.C19770wU r76) {
        /*
            r39 = this;
            r0 = 0
            r2 = r39
            r2.A02 = r0
            r0 = r67
            r2.A01 = r0
            r29 = r66
            r28 = r65
            r27 = r64
            r26 = r63
            r25 = r62
            r24 = r61
            r23 = r60
            r22 = r59
            r14 = r51
            r30 = r68
            r31 = r69
            r3 = r40
            r32 = r70
            r4 = r41
            r33 = r71
            r5 = r42
            r34 = r72
            r6 = r43
            r35 = r73
            r7 = r44
            r11 = r48
            r36 = r74
            r8 = r45
            r12 = r49
            r37 = r75
            r9 = r46
            r13 = r50
            r38 = r76
            r10 = r47
            r15 = r52
            r16 = r53
            r17 = r54
            r18 = r55
            r19 = r56
            r20 = r57
            r21 = r58
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r1 = 3
            X.7po r0 = new X.7po
            r0.<init>(r2, r1)
            r2.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162837pE.<init>(X.1Dv, X.0wN, X.19m, X.17Y, X.0wQ, X.0ww, X.1X4, X.1Pp, X.185, X.18y, X.1Ps, X.3Qc, X.0yb, X.0wo, X.0wG, X.0yE, X.0v0, X.0ts, X.12q, X.1N0, X.62r, X.6O1, X.1XN, X.1H2, com.whatsapp.emoji.search.EmojiSearchProvider, X.0yC, X.13E, com.whatsapp.location.LocationPicker, X.1P5, X.2XH, X.6LW, com.whatsapp.nativelibloader.WhatsAppLibLoader, X.0wg, X.1A1, X.0xT, X.1N2, X.0wU):void");
    }
}
