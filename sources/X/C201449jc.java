package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.9jc  reason: invalid class name and case insensitive filesystem */
public final class C201449jc {
    public final AnonymousClass12O A00;
    public final C26191Jf A01;
    public final AnonymousClass1A1 A02;
    public final C000100b A03;
    public final C19730wQ A04;
    public final C26181Je A05;

    public final C195759Vv A02(AnonymousClass11F r5, AnonymousClass8SW r6, C64933Qa r7) {
        if (r6 != null) {
            C19730wQ r1 = this.A04;
            if (r7.A02 || r5 == null) {
                r5 = null;
            }
            return C183338qd.A00(r1, r5, r6, r7, false);
        }
        throw C165567td.A0J(0);
    }

    public final C10830fI A03(C195949Wx r14) {
        Object A022;
        Object r2;
        C64933Qa r5 = r14.A01;
        if (r5 != null) {
            C26191Jf r4 = this.A01;
            AnonymousClass3T1 A032 = this.A02.A03(r4.A01(r5));
            if (A032 != null) {
                byte[] A012 = this.A05.A01(A032.A1N);
                UserJid A013 = A01(A032.A0L(), r14.A03, r5.A02);
                C64933Qa r0 = A032.A1J;
                AnonymousClass00C.A07(r0);
                C64933Qa A023 = r4.A02(r0);
                UserJid userJid = r14.A00;
                byte[] bArr = r14.A04;
                C22558Aon aon = new C22558Aon(r14, this);
                if (A012 == null || A012.length != 32) {
                    Log.e("MessageSecretEncryptionCommons/encryptionParamValidation/message secret missing or invalid");
                    A022 = AnonymousClass00C.A02(C165567td.A0K(66));
                } else if (A023 == null) {
                    Log.e("MessageSecretEncryptionCommons/encryptionParamValidation/parent key is null");
                    A022 = AnonymousClass00C.A02(C165567td.A0K(0));
                } else if (A013 == null) {
                    Log.e("MessageSecretEncryptionCommons/encryptionParamValidation/targetSenderUserJid is null");
                    A022 = AnonymousClass00C.A02(C165567td.A0K(0));
                } else if (userJid == null) {
                    Log.e("MessageSecretEncryptionCommons/encryptionParamValidation/senderUserJid is null");
                    A022 = AnonymousClass00C.A02(C165567td.A0K(0));
                } else {
                    AnonymousClass00C.A0D(bArr, 4);
                    C22941Ayr A002 = A00(userJid, A023, aon.$params.A02);
                    C000100b r7 = aon.this$0.A03;
                    String str = A023.A01;
                    AnonymousClass00C.A07(str);
                    AnonymousClass9IR A003 = AnonymousClass9Zd.A00(A013, userJid, r7, str, aon.$params.A02, A012, A002.B88(), bArr);
                    AnonymousClass8NG A0i = AnonymousClass8SW.A0i();
                    C183338qd.A02(A013, A0i, A023, false);
                    C170918Hz A0R = A0i.A0R();
                    if (A003 == null) {
                        IllegalStateException A09 = AnonymousClass001.A09("Encryption using iJniBridge failed");
                        AnonymousClass00C.A0D(A09, 0);
                        r2 = C90524aI.A0t(A09);
                    } else {
                        r2 = new C10830fI(A003.A00, A003.A01, A0R);
                    }
                    A022 = new AnonymousClass0AK(r2).value;
                }
                AnonymousClass0AN.A00(A022);
                return (C10830fI) A022;
            }
            Log.e("MessageSecretEncryptionCommons/encrypt/target message not found. Cannot proceed further");
            throw C165567td.A0K(71);
        }
        Log.e("MessageSecretEncryptionCommons/encrypt/target message key is null");
        throw C165567td.A0K(0);
    }

    public static final C22941Ayr A00(UserJid userJid, C64933Qa r2, String str) {
        C22941Ayr acg;
        if (AnonymousClass00C.A0J(str, "Poll Vote")) {
            acg = new ACH(userJid, r2);
        } else if (!AnonymousClass00C.A0J(str, "Event Response")) {
            return new ACF();
        } else {
            acg = new ACG(userJid, r2);
        }
        return acg;
    }

