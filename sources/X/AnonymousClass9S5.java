package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.util.Objects;

/* renamed from: X.9S5  reason: invalid class name */
public class AnonymousClass9S5 {
    public final AnonymousClass189 A00;
    public final C20810yC A01;
    public final C30841ar A02;
    public final C23084B3s A03;
    public final C19770wU A04;

    public C131106Nt A00(AnonymousClass6EZ r26, C45832Sw r27, C177808eP r28, AnonymousClass630 r29, boolean z) {
        Integer num;
        C22934Ayk aac;
        C131106Nt r0;
        byte[] bArr;
        AnonymousClass630 r1 = r29;
        if (r29 != null) {
            num = Integer.valueOf(r1.A00);
        } else {
            num = null;
        }
        C30841ar r11 = this.A02;
        C23084B3s b3s = this.A03;
        AnonymousClass6EZ r10 = r26;
        C45832Sw r2 = r27;
        boolean z2 = z;
        if (!r11.A05.A0E(5760) || !AnonymousClass143.A0H(b3s.BGc())) {
            int B9i = b3s.B9i();
            if (B9i == 1) {
                if (z) {
                    C18740tg.A0E(b3s instanceof C21337AHp, "Only message stanza is supported for enc v1");
                    r2.A0E = C90474aD.A0Y();
                    aac = new AAA(C36371kC.A0Z(r11.A01.A00.A00), (C21337AHp) b3s);
                } else {
                    throw AnonymousClass001.A09("receipt sending has been disabled for a v1 encrypted message");
                }
            } else if (B9i == 2) {
                r2.A0E = 2L;
                if (num == null || num.intValue() != 4) {
                    aac = r11.A02.A00(r10, r2, b3s, num, z2, true);
                } else {
                    C30881av r4 = r11.A03;
                    AAF A002 = r11.A02.A00(r10, r2, b3s, num, false, false);
                    C18800tq r3 = r4.A00.A00;
                    C20810yC A0V = C36341k9.A0V(r3);
                    AnonymousClass1A1 A0n = C36351kA.A0n(r3);
                    aac = new AAE((AnonymousClass1DT) r3.A55.get(), A002, (C29611Xh) r3.A3a.get(), (AnonymousClass176) r3.A4w.get(), (C25301Ft) r3.A58.get(), A0V, (AnonymousClass1VN) r3.A13.get(), (C30571aQ) r3.A2e.get(), (C30121Zh) r3.A5B.get(), (AnonymousClass1DL) r3.A7C.get(), b3s, A0n, num);
                }
            } else {
                C18800tq r7 = r11.A00.A00.A00;
                aac = new AAC(C36341k9.A0V(r7), r2, (C30571aQ) r7.A2e.get(), (AnonymousClass1DL) r7.A7C.get(), (C177808eP) AnonymousClass19L.A00(r11.A06, 0, b3s.BDf()), b3s, B9i, z2);
            }
        } else {
            C18800tq r6 = r11.A04.A00.A00;
            aac = new AAD(C36391kE.A0V(r6), C36371kC.A0Z(r6), r2, (AnonymousClass19L) r6.A4Y.get(), (C29871Yh) r6.A3M.get(), b3s, num, z2);
        }
        if (r29 == null) {
            return null;
        }
        int i = r1.A00;
        if (i == 0) {
            r2.A06 = 0;
            return this.A00.A06(aac, r10, r1.A02);
        } else if (i == 1) {
            r2.A06 = 1;
            return this.A00.A07(aac, r10, r1.A02);
        } else if (i == 2) {
            r2.A06 = 2;
            AnonymousClass11F A003 = AnonymousClass143.A00(b3s.BFE());
            String A032 = AnonymousClass143.A03(AnonymousClass143.A00(b3s.BGc()));
            String A033 = AnonymousClass143.A03(A003);
            if (!(A003 instanceof C177618e5)) {
                C18740tg.A06(A032);
                A033 = A032;
            }
            AnonymousClass6EU r32 = new AnonymousClass6EU(r10, A033);
            AnonymousClass189 r42 = this.A00;
            byte[] bArr2 = r1.A02;
            AnonymousClass79X A012 = AnonymousClass18I.A01(r42.A0K, r32);
            A012.lock();
            try {
                if (r42.A0N.A0E(188)) {
                    C000100b r12 = r42.A01.A04;
                    String str = r32.A01;
                    AnonymousClass6EZ r02 = r32.A00;
                    C192039Fl r03 = new C192039Fl((NativeHolder) JniBridge.jvidispatchOIOOOOO(0, (long) r02.A00, str, AnonymousClass6R2.A01(r02), aac, (NativeHolder) ((JniBridge) r12).wajContext.get(), bArr2));
                    JniBridge.getInstance();
                    NativeHolder nativeHolder = r03.A00;
                    JniBridge.getInstance();
                    r0 = new C131106Nt((byte[]) JniBridge.jvidispatchOIO(0, (long) 55, nativeHolder), (int) JniBridge.jvidispatchIIO(1, (long) 56, nativeHolder));
                } else {
                    C235218u r22 = r42.A00;
                    C234218k r5 = r22.A02.A04;
                    C1268866a A022 = AnonymousClass6R2.A02(r32);
                    try {
                        Objects.requireNonNull(aac);
                        C21801Aab aab = new C21801Aab(aac);
                        if (r22.A04.A00()) {
                            synchronized (C200689hx.A00) {
                                bArr = C200689hx.A00(r5, aab, A022, bArr2);
                            }
                        } else {
                            bArr = C200689hx.A00(r5, aab, A022, bArr2);
                        }
                        r0 = C235218u.A00((Exception) null, bArr, 0);
                    } catch (AnonymousClass18A e) {
                        r0 = C235218u.A00(e, (byte[]) null, -1007);
                    } catch (AnonymousClass18B e2) {
                        r0 = C235218u.A00(e2, (byte[]) null, -1005);
                    } catch (AnonymousClass18C e3) {
                        r0 = C235218u.A00(e3, (byte[]) null, -1001);
                    } catch (AnonymousClass18D e4) {
                        r0 = C235218u.A00(e4, (byte[]) null, -1008);
                    } catch (Exception e5) {
                        Log.w("axolotl", e5);
                        r0 = C235218u.A00(e5, (byte[]) null, -1000);
                    }
                }
                A012.close();
                return r0;
            } catch (Throwable th) {
                try {
                    A012.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else if (i == 4) {
            r2.A06 = C36371kC.A0n();
            if (!this.A01.A0E(4274)) {
                return new C131106Nt(r1.A02, -1006);
            }
            this.A04.Boy(new C1502074j(aac, r1, 12));
            return new C131106Nt(r1.A02, 0);
        } else {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(C165607th.A0g(b3s, "decryptmessagerunnable/axolotl unrecognized ciphertext type; message.key=", A0u));
            C36321k7.A1U(" type=", A0u, i);
            C177808eP r13 = r28;
            if (r28 != null) {
                r13.A02 = false;
            }
            r2.A00 = false;
            r2.A08 = 8;
            return null;
        }
    }

    public AnonymousClass9S5(AnonymousClass189 r1, C20810yC r2, C30841ar r3, C23084B3s b3s, C19770wU r5) {
        this.A01 = r2;
        this.A04 = r5;
        this.A00 = r1;
        this.A03 = b3s;
        this.A02 = r3;
    }
}
