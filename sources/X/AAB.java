package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.LinkedList;

public final /* synthetic */ class AAB implements C22934Ayk {
    public final /* synthetic */ AnonymousClass6EZ A00;
    public final /* synthetic */ C31731cI A01;
    public final /* synthetic */ C207209uj A02;

    public /* synthetic */ AAB(AnonymousClass6EZ r1, C31731cI r2, C207209uj r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public final void BJg(byte[] bArr) {
        StringBuilder A0u;
        String str;
        char c;
        AnonymousClass18B th;
        C31731cI r5 = this.A01;
        C207209uj r3 = this.A02;
        AnonymousClass6EZ r4 = this.A00;
        byte[] A022 = C200429hO.A02((C45832Sw) null, (C177808eP) null, bArr);
        if (A022 == null) {
            A0u = AnonymousClass000.A0u();
            str = "axolotl derived invalid plaintext; stanzaKey=";
        } else {
            try {
                AnonymousClass8SX A0i = AnonymousClass8SX.A0i(A022);
                ArrayList A012 = C202839mk.A01(A0i);
                if (A012.size() != 0) {
                    A0u = AnonymousClass000.A0u();
                    A0u.append("axolotl received an invalid protobuf; stanzaKey=");
                    A0u.append(r3);
                    A0u.append("; messageTypes=");
                    A0u.append(A012);
                    Log.w(A0u.toString());
                } else if ((A0i.bitField0_ & 16384) != 0) {
                    C36321k7.A1K(r3, "axolotl received sender key distribution message; stanzaKey=", AnonymousClass000.A0u());
                    AnonymousClass8PE r2 = A0i.fastRatchetKeySenderKeyDistributionMessage_;
                    if (r2 == null) {
                        r2 = AnonymousClass8PE.DEFAULT_INSTANCE;
                    }
                    int i = r2.bitField0_;
                    if ((i & 1) == 0 || (i & 2) == 0) {
                        A0u = AnonymousClass000.A0u();
                        str = "axolotl received incomplete sender key distribution message; stanzaKey=";
                    } else {
                        AnonymousClass6EU r6 = new AnonymousClass6EU(r4, C177518dv.A00.getRawString());
                        AnonymousClass189 r1 = r5.A03;
                        byte[] A06 = r2.axolotlSenderKeyDistributionMessage_.A06();
                        AnonymousClass79X A013 = AnonymousClass18I.A01(r1.A0K, r6);
                        A013.lock();
                        try {
                            C235218u r12 = r1.A00;
                            if (A06.length != 0) {
                                C21802Aac aac = new C21802Aac(A06);
                                AnonymousClass9Q7 r0 = new AnonymousClass9Q7(r12.A02.A01);
                                C1268866a A023 = AnonymousClass6R2.A02(r6);
                                synchronized (AnonymousClass9A8.A00) {
                                    try {
                                        C234518n r62 = r0.A00;
                                        C198519dh A024 = r62.A02(A023);
                                        int i2 = aac.A00;
                                        int i3 = aac.A01;
                                        byte[][] bArr2 = aac.A04;
                                        C21665AUh aUh = aac.A02;
                                        LinkedList linkedList = A024.A00;
                                        linkedList.addFirst(new C198529di(aUh, C22734Auy.A00, bArr2, i2, i3));
                                        if (linkedList.size() > 5) {
                                            linkedList.removeLast();
                                        }
                                        r62.A04(A023, A024);
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                                c = 0;
                                A013.close();
                                if (c == 64531) {
                                    A0u = AnonymousClass000.A0u();
                                    str = "axolotl received invalid sender key distribution message; stanzaKey=";
                                } else if (c == 64529) {
                                    A0u = AnonymousClass000.A0u();
                                    str = "axolotl received legacy sender key distribution message; stanzaKey=";
                                } else {
                                    return;
                                }
                            } else {
                                th = new AnonymousClass18B("Data is empty");
                                throw th;
                            }
                        } catch (AnonymousClass18A e) {
                            Log.w("axolotl", e);
                            c = 64529;
                        } catch (AnonymousClass18B e2) {
                            Log.w("axolotl", e2);
                            c = 64531;
                        } catch (Exception e3) {
                            Log.w("axolotl", e3);
                            c = 64536;
                        } catch (Throwable th3) {
                            try {
                                A013.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    }
                } else {
                    return;
                }
            } catch (AnonymousClass186 e4) {
                Log.w(AnonymousClass000.A0l(r3, "axolotl derived plaintext does not represent valid protocol buffer; stanzaKey=", AnonymousClass000.A0u()), e4);
                return;
            }
        }
        A0u.append(str);
        A0u.append(r3);
        Log.w(A0u.toString());
    }
}
