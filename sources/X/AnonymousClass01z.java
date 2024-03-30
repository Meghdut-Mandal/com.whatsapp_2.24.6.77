package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager$6;
import com.whatsapp.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.01z  reason: invalid class name */
public abstract class AnonymousClass01z {
    public int A00 = -1;
    public AnonymousClass01W A01;
    public C009904e A02;
    public C009904e A03;
    public C009904e A04;
    public AnonymousClass02E A05;
    public AnonymousClass02E A06;
    public C004401y A07;
    public C004201w A08;
    public AnonymousClass04X A09;
    public Runnable A0A = new AnonymousClass02C(this);
    public ArrayDeque A0B = new ArrayDeque();
    public ArrayList A0C;
    public ArrayList A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public AnonymousClass029 A0K = new AnonymousClass029(this);
    public AnonymousClass02A A0L = new AnonymousClass02B(this);
    public ArrayList A0M;
    public ArrayList A0N;
    public ArrayList A0O;
    public ArrayList A0P;
    public final AnonymousClass023 A0Q = new AnonymousClass024(this);
    public final AnonymousClass022 A0R = new AnonymousClass022(this);
    public final AnonymousClass025 A0S = new AnonymousClass025(this);
    public final AnonymousClass021 A0T = new AnonymousClass021();
    public final ArrayList A0U = new ArrayList();
    public final Map A0V = Collections.synchronizedMap(new HashMap());
    public final Map A0W = Collections.synchronizedMap(new HashMap());
    public final Map A0X = Collections.synchronizedMap(new HashMap());
    public final CopyOnWriteArrayList A0Y = new CopyOnWriteArrayList();
    public final AtomicInteger A0Z = new AtomicInteger();
    public final AnonymousClass026 A0a = new C18430t9(this, 3);
    public final AnonymousClass026 A0b = new C18430t9(this, 4);
    public final AnonymousClass026 A0c = new C18430t9(this, 5);
    public final AnonymousClass026 A0d = new C18430t9(this, 6);
    public final AnonymousClass027 A0e = new AnonymousClass028(this);

    private void A02() {
        this.A0F = false;
        this.A0O.clear();
        this.A0P.clear();
    }