    private final UserJid A01(AnonymousClass11F r3, boolean z, boolean z2) {
        UserJid A0e;
        if (z) {
            if (z2) {
                A0e = this.A04.A09();
            } else if (AnonymousClass143.A0I(r3)) {
                AnonymousClass00C.A0E(r3, "null cannot be cast to non-null type com.whatsapp.jid.LidUserJid");
                r3 = (C223313w) r3;
                return (UserJid) r3;
            } else if (!(r3 instanceof PhoneUserJid)) {
                return null;
            } else {
                Log.w("MessageSecretEncryptionCommons/getSenderUserJid/found phone number jid when lid is expected");
                AnonymousClass12O r1 = this.A00;
                AnonymousClass00C.A0E(r3, "null cannot be cast to non-null type com.whatsapp.jid.PhoneUserJid");
                A0e = r1.A09((PhoneUserJid) r3);
            }
        } else if (z2) {
            A0e = C36371kC.A0e(this.A04);
        } else {
            if (r3 == null) {
                return null;
            }
            return (UserJid) r3;
        }
        return A0e;
    }

    public final byte[] A04(AnonymousClass9XK r14) {
        C28541Tb A0J;
        Object obj;
        C64933Qa r2 = r14.A05;
        C64933Qa r9 = A02(r14.A02, r14.A04, r2).A01;
        if (r9 != null) {
            AnonymousClass3T1 A032 = this.A02.A03(this.A01.A01(r9));
            if (A032 == null) {
                Log.i("MessageSecretEncryptionCommons/decrypt/target message was not found. Cannot decrypt the message. Save message as orphan if needed");
                return null;
            }
            byte[] A012 = this.A05.A01(A032.A1N);
            UserJid A013 = A01(A032.A0L(), r14.A07, A032.A1J.A02);
            C21674AUx aUx = r14.A00;
            C21674AUx aUx2 = r14.A01;
            UserJid userJid = r14.A03;
            C22559Aoo aoo = new C22559Aoo(r14, this);
            Integer A0m = C36381kD.A0m();
            if (A012 == null) {
                C36321k7.A1J(r9, "MessageSecretEncryptionCommons/decryptionParamValidation/message secret missing for parent message key: ", AnonymousClass000.A0u());
                A0J = C165567td.A0J(66);
            } else {
                int length = A012.length;
                if (length != 32) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("MessageSecretEncryptionCommons/decryptionParamValidation/message secret of invalid length=");
                    A0u.append(length);
                    C36321k7.A1J(r9, " for parent message key: ", A0u);
                    A0J = C165567td.A0J(67);
                } else if (aUx == null || aUx.A02() != 12) {
                    Log.e("MessageSecretEncryptionCommons/decryptionParamValidation/encIv missing or invalid");
                    A0J = C165567td.A0J(11);
                } else if (aUx2 == null || aUx2.A02() == 0) {
                    Log.e("MessageSecretEncryptionCommons/decryptionParamValidation/encPayload missing or invalid");
                    A0J = C165567td.A0J(11);
                } else if (A013 == null) {
                    Log.e("MessageSecretEncryptionCommons/decryptionParamValidation/targetSenderUserJid is null");
                    A0J = new C28541Tb(A0m);
                } else if (userJid == null) {
                    Log.e("MessageSecretEncryptionCommons/decryptionParamValidation/senderUserJid is null");
                    A0J = new C28541Tb(A0m);
                } else {
                    obj = ((AnonymousClass0AK) aoo.BKv(C165617ti.A0i(aUx), C165617ti.A0i(aUx2), r9, A012, A013, userJid)).value;
                    AnonymousClass0AN.A00(obj);
                    return (byte[]) obj;
                }
            }
            obj = AnonymousClass00C.A02(A0J);
            AnonymousClass0AN.A00(obj);
            return (byte[]) obj;
        }
        Log.e("MessageSecretEncryptionCommons/getMessage/cannot find message for given key");
        throw C165567td.A0J(0);
    }

    public C201449jc(C19730wQ r2, C26181Je r3, AnonymousClass12O r4, C26191Jf r5, AnonymousClass1A1 r6, C000100b r7) {
        C36321k7.A18(r2, r7, r4, r6);
        AnonymousClass00C.A0D(r3, 6);
        this.A04 = r2;
        this.A03 = r7;
        this.A00 = r4;
        this.A02 = r6;
        this.A01 = r5;
        this.A05 = r3;
    }
}
