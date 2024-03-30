package X;

import android.content.res.Resources;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.group.RemovalOfGroupFromCommunity$$ExternalSyntheticLambda0;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.9j8  reason: invalid class name and case insensitive filesystem */
public final class C201239j8 {
    public C225314u A00;
    public final C220412q A01;
    public final C20810yC A02;
    public final Runnable A03;
    public final C57042xa A04;
    public final C19600wD A05;
    public final AnonymousClass17X A06;
    public final AnonymousClass147 A07;
    public final AnonymousClass147 A08;
    public final String A09;

    public static final void A00(C201239j8 r11, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C225314u r5 = r11.A00;
        if (r5 != null) {
            r5.Bnv();
            if (!(i == -3 || i == -2)) {
                int i7 = R.string.f12nameremoved;
                if (i != 400) {
                    if (i != 401) {
                        i7 = R.string.f12nameremoved;
                        if (i != 404) {
                            if (!(i == 406 || i == 500)) {
                                if (i != 530) {
                                    i2 = R.string.f12nameremoved;
                                    i3 = R.string.f12nameremoved;
                                    i4 = R.string.f12nameremoved;
                                    i5 = R.string.f12nameremoved;
                                    i6 = 1;
                                    r5.A37(new B8A(r11, i6), i2, i3, i4, i5);
                                }
                                String str = r11.A09;
                                if (str == null || str.length() == 0) {
                                    i7 = R.string.f12nameremoved;
                                } else {
                                    r5.BO9(new Object[]{str}, 0, R.string.f12nameremoved);
                                }
                            }
                        }
                    } else {
                        r5.BO9(new Object[0], R.string.f12nameremoved, R.string.f12nameremoved);
                    }
                    r11.A03.run();
                    return;
                }
                r5.BO5(i7);
                r11.A03.run();
                return;
            }
            i2 = R.string.f12nameremoved;
            i3 = R.string.f12nameremoved;
            i4 = R.string.f12nameremoved;
            i5 = R.string.f12nameremoved;
            i6 = 0;
            r5.A37(new B8A(r11, i6), i2, i3, i4, i5);
        }
    }

    public static final void A01(C201239j8 r17, boolean z) {
        AnonymousClass147 r3;
        C203399nx A042;
        C201239j8 r4 = r17;
        if (r4.A00 != null && (r3 = r4.A07) != null) {
            AnonymousClass147 r2 = r4.A08;
            if (r2 == null) {
                A00(r4, 400);
                return;
            }
            boolean A092 = r4.A05.A09();
            C225314u r1 = r4.A00;
            if (A092) {
                if (r1 != null) {
                    r1.Bu1(R.string.f12nameremoved);
                }
                AnonymousClass9KF r5 = new AnonymousClass9KF(new C191769Eg(r4), r2, C36361kB.A0c(r4.A04.A00.A01));
                List A11 = C36371kC.A11(r3);
                AnonymousClass19A r12 = r5.A02;
                String A093 = r12.A09();
                int size = A11.size();
                C203399nx[] r32 = new C203399nx[size];
                for (int i = 0; i < size; i++) {
                    if (z) {
                        AnonymousClass1AL[] r6 = new AnonymousClass1AL[2];
                        C90504aG.A1E((Jid) A11.get(i), "jid", r6, 0);
                        C36341k9.A1L("remove_orphaned_members", "true", r6, 1);
                        A042 = C203399nx.A04("group", r6);
                    } else {
                        AnonymousClass1AL[] r13 = new AnonymousClass1AL[1];
                        C90504aG.A1E((Jid) A11.get(i), "jid", r13, 0);
                        A042 = C203399nx.A04("group", r13);
                    }
                    r32[i] = A042;
                }
                AnonymousClass1AL[] r22 = new AnonymousClass1AL[1];
                C36341k9.A1L("unlink_type", "sub_group", r22, 0);
                C203399nx A052 = C203399nx.A05("unlink", r22, r32);
                AnonymousClass1AL[] r33 = new AnonymousClass1AL[4];
                C36331k8.A1R(A093, r33, 0);
                C36341k9.A1L("xmlns", "w:g2", r33, 1);
                C36341k9.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", r33, 2);
                C90504aG.A1E(r5.A01, "to", r33, 3);
                r12.A0E(new C21339AHr(r5.A00), C36391kE.A0m(A052, r33), A093, 308, 32000);
            } else if (r1 != null) {
                boolean A022 = C19600wD.A02(r1);
                int i2 = R.string.f12nameremoved;
                if (A022) {
                    i2 = R.string.f12nameremoved;
                }
                r1.A05.A04(i2, 1);
            }
        }
    }

