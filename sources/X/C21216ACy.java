package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.math.BigDecimal;

/* renamed from: X.ACy  reason: case insensitive filesystem */
public final class C21216ACy implements B14 {
    public final C20810yC A00;
    public final AnonymousClass1EU A01;
    public final C194389Pm A02;

    public void Bd3(AnonymousClass6CO r12, AnonymousClass8NK r13, AnonymousClass3T1 r14) {
        C202319lY r5;
        int i;
        AnonymousClass8NN A0p;
        C172858Pl r1;
        int i2;
        C202319lY r0;
        C36331k8.A1I(r14, r13);
        C194389Pm r3 = this.A02;
        C202319lY r02 = r14.A0M;
        if (!(r02 == null || r02.A08 == null)) {
            AnonymousClass8S1 A002 = r3.A00(r14);
            AnonymousClass8SU A0J = AnonymousClass8NN.A0J(r13);
            A002.getClass();
            A0J.paymentInfo_ = A002;
            A0J.bitField0_ |= C132986Wc.A0F;
        }
        AnonymousClass3T1 A0S = r14.A0S();
        if (!(A0S == null || (r0 = A0S.A0M) == null || r0.A08 == null)) {
            AnonymousClass8S1 A003 = r3.A00(A0S);
            AnonymousClass8SU A0J2 = AnonymousClass8NN.A0J(r13);
            A003.getClass();
            A0J2.quotedPaymentInfo_ = A003;
            A0J2.bitField0_ |= 524288;
        }
        if (this.A00.A0E(1954) && (r5 = r14.A0M) != null && r5.A0L != null) {
            AnonymousClass8NN A0p2 = AnonymousClass8S3.DEFAULT_INSTANCE.A0p();
            C175708av r32 = r5.A0A;
            if (r32 != null) {
                AnonymousClass8NN A0p3 = AnonymousClass8S9.DEFAULT_INSTANCE.A0p();
                AnonymousClass8NG A0i = AnonymousClass8SW.A0i();
                A0i.A0V(r5.A0L);
                A0i.A0Y(r5.A0Q);
                A0i.A0X(AnonymousClass143.A03(r5.A0C));
                AnonymousClass8SW r03 = (AnonymousClass8SW) A0i.A0R();
                AnonymousClass8S9 r15 = (AnonymousClass8S9) C90524aI.A0H(A0p3);
                r03.getClass();
                r15.messageKey_ = r03;
                r15.bitField0_ |= 64;
                boolean z = r32 instanceof C175938bJ;
                if (z || (r32 instanceof C175918bH) || !(r32 instanceof C175928bI)) {
                    i = 0;
                } else {
                    i = ((C175928bI) r32).A02;
                }
                AnonymousClass8S9 r8 = (AnonymousClass8S9) C90524aI.A0H(A0p3);
                r8.bitField0_ |= 256;
                r8.previousType_ = (long) i;
                AnonymousClass8S9 r82 = (AnonymousClass8S9) C90524aI.A0H(A0p3);
                r82.bitField0_ |= 128;
                r82.previousStatus_ = (long) r32.A08();
                long A09 = r32.A09();
                AnonymousClass8S9 r83 = (AnonymousClass8S9) C90524aI.A0H(A0p3);
                r83.bitField0_ |= 8;
                r83.expiryTimestamp_ = A09;
                String valueOf = String.valueOf(r32.A07());
                AnonymousClass8S9 r16 = (AnonymousClass8S9) C90524aI.A0H(A0p3);
                r16.bitField0_ |= 4;
                r16.counter_ = valueOf;
                int i3 = r5.A04;
                AnonymousClass8S9 r17 = (AnonymousClass8S9) C90524aI.A0H(A0p3);
                r17.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                r17.version_ = i3;
                AnonymousClass8NN A0p4 = AnonymousClass8PJ.DEFAULT_INSTANCE.A0p();
                C207259uo r84 = r32.A02;
                if (r84 != null) {
                    String str = r84.A01;
                    AnonymousClass8PJ r18 = (AnonymousClass8PJ) C90524aI.A0H(A0p4);
                    str.getClass();
                    r18.bitField0_ |= 1;
                    r18.id_ = str;
                    AnonymousClass8NG A0i2 = AnonymousClass8SW.A0i();
                    A0i2.A0V(r84.A02);
                    A0i2.A0Y(false);
                    AnonymousClass8SW r04 = (AnonymousClass8SW) A0i2.A0R();
                    AnonymousClass8PJ r19 = (AnonymousClass8PJ) C90524aI.A0H(A0p4);
                    r04.getClass();
                    r19.messageKey_ = r04;
                    r19.bitField0_ |= 2;
                    AnonymousClass8PJ r05 = (AnonymousClass8PJ) A0p4.A0R();
                    AnonymousClass8S9 r110 = (AnonymousClass8S9) C90524aI.A0H(A0p3);
                    r05.getClass();
                    r110.order_ = r05;
                    r110.bitField0_ |= DefaultCrypto.BUFFER_SIZE;
                }
                C207119ua r7 = r32.A01;
                if (r7 != null) {
                    AnonymousClass8NN A0p5 = AnonymousClass8QC.DEFAULT_INSTANCE.A0p();
                    AnonymousClass8QC r85 = (AnonymousClass8QC) C90524aI.A0H(A0p5);
                    r85.bitField0_ |= 1;
                    r85.value_ = (long) r7.A01();
                    int i4 = r7.A00;
                    AnonymousClass8QC r111 = (AnonymousClass8QC) C90524aI.A0H(A0p5);
                    r111.bitField0_ |= 2;
                    r111.offset_ = i4;
                    String str2 = ((AnonymousClass16V) r7.A01).A02;
                    AnonymousClass8QC r112 = (AnonymousClass8QC) C90524aI.A0H(A0p5);
                    str2.getClass();
                    r112.bitField0_ |= 4;
                    r112.currencyCode_ = str2;
                    AnonymousClass8QC r06 = (AnonymousClass8QC) A0p5.A0R();
                    AnonymousClass8S9 r113 = (AnonymousClass8S9) C90524aI.A0H(A0p3);
                    r06.getClass();
                    r113.amount_ = r06;
                    r113.bitField0_ |= 1;
                }
                if (z) {
                    AnonymousClass8NN A0p6 = C172478Nz.DEFAULT_INSTANCE.A0p();
                    A0p = C172858Pl.DEFAULT_INSTANCE.A0p();
                    C170918Hz A0R = A0p6.A0R();
                    r1 = (C172858Pl) C90524aI.A0H(A0p);
                    A0R.getClass();
                    r1.metadataValue_ = A0R;
                    i2 = 2;
                } else {
                    if (r32 instanceof C175928bI) {
                        C175928bI r33 = (C175928bI) r32;
                        AnonymousClass8NN A0p7 = AnonymousClass8RW.DEFAULT_INSTANCE.A0p();
                        String str3 = r33.A0Q;
                        AnonymousClass8RW r114 = (AnonymousClass8RW) C90524aI.A0H(A0p7);
                        str3.getClass();
                        r114.bitField0_ |= 4;
                        r114.senderHandle_ = str3;
                        String str4 = r33.A0O;
                        AnonymousClass8RW r115 = (AnonymousClass8RW) C90524aI.A0H(A0p7);
                        str4.getClass();
                        r115.bitField0_ |= 2;
                        r115.receiverHandle_ = str4;
                        long j = r33.A05;
                        AnonymousClass8RW r34 = (AnonymousClass8RW) C90524aI.A0H(A0p7);
                        r34.bitField0_ |= 1;
                        r34.startTimestamp_ = j;
                        A0p = C172858Pl.DEFAULT_INSTANCE.A0p();
                        C170918Hz A0R2 = A0p7.A0R();
                        r1 = (C172858Pl) C90524aI.A0H(A0p);
                        A0R2.getClass();
                        r1.metadataValue_ = A0R2;
                        i2 = 1;
                    }
                    AnonymousClass8S9 r07 = (AnonymousClass8S9) A0p3.A0R();
                    AnonymousClass8S3 r116 = (AnonymousClass8S3) C90524aI.A0H(A0p2);
                    r07.getClass();
                    r116.metadata_ = r07;
                    r116.bitField0_ |= DefaultCrypto.BUFFER_SIZE;
                }
                r1.metadataValueCase_ = i2;
                C172858Pl r08 = (C172858Pl) A0p.A0R();
                if (r08 != null) {
                    AnonymousClass8S9 r117 = (AnonymousClass8S9) C90524aI.A0H(A0p3);
                    r117.marketMetadata_ = r08;
                    r117.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
                }
                AnonymousClass8S9 r072 = (AnonymousClass8S9) A0p3.A0R();
                AnonymousClass8S3 r1162 = (AnonymousClass8S3) C90524aI.A0H(A0p2);
                r072.getClass();
                r1162.metadata_ = r072;
                r1162.bitField0_ |= DefaultCrypto.BUFFER_SIZE;
            }
            if (r5.A0K != null) {
                String str5 = r14.A0t;
                AnonymousClass8S3 r118 = (AnonymousClass8S3) C90524aI.A0H(A0p2);
                str5.getClass();
                r118.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                r118.transactionId_ = str5;
            }
            String str6 = r5.A0I;
            AnonymousClass8S3 r119 = (AnonymousClass8S3) C90524aI.A0H(A0p2);
            str6.getClass();
            r119.bitField0_ |= 8;
            r119.currency_ = str6;
            String str7 = r5.A0H;
            if (str7 != null) {
                AnonymousClass8S3 r120 = (AnonymousClass8S3) C90524aI.A0H(A0p2);
                r120.bitField0_ |= 4;
                r120.credentialId_ = str7;
            }
            UserJid userJid = r5.A0E;
            if (userJid != null) {
                String A0K = AnonymousClass8NN.A0K(A0p2, userJid);
                AnonymousClass8S3 r121 = (AnonymousClass8S3) A0p2.A00;
                A0K.getClass();
                r121.bitField0_ |= 256;
                r121.senderJid_ = A0K;
            }
            UserJid userJid2 = r5.A0D;
            if (userJid2 != null) {
                String A0K2 = AnonymousClass8NN.A0K(A0p2, userJid2);
                AnonymousClass8S3 r122 = (AnonymousClass8S3) A0p2.A00;
                A0K2.getClass();
                r122.bitField0_ |= 128;
                r122.recieverJid_ = A0K2;
            }
            long j2 = (long) r5.A02;
            AnonymousClass8S3 r35 = (AnonymousClass8S3) C90524aI.A0H(A0p2);
            r35.bitField0_ |= 512;
            r35.status_ = j2;
            String str8 = r5.A0J;
            if (str8 != null) {
                AnonymousClass8S3 r123 = (AnonymousClass8S3) C90524aI.A0H(A0p2);
                r123.bitField0_ |= 16;
                r123.errorCode_ = str8;
            }
            String str9 = r5.A0F;
            if (str9 != null) {
                AnonymousClass8S3 r124 = (AnonymousClass8S3) C90524aI.A0H(A0p2);
                r124.bitField0_ |= 2;
                r124.bankTransactionId_ = str9;
            }
            long j3 = r5.A05;
            AnonymousClass8S3 r36 = (AnonymousClass8S3) C90524aI.A0H(A0p2);
            r36.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            r36.timestamp_ = j3;
            int i5 = r5.A03;
            AnonymousClass8S3 r125 = (AnonymousClass8S3) C90524aI.A0H(A0p2);
            r125.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
            r125.type_ = i5;
            String str10 = r5.A0L;
            AnonymousClass8S3 r126 = (AnonymousClass8S3) C90524aI.A0H(A0p2);
            str10.getClass();
            r126.bitField0_ |= 64;
            r126.messageStanzaId_ = str10;
            AnonymousClass8SU A0I = AnonymousClass8NN.A0I(r13);
            AnonymousClass8S3 r127 = (AnonymousClass8S3) A0p2.A0R();
            int i6 = AnonymousClass8SU.AGENT_ID_FIELD_NUMBER;
            r127.getClass();
            A0I.paymentTransactionInfo_ = r127;
            A0I.bitField1_ |= 64;
        }
    }

