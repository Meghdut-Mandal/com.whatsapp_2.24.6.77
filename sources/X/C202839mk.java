package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.util.Log;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* renamed from: X.9mk  reason: invalid class name and case insensitive filesystem */
public abstract class C202839mk {
    public static final Field A00;
    public static final Field A01;

    static {
        try {
            Field declaredField = C170918Hz.class.getDeclaredField("unknownFields");
            A01 = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = C202229lJ.class.getDeclaredField("count");
            A00 = declaredField2;
            declaredField2.setAccessible(true);
        } catch (NoSuchFieldException e) {
            Log.e("BaseMessageUtil/isValidV2E2eMessage/error unknown-message-count, exception=", e);
            throw C90524aI.A0Y(e);
        }
    }

    public static int A00(Object obj) {
        try {
            return A00.getInt(A01.get(obj));
        } catch (IllegalAccessException e) {
            Log.e("BaseMessageUtil/isValidV2E2eMessage/error unknown-message-count, exception=", e);
            throw C90524aI.A0Y(e);
        }
    }

    public static ArrayList A01(AnonymousClass8SX r6) {
        ArrayList A0I = AnonymousClass001.A0I();
        int A002 = A00(r6);
        for (int i = 0; i < A002; i++) {
            AnonymousClass000.A1F(A0I, 0);
        }
        int i2 = r6.bitField0_;
        if ((i2 & 8) != 0) {
            AnonymousClass000.A1F(A0I, 1);
        }
        if ((i2 & 1) != 0) {
            AnonymousClass000.A1F(A0I, 2);
        }
        if ((i2 & 4) != 0) {
            AnonymousClass000.A1F(A0I, 3);
        }
        if ((i2 & 16) != 0) {
            AnonymousClass000.A1F(A0I, 4);
        }
        if ((r6.bitField0_ & 65536) != 0) {
            AnonymousClass000.A1F(A0I, 5);
        }
        int i3 = r6.bitField0_;
        if ((i3 & 32) != 0) {
            AnonymousClass000.A1F(A0I, 6);
        }
        if ((r6.bitField2_ & 1) != 0) {
            AnonymousClass000.A1F(A0I, 51);
        }
        if (AnonymousClass000.A1P(i3 & 64)) {
            AnonymousClass000.A1F(A0I, 7);
        }
        if ((i3 & 128) != 0) {
            AnonymousClass000.A1F(A0I, 8);
        }
        if ((i3 & 256) != 0) {
            AnonymousClass000.A1F(A0I, 9);
        }
        if ((i3 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
            AnonymousClass000.A1F(A0I, 10);
        }
        if (r6.A0y()) {
            AnonymousClass000.A1F(A0I, 11);
        }
        int i4 = r6.bitField0_;
        if ((i4 & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
            AnonymousClass000.A1F(A0I, 12);
        }
        if ((i4 & DefaultCrypto.BUFFER_SIZE) != 0) {
            AnonymousClass000.A1F(A0I, 13);
        }
        if ((r6.bitField0_ & 32768) != 0) {
            AnonymousClass000.A1F(A0I, 14);
        }
        if ((r6.bitField0_ & C132986Wc.A0F) != 0) {
            AnonymousClass000.A1F(A0I, 15);
        }
        if (r6.A0z() || AnonymousClass000.A1P(r6.bitField1_ & 134217728)) {
            AnonymousClass000.A1F(A0I, 16);
        }
        int i5 = r6.bitField0_;
        if ((262144 & i5) != 0) {
            AnonymousClass000.A1F(A0I, 17);
        }
        if ((524288 & i5) != 0) {
            AnonymousClass000.A1F(A0I, 18);
        }
        if ((i5 & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) != 0) {
            AnonymousClass000.A1F(A0I, 19);
        }
        if ((r6.bitField0_ & 134217728) != 0) {
            AnonymousClass000.A1F(A0I, 20);
        }
        int i6 = r6.bitField0_;
        if ((536870912 & i6) != 0) {
            AnonymousClass000.A1F(A0I, 21);
        }
        if ((i6 & 4194304) != 0) {
            AnonymousClass000.A1F(A0I, 22);
        }
        if (r6.A10()) {
            AnonymousClass000.A1F(A0I, 23);
        }
        int i7 = r6.bitField0_;
        if ((8388608 & i7) != 0) {
            AnonymousClass000.A1F(A0I, 24);
        }
        if (AnonymousClass000.A1P(268435456 & i7)) {
            AnonymousClass000.A1F(A0I, 25);
        }
        if ((i7 & 1073741824) != 0) {
            AnonymousClass000.A1F(A0I, 26);
        }
        if (AnonymousClass000.A1P(r6.bitField0_ & Integer.MIN_VALUE)) {
            AnonymousClass000.A1F(A0I, 27);
        }
        int i8 = r6.bitField1_;
        if ((i8 & 1) != 0) {
            AnonymousClass000.A1F(A0I, 29);
        }
        if ((i8 & 2) != 0) {
            AnonymousClass000.A1F(A0I, 30);
        }
        if ((i8 & 4) != 0) {
            AnonymousClass000.A1F(A0I, 31);
        }
        if (!((i8 & 16) == 0 && (i8 & ZipDecompressor.UNZIP_BUFFER_SIZE) == 0)) {
            AnonymousClass000.A1F(A0I, 32);
        }
        if (AnonymousClass000.A1P(r6.bitField1_ & 8)) {
            AnonymousClass000.A1F(A0I, 33);
        }
        int i9 = r6.bitField1_;
        if ((i9 & 32) != 0) {
            AnonymousClass000.A1F(A0I, 34);
        }
        if (!((i9 & 64) == 0 && (32768 & i9) == 0 && (524288 & i9) == 0)) {
            AnonymousClass000.A1F(A0I, 35);
        }
        if ((i9 & 128) != 0) {
            C173098Qj r0 = r6.pollUpdateMessage_;
            if (r0 == null) {
                r0 = C173098Qj.DEFAULT_INSTANCE;
            }
            if ((r0.bitField0_ & 2) != 0) {
                AnonymousClass000.A1F(A0I, 36);
            }
        }
        if ((i9 & 256) != 0) {
            AnonymousClass000.A1F(A0I, 37);
        }
        if ((262144 & i9) != 0) {
            AnonymousClass000.A1F(A0I, 39);
        }
        if ((i9 & 512) != 0) {
            AnonymousClass000.A1F(A0I, 7);
        }
        if ((r6.bitField1_ & DefaultCrypto.BUFFER_SIZE) != 0) {
            AnonymousClass000.A1F(A0I, 11);
        }
        int i10 = r6.bitField1_;
        if ((i10 & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
            AnonymousClass000.A1F(A0I, 25);
        }
        if ((i10 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
            AnonymousClass000.A1F(A0I, 38);
        }
        if ((i10 & 16384) != 0) {
            AnonymousClass000.A1F(A0I, 25);
        }
        if ((i10 & 65536) != 0) {
            AnonymousClass000.A1F(A0I, 40);
        }
        if ((r6.bitField1_ & 1048576) != 0) {
            AnonymousClass000.A1F(A0I, 41);
        }
        if ((r6.bitField1_ & 2097152) != 0) {
            AnonymousClass000.A1F(A0I, 42);
        }
        if ((r6.bitField1_ & C132986Wc.A0F) != 0) {
            AnonymousClass000.A1F(A0I, 43);
        }
        if (r6.A0u()) {
            AnonymousClass000.A1F(A0I, 44);
        }
        int i11 = r6.bitField1_;
        if (!((33554432 & i11) == 0 && (1073741824 & i11) == 0)) {
            AnonymousClass000.A1F(A0I, 45);
        }
        if ((67108864 & i11) != 0) {
            AnonymousClass000.A1F(A0I, 46);
        }
        if ((i11 & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) != 0) {
            AnonymousClass000.A1F(A0I, 47);
        }
        if (r6.A0v()) {
            AnonymousClass000.A1F(A0I, 48);
        }
        int i12 = r6.bitField1_;
        if ((Integer.MIN_VALUE & i12) != 0) {
            AnonymousClass000.A1F(A0I, 49);
        }
        if ((i12 & 536870912) != 0) {
            AnonymousClass000.A1F(A0I, 50);
        }
        int i13 = r6.bitField2_;
        if ((i13 & 2) != 0) {
            C172428Nu r02 = r6.placeholderMessage_;
            if (r02 == null) {
                r02 = C172428Nu.DEFAULT_INSTANCE;
            }
            if ((r02.bitField0_ & 1) != 0) {
                AnonymousClass000.A1F(A0I, 52);
            }
        }
        if ((i13 & 4) != 0) {
            AnonymousClass000.A1F(A0I, 53);
        }
        return A0I;
    }

    public static void A02(AnonymousClass1DT r3, AnonymousClass3T1 r4, C26271Jn r5, AnonymousClass1A1 r6) {
        Integer A002 = C26271Jn.A00(r4, r5, r3.A0C(r4));
        if (A002 != null) {
            throw new C25311Fu(A002, (String) null);
        } else if (r4.A1T(EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING)) {
            C63663Kx A0P = r4.A0P();
            Integer A0m = C36381kD.A0m();
            if (A0P != null) {
                Long A04 = r4.A0P().A04();
                if (A04 != null) {
                    AnonymousClass3T1 A0R = C36421kH.A0R(r6, A04.longValue());
                    if (A0R == null || (A0R instanceof AnonymousClass2bO)) {
                        throw new C25311Fu(A0m, (String) null);
                    }
                    A0R.A13 = true;
                    Integer A003 = C26271Jn.A00(A0R, r5, r3.A0C(A0R));
                    if (A003 != null) {
                        throw new C25311Fu(A003, (String) null);
                    }
                    return;
                }
                throw new C25311Fu(A0m, (String) null);
            }
            Log.e("E2eMessageUtils/verifyMessageSecretForComments/comment info for a comment message is null");
            throw new C25311Fu(A0m, (String) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0076, code lost:
        if ((r4 & 16384) != 0) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A03(X.C19700wN r8, X.C20810yC r9, X.AnonymousClass8SX r10, java.util.List r11) {
        /*
            X.8SX r2 = X.AnonymousClass9ZT.A00(r9, r10)
            r7 = 0
            r3 = 1
            if (r2 == 0) goto L_0x0096
            int r0 = r10.bitField0_
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r6
            boolean r5 = X.AnonymousClass000.A1P(r0)
            if (r5 != 0) goto L_0x005d
            int r1 = r2.bitField0_
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x005d
        L_0x001a:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "outer.hasEphemeralMessage="
            r4.append(r0)
            r4.append(r5)
            java.lang.String r0 = ", inner.hasViewOnceMessage="
            r4.append(r0)
            int r1 = r2.bitField0_
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1P(r1)
            r4.append(r0)
            java.lang.String r0 = ", inner.hasEphemeralMessage="
            r4.append(r0)
            int r0 = r2.bitField0_
            r0 = r0 & r6
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r4.append(r0)
            java.lang.String r0 = ", inner.hasDocumentWithCaptionMessage="
            r4.append(r0)
            int r0 = r2.bitField1_
            r0 = r0 & 512(0x200, float:7.175E-43)
            boolean r0 = X.AnonymousClass000.A1P(r0)
            java.lang.String r1 = X.C36421kH.A0d(r4, r0)
            java.lang.String r0 = "isValidMessage/futureproof/type"
        L_0x0059:
            r8.A0E(r0, r1, r3)
            return r7
        L_0x005d:
            int r0 = r2.bitField1_
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x001a
            int r0 = r2.bitField0_
            r0 = r0 & r6
            boolean r0 = X.AnonymousClass000.A1P(r0)
            if (r0 != 0) goto L_0x001a
            int r4 = r2.bitField0_
            r0 = r4 & 2
            r2 = 1
            if (r0 != 0) goto L_0x0078
            r2 = 0
            r0 = r4 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0096
        L_0x0078:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "hasSenderKeyDistributionMessage="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", hasFastRatchetKeySenderKeyDistributionMessage="
            r1.append(r0)
            r0 = r4 & 16384(0x4000, float:2.2959E-41)
            boolean r0 = X.AnonymousClass000.A1P(r0)
            java.lang.String r1 = X.C36421kH.A0d(r1, r0)
            java.lang.String r0 = "isValidMessage/futureproof/key"
            goto L_0x0059
        L_0x0096:
            int r0 = r11.size()
            if (r0 == r3) goto L_0x00a4
            if (r0 != 0) goto L_0x00a6
            int r0 = r10.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x00a6
        L_0x00a4:
            r7 = 1
            return r7
        L_0x00a6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MessageTypes="
            java.lang.String r1 = X.AnonymousClass000.A0l(r11, r0, r1)
            java.lang.String r0 = "isValidMessage/numtype"
            goto L_0x0059
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202839mk.A03(X.0wN, X.0yC, X.8SX, java.util.List):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:188:0x026d, code lost:
        if ((r0.bitField0_ & 2) != 0) goto L_0x026f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x02ec, code lost:
        if (r8.A0E(7358) == false) goto L_0x02ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0303, code lost:
        if (r2 == false) goto L_0x029a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0319, code lost:
        if (A00(r0) > 0) goto L_0x029a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A04(X.C30791am r6, X.C220412q r7, X.C20810yC r8, X.AnonymousClass11F r9, X.AnonymousClass8SX r10) {
        /*
            int r2 = A00(r10)
            r5 = 1
            if (r2 <= 0) goto L_0x0015
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MessageUtil/isUnknown/unknown tags="
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r2)
        L_0x0011:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0014:
            return r5
        L_0x0015:
            int r0 = r10.bitField0_
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r2
            boolean r0 = X.AnonymousClass000.A1P(r0)
            if (r0 == 0) goto L_0x0039
            X.8Nk r0 = r10.ephemeralMessage_
            r1 = r0
            if (r0 != 0) goto L_0x0027
            X.8Nk r0 = X.C172328Nk.DEFAULT_INSTANCE
        L_0x0027:
            X.8SX r0 = r0.message_
            if (r0 != 0) goto L_0x002d
            X.8SX r0 = X.AnonymousClass8SX.DEFAULT_INSTANCE
        L_0x002d:
            int r0 = r0.bitField0_
            r0 = r0 & r2
            boolean r0 = X.AnonymousClass000.A1P(r0)
            if (r0 == 0) goto L_0x03fa
            java.lang.String r0 = "MessageUtil/isUnknown/recursiveEphemeralMessage"
            goto L_0x0011
        L_0x0039:
            int r1 = r10.bitField0_
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0059
            X.8SP r0 = r10.listMessage_
            if (r0 != 0) goto L_0x0046
            X.8SP r0 = X.AnonymousClass8SP.DEFAULT_INSTANCE
        L_0x0046:
            X.90a r1 = r0.A0u()
            X.90a r0 = X.AnonymousClass90a.PRODUCT_LIST
            if (r1 != r0) goto L_0x0059
            r0 = 385(0x181, float:5.4E-43)
            boolean r0 = r8.A0E(r0)
            if (r0 == 0) goto L_0x0059
            java.lang.String r0 = "MessageUtil/isUnknown/listMessage product list"
            goto L_0x0011
        L_0x0059:
            int r0 = r10.bitField1_
            boolean r0 = X.C165577te.A1W(r0)
            r4 = 7408(0x1cf0, float:1.0381E-41)
            if (r0 == 0) goto L_0x00e8
            X.8Re r3 = r10.buttonsMessage_
            if (r3 != 0) goto L_0x0069
            X.8Re r3 = X.C173308Re.DEFAULT_INSTANCE
        L_0x0069:
            java.lang.String r0 = "review_and_pay"
            boolean r0 = X.C198269dB.A00(r3, r0)
            if (r0 != 0) goto L_0x0079
            java.lang.String r0 = "review_order"
            boolean r0 = X.C198269dB.A00(r3, r0)
            if (r0 == 0) goto L_0x0084
        L_0x0079:
            r0 = 833(0x341, float:1.167E-42)
            boolean r0 = r8.A0E(r0)
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = "MessageUtil/isUnknown/JioRechargeNativeFlowMessage"
            goto L_0x0011
        L_0x0084:
            java.lang.String r0 = "payment_method"
            boolean r0 = X.C198269dB.A00(r3, r0)
            if (r0 != 0) goto L_0x0094
            java.lang.String r0 = "payment_status"
            boolean r0 = X.C198269dB.A00(r3, r0)
            if (r0 == 0) goto L_0x00a0
        L_0x0094:
            r0 = 1595(0x63b, float:2.235E-42)
            boolean r0 = r8.A0E(r0)
            if (r0 != 0) goto L_0x00a0
            java.lang.String r0 = "MessageUtil/isUnknown/NonNativePaymentMethodOrderUpdateFlowMessage or MessageUtil/isUnknown/NonNativePaymentStatusOrderUpdateFlowMessage"
            goto L_0x0011
        L_0x00a0:
            java.lang.String r2 = "view_product"
            X.B6c r0 = r3.buttons_
            int r0 = r0.size()
            if (r0 == 0) goto L_0x00dc
            r1 = 0
        L_0x00ab:
            X.B6c r0 = r3.buttons_
            int r0 = r0.size()
            if (r1 >= r0) goto L_0x00dc
            X.B6c r0 = r3.buttons_
            java.lang.Object r0 = r0.get(r1)
            X.8Qh r0 = (X.C173078Qh) r0
            X.8Ox r0 = r0.nativeFlowInfo_
            if (r0 != 0) goto L_0x00c3
            X.8Ox r0 = X.C172718Ox.DEFAULT_INSTANCE
            if (r0 == 0) goto L_0x00d9
        L_0x00c3:
            X.8Ox r0 = X.C170918Hz.A0E(r3, r1)
            java.lang.String r0 = r0.name_
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00d9
            boolean r0 = r8.A0E(r4)
            if (r0 != 0) goto L_0x00dc
            java.lang.String r0 = "MessageUtil/isUnknown/ViewProductAction"
            goto L_0x0011
        L_0x00d9:
            int r1 = r1 + 1
            goto L_0x00ab
        L_0x00dc:
            r0 = 362(0x16a, float:5.07E-43)
            boolean r0 = r8.A0E(r0)
            if (r0 == 0) goto L_0x00e8
            java.lang.String r0 = "MessageUtil/isUnknown/buttonsMessage"
            goto L_0x0011
        L_0x00e8:
            X.9Yd r3 = r6.A01(r10)
            if (r3 == 0) goto L_0x00f8
            boolean r0 = r3.A0B(r8, r10)
            if (r0 == 0) goto L_0x00f8
            java.lang.String r0 = "MessageUtil/isUnknown/nativeFlowNoviHubMessage"
            goto L_0x0011
        L_0x00f8:
            int r0 = r10.bitField1_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x010a
            r0 = 544(0x220, float:7.62E-43)
            boolean r0 = r8.A0E(r0)
            if (r0 != 0) goto L_0x010a
            java.lang.String r0 = "MessageUtil/isUnknown/paymentInviteMessage"
            goto L_0x0011
        L_0x010a:
            int r0 = r10.bitField1_
            r0 = r0 & 8
            boolean r0 = X.AnonymousClass000.A1P(r0)
            if (r0 == 0) goto L_0x012b
            X.8SV r0 = r10.interactiveMessage_
            if (r0 != 0) goto L_0x011a
            X.8SV r0 = X.AnonymousClass8SV.DEFAULT_INSTANCE
        L_0x011a:
            int r1 = r0.interactiveMessageCase_
            r0 = 4
            if (r1 != r0) goto L_0x012b
            r0 = 832(0x340, float:1.166E-42)
            boolean r0 = r8.A0E(r0)
            if (r0 == 0) goto L_0x012b
            java.lang.String r0 = "MessageUtil/isUnknown/shopsStorefrontMessage"
            goto L_0x0011
        L_0x012b:
            int r0 = r10.bitField1_
            r0 = r0 & 8
            boolean r0 = X.AnonymousClass000.A1P(r0)
            if (r0 == 0) goto L_0x014c
            X.8SV r0 = r10.interactiveMessage_
            if (r0 != 0) goto L_0x013b
            X.8SV r0 = X.AnonymousClass8SV.DEFAULT_INSTANCE
        L_0x013b:
            int r1 = r0.interactiveMessageCase_
            r0 = 6
            if (r1 != r0) goto L_0x014c
            r0 = 1133(0x46d, float:1.588E-42)
            boolean r0 = r8.A0E(r0)
            if (r0 == 0) goto L_0x014c
            java.lang.String r0 = "MessageUtil/isUnknown/nativeFlowMessage"
            goto L_0x0011
        L_0x014c:
            int r0 = r10.bitField1_
            r0 = r0 & 8
            boolean r0 = X.AnonymousClass000.A1P(r0)
            if (r0 == 0) goto L_0x018e
            X.8SV r0 = r10.interactiveMessage_
            r2 = r0
            r1 = r0
            if (r0 != 0) goto L_0x015e
            X.8SV r0 = X.AnonymousClass8SV.DEFAULT_INSTANCE
        L_0x015e:
            int r0 = r0.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x018e
            if (r2 != 0) goto L_0x0168
            X.8SV r1 = X.AnonymousClass8SV.DEFAULT_INSTANCE
        L_0x0168:
            X.8SN r0 = r1.header_
            if (r0 != 0) goto L_0x016e
            X.8SN r0 = X.AnonymousClass8SN.DEFAULT_INSTANCE
        L_0x016e:
            boolean r0 = r0.A0u()
            if (r0 == 0) goto L_0x018e
            if (r2 != 0) goto L_0x0178
            X.8SV r2 = X.AnonymousClass8SV.DEFAULT_INSTANCE
        L_0x0178:
            X.8SN r0 = r2.header_
            if (r0 != 0) goto L_0x017e
            X.8SN r0 = X.AnonymousClass8SN.DEFAULT_INSTANCE
        L_0x017e:
            int r1 = r0.mediaCase_
            r0 = 9
            if (r1 != r0) goto L_0x018e
            boolean r0 = r8.A0E(r4)
            if (r0 != 0) goto L_0x018e
            java.lang.String r0 = "MessageUtil/isUnknown/SingleProductMessage"
            goto L_0x0011
        L_0x018e:
            int r0 = r10.bitField1_
            r0 = r0 & 8
            boolean r0 = X.AnonymousClass000.A1P(r0)
            if (r0 == 0) goto L_0x01e5
            X.8SV r0 = r10.interactiveMessage_
            r2 = r0
            if (r0 != 0) goto L_0x019f
            X.8SV r0 = X.AnonymousClass8SV.DEFAULT_INSTANCE
        L_0x019f:
            int r0 = r0.interactiveMessageCase_
            r1 = 7
            if (r0 != r1) goto L_0x01e5
            if (r2 != 0) goto L_0x01a8
            X.8SV r2 = X.AnonymousClass8SV.DEFAULT_INSTANCE
        L_0x01a8:
            int r0 = r2.interactiveMessageCase_
            if (r0 != r1) goto L_0x01e2
            java.lang.Object r4 = r2.interactiveMessage_
            X.8P4 r4 = (X.AnonymousClass8P4) r4
        L_0x01b0:
            r2 = 0
        L_0x01b1:
            X.B6c r0 = r4.cards_
            int r0 = r0.size()
            if (r2 >= r0) goto L_0x01e5
            X.B6c r0 = r4.cards_
            java.lang.Object r1 = r0.get(r2)
            X.8SV r1 = (X.AnonymousClass8SV) r1
            int r0 = r1.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x01df
            X.8SN r0 = r1.header_
            if (r0 != 0) goto L_0x01cd
            X.8SN r0 = X.AnonymousClass8SN.DEFAULT_INSTANCE
        L_0x01cd:
            int r1 = r0.mediaCase_
            r0 = 9
            if (r1 != r0) goto L_0x01df
            r0 = 7177(0x1c09, float:1.0057E-41)
            boolean r0 = r8.A0E(r0)
            if (r0 != 0) goto L_0x01e5
            java.lang.String r0 = "MessageUtil/isUnknown/ProducuctCarouselMessage"
            goto L_0x0011
        L_0x01df:
            int r2 = r2 + 1
            goto L_0x01b1
        L_0x01e2:
            X.8P4 r4 = X.AnonymousClass8P4.DEFAULT_INSTANCE
            goto L_0x01b0
        L_0x01e5:
            int r0 = r10.bitField1_
            r0 = r0 & 32
            if (r0 == 0) goto L_0x020e
            r0 = 1435(0x59b, float:2.011E-42)
            boolean r0 = r8.A0E(r0)
            if (r0 == 0) goto L_0x01f7
            java.lang.String r0 = "MessageUtil/isUnknown/interactiveResponseMessage"
            goto L_0x0011
        L_0x01f7:
            X.8QZ r0 = r10.interactiveResponseMessage_
            if (r0 != 0) goto L_0x01fd
            X.8QZ r0 = X.AnonymousClass8QZ.DEFAULT_INSTANCE
        L_0x01fd:
            int r1 = r0.interactiveResponseMessageCase_
            r0 = 2
            if (r1 != r0) goto L_0x020e
            r0 = 1436(0x59c, float:2.012E-42)
            boolean r0 = r8.A0E(r0)
            if (r0 == 0) goto L_0x020e
            java.lang.String r0 = "MessageUtil/isUnknown/interactiveResponseMessage/NativeFlowResponse"
            goto L_0x0011
        L_0x020e:
            int r0 = r10.bitField1_
            r0 = r0 & 64
            boolean r0 = X.AnonymousClass000.A1P(r0)
            java.lang.String r2 = "MessageUtil/isUnknown/pollCreationMessage"
            if (r0 == 0) goto L_0x0224
            boolean r0 = X.AnonymousClass6HF.A01(r8)
            if (r0 != 0) goto L_0x0224
        L_0x0220:
            com.whatsapp.util.Log.e((java.lang.String) r2)
            return r5
        L_0x0224:
            int r1 = r10.bitField1_
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0233
            boolean r0 = X.AnonymousClass6HF.A00(r8)
            if (r0 != 0) goto L_0x0233
            goto L_0x0220
        L_0x0233:
            int r0 = r10.bitField1_
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x026f
            X.8Qj r0 = r10.pollUpdateMessage_
            if (r0 != 0) goto L_0x023f
            X.8Qj r0 = X.C173098Qj.DEFAULT_INSTANCE
        L_0x023f:
            int r0 = A00(r0)
            if (r0 > 0) goto L_0x0014
            X.8Qj r0 = r10.pollUpdateMessage_
            if (r0 != 0) goto L_0x024b
            X.8Qj r0 = X.C173098Qj.DEFAULT_INSTANCE
        L_0x024b:
            int r0 = r0.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0263
            boolean r0 = X.AnonymousClass6HF.A01(r8)
            if (r0 != 0) goto L_0x0263
            r0 = 1541(0x605, float:2.16E-42)
            boolean r0 = r8.A0E(r0)
            if (r0 != 0) goto L_0x0263
            java.lang.String r0 = "MessageUtil/isUnknown/pollVoteMessage"
            goto L_0x0011
        L_0x0263:
            X.8Qj r0 = r10.pollUpdateMessage_
            if (r0 != 0) goto L_0x0269
            X.8Qj r0 = X.C173098Qj.DEFAULT_INSTANCE
        L_0x0269:
            int r0 = r0.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0014
        L_0x026f:
            int r0 = r10.bitField1_
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x027e
            r0 = 2802(0xaf2, float:3.926E-42)
            boolean r0 = r8.A0E(r0)
            if (r0 != 0) goto L_0x027e
            return r5
        L_0x027e:
            int r0 = r10.bitField1_
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0305
            r0 = 2189(0x88d, float:3.067E-42)
            boolean r0 = r8.A0E(r0)
            if (r0 == 0) goto L_0x029a
            r0 = 4089(0xff9, float:5.73E-42)
            boolean r0 = r8.A0E(r0)
            if (r0 != 0) goto L_0x029e
            boolean r0 = r7.A0O(r9)
            if (r0 == 0) goto L_0x029e
        L_0x029a:
            java.lang.String r0 = "MessageUtil/isUnknown/ProtocolMessage has unknown tag"
            goto L_0x0011
        L_0x029e:
            X.8Nk r0 = r10.editedMessage_
            if (r0 != 0) goto L_0x02a4
            X.8Nk r0 = X.C172328Nk.DEFAULT_INSTANCE
        L_0x02a4:
            X.8SX r1 = r0.message_
            if (r1 != 0) goto L_0x02aa
            X.8SX r1 = X.AnonymousClass8SX.DEFAULT_INSTANCE
        L_0x02aa:
            boolean r0 = r1.A0y()
            if (r0 == 0) goto L_0x029a
            X.8SQ r1 = r1.protocolMessage_
            if (r1 != 0) goto L_0x02b6
            X.8SQ r1 = X.AnonymousClass8SQ.DEFAULT_INSTANCE
        L_0x02b6:
            int r0 = r1.bitField0_
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x029a
            X.8SX r4 = r1.editedMessage_
            if (r4 != 0) goto L_0x02c2
            X.8SX r4 = X.AnonymousClass8SX.DEFAULT_INSTANCE
        L_0x02c2:
            int r1 = r4.bitField1_
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x02d5
            X.8Nk r0 = r4.groupMentionedMessage_
            if (r0 != 0) goto L_0x02cf
            X.8Nk r0 = X.C172328Nk.DEFAULT_INSTANCE
        L_0x02cf:
            X.8SX r4 = r0.message_
            if (r4 != 0) goto L_0x02d5
            X.8SX r4 = X.AnonymousClass8SX.DEFAULT_INSTANCE
        L_0x02d5:
            int r1 = r4.bitField0_
            r0 = r1 & 1
            if (r0 != 0) goto L_0x0305
            r0 = r1 & 32
            if (r0 != 0) goto L_0x0305
            boolean r0 = r4.A0v()
            if (r0 == 0) goto L_0x02ee
            r0 = 7358(0x1cbe, float:1.0311E-41)
            boolean r0 = r8.A0E(r0)
            r2 = 1
            if (r0 != 0) goto L_0x02ef
        L_0x02ee:
            r2 = 0
        L_0x02ef:
            int r1 = r4.bitField0_
            r0 = r1 & 4
            if (r0 != 0) goto L_0x0305
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x0305
            r0 = r1 & 64
            if (r0 != 0) goto L_0x0305
            int r0 = r4.bitField1_
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 != 0) goto L_0x0305
            if (r2 == 0) goto L_0x029a
        L_0x0305:
            X.8SX r1 = X.AnonymousClass9ZT.A01(r8, r10)
            boolean r0 = r1.A0y()
            if (r0 == 0) goto L_0x031d
            X.8SQ r0 = r1.protocolMessage_
            if (r0 != 0) goto L_0x0315
            X.8SQ r0 = X.AnonymousClass8SQ.DEFAULT_INSTANCE
        L_0x0315:
            int r0 = A00(r0)
            if (r0 <= 0) goto L_0x031d
            goto L_0x029a
        L_0x031d:
            boolean r0 = r10.A10()
            if (r0 == 0) goto L_0x032f
            if (r3 == 0) goto L_0x032f
            boolean r0 = r3.A0C(r8, r10)
            if (r0 == 0) goto L_0x032f
            java.lang.String r0 = "MessageUtil/isUnknown/templateNativeFlowMessage"
            goto L_0x0011
        L_0x032f:
            int r1 = r10.bitField1_
            r0 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0340
            boolean r0 = X.C34681hT.A0M(r8)
            if (r0 != 0) goto L_0x0340
            java.lang.String r0 = "MessageUtil/isUnknown/scheduledCallCreationMessage"
            goto L_0x0011
        L_0x0340:
            int r1 = r10.bitField1_
            r0 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0351
            boolean r0 = X.C34681hT.A0M(r8)
            if (r0 != 0) goto L_0x0351
            java.lang.String r0 = "MessageUtil/isUnknown/hasScheduledCallEditMessage"
            goto L_0x0011
        L_0x0351:
            int r1 = r10.bitField1_
            r0 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0364
            r0 = 3355(0xd1b, float:4.701E-42)
            boolean r0 = r8.A0E(r0)
            if (r0 != 0) goto L_0x0364
            java.lang.String r0 = "MessageUtil/isUnknown/ptvMessage"
            goto L_0x0011
        L_0x0364:
            boolean r0 = r10.A0u()
            if (r0 == 0) goto L_0x0376
            r0 = 4165(0x1045, float:5.836E-42)
            boolean r0 = r8.A0E(r0)
            if (r0 != 0) goto L_0x0376
            java.lang.String r0 = "MessageUtil/isUnknown/botInvokeMessage"
            goto L_0x0011
        L_0x0376:
            int r1 = r10.bitField1_
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0387
            boolean r0 = X.C36401kF.A1Z(r8)
            if (r0 != 0) goto L_0x0387
            java.lang.String r0 = "MessageUtil/isUnknown/commentMessage"
            goto L_0x0011
        L_0x0387:
            int r1 = r10.bitField1_
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0392
            java.lang.String r0 = "MessageUtil/isUnknown/BCallMessage"
            goto L_0x0011
        L_0x0392:
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x03a3
            r0 = 5192(0x1448, float:7.276E-42)
            boolean r0 = r8.A0E(r0)
            if (r0 != 0) goto L_0x03a3
            java.lang.String r0 = "MessageUtil/isUnknown/historyBundle"
            goto L_0x0011
        L_0x03a3:
            boolean r0 = r10.A0v()
            if (r0 == 0) goto L_0x03b5
            r0 = 5563(0x15bb, float:7.795E-42)
            boolean r0 = r8.A0E(r0)
            if (r0 != 0) goto L_0x03b5
            java.lang.String r0 = "MessageUtil/isUnknown/EventMessage"
            goto L_0x0011
        L_0x03b5:
            int r1 = r10.bitField1_
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x03c8
            r0 = 6535(0x1987, float:9.157E-42)
            boolean r0 = r8.A0E(r0)
            if (r0 != 0) goto L_0x03c8
            java.lang.String r0 = "MessageUtil/isUnknown/NewsletterAdminInvite"
            goto L_0x0011
        L_0x03c8:
            int r1 = r10.bitField1_
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r1 = r1 & r0
            boolean r0 = X.AnonymousClass000.A1P(r1)
            if (r0 == 0) goto L_0x03df
            r0 = 5692(0x163c, float:7.976E-42)
            boolean r0 = r8.A0E(r0)
            if (r0 != 0) goto L_0x03df
            java.lang.String r0 = "MessageUtil/isUnknown/lottieMessage"
            goto L_0x0011
        L_0x03df:
            int r0 = r10.bitField2_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0409
            X.8Nu r0 = r10.placeholderMessage_
            if (r0 != 0) goto L_0x03eb
            X.8Nu r0 = X.C172428Nu.DEFAULT_INSTANCE
        L_0x03eb:
            int r0 = r0.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0014
            r0 = 6673(0x1a11, float:9.351E-42)
            boolean r0 = r8.A0E(r0)
            if (r0 != 0) goto L_0x0409
            return r5
        L_0x03fa:
            if (r1 != 0) goto L_0x03fe
            X.8Nk r1 = X.C172328Nk.DEFAULT_INSTANCE
        L_0x03fe:
            X.8SX r0 = r1.message_
            if (r0 != 0) goto L_0x0404
            X.8SX r0 = X.AnonymousClass8SX.DEFAULT_INSTANCE
        L_0x0404:
            boolean r0 = A04(r6, r7, r8, r9, r0)
            return r0
        L_0x0409:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202839mk.A04(X.1am, X.12q, X.0yC, X.11F, X.8SX):boolean");
    }
}
