package X;

import android.text.TextUtils;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.jid.UserJid;

/* renamed from: X.ABf  reason: case insensitive filesystem */
public class C21171ABf implements C22938Ayo, C22942Ays, C17740rx {
    public final C19700wN A00;
    public final C202029kv A01;

    public void B24(C196159Xy r8, AnonymousClass3T1 r9) {
        AnonymousClass90b r0;
        if (r9 instanceof C46952bw) {
            C46952bw r92 = (C46952bw) r9;
            AnonymousClass8NL r2 = r8.A00;
            AnonymousClass8S0 r02 = ((AnonymousClass8SX) r2.A00).orderMessage_;
            if (r02 == null) {
                r02 = AnonymousClass8S0.DEFAULT_INSTANCE;
            }
            AnonymousClass8NN A0q = r02.A0q();
            String str = r92.A07;
            if (str != null) {
                AnonymousClass8S0 r1 = (AnonymousClass8S0) C90524aI.A0H(A0q);
                int i = AnonymousClass8S0.CONTEXT_INFO_FIELD_NUMBER;
                r1.bitField0_ |= 1;
                r1.orderId_ = str;
            }
            String str2 = r92.A08;
            if (str2 != null) {
                AnonymousClass8S0 r12 = (AnonymousClass8S0) C90524aI.A0H(A0q);
                int i2 = AnonymousClass8S0.CONTEXT_INFO_FIELD_NUMBER;
                r12.bitField0_ |= 64;
                r12.orderTitle_ = str2;
            }
            int i3 = r92.A00;
            AnonymousClass8S0 r13 = (AnonymousClass8S0) C90524aI.A0H(A0q);
            int i4 = AnonymousClass8S0.CONTEXT_INFO_FIELD_NUMBER;
            r13.bitField0_ |= 4;
            r13.itemCount_ = i3;
            String str3 = r92.A06;
            if (str3 != null) {
                AnonymousClass8S0 r14 = (AnonymousClass8S0) C90524aI.A0H(A0q);
                r14.bitField0_ |= 32;
                r14.message_ = str3;
            }
            int i5 = r92.A01;
            AnonymousClass8S0 r15 = (AnonymousClass8S0) C90524aI.A0H(A0q);
            r15.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
            r15.messageVersion_ = i5;
            int i6 = r92.A02;
            if (i6 != 1) {
                if (i6 == 2) {
                    r0 = AnonymousClass90b.ACCEPTED;
                } else if (i6 != 3) {
                    this.A00.A0E("FMessageOrder/setOrderStatus: Unexpected status", AnonymousClass000.A0r("status=", AnonymousClass000.A0u(), i6), true);
                } else {
                    r0 = AnonymousClass90b.DECLINED;
                }
                AnonymousClass8S0 r16 = (AnonymousClass8S0) C90524aI.A0H(A0q);
                r16.status_ = r0.value;
                r16.bitField0_ |= 8;
            } else {
                r0 = AnonymousClass90b.INQUIRY;
                AnonymousClass8S0 r162 = (AnonymousClass8S0) C90524aI.A0H(A0q);
                r162.status_ = r0.value;
                r162.bitField0_ |= 8;
            }
            int i7 = r92.A03;
            if (i7 != 1) {
                this.A00.A0E("FMessageOrder/setOrderSurface: Unexpected surface", AnonymousClass000.A0r("surface=", AnonymousClass000.A0u(), i7), true);
            } else {
                AnonymousClass90I r03 = AnonymousClass90I.A01;
                AnonymousClass8S0 r17 = (AnonymousClass8S0) C90524aI.A0H(A0q);
                r17.surface_ = r03.value;
                r17.bitField0_ |= 16;
            }
            UserJid userJid = r92.A04;
            if (userJid != null) {
                String A0K = AnonymousClass8NN.A0K(A0q, userJid);
                AnonymousClass8S0 r18 = (AnonymousClass8S0) A0q.A00;
                A0K.getClass();
                r18.bitField0_ |= 128;
                r18.sellerJid_ = A0K;
            }
            String str4 = r92.A09;
            if (str4 != null) {
                AnonymousClass8S0 r19 = (AnonymousClass8S0) C90524aI.A0H(A0q);
                r19.bitField0_ |= 256;
                r19.token_ = str4;
            }
            if (!TextUtils.isEmpty(r92.A05) && r92.A0A != null) {
                String str5 = r92.A05;
                AnonymousClass8S0 r110 = (AnonymousClass8S0) C90524aI.A0H(A0q);
                str5.getClass();
                r110.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
                r110.totalCurrencyCode_ = str5;
                long longValue = r92.A0A.multiply(C129676Ia.A00).longValue();
                AnonymousClass8S0 r5 = (AnonymousClass8S0) C90524aI.A0H(A0q);
                r5.bitField0_ |= 512;
                r5.totalAmount1000_ = longValue;
            }
            C63683Kz A0V = r92.A0V();
            if (!(A0V == null || A0V.A02() == null)) {
                AnonymousClass8I5 A0O = C90474aD.A0O(A0q, A0V.A02());
                AnonymousClass8S0 r111 = (AnonymousClass8S0) A0q.A00;
                r111.bitField0_ |= 2;
                r111.thumbnail_ = A0O;
            }
            C80103un r4 = r8.A02;
            byte[] bArr = r8.A0B;
            if (C202029kv.A02(r4, r92, bArr)) {
                AnonymousClass8SG A002 = C196159Xy.A00(this.A01, r8, r4, r92, bArr);
                AnonymousClass8S0 r112 = (AnonymousClass8S0) C90524aI.A0H(A0q);
                A002.getClass();
                r112.contextInfo_ = A002;
                r112.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
            }
            AnonymousClass8SX A0E = AnonymousClass8NN.A0E(r2);
            AnonymousClass8S0 r04 = (AnonymousClass8S0) A0q.A0R();
            r04.getClass();
            A0E.orderMessage_ = r04;
            A0E.bitField0_ |= 536870912;
            return;
        }
        throw AnonymousClass001.A08("FMessageOrderProtobuf/not supported message");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008d A[SYNTHETIC, Splitter:B:24:0x008d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass3T1 BlH(X.AnonymousClass9YL r6) {
        /*
            r5 = this;
            X.8SX r2 = r6.A0A
            int r1 = r2.bitField0_
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00a1
            X.8S0 r4 = r2.orderMessage_
            if (r4 != 0) goto L_0x000f
            X.8S0 r4 = X.AnonymousClass8S0.DEFAULT_INSTANCE
        L_0x000f:
            X.C18740tg.A06(r4)
            X.3Qa r2 = r6.A0C
            long r0 = r6.A04
            X.2bw r3 = new X.2bw
            r3.<init>(r2, r0)
            X.3Qj r0 = new X.3Qj
            r0.<init>()
            r3.A01 = r0
            java.lang.String r0 = r4.orderId_
            r3.A07 = r0
            java.lang.String r0 = r4.orderTitle_
            r3.A08 = r0
            int r0 = r4.itemCount_
            r3.A00 = r0
            java.lang.String r0 = r4.message_
            r3.A06 = r0
            int r1 = r4.status_
            r0 = 1
            if (r1 == r0) goto L_0x0051
            r0 = 2
            if (r1 == r0) goto L_0x004e
            r0 = 3
            if (r1 != r0) goto L_0x0051
            X.90b r0 = X.AnonymousClass90b.DECLINED
        L_0x003f:
            int r0 = r0.value
            r3.A02 = r0
            X.90I r0 = X.AnonymousClass90I.A01
            int r0 = r0.value
            r3.A03 = r0
            int r0 = r4.messageVersion_
            r3.A01 = r0
            goto L_0x0054
        L_0x004e:
            X.90b r0 = X.AnonymousClass90b.ACCEPTED
            goto L_0x003f
        L_0x0051:
            X.90b r0 = X.AnonymousClass90b.INQUIRY
            goto L_0x003f
        L_0x0054:
            java.lang.String r1 = r4.sellerJid_     // Catch:{ 0wR -> 0x005f }
            X.13r r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ 0wR -> 0x005f }
            com.whatsapp.jid.UserJid r0 = X.C222813r.A01(r1)     // Catch:{ 0wR -> 0x005f }
            r3.A04 = r0     // Catch:{ 0wR -> 0x005f }
            goto L_0x0072
        L_0x005f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessageOrder/FMessageOrder invalid seller jid <"
            r1.append(r0)
            java.lang.String r0 = r4.sellerJid_
            r1.append(r0)
            java.lang.String r0 = ">"
            X.C36341k9.A1O(r1, r0)
        L_0x0072:
            java.lang.String r0 = r4.token_
            r3.A09 = r0
            X.AUx r0 = r4.thumbnail_
            if (r0 == 0) goto L_0x0083
            byte[] r1 = r0.A06()
            boolean r0 = r6.A0O
            r3.A1j(r1, r0)
        L_0x0083:
            java.lang.String r0 = r4.totalCurrencyCode_
            r3.A05 = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00a0
            java.lang.String r0 = r3.A05     // Catch:{ IllegalArgumentException -> 0x009d }
            X.6Tk r2 = new X.6Tk     // Catch:{ IllegalArgumentException -> 0x009d }
            r2.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x009d }
            long r0 = r4.totalAmount1000_     // Catch:{ IllegalArgumentException -> 0x009d }
            java.math.BigDecimal r0 = X.C129676Ia.A00(r2, r0)     // Catch:{ IllegalArgumentException -> 0x009d }
            r3.A0A = r0     // Catch:{ IllegalArgumentException -> 0x009d }
            return r3
        L_0x009d:
            r0 = 0
            r3.A05 = r0
        L_0x00a0:
            return r3
        L_0x00a1:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21171ABf.BlH(X.9YL):X.3T1");
    }

    public C21171ABf(C19700wN r1, C202029kv r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
