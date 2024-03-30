package X;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: X.09Y  reason: invalid class name */
public final class AnonymousClass09Y implements AnonymousClass09W, AnonymousClass09X {
    public boolean A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public CharSequence A09;
    public CharSequence A0A;
    public String A0B;
    public ArrayList A0C;
    public ArrayList A0D;
    public ArrayList A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final AnonymousClass029 A0I;
    public final AnonymousClass01z A0J;
    public final ClassLoader A0K;

    public void A01() {
        A00(false);
    }

    public void A02() {
        A00(true);
    }

    public void A0A(AnonymousClass02E r3, int i) {
        A0G(r3, (String) null, i, 1);
    }

    public void A0B(AnonymousClass02E r2, int i) {
        A0F(r2, (String) null, i);
    }

    public void A0D(AnonymousClass02E r3, String str) {
        A0G(r3, str, 0, 1);
    }

    public void A0E(AnonymousClass02E r2, String str, int i) {
        A0G(r2, str, i, 1);
    }

    public boolean B7o(ArrayList arrayList, ArrayList arrayList2) {
        if (AnonymousClass01z.A0E(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Run: ");
            sb.append(this);
            Log.v("FragmentManager", sb.toString());
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.A0F) {
            return true;
        }
        AnonymousClass01z r1 = this.A0J;
        ArrayList arrayList3 = r1.A0C;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            r1.A0C = arrayList3;
        }
        arrayList3.add(this);
        return true;
    }