    public static void A06(AnonymousClass02E r2) {
        if (A0E(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("show: ");
            sb.append(r2);
            Log.v("FragmentManager", sb.toString());
        }
        if (r2.A0d) {
            r2.A0d = false;
            r2.A03 = !r2.A03;
        }
    }

    /* JADX INFO: finally extract failed */
    public static void A09(AnonymousClass01z r4, int i) {
        try {
            r4.A0F = true;
            for (C022909q r0 : r4.A0T.A02.values()) {
                if (r0 != null) {
                    r0.A00 = i;
                }
            }
            r4.A0X(i, false);
            Iterator it = r4.A01().iterator();
            while (it.hasNext()) {
                ((AnonymousClass0BU) it.next()).A05();
            }
            r4.A0F = false;
            r4.A0q(true);
        } catch (Throwable th) {
            r4.A0F = false;
            throw th;
        }
    }

    public static boolean A0H(AnonymousClass01z r8, String str) {
        AnonymousClass01z r4 = r8;
        r8.A0q(false);
        r8.A0D(true);
        AnonymousClass02E r0 = r8.A06;
        String str2 = str;
        if (r0 != null && str == null && A0H(r0.A0k(), (String) null)) {
            return true;
        }
        ArrayList arrayList = r4.A0P;
        ArrayList arrayList2 = r4.A0O;
        boolean A0x = r4.A0x(str2, arrayList, arrayList2, -1, 0);
        if (A0x) {
            r4.A0F = true;
            try {
                r4.A0B(arrayList, arrayList2);
            } finally {
                r4.A02();
            }
        }
        A08(r4);
        if (r4.A0G) {
            r4.A0G = false;
            r4.A04();
        }
        r4.A0T.A02.values().removeAll(Collections.singleton((Object) null));
        return A0x;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002a, code lost:
        if (r2 != false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0S() {
        /*
            r6 = this;
            r2 = 1
            r6.A0E = r2
            r6.A0q(r2)
            java.util.HashSet r0 = r6.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x000e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r0 = r1.next()
            X.0BU r0 = (X.AnonymousClass0BU) r0
            r0.A05()
            goto L_0x000e
        L_0x001e:
            X.01y r1 = r6.A07
            boolean r0 = r1 instanceof X.AnonymousClass016
            if (r0 == 0) goto L_0x0079
            X.021 r0 = r6.A0T
            X.04X r0 = r0.A00
            boolean r2 = r0.A00
        L_0x002a:
            if (r2 == 0) goto L_0x0087
        L_0x002c:
            java.util.Map r0 = r6.A0V
            java.util.Collection r0 = r0.values()
            java.util.Iterator r5 = r0.iterator()
        L_0x0036:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0087
            java.lang.Object r0 = r5.next()
            X.0bC r0 = (X.C08710bC) r0
            java.util.List r0 = r0.A01
            java.util.Iterator r4 = r0.iterator()
        L_0x0048:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0036
            java.lang.Object r3 = r4.next()
            java.lang.String r3 = (java.lang.String) r3
            X.021 r0 = r6.A0T
            X.04X r2 = r0.A00
            r0 = 3
            boolean r0 = A0E(r0)
            if (r0 == 0) goto L_0x0075
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Clearing non-config state for saved state of Fragment "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.d(r0, r1)
        L_0x0075:
            X.AnonymousClass04X.A01(r2, r3)
            goto L_0x0048
        L_0x0079:
            android.content.Context r1 = r1.A01
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L_0x002c
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r0 = r1.isChangingConfigurations()
            r2 = r2 ^ r0
            goto L_0x002a
        L_0x0087:
            r0 = -1
            A09(r6, r0)
            X.01y r1 = r6.A07
            boolean r0 = r1 instanceof X.AnonymousClass01D
            if (r0 == 0) goto L_0x0096
            X.026 r0 = r6.A0d
            r1.Bnu(r0)
        L_0x0096:
            X.01y r1 = r6.A07
            boolean r0 = r1 instanceof X.AnonymousClass01C
            if (r0 == 0) goto L_0x00a1
            X.026 r0 = r6.A0a
            r1.Bnp(r0)
        L_0x00a1:
            X.01y r1 = r6.A07
            boolean r0 = r1 instanceof X.AnonymousClass01A
            if (r0 == 0) goto L_0x00ac
            X.026 r0 = r6.A0b
            r1.Bnq(r0)
        L_0x00ac:
            X.01y r1 = r6.A07
            boolean r0 = r1 instanceof X.AnonymousClass01B
            if (r0 == 0) goto L_0x00b7
            X.026 r0 = r6.A0c
            r1.Bnr(r0)
        L_0x00b7:
            X.01y r1 = r6.A07
            boolean r0 = r1 instanceof X.AnonymousClass01E
            if (r0 == 0) goto L_0x00c6
            X.02E r0 = r6.A05
            if (r0 != 0) goto L_0x00c6
            X.027 r0 = r6.A0e
            r1.Bno(r0)
        L_0x00c6:
            r2 = 0
            r6.A07 = r2
            r6.A08 = r2
            r6.A05 = r2
            X.01W r0 = r6.A01
            if (r0 == 0) goto L_0x00eb
            X.023 r0 = r6.A0Q
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.A00
            java.util.Iterator r1 = r0.iterator()
        L_0x00d9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00e9
            java.lang.Object r0 = r1.next()
            X.04V r0 = (X.AnonymousClass04V) r0
            r0.cancel()
            goto L_0x00d9
        L_0x00e9:
            r6.A01 = r2
        L_0x00eb:
            X.04e r0 = r6.A03
            if (r0 == 0) goto L_0x00fc
            r0.A00()
            X.04e r0 = r6.A04
            r0.A00()
            X.04e r0 = r6.A02
            r0.A00()
        L_0x00fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01z.A0S():void");
    }

    public void A0T() {
        A0q(true);
        A03();
    }

    public void A0V() {
        A0k(new C09840d4(this, (String) null, -1, 0), false);
    }

    public void A0W() {
        A0H(this, (String) null);
    }

    public void A0b(AnonymousClass02E r5) {
        if (A0E(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("attach: ");
            sb.append(r5);
            Log.v("FragmentManager", sb.toString());
        }
        if (r5.A0a) {
            r5.A0a = false;
            if (!r5.A0X) {
                this.A0T.A05(r5);
                if (A0E(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("add from attach: ");
                    sb2.append(r5);
                    Log.v("FragmentManager", sb2.toString());
                }
                if (A0F(r5)) {
                    this.A0H = true;
                }
            }
        }
    }

    public void A0c(AnonymousClass02E r6) {
        if (A0E(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("detach: ");
            sb.append(r6);
            Log.v("FragmentManager", sb.toString());
        }
        if (!r6.A0a) {
            r6.A0a = true;
            if (r6.A0X) {
                if (A0E(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("remove from detach: ");
                    sb2.append(r6);
                    Log.v("FragmentManager", sb2.toString());
                }
                ArrayList arrayList = this.A0T.A01;
                synchronized (arrayList) {
                    arrayList.remove(r6);
                }
                r6.A0X = false;
                if (A0F(r6)) {
                    this.A0H = true;
                }
                A05(r6);
            }
        }
    }

    public void A0d(AnonymousClass02E r3) {
        if (A0E(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("hide: ");
            sb.append(r3);
            Log.v("FragmentManager", sb.toString());
        }
        if (!r3.A0d) {
            r3.A0d = true;
            r3.A03 = true ^ r3.A03;
            A05(r3);
        }
    }

    public void A0e(AnonymousClass02E r4) {
        if (A0E(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("remove: ");
            sb.append(r4);
            sb.append(" nesting=");
            sb.append(r4.A04);
            Log.v("FragmentManager", sb.toString());
        }
        boolean z = false;
        if (r4.A04 > 0) {
            z = true;
        }
        boolean z2 = !z;
        if (!r4.A0a || z2) {
            ArrayList arrayList = this.A0T.A01;
            synchronized (arrayList) {
                arrayList.remove(r4);
            }
            r4.A0X = false;
            if (A0F(r4)) {
                this.A0H = true;
            }
            r4.A0i = true;
            A05(r4);
        }
    }

    public void A0n(String str, int i) {
        A0k(new C09840d4(this, str, -1, i), false);
    }

    public boolean A0w(AnonymousClass02E r4) {
        if (r4 != null) {
            AnonymousClass01z r1 = r4.A0M;
            if (!r4.equals(r1.A06) || !A0w(r1.A05)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0060 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0x(java.lang.String r8, java.util.ArrayList r9, java.util.ArrayList r10, int r11, int r12) {
        /*
            r7 = this;
            r6 = 1
            r0 = r12 & 1
            r5 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0008
            r2 = 1
        L_0x0008:
            java.util.ArrayList r4 = r7.A0C
            if (r4 == 0) goto L_0x0085
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0085
            if (r8 != 0) goto L_0x003a
            if (r11 >= 0) goto L_0x003a
            if (r2 == 0) goto L_0x0033
            r3 = 0
        L_0x0019:
            java.util.ArrayList r2 = r7.A0C
            int r1 = r2.size()
            int r1 = r1 - r6
        L_0x0020:
            if (r1 < r3) goto L_0x0084
            java.lang.Object r0 = r2.remove(r1)
            r9.add(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r10.add(r0)
            int r1 = r1 + -1
            goto L_0x0020
        L_0x0033:
            int r0 = r4.size()
            int r3 = r0 + -1
            goto L_0x005e
        L_0x003a:
            int r3 = r4.size()
        L_0x003e:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x0085
            java.lang.Object r1 = r4.get(r3)
            X.09Y r1 = (X.AnonymousClass09Y) r1
            if (r8 == 0) goto L_0x007d
            java.lang.String r0 = r1.A0B
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x007d
        L_0x0052:
            if (r2 != 0) goto L_0x0061
            int r0 = r4.size()
            int r0 = r0 + -1
            if (r3 == r0) goto L_0x0085
            int r3 = r3 + 1
        L_0x005e:
            if (r3 >= 0) goto L_0x0019
            return r5
        L_0x0061:
            if (r3 <= 0) goto L_0x005e
            int r2 = r3 + -1
            java.lang.Object r1 = r4.get(r2)
            X.09Y r1 = (X.AnonymousClass09Y) r1
            if (r8 == 0) goto L_0x0075
            java.lang.String r0 = r1.A0B
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x007b
        L_0x0075:
            if (r11 < 0) goto L_0x0019
            int r0 = r1.A08
            if (r11 != r0) goto L_0x0019
        L_0x007b:
            r3 = r2
            goto L_0x0061
        L_0x007d:
            if (r11 < 0) goto L_0x003e
            int r0 = r1.A08
            if (r11 != r0) goto L_0x003e
            goto L_0x0052
        L_0x0084:
            return r6
        L_0x0085:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01z.A0x(java.lang.String, java.util.ArrayList, java.util.ArrayList, int, int):boolean");
    }

    private ViewGroup A00(AnonymousClass02E r4) {
        ViewGroup viewGroup = r4.A0G;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (r4.A05 > 0 && this.A08.A01()) {
            View A002 = this.A08.A00(r4.A05);
            if (A002 instanceof ViewGroup) {
                return (ViewGroup) A002;
            }
        }
        return null;
    }

    private HashSet A01() {
        HashSet hashSet = new HashSet();
        Iterator it = this.A0T.A02().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C022909q) it.next()).A02.A0G;
            if (viewGroup != null) {
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (!(tag instanceof AnonymousClass0BU)) {
                    tag = new AnonymousClass0BV(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, tag);
                }
                hashSet.add(tag);
            }
        }
        return hashSet;
    }

    private void A04() {
        Iterator it = this.A0T.A02().iterator();
        while (it.hasNext()) {
            C022909q r2 = (C022909q) it.next();
            AnonymousClass02E r1 = r2.A02;
            if (r1.A0Z) {
                if (this.A0F) {
                    this.A0G = true;
                } else {
                    r1.A0Z = false;
                    r2.A04();
                }
            }
        }
    }

    public static void A07(AnonymousClass02E r2, AnonymousClass01z r3) {
        if (r2 != null) {
            if (r2.equals(r3.A0T.A00(r2.A0W))) {
                boolean A0w = r2.A0M.A0w(r2);
                Boolean bool = r2.A0S;
                if (bool == null || bool.booleanValue() != A0w) {
                    r2.A0S = Boolean.valueOf(A0w);
                    AnonymousClass01z r1 = r2.A0L;
                    A08(r1);
                    A07(r1.A06, r1);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r3.A0I() <= 0) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (r3.A0w(r3.A05) == false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        r1.A01 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        r1 = r3.A0Q;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A08(X.AnonymousClass01z r3) {
        /*
            java.util.ArrayList r1 = r3.A0U
            monitor-enter(r1)
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0026 }
            r2 = 1
            if (r0 != 0) goto L_0x0010
            X.023 r0 = r3.A0Q     // Catch:{ all -> 0x0026 }
            r0.A01 = r2     // Catch:{ all -> 0x0026 }
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            return
        L_0x0010:
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            X.023 r1 = r3.A0Q
            int r0 = r3.A0I()
            if (r0 <= 0) goto L_0x0024
            X.02E r0 = r3.A05
            boolean r0 = r3.A0w(r0)
            if (r0 == 0) goto L_0x0024
        L_0x0021:
            r1.A01 = r2
            return
        L_0x0024:
            r2 = 0
            goto L_0x0021
        L_0x0026:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01z.A08(X.01z):void");
    }

    private void A0D(boolean z) {
        if (this.A0F) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.A07 == null) {
            if (this.A0E) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() != this.A07.A02.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else if (!z && A0r()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.A0P == null) {
            this.A0P = new ArrayList();
            this.A0O = new ArrayList();
        }
    }

    public static boolean A0E(int i) {
        if (Log.isLoggable("FragmentManager", i)) {
            return true;
        }
        return false;
    }

    public static boolean A0F(AnonymousClass02E r1) {
        if (r1.A0c && r1.A0g) {
            return true;
        }
        Iterator it = r1.A0L.A0T.A03().iterator();
        while (it.hasNext()) {
            AnonymousClass02E r0 = (AnonymousClass02E) it.next();
            if (r0 != null && A0F(r0)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0G(AnonymousClass01z r2) {
        AnonymousClass02E r22 = r2.A05;
        if (r22 == null || (r22.A12() && A0G(r22.A0l()))) {
            return true;
        }
        return false;
    }

    public int A0I() {
        ArrayList arrayList = this.A0C;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01c3 A[LOOP:4: B:57:0x01bd->B:59:0x01c3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01ee A[LOOP:5: B:61:0x01e8->B:63:0x01ee, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Bundle A0J() {
        /*
            r11 = this;
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r11.A03()
            java.util.HashSet r0 = r11.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x0010:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0020
            java.lang.Object r0 = r1.next()
            X.0BU r0 = (X.AnonymousClass0BU) r0
            r0.A05()
            goto L_0x0010
        L_0x0020:
            r1 = 1
            r11.A0q(r1)
            r11.A0I = r1
            X.04X r0 = r11.A09
            r0.A01 = r1
            X.021 r2 = r11.A0T
            java.util.HashMap r1 = r2.A02
            int r0 = r1.size()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r0)
            java.util.Collection r0 = r1.values()
            java.util.Iterator r9 = r0.iterator()
        L_0x003f:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00bd
            java.lang.Object r7 = r9.next()
            X.09q r7 = (X.C022909q) r7
            if (r7 == 0) goto L_0x003f
            X.02E r3 = r7.A02
            X.0bN r5 = new X.0bN
            r5.<init>((X.AnonymousClass02E) r3)
            int r1 = r3.A08
            r0 = -1
            if (r1 <= r0) goto L_0x00b8
            android.os.Bundle r0 = r5.A00
            if (r0 != 0) goto L_0x00b8
            android.os.Bundle r4 = X.C022909q.A00(r7)
            r5.A00 = r4
            java.lang.String r0 = r3.A0V
            if (r0 == 0) goto L_0x0082
            if (r4 != 0) goto L_0x0070
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r5.A00 = r4
        L_0x0070:
            java.lang.String r1 = r3.A0V
            java.lang.String r0 = "android:target_state"
            r4.putString(r0, r1)
            int r4 = r3.A09
            if (r4 == 0) goto L_0x0082
            android.os.Bundle r1 = r5.A00
            java.lang.String r0 = "android:target_req_state"
            r1.putInt(r0, r4)
        L_0x0082:
            X.021 r0 = r7.A04
            java.lang.String r1 = r3.A0W
            java.util.HashMap r0 = r0.A03
            r0.put(r1, r5)
            java.lang.String r0 = r3.A0W
            r8.add(r0)
            r0 = 2
            boolean r0 = A0E(r0)
            if (r0 == 0) goto L_0x003f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Saved state of "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ": "
            r1.append(r0)
            android.os.Bundle r0 = r3.A0B
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.v(r0, r1)
            goto L_0x003f
        L_0x00b8:
            android.os.Bundle r0 = r3.A0B
            r5.A00 = r0
            goto L_0x0082
        L_0x00bd:
            java.util.HashMap r0 = r2.A03
            java.util.Collection r0 = r0.values()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r0)
            boolean r0 = r7.isEmpty()
            java.lang.String r9 = "FragmentManager"
            r10 = 2
            if (r0 == 0) goto L_0x00dd
            boolean r0 = A0E(r10)
            if (r0 == 0) goto L_0x00dc
            java.lang.String r0 = "saveAllState: no fragments!"
            android.util.Log.v(r9, r0)
        L_0x00dc:
            return r6
        L_0x00dd:
            java.util.ArrayList r3 = r2.A01
            monitor-enter(r3)
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x0213 }
            if (r0 == 0) goto L_0x00e8
            r5 = 0
            goto L_0x012b
        L_0x00e8:
            int r0 = r3.size()     // Catch:{ all -> 0x0213 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0213 }
            r5.<init>(r0)     // Catch:{ all -> 0x0213 }
            java.util.Iterator r4 = r3.iterator()     // Catch:{ all -> 0x0213 }
        L_0x00f5:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0213 }
            if (r0 == 0) goto L_0x012b
            java.lang.Object r2 = r4.next()     // Catch:{ all -> 0x0213 }
            X.02E r2 = (X.AnonymousClass02E) r2     // Catch:{ all -> 0x0213 }
            java.lang.String r0 = r2.A0W     // Catch:{ all -> 0x0213 }
            r5.add(r0)     // Catch:{ all -> 0x0213 }
            boolean r0 = A0E(r10)     // Catch:{ all -> 0x0213 }
            if (r0 == 0) goto L_0x00f5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0213 }
            r1.<init>()     // Catch:{ all -> 0x0213 }
            java.lang.String r0 = "saveAllState: adding fragment ("
            r1.append(r0)     // Catch:{ all -> 0x0213 }
            java.lang.String r0 = r2.A0W     // Catch:{ all -> 0x0213 }
            r1.append(r0)     // Catch:{ all -> 0x0213 }
            java.lang.String r0 = "): "
            r1.append(r0)     // Catch:{ all -> 0x0213 }
            r1.append(r2)     // Catch:{ all -> 0x0213 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0213 }
            android.util.Log.v(r9, r0)     // Catch:{ all -> 0x0213 }
            goto L_0x00f5
        L_0x012b:
            monitor-exit(r3)     // Catch:{ all -> 0x0213 }
            r4 = 0
            java.util.ArrayList r0 = r11.A0C
            if (r0 == 0) goto L_0x0176
            int r3 = r0.size()
            if (r3 <= 0) goto L_0x0176
            X.0bK[] r4 = new X.C08790bK[r3]
            r2 = 0
        L_0x013a:
            java.util.ArrayList r0 = r11.A0C
            java.lang.Object r1 = r0.get(r2)
            X.09Y r1 = (X.AnonymousClass09Y) r1
            X.0bK r0 = new X.0bK
            r0.<init>((X.AnonymousClass09Y) r1)
            r4[r2] = r0
            boolean r0 = A0E(r10)
            if (r0 == 0) goto L_0x0171
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "saveAllState: adding back stack #"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ": "
            r1.append(r0)
            java.util.ArrayList r0 = r11.A0C
            java.lang.Object r0 = r0.get(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.v(r9, r0)
        L_0x0171:
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x0176
            goto L_0x013a
        L_0x0176:
            X.0bJ r3 = new X.0bJ
            r3.<init>()
            r3.A02 = r8
            r3.A03 = r5
            r3.A07 = r4
            java.util.concurrent.atomic.AtomicInteger r0 = r11.A0Z
            int r0 = r0.get()
            r3.A00 = r0
            X.02E r0 = r11.A06
            if (r0 == 0) goto L_0x0191
            java.lang.String r0 = r0.A0W
            r3.A01 = r0
        L_0x0191:
            java.util.ArrayList r1 = r3.A04
            java.util.Map r2 = r11.A0V
            java.util.Set r0 = r2.keySet()
            r1.addAll(r0)
            java.util.ArrayList r1 = r3.A05
            java.util.Collection r0 = r2.values()
            r1.addAll(r0)
            java.util.ArrayDeque r1 = r11.A0B
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r3.A06 = r0
            java.lang.String r5 = "state"
            r6.putParcelable(r5, r3)
            java.util.Map r4 = r11.A0X
            java.util.Set r0 = r4.keySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x01bd:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01e4
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "result_"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r0 = r4.get(r2)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r6.putBundle(r1, r0)
            goto L_0x01bd
        L_0x01e4:
            java.util.Iterator r4 = r7.iterator()
        L_0x01e8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r3 = r4.next()
            X.0bN r3 = (X.C08820bN) r3
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r2.putParcelable(r5, r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "fragment_"
            r1.append(r0)
            java.lang.String r0 = r3.A07
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r6.putBundle(r0, r2)
            goto L_0x01e8
        L_0x0213:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0213 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01z.A0J():android.os.Bundle");
    }

    public C08740bF A0K(AnonymousClass02E r5) {
        Bundle A002;
        AnonymousClass021 r0 = this.A0T;
        C022909q r3 = (C022909q) r0.A02.get(r5.A0W);
        if (r3 != null) {
            AnonymousClass02E r1 = r3.A02;
            if (r1.equals(r5)) {
                if (r1.A08 <= -1 || (A002 = C022909q.A00(r3)) == null) {
                    return null;
                }
                return new C08740bF(A002);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(r5);
        sb.append(" is not currently in the FragmentManager");
        A0A(new IllegalStateException(sb.toString()));
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public AnonymousClass02E A0L(int i) {
        AnonymousClass021 r4 = this.A0T;
        ArrayList arrayList = r4.A01;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                AnonymousClass02E r2 = (AnonymousClass02E) arrayList.get(size);
                if (r2 != null && r2.A07 == i) {
                    return r2;
                }
            } else {
                for (C022909q r0 : r4.A02.values()) {
                    if (r0 != null) {
                        AnonymousClass02E r22 = r0.A02;
                        if (r22.A07 == i) {
                            return r22;
                        }
                    }
                }
                return null;
            }
        }
    }

    public AnonymousClass02E A0N(String str) {
        AnonymousClass021 r4 = this.A0T;
        if (str == null) {
            return null;
        }
        ArrayList arrayList = r4.A01;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                AnonymousClass02E r2 = (AnonymousClass02E) arrayList.get(size);
                if (r2 != null && str.equals(r2.A0U)) {
                    return r2;
                }
            } else {
                for (C022909q r0 : r4.A02.values()) {
                    if (r0 != null) {
                        AnonymousClass02E r22 = r0.A02;
                        if (str.equals(r22.A0U)) {
                            return r22;
                        }
                    }
                }
                return null;
            }
        }
    }

    public AnonymousClass029 A0O() {
        AnonymousClass02E r0 = this.A05;
        if (r0 != null) {
            return r0.A0M.A0O();
        }
        return this.A0K;
    }

    public C022909q A0P(AnonymousClass02E r4) {
        String str = r4.A0T;
        if (str != null) {
            C022009h.A01(r4, str);
        }
        if (A0E(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("add: ");
            sb.append(r4);
            Log.v("FragmentManager", sb.toString());
        }
        C022909q A0Q2 = A0Q(r4);
        r4.A0M = this;
        AnonymousClass021 r1 = this.A0T;
        r1.A06(A0Q2);
        if (!r4.A0a) {
            r1.A05(r4);
            r4.A0i = false;
            if (r4.A0F == null) {
                r4.A03 = false;
            }
            if (A0F(r4)) {
                this.A0H = true;
            }
        }
        return A0Q2;
    }

    public C022909q A0Q(AnonymousClass02E r4) {
        AnonymousClass021 r2 = this.A0T;
        C022909q r1 = (C022909q) r2.A02.get(r4.A0W);
        if (r1 != null) {
            return r1;
        }
        C022909q r12 = new C022909q(r4, this.A0S, r2);
        r12.A05(this.A07.A01.getClassLoader());
        r12.A00 = this.A00;
        return r12;
    }

    public void A0R() {
        Iterator it = this.A0T.A03().iterator();
        while (it.hasNext()) {
            AnonymousClass02E r1 = (AnonymousClass02E) it.next();
            if (r1 != null) {
                r1.A18(r1.A13());
                r1.A0L.A0R();
            }
        }
    }

    public void A0U() {
        if (this.A07 != null) {
            this.A0I = false;
            this.A0J = false;
            this.A09.A01 = false;
            for (AnonymousClass02E r0 : this.A0T.A04()) {
                if (r0 != null) {
                    r0.A0L.A0U();
                }
            }
        }
    }

    public void A0X(int i, boolean z) {
        C004401y r2;
        if (this.A07 == null && i != -1) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.A00) {
            this.A00 = i;
            AnonymousClass021 r4 = this.A0T;
            Iterator it = r4.A01.iterator();
            while (it.hasNext()) {
                C022909q r0 = (C022909q) r4.A02.get(((AnonymousClass02E) it.next()).A0W);
                if (r0 != null) {
                    r0.A04();
                }
            }
            for (C022909q r22 : r4.A02.values()) {
                if (r22 != null) {
                    r22.A04();
                    AnonymousClass02E r1 = r22.A02;
                    if (r1.A0i && r1.A04 <= 0) {
                        r4.A07(r22);
                    }
                }
            }
            A04();
            if (this.A0H && (r2 = this.A07) != null && this.A00 == 7) {
                r2.A04.invalidateOptionsMenu();
                this.A0H = false;
            }
        }
    }

    public void A0Y(Bundle bundle, AnonymousClass02E r4, String str) {
        if (r4.A0M != this) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(r4);
            sb.append(" is not currently in the FragmentManager");
            A0A(new IllegalStateException(sb.toString()));
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        bundle.putString(str, r4.A0W);
    }

    public void A0Z(Parcelable parcelable) {
        C022909q r18;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        Iterator<String> it = bundle3.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (next.startsWith("result_") && (bundle2 = bundle3.getBundle(next)) != null) {
                bundle2.setClassLoader(this.A07.A01.getClassLoader());
                this.A0X.put(next.substring(7), bundle2);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String next2 : bundle3.keySet()) {
            if (next2.startsWith("fragment_") && (bundle = bundle3.getBundle(next2)) != null) {
                bundle.setClassLoader(this.A07.A01.getClassLoader());
                arrayList.add(bundle.getParcelable("state"));
            }
        }
        AnonymousClass021 r2 = this.A0T;
        HashMap hashMap = r2.A03;
        hashMap.clear();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C08820bN r1 = (C08820bN) it2.next();
            hashMap.put(r1.A07, r1);
        }
        C08780bJ r5 = (C08780bJ) bundle3.getParcelable("state");
        if (r5 != null) {
            HashMap hashMap2 = r2.A02;
            hashMap2.clear();
            Iterator it3 = r5.A02.iterator();
            while (it3.hasNext()) {
                C08820bN r10 = (C08820bN) hashMap.remove(it3.next());
                if (r10 != null) {
                    AnonymousClass04X r0 = this.A09;
                    AnonymousClass02E r11 = (AnonymousClass02E) r0.A03.get(r10.A07);
                    if (r11 != null) {
                        if (A0E(2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("restoreSaveState: re-attaching retained ");
                            sb.append(r11);
                            Log.v("FragmentManager", sb.toString());
                        }
                        r18 = new C022909q(r11, this.A0S, r10, r2);
                    } else {
                        AnonymousClass025 r12 = this.A0S;
                        AnonymousClass025 r19 = r12;
                        r18 = new C022909q(r19, A0O(), r10, r2, this.A07.A01.getClassLoader());
                    }
                    AnonymousClass02E r102 = r18.A02;
                    r102.A0M = this;
                    if (A0E(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("restoreSaveState: active (");
                        sb2.append(r102.A0W);
                        sb2.append("): ");
                        sb2.append(r102);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    r18.A05(this.A07.A01.getClassLoader());
                    r2.A06(r18);
                    r18.A00 = this.A00;
                }
            }
            Iterator it4 = new ArrayList(this.A09.A03.values()).iterator();
            while (it4.hasNext()) {
                AnonymousClass02E r8 = (AnonymousClass02E) it4.next();
                if (hashMap2.get(r8.A0W) == null) {
                    if (A0E(2)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Discarding retained Fragment ");
                        sb3.append(r8);
                        sb3.append(" that was not found in the set of active Fragments ");
                        sb3.append(r5.A02);
                        Log.v("FragmentManager", sb3.toString());
                    }
                    this.A09.A0S(r8);
                    r8.A0M = this;
                    C022909q r13 = new C022909q(r8, this.A0S, r2);
                    r13.A00 = 1;
                    r13.A04();
                    r8.A0i = true;
                    r13.A04();
                }
            }
            ArrayList arrayList2 = r5.A03;
            r2.A01.clear();
            if (arrayList2 != null) {
                Iterator it5 = arrayList2.iterator();
                while (it5.hasNext()) {
                    String str = (String) it5.next();
                    AnonymousClass02E A002 = r2.A00(str);
                    if (A002 != null) {
                        if (A0E(2)) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("restoreSaveState: added (");
                            sb4.append(str);
                            sb4.append("): ");
                            sb4.append(A002);
                            Log.v("FragmentManager", sb4.toString());
                        }
                        r2.A05(A002);
                    } else {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("No instantiated fragment for (");
                        sb5.append(str);
                        sb5.append(")");
                        throw new IllegalStateException(sb5.toString());
                    }
                }
            }
            C08790bK[] r02 = r5.A07;
            if (r02 != null) {
                this.A0C = new ArrayList(r02.length);
                int i = 0;
                while (true) {
                    C08790bK[] r14 = r5.A07;
                    if (i >= r14.length) {
                        break;
                    }
                    C08790bK r122 = r14[i];
                    AnonymousClass09Y r82 = new AnonymousClass09Y(this);
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        int[] iArr = r122.A0D;
                        boolean z = true;
                        if (i2 >= iArr.length) {
                            break;
                        }
                        C021909g r132 = new C021909g();
                        int i4 = i2 + 1;
                        r132.A00 = iArr[i2];
                        if (A0E(2)) {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("Instantiate ");
                            sb6.append(r82);
                            sb6.append(" op #");
                            sb6.append(i3);
                            sb6.append(" base fragment #");
                            sb6.append(iArr[i4]);
                            Log.v("FragmentManager", sb6.toString());
                        }
                        r132.A07 = AnonymousClass01P.values()[r122.A0C[i3]];
                        r132.A06 = AnonymousClass01P.values()[r122.A0B[i3]];
                        int i5 = i4 + 1;
                        if (iArr[i4] == 0) {
                            z = false;
                        }
                        r132.A08 = z;
                        int i6 = i5 + 1;
                        int i7 = iArr[i5];
                        r132.A01 = i7;
                        int i8 = i6 + 1;
                        int i9 = iArr[i6];
                        r132.A02 = i9;
                        int i10 = i8 + 1;
                        int i11 = iArr[i8];
                        r132.A03 = i11;
                        i2 = i10 + 1;
                        int i12 = iArr[i10];
                        r132.A04 = i12;
                        r82.A04 = i7;
                        r82.A05 = i9;
                        r82.A06 = i11;
                        r82.A07 = i12;
                        r82.A0H(r132);
                        i3++;
                    }
                    r82.A03 = r122.A03;
                    r82.A0B = r122.A06;
                    r82.A0F = true;
                    r82.A02 = r122.A01;
                    r82.A0A = r122.A05;
                    r82.A01 = r122.A00;
                    r82.A09 = r122.A04;
                    r82.A0D = r122.A08;
                    r82.A0E = r122.A09;
                    r82.A0G = r122.A0A;
                    r82.A08 = r122.A02;
                    int i13 = 0;
                    while (true) {
                        ArrayList arrayList3 = r122.A07;
                        if (i13 >= arrayList3.size()) {
                            break;
                        }
                        String str2 = (String) arrayList3.get(i13);
                        if (str2 != null) {
                            ((C021909g) r82.A0C.get(i13)).A05 = r2.A00(str2);
                        }
                        i13++;
                    }
                    r82.A05(1);
                    if (A0E(2)) {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("restoreAllState: back stack #");
                        sb7.append(i);
                        sb7.append(" (index ");
                        sb7.append(r82.A08);
                        sb7.append("): ");
                        sb7.append(r82);
                        Log.v("FragmentManager", sb7.toString());
                        PrintWriter printWriter = new PrintWriter(new C05060Nb());
                        r82.A0I(printWriter, "  ", false);
                        printWriter.close();
                    }
                    this.A0C.add(r82);
                    i++;
                }
            } else {
                this.A0C = null;
            }
            this.A0Z.set(r5.A00);
            String str3 = r5.A01;
            if (str3 != null) {
                AnonymousClass02E A003 = r2.A00(str3);
                this.A06 = A003;
                A07(A003, this);
            }
            ArrayList arrayList4 = r5.A04;
            if (arrayList4 != null) {
                for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                    this.A0V.put(arrayList4.get(i14), r5.A05.get(i14));
                }
            }
            this.A0B = new ArrayDeque(r5.A06);
        }
    }

    public void A0a(Menu menu) {
        if (this.A00 >= 1) {
            for (AnonymousClass02E r1 : this.A0T.A04()) {
                if (r1 != null && !r1.A0d) {
                    r1.A0L.A0a(menu);
                }
            }
        }
    }

    public void A0f(AnonymousClass02E r3) {
        if (r3 != null) {
            if (!r3.equals(this.A0T.A00(r3.A0W)) || !(r3.A0K == null || r3.A0M == this)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(r3);
                sb.append(" is not an active fragment of FragmentManager ");
                sb.append(this);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        AnonymousClass02E r0 = this.A06;
        this.A06 = r3;
        A07(r0, this);
        A07(this.A06, this);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.016, X.01F, X.01y] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0g(X.AnonymousClass02E r7, X.C004401y r8, X.C004201w r9) {
        /*
            r6 = this;
            X.01y r0 = r6.A07
            if (r0 != 0) goto L_0x017c
            r6.A07 = r8
            r6.A08 = r9
            r6.A05 = r7
            if (r7 == 0) goto L_0x0175
            X.09u r1 = new X.09u
            r1.<init>(r7, r6)
        L_0x0011:
            java.util.concurrent.CopyOnWriteArrayList r0 = r6.A0Y
            r0.add(r1)
        L_0x0016:
            X.02E r0 = r6.A05
            if (r0 == 0) goto L_0x001d
            A08(r6)
        L_0x001d:
            boolean r0 = r8 instanceof X.AnonymousClass01F
            if (r0 == 0) goto L_0x0030
            r2 = r8
            X.01W r1 = r8.BEd()
            r6.A01 = r1
            if (r7 == 0) goto L_0x002b
            r2 = r7
        L_0x002b:
            X.023 r0 = r6.A0Q
            r1.A01(r0, r2)
        L_0x0030:
            if (r7 == 0) goto L_0x014e
            X.01z r0 = r7.A0M
            X.04X r3 = r0.A09
            java.util.HashMap r2 = r3.A02
            java.lang.String r0 = r7.A0W
            java.lang.Object r1 = r2.get(r0)
            X.04X r1 = (X.AnonymousClass04X) r1
            if (r1 != 0) goto L_0x004e
            boolean r0 = r3.A05
            X.04X r1 = new X.04X
            r1.<init>(r0)
            java.lang.String r0 = r7.A0W
            r2.put(r0, r1)
        L_0x004e:
            r6.A09 = r1
            boolean r0 = r6.A0r()
            r1.A01 = r0
            X.021 r0 = r6.A0T
            r0.A00 = r1
            X.01y r1 = r6.A07
            boolean r0 = r1 instanceof X.AnonymousClass017
            if (r0 == 0) goto L_0x007a
            if (r7 != 0) goto L_0x007a
            X.01U r2 = r1.BGx()
            r0 = 3
            X.0tU r1 = new X.0tU
            r1.<init>(r6, r0)
            java.lang.String r0 = "android:support:fragments"
            r2.A03(r1, r0)
            android.os.Bundle r0 = r2.A00(r0)
            if (r0 == 0) goto L_0x007a
            r6.A0Z(r0)
        L_0x007a:
            X.01y r1 = r6.A07
            boolean r0 = r1 instanceof X.AnonymousClass019
            if (r0 == 0) goto L_0x0110
            X.01X r4 = r1.B8F()
            if (r7 == 0) goto L_0x014a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r7.A0W
            r1.append(r0)
            java.lang.String r0 = ":"
            r1.append(r0)
            java.lang.String r2 = r1.toString()
        L_0x0099:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "FragmentManager:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r5 = r1.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r0 = "StartActivityForResult"
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            X.04a r2 = new X.04a
            r2.<init>()
            r1 = 1
            X.0tS r0 = new X.0tS
            r0.<init>(r6, r1)
            X.0sc r0 = r4.A02(r0, r2, r3)
            r6.A03 = r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r0 = "StartIntentSenderForResult"
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            X.04f r2 = new X.04f
            r2.<init>()
            r1 = 2
            X.0tS r0 = new X.0tS
            r0.<init>(r6, r1)
            X.0sc r0 = r4.A02(r0, r2, r3)
            r6.A04 = r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r0 = "RequestPermissions"
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            X.04g r2 = new X.04g
            r2.<init>()
            r1 = 0
            X.0tS r0 = new X.0tS
            r0.<init>(r6, r1)
            X.0sc r0 = r4.A02(r0, r2, r3)
            r6.A02 = r0
        L_0x0110:
            X.01y r1 = r6.A07
            boolean r0 = r1 instanceof X.AnonymousClass01C
            if (r0 == 0) goto L_0x011b
            X.026 r0 = r6.A0a
            r1.B0X(r0)
        L_0x011b:
            X.01y r1 = r6.A07
            boolean r0 = r1 instanceof X.AnonymousClass01D
            if (r0 == 0) goto L_0x0126
            X.026 r0 = r6.A0d
            r1.B0d(r0)
        L_0x0126:
            X.01y r1 = r6.A07
            boolean r0 = r1 instanceof X.AnonymousClass01A
            if (r0 == 0) goto L_0x0131
            X.026 r0 = r6.A0b
            r1.B0Z(r0)
        L_0x0131:
            X.01y r1 = r6.A07
            boolean r0 = r1 instanceof X.AnonymousClass01B
            if (r0 == 0) goto L_0x013c
            X.026 r0 = r6.A0c
            r1.B0a(r0)
        L_0x013c:
            X.01y r1 = r6.A07
            boolean r0 = r1 instanceof X.AnonymousClass01E
            if (r0 == 0) goto L_0x0149
            if (r7 != 0) goto L_0x0149
            X.027 r0 = r6.A0e
            r1.B0U(r0)
        L_0x0149:
            return
        L_0x014a:
            java.lang.String r2 = ""
            goto L_0x0099
        L_0x014e:
            boolean r0 = r8 instanceof X.AnonymousClass016
            if (r0 == 0) goto L_0x016d
            X.04J r3 = r8.BJ7()
            X.04G r2 = X.AnonymousClass04X.A06
            r0 = 1
            X.AnonymousClass00C.A0D(r3, r0)
            X.04M r0 = X.AnonymousClass04M.A00
            X.04H r1 = new X.04H
            r1.<init>(r2, r3, r0)
            java.lang.Class<X.04X> r0 = X.AnonymousClass04X.class
            X.04R r1 = r1.A00(r0)
            X.04X r1 = (X.AnonymousClass04X) r1
            goto L_0x004e
        L_0x016d:
            r0 = 0
            X.04X r1 = new X.04X
            r1.<init>(r0)
            goto L_0x004e
        L_0x0175:
            boolean r0 = r8 instanceof X.C004301x
            if (r0 == 0) goto L_0x0016
            r1 = r8
            goto L_0x0011
        L_0x017c:
            java.lang.String r1 = "Already attached"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01z.A0g(X.02E, X.01y, X.01w):void");
    }

    public void A0h(AnonymousClass02E r3, AnonymousClass01P r4) {
        if (!r3.equals(this.A0T.A00(r3.A0W)) || !(r3.A0K == null || r3.A0M == this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(r3);
            sb.append(" is not an active fragment of FragmentManager ");
            sb.append(this);
            throw new IllegalArgumentException(sb.toString());
        }
        r3.A0O = r4;
    }

    public void A0j(AnonymousClass09W r3, boolean z) {
        if (!z || (this.A07 != null && !this.A0E)) {
            A0D(z);
            if (r3.B7o(this.A0P, this.A0O)) {
                this.A0F = true;
                try {
                    A0B(this.A0P, this.A0O);
                } finally {
                    A02();
                }
            }
            A08(this);
            if (this.A0G) {
                this.A0G = false;
                A04();
            }
            this.A0T.A02.values().removeAll(Collections.singleton((Object) null));
        }
    }

    public void A0k(AnonymousClass09W r4, boolean z) {
        if (!z) {
            if (this.A07 == null) {
                if (this.A0E) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (A0r()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        ArrayList arrayList = this.A0U;
        synchronized (arrayList) {
            if (this.A07 != null) {
                arrayList.add(r4);
                try {
                    if (arrayList.size() == 1) {
                        Handler handler = this.A07.A02;
                        Runnable runnable = this.A0A;
                        handler.removeCallbacks(runnable);
                        this.A07.A02.post(runnable);
                        A08(this);
                    }
                } catch (Throwable th) {
                    th = th;
                }
            } else if (!z) {
                th = new IllegalStateException("Activity has been destroyed");
                throw th;
            }
        }
    }

    public final void A0m(String str) {
        AnonymousClass05V r0 = (AnonymousClass05V) this.A0W.remove(str);
        if (r0 != null) {
            r0.A00.A05(r0.A01);
        }
        if (A0E(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing FragmentResultListener for key ");
            sb.append(str);
            Log.v("FragmentManager", sb.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0o(java.lang.String r4, android.os.Bundle r5) {
        /*
            r3 = this;
            java.util.Map r0 = r3.A0W
            java.lang.Object r2 = r0.get(r4)
            X.05V r2 = (X.AnonymousClass05V) r2
            if (r2 == 0) goto L_0x0041
            X.01P r1 = X.AnonymousClass01P.STARTED
            X.01M r0 = r2.A00
            X.01N r0 = (X.AnonymousClass01N) r0
            X.01P r0 = r0.A02
            int r0 = r0.compareTo(r1)
            if (r0 < 0) goto L_0x0041
            r2.BYP(r4, r5)
        L_0x001b:
            r0 = 2
            boolean r0 = A0E(r0)
            if (r0 == 0) goto L_0x0040
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Setting fragment result with key "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " and result "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.v(r0, r1)
        L_0x0040:
            return
        L_0x0041:
            java.util.Map r0 = r3.A0X
            r0.put(r4, r5)
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01z.A0o(java.lang.String, android.os.Bundle):void");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void A0p(java.lang.String r7, java.io.FileDescriptor r8, java.io.PrintWriter r9, java.lang.String[] r10) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r1 = "    "
            r0.append(r1)
            java.lang.String r5 = r0.toString()
            X.021 r3 = r6.A0T
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            r0.append(r1)
            java.lang.String r2 = r0.toString()
            java.util.HashMap r1 = r3.A02
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x005a
            r9.print(r7)
            java.lang.String r0 = "Active Fragments:"
            r9.println(r0)
            java.util.Collection r0 = r1.values()
            java.util.Iterator r1 = r0.iterator()
        L_0x003a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r1.next()
            X.09q r0 = (X.C022909q) r0
            r9.print(r7)
            if (r0 == 0) goto L_0x0054
            X.02E r0 = r0.A02
            r9.println(r0)
            r0.A0z(r2, r8, r9, r10)
            goto L_0x003a
        L_0x0054:
            java.lang.String r0 = "null"
            r9.println(r0)
            goto L_0x003a
        L_0x005a:
            java.util.ArrayList r4 = r3.A01
            int r3 = r4.size()
            if (r3 <= 0) goto L_0x008b
            r9.print(r7)
            java.lang.String r0 = "Added Fragments:"
            r9.println(r0)
            r2 = 0
        L_0x006b:
            java.lang.Object r1 = r4.get(r2)
            r9.print(r7)
            java.lang.String r0 = "  #"
            r9.print(r0)
            r9.print(r2)
            java.lang.String r0 = ": "
            r9.print(r0)
            java.lang.String r0 = r1.toString()
            r9.println(r0)
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x008b
            goto L_0x006b
        L_0x008b:
            java.util.ArrayList r0 = r6.A0M
            r4 = 0
            if (r0 == 0) goto L_0x00c1
            int r3 = r0.size()
            if (r3 <= 0) goto L_0x00c1
            r9.print(r7)
            java.lang.String r0 = "Fragments Created Menus:"
            r9.println(r0)
            r2 = 0
        L_0x009f:
            java.util.ArrayList r0 = r6.A0M
            java.lang.Object r1 = r0.get(r2)
            r9.print(r7)
            java.lang.String r0 = "  #"
            r9.print(r0)
            r9.print(r2)
            java.lang.String r0 = ": "
            r9.print(r0)
            java.lang.String r0 = r1.toString()
            r9.println(r0)
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x00c1
            goto L_0x009f
        L_0x00c1:
            java.util.ArrayList r0 = r6.A0C
            if (r0 == 0) goto L_0x00fc
            int r3 = r0.size()
            if (r3 <= 0) goto L_0x00fc
            r9.print(r7)
            java.lang.String r0 = "Back Stack:"
            r9.println(r0)
            r2 = 0
        L_0x00d4:
            java.util.ArrayList r0 = r6.A0C
            java.lang.Object r1 = r0.get(r2)
            X.09Y r1 = (X.AnonymousClass09Y) r1
            r9.print(r7)
            java.lang.String r0 = "  #"
            r9.print(r0)
            r9.print(r2)
            java.lang.String r0 = ": "
            r9.print(r0)
            java.lang.String r0 = r1.toString()
            r9.println(r0)
            r0 = 1
            r1.A0I(r9, r5, r0)
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x00fc
            goto L_0x00d4
        L_0x00fc:
            r9.print(r7)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Back Stack Index: "
            r1.append(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r6.A0Z
            int r0 = r0.get()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r9.println(r0)
            java.util.ArrayList r3 = r6.A0U
            monitor-enter(r3)
            int r2 = r3.size()     // Catch:{ all -> 0x01b9 }
            if (r2 <= 0) goto L_0x0148
            r9.print(r7)     // Catch:{ all -> 0x01b9 }
            java.lang.String r0 = "Pending Actions:"
            r9.println(r0)     // Catch:{ all -> 0x01b9 }
        L_0x012a:
            java.lang.Object r1 = r3.get(r4)     // Catch:{ all -> 0x01b9 }
            X.09W r1 = (X.AnonymousClass09W) r1     // Catch:{ all -> 0x01b9 }
            r9.print(r7)     // Catch:{ all -> 0x01b9 }
            java.lang.String r0 = "  #"
            r9.print(r0)     // Catch:{ all -> 0x01b9 }
            r9.print(r4)     // Catch:{ all -> 0x01b9 }
            java.lang.String r0 = ": "
            r9.print(r0)     // Catch:{ all -> 0x01b9 }
            r9.println(r1)     // Catch:{ all -> 0x01b9 }
            int r4 = r4 + 1
            if (r4 >= r2) goto L_0x0148
            goto L_0x012a
        L_0x0148:
            monitor-exit(r3)     // Catch:{ all -> 0x01b9 }
            r9.print(r7)
            java.lang.String r0 = "FragmentManager misc state:"
            r9.println(r0)
            r9.print(r7)
            java.lang.String r0 = "  mHost="
            r9.print(r0)
            X.01y r0 = r6.A07
            r9.println(r0)
            r9.print(r7)
            java.lang.String r0 = "  mContainer="
            r9.print(r0)
            X.01w r0 = r6.A08
            r9.println(r0)
            X.02E r0 = r6.A05
            if (r0 == 0) goto L_0x017c
            r9.print(r7)
            java.lang.String r0 = "  mParent="
            r9.print(r0)
            X.02E r0 = r6.A05
            r9.println(r0)
        L_0x017c:
            r9.print(r7)
            java.lang.String r0 = "  mCurState="
            r9.print(r0)
            int r0 = r6.A00
            r9.print(r0)
            java.lang.String r0 = " mStateSaved="
            r9.print(r0)
            boolean r0 = r6.A0I
            r9.print(r0)
            java.lang.String r0 = " mStopped="
            r9.print(r0)
            boolean r0 = r6.A0J
            r9.print(r0)
            java.lang.String r0 = " mDestroyed="
            r9.print(r0)
            boolean r0 = r6.A0E
            r9.println(r0)
            boolean r0 = r6.A0H
            if (r0 == 0) goto L_0x01b8
            r9.print(r7)
            java.lang.String r0 = "  mNeedMenuInvalidate="
            r9.print(r0)
            boolean r0 = r6.A0H
            r9.println(r0)
        L_0x01b8:
            return
        L_0x01b9:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01b9 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01z.A0p(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    public boolean A0r() {
        if (this.A0I || this.A0J) {
            return true;
        }
        return false;
    }

    public boolean A0s(Menu menu) {
        boolean z = false;
        if (this.A00 >= 1) {
            for (AnonymousClass02E r2 : this.A0T.A04()) {
                if (r2 != null && r2.A14()) {
                    boolean z2 = false;
                    if (!r2.A0d) {
                        if (r2.A0c && r2.A0g) {
                            z2 = true;
                            r2.A1T(menu);
                        }
                        if (z2 || r2.A0L.A0s(menu)) {
                            z = true;
                        }
                    }
                }
            }
        }
        return z;
    }

    public boolean A0t(Menu menu, MenuInflater menuInflater) {
        int i = 0;
        if (this.A00 < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (AnonymousClass02E r4 : this.A0T.A04()) {
            if (r4 != null && r4.A14()) {
                boolean z2 = false;
                if (!r4.A0d) {
                    if (r4.A0c && r4.A0g) {
                        z2 = true;
                        r4.A1U(menu, menuInflater);
                    }
                    if (z2 || r4.A0L.A0t(menu, menuInflater)) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(r4);
                        z = true;
                    }
                }
            }
        }
        if (this.A0M != null) {
            while (true) {
                ArrayList arrayList2 = this.A0M;
                if (i >= arrayList2.size()) {
                    break;
                }
                AnonymousClass02E r1 = (AnonymousClass02E) arrayList2.get(i);
                if (arrayList == null || !arrayList.contains(r1)) {
                    r1.A1I();
                }
                i++;
            }
        }
        this.A0M = arrayList;
        return z;
    }

    public boolean A0u(MenuItem menuItem) {
        if (this.A00 >= 1) {
            for (AnonymousClass02E r0 : this.A0T.A04()) {
                if (r0 != null && r0.A16(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean A0v(MenuItem menuItem) {
        if (this.A00 >= 1) {
            for (AnonymousClass02E r1 : this.A0T.A04()) {
                if (r1 != null && !r1.A0d) {
                    if ((r1.A0c && r1.A0g && r1.A1X(menuItem)) || r1.A0L.A0v(menuItem)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.A05;
        if (obj == null && (obj = this.A07) == null) {
            sb.append("null");
        } else {
            sb.append(obj.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
            sb.append("}");
        }
        sb.append("}}");
        return sb.toString();
    }

    private void A03() {
        Iterator it = A01().iterator();
        while (it.hasNext()) {
            AnonymousClass0BU r2 = (AnonymousClass0BU) it.next();
            if (r2.A00) {
                if (A0E(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                r2.A00 = false;
                r2.A04();
            }
        }
    }

    private void A05(AnonymousClass02E r5) {
        C023009r r2;
        boolean z;
        ViewGroup A002 = A00(r5);
        if (A002 != null && (r2 = r5.A0H) != null && r2.A01 + r2.A02 + r2.A04 + r2.A05 > 0) {
            if (A002.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                A002.setTag(R.id.visible_removing_fragment_view_tag, r5);
            }
            AnonymousClass02E r22 = (AnonymousClass02E) A002.getTag(R.id.visible_removing_fragment_view_tag);
            C023009r r0 = r5.A0H;
            if (r0 == null) {
                z = false;
            } else {
                z = r0.A0F;
            }
            if (r22.A0H != null) {
                AnonymousClass02E.A01(r22).A0F = z;
            }
        }
    }

    private void A0A(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C05060Nb());
        C004401y r5 = this.A07;
        if (r5 != null) {
            try {
                r5.A04.dump("  ", (FileDescriptor) null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        } else {
            A0p("  ", (FileDescriptor) null, printWriter, new String[0]);
            throw runtimeException;
        }
    }

    private void A0B(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                if (!((AnonymousClass09Y) arrayList.get(i)).A0G) {
                    if (i2 != i) {
                        A0C(arrayList, arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (((Boolean) arrayList2.get(i)).booleanValue()) {
                        while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((AnonymousClass09Y) arrayList.get(i2)).A0G) {
                            i2++;
                        }
                    }
                    A0C(arrayList, arrayList2, i, i2);
                    i = i2 - 1;
                }
                i++;
            }
            if (i2 != size) {
                A0C(arrayList, arrayList2, i2, size);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    public AnonymousClass02E A0M(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        AnonymousClass02E A002 = this.A0T.A00(string);
        if (A002 != null) {
            return A002;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment no longer exists for key ");
        sb.append(str);
        sb.append(": unique id ");
        sb.append(string);
        A0A(new IllegalStateException(sb.toString()));
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public void A0i(AnonymousClass02E r3, boolean z) {
        ViewGroup A002 = A00(r3);
        if (A002 != null && (A002 instanceof FragmentContainerView)) {
            ((FragmentContainerView) A002).A00 = !z;
        }
    }

    public final void A0l(AnonymousClass05T r5, AnonymousClass012 r6, String str) {
        AnonymousClass01M lifecycle = r6.getLifecycle();
        if (((AnonymousClass01N) lifecycle).A02 != AnonymousClass01P.DESTROYED) {
            FragmentManager$6 fragmentManager$6 = new FragmentManager$6(this, r5, lifecycle, str);
            AnonymousClass05V r0 = (AnonymousClass05V) this.A0W.put(str, new AnonymousClass05V(r5, lifecycle, fragmentManager$6));
            if (r0 != null) {
                r0.A00.A05(r0.A01);
            }
            if (A0E(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Setting FragmentResultListener with key ");
                sb.append(str);
                sb.append(" lifecycleOwner ");
                sb.append(lifecycle);
                sb.append(" and listener ");
                sb.append(r5);
                Log.v("FragmentManager", sb.toString());
            }
            lifecycle.A04(fragmentManager$6);
        }
    }

    public void A0q(boolean z) {
        A0D(z);
        while (true) {
            ArrayList arrayList = this.A0P;
            ArrayList arrayList2 = this.A0O;
            ArrayList arrayList3 = this.A0U;
            synchronized (arrayList3) {
                if (arrayList3.isEmpty()) {
                    break;
                }
                try {
                    int size = arrayList3.size();
                    boolean z2 = false;
                    for (int i = 0; i < size; i++) {
                        z2 |= ((AnonymousClass09W) arrayList3.get(i)).B7o(arrayList, arrayList2);
                    }
                    if (!z2) {
                        break;
                    }
                    this.A0F = true;
                    try {
                        A0B(this.A0P, this.A0O);
                    } finally {
                        A02();
                    }
                } finally {
                    arrayList3.clear();
                    this.A07.A02.removeCallbacks(this.A0A);
                }
            }
        }
        A08(this);
        if (this.A0G) {
            this.A0G = false;
            A04();
        }
        this.A0T.A02.values().removeAll(Collections.singleton((Object) null));
    }

    private void A0C(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ViewGroup viewGroup;
        AnonymousClass01z r0;
        AnonymousClass01z r02;
        ArrayList arrayList3 = arrayList;
        int i3 = i;
        boolean z = ((AnonymousClass09Y) arrayList3.get(i3)).A0G;
        ArrayList arrayList4 = this.A0N;
        if (arrayList4 == null) {
            arrayList4 = new ArrayList();
            this.A0N = arrayList4;
        } else {
            arrayList4.clear();
        }
        AnonymousClass021 r21 = this.A0T;
        arrayList4.addAll(r21.A04());
        AnonymousClass02E r8 = this.A06;
        int i4 = i3;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList5 = arrayList2;
            int i5 = i2;
            if (i4 < i5) {
                AnonymousClass09Y r9 = (AnonymousClass09Y) arrayList3.get(i4);
                boolean booleanValue = ((Boolean) arrayList5.get(i4)).booleanValue();
                ArrayList arrayList6 = this.A0N;
                if (!booleanValue) {
                    int i6 = 0;
                    while (true) {
                        ArrayList arrayList7 = r9.A0C;
                        if (i6 < arrayList7.size()) {
                            C021909g r11 = (C021909g) arrayList7.get(i6);
                            int i7 = r11.A00;
                            if (i7 != 1) {
                                if (i7 == 2) {
                                    AnonymousClass02E r6 = r11.A05;
                                    int i8 = r6.A05;
                                    boolean z3 = false;
                                    for (int size = arrayList6.size() - 1; size >= 0; size--) {
                                        AnonymousClass02E r5 = (AnonymousClass02E) arrayList6.get(size);
                                        if (r5.A05 == i8) {
                                            if (r5 == r6) {
                                                z3 = true;
                                            } else {
                                                if (r5 == r8) {
                                                    arrayList7.add(i6, new C021909g(r5, 9, true));
                                                    i6++;
                                                    r8 = null;
                                                }
                                                C021909g r15 = new C021909g(r5, 3, true);
                                                r15.A01 = r11.A01;
                                                r15.A03 = r11.A03;
                                                r15.A02 = r11.A02;
                                                r15.A04 = r11.A04;
                                                arrayList7.add(i6, r15);
                                                arrayList6.remove(r5);
                                                i6++;
                                            }
                                        }
                                    }
                                    if (z3) {
                                        arrayList7.remove(i6);
                                        i6--;
                                    } else {
                                        r11.A00 = 1;
                                        r11.A08 = true;
                                        arrayList6.add(r6);
                                    }
                                } else if (i7 == 3 || i7 == 6) {
                                    arrayList6.remove(r11.A05);
                                    AnonymousClass02E r62 = r11.A05;
                                    if (r62 == r8) {
                                        arrayList7.add(i6, new C021909g(r62, 9));
                                        i6++;
                                        r8 = null;
                                    }
                                } else if (i7 != 7) {
                                    if (i7 == 8) {
                                        arrayList7.add(i6, new C021909g(r8, 9, true));
                                        r11.A08 = true;
                                        i6++;
                                        r8 = r11.A05;
                                    }
                                }
                                i6++;
                            }
                            arrayList6.add(r11.A05);
                            i6++;
                        }
                    }
                } else {
                    ArrayList arrayList8 = r9.A0C;
                    for (int size2 = arrayList8.size() - 1; size2 >= 0; size2--) {
                        C021909g r63 = (C021909g) arrayList8.get(size2);
                        int i9 = r63.A00;
                        if (i9 != 1) {
                            if (i9 != 3) {
                                switch (i9) {
                                    case 6:
                                        break;
                                    case 7:
                                        break;
                                    case 8:
                                        r8 = null;
                                        break;
                                    case 9:
                                        r8 = r63.A05;
                                        break;
                                    case 10:
                                        r63.A06 = r63.A07;
                                        break;
                                }
                            }
                            arrayList6.add(r63.A05);
                        }
                        arrayList6.remove(r63.A05);
                    }
                }
                if (!z2) {
                    z2 = false;
                    if (!r9.A0F) {
                        i4++;
                    }
                }
                z2 = true;
                i4++;
            } else {
                this.A0N.clear();
                if (!z) {
                    if (this.A00 >= 1) {
                        for (int i10 = i3; i10 < i5; i10++) {
                            Iterator it = ((AnonymousClass09Y) arrayList3.get(i10)).A0C.iterator();
                            while (it.hasNext()) {
                                AnonymousClass02E r7 = ((C021909g) it.next()).A05;
                                if (!(r7 == null || r7.A0M == null)) {
                                    r21.A06(A0Q(r7));
                                }
                            }
                        }
                    }
                }
                for (int i11 = i3; i11 < i5; i11++) {
                    AnonymousClass09Y r82 = (AnonymousClass09Y) arrayList3.get(i11);
                    if (((Boolean) arrayList5.get(i11)).booleanValue()) {
                        r82.A05(-1);
                        ArrayList arrayList9 = r82.A0C;
                        for (int size3 = arrayList9.size() - 1; size3 >= 0; size3--) {
                            C021909g r13 = (C021909g) arrayList9.get(size3);
                            AnonymousClass02E r112 = r13.A05;
                            if (r112 != null) {
                                if (r112.A0H != null) {
                                    AnonymousClass02E.A01(r112).A0F = true;
                                }
                                int i12 = r82.A03;
                                int i13 = 4100;
                                if (i12 == 4097) {
                                    i13 = 8194;
                                } else if (i12 == 8194) {
                                    i13 = 4097;
                                } else if (i12 != 8197) {
                                    if (i12 != 4099) {
                                        i13 = 8197;
                                        if (i12 != 4100) {
                                            i13 = 0;
                                        }
                                    } else {
                                        i13 = 4099;
                                    }
                                }
                                if (!(r112.A0H == null && i13 == 0)) {
                                    AnonymousClass02E.A01(r112);
                                    r112.A0H.A03 = i13;
                                }
                                ArrayList arrayList10 = r82.A0E;
                                ArrayList arrayList11 = r82.A0D;
                                AnonymousClass02E.A01(r112);
                                C023009r r03 = r112.A0H;
                                r03.A0C = arrayList10;
                                r03.A0D = arrayList11;
                            }
                            int i14 = r13.A00;
                            switch (i14) {
                                case 1:
                                    r112.A0r(r13.A01, r13.A02, r13.A03, r13.A04);
                                    AnonymousClass01z r04 = r82.A0J;
                                    r04.A0i(r112, true);
                                    r04.A0e(r112);
                                    break;
                                case 3:
                                    r112.A0r(r13.A01, r13.A02, r13.A03, r13.A04);
                                    r82.A0J.A0P(r112);
                                    break;
                                case 4:
                                    r112.A0r(r13.A01, r13.A02, r13.A03, r13.A04);
                                    A06(r112);
                                    break;
                                case 5:
                                    r112.A0r(r13.A01, r13.A02, r13.A03, r13.A04);
                                    AnonymousClass01z r05 = r82.A0J;
                                    r05.A0i(r112, true);
                                    r05.A0d(r112);
                                    break;
                                case 6:
                                    r112.A0r(r13.A01, r13.A02, r13.A03, r13.A04);
                                    r82.A0J.A0b(r112);
                                    break;
                                case 7:
                                    r112.A0r(r13.A01, r13.A02, r13.A03, r13.A04);
                                    AnonymousClass01z r06 = r82.A0J;
                                    r06.A0i(r112, true);
                                    r06.A0c(r112);
                                    break;
                                case 8:
                                    r02 = r82.A0J;
                                    r112 = null;
                                    break;
                                case 9:
                                    r02 = r82.A0J;
                                    break;
                                case 10:
                                    r82.A0J.A0h(r112, r13.A07);
                                    break;
                                default:
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Unknown cmd: ");
                                    sb.append(i14);
                                    throw new IllegalArgumentException(sb.toString());
                            }
                            r02.A0f(r112);
                        }
                        continue;
                    } else {
                        r82.A05(1);
                        ArrayList arrayList12 = r82.A0C;
                        int size4 = arrayList12.size();
                        for (int i15 = 0; i15 < size4; i15++) {
                            C021909g r14 = (C021909g) arrayList12.get(i15);
                            AnonymousClass02E r132 = r14.A05;
                            if (r132 != null) {
                                if (r132.A0H != null) {
                                    AnonymousClass02E.A01(r132).A0F = false;
                                }
                                int i16 = r82.A03;
                                if (!(r132.A0H == null && i16 == 0)) {
                                    AnonymousClass02E.A01(r132);
                                    r132.A0H.A03 = i16;
                                }
                                ArrayList arrayList13 = r82.A0D;
                                ArrayList arrayList14 = r82.A0E;
                                AnonymousClass02E.A01(r132);
                                C023009r r07 = r132.A0H;
                                r07.A0C = arrayList13;
                                r07.A0D = arrayList14;
                            }
                            int i17 = r14.A00;
                            switch (i17) {
                                case 1:
                                    r132.A0r(r14.A01, r14.A02, r14.A03, r14.A04);
                                    AnonymousClass01z r08 = r82.A0J;
                                    r08.A0i(r132, false);
                                    r08.A0P(r132);
                                    break;
                                case 3:
                                    r132.A0r(r14.A01, r14.A02, r14.A03, r14.A04);
                                    r82.A0J.A0e(r132);
                                    break;
                                case 4:
                                    r132.A0r(r14.A01, r14.A02, r14.A03, r14.A04);
                                    r82.A0J.A0d(r132);
                                    break;
                                case 5:
                                    r132.A0r(r14.A01, r14.A02, r14.A03, r14.A04);
                                    r82.A0J.A0i(r132, false);
                                    A06(r132);
                                    break;
                                case 6:
                                    r132.A0r(r14.A01, r14.A02, r14.A03, r14.A04);
                                    r82.A0J.A0c(r132);
                                    break;
                                case 7:
                                    r132.A0r(r14.A01, r14.A02, r14.A03, r14.A04);
                                    AnonymousClass01z r09 = r82.A0J;
                                    r09.A0i(r132, false);
                                    r09.A0b(r132);
                                    break;
                                case 8:
                                    r0 = r82.A0J;
                                    break;
                                case 9:
                                    r0 = r82.A0J;
                                    r132 = null;
                                    break;
                                case 10:
                                    r82.A0J.A0h(r132, r14.A06);
                                    break;
                                default:
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Unknown cmd: ");
                                    sb2.append(i17);
                                    throw new IllegalArgumentException(sb2.toString());
                            }
                            r0.A0f(r132);
                        }
                        continue;
                    }
                }
                boolean booleanValue2 = ((Boolean) arrayList5.get(i2 - 1)).booleanValue();
                for (int i18 = i3; i18 < i5; i18++) {
                    AnonymousClass09Y r10 = (AnonymousClass09Y) arrayList3.get(i18);
                    ArrayList arrayList15 = r10.A0C;
                    if (booleanValue2) {
                        for (int size5 = arrayList15.size() - 1; size5 >= 0; size5--) {
                            AnonymousClass02E r010 = ((C021909g) r10.A0C.get(size5)).A05;
                            if (r010 != null) {
                                A0Q(r010).A04();
                            }
                        }
                    } else {
                        Iterator it2 = arrayList15.iterator();
                        while (it2.hasNext()) {
                            AnonymousClass02E r011 = ((C021909g) it2.next()).A05;
                            if (r011 != null) {
                                A0Q(r011).A04();
                            }
                        }
                    }
                }
                A0X(this.A00, true);
                HashSet hashSet = new HashSet();
                for (int i19 = i3; i19 < i5; i19++) {
                    Iterator it3 = ((AnonymousClass09Y) arrayList3.get(i19)).A0C.iterator();
                    while (it3.hasNext()) {
                        AnonymousClass02E r012 = ((C021909g) it3.next()).A05;
                        if (!(r012 == null || (viewGroup = r012.A0G) == null)) {
                            hashSet.add(AnonymousClass0BU.A00(viewGroup));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    AnonymousClass0BU r013 = (AnonymousClass0BU) it4.next();
                    r013.A01 = booleanValue2;
                    r013.A06();
                    r013.A04();
                }
                while (i3 < i5) {
                    AnonymousClass09Y r4 = (AnonymousClass09Y) arrayList3.get(i3);
                    if (((Boolean) arrayList5.get(i3)).booleanValue() && r4.A08 >= 0) {
                        r4.A08 = -1;
                    }
                    i3++;
                }
                if (z2 && this.A0D != null) {
                    int i20 = 0;
                    while (true) {
                        ArrayList arrayList16 = this.A0D;
                        if (i20 < arrayList16.size()) {
                            AnonymousClass01L r42 = (AnonymousClass01L) ((C15770nx) arrayList16.get(i20));
                            AnonymousClass07B supportActionBar = r42.getSupportActionBar();
                            if (supportActionBar != null) {
                                int A0I2 = r42.A04.A00.A03.A0I();
                                int i21 = R.string.f12nameremoved;
                                if (A0I2 == 0) {
                                    i21 = R.string.f12nameremoved;
                                }
                                supportActionBar.A0Q(r42.getString(i21));
                                supportActionBar.A0U(true);
                            }
                            i20++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }
}
