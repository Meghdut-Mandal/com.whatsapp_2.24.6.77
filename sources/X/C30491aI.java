package X;

import android.os.Handler;
import android.os.Looper;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;

/* renamed from: X.1aI  reason: invalid class name and case insensitive filesystem */
public class C30491aI {
    public final C19460v5 A00;
    public final C19460v5 A01;
    public final C19730wQ A02;
    public final AnonymousClass1DT A03;
    public final AnonymousClass164 A04;
    public final C232417s A05;
    public final C30431aC A06;
    public final C19970wo A07;
    public final AnonymousClass189 A08;
    public final AnonymousClass187 A09;
    public final AnonymousClass18I A0A;
    public final C29571Xd A0B;
    public final AnonymousClass17X A0C;
    public final AnonymousClass1FN A0D;
    public final AnonymousClass1QO A0E;
    public final C26171Jd A0F;
    public final AnonymousClass1OD A0G;
    public final C231417i A0H;
    public final C20810yC A0I;
    public final C25181Fh A0J;
    public final C25121Fb A0K;
    public final C20520xh A0L;
    public final AnonymousClass1C4 A0M;
    public final AnonymousClass19L A0N;
    public final C30501aJ A0O;
    public final C26271Jn A0P;
    public final AnonymousClass1A1 A0Q;
    public final C19770wU A0R;
    public final AnonymousClass005 A0S;
    public final Handler A0T = new Handler(Looper.getMainLooper());

    public byte[] A00(DeviceJid deviceJid, C64933Qa r17, C121865tq r18, C121865tq r19, byte[] bArr, byte[] bArr2, int i, int i2, boolean z) {
        DeviceJid deviceJid2 = deviceJid;
        AnonymousClass79X A082 = this.A0A.A08(deviceJid2);
        try {
            AnonymousClass6EZ A022 = C133256Xm.A02(deviceJid2);
            StringBuilder sb = new StringBuilder();
            sb.append("RetryReceiptHandler/axolotl checking sessions for ");
            sb.append(A022);
            sb.append(" due to retry receipt for ");
            C64933Qa r2 = r17;
            sb.append(r2);
            Log.i(sb.toString());
            boolean z2 = false;
            byte[] bArr3 = bArr2;
            int i3 = i2;
            if (bArr2 != null) {
                C121865tq r11 = r18;
                if (r18 != null) {
                    if (z) {
                        AnonymousClass189 r1 = this.A08;
                        if (!r1.A0Z(A022)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("RetryReceiptHandler/axolotl Not processing keys from the receipt, missing session for ");
                            sb2.append(r2);
                            Log.i(sb2.toString());
                        } else if (r1.A0D(A022).A01.A00.remoteRegistrationId_ != i3) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("RetryReceiptHandler/Not processing keys from the receipt, registrationId does not match for ");
                            sb3.append(r2);
                            Log.i(sb3.toString());
                        }
                        z2 = true;
                    }
                    if (!z2) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("axolotl processing keys from the receipt for jid:");
                        sb4.append(deviceJid2);
                        Log.i(sb4.toString());
                        int A052 = this.A08.A05(C133256Xm.A02(deviceJid2), r19, r11, bArr3, bArr, (byte) 5);
                        if (A052 == 0) {
                            this.A0T.post(new C35761jD(this, deviceJid2, 31));
                        } else {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("RetryReceiptHandler/Error received from SignalCoordinator; status=");
                            sb5.append(A052);
                            Log.e(sb5.toString());
                        }
                    }
                }
            }
            AnonymousClass189 r6 = this.A08;
            if (r6.A0Z(A022)) {
                AnonymousClass8S2 r12 = r6.A0D(A022).A01.A00;
                byte[] A062 = r12.aliceBaseKey_.A06();
                if (r12.remoteRegistrationId_ != i3) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("RetryReceiptHandler/axolotl deleting session due to registration id change for ");
                    sb6.append(r2);
                    Log.i(sb6.toString());
                    r6.A0E(A022);
                    r6.A0R(A022);
                } else {
                    int i4 = i;
                    if (i4 > 2 && r6.A0b(A022, r2)) {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("RetryReceiptHandler/axolotl will wait to send ");
                        sb7.append(r2);
                        sb7.append(" until a new prekey has been fetched");
                        Log.i(sb7.toString());
                    } else if (i4 == 2) {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append("RetryReceiptHandler/axolotl will record the base key used to send ");
                        sb8.append(r2);
                        Log.i(sb8.toString());
                        r6.A0U(A022, r2, A062);
                    }
                }
                if (A082 != null) {
                    A082.close();
                }
                return A062;
            }
            if (A082 != null) {
                A082.close();
            }
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public C30491aI(C19460v5 r3, C19460v5 r4, C19730wQ r5, AnonymousClass1DT r6, AnonymousClass164 r7, C232417s r8, C30431aC r9, C19970wo r10, AnonymousClass189 r11, AnonymousClass187 r12, AnonymousClass18I r13, C29571Xd r14, AnonymousClass17X r15, AnonymousClass1FN r16, AnonymousClass1QO r17, C26171Jd r18, AnonymousClass1OD r19, C231417i r20, C20810yC r21, C25181Fh r22, C25121Fb r23, C20520xh r24, AnonymousClass1C4 r25, AnonymousClass19L r26, C30501aJ r27, C26271Jn r28, AnonymousClass1A1 r29, C19770wU r30, AnonymousClass005 r31) {
        this.A07 = r10;
        this.A0I = r21;
        this.A02 = r5;
        this.A0R = r30;
        this.A0M = r25;
        this.A0A = r13;
        this.A04 = r7;
        this.A03 = r6;
        this.A0E = r17;
        this.A09 = r12;
        this.A0Q = r29;
        this.A08 = r11;
        this.A0J = r22;
        this.A0H = r20;
        this.A0S = r31;
        this.A05 = r8;
        this.A0N = r26;
        this.A0F = r18;
        this.A00 = r3;
        this.A0G = r19;
        this.A0B = r14;
        this.A0D = r16;
        this.A0O = r27;
        this.A0P = r28;
        this.A01 = r4;
        this.A0K = r23;
        this.A0C = r15;
        this.A06 = r9;
        this.A0L = r24;
    }
}
