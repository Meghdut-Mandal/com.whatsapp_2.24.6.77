package X;

import android.net.Uri;
import android.util.SparseArray;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.2k2  reason: invalid class name and case insensitive filesystem */
public class C50002k2 extends C132446Tt {
    public final AnonymousClass16D A00;
    public final C21060yb A01;
    public final C19630wG A02;
    public final C18820ts A03;
    public final AnonymousClass1A1 A04;
    public final AnonymousClass1YI A05;
    public final C606438u A06;
    public final WeakReference A07;

    public C50002k2(AnonymousClass16D r2, C21060yb r3, C19630wG r4, C18820ts r5, AnonymousClass1A1 r6, AnonymousClass1YI r7, C606438u r8, ViewSharedContactArrayActivity viewSharedContactArrayActivity) {
        super(viewSharedContactArrayActivity, true);
        this.A02 = r4;
        this.A05 = r7;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r5;
        this.A04 = r6;
        this.A07 = AnonymousClass001.A0F(viewSharedContactArrayActivity);
        this.A06 = r8;
    }

    public static void A00(Object obj, AbstractCollection abstractCollection, C65643Sx r4, int i, int i2) {
        abstractCollection.add(new AnonymousClass38s(obj, r4.A0A.A08, i, i2));
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C65643Sx r2;
        List<C607439e> list;
        List list2;
        List A022;
        C606438u r22 = this.A06;
        C64933Qa r1 = r22.A01;
        if (r1 != null) {
            AnonymousClass3T1 A032 = this.A04.A03(r1);
            if (A032 == null) {
                return null;
            }
            C19630wG r5 = this.A02;
            AnonymousClass1YI r12 = this.A05;
            AnonymousClass16D r4 = this.A00;
            C21060yb r3 = this.A01;
            C18820ts r23 = this.A03;
            if (A032 instanceof AnonymousClass2bX) {
                AnonymousClass363 A033 = new C65033Ql(r4, r3, r5, r23).A03((AnonymousClass2bX) A032);
                if (A033 != null) {
                    return Collections.singletonList(A033);
                }
                return null;
            } else if (A032 instanceof AnonymousClass2bW) {
                C65033Ql r13 = new C65033Ql(r4, r3, r5, r23);
                AnonymousClass2bW r7 = (AnonymousClass2bW) A032;
                List list3 = r7.A01;
                if (list3 != null) {
                    return list3;
                }
                ArrayList A012 = r13.A01(r7.A1X());
                r7.A01 = A012;
                return A012;
            } else if (!C131806Qs.A02(A032) || (A022 = AnonymousClass3RN.A02(A032, r12)) == null) {
                return null;
            } else {
                return new C65033Ql(r4, r3, r5, r23).A01(A022);
            }
        } else {
            List list4 = r22.A03;
            if (list4 != null) {
                return new C65033Ql(this.A00, this.A01, this.A02, this.A03).A01(list4);
            }
            Uri uri = r22.A00;
            if (uri != null) {
                try {
                    AnonymousClass1YI r14 = this.A05;
                    return r14.A00(r14.A01(uri)).A02;
                } catch (AnonymousClass1YJ | IOException e) {
                    Log.e((Throwable) new C108695Un(e));
                    return null;
                }
            } else {
                List<AnonymousClass3XB> list5 = r22.A02;
                if (list5 == null) {
                    return null;
                }
                ArrayList A0I = AnonymousClass001.A0I();
                for (AnonymousClass3XB r15 : list5) {
                    UserJid A0l = C36431kI.A0l(r15.A01);
                    AnonymousClass3T1 A0R = C36421kH.A0R(this.A04, r15.A00);
                    if (!(A0l == null || A0R == null)) {
                        List A023 = AnonymousClass3RN.A02(A0R, this.A05);
                        if (A023 == null) {
                            list2 = Collections.emptyList();
                        } else {
                            ArrayList A0I2 = AnonymousClass001.A0I();
                            Iterator it = A023.iterator();
                            while (it.hasNext()) {
                                String A0C = AnonymousClass001.A0C(it);
                                StringBuilder A0u = AnonymousClass000.A0u();
                                A0u.append("waid=");
                                if (A0C.contains(AnonymousClass000.A0q(A0l.user, A0u))) {
                                    try {
                                        C65033Ql r0 = new C65033Ql(this.A00, this.A01, this.A02, this.A03);
                                        r0.A05(A0C);
                                        r2 = r0.A04;
                                    } catch (AnonymousClass1YJ e2) {
                                        Log.e("Failed to get contact from VCard.", e2);
                                        r2 = null;
                                    }
                                    if (!(r2 == null || (list = r2.A06) == null)) {
                                        for (C607439e r02 : list) {
                                            if (A0l.equals(r02.A01)) {
                                                A0I2.add(new AnonymousClass363(A0C, r2));
                                            }
                                        }
                                    }
                                }
                            }
                            list2 = A0I2;
                        }
                        A0I.addAll(list2);
                    }
                }
                return A0I;
            }
        }
    }

