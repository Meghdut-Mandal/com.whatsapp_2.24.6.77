package X;

import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.1YG  reason: invalid class name */
public class AnonymousClass1YG {
    public final AnonymousClass16D A00;
    public final AnonymousClass1IN A01;
    public final AnonymousClass1YF A02;
    public final C20810yC A03;
    public final C21010yW A04;
    public final AnonymousClass1KU A05;
    public final C19770wU A06;
    public final HashMap A07;

    public AnonymousClass1YG(AnonymousClass16D r2, AnonymousClass1IN r3, AnonymousClass1YF r4, C20810yC r5, C21010yW r6, AnonymousClass1KU r7, C19770wU r8, HashMap hashMap) {
        AnonymousClass00C.A0D(r5, 1);
        AnonymousClass00C.A0D(r6, 2);
        AnonymousClass00C.A0D(r3, 3);
        AnonymousClass00C.A0D(r2, 6);
        AnonymousClass00C.A0D(r8, 8);
        this.A03 = r5;
        this.A04 = r6;
        this.A01 = r3;
        this.A02 = r4;
        this.A07 = hashMap;
        this.A00 = r2;
        this.A05 = r7;
        this.A06 = r8;
    }

    public static final AnonymousClass3QA A00(AnonymousClass1YG r2, UserJid userJid) {
        HashMap hashMap = r2.A07;
        AnonymousClass3QA r1 = (AnonymousClass3QA) hashMap.get(userJid);
        if (r1 != null) {
            return r1;
        }
        AnonymousClass3QA r12 = new AnonymousClass3QA(new HashSet());
        hashMap.put(userJid, r12);
        return r12;
    }

    public static final void A01(AnonymousClass1YG r5, UserJid userJid, int i) {
        if (userJid != null) {
            AnonymousClass3QA A002 = A00(r5, userJid);
            if (r5.A01.A00(userJid) instanceof C175418aS) {
                if (C20800yB.A01(C21000yV.A02, r5.A03, 1681)) {
                    HashSet hashSet = new HashSet();
                    hashSet.add(5);
                    hashSet.add(15);
                    hashSet.add(14);
                    hashSet.add(17);
                    hashSet.add(17);
                    hashSet.add(16);
                    hashSet.add(18);
                    Integer valueOf = Integer.valueOf(i);
                    if (hashSet.contains(valueOf)) {
                        HashSet hashSet2 = A002.A03;
                        if (i == 16) {
                            hashSet2.add(15);
                        }
                        if (!hashSet2.add(valueOf)) {
                            return;
                        }
                    }
                    r5.A06.Boy(new C35341iX(r5, A002, userJid, i));
                }
            }
        }
    }

    public void A02(UserJid userJid) {
        A01(this, userJid, 14);
    }

    public void A03(UserJid userJid) {
        A01(this, userJid, 15);
    }

    public void A04(UserJid userJid) {
        A01(this, userJid, 16);
    }
}
