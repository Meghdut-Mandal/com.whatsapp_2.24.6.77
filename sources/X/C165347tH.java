package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: X.7tH  reason: invalid class name and case insensitive filesystem */
public class C165347tH implements C236119d {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C165347tH(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj2;
        this.A02 = obj4;
        this.A03 = obj3;
        this.A01 = obj;
    }

    public void BVN(String str) {
        if (this.A04 != 0) {
            C36321k7.A1P("encb/EncryptedBackupProtocolHelper/sendBeginLoginIq/onDeliveryFailure id=", str, AnonymousClass000.A0u());
            ((C148226yW) this.A01).BWq("delivery failure", 3, -1);
            return;
        }
        ((C1261962x) this.A01).A00(str, "Delivery failure", -1);
    }

    public void BWw(C203399nx r5, String str) {
        String str2;
        if (this.A04 != 0) {
            C24441Cl.A00(r5, (C148226yW) this.A01, str);
            return;
        }
        int i = -1;
        try {
            i = ((C184428sQ) ((C184818t3) C203539oF.A06(r5, new C165017sk(C90514aH.A0e(r5, (C592133b) this.A02), 2), new String[0])).A00).A00().intValue();
            str2 = "Valid error code returned from server for serialized lookup";
        } catch (C235919b unused) {
            str2 = "Couldn't parse the IQ error for serialized lookup.";
        } catch (NumberFormatException unused2) {
            str2 = "Couldn't parse the error code for serialized lookup.";
        }
        ((C1261962x) this.A01).A00(str, str2, i);
    }