    public void A0A() {
        C225314u A0W = C36411kG.A0W(this.A07);
        if (A0W != null) {
            A0W.Bu2(R.string.f12nameremoved, R.string.f12nameremoved);
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass07B A0O;
        int i;
        int i2;
        AnonymousClass141 A08;
        List<AnonymousClass363> list = (List) obj;
        ViewSharedContactArrayActivity viewSharedContactArrayActivity = (ViewSharedContactArrayActivity) this.A07.get();
        if (viewSharedContactArrayActivity != null) {
            viewSharedContactArrayActivity.Bnv();
            if (list == null || list.isEmpty()) {
                Log.w("viewsharedcontactarrayactivity/oncreate/no vcards to display");
                viewSharedContactArrayActivity.A05.A06(R.string.f12nameremoved, 0);
                viewSharedContactArrayActivity.finish();
                return;
            }
            HashSet A16 = C36441kJ.A16();
            for (AnonymousClass363 r0 : list) {
                C65643Sx r8 = r0.A01;
                String A032 = r8.A03();
                if (!A16.contains(A032)) {
                    viewSharedContactArrayActivity.A0M.add(r8);
                    viewSharedContactArrayActivity.A0N.add(new SparseArray());
                    A16.add(A032);
                } else if (r8.A06 != null) {
                    ArrayList arrayList = viewSharedContactArrayActivity.A0M;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C65643Sx r2 = (C65643Sx) it.next();
                        if (r2.A03().equals(A032) && r2.A06 != null && r8.A06.size() > r2.A06.size()) {
                            arrayList.set(arrayList.indexOf(r2), r8);
                        }
                    }
                }
            }
            if (viewSharedContactArrayActivity.A0H == null) {
                Collections.sort(viewSharedContactArrayActivity.A0M, new C81423wz(viewSharedContactArrayActivity.A0A));
            }
            ImageView A0Q = C36411kG.A0Q(viewSharedContactArrayActivity, R.id.send_btn);
            if (viewSharedContactArrayActivity.A0K) {
                A0Q.setVisibility(0);
                C36321k7.A0L(viewSharedContactArrayActivity, A0Q, viewSharedContactArrayActivity.A0A, R.drawable.input_send);
                int size = viewSharedContactArrayActivity.A0M.size();
                i = R.string.f12nameremoved;
                if (size == 1) {
                    i = R.string.f12nameremoved;
                }
                A0O = C36381kD.A0O(viewSharedContactArrayActivity);
            } else {
                A0Q.setVisibility(8);
                int size2 = list.size();
                A0O = C36381kD.A0O(viewSharedContactArrayActivity);
                i = R.string.f12nameremoved;
                if (size2 == 1) {
                    i = R.string.f12nameremoved;
                }
            }
            A0O.A0I(i);
            RecyclerView recyclerView = (RecyclerView) viewSharedContactArrayActivity.findViewById(R.id.rvContacts);
            ArrayList arrayList2 = viewSharedContactArrayActivity.A0M;
            List list2 = viewSharedContactArrayActivity.A0H;
            ArrayList A0I = AnonymousClass001.A0I();
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                C65643Sx r13 = (C65643Sx) arrayList2.get(i3);
                SparseArray sparseArray = (SparseArray) viewSharedContactArrayActivity.A0N.get(i3);
                A0I.add(new AnonymousClass33K(r13));
                ArrayList A0I2 = AnonymousClass001.A0I();
                if (r13.A06 != null) {
                    i2 = 0;
                    for (C607439e r1 : r13.A06) {
                        if (r1.A01 == null) {
                            A0I2.add(r1);
                        } else {
                            A00(r1, A0I, r13, i3, i2);
                            ViewSharedContactArrayActivity.A01(sparseArray, i2).A00 = r1;
                            i2++;
                        }
                    }
                } else {
                    i2 = 0;
                }
                if (r13.A03 != null) {
                    for (Object next : r13.A03) {
                        A00(next, A0I, r13, i3, i2);
                        ViewSharedContactArrayActivity.A01(sparseArray, i2).A00 = next;
                        i2++;
                    }
                }
                Iterator it2 = A0I2.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    A00(next2, A0I, r13, i3, i2);
                    ViewSharedContactArrayActivity.A01(sparseArray, i2).A00 = next2;
                    i2++;
                }
                if (r13.A07 != null) {
                    for (Object next3 : r13.A07) {
                        A00(next3, A0I, r13, i3, i2);
                        ViewSharedContactArrayActivity.A01(sparseArray, i2).A00 = next3;
                        i2++;
                    }
                }
                if (r13.A09.A01 != null) {
                    C599735z r12 = r13.A09;
                    A00(r12, A0I, r13, i3, i2);
                    ViewSharedContactArrayActivity.A01(sparseArray, i2).A00 = r12;
                    i2++;
                }
                if (r13.A08 != null) {
                    ArrayList A15 = C36441kJ.A15(r13.A08.keySet());
                    Collections.sort(A15);
                    ArrayList A0I3 = AnonymousClass001.A0I();
                    Iterator it3 = A15.iterator();
                    while (it3.hasNext()) {
                        List<AnonymousClass3KL> list3 = (List) r13.A08.get(it3.next());
                        if (list3 != null) {
                            for (AnonymousClass3KL r14 : list3) {
                                if (r14.A01.equals("URL")) {
                                    r14.toString();
                                    Pattern pattern = viewSharedContactArrayActivity.A0I;
                                    if (pattern == null) {
                                        pattern = Pattern.compile("(http|https)://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&amp;=]*)?");
                                        viewSharedContactArrayActivity.A0I = pattern;
                                    }
                                    if (C36361kB.A1Z(r14.A02, pattern)) {
                                        A0I3.add(r14);
                                    }
                                }
                            }
                        }
                    }
                    Iterator it4 = A15.iterator();
                    while (it4.hasNext()) {
                        List<AnonymousClass3KL> list4 = (List) r13.A08.get(it4.next());
                        if (list4 != null) {
                            for (AnonymousClass3KL r15 : list4) {
                                if (!r15.A01.equals("URL")) {
                                    r15.toString();
                                    A0I3.add(r15);
                                }
                            }
                        }
                    }
                    Iterator it5 = A0I3.iterator();
                    while (it5.hasNext()) {
                        Object next4 = it5.next();
                        A00(next4, A0I, r13, i3, i2);
                        ViewSharedContactArrayActivity.A01(sparseArray, i2).A00 = next4;
                        i2++;
                    }
                }
                if (list2 != null) {
                    AnonymousClass3XB r16 = (AnonymousClass3XB) list2.get(i3);
                    UserJid A0l = C36431kI.A0l(r16.A02);
                    if (!(A0l == null || (A08 = viewSharedContactArrayActivity.A03.A08(A0l)) == null)) {
                        A0I.add(new AnonymousClass38t(A08, A0l, viewSharedContactArrayActivity, r16.A00));
                    }
                }
                A0I.add(new AnonymousClass33J());
            }
            ((AnonymousClass33J) A0I.get(A0I.size() - 1)).A00 = true;
            recyclerView.setAdapter(new C40781w6(viewSharedContactArrayActivity, A0I));
            C36351kA.A1F(recyclerView, 1);
            C48772i1.A00(A0Q, viewSharedContactArrayActivity, 35);
        }
    }
}
