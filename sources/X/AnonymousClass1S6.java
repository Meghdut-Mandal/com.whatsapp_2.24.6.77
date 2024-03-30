package X;

import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1S6  reason: invalid class name */
public class AnonymousClass1S6 {
    public AnonymousClass191 A00;
    public final AnonymousClass08S A01;
    public final AnonymousClass08S A02;
    public final AnonymousClass08S A03;
    public final AnonymousClass08S A04;
    public final AnonymousClass08S A05;
    public final AnonymousClass08S A06;
    public final C001700s A07 = new C001700s();
    public final C001700s A08 = new C001700s();
    public final C001700s A09 = new C001700s();
    public final C001700s A0A = new C001700s();
    public final C001700s A0B = new C001700s();
    public final C20650xu A0C;
    public final C20810yC A0D;
    public final C21010yW A0E;
    public final C21690ze A0F;
    public final AnonymousClass1S3 A0G;
    public final AnonymousClass1S3 A0H;
    public final C28091Rh A0I;
    public final AtomicBoolean A0J;
    public final AnonymousClass16D A0K;
    public final AnonymousClass171 A0L;
    public final C19970wo A0M;
    public volatile C02680Bk A0N = null;
    public volatile C02680Bk A0O = null;
    public volatile C02680Bk A0P = null;

    public static String A00(AnonymousClass1S6 r9) {
        List list;
        AnonymousClass1S3 r2 = r9.A0G;
        String A022 = r2.A02();
        AnonymousClass11F r1 = r2.A04;
        C222813r r0 = UserJid.Companion;
        UserJid A002 = C222813r.A00(r1);
        if (A002 == null) {
            return A022;
        }
        AnonymousClass141 A0D2 = r9.A0K.A0D(A002);
        AnonymousClass171 r92 = r9.A0L;
        List A032 = r2.A03();
        AnonymousClass00I r02 = r2.A03;
        if (r02 == null || (list = (List) r02.A00) == null || list.isEmpty()) {
            Object obj = AnonymousClass1S3.A00(r2).A00;
            C18740tg.A06(obj);
            list = (List) obj;
        }
        boolean z = false;
        if (list.size() % 2 == 0) {
            z = true;
        }
        C18740tg.A0E(z, "tokenPositions.size must be even");
        Iterator it = list.iterator();
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        for (Object next : A032) {
            Object next2 = it.next();
            Object next3 = it.next();
            if (r92.A0h(A0D2, Collections.singletonList(next), true)) {
                arrayList.add(next2);
                arrayList.add(next3);
            }
        }
        arrayList.add(Integer.valueOf(A022.length()));
        Iterator it2 = arrayList.iterator();
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Number number = (Number) it2.next();
            Number number2 = (Number) it2.next();
            if (number == null || number2 == null) {
                Log.e("messageSearchModel/invalid index in token mapping");
            } else if (!number.equals(number2)) {
                String trim = A022.subSequence(number.intValue(), number2.intValue()).toString().trim();
                if (trim.length() > 0) {
                    arrayList2.add(trim);
                }
            }
        }
        return TextUtils.join(" ", arrayList2);
    }

    public void A01() {
        if (this.A0N != null) {
            this.A0N.A03();
        }
        if (this.A0O != null) {
            this.A0O.A03();
        }
        if (this.A0P != null) {
            this.A0P.A03();
        }
    }

    public void A02() {
        Pair pair;
        if (!this.A0J.get()) {
            AnonymousClass08S r3 = this.A05;
            if (r3.A04() != null) {
                Object obj = ((Pair) r3.A04()).first;
                Number number = (Number) ((Pair) r3.A04()).second;
                if (number != null) {
                    C001700s r1 = this.A08;
                    if (r1.A04() != null && ((Number) r1.A04()).intValue() != -1) {
                        pair = new Pair(obj, Integer.valueOf(number.intValue() + 1));
                    } else if (Boolean.TRUE.equals(obj)) {
                        pair = new Pair(Boolean.FALSE, 0);
                    } else {
                        return;
                    }
                    r3.A0D(pair);
                }
            }
        }
    }

    public void A03(boolean z) {
        Boolean bool;
        this.A0A.A0D(Boolean.TRUE);
        this.A04.A0D(new C28211Rt());
        AnonymousClass08S r3 = this.A05;
        if (z) {
            bool = Boolean.TRUE;
        } else {
            bool = null;
        }
        r3.A0D(new Pair(bool, 0));
        this.A06.A0D(this.A0H);
        this.A0G.A0E = true;
    }

    public AnonymousClass1S6(C001600r r10, C001600r r11, C001600r r12, C001600r r13, AnonymousClass16D r14, AnonymousClass171 r15, C19970wo r16, C18820ts r17, C20650xu r18, C20810yC r19, C21010yW r20, C21690ze r21, C28091Rh r22, C28271Rz r23) {
        AnonymousClass08S r3 = new AnonymousClass08S();
        this.A03 = r3;
        AnonymousClass08S r5 = new AnonymousClass08S();
        this.A06 = r5;
        AnonymousClass08S r8 = new AnonymousClass08S();
        this.A04 = r8;
        AnonymousClass08S r6 = new AnonymousClass08S();
        this.A01 = r6;
        AnonymousClass08S r4 = new AnonymousClass08S();
        this.A02 = r4;
        AnonymousClass08S r2 = new AnonymousClass08S();
        this.A05 = r2;
        this.A0J = new AtomicBoolean();
        this.A00 = new C36181jt(this, 1);
        C18820ts r1 = r17;
        AnonymousClass1S3 r7 = new AnonymousClass1S3(r1);
        r7.A01 = 100;
        this.A0G = r7;
        this.A0H = new AnonymousClass1S3(r1);
        this.A0D = r19;
        this.A0M = r16;
        this.A0E = r20;
        this.A0K = r14;
        this.A0L = r15;
        this.A0C = r18;
        this.A0I = r22;
        this.A0F = r21;
        A03(false);
        C28271Rz r72 = r23;
        r72.A00(new C36141jp(this, 4), r3, r8);
        r72.A00(new C36141jp(this, 5), r5, r6);
        r72.A00(new C36141jp(this, 3), r5, r4);
        r3.A0F(r2, new C36201jv(this, 18));
        r2.A0F(r11, new C36201jv(this, 21));
        r2.A0F(r10, new C36201jv(this, 22));
        r2.A0F(r12, new C36201jv(this, 19));
        r2.A0F(r13, new C36201jv(this, 20));
    }
}
