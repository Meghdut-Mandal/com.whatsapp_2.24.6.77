package X;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.R;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3T1  reason: invalid class name */
public abstract class AnonymousClass3T1 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public C88944Uq A0J;
    public AnonymousClass9TX A0K;
    public C52152oy A0L;
    public C202319lY A0M;
    public AnonymousClass11F A0N;
    public C223313w A0O;
    public C223313w A0P;
    public PhoneUserJid A0Q;
    public PhoneUserJid A0R;
    public PhoneUserJid A0S;
    public AnonymousClass6D0 A0T;
    public C62673Hb A0U;
    public AnonymousClass3BG A0V;
    public AnonymousClass3T1 A0W;
    public C61583Cq A0X;
    public C64933Qa A0Y;
    public AnonymousClass9WK A0Z;
    public AnonymousClass3L1 A0a;
    public C80113ur A0b;
    public AnonymousClass3GP A0c;
    public Boolean A0d;
    public Integer A0e;
    public Long A0f;
    public Long A0g;
    public Long A0h;
    public Long A0i;
    public Long A0j;
    public Long A0k;
    public Long A0l;
    public String A0m;
    public String A0n;
    public String A0o;
    public String A0p;
    public String A0q;
    public String A0r;
    public String A0s;
    public String A0t;
    public String A0u;
    public String A0v;
    public List A0w;
    public List A0x;
    public Map A0y;
    public boolean A0z;
    public boolean A10;
    public boolean A11;
    public boolean A12;
    public boolean A13;
    public boolean A14;
    public boolean A15;
    public boolean A16;
    public byte[] A17;
    public int A18;
    public C63483Kf A19;
    public AnonymousClass3KQ A1A;
    public C63673Ky A1B;
    public C63663Kx A1C;
    public C63683Kz A1D;
    public C63393Jw A1E;
    public AnonymousClass37F A1F;
    public AnonymousClass3A4 A1G;
    public AnonymousClass3JM A1H;
    public final int A1I;
    public final C64933Qa A1J;
    public final C63503Kh A1K;
    public final C63503Kh A1L;
    public final Object A1M;
    public volatile long A1N;
    public volatile long A1O;
    public volatile boolean A1P;
    public transient long A1Q;
    public transient long A1R;
    public transient long A1S;
    public transient DeviceJid A1T;
    public transient C46752bc A1U;
    public transient AnonymousClass5J2 A1V;
    public transient boolean A1W;
    public transient boolean A1X;
    public transient boolean A1Y;
    public transient boolean A1Z;
    public transient boolean A1a;
    public transient byte[] A1b;
    public transient boolean A1c;
    public final transient long A1d;
    public final transient Map A1e;
    public volatile transient int A1f;

    public static C64933Qa A06(AnonymousClass3T1 r1) {
        AnonymousClass00C.A0D(r1, 0);
        return r1.A1J;
    }

    public static String[] A0C(AnonymousClass3T1 r4, StringBuilder sb, boolean z) {
        sb.append(r4.A1J);
        C18740tg.A0E(z, sb.toString());
        return new String[]{Long.toString(r4.A1N)};
    }

    public int A0F() {
        String str;
        if (this instanceof AnonymousClass2bU) {
            str = ((AnonymousClass2bU) this).A08;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            A0k(64);
        }
        return this.A0A;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public java.lang.String A0b() {
        /*
            r6 = this;
            r4 = r6
            boolean r0 = r6 instanceof X.AnonymousClass2cN
            if (r0 == 0) goto L_0x0025
            r4 = r6
            X.2cN r4 = (X.AnonymousClass2cN) r4
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            long r0 = r4.A01
            r3.append(r0)
            java.lang.String r2 = ","
            r3.append(r2)
            long r0 = r4.A00
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r4.A02
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r3)
            return r0
        L_0x0025:
            boolean r0 = r6 instanceof X.C46992cO
            if (r0 == 0) goto L_0x0041
            r2 = r6
            X.2cO r2 = (X.C46992cO) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = r2.A01
            r1.append(r0)
            java.lang.String r0 = ","
            r1.append(r0)
            int r0 = r2.A00
            java.lang.String r0 = X.C36381kD.A10(r1, r0)
            return r0
        L_0x0041:
            boolean r0 = r6 instanceof X.AnonymousClass2cL
            if (r0 == 0) goto L_0x0050
            r0 = r6
            X.2cL r0 = (X.AnonymousClass2cL) r0
            monitor-enter(r4)
            boolean r0 = r0.A00     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0072 }
            goto L_0x0070
        L_0x0050:
            boolean r0 = r6 instanceof X.AnonymousClass2cM
            if (r0 == 0) goto L_0x0075
            r3 = r6
            X.2cM r3 = (X.AnonymousClass2cM) r3
            monitor-enter(r4)
            org.json.JSONObject r2 = X.C36441kJ.A1B()     // Catch:{ all -> 0x0072 }
            java.lang.String r1 = "bizOptOutAction"
            int r0 = r3.A00     // Catch:{ all -> 0x0072 }
            org.json.JSONObject r2 = r2.put(r1, r0)     // Catch:{ all -> 0x0072 }
            java.lang.String r1 = "bizOptOutCategory"
            int r0 = r3.A01     // Catch:{ all -> 0x0072 }
            org.json.JSONObject r0 = r2.put(r1, r0)     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0072 }
        L_0x0070:
            monitor-exit(r4)
            return r0
        L_0x0072:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0075:
            boolean r0 = r6 instanceof X.AnonymousClass2bS
            if (r0 == 0) goto L_0x007f
            r0 = r6
            X.2bS r0 = (X.AnonymousClass2bS) r0
            java.lang.String r0 = r0.A03
            return r0
        L_0x007f:
            boolean r0 = r6 instanceof X.AnonymousClass2cT
            if (r0 == 0) goto L_0x00bd
            r0 = r6
            X.2cT r0 = (X.AnonymousClass2cT) r0
            java.lang.Object r5 = r0.A1M
            X.AnonymousClass00C.A07(r5)
            monitor-enter(r5)
            X.9ud r4 = r0.A00     // Catch:{ all -> 0x00ba }
            r0 = 0
            if (r4 == 0) goto L_0x00b8
            java.lang.String r3 = r4.A02     // Catch:{ all -> 0x00ba }
            if (r3 == 0) goto L_0x009c
            int r1 = r3.length()     // Catch:{ all -> 0x00ba }
            r0 = 0
            if (r1 != 0) goto L_0x009d
        L_0x009c:
            r0 = 1
        L_0x009d:
            if (r0 == 0) goto L_0x00a2
            java.lang.String r0 = r4.A04     // Catch:{ all -> 0x00ba }
            goto L_0x00b8
        L_0x00a2:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00ba }
            java.lang.String r1 = "\n     "
            r2.append(r1)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = r4.A04     // Catch:{ all -> 0x00ba }
            X.AnonymousClass000.A1D(r0, r1, r3, r2)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = X.AnonymousClass000.A0q(r1, r2)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = X.AnonymousClass091.A01(r0)     // Catch:{ all -> 0x00ba }
        L_0x00b8:
            monitor-exit(r5)
            return r0
        L_0x00ba:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x00bd:
            boolean r0 = r6 instanceof X.AnonymousClass2c4
            if (r0 == 0) goto L_0x00c7
            r0 = r6
            X.2c4 r0 = (X.AnonymousClass2c4) r0
            java.lang.String r0 = r0.A00
            return r0
        L_0x00c7:
            boolean r0 = r6 instanceof X.AnonymousClass2bX
            if (r0 == 0) goto L_0x00d8
            r0 = r6
            X.2bX r0 = (X.AnonymousClass2bX) r0
            java.lang.Object r1 = r0.A1M
            monitor-enter(r1)
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x00d5 }
            monitor-exit(r1)     // Catch:{ all -> 0x00d5 }
            return r0
        L_0x00d5:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00d5 }
            throw r0
        L_0x00d8:
            java.lang.Object r3 = r6.A1M
            monitor-enter(r3)
            int r1 = r6.A02     // Catch:{ all -> 0x00f7 }
            r0 = 1
            if (r1 != r0) goto L_0x00e2
            r2 = 0
            goto L_0x00f5
        L_0x00e2:
            java.lang.String r2 = r6.A0m     // Catch:{ all -> 0x00f7 }
            if (r2 != 0) goto L_0x00f5
            byte[] r1 = r6.A17     // Catch:{ all -> 0x00f7 }
            if (r1 == 0) goto L_0x00f5
            java.lang.String r0 = X.C19430v1.A0B     // Catch:{ UnsupportedEncodingException -> 0x00f2 }
            java.lang.String r2 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x00f2 }
            r2.<init>(r1, r0)     // Catch:{ UnsupportedEncodingException -> 0x00f2 }
            goto L_0x00f3
        L_0x00f2:
            r2 = 0
        L_0x00f3:
            r6.A0m = r2     // Catch:{ all -> 0x00f7 }
        L_0x00f5:
            monitor-exit(r3)     // Catch:{ all -> 0x00f7 }
            return r2
        L_0x00f7:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00f7 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3T1.A0b():java.lang.String");
    }

    public synchronized void A1C(byte[] bArr) {
        A1D(bArr, false);
    }

    public synchronized void A1D(byte[] bArr, boolean z) {
        boolean z2 = true;
        boolean A1V2 = AnonymousClass000.A1V(A0V());
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("FMessage/setThumbnailBytes/should only be called on a message that supports thumbnails. Message type = ");
        C18740tg.A0D(A1V2, C36381kD.A10(A0u2, this.A1I));
        if (this.A1D != null) {
            byte[] bArr2 = null;
            if (z) {
                bArr2 = bArr;
            }
            A1B(bArr2);
            C63683Kz r1 = this.A1D;
            if (z) {
                z2 = false;
            }
            synchronized (r1) {
                r1.A02 = z2;
                r1.A00 = null;
                r1.A01 = true;
                r1.A03 = bArr;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
        if (A1V().length > 0) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003c, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r1.A03 == null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A1Q() {
        /*
            r3 = this;
            monitor-enter(r3)
            X.3Kz r1 = r3.A0V()     // Catch:{ all -> 0x003d }
            r2 = 0
            if (r1 == 0) goto L_0x003b
            boolean r0 = r1.A01     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0011
            byte[] r1 = r1.A03     // Catch:{ all -> 0x003d }
            r0 = 1
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            r1 = 1
            if (r0 != 0) goto L_0x0039
            int r0 = r3.A0D()     // Catch:{ all -> 0x003d }
            if (r0 != 0) goto L_0x002c
            java.lang.String r0 = r3.A0b()     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x002c
            java.lang.String r0 = r3.A0b()     // Catch:{ all -> 0x003d }
            int r0 = r0.length()     // Catch:{ all -> 0x003d }
            if (r0 <= 0) goto L_0x002c
            goto L_0x0039
        L_0x002c:
            byte[] r0 = r3.A1V()     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x003b
            byte[] r0 = r3.A1V()     // Catch:{ all -> 0x003d }
            int r0 = r0.length     // Catch:{ all -> 0x003d }
            if (r0 <= 0) goto L_0x003b
        L_0x0039:
            monitor-exit(r3)
            return r1
        L_0x003b:
            monitor-exit(r3)
            return r2
        L_0x003d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3T1.A1Q():boolean");
    }

    public static int A04(AnonymousClass3T1 r3) {
        return AnonymousClass6UH.A01(r3.A1I, r3.A09, C66013Ui.A0q(r3));
    }

    public static void A07(TextView textView, C19970wo r3, C18820ts r4, AnonymousClass3T1 r5) {
        textView.setText(AnonymousClass3UM.A00(r4, r3.A08(r5.A0I)));
    }

    public static boolean A0B(AnonymousClass3T1 r1, AnonymousClass3T1 r2) {
        return r1.A1J.equals(r2.A1J);
    }

    public int A0D() {
        int i;
        synchronized (this.A1M) {
            i = this.A02;
        }
        return i;
    }

    public int A0E() {
        if (this instanceof C46752bc) {
            return ((C46752bc) this).A01;
        }
        return this.A07;
    }

    public int A0H() {
        if (this instanceof AnonymousClass2bM) {
            return 4;
        }
        return this.A18;
    }

    public UserJid A0L() {
        int i;
        String str;
        if (this instanceof AnonymousClass2bI) {
            AnonymousClass2bI r1 = (AnonymousClass2bI) this;
            if (r1 instanceof AnonymousClass2cP) {
                return ((AnonymousClass2cP) r1).A01;
            }
            return null;
        }
        C64933Qa r5 = this.A1J;
        AnonymousClass11F r12 = r5.A00;
        if (r12 instanceof C28981Uw) {
            return null;
        }
        if (C197029b1.A00(this.A0N)) {
            return (UserJid) this.A0N;
        }
        try {
            if ((r12 instanceof C177528dw) && r5.A02) {
                return C223613z.A00;
            }
            if (AnonymousClass143.A0G(r12) || (r12 instanceof C177618e5)) {
                return (UserJid) this.A0N;
            }
            return (UserJid) r12;
        } catch (ClassCastException e) {
            if (r12 != null) {
                i = r12.getType();
            } else {
                i = -1;
            }
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("FMessage/getSenderUserJid/key.id=");
            A0u2.append(r5.A01);
            A0u2.append("; key.ChatJidType=");
            A0u2.append(i);
            A0u2.append("; msg_type=");
            A0u2.append(this.A1I);
            A0u2.append("; senderJid=");
            Log.e(AnonymousClass000.A0o(this.A0N, A0u2), e);
            AnonymousClass11F r2 = this.A0N;
            if (r2 != null) {
                StringBuilder A0u3 = AnonymousClass000.A0u();
                A0u3.append("FMessage/getSenderUserJid/SenderJid type: ");
                str = C36381kD.A10(A0u3, r2.getType());
            } else {
                str = "FMessage/getSenderUserJid/SenderJid is NULL";
            }
            Log.e(str);
            return null;
        }
    }

    public C63483Kf A0M() {
        C63483Kf r0;
        synchronized (this.A1M) {
            r0 = this.A19;
        }
        return r0;
    }

    public AnonymousClass3KQ A0N() {
        AnonymousClass3KQ r0;
        synchronized (this.A1M) {
            r0 = this.A1A;
        }
        return r0;
    }

    public C63673Ky A0O() {
        C63673Ky r0;
        synchronized (this.A1M) {
            r0 = this.A1B;
        }
        return r0;
    }

    public C63663Kx A0P() {
        C63663Kx r0;
        synchronized (this.A1M) {
            r0 = this.A1C;
        }
        return r0;
    }

    public C62673Hb A0Q() {
        C62673Hb r0;
        synchronized (this.A1M) {
            r0 = this.A0U;
        }
        return r0;
    }

    public C80103un A0R() {
        Long l = this.A0f;
        long j = 0;
        if (!AnonymousClass000.A1R(this.A05) && (l == null || l.longValue() <= 0)) {
            return null;
        }
        int i = this.A05;
        if (l != null) {
            j = l.longValue();
        }
        return new C80103un(i, j, this.A00);
    }

    public AnonymousClass3T1 A0S() {
        if ((this instanceof AnonymousClass2bI) || (this instanceof AnonymousClass2bY) || (this instanceof AnonymousClass2bH) || (this instanceof AnonymousClass2bM)) {
            return null;
        }
        return this.A0W;
    }

    public C61583Cq A0T() {
        C61583Cq r0 = this.A0X;
        if (r0 != null) {
            return r0;
        }
        C61583Cq r02 = new C61583Cq();
        this.A0X = r02;
        return r02;
    }

    public final C63503Kh A0U(int i) {
        C63503Kh r2 = new C63503Kh(this, i);
        this.A1e.put(Integer.valueOf(i), r2);
        return r2;
    }

    public C63683Kz A0V() {
        C63683Kz r1;
        synchronized (this.A1M) {
            r1 = this.A1D;
            if (r1 == null && C66013Ui.A0M(this.A1I)) {
                r1 = new C63683Kz();
                this.A1D = r1;
            }
        }
        return r1;
    }

    public C63393Jw A0W() {
        C63393Jw r0;
        synchronized (this.A1M) {
            r0 = this.A1E;
        }
        return r0;
    }

    public AnonymousClass37F A0X() {
        AnonymousClass37F r0;
        synchronized (this.A1M) {
            r0 = this.A1F;
        }
        return r0;
    }

    public AnonymousClass3A4 A0Z() {
        AnonymousClass3A4 r0;
        synchronized (this.A1M) {
            r0 = this.A1G;
        }
        return r0;
    }

    public AnonymousClass3JM A0a() {
        AnonymousClass3JM r0;
        synchronized (this.A1M) {
            r0 = this.A1H;
        }
        return r0;
    }

    public String A0c() {
        if (this instanceof AnonymousClass2bV) {
            return ((AnonymousClass2bV) this).A05;
        }
        if (this instanceof AnonymousClass2cP) {
            return ((AnonymousClass2cP) this).A03;
        }
        if (this instanceof C46992cO) {
            if (((C46992cO) this).A02) {
                return "video";
            }
            return "audio";
        } else if (this instanceof AnonymousClass2bU) {
            return ((AnonymousClass2bU) this).A02;
        } else {
            if (this instanceof C46902br) {
                return ((C46902br) this).A03;
            }
            if (this instanceof AnonymousClass2bQ) {
                return ((AnonymousClass2bQ) this).A04;
            }
            if (this instanceof AnonymousClass2c5) {
                return ((AnonymousClass2c5) this).A01;
            }
            if (this instanceof AnonymousClass2c8) {
                return AnonymousClass143.A03(((AnonymousClass2c8) this).A00);
            }
            if (this instanceof AnonymousClass2bP) {
                return ((AnonymousClass2bP) this).A02;
            }
            return null;
        }
    }

    public String A0d() {
        C207219uk r0;
        if ((this instanceof AnonymousClass2bV) || (this instanceof AnonymousClass2bI)) {
            return A0b();
        }
        if (this instanceof AnonymousClass2bS) {
            return ((AnonymousClass2bS) this).A03;
        }
        if (this instanceof C46902br) {
            return ((C46902br) this).A03;
        }
        if (this instanceof AnonymousClass2bZ) {
            AnonymousClass2bZ r2 = (AnonymousClass2bZ) this;
            if (!AnonymousClass000.A1S(r2.A0A & 2097152, 2097152) || (r0 = r2.A00) == null) {
                return null;
            }
            return r0.A09;
        } else if (this instanceof AnonymousClass2bU) {
            AnonymousClass2bU r22 = (AnonymousClass2bU) this;
            boolean z = r22 instanceof C46872bo;
            C46872bo r23 = r22;
            if (z) {
                C46872bo r24 = (C46872bo) r22;
                boolean A1S2 = AnonymousClass000.A1S(r24.A0A & 2097152, 2097152);
                r23 = r24;
                if (A1S2) {
                    C207219uk r02 = r24.A00;
                    if (r02 != null) {
                        return r02.A09;
                    }
                    return null;
                }
            }
            return r23.A02;
        } else if (this instanceof AnonymousClass2bQ) {
            return ((AnonymousClass2bQ) this).A04;
        } else {
            if (this instanceof AnonymousClass2c4) {
                return ((AnonymousClass2c4) this).A00;
            }
            if (this instanceof AnonymousClass2bW) {
                return ((AnonymousClass2bW) this).A00;
            }
            if (this instanceof AnonymousClass2bX) {
                return ((AnonymousClass2bX) this).A00;
            }
            if (this instanceof AnonymousClass2bP) {
                return ((AnonymousClass2bP) this).A02;
            }
            if (this instanceof AnonymousClass2bT) {
                return ((AnonymousClass2bT) this).A05;
            }
            return null;
        }
    }

    public List A0e() {
        String str;
        if (!(this instanceof AnonymousClass2bI)) {
            return this.A0x;
        }
        if (((AnonymousClass2bI) this) instanceof AnonymousClass2cP) {
            str = "should not be called for FMessageSystemPayment";
        } else {
            str = "should not be called for FMessageSystem";
        }
        C18740tg.A0D(false, str);
        return null;
    }

    public void A0f() {
        synchronized (this.A1M) {
        }
    }

    public void A0g() {
        if (this instanceof AnonymousClass2bI) {
            C18740tg.A0D(false, "Cannot change status for FMessageSystem");
        } else {
            this.A0D = 0;
        }
    }

    public void A0h(int i) {
        this.A1R |= (long) i;
    }

    public void A0i(int i) {
        this.A08 = i | this.A08;
    }

    public void A0j(int i) {
        this.A0A = i | this.A0A;
    }

    public void A0k(int i) {
        this.A0A = (~i) & this.A0A;
    }

    public void A0l(int i) {
        synchronized (this.A1M) {
            this.A02 = i;
        }
    }

    public void A0m(int i) {
        if (!(this instanceof AnonymousClass2bY) && !(this instanceof AnonymousClass2bH)) {
            if (i <= 0) {
                this.A05 = 0;
                A0k(256);
                return;
            }
            this.A05 = i;
            A0j(256);
        }
    }

    public void A0n(int i) {
        if (AnonymousClass3TJ.A00(this.A0D, i) > 0) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("FMessage/setStatus/statusDowngrade/key=");
            A0u2.append(this.A1J);
            A0u2.append("; type=");
            A0u2.append(this.A1I);
            A0u2.append("; current=");
            A0u2.append(this.A0D);
            C36321k7.A1S("; new=", A0u2, i);
        }
        this.A0D = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r3 == r5) goto L_0x0007;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0o(int r5) {
        /*
            r4 = this;
            int r3 = r4.A18
            if (r3 == 0) goto L_0x0007
            r2 = 0
            if (r3 != r5) goto L_0x0008
        L_0x0007:
            r2 = 1
        L_0x0008:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "FMessage/setStorageType/should only update storage type when it is undefined; current="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "; new="
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r5)
            X.C18740tg.A0D(r2, r0)
            r4.A18 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3T1.A0o(int):void");
    }

    public void A0p(AnonymousClass3XT r3) {
        AnonymousClass3GP r1 = this.A0c;
        if (r3 != null) {
            r1.A00 = r3.A00;
        } else {
            r3 = null;
        }
        r1.A01 = r3;
    }

    public void A0q(AnonymousClass11F r5) {
        int i;
        if (this instanceof AnonymousClass2bI) {
            AnonymousClass2bI r3 = (AnonymousClass2bI) this;
            if (r3 instanceof AnonymousClass2cP) {
                if (r5 == null) {
                    return;
                }
                if (!r3.A1Y()) {
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("should not be called for FMessageSystem, key = ");
                    A0u2.append(r3.A1J);
                    A0u2.append(" action = ");
                    C18740tg.A0D(false, C36381kD.A10(A0u2, r3.A00));
                }
            } else if (r5 == null) {
                return;
            } else {
                if (!r3.A1Y()) {
                    StringBuilder A0u3 = AnonymousClass000.A0u();
                    A0u3.append("FMessageSystem/setRemoteResourceJid/should not be called for FMessageSystem, key = ");
                    A0u3.append(r3.A1J);
                    A0u3.append(" action = ");
                    C36351kA.A1R(A0u3, r3.A00);
                    return;
                }
            }
            r3.A0N = r5;
            return;
        }
        if (r5 != null && !(r5 instanceof UserJid) && !(r5 instanceof C177618e5)) {
            C64933Qa r32 = this.A1J;
            AnonymousClass11F r0 = r32.A00;
            if (r0 != null) {
                i = r0.getType();
            } else {
                i = -1;
            }
            StringBuilder A0u4 = AnonymousClass000.A0u();
            A0u4.append("FMessage/setSenderUserJid/senderJid not a UserJid; key.id=");
            A0u4.append(r32.A01);
            A0u4.append("; key.ChatJidType=");
            A0u4.append(i);
            A0u4.append("; msg_type=");
            A0u4.append(this.A1I);
            C36321k7.A1J(r5, "; senderJid=", A0u4);
        }
        this.A0N = r5;
        this.A0x = null;
    }

    public void A0r(C63483Kf r3) {
        synchronized (this.A1M) {
            this.A19 = r3;
        }
    }

    public void A0s(AnonymousClass3KQ r3) {
        synchronized (this.A1M) {
            this.A1A = r3;
        }
    }

    public void A0t(C63673Ky r3) {
        synchronized (this.A1M) {
            this.A1B = r3;
        }
    }

    public void A0u(C63663Kx r4) {
        synchronized (this.A1M) {
            this.A1C = r4;
            if (r4 == null) {
                A0k(EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING);
            } else {
                if (r4 instanceof AnonymousClass2bB) {
                    A0j(EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING);
                } else {
                    A0k(EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING);
                }
                if (r4 instanceof AnonymousClass2bC) {
                    A0h(16);
                }
            }
        }
    }

    public void A0v(C62673Hb r3) {
        synchronized (this.A1M) {
            this.A0U = r3;
        }
    }

    public void A0w(AnonymousClass3T1 r4) {
        ArrayList arrayList;
        int i;
        this.A1N = r4.A1N;
        this.A1O = r4.A1O;
        this.A0I = r4.A0I;
        this.A0G = r4.A0G;
        this.A0N = r4.A0J();
        this.A1T = r4.A1T;
        if (r4.A0e() != null) {
            arrayList = C36441kJ.A15(r4.A0e());
        } else {
            arrayList = null;
        }
        this.A0x = arrayList;
        this.A0H = r4.A0H;
        this.A11 = r4.A11;
        this.A1P = r4.A1P;
        A0i(r4.A08);
        C202319lY r2 = r4.A0M;
        if (r2 != null && (this.A0M == null || !((i = r2.A03) == 4 || i == 20))) {
            this.A0t = r4.A0t;
            this.A0M = r2;
        }
        if (AnonymousClass000.A1R(r4.A05)) {
            this.A05 = r4.A05;
            this.A0g = r4.A0g;
            this.A07 = r4.A07;
        }
    }

    public void A0x(AnonymousClass3T1 r4) {
        boolean z;
        String str;
        if (r4 != null) {
            if ((this instanceof AnonymousClass2bI) || (this instanceof AnonymousClass2bY) || (this instanceof AnonymousClass2bH) || (this instanceof AnonymousClass2bM)) {
                z = false;
            } else {
                z = true;
            }
            boolean z2 = false;
            if (!z) {
                str = "message type is not allowed to have a quoted message";
            } else if ((r4 instanceof AnonymousClass2bI) || (r4 instanceof AnonymousClass2bY) || (r4 instanceof AnonymousClass2bH) || (r4 instanceof AnonymousClass2bM)) {
                str = "message type can not be a quoted message";
            } else {
                if (r4.A0H() == 2) {
                    z2 = true;
                }
                C18740tg.A0D(z2, "quoted message should be marked StorageType.QUOTED");
                r4.A0x((AnonymousClass3T1) null);
            }
            C18740tg.A0D(false, str);
            return;
        }
        this.A0W = r4;
    }

    public void A0y(AnonymousClass9WK r3) {
        synchronized (this.A1M) {
            this.A0Z = r3;
        }
    }

    public void A0z(C63393Jw r3) {
        synchronized (this.A1M) {
            this.A1E = r3;
        }
    }

    public void A11(AnonymousClass37F r4) {
        synchronized (this.A1M) {
            this.A1F = r4;
            int i = 1;
            if (!C64933Qa.A04(this)) {
                this.A1a = true;
            } else {
                i = 3;
            }
            this.A01 = i;
        }
    }

    public void A12(AnonymousClass3L1 r2) {
        this.A0a = r2;
        if (r2 == null) {
            A0k(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
        } else {
            A0j(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
        }
    }

    public void A13(AnonymousClass3A4 r3) {
        synchronized (this.A1M) {
            this.A1G = r3;
        }
    }

    public void A14(AnonymousClass3JM r3) {
        synchronized (this.A1M) {
            this.A1H = r3;
        }
    }

    public void A15(Long l) {
        if (this instanceof AnonymousClass2bY) {
            C18740tg.A06(l);
            AnonymousClass00C.A0B(l);
            ((AnonymousClass2bY) this).A01 = l.longValue();
            return;
        }
        if (this instanceof AnonymousClass2bH) {
            C18740tg.A0D(false, "For FMessageEphemeralSettingChange the setting timestamp is the timestamp");
        }
        this.A0f = l;
    }

    public void A16(String str) {
        synchronized (this.A1M) {
            this.A0m = str;
            this.A17 = null;
        }
    }

    public void A17(String str) {
        C207219uk r1;
        if ((this instanceof AnonymousClass2bV) || (this instanceof AnonymousClass2bI)) {
            A16(str);
        } else if (this instanceof AnonymousClass2bS) {
            AnonymousClass2bS r0 = (AnonymousClass2bS) this;
            if (str == null) {
                str = "";
            }
            r0.A03 = str;
        } else if (this instanceof C46902br) {
            ((C46902br) this).A03 = str;
        } else if (this instanceof AnonymousClass2bZ) {
            AnonymousClass2bZ r2 = (AnonymousClass2bZ) this;
            if (AnonymousClass000.A1S(r2.A0A & 2097152, 2097152) && (r1 = r2.A00) != null && r1.A09 != null) {
                r1.A09 = str;
            }
        } else if (this instanceof AnonymousClass2bU) {
            AnonymousClass2bU r22 = (AnonymousClass2bU) this;
            boolean z = r22 instanceof C46872bo;
            C46872bo r23 = r22;
            if (z) {
                C46872bo r24 = (C46872bo) r22;
                boolean A1S2 = AnonymousClass000.A1S(r24.A0A & 2097152, 2097152);
                r23 = r24;
                if (A1S2) {
                    C207219uk r02 = r24.A00;
                    if (r02 != null) {
                        r02.A09 = str;
                        return;
                    }
                    return;
                }
            }
            r23.A02 = str;
        } else if (this instanceof AnonymousClass2bQ) {
            ((AnonymousClass2bQ) this).A04 = str;
        } else if (this instanceof AnonymousClass2c4) {
            AnonymousClass2c4 r03 = (AnonymousClass2c4) this;
            if (str != null) {
                r03.A00 = str;
            }
        } else if (this instanceof AnonymousClass2bW) {
            ((AnonymousClass2bW) this).A00 = str;
        } else if (this instanceof AnonymousClass2bX) {
            ((AnonymousClass2bX) this).A00 = str;
        } else if (this instanceof AnonymousClass2bP) {
            ((AnonymousClass2bP) this).A02 = str;
        } else if (this instanceof AnonymousClass2bT) {
            AnonymousClass2bT r04 = (AnonymousClass2bT) this;
            if (str != null) {
                r04.A05 = str;
            }
        }
    }

    public void A18(List list) {
        if (list == null || list.isEmpty()) {
            this.A0w = null;
            return;
        }
        this.A0w = C36441kJ.A15(list);
        this.A1R |= 1;
    }

    public void A19(List list) {
        String str;
        if (this instanceof AnonymousClass2bI) {
            if (((AnonymousClass2bI) this) instanceof AnonymousClass2cP) {
                str = "should not be called for FMessageSystemPayment";
            } else {
                str = "should not be called for FMessageSystem";
            }
            C18740tg.A0D(false, str);
            return;
        }
        this.A0N = null;
        this.A0x = list;
    }

    public void A1A(boolean z) {
        synchronized (this.A1M) {
            this.A1c = z;
        }
    }

    public void A1B(byte[] bArr) {
        synchronized (this.A1M) {
            this.A17 = bArr;
            this.A0m = null;
            this.A02 = 1;
        }
    }

    public boolean A1E() {
        boolean z;
        synchronized (this.A1M) {
            z = this.A1c;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        if (r3.A17 != null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A1F() {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A1M
            monitor-enter(r2)
            java.lang.String r0 = r3.A0m     // Catch:{ all -> 0x000f }
            if (r0 != 0) goto L_0x000c
            byte[] r1 = r3.A17     // Catch:{ all -> 0x000f }
            r0 = 0
            if (r1 == 0) goto L_0x000d
        L_0x000c:
            r0 = 1
        L_0x000d:
            monitor-exit(r2)     // Catch:{ all -> 0x000f }
            return r0
        L_0x000f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x000f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3T1.A1F():boolean");
    }

    public boolean A1G() {
        return AnonymousClass000.A1R(this.A05);
    }

    public boolean A1H() {
        List list = this.A0w;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean A1I() {
        byte[] bArr = this.A1b;
        if (bArr == null || bArr.length <= 0) {
            return false;
        }
        return true;
    }

    public boolean A1J() {
        if (this.A1O < -1 || AnonymousClass000.A1S(this.A0A & 1048576, 1048576)) {
            return true;
        }
        return false;
    }

    public boolean A1L() {
        if (this instanceof AnonymousClass2bS) {
            return !C64933Qa.A04(this);
        }
        if (this instanceof AnonymousClass2bK) {
            return !C64933Qa.A04(this);
        }
        boolean z = this instanceof AnonymousClass2bT;
        boolean A042 = C64933Qa.A04(this);
        if (z) {
            return !A042;
        }
        if (A042 || !this.A13) {
            return false;
        }
        return true;
    }

    public boolean A1N() {
        return AnonymousClass000.A1V(this.A0e);
    }

    public boolean A1O() {
        if ((this instanceof AnonymousClass2bY) || (this instanceof C46752bc) || (this instanceof C46762bd) || (this instanceof AnonymousClass2bD)) {
            return true;
        }
        return this.A1a;
    }

    public boolean A1P() {
        if ((this instanceof AnonymousClass2bI) || (this instanceof AnonymousClass2bG) || (this instanceof AnonymousClass2bK)) {
            return false;
        }
        return true;
    }

    public boolean A1R(int i) {
        long j = (long) i;
        return AnonymousClass000.A1Q(((this.A1R & j) > j ? 1 : ((this.A1R & j) == j ? 0 : -1)));
    }

    public boolean A1S(int i) {
        return AnonymousClass000.A1S(this.A08 & i, i);
    }

    public boolean A1T(int i) {
        return AnonymousClass000.A1S(this.A0A & i, i);
    }

    public boolean A1U(C88944Uq r3) {
        boolean z;
        synchronized (this.A1M) {
            if (this.A0J != null) {
                Log.e("FMessage/setMessageReactions re-assigning messageReactions");
                z = false;
            } else {
                this.A0J = r3;
                z = true;
            }
        }
        return z;
    }

    public byte[] A1V() {
        byte[] bArr;
        String str;
        synchronized (this.A1M) {
            bArr = this.A17;
            if (bArr == null && (str = this.A0m) != null) {
                try {
                    bArr = str.getBytes(C19430v1.A0B);
                } catch (UnsupportedEncodingException unused) {
                    bArr = null;
                }
                this.A17 = bArr;
            }
        }
        return bArr;
    }

    public AnonymousClass3T1(C64933Qa r4, int i, long j) {
        this.A1e = AnonymousClass001.A0J();
        this.A1Y = false;
        this.A1Z = false;
        this.A0c = new AnonymousClass3GP();
        this.A0H = -1;
        this.A1N = -1;
        this.A1O = -1;
        this.A0e = null;
        this.A1L = A0U(R.id.lazy_field_campaign_id);
        this.A1K = A0U(R.id.lazy_field_bot_suggested_prompt_metadata);
        this.A0o = null;
        this.A1X = false;
        this.A18 = 0;
        this.A00 = 0;
        this.A04 = 0;
        this.A0d = null;
        this.A07 = 0;
        this.A1M = C36441kJ.A11();
        this.A13 = false;
        this.A0h = null;
        this.A0z = false;
        C18740tg.A06(r4);
        this.A1J = r4;
        this.A0I = j;
        this.A1I = i;
        long uptimeMillis = SystemClock.uptimeMillis();
        this.A1d = uptimeMillis;
        this.A1S = uptimeMillis;
    }

    public static long A05(C19970wo r3, AnonymousClass3T1 r4) {
        return C19970wo.A00(r3) - r4.A0I;
    }

    public static void A08(AnonymousClass3T1 r2, AnonymousClass3T1 r3, boolean z) {
        AnonymousClass3T1 r1;
        if (!(r2.A0V() == null || r3.A0V() == null || !r2.A0V().A01() || r2.A0V().A02() == null)) {
            r3.A1D(r2.A0V().A02(), z);
        }
        AnonymousClass3T1 r22 = r2.A0W;
        if (r22 != null && (r1 = r3.A0W) != null) {
            A08(r22, r1, true);
        }
    }

    public static void A09(AnonymousClass3T1 r4, AnonymousClass005 r5) {
        ((AnonymousClass1F3) r5.get()).A0D((C23043B1o) r4, r4.A1N);
    }

    public static void A0A(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((AnonymousClass3T1) it.next()).A1J);
    }

    public int A0G() {
        return this.A0D;
    }

    public long A0I() {
        long j;
        if (A1H()) {
            j = 1;
        } else {
            j = 0;
        }
        if (this.A0W != null || this.A0F > 0) {
            j |= 2;
        }
        if (this.A0t != null) {
            j |= 4;
        }
        if (A1R(8)) {
            j |= 8;
        }
        if (A1R(16)) {
            j |= 16;
        }
        if (A1R(256)) {
            j |= 256;
        }
        if (this.A1B != null) {
            j |= 32;
        }
        if (this.A0U != null) {
            j |= 64;
        }
        if (this.A1E != null) {
            j |= 128;
        }
        AnonymousClass3JL r0 = (AnonymousClass3JL) this.A1K.A00;
        if (r0 == null || r0.A02 == null) {
            return j;
        }
        return j | 512;
    }

    public AnonymousClass11F A0J() {
        return this.A0N;
    }

    public DeviceJid A0K() {
        return this.A1T;
    }

    public AnonymousClass3L1 A0Y() {
        return this.A0a;
    }

    public void A10(AnonymousClass37E r5) {
        A0T().A00 = r5;
        this.A1R |= 8;
    }

    public boolean A1K() {
        return this.A1Y;
    }

    public boolean A1M() {
        return C64933Qa.A04(this);
    }

    public byte[] A1W() {
        byte[] A1V2;
        String A0b2;
        if (A0D() == 0 && (A0b2 = A0b()) != null && A0b2.length() > 0) {
            try {
                return Base64.decode(A0b(), 0);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        } else if (A0D() != 1 || (A1V2 = A1V()) == null || A1V2.length <= 0) {
            return null;
        } else {
            return A1V2;
        }
    }

    public final String toString() {
        StringBuilder A0u2 = AnonymousClass000.A0u();
        AnonymousClass000.A1C(this, A0u2);
        A0u2.append(" key=");
        A0u2.append(this.A1J);
        A0u2.append(" media_wa_type=");
        return C36381kD.A10(A0u2, this.A1I);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0092, code lost:
        if (r3 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0094, code lost:
        r2 = r4.A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0096, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0098, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009a, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a2, code lost:
        if (android.text.TextUtils.isEmpty(r2.A0K) != false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ac, code lost:
        if (r2.A0K.equals(r3.A0K) == false) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ae, code lost:
        r2.A0K = r3.A0K;
        r2.A02 = r3.A02;
        r2.A06 = r3.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00be, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        r4.A02 = r5.A02;
        r4.A09 = r5.A09;
        A18(r5.A0w);
        r4.A0Y = r5.A0Y;
        r4.A0N = r5.A0J();
        r4.A1T = r5.A1T;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
        if (r5.A0e() == null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        r0 = X.C36441kJ.A15(r5.A0e());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
        r4.A0x = r0;
        r4.A0s = r5.A0s;
        r4.A0r = r5.A0r;
        r4.A0n = r5.A0n;
        r4.A10 = r5.A10;
        r4.A0B = r5.A0B;
        r4.A0e = r5.A0e;
        r4.A0F = r5.A0F;
        r4.A0W = r5.A0W;
        r4.A0l = r5.A0l;
        r4.A0E = r5.A0E;
        r4.A0b = r5.A0b;
        r4.A0k = r5.A0k;
        r4.A0j = r5.A0j;
        r4.A0i = r5.A0i;
        r4.A01 = r5.A01;
        r4.A0A = r5.A0A;
        r4.A06 = r5.A06;
        r4.A0a = r5.A0a;
        r4.A0L = r5.A0L;
        r4.A0U = r5.A0U;
        A08(r5, r4, false);
        r3 = r5.A0M;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3T1(X.AnonymousClass3T1 r5, X.C64933Qa r6, int r7, long r8, boolean r10) {
        /*
            r4 = this;
            r4.<init>(r6, r7, r8)
            java.lang.Object r1 = r5.A1M
            monitor-enter(r1)
            if (r10 == 0) goto L_0x00c3
            java.lang.String r0 = r5.A0m     // Catch:{ all -> 0x00c0 }
            r4.A0m = r0     // Catch:{ all -> 0x00c0 }
            byte[] r0 = r5.A17     // Catch:{ all -> 0x00c0 }
            r4.A17 = r0     // Catch:{ all -> 0x00c0 }
            monitor-exit(r1)     // Catch:{ all -> 0x00c0 }
            int r0 = r5.A02
            r4.A02 = r0
            int r0 = r5.A09
            r4.A09 = r0
            java.util.List r0 = r5.A0w
            r4.A18(r0)
            X.3Qa r0 = r5.A0Y
            r4.A0Y = r0
            X.11F r0 = r5.A0J()
            r4.A0N = r0
            com.whatsapp.jid.DeviceJid r0 = r5.A1T
            r4.A1T = r0
            java.util.List r0 = r5.A0e()
            if (r0 == 0) goto L_0x009a
            java.util.List r0 = r5.A0e()
            java.util.ArrayList r0 = X.C36441kJ.A15(r0)
        L_0x003a:
            r4.A0x = r0
            java.lang.String r0 = r5.A0s
            r4.A0s = r0
            java.lang.String r0 = r5.A0r
            r4.A0r = r0
            java.lang.String r0 = r5.A0n
            r4.A0n = r0
            boolean r0 = r5.A10
            r4.A10 = r0
            int r0 = r5.A0B
            r4.A0B = r0
            java.lang.Integer r0 = r5.A0e
            r4.A0e = r0
            long r0 = r5.A0F
            r4.A0F = r0
            X.3T1 r0 = r5.A0W
            r4.A0W = r0
            java.lang.Long r0 = r5.A0l
            r4.A0l = r0
            int r0 = r5.A0E
            r4.A0E = r0
            X.3ur r0 = r5.A0b
            r4.A0b = r0
            java.lang.Long r0 = r5.A0k
            r4.A0k = r0
            java.lang.Long r0 = r5.A0j
            r4.A0j = r0
            java.lang.Long r0 = r5.A0i
            r4.A0i = r0
            int r0 = r5.A01
            r4.A01 = r0
            int r0 = r5.A0A
            r4.A0A = r0
            int r0 = r5.A06
            r4.A06 = r0
            X.3L1 r0 = r5.A0a
            r4.A0a = r0
            X.2oy r0 = r5.A0L
            r4.A0L = r0
            X.3Hb r0 = r5.A0U
            r4.A0U = r0
            r0 = 0
            A08(r5, r4, r0)
            X.9lY r3 = r5.A0M
            if (r3 == 0) goto L_0x00bf
            X.9lY r2 = r4.A0M
            if (r2 == 0) goto L_0x00bf
            monitor-enter(r3)
            goto L_0x009c
        L_0x009a:
            r0 = 0
            goto L_0x003a
        L_0x009c:
            java.lang.String r0 = r2.A0K     // Catch:{ all -> 0x00bb }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00bb }
            if (r0 != 0) goto L_0x00ae
            java.lang.String r1 = r2.A0K     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = r3.A0K     // Catch:{ all -> 0x00bb }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00bb }
            if (r0 == 0) goto L_0x00be
        L_0x00ae:
            java.lang.String r0 = r3.A0K     // Catch:{ all -> 0x00bb }
            r2.A0K = r0     // Catch:{ all -> 0x00bb }
            int r0 = r3.A02     // Catch:{ all -> 0x00bb }
            r2.A02 = r0     // Catch:{ all -> 0x00bb }
            long r0 = r3.A06     // Catch:{ all -> 0x00bb }
            r2.A06 = r0     // Catch:{ all -> 0x00bb }
            goto L_0x00be
        L_0x00bb:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00be:
            monitor-exit(r3)
        L_0x00bf:
            return
        L_0x00c0:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00c0 }
            throw r0
        L_0x00c3:
            java.lang.String r0 = r5.A0m     // Catch:{ all -> 0x00de }
            r4.A0m = r0     // Catch:{ all -> 0x00de }
            byte[] r0 = r5.A17     // Catch:{ all -> 0x00de }
            r4.A17 = r0     // Catch:{ all -> 0x00de }
            monitor-exit(r1)     // Catch:{ all -> 0x00de }
            int r0 = r5.A02
            r4.A02 = r0
            int r0 = r5.A09
            r4.A09 = r0
            java.util.List r0 = r5.A0w
            r4.A18(r0)
            X.3Qa r0 = r5.A0Y
            r4.A0Y = r0
            return
        L_0x00de:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00de }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3T1.<init>(X.3T1, X.3Qa, int, long, boolean):void");
    }

    public AnonymousClass3T1(AnonymousClass3T1 r8, C64933Qa r9, long j, boolean z) {
        this(r8, r9, r8.A1I, j, z);
    }
}