    public void BiM(C203399nx r29, String str) {
        Integer num;
        C87954Qv r0;
        int i;
        boolean z;
        int i2;
        int i3;
        Long l;
        AnonymousClass3DG r3;
        Integer num2;
        long j;
        byte[] bArr;
        C117605mX r9;
        int i4;
        C203399nx r12 = r29;
        String str2 = str;
        if (this.A04 != 0) {
            byte[] bArr2 = (byte[]) this.A02;
            C592133b r32 = (C592133b) this.A03;
            C101504xo r02 = (C101504xo) this.A01;
            C36321k7.A1Q("encb/EncryptedBackupProtocolHelper/beginLoginOnSuccess id=", str2, AnonymousClass000.A0u());
            try {
                C203399nx A0e = C90514aH.A0e(r12, r32);
                Class<byte[]> cls = byte[].class;
                byte[] bArr3 = (byte[]) C203379ns.A03(r12, cls, C90474aD.A0Y(), 1024L, (Object) null, new String[]{"l2", "#elementValue"}, false);
                byte[] bArr4 = (byte[]) C203379ns.A03(r12, cls, 64L, 64, (Object) null, new String[]{"l2_sig", "#elementValue"}, false);
                C203539oF.A06(r12, new C165017sk(A0e, 4), new String[0]);
                C203539oF.A06(r12, C148076yH.A00, new String[0]);
                C203379ns.A02(r12, C148086yI.A00, new String[]{"count"});
                C35831jK r7 = (C35831jK) C203379ns.A02(r12, C148096yJ.A00, new String[]{"backoff"});
                C203379ns.A02(r12, C148106yK.A00, new String[]{"max_attempts"});
                if (r7 == null) {
                    j = 0;
                } else {
                    j = C36431kI.A09(r7.A00);
                }
                byte[] bArr5 = C24441Cl.A01;
                int length = bArr3.length;
                byte[] bArr6 = new byte[(length + 1)];
                System.arraycopy(bArr5, 0, bArr6, 0, 1);
                System.arraycopy(bArr3, 0, bArr6, 1, length);
                if (!C132936Vw.A02(bArr6, bArr4, bArr2)) {
                    C36321k7.A1P("encb/EncryptedBackupProtocolHelper/beginLoginOnSuccess/l2 cannot be verified with l2_sig and ed_pub id=", str2, AnonymousClass000.A0u());
                    r02.BWq("l2 cannot be verified with l2_sig and ed_pub", 2, -1);
                    return;
                }
                int i5 = (int) j;
                r02.A00.A01();
                Object obj = r02.A0B;
                synchronized (obj) {
                    try {
                        bArr = r02.A06;
                        r9 = r02.A03;
                        i4 = r02.A01;
                    } catch (Throwable th) {
                        while (true) {
                            th = th;
                        }
                        throw th;
                    }
                }
                C18740tg.A06(r9);
                C18740tg.A06(bArr);
                C117585mV r6 = new C117585mV((NativeHolder) JniBridge.jvidispatchOIOOO(3, (long) 100000, r9.A00, bArr, bArr3));
                JniBridge.getInstance();
                NativeHolder nativeHolder = r6.A00;
                int jvidispatchIIO = (int) JniBridge.jvidispatchIIO(1, (long) 86, nativeHolder);
                if (jvidispatchIIO == -1) {
                    r02.A08.BWr("Login Failure Invalid Password", 8, 2, i4 - 1, i5);
                    return;
                } else if (jvidispatchIIO != 0) {
                    r02.A08.BWr(AnonymousClass000.A0r("WESOpaqueClientCreateLoginFinish failed with WESOpaqueStatusType=", AnonymousClass000.A0u(), jvidispatchIIO), 4, 2, -1, -1);
                    return;
                } else {
                    JniBridge.getInstance();
                    byte[] bArr7 = (byte[]) JniBridge.jvidispatchOIO(0, (long) 89, nativeHolder);
                    synchronized (obj) {
                        try {
                            r02.A02 = r6;
                            r02.A07 = bArr7;
                            r02.A00 = 2;
                        } catch (Throwable th2) {
                            while (true) {
                                th = th2;
                                break;
                            }
                        }
                    }
                    r02.A02();
                    return;
                }
            } catch (C235919b e) {
                Log.e("encb/EncryptedBackupProtocolHelper/beginLoginOnSuccess/invalid server response", e);
                r02.BWq("invalid server response", 1, -1);
                return;
            }
        } else {
            try {
                C165017sk.A00(C90514aH.A0e(r12, (C592133b) this.A02), r12, 3);
                ArrayList A0C = C203379ns.A0C(r12, C147986y7.A00, new String[]{"single_serialized_proof"}, 1, Long.MAX_VALUE);
                String[] strArr = (String[]) this.A03;
                int length2 = strArr.length;
                if (length2 != A0C.size()) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("keytransparencyprotocolhelper/sendmultiserializedlookupiq Requested number of multi serialized lookups do not match the received proofs: ");
                    A0u.append(length2);
                    C36341k9.A1N(" vs. ", A0u, A0C);
                    C36321k7.A1Z(A0u, ". Parsing canceled.");
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    C36341k9.A1N("Server returned response has ", A0u2, A0C);
                    A0u2.append(" proof response(s) whereas the request included ");
                    A0u2.append(length2);
                    ((C1261962x) this.A01).A00(str2, AnonymousClass000.A0q(" label(s).", A0u2), -1);
                    return;
                }
                byte[][] bArr8 = new byte[length2][];
                byte[][] bArr9 = new byte[length2][];
                byte[][] bArr10 = new byte[length2][];
                int[] iArr = new int[length2];
                for (int i6 = 0; i6 < A0C.size(); i6++) {
                    ((AnonymousClass7i4) ((C184068rq) A0C.get(i6)).A00).Azw(new C123845xB(this, iArr, bArr8, bArr9, bArr10, i6));
                }
                C1261962x r8 = (C1261962x) this.A01;
                Arrays.toString(strArr);
                int i7 = 0;
                int i8 = 0;
                for (int i9 = 0; i9 < length2; i9++) {
                    int i10 = iArr[i9];
                    if (i10 != 0) {
                        if (i10 == 16792) {
                            i7++;
                        } else {
                            i8++;
                        }
                    }
                }
                if (i8 != 0) {
                    num = C023109s.A0C;
                } else if (i7 != 0) {
                    num = C023109s.A01;
                } else {
                    num = C023109s.A00;
                }
                Integer num3 = C023109s.A0C;
                if (num == num3) {
                    Log.e("One of the proof requests returned error. Failing verification and returning a not found.");
                    r3 = r8.A00;
                    num2 = C113755g4.A00;
                } else if (num == C023109s.A01) {
                    Log.e("One of the proof requests returned pending. Pending verification.");
                    r3 = r8.A00;
                    num2 = C113755g4.A01;
                } else {
                    HashMap A0J = AnonymousClass001.A0J();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length2) {
                            A0J.size();
                            r0 = r8.A00.A01;
                            num3 = C023109s.A00;
                            break;
                        }
                        byte[] bArr11 = bArr10[i11];
                        byte[] bArr12 = bArr8[i11];
                        byte[] bArr13 = bArr9[i11];
                        C18750th.A06(bArr12);
                        AnonymousClass3P5 r14 = r8.A01;
                        byte[] bArr14 = AnonymousClass3P5.A08;
                        C19970wo r17 = r14.A00;
                        long A002 = C19970wo.A00(r17);
                        byte[] bytes = strArr[i11].getBytes();
                        byte[] bArr15 = r8.A02[i11];
                        if (bArr12 == null || bytes == null || bArr15 == null) {
                            i2 = -8;
                            z = false;
                        } else {
                            C117335m6 r03 = new C117335m6((NativeHolder) JniBridge.jvidispatchOOOOO(4, bArr12, bytes, bArr11, bArr15));
                            JniBridge.getInstance();
                            i2 = (int) JniBridge.jvidispatchIIO(1, (long) 79, r03.A00);
                            if (i2 == 0) {
                                byte[] bArr16 = (byte[]) A0J.get(bArr12);
                                if (bArr16 == null || !Arrays.equals(bArr16, bArr13)) {
                                    byte[] bArr17 = AnonymousClass3P5.A08;
                                    try {
                                        AnonymousClass604 r22 = new AnonymousClass604();
                                        int length3 = bArr13.length;
                                        int length4 = bArr12.length;
                                        int i12 = length3 + length4;
                                        byte[] bArr18 = new byte[i12];
                                        System.arraycopy(bArr13, 0, bArr18, 0, length3);
                                        System.arraycopy(bArr12, 0, bArr18, length3, length4);
                                        int A003 = AnonymousClass98E.A00(r22, new byte[i12], bArr18, bArr17, (long) i12);
                                        i2 = -9;
                                        if (A003 == 0) {
                                            i = 0;
                                            A0J.put(ByteBuffer.wrap(bArr12), bArr13);
                                        }
                                    } catch (AnonymousClass78O | IllegalArgumentException e2) {
                                        Log.e("keytransparencymanager/verifyEd25519Signature/exception.", e2);
                                        i2 = -9;
                                    }
                                } else {
                                    i = 0;
                                }
                                z = true;
                            }
                            z = false;
                        }
                        long A004 = C19970wo.A00(r17);
                        C119665qF r10 = r14.A02;
                        Integer valueOf = Integer.valueOf(i);
                        Boolean valueOf2 = Boolean.valueOf(z);
                        Long valueOf3 = Long.valueOf(A002);
                        Long valueOf4 = Long.valueOf(A004);
                        if (r10.A00.A0E(2966)) {
                            if (valueOf == null || valueOf.intValue() == 0) {
                                boolean A1X = C36371kC.A1X(valueOf2, true);
                                i3 = 2;
                                if (A1X) {
                                    i3 = 0;
                                }
                            } else {
                                i3 = 1;
                            }
                            Long l2 = null;
                            if (valueOf4 == null || valueOf3 == null || A002 > A004 || (l = C90504aG.A0h(A004, A002)) == null || i3 != 0) {
                                l = null;
                            }
                            C1039557s r1 = new C1039557s();
                            r1.A00 = 0;
                            r1.A02 = l;
                            r1.A01 = Integer.valueOf(i3);
                            if (valueOf != null) {
                                l2 = C90484aE.A0h(valueOf);
                            }
                            r1.A03 = l2;
                            r10.A01.Bly(r1);
                        }
                        if (!z) {
                            Log.e("Proof verification failed. Returning failure.");
                            r0 = r8.A00.A01;
                            break;
                        }
                        i11++;
                    }
                    r0.BU5(num3);
                    return;
                }
                int intValue = num2.intValue();
                r0 = r3.A01;
                if (intValue == 16792) {
                    num3 = C023109s.A01;
                }
                r0.BU5(num3);
                return;
            } catch (C235919b e3) {
                ((C1261962x) this.A01).A00(str2, "IQ error encountered on client sending multi serialized lookup request (e.g., wrong SMAX in server response).", -1);
                e3.printStackTrace();
                return;
            }
        }
        throw th;
    }
}
