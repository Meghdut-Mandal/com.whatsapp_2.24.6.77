package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9lC  reason: invalid class name and case insensitive filesystem */
public class C202179lC {
    public HashSet A00 = C36441kJ.A16();
    public HashSet A01 = C36441kJ.A16();
    public List A02 = AnonymousClass001.A0I();
    public final AnonymousClass17Y A03;
    public final C19730wQ A04;
    public final AnonymousClass1EU A05;
    public final AnonymousClass1XC A06;

    public static void A00(C22972AzO azO, C202179lC r2, String str) {
        r2.A00.add(str);
        r2.A01.remove(str);
        if (azO != null) {
            azO.BV6(str);
        }
        List<Reference> list = r2.A02;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((Reference) list.get(size)).get() == null) {
                list.remove(size);
            }
        }
        for (Reference reference : list) {
            C22972AzO azO2 = (C22972AzO) reference.get();
            if (azO2 != null) {
                azO2.BV6(str);
            }
        }
    }

    public void A03(C22972AzO azO) {
        List list = this.A02;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                Object obj = ((Reference) list.get(size)).get();
                if (obj == null || obj == azO) {
                    list.remove(size);
                }
            } else {
                return;
            }
        }
    }

    public C202179lC(AnonymousClass17Y r2, C19730wQ r3, AnonymousClass1EU r4, AnonymousClass1XC r5) {
        this.A03 = r2;
        this.A04 = r3;
        this.A05 = r4;
        this.A06 = r5;
    }

    private void A01(C22972AzO azO, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0C = AnonymousClass001.A0C(it);
            HashSet hashSet = this.A01;
            if (!hashSet.contains(A0C) && !this.A00.contains(A0C)) {
                hashSet.add(A0C);
                this.A06.A02(new C21237ADt(azO, this, A0C), A0C, true);
            }
        }
    }

    public static void A02(C202179lC r10, C64933Qa r11, String str) {
        if (!TextUtils.isEmpty(str)) {
            C64933Qa r9 = r11;
            if (r11 != null) {
                AnonymousClass11F r3 = r11.A00;
                if (AnonymousClass143.A0G(r3)) {
                    HashSet hashSet = r10.A01;
                    if (!hashSet.contains(str) && !r10.A00.contains(str)) {
                        hashSet.add(str);
                        AnonymousClass1XC r8 = r10.A06;
                        C21236ADs aDs = new C21236ADs(r10, str);
                        AnonymousClass1AL[] r2 = new AnonymousClass1AL[3];
                        C36381kD.A1N("action", "get-missing-group-transaction-details", r2);
                        C165587tf.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, r2);
                        r2[2] = new AnonymousClass1AL((Jid) r3, "group");
                        C203399nx A042 = C203399nx.A04("account", r2);
                        C165597tg.A1C(r8.A08, new B7K(r8.A01.A00, r8.A05, r8.A00, aDs, r8, r9, 4), A042);
                    }
                }
            }
        }
    }

    public void A04(C22972AzO azO, String str) {
        if (!TextUtils.isEmpty(str)) {
            A01(azO, C90484aE.A0r(str));
        }
    }

    public void A05(List list) {
        C175708av r1;
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C202319lY r2 = (C202319lY) it.next();
            if ((r2.A03 == 1000 && !TextUtils.isEmpty(r2.A0K)) || ((r1 = r2.A0A) != null && (r1 instanceof C175928bI) && "MISSING_FIELD_NOT_PARTIAL".equals(((C175928bI) r1).A0T))) {
                A0I.add(r2.A0K);
            }
        }
        if (!A0I.isEmpty()) {
            A01((C22972AzO) null, A0I);
        }
    }
}