    public void Bd4(C1275768v r35, AnonymousClass8SU r36, AnonymousClass3T1 r37) {
        AnonymousClass16U r5;
        String str;
        int i;
        B66 A012;
        AnonymousClass8SU r0 = r36;
        AnonymousClass3T1 r7 = r37;
        boolean A1a = C36341k9.A1a(r0, r7);
        try {
            AnonymousClass8S3 r6 = r0.paymentTransactionInfo_;
            if (r6 == null) {
                r6 = AnonymousClass8S3.DEFAULT_INSTANCE;
            }
            AnonymousClass00C.A08(r6);
            String str2 = r6.transactionId_;
            if (str2 != null && str2.length() != 0) {
                r7.A0t = str2;
                AnonymousClass8S9 r8 = r6.metadata_;
                if (r8 == null) {
                    r8 = AnonymousClass8S9.DEFAULT_INSTANCE;
                }
                C172858Pl r02 = r8.marketMetadata_;
                if (r02 == null) {
                    r02 = C172858Pl.DEFAULT_INSTANCE;
                }
                int i2 = r02.metadataValueCase_;
                if (i2 == 2) {
                    r5 = AnonymousClass16W.A04;
                    AnonymousClass00C.A09(r5);
                    C202159l8 r03 = C202159l8.A0E;
                    str = "BR";
                    i = 2;
                } else if (i2 == A1a) {
                    r5 = AnonymousClass16W.A05;
                    AnonymousClass00C.A09(r5);
                    C202159l8 r04 = C202159l8.A0E;
                    str = "IN";
                    i = 1;
                } else {
                    throw AnonymousClass001.A09("Payment Market not supported");
                }
                int i3 = r6.type_;
                C222813r r05 = UserJid.Companion;
                UserJid A013 = C222813r.A01(r6.senderJid_);
                UserJid A014 = C222813r.A01(r6.recieverJid_);
                String str3 = r6.currency_;
                AnonymousClass8QC r06 = r8.amount_;
                if (r06 == null) {
                    r06 = AnonymousClass8QC.DEFAULT_INSTANCE;
                }
                BigDecimal bigDecimal = new BigDecimal(r06.value_);
                AnonymousClass8QC r07 = r8.amount_;
                if (r07 == null) {
                    r07 = AnonymousClass8QC.DEFAULT_INSTANCE;
                }
                AnonymousClass16X r9 = new AnonymousClass16X(bigDecimal, r07.offset_);
                long j = r6.timestamp_;
                String str4 = r6.transactionId_;
                int i4 = (int) r6.status_;
                long j2 = r8.lastStatusTimestamp_;
                String str5 = r6.credentialId_;
                String str6 = r6.errorCode_;
                String str7 = r6.bankTransactionId_;
                AnonymousClass16U r14 = r5;
                AnonymousClass16X r15 = r9;
                C202319lY r13 = new C202319lY(r14, r15, A013, A014, str3, str4, str5, str6, str7, r8.collectRequestId_, str, i3, i4, r8.version_, i, 0, j, j2);
                C198699e3 A03 = this.A01.A03(str);
                if (!(A03 == null || (A012 = A03.A01(((AnonymousClass16V) r5).A02)) == null)) {
                    r13.A0A = A012.BKY();
                }
                r13.A0L = r6.messageStanzaId_;
                r7.A0M = r13;
            }
        } catch (C19740wR unused) {
            Log.e("Invalid Jid in payment transaction");
        }
    }

    public C21216ACy(C20810yC r1, AnonymousClass1EU r2, C194389Pm r3) {
        C36321k7.A11(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