    public int A00(boolean z) {
        int i;
        if (!this.A00) {
            if (AnonymousClass01z.A0E(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Commit: ");
                sb.append(this);
                Log.v("FragmentManager", sb.toString());
                PrintWriter printWriter = new PrintWriter(new C05060Nb());
                A0I(printWriter, "  ", true);
                printWriter.close();
            }
            this.A00 = true;
            if (this.A0F) {
                i = this.A0J.A0Z.getAndIncrement();
            } else {
                i = -1;
            }
            this.A08 = i;
            this.A0J.A0k(this, z);
            return this.A08;
        }
        throw new IllegalStateException("commit already called");
    }

    public void A03() {
        if (!this.A0F) {
            this.A0H = false;
            this.A0J.A0j(this, false);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public void A04() {
        if (!this.A0F) {
            this.A0H = false;
            this.A0J.A0j(this, true);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public void A05(int i) {
        if (this.A0F) {
            if (AnonymousClass01z.A0E(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Bump nesting in ");
                sb.append(this);
                sb.append(" by ");
                sb.append(i);
                Log.v("FragmentManager", sb.toString());
            }
            ArrayList arrayList = this.A0C;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C021909g r6 = (C021909g) arrayList.get(i2);
                AnonymousClass02E r1 = r6.A05;
                if (r1 != null) {
                    r1.A04 += i;
                    if (AnonymousClass01z.A0E(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Bump nesting of ");
                        sb2.append(r6.A05);
                        sb2.append(" to ");
                        sb2.append(r6.A05.A04);
                        Log.v("FragmentManager", sb2.toString());
                    }
                }
            }
        }
    }

    public void A06(int i, int i2, int i3, int i4) {
        this.A04 = i;
        this.A05 = i2;
        this.A06 = i3;
        this.A07 = i4;
    }

    public void A07(AnonymousClass02E r3) {
        AnonymousClass01z r1 = r3.A0M;
        if (r1 == null || r1 == this.A0J) {
            A0H(new C021909g(r3, 4));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot hide Fragment attached to a different FragmentManager. Fragment ");
        sb.append(r3.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }

    public void A08(AnonymousClass02E r3) {
        AnonymousClass01z r1 = r3.A0M;
        if (r1 == null || r1 == this.A0J) {
            A0H(new C021909g(r3, 3));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        sb.append(r3.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }

    public void A09(AnonymousClass02E r3) {
        AnonymousClass01z r1 = r3.A0M;
        if (r1 == null || r1 == this.A0J) {
            A0H(new C021909g(r3, 5));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot show Fragment attached to a different FragmentManager. Fragment ");
        sb.append(r3.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }

    public void A0C(AnonymousClass02E r4, AnonymousClass01P r5) {
        AnonymousClass01z r0 = r4.A0M;
        AnonymousClass01z r2 = this.A0J;
        if (r0 == r2) {
            A0H(new C021909g(r4, r5));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
        sb.append(r2);
        throw new IllegalArgumentException(sb.toString());
    }

    public void A0F(AnonymousClass02E r3, String str, int i) {
        if (i != 0) {
            A0G(r3, str, i, 2);
            return;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public void A0G(AnonymousClass02E r5, String str, int i, int i2) {
        String str2 = r5.A0T;
        if (str2 != null) {
            C022009h.A01(r5, str2);
        }
        Class<?> cls = r5.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(cls.getCanonicalName());
            sb.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(sb.toString());
        }
        if (str != null) {
            String str3 = r5.A0U;
            if (str3 == null || str.equals(str3)) {
                r5.A0U = str;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Can't change tag of fragment ");
                sb2.append(r5);
                sb2.append(": was ");
                sb2.append(r5.A0U);
                sb2.append(" now ");
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = r5.A07;
                if (i3 == 0 || i3 == i) {
                    r5.A07 = i;
                    r5.A05 = i;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Can't change container ID of fragment ");
                    sb3.append(r5);
                    sb3.append(": was ");
                    sb3.append(r5.A07);
                    sb3.append(" now ");
                    sb3.append(i);
                    throw new IllegalStateException(sb3.toString());
                }
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Can't add fragment ");
                sb4.append(r5);
                sb4.append(" with tag ");
                sb4.append(str);
                sb4.append(" to container view with no id");
                throw new IllegalArgumentException(sb4.toString());
            }
        }
        A0H(new C021909g(r5, i2));
        r5.A0M = this.A0J;
    }

    public void A0H(C021909g r2) {
        this.A0C.add(r2);
        r2.A01 = this.A04;
        r2.A02 = this.A05;
        r2.A03 = this.A06;
        r2.A04 = this.A07;
    }

    public void A0I(PrintWriter printWriter, String str, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.A0B);
            printWriter.print(" mIndex=");
            printWriter.print(this.A08);
            printWriter.print(" mCommitted=");
            printWriter.println(this.A00);
            if (this.A03 != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.A03));
            }
            if (!(this.A04 == 0 && this.A05 == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.A04));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.A05));
            }
            if (!(this.A06 == 0 && this.A07 == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.A06));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.A07));
            }
            if (!(this.A02 == 0 && this.A0A == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.A02));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.A0A);
            }
            if (!(this.A01 == 0 && this.A09 == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.A01));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.A09);
            }
        }
        ArrayList arrayList = this.A0C;
        if (!arrayList.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C021909g r4 = (C021909g) arrayList.get(i);
                int i2 = r4.A00;
                switch (i2) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("cmd=");
                        sb.append(i2);
                        str2 = sb.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(r4.A05);
                if (z) {
                    if (!(r4.A01 == 0 && r4.A02 == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(r4.A01));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(r4.A02));
                    }
                    if (r4.A03 != 0 || r4.A04 != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(r4.A03));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(r4.A04));
                    }
                }
            }
        }
    }

    public void A0J(String str) {
        if (this.A0H) {
            this.A0F = true;
            this.A0B = str;
            return;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        int i = this.A08;
        if (i >= 0) {
            sb.append(" #");
            sb.append(i);
        }
        String str = this.A0B;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("}");
        return sb.toString();
    }

    public AnonymousClass09Y(AnonymousClass01z r4) {
        ClassLoader classLoader;
        AnonymousClass029 A0O = r4.A0O();
        C004401y r0 = r4.A07;
        if (r0 != null) {
            classLoader = r0.A01.getClassLoader();
        } else {
            classLoader = null;
        }
        this.A0C = new ArrayList();
        this.A0H = true;
        this.A0G = false;
        this.A0I = A0O;
        this.A0K = classLoader;
        this.A08 = -1;
        this.A0J = r4;
    }
}
