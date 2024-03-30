package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapeItemView;
import java.lang.ref.Reference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4mv  reason: invalid class name and case insensitive filesystem */
public class C96184mv extends AnonymousClass0CZ implements C158307gi {
    public int A00 = 0;
    public AnonymousClass66P A01;
    public LinkedHashMap A02 = C36431kI.A1G();
    public List A03 = AnonymousClass001.A0I();
    public int A04 = 0;
    public final /* synthetic */ AnonymousClass6XN A05;

    public static void A02(Context context, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new AnonymousClass6SE(context.getString(i), 1));
    }

    public static void A03(C96184mv r4) {
        r4.A04 = 0;
        Iterator A10 = C36391kE.A10(r4.A02);
        while (A10.hasNext()) {
            List list = (List) A10.next();
            if (list.size() > 1) {
                r4.A04 = C90524aI.A04(list, r4.A04);
            } else {
                return;
            }
        }
    }

    public AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new C96764nr(C36351kA.A0C(viewGroup).inflate(R.layout.f9nameremoved, viewGroup, false), this);
        }
        if (i == 1) {
            return new C96684nj(C36351kA.A0C(viewGroup).inflate(R.layout.f9nameremoved, viewGroup, false), this);
        }
        if (i == 2) {
            return new C96754nq(C36351kA.A0C(viewGroup).inflate(R.layout.f9nameremoved, viewGroup, false), this);
        }
        if (i == 3) {
            return new C162527oj(C36351kA.A0C(viewGroup).inflate(R.layout.f9nameremoved, viewGroup, false), this, 0);
        }
        if (i == 4) {
            return new C162527oj(C36351kA.A0C(viewGroup).inflate(R.layout.f9nameremoved, viewGroup, false), this, 1);
        }
        C36321k7.A1S("shapepicker/onCreateViewHolder/invalid state ", AnonymousClass000.A0u(), i);
        return null;
    }

    public C96184mv(AnonymousClass6XN r2) {
        this.A05 = r2;
    }

    public static AnonymousClass6SE A00(C96184mv r4, int i) {
        Object obj;
        if (i < r4.A03.size()) {
            obj = r4.A03.get(i);
        } else if (r4.A05.A0O.A0S(1) && i == r4.A0J() - 1) {
            return new AnonymousClass6SE(4);
        } else {
            int size = i - r4.A03.size();
            Iterator A10 = C36391kE.A10(r4.A02);
            while (A10.hasNext()) {
                List list = (List) A10.next();
                if (size < list.size()) {
                    obj = list.get(size);
                } else {
                    size -= list.size();
                }
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Could not translate adapter position ");
            A0u.append(i);
            throw AnonymousClass000.A0c(" to a grid item.", A0u);
        }
        return (AnonymousClass6SE) obj;
    }

    public static ArrayList A01(C96184mv r4, AnonymousClass68B r5) {
        Collection<C146796wB> collection = (Collection) r4.A05.A0a.get(r5.A0F);
        C18740tg.A06(collection);
        ArrayList A0I = AnonymousClass001.A0I();
        A0I.add(new AnonymousClass6SE(r5.A0H, 1));
        int i = 0;
        for (C146796wB r1 : collection) {
            A0I.add(new AnonymousClass6SE((C161307mX) r1, i));
            i++;
        }
        return A0I;
    }

    public static void A04(C96184mv r9) {
        AnonymousClass6XN r7 = r9.A05;
        AnonymousClass5Cv r3 = r7.A0T;
        if (r3 != null) {
            ArrayList A0I = AnonymousClass001.A0I();
            ArrayList A0I2 = AnonymousClass001.A0I();
            int i = 0;
            Iterator A10 = C36371kC.A10(r9.A02);
            while (A10.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A10);
                if (i >= r9.A04 - 1) {
                    break;
                }
                A0I.add(r7.A0Z.get(A11.getKey()));
                AnonymousClass000.A1F(A0I2, r9.A03.size() + i);
                i = C90524aI.A04((List) A11.getValue(), i);
            }
            C18740tg.A0B(AnonymousClass000.A1S(A0I.size(), A0I2.size()));
            List list = r3.A03;
            list.clear();
            list.addAll(A0I);
            ArrayList A15 = C36441kJ.A15(A0I2);
            if (r3.A01) {
                AnonymousClass000.A1F(A15, 0);
            }
            C96134mq r0 = r3.A07;
            r0.A02 = A15;
            Collections.sort(A15);
            r0.A06();
            C96134mq.A01(r0);
            AnonymousClass6Q0.A00(r3);
        }
    }

    public int A0J() {
        AnonymousClass6XN r1 = this.A05;
        boolean z = true;
        boolean A0S = r1.A0O.A0S(1);
        C95464l7 r3 = r1.A0N;
        int i = 0;
        if (r3 == null || !AnonymousClass000.A1Q(C36341k9.A07(r3.A03))) {
            z = false;
        }
        int size = this.A03.size();
        if (z && ((String) r3.A02.A04()).isEmpty()) {
            i = this.A04 + (A0S ? 1 : 0);
        }
        return size + i;
    }

    public void A0K(AnonymousClass0D3 r3) {
        ImageView imageView;
        if (r3 instanceof C96764nr) {
            List list = AnonymousClass0D3.A0I;
            imageView = ((C96764nr) r3).A01;
        } else if (r3 instanceof C96754nq) {
            imageView = ((C96754nq) r3).A00;
        } else {
            return;
        }
        imageView.setImageDrawable((Drawable) null);
    }

    public void A0L() {
        int size = this.A03.size();
        this.A03.clear();
        AnonymousClass6XN r8 = this.A05;
        int i = this.A00 * 2;
        boolean A1Q = AnonymousClass000.A1Q(C36341k9.A07(r8.A0N.A03));
        ArrayList A0I = AnonymousClass001.A0I();
        if (A1Q) {
            AnonymousClass5Cv r6 = r8.A0T;
            if (r6 != null && !r6.A01) {
                r6.A01 = true;
                C96134mq r3 = r6.A07;
                C90504aG.A10(0, r3.A02);
                Collections.sort(r3.A02);
                r3.A06();
                C96134mq.A01(r3);
                AnonymousClass6Q0.A00(r6);
            }
            C104655Aq r32 = r8.A0F;
            if (!AnonymousClass000.A1V(r32.A03)) {
                A02(r8.A05, A0I, R.string.f12nameremoved);
                A0I.add(new AnonymousClass6SE(3));
            } else if (r32.A02() > 0) {
                A02(r8.A05, A0I, R.string.f12nameremoved);
                Iterator it = r32.A05(i).iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    A0I.add(new AnonymousClass6SE((C161307mX) it.next(), i2));
                    i2++;
                }
            } else if (r6 != null && r6.A01) {
                r6.A01 = false;
                C96134mq r1 = r6.A07;
                r1.A02.remove(0);
                Collections.sort(r1.A02);
                r1.A06();
                C96134mq.A01(r1);
                AnonymousClass6Q0.A00(r6);
            }
            for (AnonymousClass5RQ r33 : AnonymousClass5RQ.values()) {
                A02(r8.A05, A0I, r33.sectionResId);
                int i3 = 0;
                for (C161307mX r12 : r33.shapeData) {
                    A0I.add(new AnonymousClass6SE(r12, i3));
                    i3++;
                }
            }
            C001700s r13 = r8.A0O.A02;
            C119825qW r0 = (C119825qW) r13.A04();
            if (r0 != null && r0.A01) {
                Set<C146796wB> set = r8.A0b;
                if (set.size() > 0) {
                    A02(r8.A05, A0I, R.string.f12nameremoved);
                    int i4 = 0;
                    for (C146796wB r14 : set) {
                        A0I.add(new AnonymousClass6SE((C161307mX) r14, i4));
                        i4++;
                    }
                }
            }
            C119825qW r02 = (C119825qW) r13.A04();
            if (r02 == null || !r02.A01) {
                A02(r8.A05, A0I, R.string.f12nameremoved);
                A0I.add(new AnonymousClass6SE(3));
            }
        } else {
            ArrayList A0I2 = AnonymousClass001.A0I();
            AnonymousClass38I[] A002 = AnonymousClass6JA.A00(r8.A0D);
            int i5 = 0;
            do {
                AnonymousClass38I r5 = A002[i5];
                AnonymousClass000.A1F(A0I2, A0I.size());
                A0I.add(new AnonymousClass6SE(r8.A05.getString(r5.A02), 1));
                Iterator A13 = C90514aH.A13(r5.A03.get());
                int i6 = 0;
                while (A13.hasNext()) {
                    C146786wA r34 = new C146786wA((AnonymousClass1XQ) A13.next(), r8.A0C);
                    A0I.add(new AnonymousClass6SE((C161307mX) r34, i6));
                    i6++;
                    r8.A0e.put(r34.BIB(), r34);
                }
                i5++;
            } while (i5 < 8);
            C104995Cw r15 = r8.A0S;
            C18740tg.A0B(AnonymousClass000.A1S(A0I2.size(), 8));
            C96134mq r03 = r15.A07;
            r03.A02 = A0I2;
            Collections.sort(A0I2);
            r03.A06();
            C96134mq.A01(r03);
            AnonymousClass6Q0.A00(r15);
        }
        this.A03 = A0I;
        A0A(0, Math.max(size, A0I.size()));
        if (size != this.A03.size()) {
            A04(this);
        }
    }

    public void A0M(String str) {
        List A0n = C90524aI.A0n(str, this.A02);
        if (A0n != null) {
            Iterator A10 = C36371kC.A10(this.A02);
            int i = 0;
            while (A10.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A10);
                if (str.equals(A11.getKey())) {
                    int A042 = C90524aI.A04(this.A03, i);
                    this.A02.remove(str);
                    A03(this);
                    this.A01.A03(A042, A0n.size());
                    A04(this);
                    return;
                }
                i = C90524aI.A04((List) A11.getValue(), i);
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Sticker pack id ");
            A0u.append(str);
            throw AnonymousClass000.A0c(" is not contained in data set", A0u);
        }
    }

    public void BfQ(AnonymousClass66P r6) {
        if (r6.equals(this.A01)) {
            this.A03 = AnonymousClass001.A0I();
            List list = r6.A01;
            if (list.size() > 0) {
                for (int i = 0; i < list.size(); i++) {
                    C161307mX r2 = (C161307mX) list.get(i);
                    this.A05.A0e.put(r2.BIB(), r2);
                    this.A03.add(new AnonymousClass6SE((C161307mX) list.get(i), i));
                }
            } else {
                this.A03.add(new AnonymousClass6SE((String) this.A05.A0N.A02.A04(), 2));
            }
            A06();
        }
    }

    public void BSE(AnonymousClass0D3 r11, int i) {
        String A0B;
        C119815qV r1;
        AnonymousClass6SE A002 = A00(this, i);
        int i2 = A002.A02;
        if (i2 == 0) {
            C96764nr r112 = (C96764nr) r11;
            List list = AnonymousClass0D3.A0I;
            ShapeItemView shapeItemView = r112.A01;
            C161307mX r5 = A002.A03;
            C18740tg.A06(r5);
            r112.A00 = r5;
            shapeItemView.A00 = r5.BIB();
            C161307mX r4 = r112.A00;
            if (r4.BoQ()) {
                AnonymousClass6XN r2 = this.A05;
                Reference reference = (Reference) r2.A0c.get(r5.BIB());
                if (reference == null || (r1 = (C119815qV) reference.get()) == null) {
                    shapeItemView.setImageDrawable(new C91074bQ());
                    shapeItemView.setContentDescription((CharSequence) null);
                    C91674cQ r42 = r2.A0K;
                    Message obtain = Message.obtain(r42, 0, 0, 0, shapeItemView);
                    String BIB = r5.BIB();
                    Bundle A07 = AnonymousClass001.A07();
                    A07.putString("tag_bundle_key", BIB);
                    obtain.setData(A07);
                    r42.sendMessageAtFrontOfQueue(obtain);
                    return;
                }
                shapeItemView.setImageDrawable(r1.A00);
                A0B = r1.A01;
            } else {
                Context context = shapeItemView.getContext();
                AnonymousClass6XN r22 = this.A05;
                C129196Ft B4v = r4.B4v(context, r22.A0B, true);
                B4v.A0G(r22.A01);
                if (B4v.A0O()) {
                    B4v.A0F(r22.A00);
                }
                shapeItemView.setImageDrawable(new C91084bR(B4v));
                A0B = B4v.A0B(r22.A05);
            }
            shapeItemView.setContentDescription(A0B);
        } else if (i2 == 1) {
            ((C96684nj) r11).A00.setText(A002.A04);
        } else if (i2 == 2) {
            AnonymousClass6XN r0 = this.A05;
            AnonymousClass1H2 r9 = r0.A0C;
            Activity activity = r0.A05;
            BitmapDrawable A052 = r9.A05(activity.getResources(), new AnonymousClass2M9(new int[]{129335}), -1);
            C96754nq r113 = (C96754nq) r11;
            r113.A01.setText(C36391kE.A0v(activity, A002.A04, new Object[1], 0, R.string.f12nameremoved));
            r113.A00.setImageDrawable(A052);
        }
    }

    public int getItemViewType(int i) {
        return A00(this, i).A02;
    }
}