    public final void A02() {
        AnonymousClass147 r1;
        C225314u r11;
        Integer valueOf;
        List asList;
        char c;
        C39001qm A002;
        AnonymousClass011 A19;
        AnonymousClass147 r4 = this.A07;
        if (r4 != null && (r1 = this.A08) != null && (r11 = this.A00) != null) {
            AnonymousClass17X r2 = this.A06;
            if (r2.A0D(r1)) {
                String str = this.A09;
                if (this.A01.A05(r4) != 6 || !this.A02.A0E(5021)) {
                    View inflate = LayoutInflater.from(r11).inflate(R.layout.f9nameremoved, (ViewGroup) null);
                    boolean z = true;
                    if (r2.A05(r4).size() <= 1 && r2.A0C(r4)) {
                        z = false;
                    }
                    TextView A0O = C36391kE.A0O(inflate, R.id.text);
                    Resources resources = r11.getResources();
                    if (TextUtils.isEmpty(str)) {
                        c = 2;
                        if (z) {
                            c = 0;
                        }
                    } else {
                        c = 3;
                        if (z) {
                            c = 1;
                        }
                    }
                    A0O.setText(C36411kG.A0w(resources, str, new Object[1], 0, AnonymousClass99k.A00[c]));
                    View A022 = C012005e.A02(inflate, R.id.remove_members_checkbox);
                    TextView textView = (TextView) A022;
                    if (z) {
                        textView.setText(R.string.f12nameremoved);
                    } else {
                        textView.setVisibility(8);
                    }
                    AnonymousClass00C.A08(A022);
                    A002 = AnonymousClass3LW.A00(r11);
                    A002.A0j(inflate);
                    A002.A0d(R.string.f12nameremoved);
                    A002.A0m(r11, new BAD(textView, this, 4), R.string.f12nameremoved);
                    A002.A0l(r11, (AnonymousClass04S) null, R.string.f12nameremoved);
                } else {
                    if (str == null || str.length() == 0) {
                        String A0m = C36361kB.A0m(r11, R.string.f12nameremoved);
                        Spanned fromHtml = Html.fromHtml(r11.getString(R.string.f12nameremoved));
                        AnonymousClass00C.A08(fromHtml);
                        A19 = C36441kJ.A19(A0m, fromHtml);
                    } else {
                        String A0w = C36351kA.A0w(r11, str, 1, R.string.f12nameremoved);
                        AnonymousClass00C.A08(A0w);
                        Spanned A012 = AnonymousClass14B.A01(r11, new Object[]{str}, R.string.f12nameremoved);
                        AnonymousClass00C.A08(A012);
                        A19 = C36441kJ.A19(A0w, A012);
                    }
                    A002 = AnonymousClass3LW.A00(r11);
                    A002.A0q((String) A19.first);
                    A002.A0p((CharSequence) A19.second);
                    A002.A0m(r11, new BA8(this, 23), R.string.f12nameremoved);
                    A002.A0l(r11, (AnonymousClass04S) null, R.string.f12nameremoved);
                }
                A002.A0b();
                return;
            }
            String str2 = this.A09;
            if (str2 == null) {
                Log.e("RemovalOfGroupFromCommunity/showDialogIfSubgroup group name is null");
                return;
            }
            String A0D = this.A01.A0D(r1);
            if (A0D == null) {
                valueOf = Integer.valueOf(R.string.f12nameremoved);
                asList = Collections.singletonList(str2);
            } else {
                valueOf = Integer.valueOf(R.string.f12nameremoved);
                String[] A1S = C36441kJ.A1S();
                C36331k8.A1N(str2, A0D, A1S);
                asList = Arrays.asList(A1S);
            }
            AnonymousClass00C.A08(asList);
            r11.A2z(r11, Integer.valueOf(R.string.f12nameremoved), valueOf, Integer.valueOf(R.string.f12nameremoved), Integer.valueOf(R.string.f12nameremoved), (Integer) null, (String) null, asList, new C22242Aj3(r11, this), (AnonymousClass00S) null);
        }
    }

    public C201239j8(C57042xa r5, C225314u r6, AnonymousClass1LV r7, C19600wD r8, AnonymousClass171 r9, C220412q r10, AnonymousClass17X r11, AnonymousClass141 r12, C20810yC r13, Runnable runnable) {
        AnonymousClass147 r0;
        C36321k7.A1B(r9, r7, r13, r10, r11);
        C36321k7.A10(r8, r5);
        AnonymousClass00C.A0D(r12, 9);
        this.A02 = r13;
        this.A01 = r10;
        this.A06 = r11;
        this.A05 = r8;
        this.A04 = r5;
        this.A03 = runnable;
        this.A09 = r9.A0H(r12);
        AnonymousClass147 r02 = (AnonymousClass147) r12.A06(AnonymousClass147.class);
        this.A07 = r02;
        if (r02 != null) {
            r0 = r7.A02(r02);
        } else {
            r0 = null;
        }
        this.A08 = r0;
        C18740tg.A01();
        AnonymousClass01N r2 = r6.A06;
        if (r2.A02 != AnonymousClass01P.DESTROYED) {
            this.A00 = r6;
            r2.A04(new RemovalOfGroupFromCommunity$$ExternalSyntheticLambda0(this));
            return;
        }
        this.A00 = null;
    }
}
